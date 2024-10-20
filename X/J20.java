package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.litho.LithoView;

/* loaded from: J20.class */
public final class J20 implements Runnable {
    public static final String __redex_internal_original_name = "MediaSyncChainingView$render$runnable$1";
    public final /* synthetic */ GVc A00;
    public final /* synthetic */ C2641Gjv A01;
    public final /* synthetic */ 0CL A02;
    public final /* synthetic */ boolean A03;

    public J20(GVc gVc, C2641Gjv c2641Gjv, 0CL r304, boolean z) {
        this.A02 = r304;
        this.A01 = c2641Gjv;
        this.A00 = gVc;
        this.A03 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.A02.element;
        if (obj != null) {
            C2641Gjv c2641Gjv = this.A01;
            GVc gVc = this.A00;
            boolean z = this.A03;
            int indexOf = c2641Gjv.A03.indexOf(obj);
            ViewPager2 viewPager2 = gVc.A05;
            final boolean A1R = AnonymousClass001.A1R(viewPager2.A00, indexOf);
            final String str = c2641Gjv.A01;
            if (str != null && !z) {
                LithoView lithoView = gVc.A06;
                lithoView.A0x(new 1LH(A1R, str) { // from class: X.8f5
                    public final String A00;
                    public final boolean A01;

                    {
                        this.A01 = A1R;
                        this.A00 = str;
                    }

                    private final C2cl A01(C2k6 c2k6) {
                        Drawable A02 = ((Fcg) 1Bi.A03(99773)).A02(3vP.A00(c2k6), this.A01 ? 3Eh.AJ9 : 3Eh.AJ6);
                        11T.A0A(A02);
                        C2cm A00 = C2cl.A00(c2k6.AeS());
                        A00.A2b(A02);
                        A00.A2X(-1);
                        return 7zN.A09(A00);
                    }

                    public 1LI A0s(C2k5 c2k5) {
                        C2cl A01;
                        11T.A0F(c2k5, 0);
                        C1rp c1rp = C1rp.CENTER;
                        C2sn A0L = 7zR.A0L(c2k5);
                        if (this.A01) {
                            A0L.A00(A01(A0L));
                            A01 = RXf.A00(A0L.A00, this.A00);
                        } else {
                            A0L.A00(RXf.A00(A0L.A00, this.A00));
                            A01 = A01(A0L);
                        }
                        A0L.A00(A01);
                        return new 2cL((C1ro) null, (C1ro) null, c1rp, (EnumC00743oh) null, A0L.A01, false);
                    }
                });
                lithoView.setAlpha(1.0f);
                float f = 150.0f;
                float f2 = -150.0f;
                if (A1R) {
                    f2 = 150.0f;
                }
                lithoView.setTranslationY(f2);
                float[] fArr = new float[1];
                if (A1R) {
                    f = -150.0f;
                }
                fArr[0] = f;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(lithoView, "translationY", fArr);
                ofFloat.setDuration(500L);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(lithoView, "alpha", 0.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.play(ofFloat2).after(ofFloat);
                0K6.A00(animatorSet);
            }
            viewPager2.A05(indexOf, true);
        }
    }
}
