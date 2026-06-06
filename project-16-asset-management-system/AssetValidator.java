package com.alhanoof.asset.validation;

import com.alhanoof.asset.dto.AssetRequest;
import com.alhanoof.asset.exception.ValidationException;
import com.alhanoof.asset.util.Constants;

public class AssetValidator {

    private AssetValidator() {
    }

    public static void validateCategory(AssetRequest request) {
        String category = request.getCategory().toUpperCase();

        if (!category.equals(Constants.LAPTOP)
                && !category.equals(Constants.VEHICLE)
                && !category.equals(Constants.EQUIPMENT)
                && !category.equals(Constants.SOFTWARE)) {
            throw new ValidationException("Category must be LAPTOP, VEHICLE, EQUIPMENT, or SOFTWARE");
        }
    }

    public static void validateStatus(AssetRequest request) {
        String status = request.getStatus().toUpperCase();

        if (!status.equals(Constants.ACTIVE)
                && !status.equals(Constants.UNDER_MAINTENANCE)
                && !status.equals(Constants.RETIRED)
                && !status.equals(Constants.LOST)) {
            throw new ValidationException("Status must be ACTIVE, UNDER_MAINTENANCE, RETIRED, or LOST");
        }
    }
}
