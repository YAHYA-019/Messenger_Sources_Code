package X;

/* renamed from: X.Jcu, reason: case insensitive filesystem */
/* loaded from: Jcu.class */
public final class C2906Jcu extends KR7 {
    public final L4g A00;
    public final MLe A01;

    public C2906Jcu(L4g l4g) {
        LOR lor = null;
        this.A00 = l4g;
        if (!KvI.A01(l4g)) {
            lor = LOR.A00();
            lor.A7F(l4g, 0S2.A00);
        }
        this.A01 = lor;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C2906Jcu) && 11T.A0O(this.A00, ((C2906Jcu) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
