package com.facebook.messaging.memories.viewer;

import X.0Q8;
import X.11T;
import X.1Br;
import X.1Iw;
import X.1LI;
import X.7zN;
import X.7zQ;
import X.8XE;
import X.9De;
import X.9V1;
import X.AQr;
import X.C00g;
import X.C37s;
import com.facebook.messaging.montage.viewer.progressindicator.MontageProgressIndicatorView;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: MemoryViewerHideBottomSheetFragment.class */
public final class MemoryViewerHideBottomSheetFragment extends MigBottomSheetDialogFragment implements C00g {
    public 9V1 A00;
    public final 1Br A01 = 7zN.A0I(this);

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public 9De A1D() {
        return new C37s(50);
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void A1I() {
        9V1 r0 = this.A00;
        if (r0 == null) {
            11T.A0L("listener");
            throw 0Q8.createAndThrow();
        }
        MontageProgressIndicatorView montageProgressIndicatorView = r0.A04.A06;
        if (montageProgressIndicatorView != null) {
            montageProgressIndicatorView.A02();
        }
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        MigColorScheme A0m = 7zQ.A0m(this.A01);
        9V1 r0 = this.A00;
        if (r0 != null) {
            return new 8XE(r0, A0m, new AQr(this, 34));
        }
        11T.A0L("listener");
        throw 0Q8.createAndThrow();
    }
}
