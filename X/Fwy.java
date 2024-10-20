package X;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import com.facebook.acra.constants.ActionId;

/* loaded from: Fwy.class */
public final class Fwy implements GH5 {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public float A0A;
    public View A0B;
    public ViewTreeObserver.OnPreDrawListener A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005a, code lost:
    
        if (X.DKC.A1Z(r0) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009e, code lost:
    
        if (X.DKC.A1Z(r0) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0189, code lost:
    
        if (X.DKC.A1Z(r0) != false) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A00(X.DLQ r301, X.Fwy r302) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Fwy.A00(X.DLQ, X.Fwy):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0050. Please report as an issue. */
    @Override // X.GH5
    public boolean Clv(FyG fyG, Object obj, int i) {
        boolean z = true;
        if (i == 35) {
            float A00 = 7zM.A00(obj);
            this.A07 = A00;
            View view = this.A0B;
            if (view != null) {
                view.setScaleX(A00);
                return true;
            }
        } else if (i == 36) {
            float A002 = 7zM.A00(obj);
            this.A08 = A002;
            View view2 = this.A0B;
            if (view2 != null) {
                view2.setScaleY(A002);
                return true;
            }
        } else if (i == 38) {
            try {
                String str = (String) obj;
                float f = 0.0f;
                if (str != null) {
                    f = FIy.A01(str);
                }
                this.A09 = f;
                this.A0I = DKC.A1Z(str);
            } catch (EKT e) {
                FGT.A00(fyG, "ViewTransformsExtensionBinderUtils", "Could not parse translation_x value. ", e);
            }
            View view3 = this.A0B;
            if (view3 != null) {
                float A02 = DKC.A02(view3);
                float f2 = this.A09;
                view3.setTranslationX(DKE.A00(f2, A02, f2, this.A0I ? 1 : 0));
                return true;
            }
        } else if (i == 138) {
            float A003 = 7zM.A00(obj);
            this.A04 = A003;
            View view4 = this.A0B;
            if (view4 != null) {
                view4.setRotation(A003);
                return true;
            }
        } else if (i != 141) {
            switch (i) {
                case 40:
                    try {
                        String str2 = (String) obj;
                        float f3 = 0.0f;
                        if (str2 != null) {
                            f3 = FIy.A01(str2);
                        }
                        this.A0A = f3;
                        this.A0J = DKC.A1Z(str2);
                    } catch (EKT e2) {
                        FGT.A00(fyG, "ViewTransformsExtensionBinderUtils", "Could not parse translation_y value. ", e2);
                    }
                    View view5 = this.A0B;
                    if (view5 != null) {
                        float A03 = DKC.A03(view5);
                        float f4 = this.A0A;
                        view5.setTranslationY(DKE.A00(f4, A03, f4, this.A0J ? 1 : 0));
                        return true;
                    }
                    break;
                case 41:
                    try {
                        String str3 = (String) obj;
                        this.A02 = FIy.A01(str3);
                        this.A0G = DKC.A1Z(str3);
                        this.A0F = true;
                    } catch (EKT e3) {
                        FGT.A00(fyG, "ViewTransformsExtensionBinderUtils", "Could not parse pivot_x value. ", e3);
                    }
                    View view6 = this.A0B;
                    if (view6 != null) {
                        float A022 = DKC.A02(view6);
                        float f5 = this.A02;
                        view6.setPivotX(DKE.A00(f5, A022, f5, this.A0G ? 1 : 0));
                        return true;
                    }
                    break;
                case 42:
                    try {
                        String str4 = (String) obj;
                        this.A03 = FIy.A01(str4);
                        this.A0H = DKC.A1Z(str4);
                        this.A0F = true;
                    } catch (EKT e4) {
                        FGT.A00(fyG, "ViewTransformsExtensionBinderUtils", "Could not parse pivot_y value. ", e4);
                    }
                    View view7 = this.A0B;
                    if (view7 != null) {
                        float A032 = DKC.A03(view7);
                        float f6 = this.A03;
                        view7.setPivotY(DKE.A00(f6, A032, f6, this.A0H ? 1 : 0));
                        return true;
                    }
                    break;
                case 43:
                    float A004 = 7zM.A00(obj);
                    this.A01 = A004;
                    View view8 = this.A0B;
                    if (view8 != null) {
                        Context context = view8.getContext();
                        if (A004 == 0.0f) {
                            A004 = 2.1474836E9f;
                        }
                        float f7 = 7zO.A0I(context).density;
                        view8.setCameraDistance(f7 * f7 * (-A004) * F3a.A00);
                        return true;
                    }
                    break;
                case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                    float A005 = 7zM.A00(obj);
                    this.A05 = A005;
                    View view9 = this.A0B;
                    if (view9 != null) {
                        view9.setRotationX(A005);
                        return true;
                    }
                    break;
                case ActionId.ON_CREATE_VIEW_END /* 45 */:
                    float A006 = 7zM.A00(obj);
                    this.A06 = A006;
                    View view10 = this.A0B;
                    if (view10 != null) {
                        view10.setRotationY(A006);
                        return true;
                    }
                    break;
                default:
                    z = false;
                    break;
            }
        } else {
            float A007 = 7zM.A00(obj);
            this.A00 = A007;
            View view11 = this.A0B;
            if (view11 != null) {
                view11.setAlpha(A007);
                return true;
            }
        }
        return z;
    }
}
