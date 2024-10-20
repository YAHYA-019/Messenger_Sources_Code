package com.facebook.rsys.moderator.gen;

import X.2JQ;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.LVi;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: ModeratorShimAudioModel.class */
public class ModeratorShimAudioModel {
    public static 2JQ CONVERTER = LVi.A00(36);
    public static long sMcfTypeId;
    public final String actionUuid;
    public final boolean audioOn;

    public ModeratorShimAudioModel(String str, boolean z) {
        str.getClass();
        this.actionUuid = str;
        this.audioOn = z;
    }

    public static native ModeratorShimAudioModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof ModeratorShimAudioModel)) {
                return false;
            }
            ModeratorShimAudioModel moderatorShimAudioModel = (ModeratorShimAudioModel) obj;
            if (this.actionUuid.equals(moderatorShimAudioModel.actionUuid) && this.audioOn == moderatorShimAudioModel.audioOn) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return AbstractC2326GOr.A07(this.actionUuid) + (this.audioOn ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ModeratorShimAudioModel{actionUuid=");
        A0k.append(this.actionUuid);
        A0k.append(",audioOn=");
        return AbstractC2327GOs.A0X(A0k, this.audioOn);
    }
}
