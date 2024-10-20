package X;

import java.util.HashMap;

/* loaded from: K1i.class */
public final class K1i extends L7x {
    public long A00;
    public String A01;
    public String A02;
    public String A03;

    public final String toString() {
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("category", this.A01);
        A0u.put("action", this.A03);
        A0u.put("label", this.A02);
        return L7x.A01("value", Long.valueOf(this.A00), A0u);
    }
}
