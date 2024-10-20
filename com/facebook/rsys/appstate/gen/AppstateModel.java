package com.facebook.rsys.appstate.gen;

import X.2JQ;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: AppstateModel.class */
public class AppstateModel {
    public static 2JQ CONVERTER = IR0.A00(1);
    public static long sMcfTypeId;
    public final boolean isBackgrounded;
    public final boolean isPictureInPicture;
    public final boolean isScreenOff;

    public AppstateModel(boolean z, boolean z2, boolean z3) {
        this.isBackgrounded = z;
        this.isPictureInPicture = z2;
        this.isScreenOff = z3;
    }

    public static native AppstateModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof AppstateModel)) {
                return false;
            }
            AppstateModel appstateModel = (AppstateModel) obj;
            if (this.isBackgrounded == appstateModel.isBackgrounded && this.isPictureInPicture == appstateModel.isPictureInPicture && this.isScreenOff == appstateModel.isScreenOff) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((AbstractC2326GOr.A03(this.isBackgrounded ? 1 : 0) + (this.isPictureInPicture ? 1 : 0)) * 31) + (this.isScreenOff ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("AppstateModel{isBackgrounded=");
        A0k.append(this.isBackgrounded);
        A0k.append(",isPictureInPicture=");
        A0k.append(this.isPictureInPicture);
        A0k.append(",isScreenOff=");
        return AbstractC2327GOs.A0X(A0k, this.isScreenOff);
    }
}
