package com.facebook.rsys.devxcallagent.gen;

import X.2JQ;
import X.4YU;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.IR0;
import com.facebook.acra.constants.ActionId;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.audio.gen.AudioProxy;
import com.facebook.rsys.camera.gen.CameraProxy;
import com.facebook.rsys.screenshare.gen.ScreenShareProxy;
import java.util.ArrayList;

/* loaded from: DevXAgentCallConfig.class */
public class DevXAgentCallConfig {
    public static 2JQ CONVERTER = IR0.A00(ActionId.ABORTED);
    public static long sMcfTypeId;
    public final AudioProxy audioProxy;
    public final CameraProxy cameraProxy;
    public final ArrayList features;
    public final ScreenShareProxy screenShareProxy;

    public DevXAgentCallConfig(CameraProxy cameraProxy, AudioProxy audioProxy, ScreenShareProxy screenShareProxy, ArrayList arrayList) {
        this.cameraProxy = cameraProxy;
        this.audioProxy = audioProxy;
        this.screenShareProxy = screenShareProxy;
        this.features = arrayList;
    }

    public static native DevXAgentCallConfig createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof DevXAgentCallConfig)) {
                return false;
            }
            DevXAgentCallConfig devXAgentCallConfig = (DevXAgentCallConfig) obj;
            CameraProxy cameraProxy = this.cameraProxy;
            CameraProxy cameraProxy2 = devXAgentCallConfig.cameraProxy;
            if (cameraProxy == null) {
                if (cameraProxy2 != null) {
                    return false;
                }
            } else if (!cameraProxy.equals(cameraProxy2)) {
                return false;
            }
            AudioProxy audioProxy = this.audioProxy;
            AudioProxy audioProxy2 = devXAgentCallConfig.audioProxy;
            if (audioProxy == null) {
                if (audioProxy2 != null) {
                    return false;
                }
            } else if (!audioProxy.equals(audioProxy2)) {
                return false;
            }
            ScreenShareProxy screenShareProxy = this.screenShareProxy;
            ScreenShareProxy screenShareProxy2 = devXAgentCallConfig.screenShareProxy;
            if (screenShareProxy == null) {
                if (screenShareProxy2 != null) {
                    return false;
                }
            } else if (!screenShareProxy.equals(screenShareProxy2)) {
                return false;
            }
            ArrayList arrayList = this.features;
            ArrayList arrayList2 = devXAgentCallConfig.features;
            if (arrayList == null) {
                if (arrayList2 != null) {
                    return false;
                }
            } else if (!arrayList.equals(arrayList2)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((AbstractC2326GOr.A03(AnonymousClass001.A02(this.cameraProxy)) + AnonymousClass001.A02(this.audioProxy)) * 31) + AnonymousClass001.A02(this.screenShareProxy)) * 31) + 4YU.A03(this.features);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("DevXAgentCallConfig{cameraProxy=");
        A0k.append(this.cameraProxy);
        A0k.append(",audioProxy=");
        A0k.append(this.audioProxy);
        A0k.append(",screenShareProxy=");
        A0k.append(this.screenShareProxy);
        A0k.append(",features=");
        return AbstractC2327GOs.A0U(this.features, A0k);
    }
}
