package X;

import android.view.View;

/* loaded from: F3a.class */
public abstract class F3a {
    public static final float A00 = (float) Math.sqrt(5.0d);

    public static void A00(View view, Fwy fwy) {
        float A02 = DKC.A02(view);
        float f = fwy.A09;
        view.setTranslationX(DKE.A00(f, A02, f, fwy.A0I ? 1 : 0));
        float A03 = DKC.A03(view);
        float f2 = fwy.A0A;
        view.setTranslationY(DKE.A00(f2, A03, f2, fwy.A0J ? 1 : 0));
        if (fwy.A0F) {
            float A022 = DKC.A02(view);
            float f3 = fwy.A02;
            view.setPivotX(DKE.A00(f3, A022, f3, fwy.A0G ? 1 : 0));
            float A032 = DKC.A03(view);
            float f4 = fwy.A03;
            view.setPivotY(DKE.A00(f4, A032, f4, fwy.A0H ? 1 : 0));
        }
    }
}
