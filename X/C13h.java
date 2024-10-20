package X;

/* renamed from: X.13h, reason: invalid class name */
/* loaded from: 13h.class */
public final class C13h {
    public final int A00;
    public final Object A01;

    public C13h(int i, Object obj) {
        this.A00 = i;
        this.A01 = obj;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C13h)) {
                return false;
            }
            C13h c13h = (C13h) obj;
            if (this.A00 != c13h.A00 || !11T.A0O(this.A01, c13h.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (this.A00 * 31) + AnonymousClass001.A02(this.A01);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("IndexedValue(index=");
        A0k.append(this.A00);
        A0k.append(", value=");
        return AnonymousClass002.A0K(this.A01, A0k);
    }
}
