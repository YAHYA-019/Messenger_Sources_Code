package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: Fv5.class */
public abstract class Fv5 implements GGs {
    public final int A00;
    public final GGs A01;

    public Fv5(GGs gGs, int i) {
        this.A01 = gGs;
        this.A00 = i;
    }

    public final View A00(ViewGroup viewGroup) {
        S4q s4q = this.A01;
        View A08 = AbG.A08(s4q.A00, viewGroup, this.A00);
        11T.A0A(A08);
        return A08;
    }

    @Override // X.GGs
    public Context getContext() {
        Context context = this.A01.getContext();
        11T.A0A(context);
        return context;
    }
}
