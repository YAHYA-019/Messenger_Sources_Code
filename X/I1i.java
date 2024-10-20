package X;

/* loaded from: I1i.class */
public final class I1i {
    public final String A00;
    public final String A01;

    public I1i(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public I1i(I1i... i1iArr) {
        String str = "";
        String str2 = str;
        int i = 0;
        do {
            I1i i1i = i1iArr[i];
            str = 0Pz.A0W(str, i1i.A01);
            str2 = 0Pz.A0W(str2, i1i.A00);
            i++;
        } while (i < 2);
        this.A01 = str;
        this.A00 = str2;
    }

    public boolean A00(char c, char c2) {
        boolean z = false;
        int i = 0;
        while (true) {
            int i2 = i;
            String str = this.A01;
            if (i2 < str.length()) {
                if (str.charAt(i2) == c && this.A00.charAt(i2) == c2) {
                    z = true;
                    break;
                }
                i = i2 + 1;
            } else {
                break;
            }
        }
        return z;
    }
}
