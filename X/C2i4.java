package X;

/* renamed from: X.2i4, reason: invalid class name */
/* loaded from: 2i4.class */
public final class C2i4 {
    public Object A00;
    public final Object A01;

    public C2i4(Object obj, Object obj2) {
        this.A01 = obj;
        this.A00 = obj2;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Diff{previous=");
        A0k.append(this.A01);
        A0k.append(", next=");
        A0k.append(this.A00);
        return AnonymousClass001.A0f(A0k);
    }
}
