package com.facebook.messaging.magicwords.creation.longclick;

import X.11T;
import X.1Iw;
import X.1LI;
import X.2RH;
import X.2cK;
import X.2cM;
import X.4YU;
import X.55M;
import X.55N;
import X.58N;
import X.7zM;
import X.7zO;
import X.7zP;
import X.Ber;
import X.C1u3;
import X.C1u4;
import X.C1ut;
import X.CJ4;
import X.Cvn;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: MagicWordsLongClickBottomSheet.class */
public final class MagicWordsLongClickBottomSheet extends MigBottomSheetDialogFragment {
    public Ber A00;

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        11T.A0F(r302, 0);
        2cM A00 = 2cK.A00(r302);
        55N A002 = 55M.A00(r302);
        CJ4 cj4 = new CJ4();
        cj4.A04(4YU.A0E(r302).getString(2131958993));
        C1u3 c1u3 = C1u3.A6a;
        C1u4 c1u4 = C1u4.SIZE_32;
        C1ut c1ut = C1ut.A0A;
        MigColorScheme A1F = A1F();
        7zP.A1S(c1u3, c1u4, c1ut);
        A1F.getClass();
        cj4.A04 = new 58N(c1u3, c1u4, c1ut, A1F);
        cj4.A01 = Cvn.A00(this, 50);
        cj4.A07 = A1F();
        A00.A2e(7zM.A10(cj4.A01(), A002));
        7zO.A1F(A00, 2RH.A05);
        A00.A0R();
        return A00.A00;
    }
}
