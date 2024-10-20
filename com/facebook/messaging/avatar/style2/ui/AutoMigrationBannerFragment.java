package com.facebook.messaging.avatar.style2.ui;

import X.11T;
import X.1Iw;
import X.1LI;
import X.7zL;
import X.7zO;
import X.7zU;
import X.8DI;
import X.AJT;
import X.AQc;
import X.C01g;
import X.C01i;
import X.C03i;
import X.C8fe;
import X.DCx;
import android.os.Bundle;
import android.view.View;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;

/* loaded from: AutoMigrationBannerFragment.class */
public final class AutoMigrationBannerFragment extends MigBottomSheetDialogFragment {
    public final C01i A00;
    public final C01i A01;

    public AutoMigrationBannerFragment() {
        C03i c03i = C03i.A02;
        this.A00 = C01g.A00(c03i, new DCx(this, 44));
        DCx dCx = new DCx(this, 48);
        C01i A00 = C01g.A00(c03i, new DCx(new DCx(this, 45), 46));
        this.A01 = 7zU.A0F(new DCx(A00, 47), dCx, AQc.A00(null, A00, 47), 7zL.A18(8DI.class));
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        int[] iArr = C8fe.A03;
        return new C8fe(this, A1F(), (String) ((8DI) this.A01.getValue()).A04.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        AJT.A02(this, 7zO.A0J(this), 43);
    }
}
