package com.facebook.ui.legacynavbar;

import X.0NA;
import X.11T;
import X.1Bq;
import X.1Br;
import X.1tJ;
import X.2MR;
import X.2Me;
import X.2rX;
import X.4YU;
import X.7zL;
import X.7zM;
import X.AbG;
import X.C00j;
import X.C09s;
import X.C0Ad;
import X.C2cd;
import X.C2rY;
import X.DKD;
import X.DKF;
import X.DKG;
import X.ErO;
import X.Evd;
import X.FGQ;
import X.FXA;
import X.FYD;
import X.Fe5;
import X.G0z;
import X.GGc;
import X.GL6;
import X.R3a;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.fbui.widget.glyph.GlyphView;
import com.facebook.widget.CustomLinearLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: LegacyNavigationBar.class */
public class LegacyNavigationBar extends CustomLinearLayout implements GL6, CallerContextable {
    public static final CallerContext A0M = CallerContext.A06(LegacyNavigationBar.class);
    public int A00;
    public int A01;
    public View A02;
    public GlyphView A03;
    public Evd A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public FrameLayout A08;
    public Evd A09;
    public Evd A0A;
    public final View.OnTouchListener A0B;
    public final ViewGroup A0C;
    public final LinearLayout A0D;
    public final LinearLayout A0E;
    public final TextView A0F;
    public final 1Br A0G;
    public final 1Br A0H;
    public final 1Br A0I;
    public final 1Br A0J;
    public final 1Br A0K;
    public final FXA A0L;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LegacyNavigationBar(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LegacyNavigationBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyNavigationBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View decorView;
        11T.A0F(context, 1);
        this.A0J = 1Bq.A00(67518);
        this.A0H = 1Bq.A00(66368);
        this.A0K = 1Bq.A00(67352);
        this.A0I = 1Bq.A00(66388);
        this.A0G = 7zM.A0N();
        this.A0B = FYD.A00;
        Context context2 = getContext();
        this.A0L = new FXA(context2.getResources());
        1Br.A0C(this.A0H);
        setTag(2131362030, CallerContext.A0A(getClass(), "titlebar", "titlebar"));
        LayoutInflater.from(context).inflate(2132543504, this);
        this.A04 = new Evd(this, 2132543505, 2132543507, 2132543508);
        this.A0A = new Evd(this, 2132543510, 2132543511, 0);
        this.A09 = new Evd(this, 2132543505, 2132543507, 2132543506);
        ViewGroup viewGroup = (ViewGroup) C09s.A01(this, 2131363510);
        this.A0C = viewGroup;
        viewGroup.setMinimumHeight(R3a.A00(context));
        this.A0D = (LinearLayout) C09s.A01(this, 2131361880);
        this.A0E = (LinearLayout) C09s.A01(this, 2131365198);
        TextView A09 = AbG.A09(this, 2131368067);
        this.A0F = A09;
        this.A03 = (GlyphView) C09s.A01(this, 2131365930);
        this.A08 = (FrameLayout) C09s.A01(this, 2131364616);
        C0Ad.A0H(A09, true);
        GlyphView glyphView = this.A03;
        if (glyphView != null) {
            C2cd.A03(glyphView, 2);
        }
        GlyphView glyphView2 = this.A03;
        if (glyphView2 != null) {
            glyphView2.setVisibility(0);
            if (glyphView2.getForeground() != null) {
                Drawable foreground = glyphView2.getForeground();
                if (foreground != null) {
                    foreground.setAlpha(0);
                }
                glyphView2.setOnTouchListener(this.A0B);
            }
            glyphView2.setImageResource(0);
            glyphView2.setMinimumWidth((int) getResources().getDimension(2132279314));
        }
        A01(this, 0);
        if (A0H()) {
            FGQ.A00(this, new G0z(this));
            this.A0F.setTextColor(A0H() ? 2Me.A02.A02(context) : 0NA.A01(context, 2130972075, 0));
            C00j.A05("LegacyNavigationBar.inflateDivider", 1466661110);
            try {
                ViewStub viewStub = (ViewStub) findViewById(2131363687);
                if (viewStub != null) {
                    this.A02 = viewStub.inflate();
                }
                C00j.A01(1422786548);
            } catch (Throwable th) {
                C00j.A01(-1426145945);
                throw th;
            }
        }
        setBackgroundColor(A0H() ? 7zM.A02(context2, 2MR.A19) : context2.getColor(0NA.A03(context2, 2130972073, 2132214206)));
        if (!(context instanceof Activity) || 1tJ.A0A()) {
            Resources resources = getResources();
            11T.A0A(resources);
            this.A01 = 1tJ.A00(resources);
            this.A05 = true;
            return;
        }
        Window window = ((Activity) context).getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        FGQ.A01(decorView, new Fe5(this, 2));
    }

    public /* synthetic */ LegacyNavigationBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }

    private final void A00(View.OnClickListener onClickListener) {
        GlyphView glyphView = this.A03;
        if (glyphView != null) {
            glyphView.setMinimumWidth((int) getResources().getDimension(2132279359));
            C2cd.A03(glyphView, 1);
            glyphView.setOnClickListener(onClickListener);
            if (glyphView.getForeground() != null) {
                glyphView.setOnTouchListener(this.A0B);
                glyphView.getForeground().setAlpha(0);
            } else {
                glyphView.setBackgroundResource(2132411581);
            }
            glyphView.setVisibility(0);
        }
        if (A0H()) {
            Context A08 = 4YU.A08(this);
            int A02 = A0H() ? 2Me.A02.A02(A08) : 0NA.A01(A08, 2130972075, 0);
            if (glyphView != null) {
                glyphView.A00(A02);
            }
        }
    }

    public static void A01(LegacyNavigationBar legacyNavigationBar, int i) {
        if (legacyNavigationBar.A00 != i) {
            ViewGroup viewGroup = legacyNavigationBar.A0C;
            viewGroup.setVisibility(8);
            TextView textView = legacyNavigationBar.A0F;
            textView.setVisibility(8);
            if (i == 0) {
                textView.setVisibility(0);
            } else if (i == 2) {
                viewGroup.setVisibility(0);
            }
            legacyNavigationBar.A00 = i;
        }
    }

    public void A0E() {
        LayoutInflater A0A = DKD.A0A(this);
        ViewGroup viewGroup = this.A0C;
        View inflate = A0A.inflate(2132542137, viewGroup, false);
        viewGroup.removeAllViews();
        if (inflate == null) {
            A01(this, 0);
        } else {
            A01(this, 2);
            viewGroup.addView(inflate);
        }
        11T.A0D(inflate);
    }

    public final void A0F() {
        ViewGroup.LayoutParams layoutParams = this.A0F.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
    }

    public final void A0G() {
        GlyphView glyphView = this.A03;
        if (glyphView != null) {
            glyphView.setImageDrawable(((2rX) 1Br.A0B(this.A0J)).A00(2132345177));
        }
    }

    public final boolean A0H() {
        if (this.A07) {
            return false;
        }
        1Br.A0C(this.A0K);
        return true;
    }

    @Override // X.GL6
    public void Cm8(View.OnClickListener onClickListener) {
        Drawable A00;
        GlyphView glyphView = this.A03;
        if (glyphView != null) {
            A00(onClickListener);
            if (1Br.A07(this.A0G).AZk(72339270883410328L)) {
                Context context = getContext();
                1Br.A0C(this.A0J);
                int i = 2132345256;
                if (C2rY.A00(7zL.A09())) {
                    i = 2132345263;
                }
                A00 = context.getDrawable(i);
            } else {
                A00 = ((2rX) 1Br.A0B(this.A0J)).A00(2132345177);
            }
            glyphView.setImageDrawable(A00);
            glyphView.setMinimumWidth((int) getResources().getDimension(2132279303));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0046  */
    @Override // X.GL6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void CmO(java.util.List r302) {
        /*
            r301 = this;
            r0 = 0
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r302
            if (r0 == 0) goto La6
            r0 = r302
            int r0 = r0.size()
            r305 = r0
            r0 = r305
            r1 = r304
            if (r0 <= r1) goto L82
            r0 = r302
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.facebook.widget.titlebar.TitleBarButtonSpec r0 = (com.facebook.widget.titlebar.TitleBarButtonSpec) r0
            r303 = r0
            r0 = r302
            r1 = r304
            java.lang.Object r0 = r0.get(r1)
            com.facebook.widget.titlebar.TitleBarButtonSpec r0 = (com.facebook.widget.titlebar.TitleBarButtonSpec) r0
            r306 = r0
            r0 = 2
            r305 = r0
            r0 = r302
            r1 = r305
            java.lang.Object r0 = X.2Ri.A0C(r0, r1)
            com.facebook.widget.titlebar.TitleBarButtonSpec r0 = (com.facebook.widget.titlebar.TitleBarButtonSpec) r0
            r307 = r0
        L3b:
            r0 = r301
            X.Evd r0 = r0.A04
            r308 = r0
            r0 = r308
            if (r0 == 0) goto L4d
            r0 = r308
            r1 = r303
            r2 = 0
            r0.A00(r1, r2)
        L4d:
            r0 = r301
            X.Evd r0 = r0.A0A
            r308 = r0
            r0 = r308
            if (r0 == 0) goto L60
            r0 = r308
            r1 = r306
            r2 = 0
            r0.A00(r1, r2)
        L60:
            r0 = r301
            X.Evd r0 = r0.A09
            r308 = r0
            r0 = r308
            if (r0 == 0) goto L73
            r0 = r308
            r1 = r307
            r2 = r304
            r0.A00(r1, r2)
        L73:
            r0 = r301
            android.widget.LinearLayout r0 = r0.A0D
            r0.requestLayout()
            r0 = r301
            android.widget.LinearLayout r0 = r0.A0E
            r0.requestLayout()
            return
        L82:
            r0 = r302
            boolean r0 = X.1BK.A1Y(r0)
            r305 = r0
            r0 = r305
            r1 = r304
            if (r0 != r1) goto La6
            r0 = r302
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.facebook.widget.titlebar.TitleBarButtonSpec r0 = (com.facebook.widget.titlebar.TitleBarButtonSpec) r0
            r308 = r0
            r0 = 0
            r306 = r0
            r0 = r308
            r303 = r0
            r0 = 0
            r307 = r0
            goto L3b
        La6:
            r0 = 0
            r307 = r0
            r0 = 0
            r306 = r0
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ui.legacynavbar.LegacyNavigationBar.CmO(java.util.List):void");
    }

    @Override // X.GL6
    public void CpM(boolean z) {
    }

    @Override // X.GL6
    public void Crl(GGc gGc) {
    }

    @Override // X.GL6
    public void Cs3(ErO erO) {
        Evd evd = this.A04;
        if (evd != null) {
            evd.A04 = erO;
        }
        Evd evd2 = this.A0A;
        if (evd2 != null) {
            evd2.A04 = erO;
        }
    }

    @Override // X.GL6
    public void CvU(int i) {
        CvV(DKD.A0q(this, i));
    }

    public void CvV(CharSequence charSequence) {
        this.A0F.setText(charSequence);
        A01(this, 0);
    }

    @Override // X.GL6
    public void CvZ(View.OnClickListener onClickListener) {
        GlyphView glyphView = this.A03;
        if (glyphView != null) {
            A00(onClickListener);
            glyphView.setContentDescription(getResources().getString(2131967367));
            glyphView.setImageDrawable(((2rX) 1Br.A0B(this.A0J)).A00(2132345301));
        }
    }

    @Override // com.facebook.widget.CustomLinearLayout, android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, DKD.A00((A0H() ? R3a.A00(4YU.A08(this)) : getResources().getDimensionPixelSize(2132279533)) + getPaddingTop() + getPaddingBottom()));
    }
}
