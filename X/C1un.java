package X;

/* renamed from: X.1un, reason: invalid class name */
/* loaded from: 1un.class */
public final class C1un {
    public final byte A00;
    public final int A01;
    public final long A02;
    public final Object A03;

    public C1un(Object obj, byte b, int i, long j) {
        this.A01 = i;
        this.A02 = j;
        this.A00 = b;
        this.A03 = obj;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Params{mType=");
        A0k.append(this.A01);
        A0k.append(", mId=");
        A0k.append(this.A02);
        A0k.append(", mFlags=");
        A0k.append((int) this.A00);
        A0k.append(", mValue=");
        A0k.append(this.A03);
        return AnonymousClass001.A0f(A0k);
    }
}
