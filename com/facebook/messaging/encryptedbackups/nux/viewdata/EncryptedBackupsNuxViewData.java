package com.facebook.messaging.encryptedbackups.nux.viewdata;

import X.0DE;
import X.0DR;
import X.0S2;
import X.0fH;
import X.1BK;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1Lm;
import X.2aK;
import X.2bX;
import X.7zL;
import X.7zM;
import X.7zO;
import X.7zP;
import X.7zQ;
import X.7zS;
import X.7zU;
import X.AJY;
import X.AnonymousClass001;
import X.C00i;
import X.C00m;
import X.C1ud;
import X.C3lt;
import X.C96p;
import X.C96q;
import X.C9rb;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: EncryptedBackupsNuxViewData.class */
public final class EncryptedBackupsNuxViewData {
    public C3lt A00;
    public String A01;
    public final MutableLiveData A02;
    public final 2bX A03;
    public final 2bX A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A09;
    public final 1Br A0A;
    public final MutableLiveData A0C;
    public final MutableLiveData A0D;
    public final MutableLiveData A0E;
    public final MutableLiveData A0F;
    public final 1Br A0G;
    public final 1Br A0H;
    public final 1Br A0B = 7zM.A0V();
    public final 1Br A08 = 7zM.A0Z();

    public EncryptedBackupsNuxViewData(FbUserSession fbUserSession, Context context) {
        this.A0H = 1Lm.A00(context, fbUserSession, 68884);
        this.A06 = 1Lm.A00(context, fbUserSession, 16874);
        this.A05 = 1Lm.A00(context, fbUserSession, 68902);
        1Br A0b = 7zM.A0b();
        this.A09 = A0b;
        this.A00 = 7zO.A0Z(A0b);
        this.A0A = 1Bq.A00(68790);
        this.A0G = 1Bu.A01(context, 100011);
        this.A07 = 7zM.A0W();
        this.A0D = 7zL.A0H();
        Boolean A0d = 1BK.A0d();
        this.A03 = new LiveData(A0d);
        this.A04 = new LiveData(A0d);
        this.A0C = 7zL.A0H();
        this.A02 = 7zL.A0H();
        this.A0E = 7zL.A0H();
        this.A0F = 7zL.A0H();
        this.A01 = "";
    }

    public static final void A00(EncryptedBackupsNuxViewData encryptedBackupsNuxViewData, boolean z) {
        2bX r0 = encryptedBackupsNuxViewData.A04;
        if (7zU.A1a(r0)) {
            return;
        }
        C00i c00i = encryptedBackupsNuxViewData.A08.A00;
        7zM.A0J(c00i).A01(r0, AnonymousClass001.A0K());
        if (z) {
            boolean A1Q = AnonymousClass001.A1Q(encryptedBackupsNuxViewData.A01.length(), 40);
            7zM.A0J(c00i).A01(encryptedBackupsNuxViewData.A03, 7zM.A17(A1Q));
            if (!A1Q) {
                0fH.A0j("EncryptedBackupsNuxViewData", "addDevice: wrong recovery code length");
                7zM.A0J(c00i).A01(r0, false);
                return;
            }
        }
        encryptedBackupsNuxViewData.A00.ATN("RESTORE_WITH_RC_API_START");
        C9rb.A00(7zQ.A0M(encryptedBackupsNuxViewData.A06).A09(C96p.A0D, encryptedBackupsNuxViewData.A01, 7zS.A11(encryptedBackupsNuxViewData.A0B)), encryptedBackupsNuxViewData, 10);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A01(X.0DR r302, X.C00m r303, long r304) {
        /*
            r301 = this;
            r0 = 47
            r306 = r0
            r0 = r306
            r1 = r302
            boolean r0 = X.AIe.A03(r0, r1)
            r307 = r0
            r0 = r307
            if (r0 == 0) goto La6
            r0 = r302
            r308 = r0
            r0 = r302
            X.AIe r0 = (X.AIe) r0
            r308 = r0
            r0 = r308
            int r0 = r0.A00
            r309 = r0
            r0 = -1
            r1 = -1
            int r0 = r0 << r1
            r310 = r0
            r0 = r309
            r1 = r310
            r0 = r0 & r1
            r307 = r0
            r0 = r307
            if (r0 == 0) goto La6
            r0 = r309
            r1 = r310
            int r0 = r0 - r1
            r309 = r0
            r0 = r308
            r1 = r309
            r0.A00 = r1
        L40:
            r0 = r308
            java.lang.Object r0 = r0.A02
            r311 = r0
            X.0Ds r0 = X.0Ds.A02
            r312 = r0
            r0 = r308
            int r0 = r0.A00
            r310 = r0
            r0 = 1
            r307 = r0
            r0 = r310
            if (r0 == 0) goto L82
            r0 = r310
            r1 = r307
            if (r0 != r1) goto Lb2
            r0 = r308
            java.lang.Object r0 = r0.A01
            X.00m r0 = (X.C00m) r0
            r303 = r0
            r0 = r311
            X.0Dt.A00(r0)
        L70:
            java.lang.String r0 = "EncryptedBackupsNuxViewData"
            java.lang.String r1 = "interstitial screen dismissed with time out"
            X.0fH.A0j(r0, r1)
            r0 = r303
            java.lang.Object r0 = r0.invoke()
            X.04S r0 = X.04S.A00
            return r0
        L82:
            r0 = r311
            X.0Dt.A00(r0)
            r0 = r308
            r1 = r303
            r0.A01 = r1
            r0 = r308
            r1 = r307
            r0.A00 = r1
            r0 = r308
            r1 = r304
            java.lang.Object r0 = X.C44k.A01(r0, r1)
            r313 = r0
            r0 = r313
            r1 = r312
            if (r0 != r1) goto L70
            r0 = r312
            return r0
        La6:
            r0 = r301
            r1 = r302
            r2 = r306
            X.AIe r0 = X.AIe.A01(r0, r1, r2)
            r308 = r0
            goto L40
        Lb2:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0M()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.nux.viewdata.EncryptedBackupsNuxViewData.A01(X.0DR, X.00m, long):java.lang.Object");
    }

    public final void A02() {
        7zP.A0O(this.A08).A01(this.A03, 1BK.A0d());
    }

    public final void A03() {
        if (7zP.A0a(this.A07).A04()) {
            7zQ.A0M(this.A06).A0E(0S2.A0Y);
        }
    }

    public final void A04(LifecycleOwner lifecycleOwner, C00m c00m) {
        C1ud A0a = 7zP.A0a(this.A07);
        long A06 = 7zM.A06(A0a, C1ud.A00(A0a), 36597901666357028L) * 1000;
        0fH.A0j("EncryptedBackupsNuxViewData", "time out timer started");
        2aK.A03((Integer) null, (0DE) null, new AJY(this, c00m, (0DR) null, 1, A06), 7zO.A16(lifecycleOwner), 3);
    }

    public final void A05(boolean z) {
        7zS.A1I(this.A05, z ? C96q.A0A : C96q.A0I);
    }
}
