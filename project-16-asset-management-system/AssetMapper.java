package com.alhanoof.asset.mapper;

import com.alhanoof.asset.dto.AssetRequest;
import com.alhanoof.asset.dto.AssetResponse;
import com.alhanoof.asset.entity.Asset;

import java.time.LocalDate;

public class AssetMapper {

    private AssetMapper() {
    }

    public static Asset toEntity(AssetRequest request) {
        return new Asset(
                request.getAssetName(),
                request.getAssetTag().toUpperCase(),
                request.getCategory().toUpperCase(),
                request.getAssignedTo(),
                request.getLocation(),
                request.getAssetValue(),
                request.getStatus().toUpperCase(),
                LocalDate.now()
        );
    }

    public static AssetResponse toResponse(Asset asset) {
        return new AssetResponse(
                asset.getId(),
                asset.getAssetName(),
                asset.getAssetTag(),
                asset.getCategory(),
                asset.getAssignedTo(),
                asset.getLocation(),
                asset.getAssetValue(),
                asset.getStatus(),
                asset.getPurchaseDate()
        );
    }

    public static void updateEntity(Asset asset, AssetRequest request) {
        asset.setAssetName(request.getAssetName());
        asset.setAssetTag(request.getAssetTag().toUpperCase());
        asset.setCategory(request.getCategory().toUpperCase());
        asset.setAssignedTo(request.getAssignedTo());
        asset.setLocation(request.getLocation());
        asset.setAssetValue(request.getAssetValue());
        asset.setStatus(request.getStatus().toUpperCase());
    }
}
