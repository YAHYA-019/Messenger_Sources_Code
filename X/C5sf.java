package X;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.5sf, reason: invalid class name */
/* loaded from: 5sf.class */
public abstract class C5sf {
    public static final Interpolator A00 = new DecelerateInterpolator();

    public static ShapeDrawable A00(MigColorScheme migColorScheme) {
        float A01 = 3yG.A01(6.0f);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{A01, A01, A01, A01, A01, A01, A01, A01}, null, null));
        shapeDrawable.getPaint().setColor(migColorScheme.AmV());
        return shapeDrawable;
    }
}
