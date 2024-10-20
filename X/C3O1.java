package X;

/* renamed from: X.3O1, reason: invalid class name */
/* loaded from: 3O1.class */
public final class C3O1 {
    public final int A00;
    public final Exception A01;
    public final Integer A02;

    public C3O1(Exception exc, Integer num, int i) {
        this.A00 = i;
        this.A01 = exc;
        this.A02 = num;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("resultCode ");
        A0k.append(this.A00);
        Integer num = this.A02;
        if (num != null) {
            A0k.append(" | errorCode ");
            A0k.append(num);
        }
        Exception exc = this.A01;
        if (exc != null) {
            A0k.append(" | exception ");
            1BK.A1R(A0k, exc);
        }
        return A0k.toString();
    }
}
