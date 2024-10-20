package X;

import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: Hyg.class */
public final class Hyg {
    public final HashMap A00;
    public final Set A01;
    public final ConcurrentHashMap A02;

    public Hyg() {
        this(AnonymousClass001.A0v());
    }

    public Hyg(Set set) {
        11T.A0F(set, 2);
        this.A01 = set;
        this.A00 = AnonymousClass001.A0u();
        this.A02 = new ConcurrentHashMap();
    }
}
