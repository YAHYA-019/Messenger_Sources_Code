package com.facebook.surveyplatform.remix.ui;

import X.0D2;
import X.0FI;
import X.0fH;
import X.1Iw;
import X.1LI;
import X.2Ov;
import X.2S0;
import X.6QF;
import X.7Qk;
import X.7zL;
import X.7zO;
import X.AbI;
import X.C1rs;
import X.C23P;
import X.C4s1;
import X.FHC;
import X.Hgi;
import X.IKC;
import X.IL3;
import X.Igx;
import X.JDR;
import X.QEd;
import X.QKk;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.TranslateAnimation;
import com.facebook.litho.LithoView;
import java.util.BitSet;

/* loaded from: RemixFooterFragment.class */
public class RemixFooterFragment extends 2Ov implements 2S0 {
    public int A00;
    public LithoView A01;
    public Hgi A02;
    public FHC A03;
    public 7Qk A04;
    public 1LI A05;
    public 1Iw A06;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.23P, java.lang.Object] */
    private void A05() {
        Window window = this.A04.getWindow();
        ?? obj = new Object();
        this.A05.A0d(this.A06, (C23P) obj, View.MeasureSpec.makeMeasureSpec(7zO.A0D(this).getDisplayMetrics().widthPixels, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        C4s1 c4s1 = new C4s1(getContext());
        int A03 = c4s1.A03() - c4s1.A06();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = 80;
        ((ViewGroup.LayoutParams) attributes).height = obj.A00 + A03;
        ((ViewGroup.LayoutParams) attributes).width = -1;
        window.setAttributes(attributes);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Dialog A0n(Bundle bundle) {
        7Qk r0 = new 7Qk(getContext(), this, A0l());
        this.A04 = r0;
        6QF.A00(r0);
        A0j(false);
        this.A04.getWindow().setFlags(32, 32);
        return this.A04;
    }

    public 1LI A1C(JDR jdr) {
        QEd qEd = new QEd(this.A06, new QKk(), this.A02.A00);
        1LI r0 = qEd.A01;
        ((QKk) r0).A02 = (Igx) jdr;
        BitSet bitSet = qEd.A02;
        bitSet.set(0);
        ((QKk) r0).A01 = new IKC(this, jdr, 40);
        bitSet.set(1);
        C1rs.A00(bitSet, qEd.A03);
        qEd.A0J();
        return r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onActivityCreated(Bundle bundle) {
        int i;
        int A02 = 0FI.A02(-1491412569);
        super.onActivityCreated(bundle);
        this.A06 = AbI.A0P(this);
        this.A01 = (LithoView) 7zL.A0F(this, 2131366887);
        FHC fhc = this.A03;
        if (fhc == null) {
            i = 1492124933;
        } else {
            JDR jdr = fhc.A04;
            if (jdr instanceof Igx) {
                1LI A1C = A1C(jdr);
                this.A05 = A1C;
                this.A01.A0x(A1C);
                A05();
                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, 7zO.A0I(getContext()).heightPixels);
                translateAnimation.setDuration(500L);
                translateAnimation.setStartOffset(this.A00);
                translateAnimation.setInterpolator(new AccelerateInterpolator());
                translateAnimation.setFillAfter(true);
                IL3.A00(translateAnimation, this, 5);
                this.A01.startAnimation(translateAnimation);
            } else {
                0fH.A18("Survey Remix: ", "%s: Wrong type of Page received. Expecting Intro/Outro. Please Fix", new Object[]{"RemixFooterFragment"});
                this.A04.dismiss();
            }
            i = 1426973417;
        }
        0FI.A08(i, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onConfigurationChanged(Configuration configuration) {
        super/*androidx.fragment.app.Fragment*/.onConfigurationChanged(configuration);
        A05();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(726481364);
        super.onCreate(bundle);
        A0g(2, 2132608364);
        setRetainInstance(true);
        A0j(false);
        ((0D2) this).A07 = true;
        0FI.A08(-925014659, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-1507130149);
        Context context = this.A04.getContext();
        while (true) {
            Context context2 = context;
            if (!(context2 instanceof ContextWrapper)) {
                View inflate = layoutInflater.inflate(2132543241, viewGroup);
                0FI.A08(1306096602, A02);
                return inflate;
            }
            context = ((ContextWrapper) context2).getBaseContext();
        }
    }

    public void onDestroyView() {
        int A02 = 0FI.A02(835286059);
        super.onDestroyView();
        this.A01 = null;
        0FI.A08(322865837, A02);
    }
}
