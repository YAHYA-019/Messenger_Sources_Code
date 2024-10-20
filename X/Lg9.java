package X;

import com.facebook.acra.constants.ActionId;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* loaded from: Lg9.class */
public final class Lg9 implements ML1 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final KoO A04;
    public final MQo A05;
    public final int[] A06;
    public final int[] A07;
    public final Object[] A08;
    public final Kwd A09;
    public final Kwe A0A;
    public final KYf A0B;
    public final L1D A0C;
    public final boolean A0D;
    public static final int[] A0F = new int[0];
    public static final Unsafe A0E = LDw.A03();

    public Lg9(Kwd kwd, KoO koO, Kwe kwe, MQo mQo, KYf kYf, L1D l1d, int[] iArr, int[] iArr2, Object[] objArr, int i, int i2, int i3, int i4) {
        this.A06 = iArr;
        this.A08 = objArr;
        this.A02 = i;
        this.A01 = i2;
        this.A0D = mQo instanceof KDF;
        this.A07 = iArr2;
        this.A00 = i3;
        this.A03 = i4;
        this.A0B = kYf;
        this.A04 = koO;
        this.A0C = l1d;
        this.A09 = kwd;
        this.A05 = mQo;
        this.A0A = kwe;
    }

    private int A00(int i) {
        int i2;
        if (i >= this.A02 && i <= this.A01) {
            int i3 = 0;
            int[] iArr = this.A06;
            int length = (iArr.length / 3) - 1;
            while (true) {
                i2 = -1;
                if (i3 > length) {
                    break;
                }
                int i4 = (length + i3) >>> 1;
                i2 = i4 * 3;
                int i5 = iArr[i2];
                if (i == i5) {
                    break;
                }
                if (i < i5) {
                    length = i4 - 1;
                } else {
                    i3 = i4 + 1;
                }
            }
        } else {
            i2 = -1;
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002a, code lost:
    
        if (r309 >= 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A01(X.L0K r301, X.ML1 r302, java.lang.Object r303, byte[] r304, int r305, int r306) {
        /*
            r0 = r305
            r1 = 1
            int r0 = r0 + r1
            r307 = r0
            r0 = r304
            r308 = r0
            r0 = r304
            r1 = r305
            r0 = r0[r1]
            r309 = r0
            r0 = r301
            r310 = r0
            r0 = r309
            if (r0 >= 0) goto L2d
            r0 = r301
            r1 = r304
            r2 = r309
            r3 = r307
            int r0 = A08(r0, r1, r2, r3)
            r307 = r0
            r0 = r301
            int r0 = r0.A00
            r309 = r0
            r0 = r309
            if (r0 < 0) goto L59
        L2d:
            r0 = r306
            r1 = r307
            int r0 = r0 - r1
            r306 = r0
            r0 = r309
            r1 = r306
            if (r0 > r1) goto L59
            r0 = r309
            r1 = r307
            int r0 = r0 + r1
            r309 = r0
            r0 = r302
            r1 = r310
            r2 = r303
            r3 = r308
            r4 = r307
            r5 = r309
            r0.Be6(r1, r2, r3, r4, r5)
            r0 = r301
            r1 = r303
            r0.A02 = r1
            r0 = r309
            return r0
        L59:
            java.lang.String r0 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            X.KLr r0 = X.KLr.A01(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Lg9.A01(X.L0K, X.ML1, java.lang.Object, byte[], int, int):int");
    }

    public static int A02(L0K l0k, ML1 ml1, Object obj, byte[] bArr, int i, int i2, int i3) {
        int A0U = ((Lg9) ml1).A0U(l0k, obj, bArr, i, i2, i3);
        l0k.A02 = obj;
        return A0U;
    }

    public static int A03(L0K l0k, ML1 ml1, byte[] bArr, int i, int i2, int i3) {
        Object BfF = ml1.BfF();
        int A02 = A02(l0k, ml1, BfF, bArr, i, i2, i3);
        ml1.BcF(BfF);
        l0k.A02 = BfF;
        return A02;
    }

    public static int A04(L0K l0k, L8w l8w, byte[] bArr, int i, int i2, int i3) {
        int i4 = i2;
        if ((i >>> 3) != 0) {
            int i5 = i & 7;
            if (i5 == 0) {
                int A07 = A07(l0k, bArr, i2);
                l8w.A02(i, Long.valueOf(l0k.A01));
                return A07;
            }
            if (i5 == 1) {
                l8w.A02(i, Long.valueOf(JR2.A0F(bArr, i2)));
                return i2 + 8;
            }
            if (i5 == 2) {
                int A06 = A06(l0k, bArr, i2);
                int i6 = l0k.A00;
                if (i6 < 0) {
                    throw KLr.A01("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                }
                if (i6 > bArr.length - A06) {
                    throw KLr.A01("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                l8w.A02(i, i6 == 0 ? Lj4.A00 : Lj4.A01(bArr, A06, i6));
                return A06 + i6;
            }
            if (i5 == 3) {
                L8w l8w2 = new L8w();
                int i7 = (i & (-8)) | 4;
                int i8 = 0;
                while (i4 < i3) {
                    i4 = A06(l0k, bArr, i4);
                    i8 = l0k.A00;
                    if (i8 == i7) {
                        break;
                    }
                    i4 = A04(l0k, l8w2, bArr, i8, i4, i3);
                }
                if (i4 > i3 || i8 != i7) {
                    throw KLr.A01("Failed to parse the message.");
                }
                l8w.A02(i, l8w2);
                return i4;
            }
            if (i5 == 5) {
                l8w.A02(i, Integer.valueOf(JR2.A08(bArr, i2)));
                return i2 + 4;
            }
        }
        throw KLr.A01("Protocol message contained an invalid tag (zero).");
    }

    public static int A05(L0K l0k, byte[] bArr, int i) {
        int A06 = A06(l0k, bArr, i);
        int i2 = l0k.A00;
        if (i2 < 0) {
            throw KLr.A01("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 > bArr.length - A06) {
            throw KLr.A01("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i2 == 0) {
            l0k.A02 = Lj4.A00;
            return A06;
        }
        l0k.A02 = Lj4.A01(bArr, A06, i2);
        return A06 + i2;
    }

    public static int A06(L0K l0k, byte[] bArr, int i) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return A08(l0k, bArr, b, i2);
        }
        l0k.A00 = b;
        return i2;
    }

    public static int A07(L0K l0k, byte[] bArr, int i) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            l0k.A01 = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b < 0) {
            b = bArr[i3];
            i4 += 7;
            j2 |= (b & Byte.MAX_VALUE) << i4;
            i3++;
        }
        l0k.A01 = j2;
        return i3;
    }

    public static int A08(L0K l0k, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = i & 127;
        int i7 = i2 + 1;
        byte b = bArr[i2];
        if (b < 0) {
            int i8 = i6 | ((b & 127) << 7);
            int i9 = i7 + 1;
            byte b2 = bArr[i7];
            if (b2 >= 0) {
                i4 = b2 << 14;
            } else {
                i6 = i8 | ((b2 & 127) << 14);
                i7 = i9 + 1;
                byte b3 = bArr[i9];
                i3 = b3 << 21;
                if (b3 < 0) {
                    i8 = i6 | ((b3 & 127) << 21);
                    i9 = i7 + 1;
                    byte b4 = bArr[i7];
                    i4 = b4 << 28;
                    if (b4 < 0) {
                        i5 = i8 | ((b4 & 127) << 28);
                        while (true) {
                            i7 = i9 + 1;
                            if (bArr[i9] >= 0) {
                                break;
                            }
                            i9 = i7;
                        }
                        l0k.A00 = i5;
                        return i7;
                    }
                }
            }
            l0k.A00 = i8 | i4;
            return i9;
        }
        i3 = b << 7;
        i5 = i6 | i3;
        l0k.A00 = i5;
        return i7;
    }

    public static int A09(List list) {
        L1D l1d = Kyg.A01;
        return list.size();
    }

    public static long A0A(LCz lCz, int i) {
        long j = i & 1048575;
        LCz.A02(lCz, 0);
        return j;
    }

    public static long A0B(LCz lCz, int i) {
        long j = i & 1048575;
        LCz.A02(lCz, 1);
        return j;
    }

    public static long A0C(LCz lCz, int i) {
        long j = i & 1048575;
        LCz.A02(lCz, 5);
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x03e7, code lost:
    
        if ((r337 & 2048) == 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0569, code lost:
    
        if ((r337 & 2048) == 0) goto L115;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0695  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x06b3  */
    /* JADX WARN: Type inference failed for: r0v154, types: [int] */
    /* JADX WARN: Type inference failed for: r0v172, types: [int] */
    /* JADX WARN: Type inference failed for: r0v190, types: [int] */
    /* JADX WARN: Type inference failed for: r0v208, types: [int] */
    /* JADX WARN: Type inference failed for: r0v254 */
    /* JADX WARN: Type inference failed for: r0v283 */
    /* JADX WARN: Type inference failed for: r0v348, types: [int] */
    /* JADX WARN: Type inference failed for: r0v377 */
    /* JADX WARN: Type inference failed for: r0v398 */
    /* JADX WARN: Type inference failed for: r0v415 */
    /* JADX WARN: Type inference failed for: r0v419 */
    /* JADX WARN: Type inference failed for: r0v425 */
    /* JADX WARN: Type inference failed for: r0v525 */
    /* JADX WARN: Type inference failed for: r0v544, types: [int] */
    /* JADX WARN: Type inference failed for: r0v566, types: [int] */
    /* JADX WARN: Type inference failed for: r0v583, types: [int] */
    /* JADX WARN: Type inference failed for: r0v611, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.Lg9 A0D(X.Kwd r301, X.KoO r302, X.Kwe r303, X.KYf r304, X.KkX r305, X.L1D r306) {
        /*
            Method dump skipped, instructions count: 2619
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Lg9.A0D(X.Kwd, X.KoO, X.Kwe, X.KYf, X.KkX, X.L1D):X.Lg9");
    }

    private ML1 A0E(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.A08;
        ML1 ml1 = (ML1) objArr[i2];
        if (ml1 == null) {
            ml1 = L25.A02.A00((Class) objArr[i2 + 1]);
            objArr[i2] = ml1;
        }
        return ml1;
    }

    private Object A0F(int i, int i2, Object obj) {
        Object object;
        ML1 A0E2 = A0E(i2);
        if (A0S(obj, i, i2)) {
            object = A0E.getObject(obj, JQx.A0S(this.A06, i2 + 1));
            if (!A0R(object)) {
                Object BfF = A0E2.BfF();
                if (object != null) {
                    A0E2.Be4(BfF, object);
                }
                return BfF;
            }
        } else {
            object = A0E2.BfF();
        }
        return object;
    }

    private Object A0G(Object obj, int i) {
        Object object;
        ML1 A0E2 = A0E(i);
        long A0S = JQx.A0S(this.A06, i + 1);
        if (A0Q(i, obj)) {
            object = A0E.getObject(obj, A0S);
            if (!A0R(object)) {
                Object BfF = A0E2.BfF();
                if (object != null) {
                    A0E2.Be4(BfF, object);
                }
                return BfF;
            }
        } else {
            object = A0E2.BfF();
        }
        return object;
    }

    public static Field A0H(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            int length = declaredFields.length;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    throw AnonymousClass001.A0T(0Pz.A10("Field ", str, " for ", cls.getName(), " not found. Known fields are ", Arrays.toString(declaredFields)));
                }
                Field field = declaredFields[i2];
                if (str.equals(field.getName())) {
                    return field;
                }
                i = i2 + 1;
            }
        }
    }

    public static List A0I(Lg9 lg9, Object obj, int i) {
        return lg9.A04.A01(obj, i & 1048575);
    }

    private void A0J(int i, int i2, Object obj, Object obj2) {
        Unsafe unsafe = A0E;
        int[] iArr = this.A06;
        unsafe.putObject(obj, iArr[i2 + 1] & 1048575, obj2);
        LDw.A04(obj, iArr[i2 + 2] & 1048575, i);
    }

    private void A0K(LCz lCz, Object obj, int i) {
        long A0N;
        Object A0T;
        if ((536870912 & i) != 0) {
            A0N = JQx.A0N(i);
            LCz.A02(lCz, 2);
            A0T = lCz.A03.A0U();
        } else {
            boolean z = this.A0D;
            A0N = JQx.A0N(i);
            LCz.A02(lCz, 2);
            KTf kTf = lCz.A03;
            A0T = z ? kTf.A0T() : kTf.A0S();
        }
        LDw.A05(obj, A0N, A0T);
    }

    public static void A0L(Kp1 kp1, ML1 ml1, Object obj, int i) {
        KBw kBw = kp1.A00;
        int i2 = i << 3;
        kBw.A04(i2 | 3);
        ml1.DBK(kBw.A01, obj);
        kBw.A04(i2 | 4);
    }

    public static void A0M(Object obj) {
        if (!A0R(obj)) {
            throw AnonymousClass002.A0C(obj, "Mutating immutable message: ", AnonymousClass001.A0k());
        }
    }

    private void A0N(Object obj, int i) {
        int i2 = this.A06[i + 2];
        long j = 1048575 & i2;
        if (j != 1048575) {
            LDw.A04(obj, j, (1 << (i2 >>> 20)) | LDw.A01.A05(obj, j));
        }
    }

    private void A0O(Object obj, int i, Object obj2) {
        A0E.putObject(obj, JQx.A0S(this.A06, i + 1), obj2);
        A0N(obj, i);
    }

    public static void A0P(Object obj, int[] iArr, int i) {
        LDw.A01.A07(obj, iArr[i + 1] & 1048575);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x01bb, code lost:
    
        r310 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e9, code lost:
    
        if (java.lang.Float.floatToRawIntBits(X.LDw.A01.A03(r303, r0)) != 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0147, code lost:
    
        if (X.LDw.A01.A05(r303, r0) != 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0165, code lost:
    
        if (X.LDw.A01.A06(r303, r0) != 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x01b8, code lost:
    
        if (X.L5W.A00(r303, r0) != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01a8, code lost:
    
        if ((X.LDw.A01.A05(r303, r0) & (1 << (r0 >>> 20))) != 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00cb, code lost:
    
        if (java.lang.Double.doubleToRawLongBits(X.LDw.A01.A02(r303, r0)) != 0) goto L39;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0052. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0Q(int r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Lg9.A0Q(int, java.lang.Object):boolean");
    }

    public static boolean A0R(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof KDF) {
            return AnonymousClass001.A1N(((KDF) obj).memoizedSerializedSize & ((-1) << (-1)));
        }
        return true;
    }

    private boolean A0S(Object obj, int i, int i2) {
        return AnonymousClass001.A1Q(LDw.A01.A05(obj, JQx.A0S(this.A06, i2 + 2)), i);
    }

    private boolean A0T(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? A0Q(i, obj) : AnonymousClass001.A1N(i3 & i4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:164:0x06d2. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:383:0x0c6d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:43:0x01bc. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:174:0x1121 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0b14 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x026b A[LOOP:2: B:54:0x025d->B:56:0x026b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x10cd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x108c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int A0U(X.L0K r302, java.lang.Object r303, byte[] r304, int r305, int r306, int r307) {
        /*
            Method dump skipped, instructions count: 4391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Lg9.A0U(X.L0K, java.lang.Object, byte[], int, int, int):int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0032. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0154 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0332 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0154 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0332 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0154 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0332 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v114, types: [int] */
    /* JADX WARN: Type inference failed for: r0v116, types: [int] */
    @Override // X.ML1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean AQr(java.lang.Object r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 821
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Lg9.AQr(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:352:0x0eee, code lost:
    
        if (r328 >= 0) goto L306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x10e2, code lost:
    
        if (r328 >= 0) goto L306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0439, code lost:
    
        if (r328 < 0) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x10f4, code lost:
    
        r318 = 10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x10e5, code lost:
    
        r0 = X.KBw.A05;
        r318 = X.JR2.A04(r328);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x009f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0820  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01c0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0fe7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x1006  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x1060  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x1085  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c0 A[SYNTHETIC] */
    @Override // X.ML1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int BA4(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 4571
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Lg9.BA4(java.lang.Object):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x003a. Please report as an issue. */
    @Override // X.ML1
    public int BNo(Object obj) {
        int i;
        int hashCode;
        long A05;
        boolean A1V;
        float A00;
        double A002;
        int[] iArr = this.A06;
        int length = iArr.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int i4 = iArr[i3 + 1];
            int i5 = iArr[i3];
            long A0N = JQx.A0N(i4);
            switch (JQx.A06(i4)) {
                case 0:
                    i = i2 * 53;
                    A002 = LDw.A01.A02(obj, A0N);
                    A05 = Double.doubleToLongBits(A002);
                    Charset charset = KdF.A04;
                    hashCode = 1BL.A01(A05);
                    i2 = i + hashCode;
                    break;
                case 1:
                    i = i2 * 53;
                    A00 = LDw.A01.A03(obj, A0N);
                    hashCode = Float.floatToIntBits(A00);
                    i2 = i + hashCode;
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    i = i2 * 53;
                    A05 = LDw.A01.A06(obj, A0N);
                    Charset charset2 = KdF.A04;
                    hashCode = 1BL.A01(A05);
                    i2 = i + hashCode;
                    break;
                case 4:
                case 6:
                case 11:
                case 12:
                case 13:
                case 15:
                    i = i2 * 53;
                    hashCode = LDw.A01.A05(obj, A0N);
                    i2 = i + hashCode;
                    break;
                case 7:
                    i = i2 * 53;
                    A1V = LDw.A01.A0J(obj, A0N);
                    Charset charset3 = KdF.A04;
                    hashCode = AnonymousClass002.A00(A1V ? 1 : 0);
                    i2 = i + hashCode;
                    break;
                case 8:
                    i = i2 * 53;
                    hashCode = ((String) L5W.A00(obj, A0N)).hashCode();
                    i2 = i + hashCode;
                    break;
                case 9:
                case 17:
                    hashCode = JQz.A0E(L5W.A00(obj, A0N), 37);
                    i = i2 * 53;
                    i2 = i + hashCode;
                    break;
                case 10:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                case ActionId.ON_CREATE_VIEW_END /* 45 */:
                case 46:
                case ActionId.ON_START_END /* 47 */:
                case ActionId.QUEUED /* 48 */:
                case ActionId.IN_PROGRESS /* 49 */:
                case 50:
                    i = i2 * 53;
                    hashCode = L5W.A00(obj, A0N).hashCode();
                    i2 = i + hashCode;
                    break;
                case ActionId.UNKNOWN /* 51 */:
                    if (A0S(obj, i5, i3)) {
                        i = i2 * 53;
                        A002 = DKC.A00(L5W.A00(obj, A0N));
                        A05 = Double.doubleToLongBits(A002);
                        Charset charset22 = KdF.A04;
                        hashCode = 1BL.A01(A05);
                        i2 = i + hashCode;
                        break;
                    } else {
                        break;
                    }
                case ActionId.RETRY_AFTER_FAILURE /* 52 */:
                    if (A0S(obj, i5, i3)) {
                        i = i2 * 53;
                        A00 = 7zM.A00(L5W.A00(obj, A0N));
                        hashCode = Float.floatToIntBits(A00);
                        i2 = i + hashCode;
                        break;
                    } else {
                        break;
                    }
                case ActionId.RETRY_AFTER_RECONNECT /* 53 */:
                case ActionId.QUEUEING_BEGIN /* 54 */:
                case ActionId.QUEUEING_FAIL /* 56 */:
                case ActionId.INTERACTION_LOAD_PAGE_HEADER /* 65 */:
                case ActionId.INTERACTION_LOAD_PERMALINK /* 67 */:
                    if (A0S(obj, i5, i3)) {
                        i = i2 * 53;
                        A05 = AnonymousClass001.A05(L5W.A00(obj, A0N));
                        Charset charset222 = KdF.A04;
                        hashCode = 1BL.A01(A05);
                        i2 = i + hashCode;
                        break;
                    } else {
                        break;
                    }
                case ActionId.QUEUEING_SUCCESS /* 55 */:
                case ActionId.MESSAGE_UPDATE_START /* 57 */:
                case ActionId.INTERACTION_LOAD_TIMELINE_HEADER /* 62 */:
                case 63:
                case 64:
                case ActionId.INTERACTION_LOAD_PAGE_HEADER_ADMIN /* 66 */:
                    if (A0S(obj, i5, i3)) {
                        i = i2 * 53;
                        hashCode = AnonymousClass001.A03(L5W.A00(obj, A0N));
                        i2 = i + hashCode;
                        break;
                    } else {
                        break;
                    }
                case ActionId.MESSAGE_UPDATE_END /* 58 */:
                    if (A0S(obj, i5, i3)) {
                        i = i2 * 53;
                        A1V = AnonymousClass001.A1V(L5W.A00(obj, A0N));
                        Charset charset32 = KdF.A04;
                        hashCode = AnonymousClass002.A00(A1V ? 1 : 0);
                        i2 = i + hashCode;
                        break;
                    } else {
                        break;
                    }
                case ActionId.PHOTO_CAPTURED /* 59 */:
                    if (!A0S(obj, i5, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    hashCode = ((String) L5W.A00(obj, A0N)).hashCode();
                    i2 = i + hashCode;
                    break;
                case ActionId.MEDIA_PREVIEW_VISIBLE /* 60 */:
                case ActionId.COUNTER /* 61 */:
                case ActionId.INTERACTION_OPEN_COMPOSER /* 68 */:
                    if (!A0S(obj, i5, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    hashCode = L5W.A00(obj, A0N).hashCode();
                    i2 = i + hashCode;
                    break;
            }
        }
        return 1BK.A03(((KDF) obj).unknownFields, i2 * 53);
    }

    @Override // X.ML1
    public final boolean BTV(Object obj) {
        boolean A0T;
        int i = 1048575;
        int i2 = 0;
        int i3 = 0;
        while (i3 < this.A00) {
            int i4 = this.A07[i3];
            int[] iArr = this.A06;
            int i5 = iArr[i4];
            int i6 = iArr[i4 + 1];
            int i7 = iArr[i4 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 == i) {
                i8 = i;
            } else if (i8 != 1048575) {
                i2 = A0E.getInt(obj, i8);
            }
            if ((268435456 & i6) != 0 && !A0T(obj, i4, i8, i2, i9)) {
                return false;
            }
            int A06 = JQx.A06(i6);
            if (A06 == 9 || A06 == 17) {
                A0T = A0T(obj, i4, i8, i2, i9);
            } else {
                if (A06 != 27) {
                    if (A06 == 60 || A06 == 68) {
                        A0T = A0S(obj, i5, i4);
                    } else if (A06 != 49) {
                        if (A06 == 50 && !((Lyg) L5W.A00(obj, i6 & 1048575)).isEmpty()) {
                            throw AnonymousClass001.A0Q("getMetadata");
                        }
                        i3++;
                        i = i8;
                    }
                }
                List list = (List) L5W.A00(obj, i6 & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    ML1 A0E2 = A0E(i4);
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        if (!A0E2.BTV(list.get(i10))) {
                            return false;
                        }
                    }
                }
                i3++;
                i = i8;
            }
            if (A0T && !A0E(i4).BTV(L5W.A00(obj, i6 & 1048575))) {
                return false;
            }
            i3++;
            i = i8;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012c A[SYNTHETIC] */
    @Override // X.ML1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void BcF(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 587
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Lg9.BcF(java.lang.Object):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0047. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v156, types: [java.util.List] */
    @Override // X.ML1
    public void Be4(Object obj, Object obj2) {
        A0M(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int i2 = i;
            int[] iArr = this.A06;
            if (i2 >= iArr.length) {
                Kyg.A00(obj, obj2);
                return;
            }
            int i3 = i2 + 1;
            int i4 = iArr[i3];
            long A0N = JQx.A0N(i4);
            int i5 = iArr[i2];
            switch (JQx.A06(i4)) {
                case 0:
                    if (A0Q(i2, obj2)) {
                        L5W l5w = LDw.A01;
                        l5w.A0A(obj, A0N, l5w.A02(obj2, A0N));
                        A0N(obj, i2);
                        i = i2 + 3;
                    } else {
                        i = i2 + 3;
                    }
                case 1:
                    if (A0Q(i2, obj2)) {
                        L5W l5w2 = LDw.A01;
                        l5w2.A0B(obj, A0N, l5w2.A03(obj2, A0N));
                        A0N(obj, i2);
                        i = i2 + 3;
                    } else {
                        i = i2 + 3;
                    }
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    if (A0Q(i2, obj2)) {
                        L5W l5w3 = LDw.A01;
                        l5w3.A0D(obj, A0N, l5w3.A06(obj2, A0N));
                        A0N(obj, i2);
                        i = i2 + 3;
                    } else {
                        i = i2 + 3;
                    }
                case 4:
                case 6:
                case 11:
                case 12:
                case 13:
                case 15:
                    if (A0Q(i2, obj2)) {
                        LDw.A04(obj, A0N, LDw.A01.A05(obj2, A0N));
                        A0N(obj, i2);
                        i = i2 + 3;
                    } else {
                        i = i2 + 3;
                    }
                case 7:
                    if (A0Q(i2, obj2)) {
                        L5W l5w4 = LDw.A01;
                        l5w4.A0F(obj, A0N, l5w4.A0J(obj2, A0N));
                        A0N(obj, i2);
                        i = i2 + 3;
                    } else {
                        i = i2 + 3;
                    }
                case 8:
                case 10:
                    if (A0Q(i2, obj2)) {
                        LDw.A05(obj, A0N, L5W.A00(obj2, A0N));
                        A0N(obj, i2);
                        i = i2 + 3;
                    } else {
                        i = i2 + 3;
                    }
                case 9:
                case 17:
                    if (A0Q(i2, obj2)) {
                        long A0S = JQx.A0S(iArr, i3);
                        Unsafe unsafe = A0E;
                        Object object = unsafe.getObject(obj2, A0S);
                        if (object == null) {
                            StringBuilder A0k = AnonymousClass001.A0k();
                            A0k.append("Source subfield ");
                            A0k.append(iArr[i2]);
                            throw 1BL.A0h(obj2, " is present but null: ", A0k);
                        }
                        ML1 A0E2 = A0E(i2);
                        if (A0Q(i2, obj)) {
                            Object object2 = unsafe.getObject(obj, A0S);
                            if (!A0R(object2)) {
                                Object BfF = A0E2.BfF();
                                A0E2.Be4(BfF, object2);
                                unsafe.putObject(obj, A0S, BfF);
                                object2 = BfF;
                            }
                            A0E2.Be4(object2, object);
                        } else {
                            if (A0R(object)) {
                                Object BfF2 = A0E2.BfF();
                                A0E2.Be4(BfF2, object);
                                unsafe.putObject(obj, A0S, BfF2);
                            } else {
                                unsafe.putObject(obj, A0S, object);
                            }
                            A0N(obj, i2);
                        }
                    } else {
                        continue;
                    }
                    i = i2 + 3;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                case ActionId.ON_CREATE_VIEW_END /* 45 */:
                case 46:
                case ActionId.ON_START_END /* 47 */:
                case ActionId.QUEUED /* 48 */:
                case ActionId.IN_PROGRESS /* 49 */:
                    if (this.A04 instanceof KDH) {
                        L5W l5w5 = LDw.A01;
                        MRQ mrq = (MRQ) l5w5.A07(obj, A0N);
                        MRQ mrq2 = (List) l5w5.A07(obj2, A0N);
                        int size = mrq.size();
                        int size2 = mrq2.size();
                        if (size > 0) {
                            if (size2 > 0) {
                                if (!((LyA) mrq).A00) {
                                    mrq = mrq.Bek(size2 + size);
                                }
                                mrq.addAll(mrq2);
                            }
                            mrq2 = mrq;
                        }
                        LDw.A05(obj, A0N, mrq2);
                    } else {
                        List list = (List) L5W.A00(obj2, A0N);
                        List A00 = KDI.A00(obj, list.size(), A0N);
                        int size3 = A00.size();
                        int size4 = list.size();
                        if (size3 > 0) {
                            if (size4 > 0) {
                                A00.addAll(list);
                            }
                            list = A00;
                        }
                        LDw.A05(obj, A0N, list);
                    }
                    i = i2 + 3;
                case 50:
                    L1D l1d = Kyg.A01;
                    L5W l5w6 = LDw.A01;
                    LDw.A05(obj, A0N, Kwe.A00(l5w6.A07(obj, A0N), l5w6.A07(obj2, A0N)));
                    i = i2 + 3;
                case ActionId.UNKNOWN /* 51 */:
                case ActionId.RETRY_AFTER_FAILURE /* 52 */:
                case ActionId.RETRY_AFTER_RECONNECT /* 53 */:
                case ActionId.QUEUEING_BEGIN /* 54 */:
                case ActionId.QUEUEING_SUCCESS /* 55 */:
                case ActionId.QUEUEING_FAIL /* 56 */:
                case ActionId.MESSAGE_UPDATE_START /* 57 */:
                case ActionId.MESSAGE_UPDATE_END /* 58 */:
                case ActionId.PHOTO_CAPTURED /* 59 */:
                case ActionId.COUNTER /* 61 */:
                case ActionId.INTERACTION_LOAD_TIMELINE_HEADER /* 62 */:
                case 63:
                case 64:
                case ActionId.INTERACTION_LOAD_PAGE_HEADER /* 65 */:
                case ActionId.INTERACTION_LOAD_PAGE_HEADER_ADMIN /* 66 */:
                case ActionId.INTERACTION_LOAD_PERMALINK /* 67 */:
                    if (A0S(obj2, i5, i2)) {
                        LDw.A05(obj, A0N, L5W.A00(obj2, A0N));
                        LDw.A04(obj, JQx.A0S(iArr, i2 + 2), i5);
                        i = i2 + 3;
                    } else {
                        i = i2 + 3;
                    }
                case ActionId.MEDIA_PREVIEW_VISIBLE /* 60 */:
                case ActionId.INTERACTION_OPEN_COMPOSER /* 68 */:
                    if (A0S(obj2, i5, i2)) {
                        long A0S2 = JQx.A0S(iArr, i3);
                        Unsafe unsafe2 = A0E;
                        Object object3 = unsafe2.getObject(obj2, A0S2);
                        if (object3 == null) {
                            StringBuilder A0k2 = AnonymousClass001.A0k();
                            A0k2.append("Source subfield ");
                            A0k2.append(iArr[i2]);
                            throw 1BL.A0h(obj2, " is present but null: ", A0k2);
                        }
                        ML1 A0E3 = A0E(i2);
                        if (A0S(obj, i5, i2)) {
                            Object object4 = unsafe2.getObject(obj, A0S2);
                            if (!A0R(object4)) {
                                Object BfF3 = A0E3.BfF();
                                A0E3.Be4(BfF3, object4);
                                unsafe2.putObject(obj, A0S2, BfF3);
                                object4 = BfF3;
                            }
                            A0E3.Be4(object4, object3);
                        } else {
                            if (A0R(object3)) {
                                Object BfF4 = A0E3.BfF();
                                A0E3.Be4(BfF4, object3);
                                unsafe2.putObject(obj, A0S2, BfF4);
                            } else {
                                unsafe2.putObject(obj, A0S2, object3);
                            }
                            LDw.A04(obj, JQx.A0S(iArr, i2 + 2), i5);
                        }
                    } else {
                        continue;
                    }
                    i = i2 + 3;
                default:
                    i = i2 + 3;
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r317v8 ??, still in use, count: 2, list:
          (r317v8 ??) from 0x0280: PHI (r317v7 ??) = (r317v6 ??), (r317v8 ??) binds: [B:714:0x026c, B:717:0x027b] A[DONT_GENERATE, DONT_INLINE]
          (r317v8 ?? I:X.L8w) from 0x027d: IPUT (r317v8 ?? I:X.L8w), (r0v149 ?? I:X.KDF) A[Catch: KDG -> 0x0e1b, all -> 0x0f1d] X.KDF.unknownFields X.L8w
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    @Override // X.ML1
    public void Be5(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r317v8 ??, still in use, count: 2, list:
          (r317v8 ??) from 0x0280: PHI (r317v7 ??) = (r317v6 ??), (r317v8 ??) binds: [B:714:0x026c, B:717:0x027b] A[DONT_GENERATE, DONT_INLINE]
          (r317v8 ?? I:X.L8w) from 0x027d: IPUT (r317v8 ?? I:X.L8w), (r0v149 ?? I:X.KDF) A[Catch: KDG -> 0x0e1b, all -> 0x0f1d] X.KDF.unknownFields X.L8w
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r302v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:80)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:400)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:388)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:338)
        */

    @Override // X.ML1
    public void Be6(L0K l0k, Object obj, byte[] bArr, int i, int i2) {
        A0U(l0k, obj, bArr, i, i2, 0);
    }

    @Override // X.ML1
    public Object BfF() {
        return Lg5.A0B(this.A05, 0S2.A0N);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x009b. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0736  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x07bb A[LOOP:3: B:127:0x07bb->B:129:0x07cb, LOOP_START, PHI: r315
  0x07bb: PHI (r315v50 int) = (r315v49 int), (r315v51 int) binds: [B:116:0x0733, B:129:0x07cb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0839  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x08ad A[LOOP:6: B:150:0x08ad->B:152:0x08bd, LOOP_START, PHI: r316
  0x08ad: PHI (r316v59 int) = (r316v58 int), (r316v60 int) binds: [B:139:0x0836, B:152:0x08bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x091d  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0990 A[LOOP:9: B:173:0x0990->B:175:0x09a0, LOOP_START, PHI: r317
  0x0990: PHI (r317v42 int) = (r317v41 int), (r317v43 int) binds: [B:162:0x091a, B:175:0x09a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0a00  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0aa4 A[LOOP:12: B:208:0x0aa4->B:210:0x0ab4, LOOP_START, PHI: r316
  0x0aa4: PHI (r316v50 int) = (r316v49 int), (r316v51 int) binds: [B:185:0x09fd, B:210:0x0ab4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0b14  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0b93 A[LOOP:15: B:231:0x0b93->B:233:0x0ba3, LOOP_START, PHI: r315
  0x0b93: PHI (r315v37 int) = (r315v36 int), (r315v38 int) binds: [B:220:0x0b11, B:233:0x0ba3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0c73  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0ce7 A[LOOP:22: B:286:0x0ce7->B:288:0x0cf7, LOOP_START, PHI: r316
  0x0ce7: PHI (r316v37 int) = (r316v36 int), (r316v38 int) binds: [B:275:0x0c70, B:288:0x0cf7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0d57  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0dfb A[LOOP:25: B:321:0x0dfb->B:323:0x0e0b, LOOP_START, PHI: r316
  0x0dfb: PHI (r316v32 int) = (r316v31 int), (r316v33 int) binds: [B:298:0x0d54, B:323:0x0e0b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0e6b  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0ee5 A[LOOP:28: B:344:0x0ee5->B:346:0x0ef5, LOOP_START, PHI: r316
  0x0ee5: PHI (r316v27 int) = (r316v26 int), (r316v28 int) binds: [B:333:0x0e68, B:346:0x0ef5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0f55  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0fcf A[LOOP:31: B:367:0x0fcf->B:369:0x0fdf, LOOP_START, PHI: r316
  0x0fcf: PHI (r316v22 int) = (r316v21 int), (r316v23 int) binds: [B:356:0x0f52, B:369:0x0fdf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:380:0x103f  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x10b9 A[LOOP:34: B:390:0x10b9->B:392:0x10c9, LOOP_START, PHI: r317
  0x10b9: PHI (r317v31 int) = (r317v30 int), (r317v32 int) binds: [B:379:0x103c, B:392:0x10c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:403:0x1130  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x11ad A[LOOP:37: B:413:0x11ad->B:415:0x11bd, LOOP_START, PHI: r316
  0x11ad: PHI (r316v13 int) = (r316v12 int), (r316v14 int) binds: [B:402:0x112d, B:415:0x11bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:553:0x16c8  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x1742 A[LOOP:42: B:563:0x1742->B:565:0x1752, LOOP_START, PHI: r316
  0x1742: PHI (r316v4 int) = (r316v3 int), (r316v5 int) binds: [B:552:0x16c5, B:565:0x1752] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.ML1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void DBK(X.Kp1 r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 6594
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Lg9.DBK(X.Kp1, java.lang.Object):void");
    }
}
