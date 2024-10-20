package X;

import android.view.View;

/* renamed from: X.9rn, reason: invalid class name */
/* loaded from: 9rn.class */
public final class C9rn implements 2M3 {
    public final int A00;
    public final Object A01;

    public C9rn(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final View AUH() {
        int i = this.A00;
        View view = (View) this.A01;
        if (i != 0) {
            view = view.requireViewById(2131363337);
        }
        return view;
    }
}
