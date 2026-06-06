package com.alhanoof.asset.repository;

import com.alhanoof.asset.entity.Asset;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AssetRepository extends JpaRepository<Asset, Long> {

    Optional<Asset> findByAssetTag(String assetTag);

    List<Asset> findByCategoryIgnoreCase(String category);

    List<Asset> findByStatusIgnoreCase(String status);
}
