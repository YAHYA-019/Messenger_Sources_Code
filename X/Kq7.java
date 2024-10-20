package X;

import java.util.Locale;

/* loaded from: Kq7.class */
public final class Kq7 {
    public final int A00;
    public final int[] A01;
    public final String[] A02;
    public final String[] A03;

    public Kq7(int[] iArr, String[] strArr, String[] strArr2, int i) {
        this.A03 = strArr;
        this.A01 = iArr;
        this.A02 = strArr2;
        this.A00 = i;
    }

    public String A00(String str, int i, long j, long j2) {
        Locale locale;
        String str2;
        Object[] objArr;
        Object valueOf;
        StringBuilder A0k = AnonymousClass001.A0k();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            int i4 = this.A00;
            String[] strArr = this.A03;
            if (i3 >= i4) {
                return AnonymousClass001.A0d(strArr[i4], A0k);
            }
            A0k.append(strArr[i3]);
            int i5 = this.A01[i3];
            if (i5 == 1) {
                A0k.append(str);
            } else {
                if (i5 == 2) {
                    locale = Locale.US;
                    str2 = this.A02[i3];
                    objArr = new Object[1];
                    valueOf = Long.valueOf(j);
                } else if (i5 == 3) {
                    locale = Locale.US;
                    str2 = this.A02[i3];
                    objArr = new Object[1];
                    valueOf = Integer.valueOf(i);
                } else if (i5 == 4) {
                    locale = Locale.US;
                    str2 = this.A02[i3];
                    objArr = new Object[1];
                    valueOf = Long.valueOf(j2);
                }
                objArr[0] = valueOf;
                A0k.append(String.format(locale, str2, objArr));
            }
            i2 = i3 + 1;
        }
    }
}
