package X;

import java.util.List;

/* loaded from: Hpi.class */
public final class Hpi {
    public Esm A00;
    public String A01;
    public String A02;
    public final HOl A03;
    public final Hd4 A04 = new Hd4();
    public final List A05 = AnonymousClass001.A0s();

    public Hpi(Esm esm, HOl hOl) {
        this.A00 = esm;
        this.A03 = hOl;
    }

    public String A00() {
        List list = this.A05;
        if (list.isEmpty()) {
            return null;
        }
        return ((Hgz) 1BK.A0r(list)).A01;
    }
}
