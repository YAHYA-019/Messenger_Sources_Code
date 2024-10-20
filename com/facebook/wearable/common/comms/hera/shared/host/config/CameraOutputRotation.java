package com.facebook.wearable.common.comms.hera.shared.host.config;

import X.C04v;

/* loaded from: CameraOutputRotation.class */
public final class CameraOutputRotation extends C04v {
    public final int rotationDegrees;

    public CameraOutputRotation(int i) {
        this.rotationDegrees = i;
    }

    public static /* synthetic */ CameraOutputRotation copy$default(CameraOutputRotation cameraOutputRotation, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = cameraOutputRotation.rotationDegrees;
        }
        return new CameraOutputRotation(i);
    }

    public final int component1() {
        return this.rotationDegrees;
    }

    public final CameraOutputRotation copy(int i) {
        return new CameraOutputRotation(i);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof CameraOutputRotation) && this.rotationDegrees == ((CameraOutputRotation) obj).rotationDegrees);
    }

    public final int getRotationDegrees() {
        return this.rotationDegrees;
    }

    public int hashCode() {
        return this.rotationDegrees;
    }

    public String toString() {
        return super.toString();
    }
}
