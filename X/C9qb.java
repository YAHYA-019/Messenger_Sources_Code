package X;

import android.os.Bundle;
import com.facebook.messaging.encryptedbackups.hsm.ui.viewdata.PinSetupViewData$FragmentResult;
import com.facebook.messaging.memories.viewer.MemoryViewerFragment;
import com.facebook.messaging.montage.viewer.progressindicator.MontageProgressIndicatorView;

/* renamed from: X.9qb, reason: invalid class name */
/* loaded from: 9qb.class */
public final class C9qb implements 0Tx {
    public final int A00;
    public final Object A01;

    public C9qb(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Bza(String str, Bundle bundle) {
        if (this.A00 != 0) {
            MontageProgressIndicatorView montageProgressIndicatorView = ((MemoryViewerFragment) this.A01).A0A;
            if (montageProgressIndicatorView != null) {
                montageProgressIndicatorView.A02();
                return;
            }
            return;
        }
        11T.A0F(bundle, 1);
        0fH.A0j("EbDefaultUpsellBottomSheetViewModel", "Received result from EbUpsellPinSetupFragment");
        PinSetupViewData$FragmentResult pinSetupViewData$FragmentResult = (PinSetupViewData$FragmentResult) AnonymousClass086.A00(bundle, PinSetupViewData$FragmentResult.class, "fragmentResult");
        if (pinSetupViewData$FragmentResult == null) {
            0fH.A0j("EbDefaultUpsellBottomSheetViewModel", "Received null result");
            return;
        }
        int i = pinSetupViewData$FragmentResult.A00;
        0fH.A0j("EbDefaultUpsellBottomSheetFragment", 0Pz.A0T("userClickedPinInput = ", i));
        if (i > 0) {
            0fH.A0j("EbDefaultUpsellBottomSheetViewModel", "User clicked pin input, expand bottom sheet");
            8Cq r0 = (8Cq) this.A01;
            if (!AnonymousClass001.A1V(r0.A05.getValue())) {
                r0.A01.A08("DEFAULT_EB_UPSELL_BOTTOM_SHEET_PIN_EXPAND");
                r0.A00.set("isBottomSheetExpanded", true);
            }
        }
        if (pinSetupViewData$FragmentResult.A01) {
            0fH.A0j("EbDefaultUpsellBottomSheetViewModel", "Flow finished, dismiss bottom sheet");
            8Cq r02 = (8Cq) this.A01;
            r02.A00.set("isFlowFinished", true);
            C1wk c1wk = r02.A02;
            1Ql.A02(C1wk.A02(c1wk), C1wg.A01(c1wk, 1NK.A4g, 1), true);
            C1wk.A06(c1wk, Long.valueOf(C1wk.A00(c1wk).now()));
            AJd.A03(r02, 7zN.A0y(), 28);
        }
    }
}
