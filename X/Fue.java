package X;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: Fue.class */
public final class Fue implements 1Ps {
    public HashSet A00 = AnonymousClass001.A0v();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, X.ET7] */
    public static Iterator A00(1QC r301) {
        Fue fue = new Fue();
        for (Map.Entry entry : r301.A00.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            ?? obj = new Object();
            ((ET7) obj).A00 = key;
            ((ET7) obj).A01 = value;
            fue.A01(obj);
        }
        return fue.iterator();
    }

    public void A01(Object obj) {
        this.A00.add(obj);
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj != null) {
            if (obj == this) {
                z = true;
            } else if (obj instanceof Fue) {
                return this.A00.equals(((Fue) obj).A00);
            }
        }
        return z;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public Iterator iterator() {
        return this.A00.iterator();
    }

    public int size() {
        return this.A00.size();
    }
}
