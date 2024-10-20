package com.facebook.messaging.highlightstab.xsharelibraries.composer.common;

import X.0D2;
import X.0FI;
import X.0Q8;
import X.11T;
import X.1BJ;
import X.1BK;
import X.1Br;
import X.1iF;
import X.2Ov;
import X.2qQ;
import X.2qR;
import X.6RU;
import X.6tT;
import X.7zL;
import X.7zM;
import X.7zN;
import X.7zQ;
import X.7zR;
import X.94T;
import X.9Df;
import X.9eR;
import X.C00g;
import X.DKB;
import X.DR7;
import X.EHH;
import X.FKG;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import com.facebook.litho.LithoView;
import com.facebook.messaging.highlightstab.xsharelibraries.composer.HighlightsTabComposerBottomSheetFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: BaseHTBottomSheetDialogFragment.class */
public abstract class BaseHTBottomSheetDialogFragment extends 2Ov implements C00g {
    public static final 2qR A05;
    public MigColorScheme A00;
    public BottomSheetBehavior A01;
    public boolean A02;
    public boolean A03;
    public final 1Br A04 = 7zN.A0I(this);

    static {
        2qQ A0o = 7zL.A0o();
        7zM.A1V(A0o, 2132607487);
        A05 = 7zQ.A0k(A0o, 2132607486);
    }

    public static final void A05(BaseHTBottomSheetDialogFragment baseHTBottomSheetDialogFragment, boolean z) {
        if (z) {
            super/*X.0D2*/.A0p();
        } else {
            super/*X.0D2*/.A0o();
        }
    }

    private final boolean A06(boolean z) {
        DR7 dr7 = ((0D2) this).A01;
        boolean z2 = false;
        if (dr7 instanceof DR7) {
            11T.A0I(dr7, DKB.A00(4));
            DR7 dr72 = dr7;
            if (A1C().A0R && dr72.A07) {
                if (A1C().A0G == 5) {
                    A05(this, z);
                } else {
                    A1C().A0G(new 94T(this, z));
                    A1C().A0B(5);
                }
                z2 = true;
            }
        }
        return z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Dialog A0n(Bundle bundle) {
        MigColorScheme migColorScheme = this.A00;
        if (migColorScheme == null) {
            migColorScheme = 7zQ.A0m(this.A04);
        }
        Number number = (Number) migColorScheme.Ci4(A05);
        Context requireContext = requireContext();
        11T.A0D(number);
        EHH ehh = new EHH(requireContext, this, number.intValue());
        BottomSheetBehavior A052 = ehh.A05();
        11T.A0A(A052);
        this.A01 = A052;
        A1C().A0F = -1;
        A1C().A0H(true);
        A1C().A0D((int) (9Df.A00(requireContext()) * (70.0f / 100.0f)), false);
        if (this.A02) {
            ehh.setOnShowListener(new FKG(this, 1));
            A1C().A0W = true;
        }
        A1C().A0B = -1;
        return ehh;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0o() {
        if (!isAdded() || isStateSaved() || A06(false)) {
            return;
        }
        super/*X.0D2*/.A0o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0p() {
        if (!isAdded() || isStateSaved() || A06(true)) {
            return;
        }
        super/*X.0D2*/.A0p();
    }

    public 1iF A17() {
        return new 1iF(1299289207322385L);
    }

    public final BottomSheetBehavior A1C() {
        BottomSheetBehavior bottomSheetBehavior = this.A01;
        if (bottomSheetBehavior != null) {
            return bottomSheetBehavior;
        }
        11T.A0L("bottomSheetBehavior");
        throw 0Q8.createAndThrow();
    }

    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-373574508);
        super.onCreate(bundle);
        if (bundle != null) {
            this.A00 = (MigColorScheme) bundle.getParcelable(1BJ.A00(70));
            this.A02 = bundle.getBoolean(1BJ.A00(307));
            this.A03 = bundle.getBoolean(1BJ.A00(246));
        }
        0FI.A08(1134167148, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(1746576239);
        11T.A0F(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2132542120, viewGroup, false);
        if (this.A03) {
            float f = NestedScrollView.A0T;
            NestedScrollView nestedScrollView = new NestedScrollView(layoutInflater.getContext(), null);
            nestedScrollView.addView(inflate);
            inflate = nestedScrollView;
        } else {
            11T.A0D(inflate);
        }
        0FI.A08(150290231, A02);
        return inflate;
    }

    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super/*X.0D2*/.onSaveInstanceState(bundle);
        bundle.putParcelable(1BJ.A00(70), this.A00);
        bundle.putBoolean(1BJ.A00(307), this.A02);
        bundle.putBoolean(1BJ.A00(246), this.A03);
    }

    public void onStart() {
        int i;
        Window window;
        int A02 = 0FI.A02(1140169887);
        super/*X.0D2*/.onStart();
        Dialog dialog = ((0D2) this).A01;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            i = 427710927;
        } else {
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes == null) {
                i = -443781202;
            } else {
                attributes.dimAmount = 0.0f;
                attributes.flags |= 2;
                window.setAttributes(attributes);
                i = 1189714915;
            }
        }
        0FI.A08(i, A02);
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [com.facebook.messaging.highlightstab.xsharelibraries.composer.HighlightsTabComposerBottomSheetFragment, androidx.fragment.app.Fragment] */
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        Dialog A0e = A0e();
        MigColorScheme migColorScheme = this.A00;
        if (migColorScheme == null) {
            migColorScheme = 7zQ.A0m(this.A04);
        }
        11T.A0F(migColorScheme, 1);
        Window window = A0e.getWindow();
        if (window == null) {
            throw 1BK.A0h();
        }
        9eR.A00(window, migColorScheme);
        View findViewById = view.findViewById(2131364511);
        if (findViewById != null) {
            findViewById.getLayoutParams().height = -1;
        }
        ViewGroup viewGroup = (ViewGroup) view.findViewById(2131363335);
        ?? r0 = (HighlightsTabComposerBottomSheetFragment) this;
        r0.A01 = new 6RU(r0.requireContext());
        LithoView A0M = 7zR.A0M((Fragment) r0);
        A0M.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 80));
        r0.A00 = A0M;
        6RU r02 = r0.A01;
        if (r02 == null) {
            11T.A0L("composerContext");
            throw 0Q8.createAndThrow();
        }
        6tT r03 = new 6tT(r02);
        r03.setOrientation(1);
        r03.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        r03.addView(A0M);
        viewGroup.addView(r03);
    }
}
