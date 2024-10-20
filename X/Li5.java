package X;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: Li5.class */
public abstract class Li5 implements Closeable {
    public static final String[] A04;
    public int A00;
    public int[] A02 = new int[32];
    public String[] A03 = new String[32];
    public int[] A01 = new int[32];

    static {
        String[] strArr = new String[128];
        A04 = strArr;
        int i = 0;
        do {
            strArr[i] = String.format("\\u%04x", AnonymousClass001.A1a(i));
            i++;
        } while (i <= 31);
        JQz.A1V(strArr);
    }

    public static int A07(C3127Jjy c3127Jjy) {
        int i = c3127Jjy.A00;
        if (i == 0) {
            i = C3127Jjy.A01(c3127Jjy);
        }
        return i;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.Lwl, java.lang.RuntimeException] */
    public static Lwl A08(Li5 li5, String str) {
        return new RuntimeException(0Pz.A0v(str, KVU.A00(li5.A0E()), " at path ", li5.A0H()));
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.Lwl, java.lang.RuntimeException] */
    public static Lwl A09(Li5 li5, String str) {
        return new RuntimeException(0Pz.A0v(str, KVU.A00(li5.A0E()), " at path ", li5.A0H()));
    }

    public static void A0A(C3127Jjy c3127Jjy) {
        c3127Jjy.A00 = 0;
        int[] iArr = ((Li5) c3127Jjy).A01;
        int i = ((Li5) c3127Jjy).A00 - 1;
        iArr[i] = iArr[i] + 1;
    }

    public double A0B() {
        String A03;
        Lix lix;
        double parseDouble;
        C3127Jjy c3127Jjy = (C3127Jjy) this;
        int A07 = A07(c3127Jjy);
        if (A07 == 16) {
            A0A(c3127Jjy);
            return c3127Jjy.A02;
        }
        try {
            if (A07 == 17) {
                A03 = LwX.A00(Ky2.A00, c3127Jjy.A04, c3127Jjy.A01);
            } else {
                if (A07 == 9) {
                    lix = C3127Jjy.A06;
                } else if (A07 == 8) {
                    lix = C3127Jjy.A07;
                } else {
                    if (A07 != 10) {
                        if (A07 != 11) {
                            throw A08(c3127Jjy, "Expected a double but was ");
                        }
                        c3127Jjy.A00 = 11;
                        parseDouble = Double.parseDouble(c3127Jjy.A03);
                        if (Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble)) {
                            c3127Jjy.A03 = null;
                            A0A(c3127Jjy);
                            return parseDouble;
                        }
                        StringBuilder A0k = AnonymousClass001.A0k();
                        A0k.append("JSON forbids NaN and infinities: ");
                        A0k.append(parseDouble);
                        A0k.append(" at path ");
                        throw new IOException(AnonymousClass001.A0d(c3127Jjy.A0H(), A0k));
                    }
                    A03 = C3127Jjy.A03(c3127Jjy);
                }
                A03 = C3127Jjy.A04(c3127Jjy, lix);
            }
            parseDouble = Double.parseDouble(c3127Jjy.A03);
            if (Double.isNaN(parseDouble)) {
            }
            StringBuilder A0k2 = AnonymousClass001.A0k();
            A0k2.append("JSON forbids NaN and infinities: ");
            A0k2.append(parseDouble);
            A0k2.append(" at path ");
            throw new IOException(AnonymousClass001.A0d(c3127Jjy.A0H(), A0k2));
        } catch (NumberFormatException unused) {
            throw new RuntimeException(0Pz.A0v("Expected a double but was ", c3127Jjy.A03, " at path ", c3127Jjy.A0H()));
        }
        c3127Jjy.A03 = A03;
        c3127Jjy.A00 = 11;
    }

    public int A0C() {
        Lix lix;
        C3127Jjy c3127Jjy = (C3127Jjy) this;
        int A07 = A07(c3127Jjy);
        if (A07 == 16) {
            long j = c3127Jjy.A02;
            int i = (int) j;
            if (j != i) {
                throw new RuntimeException(0Pz.A0t("Expected an int but was ", " at path ", c3127Jjy.A0H(), j));
            }
            A0A(c3127Jjy);
            return i;
        }
        if (A07 == 17) {
            c3127Jjy.A03 = LwX.A00(Ky2.A00, c3127Jjy.A04, c3127Jjy.A01);
        } else {
            if (A07 == 9) {
                lix = C3127Jjy.A06;
            } else if (A07 == 8) {
                lix = C3127Jjy.A07;
            } else if (A07 != 11) {
                throw A08(c3127Jjy, "Expected an int but was ");
            }
            String A042 = C3127Jjy.A04(c3127Jjy, lix);
            c3127Jjy.A03 = A042;
            try {
                int parseInt = Integer.parseInt(A042);
                A0A(c3127Jjy);
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        c3127Jjy.A00 = 11;
        try {
            String str = c3127Jjy.A03;
            double parseDouble = Double.parseDouble(str);
            int i2 = (int) parseDouble;
            if (i2 != parseDouble) {
                throw new RuntimeException(0Pz.A0v("Expected an int but was ", str, " at path ", c3127Jjy.A0H()));
            }
            c3127Jjy.A03 = null;
            A0A(c3127Jjy);
            return i2;
        } catch (NumberFormatException unused2) {
            throw new RuntimeException(0Pz.A0v("Expected an int but was ", c3127Jjy.A03, " at path ", c3127Jjy.A0H()));
        }
    }

    public int A0D(L7T l7t) {
        String str;
        int i;
        C3127Jjy c3127Jjy = (C3127Jjy) this;
        int A07 = A07(c3127Jjy);
        if (A07 < 12 || A07 > 15) {
            return -1;
        }
        if (A07 != 15) {
            int CkH = c3127Jjy.A05.CkH(l7t.A00);
            if (CkH != -1) {
                c3127Jjy.A00 = 0;
                ((Li5) c3127Jjy).A03[((Li5) c3127Jjy).A00 - 1] = l7t.A01[CkH];
                return CkH;
            }
            str = ((Li5) c3127Jjy).A03[((Li5) c3127Jjy).A00 - 1];
            String A0F = c3127Jjy.A0F();
            String[] strArr = l7t.A01;
            int length = strArr.length;
            int i2 = 0;
            while (true) {
                i = i2;
                if (i >= length) {
                    i = -1;
                    break;
                }
                if (A0F.equals(strArr[i])) {
                    c3127Jjy.A00 = 0;
                    ((Li5) c3127Jjy).A03[((Li5) c3127Jjy).A00 - 1] = A0F;
                    break;
                }
                i2 = i + 1;
            }
            if (i == -1) {
                c3127Jjy.A00 = 15;
                c3127Jjy.A03 = A0F;
            }
            return i;
        }
        str = c3127Jjy.A03;
        String[] strArr2 = l7t.A01;
        int length2 = strArr2.length;
        int i3 = 0;
        while (true) {
            i = i3;
            if (i >= length2) {
                return -1;
            }
            if (str.equals(strArr2[i])) {
                c3127Jjy.A00 = 0;
                break;
            }
            i3 = i + 1;
        }
        ((Li5) c3127Jjy).A03[((Li5) c3127Jjy).A00 - 1] = str;
        return i;
    }

    public Integer A0E() {
        switch (A07((C3127Jjy) this)) {
            case 1:
                return 0S2.A0C;
            case 2:
                return 0S2.A0N;
            case 3:
                return 0S2.A00;
            case 4:
                return 0S2.A01;
            case 5:
            case 6:
                return 0S2.A15;
            case 7:
                return 0S2.A1G;
            case 8:
            case 9:
            case 10:
            case 11:
                return 0S2.A0j;
            case 12:
            case 13:
            case 14:
            case 15:
            default:
                return 0S2.A0Y;
            case 16:
            case 17:
                return 0S2.A0u;
            case 18:
                return 0S2.A1J;
        }
    }

    public String A0F() {
        String str;
        Lix lix;
        C3127Jjy c3127Jjy = (C3127Jjy) this;
        int A07 = A07(c3127Jjy);
        if (A07 == 14) {
            str = C3127Jjy.A03(c3127Jjy);
        } else {
            if (A07 == 13) {
                lix = C3127Jjy.A06;
            } else if (A07 == 12) {
                lix = C3127Jjy.A07;
            } else {
                if (A07 != 15) {
                    throw A09(c3127Jjy, "Expected a name but was ");
                }
                str = c3127Jjy.A03;
            }
            str = C3127Jjy.A04(c3127Jjy, lix);
        }
        c3127Jjy.A00 = 0;
        ((Li5) c3127Jjy).A03[((Li5) c3127Jjy).A00 - 1] = str;
        return str;
    }

    public String A0G() {
        String A00;
        Lix lix;
        C3127Jjy c3127Jjy = (C3127Jjy) this;
        int A07 = A07(c3127Jjy);
        if (A07 == 10) {
            A00 = C3127Jjy.A03(c3127Jjy);
        } else {
            if (A07 == 9) {
                lix = C3127Jjy.A06;
            } else if (A07 == 8) {
                lix = C3127Jjy.A07;
            } else if (A07 == 11) {
                A00 = c3127Jjy.A03;
                c3127Jjy.A03 = null;
            } else if (A07 == 16) {
                A00 = Long.toString(c3127Jjy.A02);
            } else {
                if (A07 != 17) {
                    throw A09(c3127Jjy, "Expected a string but was ");
                }
                A00 = LwX.A00(Ky2.A00, c3127Jjy.A04, c3127Jjy.A01);
            }
            A00 = C3127Jjy.A04(c3127Jjy, lix);
        }
        A0A(c3127Jjy);
        return A00;
    }

    public final String A0H() {
        int i = this.A00;
        int[] iArr = this.A02;
        String[] strArr = this.A03;
        int[] iArr2 = this.A01;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append('$');
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= i) {
                return A0k.toString();
            }
            int i4 = iArr[i3];
            if (i4 == 1 || i4 == 2) {
                A0k.append('[');
                A0k.append(iArr2[i3]);
                A0k.append(']');
            } else if (i4 == 3 || i4 == 4 || i4 == 5) {
                A0k.append('.');
                String str = strArr[i3];
                if (str != null) {
                    A0k.append(str);
                }
            }
            i2 = i3 + 1;
        }
    }

    public void A0I() {
        C3127Jjy c3127Jjy = (C3127Jjy) this;
        if (A07(c3127Jjy) != 3) {
            throw A09(c3127Jjy, "Expected BEGIN_ARRAY but was ");
        }
        c3127Jjy.A0O(1);
        ((Li5) c3127Jjy).A01[((Li5) c3127Jjy).A00 - 1] = 0;
        c3127Jjy.A00 = 0;
    }

    public void A0J() {
        C3127Jjy c3127Jjy = (C3127Jjy) this;
        if (A07(c3127Jjy) != 1) {
            throw A09(c3127Jjy, "Expected BEGIN_OBJECT but was ");
        }
        c3127Jjy.A0O(3);
        c3127Jjy.A00 = 0;
    }

    public void A0K() {
        C3127Jjy c3127Jjy = (C3127Jjy) this;
        if (A07(c3127Jjy) != 4) {
            throw A09(c3127Jjy, "Expected END_ARRAY but was ");
        }
        int i = ((Li5) c3127Jjy).A00 - 1;
        ((Li5) c3127Jjy).A00 = i;
        JQx.A1U(((Li5) c3127Jjy).A01, i - 1);
        c3127Jjy.A00 = 0;
    }

    public void A0L() {
        C3127Jjy c3127Jjy = (C3127Jjy) this;
        if (A07(c3127Jjy) != 2) {
            throw A09(c3127Jjy, "Expected END_OBJECT but was ");
        }
        int i = ((Li5) c3127Jjy).A00 - 1;
        ((Li5) c3127Jjy).A00 = i;
        ((Li5) c3127Jjy).A03[i] = null;
        JQx.A1U(((Li5) c3127Jjy).A01, i - 1);
        c3127Jjy.A00 = 0;
    }

    public void A0M() {
        Lix lix;
        C3127Jjy c3127Jjy = (C3127Jjy) this;
        int A07 = A07(c3127Jjy);
        if (A07 == 14) {
            long BOc = c3127Jjy.A05.BOc(C3127Jjy.A08);
            LwX lwX = c3127Jjy.A04;
            if (BOc == -1) {
                BOc = lwX.A00;
            }
            lwX.D0k(BOc);
        } else {
            if (A07 == 13) {
                lix = C3127Jjy.A06;
            } else if (A07 == 12) {
                lix = C3127Jjy.A07;
            } else if (A07 != 15) {
                throw A09(c3127Jjy, "Expected a name but was ");
            }
            C3127Jjy.A05(c3127Jjy, lix);
        }
        c3127Jjy.A00 = 0;
        ((Li5) c3127Jjy).A03[((Li5) c3127Jjy).A00 - 1] = "null";
    }

    public void A0N() {
        Lix lix;
        C3127Jjy c3127Jjy = (C3127Jjy) this;
        int i = 0;
        do {
            int A07 = A07(c3127Jjy);
            if (A07 == 3) {
                c3127Jjy.A0O(1);
            } else if (A07 == 1) {
                c3127Jjy.A0O(3);
            } else {
                if (A07 == 4) {
                    i--;
                    if (i < 0) {
                        throw A08(c3127Jjy, "Expected a value but was ");
                    }
                } else if (A07 == 2) {
                    i--;
                    if (i < 0) {
                        throw A08(c3127Jjy, "Expected a value but was ");
                    }
                } else {
                    if (A07 == 14 || A07 == 10) {
                        long BOc = c3127Jjy.A05.BOc(C3127Jjy.A08);
                        LwX lwX = c3127Jjy.A04;
                        if (BOc == -1) {
                            BOc = lwX.A00;
                        }
                        lwX.D0k(BOc);
                    } else {
                        if (A07 == 9 || A07 == 13) {
                            lix = C3127Jjy.A06;
                        } else if (A07 == 8 || A07 == 12) {
                            lix = C3127Jjy.A07;
                        } else if (A07 == 17) {
                            c3127Jjy.A04.D0k(c3127Jjy.A01);
                        } else if (A07 == 18) {
                            throw A08(c3127Jjy, "Expected a value but was ");
                        }
                        C3127Jjy.A05(c3127Jjy, lix);
                    }
                    c3127Jjy.A00 = 0;
                }
                ((Li5) c3127Jjy).A00--;
                c3127Jjy.A00 = 0;
            }
            i++;
            c3127Jjy.A00 = 0;
        } while (i != 0);
        int[] iArr = ((Li5) c3127Jjy).A01;
        int i2 = ((Li5) c3127Jjy).A00 - 1;
        JQx.A1U(iArr, i2);
        ((Li5) c3127Jjy).A03[i2] = "null";
    }

    public final void A0O(int i) {
        int i2 = this.A00;
        int[] iArr = this.A02;
        int length = iArr.length;
        if (i2 == length) {
            if (i2 == 256) {
                throw new RuntimeException(0Pz.A0W("Nesting too deep at ", A0H()));
            }
            this.A02 = Arrays.copyOf(iArr, length * 2);
            String[] strArr = this.A03;
            this.A03 = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.A01;
            this.A01 = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.A02;
        int i3 = this.A00;
        this.A00 = i3 + 1;
        iArr3[i3] = i;
    }

    public final void A0P(String str) {
        throw new IOException(0Pz.A0j(str, " at path ", A0H()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (r0 == 18) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0Q() {
        /*
            r301 = this;
            r0 = r301
            r302 = r0
            r0 = r301
            X.Jjy r0 = (X.C3127Jjy) r0
            r302 = r0
            r0 = r302
            int r0 = A07(r0)
            r303 = r0
            r0 = 2
            r304 = r0
            r0 = r303
            r1 = r304
            if (r0 == r1) goto L26
            r0 = 4
            r304 = r0
            r0 = r303
            r1 = r304
            if (r0 == r1) goto L26
            r0 = 18
            r305 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            r1 = r305
            if (r0 != r1) goto L2a
        L26:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L2a:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Li5.A0Q():boolean");
    }

    public boolean A0R() {
        C3127Jjy c3127Jjy = (C3127Jjy) this;
        int A07 = A07(c3127Jjy);
        if (A07 == 5) {
            c3127Jjy.A00 = 0;
            JQx.A1U(((Li5) c3127Jjy).A01, ((Li5) c3127Jjy).A00 - 1);
            return true;
        }
        if (A07 != 6) {
            throw A09(c3127Jjy, "Expected a boolean but was ");
        }
        c3127Jjy.A00 = 0;
        JQx.A1U(((Li5) c3127Jjy).A01, ((Li5) c3127Jjy).A00 - 1);
        return false;
    }
}
