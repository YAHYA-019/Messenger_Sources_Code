package com.facebook.messaging.encryptedbackups.restoreflow.fragment;

import X.0Q8;
import X.1Bn;
import X.7zL;
import X.7zO;
import X.7zV;
import X.9Qi;
import X.AQo;
import X.C01g;
import X.C01i;
import X.C03i;
import X.C9oG;
import X.DR6;
import X.GF6;
import android.os.Bundle;
import com.facebook.messaging.encryptedbackups.nux.fragment.EncryptedBackupsBaseFragment;

/* loaded from: EncryptedBackupsOtcFirstGreetingFragment.class */
public final class EncryptedBackupsOtcFirstGreetingFragment extends EncryptedBackupsBaseFragment implements GF6 {
    public 9Qi A00;
    public final C01i A01 = C01g.A00(C03i.A02, AQo.A01(this, 5));

    public static final void A0C(EncryptedBackupsOtcFirstGreetingFragment encryptedBackupsOtcFirstGreetingFragment) {
        9Qi r0 = encryptedBackupsOtcFirstGreetingFragment.A00;
        if (r0 == null) {
            7zL.A1B();
            throw 0Q8.createAndThrow();
        }
        7zO.A0Z(r0.A01).A07("RESTORE_SKIP_CONFIRMATION_ALERT_SHOW");
        encryptedBackupsOtcFirstGreetingFragment.A1h();
        DR6 A0P = 7zV.A0P(encryptedBackupsOtcFirstGreetingFragment);
        C9oG.A02(A0P, encryptedBackupsOtcFirstGreetingFragment, 38, 2131956450);
        C9oG.A03(A0P, encryptedBackupsOtcFirstGreetingFragment, 39, 2131964499);
    }

    @Override // com.facebook.messaging.encryptedbackups.nux.fragment.EncryptedBackupsBaseFragment, com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        9Qi r0 = (9Qi) 1Bn.A0A(68890);
        this.A00 = r0;
        if (r0 == null) {
            7zL.A1B();
            throw 0Q8.createAndThrow();
        }
        7zO.A0Z(r0.A01).A07("OTC_RESTORE_INTRO_SCREEN");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (A1l() == false) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1g() {
        /*
            r301 = this;
            r0 = r301
            X.06Z r0 = r0.mFragmentManager
            r302 = r0
            r0 = r302
            int r0 = r0.A0U()
            r303 = r0
            r0 = r303
            if (r0 > 0) goto L19
            r0 = r301
            boolean r0 = r0.A1l()
            r303 = r0
            r0 = 0
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L1b
        L19:
            r0 = 1
            r304 = r0
        L1b:
            r0 = r301
            com.facebook.litho.LithoView r0 = r0.A1c()
            r305 = r0
            r0 = r301
            com.facebook.mig.scheme.interfaces.MigColorScheme r0 = r0.A1f()
            r306 = r0
            r0 = r301
            X.01i r0 = r0.A01
            java.lang.Object r0 = r0.getValue()
            X.RFR r0 = (X.RFR) r0
            r307 = r0
            r0 = r301
            X.9Qi r0 = r0.A00
            r302 = r0
            java.lang.String r0 = "viewData"
            r308 = r0
            r0 = r302
            if (r0 == 0) goto Lb4
            r0 = r302
            X.1Br r0 = r0.A02
            java.lang.Object r0 = X.1Br.A0B(r0)
            X.3O6 r0 = (X.C3O6) r0
            r302 = r0
            X.1wj r0 = X.C1wj.A03
            r309 = r0
            r0 = r302
            r1 = r309
            java.lang.Integer r0 = r0.A00(r1)
            r310 = r0
            r0 = r310
            boolean r0 = X.9dB.A01(r0)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto Lac
            r0 = r310
            boolean r0 = X.9dB.A00(r0)
            r311 = r0
        L6b:
            r0 = r301
            X.9Qi r0 = r0.A00
            r302 = r0
            r0 = r302
            if (r0 == 0) goto Lb4
            r0 = r302
            X.1Br r0 = r0.A02
            java.lang.Object r0 = X.1Br.A0B(r0)
            X.3O6 r0 = (X.C3O6) r0
            r1 = r309
            java.lang.Integer r0 = r0.A00(r1)
            r310 = r0
            java.lang.Integer r0 = X.0S2.A01
            r302 = r0
            r0 = r310
            r1 = r302
            boolean r0 = X.AnonymousClass001.A1W(r0, r1)
            r312 = r0
            X.8am r0 = new X.8am
            r308 = r0
            r0 = r308
            r1 = r307
            r2 = r306
            r3 = r304
            r4 = r311
            r5 = r312
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = r305
            r1 = r308
            r0.A0y(r1)
            return
        Lac:
            r0 = r304
            r1 = 1
            r0 = r0 ^ r1
            r311 = r0
            goto L6b
        Lb4:
            r0 = r308
            X.11T.A0L(r0)
            X.0Q8 r0 = X.0Q8.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.restoreflow.fragment.EncryptedBackupsOtcFirstGreetingFragment.A1g():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0037, code lost:
    
        if (A1l() == false) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.GF6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean Bkd() {
        /*
            r301 = this;
            r0 = r301
            X.9Qi r0 = r0.A00
            r302 = r0
            java.lang.String r0 = "viewData"
            r303 = r0
            r0 = r302
            if (r0 == 0) goto L87
            r0 = r302
            X.1Br r0 = r0.A01
            X.9up r0 = X.7zO.A0Z(r0)
            r304 = r0
            r0 = r304
            java.lang.String r1 = "OTC_RESTORE_INTRO_SCREEN_BACK_BUTTON_CLICK"
            r0.A07(r1)
            r0 = r301
            X.06Z r0 = r0.mFragmentManager
            r302 = r0
            r0 = r302
            int r0 = r0.A0U()
            r305 = r0
            r0 = r305
            if (r0 > 0) goto L3a
            r0 = r301
            boolean r0 = r0.A1l()
            r306 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r302 = r0
            r0 = r306
            if (r0 != 0) goto L3d
        L3a:
            r0 = 1
            r305 = r0
        L3d:
            r0 = 0
            r306 = r0
            r0 = 0
            r304 = r0
            r0 = r305
            if (r0 != 0) goto L6c
            r0 = r301
            X.9Qi r0 = r0.A00
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L87
            r0 = r302
            X.1Br r0 = r0.A02
            java.lang.Integer r0 = X.7zS.A0x(r0)
            r302 = r0
            r0 = r302
            boolean r0 = X.9dB.A01(r0)
            r1 = 1
            r0 = r0 ^ r1
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L6f
            r0 = r301
            A0C(r0)
            r0 = 1
            r306 = r0
        L6c:
            r0 = r306
            return r0
        L6f:
            r0 = r301
            X.9Qi r0 = r0.A00
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L87
            r0 = r302
            X.1Br r0 = r0.A00
            java.lang.Object r0 = X.1Br.A0B(r0)
            X.48X r0 = (X.48X) r0
            r0.A00()
            r0 = 0
            return r0
        L87:
            r0 = r303
            X.11T.A0L(r0)
            X.0Q8 r0 = X.0Q8.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.restoreflow.fragment.EncryptedBackupsOtcFirstGreetingFragment.Bkd():boolean");
    }
}
