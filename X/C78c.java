package X;

import java.util.LinkedHashMap;

/* renamed from: X.78c, reason: invalid class name */
/* loaded from: 78c.class */
public final class C78c extends C04v implements C6xq {
    public final LinkedHashMap A00;

    public C78c() {
        this(1BK.A1C());
    }

    public C78c(LinkedHashMap linkedHashMap) {
        11T.A0F(linkedHashMap, 1);
        this.A00 = linkedHashMap;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C78c) && 11T.A0O(this.A00, ((C78c) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
