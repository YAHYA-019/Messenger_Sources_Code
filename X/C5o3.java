package X;

import java.util.Set;

/* renamed from: X.5o3, reason: invalid class name */
/* loaded from: 5o3.class */
public final class C5o3 extends C04v {
    public static final C5o3 A01 = new C5o3(C0uA.A00);
    public final Set A00;

    public C5o3() {
        this(C0uA.A00);
    }

    public C5o3(Set set) {
        11T.A0F(set, 1);
        this.A00 = set;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C5o3) && 11T.A0O(this.A00, ((C5o3) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
