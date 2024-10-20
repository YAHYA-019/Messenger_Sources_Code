package X;

/* loaded from: LdW.class */
public final class LdW implements MJf {
    public final int A00;
    public final MQk A01;
    public final String A02;
    public final Object[] A03;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [int] */
    public LdW(MQk mQk, String str, Object[] objArr) {
        char charAt;
        this.A01 = mQk;
        this.A02 = str;
        this.A03 = objArr;
        char A00 = JQx.A00(str);
        if (A00 >= 55296) {
            int i = A00 & 8191;
            int i2 = 1;
            char c = '\r';
            while (true) {
                int i3 = i2 + 1;
                charAt = str.charAt(i2);
                if (charAt < 55296) {
                    break;
                }
                i = JQx.A0A(charAt, c, i);
                c += '\r';
                i2 = i3;
            }
            A00 = (i | (charAt << c)) == true ? 1 : 0;
        }
        this.A00 = A00;
    }

    public final String A00() {
        return this.A02;
    }

    public final Object[] A01() {
        return this.A03;
    }

    @Override // X.MJf
    public final MQk DC8() {
        return this.A01;
    }

    @Override // X.MJf
    public final boolean DCP() {
        return AnonymousClass001.A1Q(this.A00 & 2, 2);
    }

    @Override // X.MJf
    public final int DCR() {
        int i;
        int i2 = this.A00;
        if ((i2 & 1) != 0) {
            i = 1;
        } else {
            i = 2;
            if ((i2 & 4) == 4) {
                return 3;
            }
        }
        return i;
    }
}
