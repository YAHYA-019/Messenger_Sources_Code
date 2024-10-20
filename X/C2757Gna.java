package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.Gna, reason: case insensitive filesystem */
/* loaded from: Gna.class */
public final class C2757Gna extends IFM {
    public final C00i A00;
    public final C00i A01;
    public final Htr A02;

    public C2757Gna(ViewGroup viewGroup, AbR abR, Hrw hrw, C6x1 c6x1, Htr htr) {
        super(viewGroup, abR, hrw, c6x1);
        this.A00 = AbH.A0Q();
        this.A01 = GOo.A0K();
        this.A02 = htr;
        htr.A05.add(new C2791Go8(this));
    }

    public static void A00(C2757Gna c2757Gna) {
        View A09 = c2757Gna.A09();
        if (A09 != null) {
            A09.setFocusable(true);
            Context context = A09.getContext();
            Htr htr = c2757Gna.A02;
            int i = 2131960633;
            if (htr.A03) {
                i = 2131960632;
            }
            GOo.A16(context, A09, i);
            A09.setSelected(htr.A03);
        }
    }
}
