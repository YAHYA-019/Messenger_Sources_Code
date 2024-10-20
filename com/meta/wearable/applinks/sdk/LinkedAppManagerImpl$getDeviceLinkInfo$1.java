package com.meta.wearable.applinks.sdk;

import X.0CU;
import X.0FI;
import X.0QD;
import X.0fH;
import X.11T;
import X.7zN;
import X.AnonymousClass001;
import X.JQy;
import X.JQz;
import X.KPh;
import X.KtJ;
import X.Ktr;
import X.LDe;
import X.QqT;
import com.facebook.wearable.applinks.AppLinkLinkAddress;
import com.facebook.wearable.applinks.AppLinkLinkInfoResponse;
import com.facebook.wearable.applinks.IAppLinkLinkInfoResponseCallback;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.functions.Function1;

/* loaded from: LinkedAppManagerImpl$getDeviceLinkInfo$1.class */
public final class LinkedAppManagerImpl$getDeviceLinkInfo$1 extends IAppLinkLinkInfoResponseCallback.Stub {
    public final /* synthetic */ KtJ A00;
    public final /* synthetic */ LDe A01;
    public final /* synthetic */ UUID A02;
    public final /* synthetic */ Function1 A03;

    public LinkedAppManagerImpl$getDeviceLinkInfo$1(KtJ ktJ, LDe lDe, UUID uuid, Function1 function1) {
        this.A02 = uuid;
        this.A00 = ktJ;
        this.A03 = function1;
        this.A01 = lDe;
        0FI.A09(-1511678195, 0FI.A03(-172762194));
    }

    @Override // com.facebook.wearable.applinks.IAppLinkLinkInfoResponseCallback
    public void BwG(int i, String str) {
        int A03 = 0FI.A03(-2024950736);
        11T.A0F(str, 1);
        Object A0r = 7zN.A0r(QqT.A00, i);
        if (A0r == null) {
            A0r = QqT.A08;
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("getDeviceLinkInfo: onError ");
        A0k.append(A0r);
        A0k.append(". ");
        A0k.append(str);
        0fH.A0r("lam:LinkedAppManager", AnonymousClass001.A0g(A0k, '.'), (Throwable) null);
        Function1 function1 = this.A01.A04;
        if (function1 != null) {
            function1.invoke(A0r);
        }
        0FI.A09(1711649758, A03);
    }

    @Override // com.facebook.wearable.applinks.IAppLinkLinkInfoResponseCallback
    public void CHZ(AppLinkLinkInfoResponse appLinkLinkInfoResponse) {
        String str;
        int A0E = JQy.A0E(appLinkLinkInfoResponse, -2013516866);
        List list = appLinkLinkInfoResponse.addressList;
        11T.A09(list);
        AppLinkLinkAddress appLinkLinkAddress = (AppLinkLinkAddress) 0QD.A0E(list);
        byte[] bArr = appLinkLinkInfoResponse.macAddress;
        String A0t = bArr != null ? JQz.A0t(bArr) : null;
        UUID uuid = this.A02;
        KtJ ktJ = this.A00;
        String str2 = (appLinkLinkAddress == null || appLinkLinkAddress.addressType != KPh.A01.getNumber()) ? null : appLinkLinkAddress.address;
        byte[] bArr2 = appLinkLinkInfoResponse.firmwareVersion;
        String A0t2 = bArr2 != null ? JQz.A0t(bArr2) : null;
        str = "";
        if (A0t2 == null) {
            A0t2 = str;
        }
        byte[] bArr3 = appLinkLinkInfoResponse.deviceSerial;
        String A0t3 = bArr3 != null ? JQz.A0t(bArr3) : str;
        String str3 = (appLinkLinkAddress == null || appLinkLinkAddress.addressType != KPh.A03.getNumber()) ? null : appLinkLinkAddress.address;
        byte[] bArr4 = appLinkLinkInfoResponse.deviceImageAssetURI;
        String A0t4 = bArr4 != null ? JQz.A0t(bArr4) : str;
        byte[] bArr5 = appLinkLinkInfoResponse.deviceModelName;
        String A0t5 = bArr5 != null ? JQz.A0t(bArr5) : str;
        byte[] bArr6 = appLinkLinkInfoResponse.buildFlavor;
        String A0t6 = bArr6 != null ? JQz.A0t(bArr6) : str;
        byte[] bArr7 = appLinkLinkInfoResponse.deviceName;
        String A0t7 = bArr7 != null ? JQz.A0t(bArr7) : str;
        byte[] bArr8 = appLinkLinkInfoResponse.hardwareType;
        str = bArr8 != null ? JQz.A0t(bArr8) : "";
        if (A0t == null || 0CU.A0O(A0t)) {
            A0t = null;
        }
        this.A03.invoke(new Ktr(ktJ, str2, A0t2, A0t3, str3, A0t4, A0t5, A0t6, A0t7, str, A0t, uuid));
        0FI.A09(-1733132825, A0E);
    }
}
