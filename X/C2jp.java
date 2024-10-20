package X;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.2jp, reason: invalid class name */
/* loaded from: 2jp.class */
public final class C2jp implements C2jo {
    @Override // X.C2jo
    public float AUD(C29k c29k) {
        11T.A0F(c29k, 0);
        return c29k.A02.top;
    }

    @Override // X.C2jo
    public float AUE(Object obj) {
        11T.A0F(obj, 0);
        if ((obj instanceof C1qv) && (obj instanceof C1r1)) {
            return ((View) obj).getY();
        }
        if (obj instanceof View) {
            return C2jm.A00((View) obj, false);
        }
        if (!(obj instanceof Drawable)) {
            throw AnonymousClass001.A0q(AnonymousClass001.A0Z(obj, "Getting Y from unsupported mount content: ", AnonymousClass001.A0k()));
        }
        return r0.getBounds().top + C2jm.A00(C2jm.A01((Drawable) obj), false);
    }

    @Override // X.C2jo
    public void ChS(Object obj) {
        11T.A0F(obj, 0);
        if (obj instanceof View) {
            ((View) obj).setTranslationY(0.0f);
        }
    }

    @Override // X.C2jo
    public void ClN(Object obj, float f) {
        View view;
        11T.A0F(obj, 0);
        if ((obj instanceof C1qv) && (obj instanceof C1r1)) {
            view = (View) obj;
        } else {
            if (!(obj instanceof View)) {
                if (!(obj instanceof Drawable)) {
                    throw AnonymousClass001.A0q(AnonymousClass001.A0Z(obj, "Setting Y on unsupported mount content: ", AnonymousClass001.A0k()));
                }
                Drawable drawable = (Drawable) obj;
                float A00 = C2jm.A00(C2jm.A01(drawable), false);
                int i = drawable.getBounds().left;
                int i2 = (int) (f - A00);
                Rect bounds = drawable.getBounds();
                11T.A0A(bounds);
                drawable.setBounds(i, i2, bounds.width() + i, bounds.height() + i2);
                return;
            }
            view = (View) obj;
            Object parent = view.getParent();
            f -= C2jm.A00(parent instanceof View ? (View) parent : null, false);
        }
        view.setY(f);
    }

    @Override // X.C2jo
    public String getName() {
        return "y";
    }
}
