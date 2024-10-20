package com.facebook.bloks.messenger.hosting.screenqueries;

import X.0D2;
import X.0FI;
import X.11T;
import X.7zR;
import X.9De;
import X.AbJ;
import X.C06c;
import X.C37s;
import X.DR7;
import X.DZS;
import X.FKF;
import X.FYs;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;

/* loaded from: MSGBloksScreenQueryBottomSheetHostFragment.class */
public final class MSGBloksScreenQueryBottomSheetHostFragment extends BaseMigBottomSheetDialogFragment {
    public boolean A00;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public View A1C() {
        FrameLayout frameLayout = new FrameLayout(requireContext());
        frameLayout.setId(2131362467);
        7zR.A11(frameLayout);
        return frameLayout;
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public 9De A1D() {
        return new C37s(100);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int i;
        int A02 = 0FI.A02(1850703090);
        super.onCreate(bundle);
        if (bundle == null || getChildFragmentManager().A0U() != 0) {
            getChildFragmentManager().A1L(new FYs(this, 1));
            i = 565910830;
        } else {
            this.A00 = true;
            A0p();
            i = -1014614547;
        }
        0FI.A08(i, A02);
    }

    public void onDestroyView() {
        int A02 = 0FI.A02(-2136584119);
        Dialog dialog = ((0D2) this).A01;
        if (dialog != null) {
            dialog.setOnKeyListener(null);
        }
        super.onDestroyView();
        0FI.A08(1758299817, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        if (this.A00) {
            return;
        }
        DR7 dr7 = ((0D2) this).A01;
        if (dr7 instanceof DR7) {
            11T.A0I(dr7, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
            DR7 dr72 = dr7;
            dr72.A07 = true;
            dr72.setCancelable(true);
            dr72.setOnKeyListener(new FKF(this, 0));
        }
        if (getChildFragmentManager().A0U() == 0) {
            Bundle requireArguments = requireArguments();
            String str = this.mTag;
            Fragment dzs = new DZS();
            dzs.setArguments(requireArguments);
            C06c A09 = AbJ.A09(this);
            A09.A0P(dzs, str, 2131362467);
            A09.A0V(str);
            A09.A04();
        }
    }
}
