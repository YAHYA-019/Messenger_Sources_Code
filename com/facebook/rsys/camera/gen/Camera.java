package com.facebook.rsys.camera.gen;

import X.0Pz;
import X.2JQ;
import X.7zM;
import X.AbstractC2326GOr;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: Camera.class */
public class Camera {
    public static long sMcfTypeId;
    public final String identifier;
    public final String name;
    public static final Camera FRONT_FACING_CAMERA = new Camera("generic_front_facing", "Front facing camera");
    public static final Camera BACK_FACING_CAMERA = new Camera("generic_back_facing", "Back facing camera");
    public static final Camera DUAL_CAMERA = new Camera("generic_dual_camera", "Dual camera");
    public static 2JQ CONVERTER = IR0.A00(45);

    public Camera(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.identifier = str;
        this.name = str2;
    }

    public static native Camera createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof Camera)) {
                return false;
            }
            Camera camera = (Camera) obj;
            if (this.identifier.equals(camera.identifier) && this.name.equals(camera.name)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return 7zM.A05(this.name, AbstractC2326GOr.A07(this.identifier));
    }

    public String toString() {
        return 0Pz.A0z("Camera{identifier=", this.identifier, ",name=", this.name, "}");
    }
}
