package X;

/* renamed from: X.61n, reason: invalid class name */
/* loaded from: 61n.class */
public final class C61n extends C04v implements 61F {
    public static final C61n A01 = new C61n(7Pb.A00);
    public final C7Pc A00;

    public C61n(C7Pc c7Pc) {
        this.A00 = c7Pc;
    }

    public final boolean A00(String str) {
        if (str == null) {
            return false;
        }
        7Pd r0 = this.A00;
        return r0 instanceof 7Pd ? r0.A00.contains(str) : (r0 instanceof C7Pe) && ((C7Pe) r0).A00.get(str) == AnonymousClass967.A05;
    }

    public int BNp() {
        return this.A00.hashCode();
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C61n) && 11T.A0O(this.A00, ((C61n) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
