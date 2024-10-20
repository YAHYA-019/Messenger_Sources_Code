package com.facebook.messaging.neue.nux;

import X.0FI;
import X.1Iw;
import X.2cK;
import X.2cM;
import X.7zK;
import X.7zL;
import X.7zN;
import X.AbK;
import X.C1rs;
import X.C5yw;
import X.Etv;
import X.FAJ;
import X.FFh;
import X.FXr;
import X.FkI;
import X.QCq;
import X.QJf;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* loaded from: NeueNuxLearnMoreFragment.class */
public final class NeueNuxLearnMoreFragment extends NuxFragment {
    public LithoView A00;
    public Etv A01;
    public FAJ A02;
    public NeueNuxLearnMoreViewModel A03;
    public FFh A04;

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(2023057532);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            String A00 = 7zK.A00(10);
            if (bundle2.getBundle(A00) != null && this.mArguments.getBundle(A00).containsKey("LEARN_MORE_VIEW_MODEL_ARG")) {
                this.A03 = (NeueNuxLearnMoreViewModel) this.mArguments.getBundle(A00).getParcelable("LEARN_MORE_VIEW_MODEL_ARG");
            }
        }
        this.A03.getClass();
        this.A00 = new LithoView(getContext(), (AttributeSet) null);
        MigColorScheme A0h = AbK.A0h(this);
        LithoView lithoView = this.A00;
        1Iw r0 = lithoView.A09;
        2cM A01 = 2cK.A01(r0, (String) null, 0);
        C5yw A0b = 7zN.A0b(r0, false);
        A0b.A2b(A0h);
        A0b.A2a(2131962394);
        A0b.A2Y();
        A01.A2e(FkI.A00(A0b, this, 17));
        QCq qCq = new QCq(r0, new QJf());
        QJf qJf = qCq.A01;
        qJf.A02 = A0h;
        BitSet bitSet = qCq.A02;
        bitSet.set(0);
        qJf.A01 = this.A03;
        bitSet.set(1);
        qJf.A00 = FXr.A02(this, 94);
        C1rs.A00(bitSet, qCq.A03);
        qCq.A0J();
        lithoView.A0x(7zL.A0V(A01, qJf));
        LithoView lithoView2 = this.A00;
        0FI.A08(186394345, A02);
        return lithoView2;
    }
}
