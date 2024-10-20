package X;

import android.content.Context;
import android.widget.Scroller;

/* loaded from: Fdy.class */
public final class Fdy implements GHj {
    public final Scroller A00;

    public Fdy(Context context) {
        this.A00 = new Scroller(context);
    }

    @Override // X.GHj
    public int AiV(Integer num) {
        return -1;
    }

    @Override // X.GHj
    public Scroller B9G(Integer num) {
        return this.A00;
    }
}
