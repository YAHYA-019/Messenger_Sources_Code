package com.facebook.rsys.cowatch.gen;

import X.1BL;
import X.2JQ;
import X.7zM;
import X.AbstractC2326GOr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.GOq;
import X.LVi;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: CowatchExternalMediaConfig.class */
public class CowatchExternalMediaConfig {
    public static 2JQ CONVERTER = LVi.A00(10);
    public static long sMcfTypeId;
    public final String appSwitchOauthUrl;
    public final String deeplinkUrl;
    public final long hostAppId;

    public CowatchExternalMediaConfig(long j, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.hostAppId = j;
        this.appSwitchOauthUrl = str;
        this.deeplinkUrl = str2;
    }

    public static native CowatchExternalMediaConfig createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof CowatchExternalMediaConfig)) {
                return false;
            }
            CowatchExternalMediaConfig cowatchExternalMediaConfig = (CowatchExternalMediaConfig) obj;
            if (this.hostAppId == cowatchExternalMediaConfig.hostAppId && this.appSwitchOauthUrl.equals(cowatchExternalMediaConfig.appSwitchOauthUrl) && this.deeplinkUrl.equals(cowatchExternalMediaConfig.deeplinkUrl)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return 7zM.A05(this.deeplinkUrl, AnonymousClass002.A07(this.appSwitchOauthUrl, AbstractC2326GOr.A03(1BL.A01(this.hostAppId))));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CowatchExternalMediaConfig{hostAppId=");
        A0k.append(this.hostAppId);
        A0k.append(",appSwitchOauthUrl=");
        A0k.append(this.appSwitchOauthUrl);
        A0k.append(",deeplinkUrl=");
        return GOq.A12(this.deeplinkUrl, A0k);
    }
}
