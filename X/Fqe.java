package X;

import android.content.Context;
import android.view.View;

/* loaded from: Fqe.class */
public final class Fqe implements 29I {
    public /* bridge */ /* synthetic */ Object ABr(Context context, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        E8h e8h = (E8h) obj2;
        1BL.A1F(view, e8h);
        View.OnClickListener onClickListener = e8h.A04;
        if (onClickListener != null) {
            view.setOnClickListener(onClickListener);
        }
        view.setOnFocusChangeListener(null);
        view.setFocusable(e8h.A08);
        view.setFocusableInTouchMode(false);
        view.setEnabled(e8h.A07);
        if (e8h.A00 == -1) {
            return null;
        }
        view.setClickable(false);
        return null;
    }

    public /* synthetic */ String AhU() {
        return DKD.A0v(this);
    }

    public /* synthetic */ Class BHc() {
        return getClass();
    }

    public /* bridge */ /* synthetic */ boolean Cyz(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }

    public /* bridge */ /* synthetic */ void D5U(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        View view = (View) obj;
        11T.A0F(view, 1);
        view.setOnClickListener(null);
        view.setClickable(false);
        view.setOnFocusChangeListener(null);
        view.setFocusable(false);
        view.setFocusableInTouchMode(false);
    }
}
