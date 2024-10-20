package X;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;

/* loaded from: Hng.class */
public final class Hng {
    public final Set A01 = GOn.A1J();
    public Hrc A00 = new Hrc(null, null);

    public void A00(Hrc hrc) {
        this.A00 = hrc;
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            Gqp gqp = ((HUr) it.next()).A00;
            Hrc hrc2 = ((Hng) 1Lo.A04((Context) null, 1Fw.A04(gqp.A01), gqp.A00, 115515)).A00;
            gqp.A0Z(new Fjr(Boolean.FALSE, hrc2.A00, hrc2.A01));
        }
    }
}
