package X;

import android.content.Context;
import android.view.MenuItem;

/* loaded from: Kp3.class */
public abstract class Kp3 {
    public 0QO A00;
    public final Context A01;

    public Kp3(Context context) {
        this.A01 = context;
    }

    public final MenuItem A00(MenuItem menuItem) {
        if (!(menuItem instanceof 0Qy)) {
            return menuItem;
        }
        0Qy r0 = (0Qy) menuItem;
        0QO r304 = this.A00;
        if (r304 == null) {
            r304 = new 0QO(0);
            this.A00 = r304;
        }
        JZq jZq = (MenuItem) r304.get(r0);
        if (jZq == null) {
            jZq = new JZq(this.A01, r0);
            this.A00.put(r0, jZq);
        }
        return jZq;
    }
}
