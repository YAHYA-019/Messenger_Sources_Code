package X;

import com.facebook.user.model.Name;
import com.google.common.collect.ImmutableSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.3Ti, reason: invalid class name */
/* loaded from: 3Ti.class */
public final class C3Ti {
    public static final int[] A07 = {4352, 4353, 0, 4354, 0, 0, 4355, 4356, 4357, 0, 0, 0, 0, 0, 0, 0, 4358, 4359, 4360, 0, 4361, 4362, 4363, 4364, 4365, 4366, 4367, 4368, 4369, 4370};
    public final C1r6 A02;
    public final EsW A03;
    public final Set A05;
    public final C00i A06;
    public final StringBuilder A04 = AnonymousClass001.A0k();
    public String[] A01 = null;
    public int A00 = 4;

    public C3Ti() {
        EsW esW = (EsW) 1Bn.A0A(67383);
        C1r6 c1r6 = (C1r6) 1Bi.A03(16829);
        1BQ A02 = 1BQ.A02(67382);
        this.A03 = esW;
        this.A02 = c1r6;
        this.A06 = A02;
        this.A05 = new 0WH(0);
    }

    public static final C3Ti A00() {
        return new C3Ti();
    }

    private ImmutableSet A01(String str, String str2, String str3) {
        1uX r0;
        int i;
        1I0 r02 = new 1I0(4);
        String[] strArr = new String[10];
        C1tm c1tm = (C1tm) this.A06.get();
        int i2 = 0;
        if (str != null && (i = (r0 = new 1uX(str)).A03) != r0.A02) {
            String[] strArr2 = r0.A04;
            if (c1tm.A03.contains(strArr2[i].toUpperCase(c1tm.A05))) {
                r0.A03++;
            }
            int i3 = r0.A03;
            while (i3 < r0.A02) {
                strArr[i2] = strArr2[i3];
                i3++;
                i2++;
            }
            for (int i4 = 0; i4 < i2; i4++) {
                r02.A05(strArr[i4]);
            }
        }
        if (str3 != null) {
            r02.A05(str3);
        }
        if (str2 != null) {
            r02.A05(str2);
        }
        return r02.A07();
    }

    private void A02(int i) {
        StringBuilder sb = this.A04;
        sb.setLength(0);
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 != 0) {
                sb.append('.');
            }
            sb.append(this.A01[i2]);
        }
        Set set = this.A05;
        set.add(sb.toString());
        sb.setLength(0);
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(this.A01[i3]);
        }
        set.add(sb.toString());
    }

    private void A03(int i, int i2, boolean z) {
        boolean z2;
        if (i == i2) {
            A02(i2);
            return;
        }
        String[] strArr = this.A01;
        String str = strArr[i];
        int i3 = i;
        while (true) {
            int i4 = i3;
            if (i4 >= i2) {
                return;
            }
            strArr[i] = strArr[i4];
            strArr[i4] = str;
            int i5 = i + 1;
            if (z) {
                z2 = true;
                if (i4 == i) {
                    A03(i5, i2, z2);
                    strArr = this.A01;
                    strArr[i4] = strArr[i];
                    strArr[i] = str;
                    i3 = i4 + 1;
                }
            }
            z2 = false;
            A03(i5, i2, z2);
            strArr = this.A01;
            strArr[i4] = strArr[i];
            strArr[i] = str;
            i3 = i4 + 1;
        }
    }

    private void A04(String str, String[] strArr, int i) {
        int length = strArr.length;
        this.A01 = strArr;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            String[] strArr2 = this.A01;
            if (i3 >= strArr2.length) {
                break;
            }
            strArr2[i3] = this.A03.A00(strArr2[i3]);
            i3++;
        }
        boolean z = false;
        if (length > this.A00) {
            z = true;
            A02(length);
            Arrays.sort(this.A01, 0, length, new DAk(this, 5));
            String str2 = this.A01[0];
            int i4 = this.A00;
            while (true) {
                int i5 = i4;
                if (i5 >= length) {
                    break;
                }
                String[] strArr3 = this.A01;
                strArr3[0] = strArr3[i5];
                int i6 = this.A00;
                StringBuilder sb = this.A04;
                sb.setLength(0);
                for (int i7 = 0; i7 < i6; i7++) {
                    sb.append(this.A01[i7]);
                }
                this.A05.add(sb.toString());
                i4 = i5 + 1;
            }
            this.A01[0] = str2;
            length = this.A00;
        }
        A03(0, length, !z);
        C1r6 c1r6 = this.A02;
        int intValue = Integer.valueOf(i).intValue();
        int i8 = intValue;
        if (intValue == 2) {
            String str3 = C1r6.A05;
            String str4 = c1r6.A01;
            if (!str3.equals(str4) && !C1r6.A06.equals(str4)) {
                i8 = 3;
            }
        }
        Integer valueOf = Integer.valueOf(i8);
        if (C1r6.A04.equals(c1r6.A01) && intValue == 1) {
            valueOf = 3;
        }
        Iterator A01 = C1r6.A00(c1r6, valueOf).A01(str);
        if (A01 != null) {
            while (A01.hasNext()) {
                this.A05.add(this.A03.A00(AnonymousClass001.A0i(A01)));
            }
        }
        if (i == 5) {
            int length2 = str.length();
            StringBuilder sb2 = this.A04;
            int i9 = 0;
            sb2.setLength(0);
            while (true) {
                int i10 = i9 + 1;
                int codePointAt = str.codePointAt(i9);
                if (codePointAt != 32) {
                    if (codePointAt < 4352) {
                        break;
                    }
                    if (codePointAt > 4370) {
                        if (codePointAt < 12593) {
                            break;
                        }
                        if (codePointAt <= 12622) {
                            int i11 = codePointAt - 12593;
                            if (i11 >= 30) {
                                break;
                            }
                            codePointAt = A07[i11];
                            if (codePointAt == 0) {
                                break;
                            }
                        } else if (codePointAt < 44032 || codePointAt > 55203) {
                            break;
                        } else {
                            codePointAt = ((codePointAt - 44032) / 588) + 4352;
                        }
                    }
                    sb2.appendCodePoint(codePointAt);
                    i2++;
                }
                if (i10 >= length2) {
                    break;
                } else {
                    i9 = i10;
                }
            }
            if (i2 > 1) {
                this.A05.add(this.A03.A00(sb2.toString()));
            }
        }
    }

    public void A05(Name name) {
        if (name == null || name.displayName == null) {
            return;
        }
        A04(name.displayName, 1BK.A1b(A01(name.A00(), name.firstName, name.lastName), 0), ((C1tm) this.A06.get()).A03(0));
    }

    public void A06(String str, String str2, String str3) {
        if (str != null) {
            A04(str, 1BK.A1b(A01(str, str2, str3), 0), ((C1tm) this.A06.get()).A03(0));
        }
    }
}
