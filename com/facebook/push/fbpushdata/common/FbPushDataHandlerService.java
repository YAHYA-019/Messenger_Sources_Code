package com.facebook.push.fbpushdata.common;

import X.0FI;
import X.1BK;
import X.1Bi;
import X.1Fv;
import X.C00j;
import X.C1cx;
import X.C4Dx;
import X.C5dw;
import android.content.Intent;
import com.facebook.auth.usersession.FbUserSession;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;

/* loaded from: FbPushDataHandlerService.class */
public final class FbPushDataHandlerService extends C5dw {
    public C4Dx A00;

    /* JADX WARN: Multi-variable type inference failed */
    public FbPushDataHandlerService() {
        super("PushDataHandlerService");
        setIntentRedelivery(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C5dw
    public void A02() {
        C00j.A07("%s.onCreate", "FbPushDataHandlerService", 1262197820);
        try {
            C1cx.A00(this);
            C4Dx c4Dx = (C4Dx) 1Bi.A03(65900);
            C00j.A01(1398594403);
            this.A00 = c4Dx;
        } catch (Throwable th) {
            C00j.A01(624850327);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C5dw
    public void A03(Intent intent) {
        int A04 = 0FI.A04(-1767474156);
        try {
            FbUserSession A042 = ((1Fv) 1Bi.A03(66351)).A04();
            C4Dx c4Dx = this.A00;
            if (c4Dx == null) {
                IllegalStateException A0h = 1BK.A0h();
                0FI.A0A(1912095603, A04);
                throw A0h;
            }
            c4Dx.A03(this, intent, A042);
            if (intent != null) {
                FirebaseInstanceIdReceiver.A02(intent);
            }
            0FI.A0A(1261904444, A04);
        } catch (Throwable th) {
            if (intent != null) {
                FirebaseInstanceIdReceiver.A02(intent);
            }
            0FI.A0A(1227182672, A04);
            throw th;
        }
    }
}
