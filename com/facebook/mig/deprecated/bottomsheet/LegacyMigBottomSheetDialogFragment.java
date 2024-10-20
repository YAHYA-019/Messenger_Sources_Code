package com.facebook.mig.deprecated.bottomsheet;

import X.06Z;
import X.0FI;
import X.1BK;
import X.1LI;
import X.1iF;
import X.2Ov;
import X.7zL;
import X.7zO;
import X.7zQ;
import X.7zS;
import X.7zT;
import X.AbF;
import X.AbG;
import X.C2cn;
import X.DR7;
import X.FKG;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: LegacyMigBottomSheetDialogFragment.class */
public class LegacyMigBottomSheetDialogFragment extends 2Ov {
    public DialogInterface.OnDismissListener A00;
    public View A01;
    public MigColorScheme A02;
    public 1LI A03;
    public LithoView A04;
    public boolean A05;

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.fragment.app.Fragment, com.facebook.mig.deprecated.bottomsheet.LegacyMigBottomSheetDialogFragment, X.2Ov] */
    public static LegacyMigBottomSheetDialogFragment A05(MigColorScheme migColorScheme, boolean z) {
        Bundle A05 = 1BK.A05();
        A05.putParcelable("COLOR_SCHEME_ARG", migColorScheme);
        A05.putBoolean("SKIP_COLLAPSED_STATE_ARG", z);
        ?? r0 = new 2Ov();
        r0.setArguments(A05);
        return r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Dialog A0n(Bundle bundle) {
        DR7 dr7 = new DR7(requireContext(), 2132607545);
        if (this.A05) {
            dr7.setOnShowListener(new FKG(this, 2));
            dr7.A05().A0W = true;
        }
        return dr7;
    }

    public 1iF A17() {
        return AbF.A0C(793831904833076L);
    }

    public void A1C(06Z r302, 1LI r303, String str) {
        r303.getClass();
        this.A03 = r303;
        A0m(r302, str);
    }

    public void A1D(1LI r302) {
        r302.getClass();
        this.A03 = r302;
        LithoView lithoView = this.A04;
        if (lithoView != null) {
            7zQ.A1I(ComponentTree.A01(r302, lithoView.A09, null), lithoView);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        int i;
        int A02 = 0FI.A02(-133430119);
        super.onCreate(bundle);
        if (this.A03 == null) {
            A0p();
            i = -1131235419;
        } else {
            Bundle requireArguments = requireArguments();
            Parcelable parcelable = requireArguments.getParcelable("COLOR_SCHEME_ARG");
            parcelable.getClass();
            this.A02 = (MigColorScheme) parcelable;
            this.A05 = requireArguments.getBoolean("SKIP_COLLAPSED_STATE_ARG");
            i = -569766613;
        }
        0FI.A08(i, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(1239797360);
        View A08 = AbG.A08(layoutInflater, viewGroup, 2132542417);
        0FI.A08(516948437, A02);
        return A08;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super/*X.0D2*/.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.A00;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A01 = view.findViewById(2131364438);
        LithoView A0b = 7zL.A0b(view, 2131365270);
        this.A04 = A0b;
        A0b.A0y(this.A03);
        float A01 = 7zL.A01(7zO.A0D(this), 2132279310);
        float[] fArr = new float[8];
        fArr[0] = A01;
        7zS.A1X(fArr, A01, 1);
        7zT.A1X(fArr, 0.0f);
        view.setBackground(C2cn.A03(fArr, this.A02.AjC()));
        this.A01.setBackground(C2cn.A02(7zL.A01(7zO.A0D(this), 2132279309), this.A02.AYx()));
    }
}
