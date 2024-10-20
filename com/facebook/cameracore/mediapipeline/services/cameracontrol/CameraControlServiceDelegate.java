package com.facebook.cameracore.mediapipeline.services.cameracontrol;

import X.H97;
import X.H9G;

/* loaded from: CameraControlServiceDelegate.class */
public interface CameraControlServiceDelegate {
    boolean canUpdateCaptureDevicePosition(H97 h97);

    long getExposureTime();

    int getIso();

    long getMaxExposureTime();

    int getMaxIso();

    long getMinExposureTime();

    int getMinIso();

    boolean isFocusModeSupported(H9G h9g);

    boolean isLockExposureAndFocusSupported();

    void lockExposureAndFocus(long j, int i);

    void unlockExposureAndFocus();

    void updateCaptureDevicePosition(H97 h97);

    void updateFocusMode(H9G h9g);
}
