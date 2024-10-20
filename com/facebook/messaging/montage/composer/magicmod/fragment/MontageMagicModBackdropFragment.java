package com.facebook.messaging.montage.composer.magicmod.fragment;

import X.0FI;
import X.0Q8;
import X.0S2;
import X.0Xs;
import X.11T;
import X.1Br;
import X.1Bu;
import X.2EU;
import X.2Ov;
import X.7zL;
import X.7zO;
import X.7zU;
import X.7zV;
import X.8D1;
import X.8Lo;
import X.8uH;
import X.9VJ;
import X.9hL;
import X.AJe;
import X.AQT;
import X.AQd;
import X.AnonymousClass001;
import X.C00g;
import X.C00i;
import X.C01g;
import X.C01i;
import X.C03i;
import X.C0ty;
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

/* loaded from: MontageMagicModBackdropFragment.class */
public final class MontageMagicModBackdropFragment extends 2Ov implements C00g {
    public float A00 = 1.0f;
    public LithoView A01;
    public IWN A02;
    public 8Lo A03;
    public 8uH A04;
    public Integer A05;
    public final 1Br A06;
    public final C01i A07;
    public final C01i A08;

    public MontageMagicModBackdropFragment() {
        C03i c03i = C03i.A02;
        this.A07 = C01g.A00(c03i, AQT.A00(this, 21));
        AQT A00 = AQT.A00(this, 25);
        C01i A002 = C01g.A00(c03i, AQT.A00(AQT.A00(this, 22), 23));
        this.A08 = 7zU.A0F(AQT.A00(A002, 24), A00, new AQd(null, A002, 38), 7zL.A18(8D1.class));
        this.A06 = 1Bu.A02(this, 16980);
        this.A05 = 0S2.A00;
    }

    public Dialog A0n(Bundle bundle) {
        A0g(1, 2132608339);
        return super.A0n(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(42150532);
        Context requireContext = requireContext();
        FrameLayout frameLayout = new FrameLayout(requireContext);
        LithoView A0F = 7zV.A0F(requireContext, frameLayout);
        this.A01 = A0F;
        frameLayout.addView(A0F);
        0FI.A08(1824521280, A02);
        return frameLayout;
    }

    public void onDestroyView() {
        int A02 = 0FI.A02(988416348);
        super.onDestroyView();
        this.A01 = null;
        8uH r0 = this.A04;
        if (r0 == null) {
            11T.A0L("viewDataBridge");
            throw 0Q8.createAndThrow();
        }
        8D1 r02 = r0.A02;
        C00i c00i = r02.A04.A00;
        0Xs r03 = ((9VJ) c00i.get()).A03;
        2EU r04 = (2EU) r03.getValue();
        if (r04 != null) {
            r04.close();
        }
        r03.Cvx((Object) null);
        C00i c00i2 = r02.A08.A00;
        if (((C9a6) c00i2.get()).A05.getValue() == null) {
            ((9VJ) c00i.get()).A02.Cvx(C0ty.A00);
            ((9hL) 1Br.A0B(r02.A07)).A01();
        }
        if (((C9a6) c00i2.get()).A07.getValue() == null) {
            8Lo.A05(r02);
        }
        IWN iwn = this.A02;
        if (iwn != null) {
            IFl Aw6 = iwn.Aw6();
            HAq hAq = HAq.A0G;
            if (Aw6.A0M != hAq) {
                IFl.A0B(Aw6, hAq);
            }
        }
        0FI.A08(-1612356697, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        IWN iwn;
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        8D1 r0 = (8D1) this.A08.getValue();
        IWN iwn2 = this.A02;
        Integer num = this.A05;
        Integer num2 = 0S2.A01;
        this.A04 = new 8uH(iwn2, r0, 7zU.A0t(this, 13), AnonymousClass001.A1W(num, num2));
        AJe.A03(this, 7zO.A0J(this), 31);
        if (this.A05 != num2 || (iwn = this.A02) == null) {
            return;
        }
        iwn.BZu();
    }
}
