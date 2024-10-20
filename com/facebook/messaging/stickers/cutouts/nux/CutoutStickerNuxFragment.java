package com.facebook.messaging.stickers.cutouts.nux;

import X.11T;
import X.1Iw;
import X.1LI;
import X.2cK;
import X.2cM;
import X.2qQ;
import X.2qR;
import X.7zL;
import X.7zM;
import X.7zQ;
import X.7zR;
import X.83S;
import X.8Lf;
import X.8NJ;
import X.8Tn;
import X.9De;
import X.AV3;
import X.C37s;
import X.C5yv;
import X.C5yw;
import X.C8nn;
import X.C8xc;
import X.C9Oy;
import X.C9zj;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import java.util.List;

/* loaded from: CutoutStickerNuxFragment.class */
public final class CutoutStickerNuxFragment extends MigBottomSheetDialogFragment {
    public static final 2qR A01;
    public C9Oy A00;

    static {
        2qQ A0o = 7zL.A0o();
        7zM.A1V(A0o, 2132346716);
        A01 = 7zQ.A0k(A0o, 2132346715);
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public 9De A1D() {
        return new C37s(80);
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        11T.A0F(r302, 0);
        this.A03 = true;
        BaseMigBottomSheetDialogFragment.A06(this);
        2cM A012 = 2cK.A01(r302, (String) null, 0);
        8Tn A00 = C8nn.A00(r302);
        A00.A2a(A1F());
        C8xc c8xc = new C8xc((Integer) A1F().Ci4(A01), 1.0564516f);
        String A0D = r302.A0D(2131955426);
        A00.A2Y(new 8NJ(new 8Lf(83S.A00(this, 24), 83S.A00(this, 25), A0D, r302.A0D(2131955424)), c8xc, r302.A0D(2131955423), (CharSequence) null, r302.A0D(2131955425), (List) null, true));
        A00.A2X();
        A00.A19(0.0f);
        A012.A2e(A00.A2W());
        C5yw A002 = C5yv.A00(r302);
        A002.A2b(A1F());
        A002.A2X();
        A002.A2h(false);
        C9zj.A04(A002, this, 94);
        A002.A2i(false);
        A002.A0c();
        A012.A2e(A002.A2V());
        7zR.A1B(A012, AV3.A00(this, 17));
        return A012.A00;
    }
}
