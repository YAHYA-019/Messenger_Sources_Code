package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: Fqc.class */
public final class Fqc implements 29I {
    public /* bridge */ /* synthetic */ Object ABr(Context context, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        E8h e8h = (E8h) obj2;
        1BL.A1F(view, e8h);
        view.setForeground(e8h.A03);
        return null;
    }

    public /* synthetic */ String AhU() {
        return DKD.A0v(this);
    }

    public /* synthetic */ Class BHc() {
        return getClass();
    }

    public /* bridge */ /* synthetic */ boolean Cyz(Object obj, Object obj2, Object obj3, Object obj4) {
        E8h e8h = (E8h) obj;
        E8h e8h2 = (E8h) obj2;
        11T.A0H(e8h, e8h2);
        Drawable drawable = e8h.A03;
        Drawable drawable2 = e8h2.A03;
        return drawable == null ? drawable2 != null : (drawable2 == null || drawable.equals(drawable2)) ? false : true;
    }

    public /* bridge */ /* synthetic */ void D5U(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        View view = (View) obj;
        11T.A0F(view, 1);
        view.setForeground(null);
    }
}
