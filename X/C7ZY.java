package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* renamed from: X.7ZY, reason: invalid class name */
/* loaded from: 7ZY.class */
public final class C7ZY implements 71U {
    public static final C7ZY A00 = new Object();

    public Drawable AUG(Context context, 6yN r303, boolean z) {
        11T.A0F(r303, 1);
        Drawable drawable = context.getDrawable(2132411411);
        11T.A0I(drawable, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        7JE.A00(layerDrawable, 2131366521, r303.B67(context, 0S2.A00, z));
        7JE.A00(layerDrawable, 2131366525, r303.B68(context));
        return layerDrawable;
    }
}
