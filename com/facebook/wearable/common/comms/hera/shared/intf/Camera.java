package com.facebook.wearable.common.comms.hera.shared.intf;

import X.11T;
import X.1BL;
import X.7zN;
import X.C04v;

/* loaded from: Camera.class */
public final class Camera extends C04v {
    public final String cameraId;
    public final String deviceId;

    public Camera(String str, String str2) {
        this.deviceId = str;
        this.cameraId = str2;
    }

    public static /* synthetic */ Camera copy$default(Camera camera, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = camera.deviceId;
        }
        if ((i & 2) != 0) {
            str2 = camera.cameraId;
        }
        return new Camera(str, str2);
    }

    public final String component1() {
        return this.deviceId;
    }

    public final String component2() {
        return this.cameraId;
    }

    public final Camera copy(String str, String str2) {
        return new Camera(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Camera)) {
                return false;
            }
            Camera camera = (Camera) obj;
            if (!11T.A0O(this.deviceId, camera.deviceId) || !11T.A0O(this.cameraId, camera.cameraId)) {
                return false;
            }
        }
        return true;
    }

    public final String getCameraId() {
        return this.cameraId;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public int hashCode() {
        return (1BL.A05(this.deviceId) * 31) + 7zN.A05(this.cameraId);
    }

    public String toString() {
        return super.toString();
    }
}
