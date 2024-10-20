package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* loaded from: A2a.class */
public final class A2a implements C2li {
    public static final A2a A00 = new A2a();

    @Override // X.C2li
    public /* bridge */ /* synthetic */ Object A7y(Context context) {
        11T.A0F(context, 0);
        ImageView imageView = new ImageView(context);
        ((8CX) imageView).A00 = new Rect();
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        5C4 AJb = 5BS.A01().AJb();
        11T.A0I(AJb, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
        imageView.setImageDrawable((Drawable) AJb);
        return imageView;
    }
}
