package X;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.2jn, reason: invalid class name */
/* loaded from: 2jn.class */
public final class C2jn implements C2jo {
    @Override // X.C2jo
    public float AUD(C29k c29k) {
        11T.A0F(c29k, 0);
        return c29k.A02.left;
    }

    @Override // X.C2jo
    public float AUE(Object obj) {
        11T.A0F(obj, 0);
        if ((obj instanceof C1qv) && (obj instanceof C1r1)) {
            return ((View) obj).getX();
        }
        if (obj instanceof View) {
            return C2jm.A00((View) obj, true);
        }
        if (!(obj instanceof Drawable)) {
            throw AnonymousClass001.A0q(AnonymousClass001.A0Z(obj, "Getting X from unsupported mount content: ", AnonymousClass001.A0k()));
        }
        return r0.getBounds().left + C2jm.A00(C2jm.A01((Drawable) obj), true);
    }

    @Override // X.C2jo
    public void ChS(Object obj) {
        11T.A0F(obj, 0);
        if (obj instanceof View) {
            ((View) obj).setTranslationX(0.0f);
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
                    throw AnonymousClass001.A0q(AnonymousClass001.A0Z(obj, "Setting X on unsupported mount content: ", AnonymousClass001.A0k()));
                }
                Drawable drawable = (Drawable) obj;
                int A00 = (int) (f - C2jm.A00(C2jm.A01(drawable), true));
                int i = drawable.getBounds().top;
                Rect bounds = drawable.getBounds();
                11T.A0A(bounds);
                drawable.setBounds(A00, i, bounds.width() + A00, bounds.height() + i);
                return;
            }
            view = (View) obj;
            Object parent = view.getParent();
            f -= C2jm.A00(parent instanceof View ? (View) parent : null, true);
        }
        view.setX(f);
    }

    @Override // X.C2jo
    public String getName() {
        return "x";
    }
}
