package X;

import java.util.Set;

/* loaded from: Ewg.class */
public final class Ewg {
    public final Object A00 = AnonymousClass001.A0R();
    public final C00i A02 = AbH.A0L();
    public final Set A01 = AnonymousClass001.A0v();

    public void A00(GE8 ge8) {
        synchronized (this.A00) {
            this.A01.add(ge8);
        }
    }

    public void A01(String str) {
        synchronized (this.A00) {
            Set set = this.A01;
            if (set.isEmpty()) {
                return;
            }
            GE8[] ge8Arr = new GE8[set.size()];
            set.toArray(ge8Arr);
            1BK.A1E(this.A02).execute(new G3Z(this, str, ge8Arr));
        }
    }
}
