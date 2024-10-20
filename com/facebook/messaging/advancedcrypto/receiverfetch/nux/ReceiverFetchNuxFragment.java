package com.facebook.messaging.advancedcrypto.receiverfetch.nux;

import X.0Dc;
import X.1Bn;
import X.1Iw;
import X.1LI;
import X.2qQ;
import X.7zL;
import X.7zM;
import X.7zN;
import X.7zP;
import X.7zS;
import X.7zT;
import X.8Lf;
import X.8Ll;
import X.8NJ;
import X.8Tn;
import X.C1u3;
import X.C8xf;
import X.C9py;
import X.CFx;
import X.DGJ;
import X.EC2;
import android.content.Context;
import com.facebook.messaging.advancedcrypto.receiverfetch.nux.ReceiverFetchNuxFragment;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: ReceiverFetchNuxFragment.class */
public final class ReceiverFetchNuxFragment extends MigBottomSheetDialogFragment {
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public DGJ A1E(1Iw r302) {
        return new DGJ() { // from class: X.9z4
            public 1LI AJE(1Iw r3022, MigColorScheme migColorScheme) {
                1BK.A1M(r3022, migColorScheme);
                C1rq A01 = C1rg.A01(r3022, null, 0);
                A01.A2i(C1rp.FLEX_END);
                4YU.A1O(A01, 2RH.A04, C26z.END);
                8Tl A06 = 8Tl.A06(r3022, migColorScheme);
                7zR.A1A(A06, new DKU(ReceiverFetchNuxFragment.this, 39));
                return 7zL.A0c(A06, A01);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        8Tn A07 = 8Tn.A07(r302, this);
        MigColorScheme A1F = A1F();
        String A0s = 7zN.A0s(this, 2131964216);
        2qQ A0o = 7zL.A0o();
        7zM.A1V(A0o, 2132411120);
        C8xf A00 = C8xf.A00(7zT.A02(A0o, A1F, 2132346668));
        8Ll r0 = new 8Ll(C1u3.A58, (CharSequence) null, getString(2131964214), (String) null, 10);
        C1u3 c1u3 = C1u3.A3r;
        String A0D = r302.A0D(2131964212);
        1Bn.A0A(67680);
        C9py A03 = C9py.A03(this, 8);
        Context A0A = 7zL.A0A(r302);
        EC2 A002 = CFx.A00(A0A, A03, A1F, A0D, "Link");
        0Dc A0P = 7zP.A0P(A0A);
        A0P.A02(r302.A0D(2131964213));
        return 8Tn.A0A(A07, new 8NJ((8Lf) null, A00, (CharSequence) null, (CharSequence) null, A0s, 7zN.A0v(r0, new 8Ll(c1u3, (CharSequence) null, 7zS.A0B(A0P, A002, "[[learn-more]]", A0D), (String) null, 10), new 8Ll(C1u3.A5l, (CharSequence) null, getString(2131964215), (String) null, 10)), true));
    }
}
