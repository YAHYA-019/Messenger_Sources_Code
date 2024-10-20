package com.facebook.messaging.montage.composer.magicmod.fragment;

import X.0FI;
import X.0Q8;
import X.11T;
import X.1Br;
import X.1Bu;
import X.2Ov;
import X.7zL;
import X.7zO;
import X.7zU;
import X.7zV;
import X.8D2;
import X.8L9;
import X.9VJ;
import X.9hL;
import X.AJe;
import X.AQT;
import X.AQd;
import X.C00g;
import X.C01g;
import X.C01i;
import X.C03i;
import X.C0ty;
import X.C8uG;
import X.C9a6;
import X.HAq;
import X.IFl;
import X.IWN;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.litho.LithoView;

/* loaded from: MontageMagicModRestyleFragment.class */
public final class MontageMagicModRestyleFragment extends 2Ov implements C00g {
    public LithoView A00;
    public IWN A01;
    public 8L9 A02;
    public C8uG A03;
    public final 1Br A04;
    public final C01i A05;
    public final C01i A06;

    public MontageMagicModRestyleFragment() {
        C03i c03i = C03i.A02;
        this.A05 = C01g.A00(c03i, AQT.A00(this, 26));
        AQT A00 = AQT.A00(this, 31);
        C01i A002 = C01g.A00(c03i, AQT.A00(AQT.A00(this, 27), 28));
        this.A06 = 7zU.A0F(AQT.A00(A002, 29), A00, new AQd(null, A002, 40), 7zL.A18(8D2.class));
        this.A04 = 1Bu.A02(this, 16980);
    }

    public Dialog A0n(Bundle bundle) {
        A0g(1, 2132608339);
        return super.A0n(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-1303876678);
        Context requireContext = requireContext();
        FrameLayout frameLayout = new FrameLayout(requireContext);
        LithoView A0F = 7zV.A0F(requireContext, frameLayout);
        this.A00 = A0F;
        frameLayout.addView(A0F);
        0FI.A08(1318631166, A02);
        return frameLayout;
    }

    public void onDestroyView() {
        int A02 = 0FI.A02(-1276970366);
        super.onDestroyView();
        this.A00 = null;
        C8uG c8uG = this.A03;
        if (c8uG == null) {
            11T.A0L("viewDataBridge");
            throw 0Q8.createAndThrow();
        }
        8D2 r0 = c8uG.A01;
        ((9hL) 1Br.A0B(r0.A06)).A01();
        if (((C9a6) 1Br.A0B(r0.A07)).A05.getValue() == null) {
            ((9VJ) 1Br.A0B(r0.A03)).A02.Cvx(C0ty.A00);
        }
        IWN iwn = this.A01;
        if (iwn != null) {
            IFl Aw6 = iwn.Aw6();
            HAq hAq = HAq.A0G;
            if (Aw6.A0M != hAq) {
                IFl.A0B(Aw6, hAq);
            }
        }
        0FI.A08(-992230204, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        this.A03 = new C8uG(this.A01, (8D2) this.A06.getValue(), 7zU.A0t(this, 14));
        AJe.A03(this, 7zO.A0J(this), 33);
    }
}
