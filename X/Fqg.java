package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;

/* loaded from: Fqg.class */
public final class Fqg implements 29I {
    public /* bridge */ /* synthetic */ Object ABr(Context context, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        Rect rect = ((E8i) obj2).A04;
        if (rect == null) {
            return null;
        }
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        return null;
    }

    public /* synthetic */ String AhU() {
        return DKD.A0v(this);
    }

    public /* synthetic */ Class BHc() {
        return getClass();
    }

    public /* bridge */ /* synthetic */ boolean Cyz(Object obj, Object obj2, Object obj3, Object obj4) {
        return !2Go.A00(((E8i) obj).A04, ((E8i) obj2).A04);
    }

    public /* bridge */ /* synthetic */ void D5U(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        ((View) obj).setPadding(0, 0, 0, 0);
    }
}
