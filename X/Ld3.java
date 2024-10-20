package X;

/* loaded from: Ld3.class */
public final class Ld3 implements MCw {
    public final int A00;
    public final MCx A01;
    public final Object[] A02;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [int] */
    public Ld3(MCx mCx, Object[] objArr) {
        char charAt;
        this.A01 = mCx;
        this.A02 = objArr;
        char A00 = JQx.A00("\u0001\u0001����\u0001\u0001\u0001��\u0001��\u0001\u001a");
        if (A00 >= 55296) {
            int i = A00 & 8191;
            int i2 = 1;
            char c = '\r';
            while (true) {
                int i3 = i2 + 1;
                charAt = "\u0001\u0001����\u0001\u0001\u0001��\u0001��\u0001\u001a".charAt(i2);
                if (charAt < 55296) {
                    break;
                }
                i = JQx.A0A(charAt, c, i);
                c += '\r';
                i2 = i3;
            }
            A00 = ((charAt << c) | i) == true ? 1 : 0;
        }
        this.A00 = A00;
    }
}
