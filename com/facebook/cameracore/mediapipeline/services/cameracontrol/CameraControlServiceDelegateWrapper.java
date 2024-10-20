package com.facebook.cameracore.mediapipeline.services.cameracontrol;

import X.H97;
import X.H9G;

/* loaded from: CameraControlServiceDelegateWrapper.class */
public class CameraControlServiceDelegateWrapper {
    public final CameraControlServiceDelegate mDelegate;

    public CameraControlServiceDelegateWrapper(CameraControlServiceDelegate cameraControlServiceDelegate) {
        this.mDelegate = cameraControlServiceDelegate;
    }

    public boolean canUpdateCaptureDevicePosition(int i) {
        return this.mDelegate.canUpdateCaptureDevicePosition((i < 0 || i >= H97.values().length) ? H97.Back : H97.values()[i]);
    }

    public long getExposureTime() {
        return this.mDelegate.getExposureTime();
    }

    public int getIso() {
        return this.mDelegate.getIso();
    }

    public long getMaxExposureTime() {
        return this.mDelegate.getMaxExposureTime();
    }

    public int getMaxIso() {
        return this.mDelegate.getMaxIso();
    }

    public long getMinExposureTime() {
        return this.mDelegate.getMinExposureTime();
    }

    public int getMinIso() {
        return this.mDelegate.getMinIso();
    }

    public boolean isFocusModeSupported(int i) {
        return this.mDelegate.isFocusModeSupported((i < 0 || i >= H9G.values().length) ? H9G.A01 : H9G.values()[i]);
    }

    public boolean isLockExposureAndFocusSupported() {
        return this.mDelegate.isLockExposureAndFocusSupported();
    }

    public void lockExposureAndFocus(long j, int i) {
        this.mDelegate.lockExposureAndFocus(j, i);
    }

    public void unlockExposureAndFocus() {
        this.mDelegate.unlockExposureAndFocus();
    }

    public void updateCaptureDevicePosition(int i) {
        this.mDelegate.updateCaptureDevicePosition((i < 0 || i >= H97.values().length) ? H97.Back : H97.values()[i]);
    }

    public void updateFocusMode(int i) {
        this.mDelegate.updateFocusMode((i < 0 || i >= H9G.values().length) ? H9G.A01 : H9G.values()[i]);
    }
}
