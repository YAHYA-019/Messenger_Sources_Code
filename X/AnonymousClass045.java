package X;

import java.util.Arrays;

/* renamed from: X.045, reason: invalid class name */
/* loaded from: 045.class */
public final class AnonymousClass045 {
    public volatile boolean A03;
    public String[] A02 = new String[10];
    public int[] A01 = new int[5];
    public int A00 = 0;

    public void A00(String str, String str2, int i) {
        if (this.A03) {
            throw AnonymousClass001.A0N("Attempted to modify locked instance of PointData");
        }
        int i2 = this.A00;
        int[] iArr = this.A01;
        int length = iArr.length;
        if (i2 >= length) {
            int i3 = length + (length >> 1);
            this.A01 = Arrays.copyOf(iArr, i3);
            this.A02 = (String[]) Arrays.copyOf(this.A02, i3 * 2);
        }
        int i4 = this.A00;
        int i5 = i4 * 2;
        int i6 = i5 + 1;
        String[] strArr = this.A02;
        strArr[i5] = str;
        strArr[i6] = str2;
        this.A01[i4] = i;
        this.A00 = i4 + 1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass045)) {
            return false;
        }
        AnonymousClass045 anonymousClass045 = (AnonymousClass045) obj;
        int i = this.A00;
        if (i != anonymousClass045.A00) {
            return false;
        }
        int i2 = i * 2;
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 < i2) {
                String str = this.A02[i4];
                String str2 = anonymousClass045.A02[i4];
                if (str == null) {
                    if (str2 != null) {
                        return false;
                    }
                } else if (!str.equals(str2)) {
                    return false;
                }
                i3 = i4 + 1;
            } else {
                int i5 = 0;
                while (true) {
                    int i6 = i5;
                    if (i6 >= i) {
                        return true;
                    }
                    if (this.A01[i6] != anonymousClass045.A01[i6]) {
                        return false;
                    }
                    i5 = i6 + 1;
                }
            }
        }
    }

    public int hashCode() {
        int i = this.A00;
        int i2 = i * 2;
        int i3 = 31;
        int i4 = 0;
        while (true) {
            int i5 = i4;
            if (i5 >= i2) {
                break;
            }
            String str = this.A02[i5];
            if (str != null) {
                i3 = (i3 * 31) + str.hashCode();
            }
            i4 = i5 + 1;
        }
        for (int i6 = 0; i6 < i; i6++) {
            i3 = (i3 * 31) + this.A01[i6];
        }
        return i3;
    }

    public String toString() {
        int i = this.A00;
        if (i == 1 && this.A01[0] == 1) {
            String[] strArr = this.A02;
            if ("__key".equals(strArr[0])) {
                return strArr[1];
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            sb.append('\"');
            String[] strArr2 = this.A02;
            sb.append(strArr2[i2]);
            sb.append("\":\"");
            sb.append(strArr2[i2 + 1]);
            sb.append("\",");
            i2 += 2;
        }
        sb.replace(sb.length() - 1, sb.length(), "}");
        return sb.toString();
    }
}
