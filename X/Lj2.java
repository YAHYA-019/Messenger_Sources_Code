package X;

import java.util.Iterator;

/* loaded from: Lj2.class */
public abstract class Lj2 implements Iterable, MQx {
    public final String A00;

    public Lj2(String str) {
        this.A00 = str;
    }

    public void close() {
        Iterator it = iterator();
        while (it.hasNext()) {
            ((MQx) it.next()).close();
        }
    }
}
