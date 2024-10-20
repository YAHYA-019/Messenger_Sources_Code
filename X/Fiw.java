package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: Fiw.class */
public final class Fiw implements 2lL {
    public final C6eP A00;

    public Fiw(C6eP c6eP) {
        this.A00 = c6eP;
    }

    public /* bridge */ /* synthetic */ View ALI(Context context, ViewGroup viewGroup) {
        11T.A0F(context, 0);
        ViewGroup viewGroup2 = new ViewGroup(context);
        View ALJ = this.A00.ALJ(viewGroup2);
        boolean z = false;
        if (((DPA) viewGroup2).A01 == ((DPA) viewGroup2).A02) {
            z = true;
            viewGroup2.removeAllViews();
        }
        ((DPA) viewGroup2).A01 = ALJ;
        if (z) {
            viewGroup2.addView(ALJ, new ViewGroup.LayoutParams(-2, -2));
            ((DPA) viewGroup2).A02 = ALJ;
        }
        return viewGroup2;
    }
}
