package X;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.1si, reason: invalid class name */
/* loaded from: 1si.class */
public final class C1si {
    public static final void A00(View view, C1rn c1rn, int i) {
        switch (i) {
            case 1:
                view.setAlpha(((Number) c1rn.A00).floatValue());
                return;
            case 2:
                view.setTranslationX(((Number) c1rn.A00).floatValue());
                return;
            case 3:
                view.setTranslationY(((Number) c1rn.A00).floatValue());
                return;
            case 4:
                view.setTranslationZ(((Number) c1rn.A00).floatValue());
                return;
            case 5:
                view.setScaleX(((Number) c1rn.A00).floatValue());
                return;
            case 6:
                view.setScaleY(((Number) c1rn.A00).floatValue());
                return;
            case 7:
                view.setElevation(((Number) c1rn.A00).floatValue());
                return;
            case 8:
                view.setBackgroundColor(((Number) c1rn.A00).intValue());
                return;
            case 9:
                view.setRotation(((Number) c1rn.A00).floatValue());
                return;
            case 10:
                view.setRotationX(((Number) c1rn.A00).floatValue());
                return;
            case 11:
                view.setRotationY(((Number) c1rn.A00).floatValue());
                return;
            case 12:
                view.setBackground((Drawable) c1rn.A00);
                return;
            case 13:
                view.setForeground(new ColorDrawable(((Number) c1rn.A00).intValue()));
                return;
            default:
                return;
        }
    }
}
