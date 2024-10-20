package com.facebook.messaging.encryptedbackups.defaulteb.bottomsheet;

import X.0FI;
import X.0Q8;
import X.0fH;
import X.11T;
import X.1BK;
import X.1BL;
import X.1Br;
import X.1G9;
import X.1NK;
import X.1Ql;
import X.4YV;
import X.7zL;
import X.7zN;
import X.7zU;
import X.8Cq;
import X.9De;
import X.AJd;
import X.AQb;
import X.AQt;
import X.AnonymousClass001;
import X.C01g;
import X.C01i;
import X.C03i;
import X.C06c;
import X.C1wg;
import X.C1wk;
import X.C96q;
import X.C9qb;
import X.C9uq;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import com.facebook.messaging.encryptedbackups.hsm.ui.fragment.HsmPinCodeSetupBaseFragment;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.quicklog.reliability.UserFlowLogger;

/* loaded from: EbDefaultUpsellBottomSheetFragment.class */
public final class EbDefaultUpsellBottomSheetFragment extends BaseMigBottomSheetDialogFragment {
    public 8Cq A00;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public View A1C() {
        return new FrameLayout(requireContext());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.9De, java.lang.Object] */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public 9De A1D() {
        return new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(1357053146);
        super.onCreate(bundle);
        AQb A00 = AQb.A00(this, 38);
        C01i A002 = C01g.A00(C03i.A02, AQb.A00(AQb.A00(this, 35), 36));
        8Cq r0 = (8Cq) 7zU.A0F(AQb.A00(A002, 37), A00, AQt.A01(null, A002, 38), 7zL.A18(8Cq.class)).getValue();
        this.A00 = r0;
        if (r0 == null) {
            11T.A0L("viewModel");
            throw 0Q8.createAndThrow();
        }
        0fH.A0j("EbDefaultUpsellBottomSheetViewModel", AnonymousClass001.A0Z(r0, "onFragmentCreate for ", AnonymousClass001.A0k()));
        1BL.A1I(bundle, "savedInstanceState=", "EbDefaultUpsellBottomSheetViewModel", AnonymousClass001.A0k());
        if (bundle == null) {
            C9uq c9uq = r0.A01;
            C96q c96q = C96q.A02;
            1Br r02 = c9uq.A07;
            UserFlowLogger A0Z = 4YV.A0Z(r02);
            long j = c9uq.A03;
            String obj = c96q.toString();
            7zN.A1Z(A0Z, obj, j, false);
            4YV.A0Z(r02).flowAnnotateWithCrucialData(j, "ENTRY_POINT", obj);
            c9uq.A00 = c96q;
            c9uq.A02 = true;
            c9uq.A08("DEFAULT_EB_UPSELL_IMPRESSION");
            c9uq.A08("DEFAULT_EB_UPSELL_BOTTOM_SHEET_PIN_IMPRESSION");
            C1wk c1wk = r0.A02;
            FbSharedPreferences A03 = C1wk.A03(c1wk);
            1G9 r03 = 1NK.A4h;
            4YV.A0Z(r02).flowAnnotate(j, "DISMISS_COUNT", A03.ArU(C1wg.A01(c1wk, r03, 1), 0));
            1Ql A022 = C1wk.A02(c1wk);
            A022.CaE(C1wg.A01(c1wk, r03, 1), C1wk.A03(c1wk).ArU(C1wg.A01(c1wk, r03, 1), 0) + 1);
            A022.commitImmediately();
        }
        getChildFragmentManager().A1O(new C9qb(r0, 0), this, "EbUpsellPinSetupFragment");
        0FI.A08(1867620081, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        int A02 = 0FI.A02(1806670307);
        8Cq r0 = this.A00;
        if (r0 == null) {
            11T.A0L("viewModel");
            throw 0Q8.createAndThrow();
        }
        boolean isChangingConfigurations = requireActivity().isChangingConfigurations();
        boolean isFinishing = requireActivity().isFinishing();
        if ((!isChangingConfigurations || isFinishing) && !1BK.A1X(r0.A00.get("isFlowFinished"), true)) {
            r0.A01.A06("DEFAULT_EB_UPSELL_PIN_BOTTOM_SHEET_DISMISS");
            C1wk c1wk = r0.A02;
            1Ql.A02(C1wk.A02(c1wk), C1wg.A01(c1wk, 1NK.A4g, 1), false);
            C1wk.A06(c1wk, Long.valueOf(C1wk.A00(c1wk).now()));
        }
        super.onDestroy();
        0FI.A08(49073248, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        if (bundle == null) {
            C06c A0G = 7zL.A0G(7zN.A08(this));
            A0G.A0Q(new HsmPinCodeSetupBaseFragment(), "EbUpsellPinSetupFragment", 2131363003);
            A0G.A04();
        }
        AJd.A03(this, LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), 27);
    }
}
