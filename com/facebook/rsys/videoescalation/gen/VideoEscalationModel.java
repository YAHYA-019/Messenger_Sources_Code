package com.facebook.rsys.videoescalation.gen;

import X.2JQ;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.IQz;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: VideoEscalationModel.class */
public class VideoEscalationModel {
    public static 2JQ CONVERTER = new IQz(16);
    public static long sMcfTypeId;
    public final int alternatePromptState;
    public final boolean doesDecliningVideoEscalationKeepRemoteCameraOn;
    public final int messageToSend;
    public final int state;
    public final int status;

    public VideoEscalationModel(int i, int i2, int i3, boolean z, int i4) {
        this.state = i;
        this.messageToSend = i2;
        this.status = i3;
        this.doesDecliningVideoEscalationKeepRemoteCameraOn = z;
        this.alternatePromptState = i4;
    }

    public static native VideoEscalationModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof VideoEscalationModel)) {
                return false;
            }
            VideoEscalationModel videoEscalationModel = (VideoEscalationModel) obj;
            if (this.state == videoEscalationModel.state && this.messageToSend == videoEscalationModel.messageToSend && this.status == videoEscalationModel.status && this.doesDecliningVideoEscalationKeepRemoteCameraOn == videoEscalationModel.doesDecliningVideoEscalationKeepRemoteCameraOn && this.alternatePromptState == videoEscalationModel.alternatePromptState) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((((AbstractC2326GOr.A03(this.state) + this.messageToSend) * 31) + this.status) * 31) + (this.doesDecliningVideoEscalationKeepRemoteCameraOn ? 1 : 0)) * 31) + this.alternatePromptState;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("VideoEscalationModel{state=");
        A0k.append(this.state);
        A0k.append(",messageToSend=");
        A0k.append(this.messageToSend);
        A0k.append(",status=");
        A0k.append(this.status);
        A0k.append(",doesDecliningVideoEscalationKeepRemoteCameraOn=");
        A0k.append(this.doesDecliningVideoEscalationKeepRemoteCameraOn);
        A0k.append(",alternatePromptState=");
        return AbstractC2327GOs.A0W(A0k, this.alternatePromptState);
    }
}
