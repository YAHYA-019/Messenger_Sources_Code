package X;

/* loaded from: K5s.class */
public final class K5s extends K5u {
    public final char A00;

    public K5s(char c) {
        this.A00 = c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [int] */
    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        char c = this.A00;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= 4) {
                return 0Pz.A0j(1BJ.A00(668), String.copyValueOf(cArr), "')");
            }
            cArr[5 - i2] = "0123456789ABCDEF".charAt(c & 15);
            c >>= 4;
            i = i2 + 1;
        }
    }
}
