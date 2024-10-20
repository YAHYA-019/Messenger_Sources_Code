package com.facebook.rsys.camera.gen;

import X.1BK;
import X.2JQ;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.media.gen.StreamInfo;
import java.util.ArrayList;

/* loaded from: CameraModel.class */
public class CameraModel {
    public static 2JQ CONVERTER = IR0.A00(47);
    public static long sMcfTypeId;
    public final int activeCameraIdx;
    public final boolean cameraEverOn;
    public final boolean cameraOn;
    public final boolean cameraPaused;
    public final int cameraState;
    public final ArrayList cameras;
    public final StreamInfo streamInfo;
    public final int targetCaptureResolutionHeight;
    public final int targetCaptureResolutionWidth;
    public final int targetFps;
    public final boolean userHasDeclinedVideoPrompt;

    public CameraModel(boolean z, int i, boolean z2, int i2, ArrayList arrayList, boolean z3, boolean z4, int i3, int i4, int i5, StreamInfo streamInfo) {
        arrayList.getClass();
        streamInfo.getClass();
        this.cameraOn = z;
        this.cameraState = i;
        this.cameraPaused = z2;
        this.activeCameraIdx = i2;
        this.cameras = arrayList;
        this.cameraEverOn = z3;
        this.userHasDeclinedVideoPrompt = z4;
        this.targetFps = i3;
        this.targetCaptureResolutionWidth = i4;
        this.targetCaptureResolutionHeight = i5;
        this.streamInfo = streamInfo;
    }

    public static native CameraModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof CameraModel)) {
                return false;
            }
            CameraModel cameraModel = (CameraModel) obj;
            if (this.cameraOn == cameraModel.cameraOn && this.cameraState == cameraModel.cameraState && this.cameraPaused == cameraModel.cameraPaused && this.activeCameraIdx == cameraModel.activeCameraIdx && this.cameras.equals(cameraModel.cameras) && this.cameraEverOn == cameraModel.cameraEverOn && this.userHasDeclinedVideoPrompt == cameraModel.userHasDeclinedVideoPrompt && this.targetFps == cameraModel.targetFps && this.targetCaptureResolutionWidth == cameraModel.targetCaptureResolutionWidth && this.targetCaptureResolutionHeight == cameraModel.targetCaptureResolutionHeight && this.streamInfo.equals(cameraModel.streamInfo)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return 1BK.A03(this.streamInfo, (((((((((AnonymousClass002.A05(this.cameras, (((((AbstractC2326GOr.A03(this.cameraOn ? 1 : 0) + this.cameraState) * 31) + (this.cameraPaused ? 1 : 0)) * 31) + this.activeCameraIdx) * 31) + (this.cameraEverOn ? 1 : 0)) * 31) + (this.userHasDeclinedVideoPrompt ? 1 : 0)) * 31) + this.targetFps) * 31) + this.targetCaptureResolutionWidth) * 31) + this.targetCaptureResolutionHeight) * 31);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CameraModel{cameraOn=");
        A0k.append(this.cameraOn);
        A0k.append(",cameraState=");
        A0k.append(this.cameraState);
        A0k.append(",cameraPaused=");
        A0k.append(this.cameraPaused);
        A0k.append(",activeCameraIdx=");
        A0k.append(this.activeCameraIdx);
        A0k.append(",cameras=");
        A0k.append(this.cameras);
        A0k.append(",cameraEverOn=");
        A0k.append(this.cameraEverOn);
        A0k.append(",userHasDeclinedVideoPrompt=");
        A0k.append(this.userHasDeclinedVideoPrompt);
        A0k.append(",targetFps=");
        A0k.append(this.targetFps);
        A0k.append(",targetCaptureResolutionWidth=");
        A0k.append(this.targetCaptureResolutionWidth);
        A0k.append(",targetCaptureResolutionHeight=");
        A0k.append(this.targetCaptureResolutionHeight);
        A0k.append(",streamInfo=");
        return AbstractC2327GOs.A0U(this.streamInfo, A0k);
    }
}
