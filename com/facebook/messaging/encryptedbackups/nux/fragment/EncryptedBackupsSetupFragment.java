package com.facebook.messaging.encryptedbackups.nux.fragment;

import X.0FI;
import X.0Q8;
import X.0S2;
import X.11T;
import X.1BK;
import X.1Bi;
import X.1Bn;
import X.48X;
import X.7zN;
import X.7zP;
import X.7zQ;
import X.7zU;
import X.9Br;
import X.9C8;
import X.9SM;
import X.9Zc;
import X.AQn;
import X.C00i;
import X.C01i;
import X.C1wk;
import X.C96m;
import X.C97j;
import X.C9hO;
import X.C9uq;
import X.GF6;
import android.os.Bundle;
import com.facebook.messaging.encryptedbackups.basefragment.BaseFragment;

/* loaded from: EncryptedBackupsSetupFragment.class */
public final class EncryptedBackupsSetupFragment extends EncryptedBackupsBaseFragment implements GF6 {
    public 9Br A00;
    public C1wk A01;
    public C96m A02;
    public 48X A03;
    public C9hO A04;
    public 9SM A05;
    public 9Zc A06;
    public final C01i A07 = AQn.A00(this, 14);

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A0C(EncryptedBackupsSetupFragment encryptedBackupsSetupFragment) {
        encryptedBackupsSetupFragment.A1d().A08("SETUP_CANCEL_CONFIRMATION_DIALOG_IMPRESSION");
        encryptedBackupsSetupFragment.A1j(7zN.A0s(encryptedBackupsSetupFragment, 2131952092), 7zN.A0s(encryptedBackupsSetupFragment, 2131952090), 7zN.A0s(encryptedBackupsSetupFragment, 2131952089), 7zN.A0s(encryptedBackupsSetupFragment, 2131952091), AQn.A01(encryptedBackupsSetupFragment, 15), AQn.A01(encryptedBackupsSetupFragment, 16));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        if (r0 == X.C95e.A03) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean A0D() {
        /*
            r301 = this;
            r0 = r301
            X.96m r0 = r0.A02
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L12
            java.lang.String r0 = "touchPoint"
            X.11T.A0L(r0)
            X.0Q8 r0 = X.0Q8.createAndThrow()
            throw r0
        L12:
            r0 = r302
            X.95e r0 = r0.type
            r303 = r0
            X.95e r0 = X.C95e.A02
            r302 = r0
            r0 = r303
            r1 = r302
            if (r0 == r1) goto L2e
            X.95e r0 = X.C95e.A03
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r302 = r0
            r0 = r303
            r1 = r304
            if (r0 != r1) goto L31
        L2e:
            r0 = 1
            r305 = r0
        L31:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.nux.fragment.EncryptedBackupsSetupFragment.A0D():boolean");
    }

    public void A1B(Bundle bundle) {
        super.A1B(bundle);
        C96m c96m = this.A02;
        String str = "touchPoint";
        if (c96m != null) {
            if (c96m == C96m.A08) {
                9Zc r0 = this.A06;
                if (r0 != null) {
                    r0.A00();
                    return;
                }
                str = "leakageHardNuxViewData";
            } else {
                if (c96m != C96m.A06) {
                    return;
                }
                9SM r02 = this.A05;
                if (r02 != null) {
                    C00i c00i = r02.A02.A00;
                    1BK.A0G(c00i).A0K();
                    if (7zP.A0a(r02.A01).A04()) {
                        7zQ.A0M(r02.A00).A0E(0S2.A0j);
                    }
                    7zU.A0P(r02.A03).A0A("HARD_NUX_FIRST_SEEN_TIMESTAMP", String.valueOf(1BK.A0G(c00i).A0D()));
                    return;
                }
                str = "hsmHardNuxViewData";
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.encryptedbackups.nux.fragment.EncryptedBackupsBaseFragment, com.facebook.messaging.encryptedbackups.basefragment.BaseFragment
    public void A1S(Bundle bundle) {
        String str;
        super.A1S(bundle);
        this.A00 = (9Br) 1Bn.A0A(68920);
        this.A04 = (C9hO) 1Bi.A03(68813);
        this.A03 = 7zQ.A0f();
        9C8 r0 = (9C8) 1Bn.A0A(68891);
        11T.A0F(r0, 0);
        ((EncryptedBackupsBaseFragment) this).A04 = r0;
        this.A01 = 7zU.A0Q();
        this.A06 = new 9Zc(BaseFragment.A06(this, 68825), requireContext());
        this.A05 = new 9SM(BaseFragment.A06(this, 68834), requireContext());
        C9hO c9hO = this.A04;
        if (c9hO == null) {
            str = "touchPointProvider";
        } else {
            this.A02 = c9hO.A01();
            C9uq A1d = A1d();
            C1wk c1wk = this.A01;
            if (c1wk == null) {
                str = "nuxFlagManager";
            } else {
                Integer valueOf = Integer.valueOf(c1wk.A09());
                C96m c96m = this.A02;
                if (c96m != null) {
                    A1d.A05(c96m, valueOf);
                    A1d().A09("EncryptedBackupsSetupFragment");
                    A1d().A08("SETUP_INTRO_SCREEN_IMPRESSION");
                    return;
                }
                str = "touchPoint";
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    @Override // X.GF6
    public boolean Bkd() {
        boolean A0A = A1e().A0A();
        boolean A0D = A0D();
        if (A0A) {
            if (!A0D) {
                A1d().A06("SETUP_INTRO_SCREEN_BACK_BUTTON_CLICK");
                7zU.A1N(C97j.A06, this);
                return true;
            }
        } else if (!A0D) {
            A0C(this);
            return true;
        }
        A1d().A08("SETUP_INTRO_SCREEN_BACK_BUTTON_CLICK");
        A1d().A03();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        int A02 = 0FI.A02(-830529489);
        if (A0D()) {
            48X r0 = this.A03;
            if (r0 == null) {
                11T.A0L("coolDownFlagHelper");
                throw 0Q8.createAndThrow();
            }
            r0.A00();
        }
        super/*androidx.fragment.app.Fragment*/.onDestroy();
        0FI.A08(791123023, A02);
    }
}
