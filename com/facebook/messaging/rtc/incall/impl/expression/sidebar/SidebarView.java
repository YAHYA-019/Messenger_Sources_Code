package com.facebook.messaging.rtc.incall.impl.expression.sidebar;

import X.0FI;
import X.0Q8;
import X.0S2;
import X.11T;
import X.1Br;
import X.1Bu;
import X.1Lm;
import X.5Ww;
import X.7zM;
import X.AbF;
import X.AbI;
import X.C00i;
import X.C01g;
import X.C01i;
import X.C1u2;
import X.C1u3;
import X.DKF;
import X.DKG;
import X.GSc;
import X.GrD;
import X.Hq8;
import X.IAT;
import X.IKB;
import X.IKC;
import X.J9I;
import X.J9s;
import X.JPQ;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.resources.ui.FbProgressBar;
import com.facebook.widget.CustomLinearLayout;
import com.facebook.widget.FbImageView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: SidebarView.class */
public final class SidebarView extends CustomLinearLayout implements JPQ {
    public View A00;
    public View A01;
    public GSc A02;
    public SidebarButton A03;
    public SidebarButton A04;
    public SidebarButton A05;
    public SidebarButton A06;
    public SidebarButton A07;
    public SidebarButton A08;
    public FbProgressBar A09;
    public FbImageView A0A;
    public FbImageView A0B;
    public FbImageView A0C;
    public boolean A0D;
    public final Context A0E;
    public final CallerContext A0F;
    public final C00i A0G;
    public final 1Br A0H;
    public final 1Br A0I;
    public final 1Br A0J;
    public final 1Br A0K;
    public final C01i A0L;
    public final C01i A0M;
    public final C01i A0N;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SidebarView(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SidebarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SidebarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A0E = context;
        this.A0N = J9s.A01(this, 45);
        this.A0J = 7zM.A0U();
        this.A0G = 1Bu.A01(context, 16979);
        this.A0F = CallerContext.A0B("SidebarView");
        this.A0L = C01g.A01(J9I.A00);
        this.A0H = 1Bu.A01(context, 114932);
        this.A0K = 7zM.A0e(context);
        this.A0M = J9s.A01(this, 44);
        this.A0I = 7zM.A0d();
    }

    public /* synthetic */ SidebarView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }

    private final SidebarButton A00(C1u3 c1u3, GrD grD, Integer num, int i) {
        C00i c00i = this.A0G;
        int BKg = AbF.A0p(c00i).BKg();
        C00i c00i2 = this.A0J.A00;
        Drawable A08 = ((C1u2) c00i2.get()).A08(c1u3, BKg);
        11T.A0D(A08);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{getContext().getDrawable(2132411622), ((C1u2) c00i2.get()).A08(c1u3, AbF.A0p(c00i).AZN())});
        SidebarButton sidebarButton = (SidebarButton) DKG.A0B(this, i);
        11T.A0F(grD, 3);
        sidebarButton.A03 = A08;
        sidebarButton.A01 = layerDrawable;
        sidebarButton.A09 = num;
        sidebarButton.A06 = grD;
        if (num == 0S2.A01) {
            sidebarButton.A0D.setBackgroundResource(2132411622);
        }
        IKC.A00(sidebarButton, num, grD, 35);
        return sidebarButton;
    }

    public static final void A01(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
            return;
        }
        marginLayoutParams.setMargins(i2, i, i2, i);
        view.setLayoutParams(marginLayoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:175:0x06c1, code lost:
    
        if (r0 == null) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void CfQ(X.JDB r302) {
        /*
            Method dump skipped, instructions count: 2506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.rtc.incall.impl.expression.sidebar.SidebarView.CfQ(X.JDB):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(546806691);
        super.onAttachedToWindow();
        Object parent = getParent();
        11T.A0I(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        this.A0C = (FbImageView) DKG.A0B((View) parent, 2131367391);
        AbI.A1S(this, this.A0N);
        0FI.A0C(1043539553, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(-834591915);
        AbI.A1X(this.A0N);
        if (this.A0D) {
            ((Hq8) this.A0L.getValue()).A00();
        }
        super.onDetachedFromWindow();
        0FI.A0C(-1898975723, A06);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        String str;
        int A06 = 0FI.A06(-1530584193);
        super.onFinishInflate();
        C1u3 c1u3 = 5Ww.A00().migIconName;
        Integer num = 0S2.A00;
        C01i c01i = this.A0N;
        this.A04 = A00(c1u3, (GrD) c01i.getValue(), num, 2131362307);
        Integer num2 = 0S2.A01;
        GrD grD = (GrD) c01i.getValue();
        SidebarButton sidebarButton = (SidebarButton) DKG.A0B(this, 2131362327);
        11T.A0F(grD, 3);
        sidebarButton.A03 = null;
        sidebarButton.A01 = null;
        sidebarButton.A09 = num2;
        sidebarButton.A06 = grD;
        sidebarButton.A0D.setBackgroundResource(2132411622);
        IKC.A00(sidebarButton, num2, grD, 35);
        this.A05 = sidebarButton;
        View requireViewById = requireViewById(2131362308);
        11T.A0A(requireViewById);
        this.A00 = requireViewById;
        this.A09 = (FbProgressBar) DKG.A0B(this, 2131362329);
        Context context = this.A0E;
        Drawable gSc = new GSc(context.getColor(2132214382), context.getColor(2132214381), context.getColor(2132214380));
        this.A02 = gSc;
        FbProgressBar fbProgressBar = this.A09;
        if (fbProgressBar != null) {
            fbProgressBar.setProgressDrawable(gSc);
            View requireViewById2 = requireViewById(2131362328);
            11T.A0A(requireViewById2);
            this.A01 = requireViewById2;
            this.A06 = A00(C1u3.A2m, (GrD) c01i.getValue(), 0S2.A0C, 2131363831);
            this.A03 = A00(C1u3.A4z, (GrD) c01i.getValue(), 0S2.A0N, 2131362306);
            this.A07 = A00(C1u3.A15, (GrD) c01i.getValue(), 0S2.A0Y, 2131364118);
            this.A08 = A00(C1u3.A4C, (GrD) c01i.getValue(), 0S2.A0j, 2131368182);
            if (((IAT) 1Lm.A05(context, 1Br.A03(this.A0K), 100044)).A02(1Br.A00(this.A0I))) {
                this.A0A = (FbImageView) requireViewById(2131362036);
                FbImageView fbImageView = (FbImageView) DKG.A0B(this, 2131362037);
                this.A0B = fbImageView;
                str = "animatedAvatarCircleBackground";
                if (fbImageView != null) {
                    fbImageView.setBackgroundResource(2132411622);
                    FbImageView fbImageView2 = this.A0A;
                    if (fbImageView2 != null) {
                        fbImageView2.setBackgroundResource(2132411588);
                    }
                    FbImageView fbImageView3 = this.A0A;
                    if (fbImageView3 != null) {
                        fbImageView3.setClipToOutline(true);
                    }
                    FbImageView fbImageView4 = this.A0A;
                    if (fbImageView4 != null) {
                        fbImageView4.setVisibility(4);
                    }
                    FbImageView fbImageView5 = this.A0B;
                    if (fbImageView5 != null) {
                        fbImageView5.setVisibility(4);
                        FbImageView fbImageView6 = this.A0A;
                        if (fbImageView6 != null) {
                            IKB.A00(fbImageView6, this, 9);
                        }
                    }
                }
            }
            0FI.A0C(-1637831489, A06);
            return;
        }
        str = "avatarThumbnailLoader";
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
