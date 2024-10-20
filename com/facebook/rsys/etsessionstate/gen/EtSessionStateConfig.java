package com.facebook.rsys.etsessionstate.gen;

import X.2JQ;
import X.7zN;
import X.AbstractC2326GOr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.GOq;
import X.IR0;
import com.facebook.acra.constants.ActionId;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: EtSessionStateConfig.class */
public class EtSessionStateConfig {
    public static 2JQ CONVERTER = IR0.A00(ActionId.CONTROLLER_INITIATED);
    public static long sMcfTypeId;
    public final ArrayList appIds;
    public final Integer clientSyncInitDelaySeconds;
    public final String sessionMetadataJsonString;
    public final boolean theaterModeEnabled;
    public final boolean useClientSync;

    public EtSessionStateConfig(boolean z, ArrayList arrayList, boolean z2, Integer num, String str) {
        arrayList.getClass();
        this.theaterModeEnabled = z;
        this.appIds = arrayList;
        this.useClientSync = z2;
        this.clientSyncInitDelaySeconds = num;
        this.sessionMetadataJsonString = str;
    }

    public static native EtSessionStateConfig createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof EtSessionStateConfig)) {
                return false;
            }
            EtSessionStateConfig etSessionStateConfig = (EtSessionStateConfig) obj;
            if (this.theaterModeEnabled != etSessionStateConfig.theaterModeEnabled || !this.appIds.equals(etSessionStateConfig.appIds) || this.useClientSync != etSessionStateConfig.useClientSync) {
                return false;
            }
            Integer num = this.clientSyncInitDelaySeconds;
            Integer num2 = etSessionStateConfig.clientSyncInitDelaySeconds;
            if (num == null) {
                if (num2 != null) {
                    return false;
                }
            } else if (!num.equals(num2)) {
                return false;
            }
            String str = this.sessionMetadataJsonString;
            String str2 = etSessionStateConfig.sessionMetadataJsonString;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((AnonymousClass002.A05(this.appIds, AbstractC2326GOr.A03(this.theaterModeEnabled ? 1 : 0)) + (this.useClientSync ? 1 : 0)) * 31) + AnonymousClass001.A02(this.clientSyncInitDelaySeconds)) * 31) + 7zN.A05(this.sessionMetadataJsonString);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("EtSessionStateConfig{theaterModeEnabled=");
        A0k.append(this.theaterModeEnabled);
        A0k.append(",appIds=");
        A0k.append(this.appIds);
        A0k.append(",useClientSync=");
        A0k.append(this.useClientSync);
        A0k.append(",clientSyncInitDelaySeconds=");
        A0k.append(this.clientSyncInitDelaySeconds);
        A0k.append(",sessionMetadataJsonString=");
        return GOq.A12(this.sessionMetadataJsonString, A0k);
    }
}
