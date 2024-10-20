package com.facebook.rsys.moderator.gen;

import X.1BL;
import X.2JQ;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: ModeratorClientModel.class */
public class ModeratorClientModel {
    public static 2JQ CONVERTER = N6e.A00(45);
    public static long sMcfTypeId;
    public final boolean isInitialized;
    public final boolean isModerator;
    public final boolean screenShareEnabled;
    public final String screenShareEnabledActorId;

    public ModeratorClientModel(boolean z, String str, boolean z2, boolean z3) {
        this.screenShareEnabled = z;
        this.screenShareEnabledActorId = str;
        this.isModerator = z2;
        this.isInitialized = z3;
    }

    public static native ModeratorClientModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ModeratorClientModel)) {
                return false;
            }
            ModeratorClientModel moderatorClientModel = (ModeratorClientModel) obj;
            if (this.screenShareEnabled != moderatorClientModel.screenShareEnabled) {
                return false;
            }
            String str = this.screenShareEnabledActorId;
            String str2 = moderatorClientModel.screenShareEnabledActorId;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (this.isModerator != moderatorClientModel.isModerator || this.isInitialized != moderatorClientModel.isInitialized) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((AbstractC2326GOr.A03(this.screenShareEnabled ? 1 : 0) + 1BL.A05(this.screenShareEnabledActorId)) * 31) + (this.isModerator ? 1 : 0)) * 31) + (this.isInitialized ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ModeratorClientModel{screenShareEnabled=");
        A0k.append(this.screenShareEnabled);
        A0k.append(",screenShareEnabledActorId=");
        A0k.append(this.screenShareEnabledActorId);
        A0k.append(",isModerator=");
        A0k.append(this.isModerator);
        A0k.append(",isInitialized=");
        return AbstractC2327GOs.A0X(A0k, this.isInitialized);
    }
}
