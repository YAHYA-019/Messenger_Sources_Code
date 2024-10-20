package com.facebook.bloks.messenger.bottomsheet;

import X.0D2;
import X.0FI;
import X.0Q8;
import X.11T;
import X.7zR;
import X.9De;
import X.AbJ;
import X.AnonymousClass001;
import X.C06c;
import X.C37r;
import X.C37s;
import X.DR7;
import X.EUf;
import X.FYs;
import X.GE9;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;
import com.facebook.resources.ui.FbFrameLayout;

/* loaded from: MSGBloksBottomSheetFragment.class */
public final class MSGBloksBottomSheetFragment extends BaseMigBottomSheetDialogFragment {
    public GE9 A00;
    public int A02;
    public Bundle A04;
    public FbFrameLayout A05;
    public boolean A09;
    public int A01 = 100;
    public int A03 = 100;
    public boolean A06 = true;
    public boolean A07 = true;
    public boolean A08 = true;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.widget.FrameLayout, android.view.View, com.facebook.resources.ui.FbFrameLayout] */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public View A1C() {
        ?? frameLayout = new FrameLayout(requireContext());
        this.A05 = frameLayout;
        frameLayout.setId(2131362467);
        FbFrameLayout fbFrameLayout = this.A05;
        if (fbFrameLayout != null) {
            7zR.A11(fbFrameLayout);
            FbFrameLayout fbFrameLayout2 = this.A05;
            if (fbFrameLayout2 != null) {
                return fbFrameLayout2;
            }
        }
        11T.A0L("fragmentContainer");
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public 9De A1D() {
        return this.A09 ? new C37s(this.A03) : new C37r(this.A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        IllegalStateException A0N;
        int i;
        int A02 = 0FI.A02(382663885);
        super.onCreate(bundle);
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("MSG_BLOKS_BOTTOM_SHEET_BUNDLE_KEY");
            if (parcelable == null) {
                A0N = AnonymousClass001.A0N("Required value was null.");
                i = -1229056652;
                0FI.A08(i, A02);
                throw A0N;
            }
            this.A04 = (Bundle) parcelable;
            this.A02 = bundle.getInt("MSG_BLOKS_BOTTOM_SHEET_FIXED_HEIGHT_KEY");
            this.A09 = bundle.getBoolean("MSG_BLOKS_BOTTOM_SHEET_SHOULD_FIT_TO_CONTENT_KEY");
            this.A01 = bundle.getInt("MSG_BLOKS_BOTTOM_SHEET_DEFAULT_HEIGHT_KEY");
            this.A03 = bundle.getInt("MSG_BLOKS_BOTTOM_SHEET_FIT_TO_PEEK_HEIGHT_KEY");
            this.A06 = bundle.getBoolean("MSG_BLOKS_IS_CANCELLABLE_KEY");
            this.A07 = bundle.getBoolean("MSG_BLOKS_IS_DRAGGABLE_KEY");
            this.A08 = bundle.getBoolean("MSG_BLOKS_IS_HIDEABLE_KEY");
            getChildFragmentManager().A1L(new FYs(this, 0));
            0FI.A08(-1283898217, A02);
        }
        Parcelable parcelable2 = requireArguments().getParcelable("MSG_BLOKS_BOTTOM_SHEET_BUNDLE_KEY");
        if (parcelable2 == null) {
            A0N = AnonymousClass001.A0N("Required value was null.");
            i = 1777602256;
            0FI.A08(i, A02);
            throw A0N;
        }
        this.A04 = (Bundle) parcelable2;
        this.A02 = requireArguments().getInt("MSG_BLOKS_BOTTOM_SHEET_FIXED_HEIGHT_KEY");
        this.A09 = requireArguments().getBoolean("MSG_BLOKS_BOTTOM_SHEET_SHOULD_FIT_TO_CONTENT_KEY");
        this.A01 = requireArguments().getInt("MSG_BLOKS_BOTTOM_SHEET_DEFAULT_HEIGHT_KEY");
        this.A03 = requireArguments().getInt("MSG_BLOKS_BOTTOM_SHEET_FIT_TO_PEEK_HEIGHT_KEY");
        this.A06 = requireArguments().getBoolean("MSG_BLOKS_IS_CANCELLABLE_KEY");
        this.A07 = requireArguments().getBoolean("MSG_BLOKS_IS_DRAGGABLE_KEY");
        bundle = requireArguments();
        this.A08 = bundle.getBoolean("MSG_BLOKS_IS_HIDEABLE_KEY");
        getChildFragmentManager().A1L(new FYs(this, 0));
        0FI.A08(-1283898217, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDismiss(DialogInterface dialogInterface) {
        GE9 ge9;
        11T.A0F(dialogInterface, 0);
        super/*X.0D2*/.onDismiss(dialogInterface);
        if (!isAdded() || isStateSaved() || (ge9 = this.A00) == null) {
            return;
        }
        ge9.onDismiss();
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onSaveInstanceState(Bundle bundle) {
        11T.A0F(bundle, 0);
        super.onSaveInstanceState(bundle);
        Bundle bundle2 = this.A04;
        if (bundle2 == null) {
            11T.A0L("bloksBundle");
            throw 0Q8.createAndThrow();
        }
        bundle.putBundle("MSG_BLOKS_BOTTOM_SHEET_BUNDLE_KEY", bundle2);
        bundle.putInt("MSG_BLOKS_BOTTOM_SHEET_FIXED_HEIGHT_KEY", this.A02);
        bundle.putBoolean("MSG_BLOKS_BOTTOM_SHEET_SHOULD_FIT_TO_CONTENT_KEY", this.A09);
        bundle.putInt("MSG_BLOKS_BOTTOM_SHEET_DEFAULT_HEIGHT_KEY", this.A01);
        bundle.putInt("MSG_BLOKS_BOTTOM_SHEET_FIT_TO_PEEK_HEIGHT_KEY", this.A03);
        bundle.putBoolean("MSG_BLOKS_IS_CANCELLABLE_KEY", this.A06);
        bundle.putBoolean("MSG_BLOKS_IS_DRAGGABLE_KEY", this.A07);
        bundle.putBoolean("MSG_BLOKS_IS_HIDEABLE_KEY", this.A08);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        DR7 dr7 = ((0D2) this).A01;
        if (dr7 instanceof DR7) {
            11T.A0I(dr7, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
            DR7 dr72 = dr7;
            dr72.A05().A0I(this.A08);
            dr72.A05().A0O = this.A07;
            dr72.setCancelable(this.A06);
        }
        if (getChildFragmentManager().A0b("MSGBloksScreenFragment_default_screen_id") == null) {
            int i = this.A09 ? this.A01 : 100;
            C06c A09 = AbJ.A09(this);
            Bundle bundle2 = this.A04;
            if (bundle2 == null) {
                11T.A0L("bloksBundle");
                throw 0Q8.createAndThrow();
            }
            A09.A0P(EUf.A00(bundle2, i, true), "MSGBloksScreenFragment_default_screen_id", 2131362467);
            A09.A0V("MSGBloksScreenFragment_default_screen_id");
            A09.A04();
        }
    }
}
