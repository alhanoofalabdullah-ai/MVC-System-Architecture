package com.alhanoof.asset.service;

import com.alhanoof.asset.dto.AssetRequest;
import com.alhanoof.asset.dto.AssetResponse;
import org.springframework.data.domain.Page;

import java.util.List;

public interface AssetService {

    AssetResponse createAsset(AssetRequest request);

    List<AssetResponse> getAllAssets();

    AssetResponse getAssetById(Long id);

    AssetResponse updateAsset(Long id, AssetRequest request);

    String deleteAsset(Long id);

    List<AssetResponse> searchByCategory(String category);

    List<AssetResponse> searchByStatus(String status);

    Page<AssetResponse> getAssetsWithPagination(int page, int size, String sortBy);
}
