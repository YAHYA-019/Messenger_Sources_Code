package com.facebook.messaging.cuckoo.apimanager;

import X.11T;
import X.1BY;
import X.1Br;
import X.1Bu;
import X.1De;
import X.1Lm;
import X.4YV;
import X.7zP;
import X.9Fe;
import X.C8ye;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.mci.PrivacyContextCoding;
import com.facebook.msys.mci.TransportAgnosticLogging;

/* loaded from: CuckooApiManager.class */
public final class CuckooApiManager {
    public final 1Br A00;
    public final 1Br A01;
    public final 1De A02;
    public final 1Br A03;

    public CuckooApiManager(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A02 = r303;
        1BY r0 = r303.A00;
        this.A03 = 1Lm.A03(fbUserSession, r0, 68716);
        this.A01 = 1Lm.A03(fbUserSession, r0, 33176);
        this.A00 = 1Bu.A03(r0, 83430);
    }

    public static final C8ye A00(CuckooApiManager cuckooApiManager) {
        return (C8ye) 1Br.A0B(cuckooApiManager.A03);
    }

    public static final void A01(String str, Integer num, String str2) {
        Long l = null;
        PrivacyContext newPrivacyContextNative = PrivacyContextCoding.newPrivacyContextNative(null, "Interop", "611712727817110");
        11T.A0A(newPrivacyContextNative);
        if (num != null) {
            l = 7zP.A0g(num);
        }
        Long A0j = 4YV.A0j();
        TransportAgnosticLogging.logTalEventToPipe(newPrivacyContextNative, 0, false, 3, new Object[]{22, A0j, (byte) 0, l, 3, A0j, (byte) 0, str2, 3, A0j, (byte) 1, str}, 9Fe.A00);
    }
}
