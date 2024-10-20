package X;

/* renamed from: X.2b5, reason: invalid class name */
/* loaded from: 2b5.class */
public final class C2b5 extends C2b6 {
    public static final C2b6 A01 = new C2b5(04S.A00);
    public final Object A00;

    public C2b5(Object obj) {
        this.A00 = obj;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C2b5) && 11T.A0O(this.A00, ((C2b5) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass001.A02(this.A00);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Either.Left(");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
