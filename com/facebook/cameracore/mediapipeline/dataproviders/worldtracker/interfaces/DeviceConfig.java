package com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces;

import X.1BK;
import X.1BL;
import X.4YW;
import X.AnonymousClass001;
import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: DeviceConfig.class */
public class DeviceConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public static final Boolean DEFAULT_IS_CALIBRATED_DEVICE;
    public static final Boolean DEFAULT_IS_SLAM_CAPABLE;
    public static final Boolean DEFAULT_SKIP_ATTITUDE_INPUT;
    public static final Boolean DEFAULT_USE_VISION_ONLY_SLAM;
    public final double attitudeTimeDelay;
    public final double imuFromLandscapeCameraX;
    public final double imuFromLandscapeCameraY;
    public final double imuFromLandscapeCameraZ;
    public final boolean isCalibratedDeviceConfig;
    public final boolean isSlamCapable;
    public CameraConfig mCameraConfig;
    public final boolean skipAttitudeInput;
    public final String slamConfigurationParams;
    public final boolean useVisionOnlySlam;

    static {
        Boolean A0d = 1BK.A0d();
        DEFAULT_SKIP_ATTITUDE_INPUT = A0d;
        DEFAULT_USE_VISION_ONLY_SLAM = A0d;
        DEFAULT_IS_SLAM_CAPABLE = A0d;
        DEFAULT_IS_CALIBRATED_DEVICE = A0d;
        CREATOR = new DKf(82);
    }

    public DeviceConfig(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, Boolean bool, double d9, Boolean bool2, Boolean bool3, String str, Boolean bool4) {
        this.mCameraConfig = new CameraConfig(d, d2, d3, d4, d5);
        this.imuFromLandscapeCameraX = d6;
        this.imuFromLandscapeCameraY = d7;
        this.imuFromLandscapeCameraZ = 0.0d;
        this.skipAttitudeInput = false;
        this.attitudeTimeDelay = d9;
        this.useVisionOnlySlam = bool2.booleanValue();
        this.isSlamCapable = bool3.booleanValue();
        this.slamConfigurationParams = str;
        this.isCalibratedDeviceConfig = bool4.booleanValue();
    }

    public DeviceConfig(Parcel parcel) {
        this.imuFromLandscapeCameraX = parcel.readDouble();
        this.imuFromLandscapeCameraY = parcel.readDouble();
        this.imuFromLandscapeCameraZ = parcel.readDouble();
        boolean z = true;
        this.skipAttitudeInput = AnonymousClass001.A1N(parcel.readByte());
        this.attitudeTimeDelay = parcel.readDouble();
        this.useVisionOnlySlam = 4YW.A0K(parcel);
        this.isSlamCapable = 4YW.A0K(parcel);
        this.slamConfigurationParams = parcel.readString();
        this.mCameraConfig = (CameraConfig) 1BL.A0C(parcel, CameraConfig.class);
        this.isCalibratedDeviceConfig = parcel.readByte() == 0 ? false : z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public CameraConfig getCameraConfig() {
        return this.mCameraConfig;
    }

    public double getCameraDistortion1() {
        return this.mCameraConfig.A00;
    }

    public double getCameraDistortion2() {
        return this.mCameraConfig.A01;
    }

    public double getCameraFocalLength() {
        return this.mCameraConfig.A02;
    }

    public double getCameraPrincipalPointX() {
        return this.mCameraConfig.A03;
    }

    public double getCameraPrincipalPointY() {
        return this.mCameraConfig.A04;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.imuFromLandscapeCameraX);
        parcel.writeDouble(this.imuFromLandscapeCameraY);
        parcel.writeDouble(this.imuFromLandscapeCameraZ);
        parcel.writeByte(this.skipAttitudeInput ? (byte) 1 : (byte) 0);
        parcel.writeDouble(this.attitudeTimeDelay);
        parcel.writeByte(this.useVisionOnlySlam ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isSlamCapable ? (byte) 1 : (byte) 0);
        parcel.writeString(this.slamConfigurationParams);
        parcel.writeParcelable(this.mCameraConfig, i);
        parcel.writeByte(this.isCalibratedDeviceConfig ? (byte) 1 : (byte) 0);
    }
}
