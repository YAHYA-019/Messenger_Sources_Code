package com.facebook.rtc.views.self;

import X.0FI;
import X.11T;
import X.2QO;
import X.2Qa;
import X.2Qn;
import X.2Wo;
import X.3Fu;
import X.7zL;
import X.7zP;
import X.AbK;
import X.C00i;
import X.C09s;
import X.C15h;
import X.C1u3;
import X.C1u4;
import X.CH4;
import X.DKC;
import X.GOn;
import X.GOp;
import X.GOq;
import X.Gq8;
import X.Gyu;
import X.HBB;
import X.Ht3;
import X.IP4;
import X.IYv;
import X.ItM;
import X.J5t;
import X.JJm;
import X.JOM;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.resources.ui.FbFrameLayout;

/* loaded from: SelfOverlayContentView.class */
public class SelfOverlayContentView extends FrameLayout implements JJm {
    public int A00;
    public View A01;
    public FbFrameLayout A02;
    public 2Wo A03;
    public 2Wo A04;
    public boolean A05;
    public final 2Wo A06;
    public final 2Wo A07;
    public final C15h A08;
    public final C15h A09;
    public final int A0A;
    public final C00i A0B;
    public final Ht3 A0C;
    public final 2Qn A0D;
    public final 3Fu A0E;
    public final Runnable A0F;
    public final C15h A0G;
    public final C15h A0H;

    public SelfOverlayContentView(Context context) {
        this(context, null);
    }

    public SelfOverlayContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = 0;
        this.A0F = new ItM(this);
        this.A0E = Gyu.A00(this, 33);
        this.A0C = new Gq8(this, 18);
        this.A0D = IYv.A00(this, 42);
        this.A09 = new J5t(context, this, 9);
        this.A0G = new J5t(context, this, 10);
        this.A0B = 7zL.A0R(context, 85039);
        this.A08 = new J5t(context, this, 11);
        this.A0H = new J5t(context, this, 12);
        LayoutInflater.from(context).inflate(2132543562, this);
        this.A04 = AbK.A0v(this, 2131367280);
        this.A02 = (FbFrameLayout) C09s.A01(this, 2131367282);
        this.A07 = AbK.A0v(this, 2131368364);
        this.A06 = AbK.A0v(this, 2131363573);
        this.A03 = AbK.A0v(this, 2131365048);
        this.A0A = GOn.A07(getResources(), 2132279311);
    }

    public static void A00(SelfOverlayContentView selfOverlayContentView) {
        View A01;
        int i;
        if (selfOverlayContentView.A00 == 0 || !((2QO) selfOverlayContentView.A09.get()).A0W || ((GOq.A1a(selfOverlayContentView.A0H) && GOp.A0c(selfOverlayContentView.A08).A02 == 0) || selfOverlayContentView.A01 == null)) {
            2Wo r0 = selfOverlayContentView.A04;
            if (r0.A00 == null) {
                return;
            }
            A01 = r0.A01();
            i = 8;
        } else {
            2Wo r02 = selfOverlayContentView.A04;
            if (r02.A00 == null) {
                r02.A01();
                ImageView imageView = (ImageView) r02.A01();
                CH4 ch4 = (CH4) selfOverlayContentView.A0B.get();
                Resources resources = selfOverlayContentView.getResources();
                11T.A0F(resources, 0);
                imageView.setImageDrawable(7zP.A0S(ch4.A02).A09(C1u3.A4Q, C1u4.SIZE_28, resources.getColor(2132213766, null)));
            }
            A01 = r02.A01();
            i = 0;
        }
        A01.setVisibility(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0138, code lost:
    
        if (r301.A04() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A01(com.facebook.rtc.views.self.SelfOverlayContentView r301, int r302, int r303) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rtc.views.self.SelfOverlayContentView.A01(com.facebook.rtc.views.self.SelfOverlayContentView, int, int):void");
    }

    public static void A02(SelfOverlayContentView selfOverlayContentView, int i, int i2) {
        FrameLayout.LayoutParams layoutParams;
        2Wo r0 = selfOverlayContentView.A04;
        if (r0.A00 == null || (layoutParams = (FrameLayout.LayoutParams) r0.A01().getLayoutParams()) == null || layoutParams.gravity == 17) {
            return;
        }
        Resources resources = selfOverlayContentView.getResources();
        int A04 = DKC.A04(resources);
        float dimensionPixelSize = selfOverlayContentView.A04() ? resources.getDimensionPixelSize(2132279310) : Math.min((int) (Math.min(i, i2) * 0.33d), selfOverlayContentView.A0A);
        C15h c15h = selfOverlayContentView.A08;
        if (((JOM) c15h.get()).BVz()) {
            dimensionPixelSize /= GOp.A0c(c15h).A00;
        }
        int i3 = (int) dimensionPixelSize;
        float f = A04;
        if (((JOM) c15h.get()).BVz()) {
            f /= GOp.A0c(c15h).A00;
        }
        int i4 = (int) f;
        ((ViewGroup.LayoutParams) layoutParams).width = i3;
        ((ViewGroup.LayoutParams) layoutParams).height = i3;
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i4;
        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i4;
        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i4;
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i4;
        r0.A01().requestLayout();
    }

    private void A03(String str, float f) {
        Runnable runnable = this.A0F;
        removeCallbacks(runnable);
        2Wo r0 = this.A03;
        if (r0.A00 == null) {
            r0.A01();
            A01(this, getWidth(), getHeight());
        }
        this.A05 = true;
        TextView textView = (TextView) r0.A01();
        textView.setVisibility(0);
        textView.setText(str);
        textView.animate().alpha(1.0f);
        if (f > 0.0f) {
            postDelayed(runnable, f * 1000.0f);
        }
    }

    private boolean A04() {
        C15h c15h = this.A08;
        if (!((JOM) c15h.get()).BVz()) {
            return false;
        }
        int i = GOp.A0c(c15h).A02;
        float f = GOp.A0c(c15h).A00;
        return i == 0 ? f > 1.0f : i == 1 && f > 1.75f;
    }

    @Override // X.JJm
    public void BO6() {
        this.A05 = false;
        2Wo r0 = this.A03;
        if (r0.A00 != null) {
            TextView textView = (TextView) r0.A01();
            textView.clearAnimation();
            textView.setVisibility(8);
            DKC.A1Q(textView);
        }
    }

    @Override // X.JJm
    public void CwZ(HBB hbb, String str) {
        if (hbb != HBB.A06 || str == null) {
            return;
        }
        A03(str, 3.0f);
    }

    @Override // X.JJm
    public void D04(String str, boolean z) {
        if (z) {
            return;
        }
        A03(str, 0.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(-1394043767);
        super.onAttachedToWindow();
        ((IP4) this.A0G.get()).A02(this);
        ((2QO) this.A09.get()).A7G(this.A0E);
        ((JOM) this.A08.get()).A62(this.A0C);
        ((2Qa) this.A0H.get()).A02(this.A0D);
        A00(this);
        0FI.A0C(555426787, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(23779174);
        BO6();
        removeCallbacks(this.A0F);
        ((JOM) this.A08.get()).CeX(this.A0C);
        ((IP4) this.A0G.get()).A03(this);
        ((2QO) this.A09.get()).Cf7(this.A0E);
        ((2Qa) this.A0H.get()).A03(this.A0D);
        super.onDetachedFromWindow();
        0FI.A0C(1938560667, A06);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = 0FI.A06(-1030476035);
        super.onSizeChanged(i, i2, i3, i4);
        A02(this, i, i2);
        if (this.A03.A00 != null) {
            BO6();
            A01(this, i, i2);
        }
        0FI.A0C(-1774868804, A06);
    }
}
