package X;

import java.util.ConcurrentModificationException;

/* loaded from: Koz.class */
public final class Koz {
    public Object A00;

    public void A00(Object obj, Object obj2) {
        if (this.A00 != obj) {
            throw new ConcurrentModificationException();
        }
        this.A00 = obj2;
    }
}
