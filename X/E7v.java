package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.fbui.widget.facepile.FacepileView;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;
import com.google.common.collect.ImmutableMap;

/* loaded from: E7v.class */
public final class E7v extends DZF implements CallerContextable {
    public static final CallerContext A0I = CallerContext.A08(E7v.class, "quick_promotion_interstitial");
    public static final String __redex_internal_original_name = "QuickPromotionInterstitialFragment";
    public LinearLayout A00;
    public FacepileView A01;
    public QuickPromotionDefinition.Creative A02;
    public View A03;
    public Button A04;
    public Button A05;
    public ImageButton A06;
    public TextView A07;
    public TextView A08;
    public TextView A09;
    public TextView A0A;
    public 4gJ A0B;
    public FbDraweeView A0C;
    public boolean A0D;
    public final ViewTreeObserver.OnGlobalLayoutListener A0H = new FYE(this, 7);
    public final 1Br A0F = 1Bq.A00(99643);
    public final C01i A0G = C01g.A01(new AQW(this, 31));
    public final 1Br A0E = 1Bq.A00(66368);

    public static final void A03(E7v e7v) {
        LinearLayout linearLayout = e7v.A00;
        if (linearLayout != null) {
            linearLayout.setOrientation(1);
            LinearLayout linearLayout2 = e7v.A00;
            if (linearLayout2 != null) {
                Button button = e7v.A04;
                String str = "primaryButton";
                if (button != null) {
                    linearLayout2.removeView(button);
                    LinearLayout linearLayout3 = e7v.A00;
                    if (linearLayout3 != null) {
                        Button button2 = e7v.A04;
                        if (button2 != null) {
                            linearLayout3.addView(button2, 0);
                            Button button3 = e7v.A04;
                            if (button3 != null) {
                                ViewGroup.LayoutParams layoutParams = button3.getLayoutParams();
                                String A00 = GOm.A00(2);
                                11T.A0I(layoutParams, A00);
                                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                                layoutParams2.gravity = 5;
                                Button button4 = e7v.A04;
                                if (button4 != null) {
                                    button4.setLayoutParams(layoutParams2);
                                    Button button5 = e7v.A05;
                                    str = "secondaryButton";
                                    if (button5 != null) {
                                        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) DKC.A0H(button5, A00);
                                        layoutParams3.gravity = 5;
                                        ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin = 0;
                                        Button button6 = e7v.A05;
                                        if (button6 != null) {
                                            button6.setLayoutParams(layoutParams3);
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                11T.A0L(str);
                throw 0Q8.createAndThrow();
            }
        }
        11T.A0L("buttonLayout");
        throw 0Q8.createAndThrow();
    }

    public static final boolean A09(E7v e7v) {
        String str;
        Button button = e7v.A04;
        if (button != null) {
            boolean z = true;
            if (DKD.A03(button) <= 1) {
                Button button2 = e7v.A05;
                if (button2 == null) {
                    str = "secondaryButton";
                } else if (DKD.A03(button2) <= 1) {
                    z = false;
                }
            }
            return z;
        }
        str = "primaryButton";
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        QuickPromotionDefinition.Creative creative = ((DZF) this).A02;
        if (creative == null) {
            throw 1BK.A0e();
        }
        this.A02 = creative;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0287, code lost:
    
        if (r314.length() == 0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x005d, code lost:
    
        if (r0.length() == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0370, code lost:
    
        if (r0.length() == 0) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0237, code lost:
    
        if (r307 != null) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onActivityCreated(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 1591
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E7v.onActivityCreated(android.os.Bundle):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        String str;
        int i2;
        int A02 = 0FI.A02(1771202351);
        11T.A0F(layoutInflater, 0);
        QuickPromotionDefinition.Creative creative = this.A02;
        if (creative == null) {
            str = "creative";
        } else {
            QuickPromotionDefinition.TemplateType templateType = creative.template;
            switch (templateType.ordinal()) {
                case 6:
                case 13:
                    i = 2132543186;
                    this.A0D = true;
                    break;
                case 7:
                    i = 2132543185;
                    this.A0D = false;
                    break;
                case 8:
                    i = 2132543187;
                    this.A0D = true;
                    break;
                case 14:
                    i = 2132543190;
                    this.A0D = true;
                    break;
                default:
                    i = 2132543189;
                    this.A0D = true;
                    break;
            }
            View inflate = layoutInflater.inflate(i, viewGroup, false);
            this.A04 = (Button) C09s.A01(inflate, 2131362680);
            this.A05 = (Button) C09s.A01(inflate, 2131362681);
            this.A06 = (ImageButton) C09s.A01(inflate, 2131362684);
            this.A0A = AbG.A09(inflate, 2131368067);
            this.A07 = AbG.A09(inflate, 2131363332);
            TextView A09 = AbG.A09(inflate, 2131367479);
            this.A09 = A09;
            if (A09 == null) {
                str = "socialContextTextView";
            } else {
                A09.setVisibility(8);
                FacepileView facepileView = (FacepileView) C09s.A01(inflate, 2131363984);
                this.A01 = facepileView;
                str = "facepileView";
                if (facepileView != null) {
                    facepileView.setVisibility(8);
                    LinearLayout linearLayout = (LinearLayout) C09s.A01(inflate, 2131362744);
                    this.A00 = linearLayout;
                    if (linearLayout != null) {
                        linearLayout.getViewTreeObserver().addOnGlobalLayoutListener(this.A0H);
                        if (QuickPromotionDefinition.TemplateType.A0d == templateType) {
                            this.A0C = DKC.A0M(inflate, 2131365699);
                            FacepileView facepileView2 = this.A01;
                            if (facepileView2 != null) {
                                if (!facepileView2.A0E) {
                                    facepileView2.A0E = true;
                                    facepileView2.A0O.A0E = 5SA.A00();
                                    facepileView2.requestLayout();
                                    facepileView2.invalidate();
                                }
                            }
                        } else {
                            this.A0C = DKC.A0M(inflate, 2131366774);
                        }
                        this.A0B = new C2513Gft(2);
                        if (QuickPromotionDefinition.TemplateType.A0I == templateType) {
                            View A01 = C09s.A01(inflate, 2131362889);
                            if (inflate != null) {
                                QuickPromotionDefinition.Creative creative2 = this.A02;
                                if (creative2 != null) {
                                    ImmutableMap immutableMap = creative2.templateParameters;
                                    if (immutableMap != null && immutableMap.containsKey("color_scheme")) {
                                        QuickPromotionDefinition.Creative creative3 = this.A02;
                                        if (creative3 != null) {
                                            Object obj = creative3.templateParameters.get("color_scheme");
                                            if (11T.A0O(obj, JQw.A00(37))) {
                                                Drawable background = A01.getBackground();
                                                11T.A0I(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                                                Drawable mutate = background.mutate();
                                                11T.A0I(mutate, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                                                ((GradientDrawable) mutate).setColor(requireContext().getColor(2132213895));
                                                i2 = 0;
                                            } else {
                                                11T.A0O(obj, "clear");
                                                i2 = 8;
                                            }
                                            A01.setVisibility(i2);
                                        }
                                    }
                                }
                                11T.A0L("creative");
                                throw 0Q8.createAndThrow();
                            }
                        }
                        C0k4.A00(inflate);
                        this.A03 = inflate.findViewById(2131362672);
                        this.A08 = (TextView) inflate.findViewById(2131364185);
                        ((2S2) 1Br.A0B(this.A0E)).A01(inflate, this, "quick_promotion_interstitial");
                        0FI.A08(-279881723, A02);
                        return inflate;
                    }
                    str = "buttonLayout";
                }
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        int A02 = 0FI.A02(1632116900);
        super/*androidx.fragment.app.Fragment*/.onDestroy();
        this.A0B = null;
        ((Cc1) this.A0G.getValue()).AEC();
        0FI.A08(-1805542415, A02);
    }
}
