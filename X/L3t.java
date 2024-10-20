package X;

import java.util.ArrayList;

/* loaded from: L3t.class */
public final class L3t {
    public static final L3t A01 = new L3t(0);
    public static final L3t A02 = new L3t(1);
    public final int A00;

    public L3t(int i) {
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof L3t) && this.A00 == ((L3t) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public String toString() {
        int i = this.A00;
        if (i == 0) {
            return "TextDecoration.None";
        }
        ArrayList A0s = AnonymousClass001.A0s();
        if ((i & 1) != 0) {
            A0s.add("Underline");
        }
        if ((i & 2) != 0) {
            A0s.add("LineThrough");
        }
        int size = A0s.size();
        StringBuilder A0k = AnonymousClass001.A0k();
        if (size == 1) {
            A0k.append("TextDecoration.");
            A0k.append((String) A0s.get(0));
        } else {
            A0k.append("TextDecoration[");
            A0k.append(KV8.A00(", ", A0s));
            A0k.append(']');
        }
        return A0k.toString();
    }
}
