package X;

import java.util.Arrays;

/* loaded from: Hgo.class */
public final class Hgo {
    public S6I[] A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public Hgo(String str, String str2, S6I[] s6iArr, boolean z) {
        this.A02 = str;
        this.A03 = z;
        this.A01 = str2;
        if (s6iArr == null) {
            this.A00 = new S6I[0];
            return;
        }
        this.A00 = s6iArr;
        if (s6iArr.length > 1) {
            Arrays.sort(s6iArr);
        }
    }
}
