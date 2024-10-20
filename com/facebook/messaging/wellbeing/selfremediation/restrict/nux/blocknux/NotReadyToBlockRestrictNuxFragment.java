package com.facebook.messaging.wellbeing.selfremediation.restrict.nux.blocknux;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1Br;
import X.1Bu;
import X.1Iw;
import X.1LI;
import X.9De;
import X.AbF;
import X.C2623GjD;
import X.C37r;
import X.CEu;
import X.CZF;
import X.Q2H;
import X.QGy;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;

/* loaded from: NotReadyToBlockRestrictNuxFragment.class */
public final class NotReadyToBlockRestrictNuxFragment extends MigBottomSheetDialogFragment {
    public C2623GjD A00;
    public Q2H A01;
    public User A02;
    public FbUserSession A03;
    public CEu A04;
    public final 1Br A05 = 1Bu.A00(147784);

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public 9De A1D() {
        return new C37r(90);
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        CEu cEu = this.A04;
        if (cEu == null) {
            AbF.A1H();
            throw 0Q8.createAndThrow();
        }
        MigColorScheme A1F = A1F();
        11T.A0F(A1F, 0);
        return new QGy(CZF.A00(cEu, 83), CZF.A00(cEu, 84), A1F, cEu.A04);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d5  */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.wellbeing.selfremediation.restrict.nux.blocknux.NotReadyToBlockRestrictNuxFragment.onCreate(android.os.Bundle):void");
    }

    public void onDestroyView() {
        int A02 = 0FI.A02(-1243962528);
        super.onDestroyView();
        CEu cEu = this.A04;
        if (cEu == null) {
            AbF.A1H();
            throw 0Q8.createAndThrow();
        }
        cEu.A00 = null;
        0FI.A08(1800973558, A02);
    }
}
