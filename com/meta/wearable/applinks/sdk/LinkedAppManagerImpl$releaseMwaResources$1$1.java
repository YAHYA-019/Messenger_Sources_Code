package com.meta.wearable.applinks.sdk;

import X.0FI;
import X.0fH;
import X.7zO;
import X.AnonymousClass001;
import X.KYx;
import com.facebook.wearable.applinks.AppLinkLinkInfoResponse;
import com.facebook.wearable.applinks.IAppLinkLinkInfoResponseCallback;

/* loaded from: LinkedAppManagerImpl$releaseMwaResources$1$1.class */
public final class LinkedAppManagerImpl$releaseMwaResources$1$1 extends IAppLinkLinkInfoResponseCallback.Stub {
    public LinkedAppManagerImpl$releaseMwaResources$1$1() {
        0FI.A09(990942088, 0FI.A03(-673430154));
    }

    @Override // com.facebook.wearable.applinks.IAppLinkLinkInfoResponseCallback
    public void BwG(int i, String str) {
        int A03 = 0FI.A03(-32277436);
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("releaseMwaResources: onError ");
        A0k.append(i);
        A0k.append(". ");
        A0k.append(str);
        0fH.A0r("lam:LinkedAppManager", AnonymousClass001.A0g(A0k, '.'), (Throwable) null);
        0FI.A09(1219328942, A03);
    }

    @Override // com.facebook.wearable.applinks.IAppLinkLinkInfoResponseCallback
    public void CHZ(AppLinkLinkInfoResponse appLinkLinkInfoResponse) {
        int A03 = 0FI.A03(1890270537);
        KYx.A00("lam:LinkedAppManager", AnonymousClass001.A0Z(appLinkLinkInfoResponse, "releaseMwaResources: onResult ", 7zO.A0x(appLinkLinkInfoResponse, 0)));
        0FI.A09(-879797007, A03);
    }
}
