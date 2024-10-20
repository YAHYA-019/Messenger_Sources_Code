package com.facebook.messaging.msys.thread.writewithai.fragment;

import X.06Z;
import X.0AU;
import X.0D2;
import X.0FI;
import X.0Q8;
import X.11T;
import X.1Bq;
import X.1Br;
import X.1Lm;
import X.2qQ;
import X.7zL;
import X.7zM;
import X.7zN;
import X.7zO;
import X.7zQ;
import X.7zR;
import X.7zT;
import X.7zU;
import X.7zV;
import X.8DO;
import X.8LA;
import X.8uW;
import X.9De;
import X.AJU;
import X.AKO;
import X.AKX;
import X.AQa;
import X.AZT;
import X.C01g;
import X.C01i;
import X.C03i;
import X.C0ty;
import X.C1os;
import X.C2yk;
import X.C95m;
import X.C9ks;
import android.R;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.facebook.litho.LithoView;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: WriteWithAiDialogFragment.class */
public final class WriteWithAiDialogFragment extends BaseMigBottomSheetDialogFragment {
    public int A00;
    public Drawable A01;
    public LithoView A02;
    public AZT A03;
    public 8LA A04;
    public 8uW A05;
    public final 1Br A06;
    public final 1Br A07;
    public final C01i A08;
    public final C01i A09;

    public WriteWithAiDialogFragment() {
        C03i c03i = C03i.A02;
        this.A08 = AQa.A00(this, c03i, 48);
        AKO ako = new AKO(this, 2);
        C01i A00 = C01g.A00(c03i, new AKO(new AQa(this, 49), 0));
        this.A09 = 7zU.A0F(new AKO(A00, 1), ako, new AKX((Object) null, A00, 8), 7zL.A18(8DO.class));
        this.A06 = 1Lm.A02(7zM.A0I(this.A08), this, 66301);
        this.A07 = 1Bq.A00(68070);
        C95m c95m = C95m.A02;
        C0ty c0ty = C0ty.A00;
        this.A04 = new 8LA(c95m, (CharSequence) null, (String) null, c0ty, c0ty, false, false, false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public View A1C() {
        LithoView A0M = 7zR.A0M(this);
        7zR.A11(A0M);
        this.A02 = A0M;
        return A0M;
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public 9De A1D() {
        return 9De.A00();
    }

    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(766089012);
        super.onCreate(bundle);
        A0g(2, R.style.Theme.NoTitleBar);
        0FI.A08(1371132020, A02);
    }

    public void onDestroyView() {
        int A02 = 0FI.A02(652616501);
        super.onDestroyView();
        this.A02 = null;
        if (this.A05 == null) {
            11T.A0L("viewDataBridge");
            throw 0Q8.createAndThrow();
        }
        0FI.A08(-1644891725, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onViewCreated(View view, Bundle bundle) {
        Window window;
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        Dialog dialog = ((0D2) this).A01;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setSoftInputMode(16);
        }
        Dialog dialog2 = ((0D2) this).A01;
        Window window2 = dialog2 != null ? dialog2.getWindow() : null;
        this.A00 = A1F().Chx(7zV.A0N(this));
        Context requireContext = requireContext();
        MigColorScheme A1F = A1F();
        2qQ A0o = 7zL.A0o();
        7zM.A1V(A0o, 2132346770);
        this.A01 = requireContext.getDrawable(7zT.A02(A0o, A1F, 2132346769));
        if (window2 != null) {
            boolean A00 = ((C1os) 1Br.A0B(this.A06)).A00();
            if (0AU.A00(30)) {
                C2yk.A01(window2, A00);
            } else if (0AU.A00(26)) {
                int systemUiVisibility = window2.getDecorView().getSystemUiVisibility();
                View decorView = window2.getDecorView();
                int i = systemUiVisibility | 16;
                if (A00) {
                    i = systemUiVisibility & (-17);
                }
                decorView.setSystemUiVisibility(i);
            }
            C2yk.A00(window2, this.A00);
        }
        Object parent = view.getParent();
        11T.A0I(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        View findViewById = ((View) parent).findViewById(2131364441);
        GradientDrawable A0G = 7zO.A0G(0);
        float[] fArr = new float[8];
        int i2 = 0;
        do {
            fArr[i2] = 0.0f;
            i2++;
        } while (i2 < 8);
        7zV.A0k(A0G, fArr);
        A0G.setColor(this.A00);
        findViewById.setBackground(A0G);
        Context requireContext2 = requireContext();
        06Z A08 = 7zN.A08(this);
        C01i c01i = this.A09;
        this.A05 = new 8uW(requireContext2, A08, (ThreadKey) requireArguments().getParcelable("WriteWithAiDialogFragment.arg_thread_key"), (8DO) c01i.getValue(), 7zU.A0t(this, 17), 7zU.A0t(this, 18));
        8DO r0 = (8DO) c01i.getValue();
        if (!r0.A01) {
            7zQ.A0x(((C9ks) 1Br.A0B(r0.A02)).A00).A0J(C9ks.A00(r0.A07), r0.A06, (String) null, 1);
        }
        r0.A01 = true;
        AJU.A02(this, 7zO.A0J(this), 2);
    }
}
