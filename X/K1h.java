package X;

import java.util.HashMap;

/* loaded from: K1h.class */
public final class K1h extends L7x {
    public long A00;
    public String A01;
    public String A02;
    public String A03;

    public final String toString() {
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("variableName", this.A02);
        A0u.put("timeInMillis", Long.valueOf(this.A00));
        A0u.put("category", this.A01);
        return L7x.A01("label", this.A03, A0u);
    }
}
