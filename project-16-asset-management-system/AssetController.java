package com.alhanoof.asset.controller;

import com.alhanoof.asset.dto.AssetRequest;
import com.alhanoof.asset.dto.AssetResponse;
import com.alhanoof.asset.service.AssetService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/assets")
public class AssetController {

    private final AssetService service;

    public AssetController(AssetService service) {
        this.service = service;
    }

    @PostMapping
    public AssetResponse createAsset(@Valid @RequestBody AssetRequest request) {
        return service.createAsset(request);
    }

    @GetMapping
    public List<AssetResponse> getAllAssets() {
        return service.getAllAssets();
    }

    @GetMapping("/{id}")
    public AssetResponse getAssetById(@PathVariable Long id) {
        return service.getAssetById(id);
    }

    @PutMapping("/{id}")
    public AssetResponse updateAsset(@PathVariable Long id, @Valid @RequestBody AssetRequest request) {
        return service.updateAsset(id, request);
    }

    @DeleteMapping("/{id}")
    public String deleteAsset(@PathVariable Long id) {
        return service.deleteAsset(id);
    }

    @GetMapping("/search/category")
    public List<AssetResponse> searchByCategory(@RequestParam String category) {
        return service.searchByCategory(category);
    }

    @GetMapping("/search/status")
    public List<AssetResponse> searchByStatus(@RequestParam String status) {
        return service.searchByStatus(status);
    }

    @GetMapping("/paged")
    public Page<AssetResponse> getAssetsWithPagination(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id") String sortBy
    ) {
        return service.getAssetsWithPagination(page, size, sortBy);
    }
}
