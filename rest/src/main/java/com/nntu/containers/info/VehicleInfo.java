package com.nntu.containers.info;

import com.nntu.models.Vehicle;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class VehicleInfo {
    private Long id;
    private ModelInfo modelInfo;
    private Boolean isBusy;
    private UserInfo landlord;

    public VehicleInfo(Vehicle vehicle) {
        this.id = vehicle.getId();
        this.modelInfo = new ModelInfo(vehicle.getModel());
        this.isBusy = vehicle.getIsBusy();
        this.landlord = new UserInfo(vehicle.getLandlord());
    }

    public VehicleInfo(Long id, ModelInfo modelInfo, Boolean isBusy, UserInfo landlord) {
        this.id = id;
        this.modelInfo = modelInfo;
        this.isBusy = isBusy;
        this.landlord = landlord;
    }
}
