package X;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* renamed from: X.Jij, reason: case insensitive filesystem */
/* loaded from: Jij.class */
public final class C3081Jij extends JiU {
    public MI9 A00;
    public static final TimeInterpolator A02 = new DecelerateInterpolator();
    public static final TimeInterpolator A01 = new AccelerateInterpolator();
    public static final MI9 A04 = new JiN();
    public static final MI9 A03 = new JiO();

    /* JADX WARN: Multi-variable type inference failed */
    public C3081Jij() {
        MI9 mi9 = A03;
        this.A00 = mi9;
        this.A00 = mi9;
        C3074Jic c3074Jic = new C3074Jic();
        c3074Jic.A00 = 80;
        A0e(c3074Jic);
    }

    public static ObjectAnimator A02(TimeInterpolator timeInterpolator, View view, Lij lij, L4B l4b, float f, float f2, float f3, float f4, int i, int i2) {
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        View view2 = l4b.A00;
        if (((int[]) view2.getTag(2131368195)) != null) {
            f = (r0[0] - i) + translationX;
            f2 = (r0[1] - i2) + translationY;
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
        if (f == f3 && f2 == f4) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f, f3), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f2, f4));
        JUJ juj = new JUJ(view, view2, translationX, translationY);
        lij.A0I(juj);
        ofPropertyValuesHolder.addListener(juj);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }
}
