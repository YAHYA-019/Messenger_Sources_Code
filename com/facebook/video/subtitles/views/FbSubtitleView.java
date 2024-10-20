package com.facebook.video.subtitles.views;

import X.0FI;
import X.11T;
import X.1BK;
import X.1Bi;
import X.1Br;
import X.1Gh;
import X.4YT;
import X.4YU;
import X.4qV;
import X.5Kt;
import X.7zM;
import X.7zO;
import X.AbG;
import X.AbH;
import X.AnonymousClass001;
import X.C00i;
import X.C6df;
import X.C6dh;
import X.C6dj;
import X.DKC;
import X.DKF;
import X.DKG;
import X.HOD;
import X.HcR;
import X.Hf7;
import X.Hgo;
import X.HjA;
import X.I2p;
import X.Ihu;
import X.IuW;
import X.IuX;
import X.IuY;
import X.IuZ;
import X.Iua;
import X.Iub;
import X.Iz9;
import X.RHJ;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.accessibility.CaptioningManager;
import android.widget.TextView;
import com.facebook.widget.CustomLinearLayout;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: FbSubtitleView.class */
public final class FbSubtitleView extends CustomLinearLayout {
    public int A00;
    public long A01;
    public I2p A02;
    public C6df A03;
    public HjA A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public C6dh A09;
    public Runnable A0A;
    public final TextView A0B;
    public final TextView A0C;
    public final C00i A0D;
    public final 4qV A0E;
    public final Runnable A0F;
    public final AtomicBoolean A0G;
    public final Hf7 A0H;
    public final Ihu A0I;
    public final Runnable A0J;
    public final Runnable A0K;
    public final Runnable A0L;
    public final Runnable A0M;
    public final Runnable A0N;
    public final List A0O;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FbSubtitleView(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FbSubtitleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FbSubtitleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        11T.A0F(context, 1);
        this.A0I = new Ihu(this);
        this.A0N = new Iub(this);
        this.A0J = new Iua(this);
        this.A0G = 7zO.A15();
        this.A0O = AnonymousClass001.A0s();
        A0D(2132543410);
        this.A0D = 7zM.A0Q();
        this.A0H = (Hf7) 1Bi.A03(116327);
        this.A0E = (4qV) 1Bi.A03(115835);
        this.A0C = AbG.A09(this, 2131367734);
        this.A0B = AbG.A09(this, 2131363973);
        this.A0F = new IuW(this);
        this.A06 = true;
        this.A0L = new IuX(this);
        this.A0M = new IuY(this);
        this.A0K = new IuZ(this);
    }

    public /* synthetic */ FbSubtitleView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }

    public static final void A00(FbSubtitleView fbSubtitleView, String str) {
        TextView textView;
        C6dh c6dh = fbSubtitleView.A09;
        if (c6dh == null || !c6dh.A00.A0A) {
            if (str == null || str.length() == 0) {
                textView = fbSubtitleView.A0C;
                DKC.A1Q(textView);
                textView.setVisibility(4);
            } else {
                textView = fbSubtitleView.A0C;
                textView.setText(str);
                textView.setVisibility(0);
            }
            if (!fbSubtitleView.A08 && textView.getVisibility() == 0) {
                fbSubtitleView.A08 = true;
            }
            if (str != null) {
                fbSubtitleView.A0O.add(str);
            }
        }
    }

    public final void A0E() {
        A0H();
        A00(this, null);
        this.A07 = false;
        this.A04 = null;
        if (this.A0A != null) {
            AbG.A0B(this.A0D).CeL(this.A0A);
        }
        C00i c00i = this.A0D;
        AbG.A0B(c00i).CeL(this.A0F);
        AbG.A0B(c00i).CeL(this.A0N);
        AbG.A0B(c00i).CeL(this.A0L);
        this.A0A = null;
        this.A03 = null;
    }

    public final void A0F() {
        I2p i2p;
        if (!this.A07 || (i2p = this.A02) == null) {
            return;
        }
        i2p.A08 = true;
    }

    public final void A0G() {
        I2p i2p;
        if (!this.A07 || (i2p = this.A02) == null) {
            throw 1BK.A0g();
        }
        C6dh c6dh = this.A09;
        if (c6dh == null || c6dh.A00.A0A) {
            return;
        }
        if (i2p.A05 == null) {
            i2p.A09 = true;
        } else {
            I2p.A00(i2p);
        }
    }

    public final void A0H() {
        I2p i2p;
        if (!this.A07 || (i2p = this.A02) == null) {
            return;
        }
        i2p.A01();
    }

    /* JADX WARN: Type inference failed for: r0v121, types: [X.HjA, java.lang.Object] */
    public final void A0I(C6dh c6dh, C6df c6df, C6dj c6dj, Hgo hgo, HjA hjA) {
        11T.A0F(c6dj, 4);
        this.A03 = c6df;
        this.A09 = c6dh;
        I2p i2p = this.A02;
        if (i2p != null) {
            i2p.A01();
        }
        Hf7 hf7 = this.A0H;
        I2p i2p2 = new I2p((1Gh) 1Br.A0B(hf7.A00), (5Kt) 1Br.A0B(hf7.A02), new RHJ(1Br.A07(hf7.A01).AZk(36316662907480479L)));
        this.A02 = i2p2;
        Ihu ihu = this.A0I;
        boolean z = false;
        11T.A0F(ihu, 0);
        i2p2.A03 = ihu;
        I2p i2p3 = this.A02;
        if (i2p3 != null) {
            i2p3.A06 = ihu;
            i2p3.A05 = hgo;
            if (hgo != null && i2p3.A09) {
                i2p3.A09 = false;
                I2p.A00(i2p3);
            }
        }
        I2p i2p4 = this.A02;
        if (i2p4 != null) {
            i2p4.A04 = c6dj;
        }
        A00(this, null);
        this.A07 = true;
        this.A0G.set(false);
        this.A04 = hjA;
        if (hjA != null) {
            this.A06 = false;
        }
        if (4qV.A00(this.A0E).AZk(36311723713629514L)) {
            TextView textView = this.A0C;
            if (textView == null) {
                throw 1BK.A0h();
            }
            Context A08 = 4YU.A08(textView);
            CaptioningManager captioningManager = HOD.A00;
            if (captioningManager == null) {
                Object systemService = A08.getApplicationContext().getSystemService(4YT.A00(274));
                11T.A0I(systemService, "null cannot be cast to non-null type android.view.accessibility.CaptioningManager");
                captioningManager = (CaptioningManager) systemService;
                HOD.A00 = captioningManager;
            }
            if (captioningManager != null && captioningManager.isEnabled()) {
                if (HOD.A01 == null) {
                    ?? obj = new Object();
                    HOD.A01 = obj;
                    ((HjA) obj).A02 = textView.getTextSize();
                    ((HjA) obj).A01 = textView.getTextScaleX();
                    ((HjA) obj).A00 = textView.getLineSpacingExtra();
                    ((HjA) obj).A03 = textView.getTextColors().getDefaultColor();
                    ((HjA) obj).A05 = textView.getTypeface();
                    ((HjA) obj).A06 = A08.getApplicationContext().getDrawable(2132411538);
                    ((HjA) obj).A04 = textView.getTextAlignment();
                }
                textView.setTextScaleX(captioningManager.getFontScale());
                CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
                11T.A0A(userStyle);
                textView.setTextColor(userStyle.foregroundColor);
                AbH.A1K(textView, userStyle.backgroundColor);
                textView.setTypeface(userStyle.getTypeface());
            } else {
                if (this.A06) {
                    return;
                }
                HjA hjA2 = this.A04;
                if (hjA2 == null) {
                    hjA2 = HOD.A01;
                    if (hjA2 == null) {
                        return;
                    }
                }
                textView.setTextSize(0, hjA2.A02);
                textView.setTextScaleX(hjA2.A01);
                textView.setLineSpacing(hjA2.A00, 1.0f);
                textView.setTextColor(hjA2.A03);
                textView.setTypeface(hjA2.A05);
                textView.setTextAlignment(hjA2.A04);
                Drawable drawable = hjA2.A06;
                if (drawable != null) {
                    textView.setBackground(drawable);
                }
                z = true;
            }
            this.A06 = z;
        }
    }

    public final void A0J(HcR hcR) {
        String str = this.A05;
        if (str != null && str.length() != 0 && !this.A08) {
            this.A0G.set(true);
            C00i c00i = this.A0D;
            AbG.A0B(c00i).CY3(this.A0N);
            AbG.A0B(c00i).CY2(this.A0J, this.A01);
            AbG.A0B(c00i).CY4(this.A0L, this.A01);
        }
        if (this.A0G.get()) {
            return;
        }
        this.A0A = new Iz9(hcR, this);
        AbG.A0B(this.A0D).CY3(this.A0A);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(860810029);
        this.A08 = false;
        super.onDetachedFromWindow();
        0FI.A0C(-1507137120, A06);
    }
}
