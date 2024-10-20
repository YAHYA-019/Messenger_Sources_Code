package X;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.3bp, reason: invalid class name */
/* loaded from: 3bp.class */
public final class C3bp implements 29I {
    public boolean A00;
    public final C00m A01;

    public C3bp(C00m c00m) {
        11T.A0F(c00m, 1);
        this.A01 = c00m;
    }

    public /* bridge */ /* synthetic */ Object ABr(Context context, Object obj, Object obj2, Object obj3) {
        Rk6 rk6;
        View view = (View) obj;
        11T.A0F(view, 1);
        if (this.A00) {
            rk6 = null;
        } else {
            rk6 = new Rk6(view, this, this.A01);
            view.getViewTreeObserver().addOnDrawListener(rk6);
        }
        return rk6;
    }

    public /* synthetic */ String AhU() {
        return 2JF.A00(getClass());
    }

    public /* synthetic */ Class BHc() {
        return getClass();
    }

    public /* bridge */ /* synthetic */ boolean Cyz(Object obj, Object obj2, Object obj3, Object obj4) {
        return false;
    }

    public /* bridge */ /* synthetic */ void D5U(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        View view = (View) obj;
        ViewTreeObserver.OnDrawListener onDrawListener = (ViewTreeObserver.OnDrawListener) obj4;
        11T.A0F(view, 1);
        if (onDrawListener == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        view.getViewTreeObserver().removeOnDrawListener(onDrawListener);
    }
}
