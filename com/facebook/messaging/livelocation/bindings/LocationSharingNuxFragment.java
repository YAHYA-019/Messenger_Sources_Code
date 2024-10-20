package com.facebook.messaging.livelocation.bindings;

import X.0FI;
import X.1BV;
import X.1Bn;
import X.1iF;
import X.6KV;
import X.7zL;
import X.82O;
import X.AbF;
import X.AbK;
import X.AuQ;
import X.C00i;
import X.C1qo;
import X.C1rs;
import X.C1u3;
import X.C2000Ayt;
import X.IKE;
import X.RJ4;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.LithoView;
import com.facebook.messaging.fullscreendialog.FullScreenDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* loaded from: LocationSharingNuxFragment.class */
public final class LocationSharingNuxFragment extends FullScreenDialogFragment {
    public RJ4 A00;
    public 6KV A01;
    public final C00i A02 = 1BV.A00(147494);

    public 1iF A17() {
        return AbF.A0C(1645341882290020L);
    }

    @Override // com.facebook.messaging.fullscreendialog.FullScreenDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-2041075035);
        super.onCreate(bundle);
        0FI.A08(201227069, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-412184768);
        MigColorScheme A0h = AbK.A0h(this);
        Context requireContext = requireContext();
        AuQ auQ = new AuQ(7zL.A0W(requireContext), new C2000Ayt());
        C2000Ayt c2000Ayt = auQ.A01;
        c2000Ayt.A00 = 2132345625;
        BitSet bitSet = auQ.A02;
        bitSet.set(6);
        C00i c00i = this.A02;
        c00i.get();
        C1qo c1qo = auQ.A02;
        c2000Ayt.A0F = c1qo.A0D(2131958675);
        bitSet.set(15);
        c2000Ayt.A09 = c1qo.A0D(2131958669);
        bitSet.set(5);
        c00i.get();
        c2000Ayt.A08 = c1qo.A0D(2131958668);
        bitSet.set(3);
        c2000Ayt.A03 = C1u3.A3l;
        bitSet.set(4);
        c2000Ayt.A0C = c1qo.A0D(2131958672);
        bitSet.set(11);
        c2000Ayt.A0B = c1qo.A0D(2131958671);
        bitSet.set(9);
        c2000Ayt.A04 = C1u3.A6J;
        bitSet.set(10);
        c2000Ayt.A0E = c1qo.A0D(2131958674);
        bitSet.set(14);
        c00i.get();
        c2000Ayt.A0D = c1qo.A0D(2131958673);
        bitSet.set(12);
        c2000Ayt.A05 = C1u3.A5q;
        bitSet.set(13);
        c2000Ayt.A06 = A0h;
        bitSet.set(2);
        c2000Ayt.A07 = c1qo.A0D(2131958667);
        bitSet.set(0);
        c2000Ayt.A01 = new IKE(this, 46);
        bitSet.set(1);
        c2000Ayt.A0A = c1qo.A0D(2131958670);
        bitSet.set(7);
        c2000Ayt.A02 = new IKE(this, 45);
        bitSet.set(8);
        C1rs.A05(bitSet, auQ.A03, 16);
        auQ.A0J();
        LithoView A00 = LithoView.A00(requireContext, c2000Ayt);
        0FI.A08(-1941667791, A02);
        return A00;
    }

    public void onDestroyView() {
        int A02 = 0FI.A02(1961327600);
        6KV r0 = this.A01;
        if (r0 != null) {
            r0.A05(-1);
            this.A01 = null;
        }
        super.onDestroyView();
        0FI.A08(1851467455, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        6KV A00 = ((82O) 1Bn.A0A(65571)).A00(getContext());
        this.A01 = A00;
        A00.A02();
    }
}
