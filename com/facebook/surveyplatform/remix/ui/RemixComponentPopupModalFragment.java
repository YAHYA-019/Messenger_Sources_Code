package com.facebook.surveyplatform.remix.ui;

import X.0AW;
import X.0D2;
import X.0FI;
import X.1Iw;
import X.2Ov;
import X.2S0;
import X.6QF;
import X.7zL;
import X.AbI;
import X.C1rs;
import X.DKS;
import X.FHC;
import X.H0U;
import X.Hgi;
import X.IGS;
import X.IGZ;
import X.IGb;
import X.QEg;
import X.QLN;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.facebook.litho.LithoView;
import java.util.BitSet;

/* loaded from: RemixComponentPopupModalFragment.class */
public class RemixComponentPopupModalFragment extends 2Ov implements 2S0 {
    public Hgi A00;
    public FHC A01;
    public H0U A02;
    public LithoView A03;

    public Dialog A0n(Bundle bundle) {
        H0U h0u = new H0U(this);
        this.A02 = h0u;
        h0u.setOnKeyListener(new IGb(this, 2));
        6QF.A00(this.A02);
        Window window = this.A02.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        A0j(false);
        return this.A02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean Bkd() {
        DKS dks = new DKS(getContext());
        dks.A0C(false);
        dks.A06(2131964135);
        dks.A05(2131964115);
        dks.A0E(IGS.A00(this, 44), 2131964133);
        dks.A0D(IGS.A00(this, 43), 2131964126);
        dks.A04();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onActivityCreated(Bundle bundle) {
        int i;
        int A02 = 0FI.A02(-1683515332);
        super.onActivityCreated(bundle);
        H0U h0u = this.A02;
        if (h0u != null) {
            h0u.setOnDismissListener(new IGZ(this, 21));
        }
        if (this.A02 == null || this.A00 == null || this.A01 == null) {
            i = -573280171;
        } else {
            1Iw A0P = AbI.A0P(this);
            LithoView lithoView = (LithoView) 7zL.A0F(this, 2131366890);
            this.A03 = lithoView;
            QEg qEg = new QEg(A0P, new QLN(), this.A00.A00);
            FHC fhc = this.A01;
            QLN qln = qEg.A01;
            qln.A04 = fhc;
            BitSet bitSet = qEg.A02;
            bitSet.set(1);
            qln.A03 = this.A00;
            bitSet.set(2);
            qln.A02 = this.A02;
            bitSet.set(0);
            C1rs.A03(bitSet, qEg.A03);
            qEg.A0J();
            lithoView.A0x(qln);
            i = 2120668170;
        }
        0FI.A08(i, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-1987820536);
        super.onCreate(bundle);
        A0g(2, 2132608364);
        setRetainInstance(true);
        A0j(false);
        0FI.A08(-1802150763, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-967842623);
        View inflate = layoutInflater.inflate(2132543242, viewGroup);
        0FI.A08(-670244269, A02);
        return inflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroyView() {
        int A02 = 0FI.A02(-1997756005);
        if (((0D2) this).A01 != null) {
            0AW.A03(this);
            if (this.mRetainInstance) {
                ((0D2) this).A01.setDismissMessage(null);
            }
        }
        super.onDestroyView();
        FragmentActivity activity = getActivity();
        if (activity != null && (activity instanceof RemixSurveyDialogActivity)) {
            activity.finish();
        }
        0FI.A08(-225260287, A02);
    }
}
