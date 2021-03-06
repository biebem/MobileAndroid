package android.example.opdracht2;

import com.google.gson.annotations.SerializedName;

public class PoolCar {
    //region properties
    @SerializedName("vehicleInformation")
    VehicleInformation vehicleInformation;
    //endregion
    //region constructor
    public PoolCar(VehicleInformation vehicleInformation) {
        this.vehicleInformation = vehicleInformation;
    }
    //endregion constructor
    //region getter
    public VehicleInformation getVehicleInformation() {
        return vehicleInformation;
    }
    //endregion
}
