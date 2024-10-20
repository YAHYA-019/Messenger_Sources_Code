package X;

import android.content.Context;
import android.view.View;

/* loaded from: Fqf.class */
public final class Fqf implements 29I {
    public /* bridge */ /* synthetic */ Object ABr(Context context, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        E8i e8i = (E8i) obj2;
        if (e8i.A01 <= 0) {
            return null;
        }
        if (e8i.A0C.A00 == 1) {
            view.setVerticalFadingEdgeEnabled(true);
        } else {
            view.setHorizontalFadingEdgeEnabled(true);
        }
        view.setFadingEdgeLength(e8i.A01);
        return null;
    }

    public /* synthetic */ String AhU() {
        return DKD.A0v(this);
    }

    public /* synthetic */ Class BHc() {
        return getClass();
    }

    public /* bridge */ /* synthetic */ boolean Cyz(Object obj, Object obj2, Object obj3, Object obj4) {
        return 4YV.A1W(((E8i) obj).A01, ((E8i) obj2).A01);
    }

    public /* bridge */ /* synthetic */ void D5U(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        View view = (View) obj;
        view.setVerticalFadingEdgeEnabled(false);
        view.setHorizontalFadingEdgeEnabled(false);
        view.setFadingEdgeLength(0);
    }
}
