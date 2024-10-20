package com.facebook.wearable.applinks;

import android.os.Parcelable;
import org.microg.safeparcel.AutoSafeParcelable;

/* loaded from: AppLinkDeviceStateResponse.class */
public class AppLinkDeviceStateResponse extends AutoSafeParcelable {
    public static final Parcelable.Creator CREATOR = AutoSafeParcelable.A01(AppLinkDeviceStateResponse.class);
    public AppLinkDeviceConnectionStatus deviceConnectionStatus;
    public AppLinkDeviceHardwareState deviceHardwareState;
    public AppLinkDeviceMountState deviceMountState;
    public AppLinkDevicePeakPowerState devicePeakPowerState;
    public byte[] serviceUUID;

    public AppLinkDeviceStateResponse() {
    }

    public AppLinkDeviceStateResponse(byte[] bArr, AppLinkDeviceConnectionStatus appLinkDeviceConnectionStatus) {
        this.serviceUUID = bArr;
        this.deviceConnectionStatus = appLinkDeviceConnectionStatus;
    }

    public AppLinkDeviceStateResponse(byte[] bArr, AppLinkDeviceConnectionStatus appLinkDeviceConnectionStatus, AppLinkDeviceHardwareState appLinkDeviceHardwareState) {
        this.serviceUUID = bArr;
        this.deviceConnectionStatus = appLinkDeviceConnectionStatus;
        this.deviceHardwareState = appLinkDeviceHardwareState;
    }

    public AppLinkDeviceStateResponse(byte[] bArr, AppLinkDeviceConnectionStatus appLinkDeviceConnectionStatus, AppLinkDeviceHardwareState appLinkDeviceHardwareState, AppLinkDevicePeakPowerState appLinkDevicePeakPowerState) {
        this.serviceUUID = bArr;
        this.deviceConnectionStatus = appLinkDeviceConnectionStatus;
        this.deviceHardwareState = appLinkDeviceHardwareState;
        this.devicePeakPowerState = appLinkDevicePeakPowerState;
    }

    public AppLinkDeviceStateResponse(byte[] bArr, AppLinkDeviceConnectionStatus appLinkDeviceConnectionStatus, AppLinkDeviceHardwareState appLinkDeviceHardwareState, AppLinkDevicePeakPowerState appLinkDevicePeakPowerState, AppLinkDeviceMountState appLinkDeviceMountState) {
        this.serviceUUID = bArr;
        this.deviceConnectionStatus = appLinkDeviceConnectionStatus;
        this.deviceHardwareState = appLinkDeviceHardwareState;
        this.devicePeakPowerState = appLinkDevicePeakPowerState;
        this.deviceMountState = appLinkDeviceMountState;
    }
}
