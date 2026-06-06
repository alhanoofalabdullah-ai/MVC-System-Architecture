package com.alhanoof.asset.service;

import com.alhanoof.asset.dto.AssetRequest;
import com.alhanoof.asset.dto.AssetResponse;
import com.alhanoof.asset.entity.Asset;
import com.alhanoof.asset.exception.ResourceNotFoundException;
import com.alhanoof.asset.exception.ValidationException;
import com.alhanoof.asset.mapper.AssetMapper;
import com.alhanoof.asset.repository.AssetRepository;
import com.alhanoof.asset.validation.AssetValidator;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssetServiceImpl implements AssetService {

    private final AssetRepository repository;

    public AssetServiceImpl(AssetRepository repository) {
        this.repository = repository;
    }

    public AssetResponse createAsset(AssetRequest request) {
        AssetValidator.validateCategory(request);
        AssetValidator.validateStatus(request);

        repository.findByAssetTag(request.getAssetTag().toUpperCase()).ifPresent(asset -> {
            throw new ValidationException("Asset tag already exists");
        });

        Asset asset = AssetMapper.toEntity(request);
        return AssetMapper.toResponse(repository.save(asset));
    }

    public List<AssetResponse> getAllAssets() {
        return repository.findAll().stream().map(AssetMapper::toResponse).toList();
    }

    public AssetResponse getAssetById(Long id) {
        Asset asset = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Asset not found with id: " + id));

        return AssetMapper.toResponse(asset);
    }

    public AssetResponse updateAsset(Long id, AssetRequest request) {
        AssetValidator.validateCategory(request);
        AssetValidator.validateStatus(request);

        Asset asset = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Asset not found with id: " + id));

        repository.findByAssetTag(request.getAssetTag().toUpperCase()).ifPresent(existingAsset -> {
            if (!existingAsset.getId().equals(id)) {
                throw new ValidationException("Asset tag already exists");
            }
        });

        AssetMapper.updateEntity(asset, request);
        return AssetMapper.toResponse(repository.save(asset));
    }

    public String deleteAsset(Long id) {
        Asset asset = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Asset not found with id: " + id));

        repository.delete(asset);
        return "Asset deleted successfully";
    }

    public List<AssetResponse> searchByCategory(String category) {
        return repository.findByCategoryIgnoreCase(category)
                .stream().map(AssetMapper::toResponse).toList();
    }

    public List<AssetResponse> searchByStatus(String status) {
        return repository.findByStatusIgnoreCase(status)
                .stream().map(AssetMapper::toResponse).toList();
    }

    public Page<AssetResponse> getAssetsWithPagination(int page, int size, String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy).ascending());
        return repository.findAll(pageable).map(AssetMapper::toResponse);
    }
}
