package X;

import com.facebook.acra.constants.ActionId;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* loaded from: Ldd.class */
public final class Ldd implements MKz {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final L2m A04;
    public final LAE A05;
    public final KwY A06;
    public final MQk A07;
    public final KYK A08;
    public final L5O A09;
    public final int[] A0A;
    public final int[] A0B;
    public final Object[] A0C;
    public static final int[] A0E = new int[0];
    public static final Unsafe A0D = LEl.A09();

    public Ldd(L2m l2m, LAE lae, KwY kwY, MQk mQk, KYK kyk, L5O l5o, int[] iArr, int[] iArr2, Object[] objArr, int i, int i2, int i3, int i4) {
        this.A0A = iArr;
        this.A0C = objArr;
        this.A00 = i;
        this.A01 = i2;
        this.A0B = iArr2;
        this.A02 = i3;
        this.A03 = i4;
        this.A08 = kyk;
        this.A05 = lae;
        this.A09 = l5o;
        this.A04 = l2m;
        this.A07 = mQk;
        this.A06 = kwY;
    }

    public static double A00(Object obj, long j) {
        return DKC.A00(LEl.A06(obj, j));
    }

    public static float A01(Object obj, long j) {
        return 7zM.A00(LEl.A06(obj, j));
    }

    public static int A02(int i) {
        return (i >>> 20) & 255;
    }

    private final int A03(int i) {
        return this.A0A[i + 2];
    }

    private final int A04(int i) {
        return this.A0A[i + 1];
    }

    private final int A05(int i, int i2) {
        int[] iArr = this.A0A;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    public static int A06(L0J l0j, MRS mrs, MKz mKz, byte[] bArr, int i, int i2, int i3) {
        int A0B;
        do {
            A0B = A0B(l0j, mKz, bArr, i2, i3);
            mrs.add(l0j.A02);
            if (A0B >= i3) {
                break;
            }
            i2 = A0F(l0j, bArr, A0B);
        } while (i == l0j.A00);
        return A0B;
    }

    public static int A07(L0J l0j, MRS mrs, byte[] bArr, int i) {
        K7E k7e = (K7E) mrs;
        int A0F = A0F(l0j, bArr, i);
        int i2 = l0j.A00 + A0F;
        while (A0F < i2) {
            A0F = A0F(l0j, bArr, A0F);
            k7e.DCy(l0j.A00);
        }
        if (A0F == i2) {
            return A0F;
        }
        throw KLv.A05();
    }

    public static int A08(L0J l0j, MRS mrs, byte[] bArr, int i, int i2, int i3) {
        int A0F;
        K7E k7e = (K7E) mrs;
        do {
            A0F = A0F(l0j, bArr, i2);
            k7e.DCy(l0j.A00);
            if (A0F >= i3) {
                break;
            }
            i2 = A0F(l0j, bArr, A0F);
        } while (i == l0j.A00);
        return A0F;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002a, code lost:
    
        if (r309 >= 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A09(X.L0J r301, X.MKz r302, java.lang.Object r303, byte[] r304, int r305, int r306) {
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
            int r0 = A0H(r0, r1, r2, r3)
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
            r0.DD1(r1, r2, r3, r4, r5)
            r0 = r301
            r1 = r303
            r0.A02 = r1
            r0 = r309
            return r0
        L59:
            X.KLv r0 = X.KLv.A05()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ldd.A09(X.L0J, X.MKz, java.lang.Object, byte[], int, int):int");
    }

    public static int A0A(L0J l0j, MKz mKz, Object obj, byte[] bArr, int i, int i2, int i3) {
        int A0n = ((Ldd) mKz).A0n(l0j, obj, bArr, i, i2, i3);
        l0j.A02 = obj;
        return A0n;
    }

    public static int A0B(L0J l0j, MKz mKz, byte[] bArr, int i, int i2) {
        K7f DCd = mKz.DCd();
        int A09 = A09(l0j, mKz, DCd, bArr, i, i2);
        mKz.DCn(DCd);
        l0j.A02 = DCd;
        return A09;
    }

    public static int A0C(L0J l0j, MKz mKz, byte[] bArr, int i, int i2, int i3) {
        K7f DCd = mKz.DCd();
        int A0A = A0A(l0j, mKz, DCd, bArr, i, i2, i3);
        mKz.DCn(DCd);
        l0j.A02 = DCd;
        return A0A;
    }

    public static int A0D(L0J l0j, LDV ldv, byte[] bArr, int i, int i2, int i3) {
        int i4 = i2;
        if ((i >>> 3) != 0) {
            int i5 = i & 7;
            if (i5 == 0) {
                int A0G = A0G(l0j, bArr, i2);
                ldv.A08(i, Long.valueOf(l0j.A01));
                return A0G;
            }
            if (i5 == 1) {
                ldv.A08(i, Long.valueOf(A0L(bArr, i2)));
                return i2 + 8;
            }
            if (i5 == 2) {
                int A0F = A0F(l0j, bArr, i2);
                int i6 = l0j.A00;
                if (i6 < 0) {
                    throw KLv.A03();
                }
                if (i6 > bArr.length - A0F) {
                    throw KLv.A05();
                }
                ldv.A08(i, i6 == 0 ? Lj6.A00 : Lj6.A01(bArr, A0F, i6));
                return A0F + i6;
            }
            if (i5 == 3) {
                int i7 = (i & (-8)) | 4;
                LDV A01 = LDV.A01();
                int i8 = 0;
                while (i4 < i3) {
                    i4 = A0F(l0j, bArr, i4);
                    i8 = l0j.A00;
                    if (i8 == i7) {
                        break;
                    }
                    i4 = A0D(l0j, A01, bArr, i8, i4, i3);
                }
                if (i4 > i3 || i8 != i7) {
                    throw KLv.A04();
                }
                ldv.A08(i, A01);
                return i4;
            }
            if (i5 == 5) {
                ldv.A08(i, Integer.valueOf(A0J(bArr, i2)));
                return i2 + 4;
            }
        }
        throw KLv.A01();
    }

    public static int A0E(L0J l0j, byte[] bArr, int i) {
        int A0F = A0F(l0j, bArr, i);
        int i2 = l0j.A00;
        if (i2 < 0) {
            throw KLv.A03();
        }
        if (i2 > bArr.length - A0F) {
            throw KLv.A05();
        }
        if (i2 == 0) {
            l0j.A02 = Lj6.A00;
            return A0F;
        }
        l0j.A02 = Lj6.A01(bArr, A0F, i2);
        return A0F + i2;
    }

    public static int A0F(L0J l0j, byte[] bArr, int i) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return A0H(l0j, bArr, b, i2);
        }
        l0j.A00 = b;
        return i2;
    }

    public static int A0G(L0J l0j, byte[] bArr, int i) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            l0j.A01 = j;
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
        l0j.A01 = j2;
        return i3;
    }

    public static int A0H(L0J l0j, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        byte b = bArr[i2];
        int i6 = i2 + 1;
        int i7 = i & 127;
        if (b < 0) {
            int i8 = i7 | ((b & 127) << 7);
            int i9 = i6 + 1;
            byte b2 = bArr[i6];
            if (b2 >= 0) {
                i4 = b2 << 14;
            } else {
                i7 = i8 | ((b2 & 127) << 14);
                i6 = i9 + 1;
                byte b3 = bArr[i9];
                i3 = b3 << 21;
                if (b3 < 0) {
                    i8 = i7 | ((b3 & 127) << 21);
                    i9 = i6 + 1;
                    byte b4 = bArr[i6];
                    i4 = b4 << 28;
                    if (b4 < 0) {
                        i5 = i8 | ((b4 & 127) << 28);
                        while (true) {
                            i6 = i9 + 1;
                            if (bArr[i9] >= 0) {
                                break;
                            }
                            i9 = i6;
                        }
                        l0j.A00 = i5;
                        return i6;
                    }
                }
            }
            l0j.A00 = i8 | i4;
            return i9;
        }
        i3 = b << 7;
        i5 = i7 | i3;
        l0j.A00 = i5;
        return i6;
    }

    public static int A0I(Object obj, long j) {
        return AnonymousClass001.A03(LEl.A06(obj, j));
    }

    public static int A0J(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static long A0K(Object obj, long j) {
        return AnonymousClass001.A05(LEl.A06(obj, j));
    }

    public static long A0L(byte[] bArr, int i) {
        return JR2.A0E(bArr, i);
    }

    private final MGJ A0M(int i) {
        int i2 = i / 3;
        return (MGJ) this.A0C[i2 + i2 + 1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x03e1, code lost:
    
        if (r319 == 0) goto L84;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0658  */
    /* JADX WARN: Type inference failed for: r0v161, types: [int] */
    /* JADX WARN: Type inference failed for: r0v179, types: [int] */
    /* JADX WARN: Type inference failed for: r0v197, types: [int] */
    /* JADX WARN: Type inference failed for: r0v215, types: [int] */
    /* JADX WARN: Type inference failed for: r0v354, types: [int] */
    /* JADX WARN: Type inference failed for: r0v535, types: [int] */
    /* JADX WARN: Type inference failed for: r0v556, types: [int] */
    /* JADX WARN: Type inference failed for: r0v573, types: [int] */
    /* JADX WARN: Type inference failed for: r0v599, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.Ldd A0N(X.L2m r301, X.LAE r302, X.KwY r303, X.MJf r304, X.KYK r305, X.L5O r306) {
        /*
            Method dump skipped, instructions count: 2566
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ldd.A0N(X.L2m, X.LAE, X.KwY, X.MJf, X.KYK, X.L5O):X.Ldd");
    }

    private final MKz A0O(int i) {
        Object[] objArr = this.A0C;
        int i2 = i / 3;
        int i3 = i2 + i2;
        MKz mKz = (MKz) objArr[i3];
        if (mKz == null) {
            mKz = L84.A00().A01((Class) objArr[i3 + 1]);
            objArr[i3] = mKz;
        }
        return mKz;
    }

    public static LDV A0P(Object obj) {
        K7f k7f = (K7f) obj;
        LDV ldv = k7f.zzc;
        if (ldv == LDV.A00()) {
            ldv = LDV.A01();
            k7f.zzc = ldv;
        }
        return ldv;
    }

    private final Object A0Q(int i, int i2, Object obj) {
        Object object;
        MKz A0O = A0O(i2);
        if (A0k(obj, i, i2)) {
            object = A0D.getObject(obj, JQx.A0N(A04(i2)));
            if (!A0j(object)) {
                K7f DCd = A0O.DCd();
                if (object != null) {
                    A0O.DCt(DCd, object);
                }
                return DCd;
            }
        } else {
            object = A0O.DCd();
        }
        return object;
    }

    private final Object A0R(Object obj, int i) {
        Object object;
        MKz A0O = A0O(i);
        int A04 = A04(i) & 1048575;
        if (A0g(i, obj)) {
            object = A0D.getObject(obj, A04);
            if (!A0j(object)) {
                K7f DCd = A0O.DCd();
                if (object != null) {
                    A0O.DCt(DCd, object);
                }
                return DCd;
            }
        } else {
            object = A0O.DCd();
        }
        return object;
    }

    public static Field A0S(Class cls, String str) {
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

    private final void A0T(int i, int i2, Object obj) {
        LEl.A0H(obj, JQx.A0N(A03(i2)), i);
    }

    private final void A0U(int i, int i2, Object obj, Object obj2) {
        A0D.putObject(obj, JQx.A0N(A04(i2)), obj2);
        A0T(i, i2, obj);
    }

    public static final void A0V(MLI mli, Object obj, int i) {
        if (obj instanceof String) {
            mli.DBy(i, (String) obj);
        } else {
            mli.DCa((Lj6) obj, i);
        }
    }

    public static void A0W(Object obj) {
        if (!A0j(obj)) {
            throw AnonymousClass001.A0L("Mutating immutable message: ".concat(JQx.A0w(obj)));
        }
    }

    private final void A0X(Object obj, int i) {
        int A03 = A03(i);
        long j = 1048575 & A03;
        if (j != 1048575) {
            LEl.A0H(obj, j, (1 << (A03 >>> 20)) | LEl.A03(obj, j));
        }
    }

    private final void A0Y(Object obj, int i, Object obj2) {
        A0D.putObject(obj, JQx.A0N(A04(i)), obj2);
        A0X(obj, i);
    }

    private final void A0Z(Object obj, Object obj2, int i) {
        if (A0g(i, obj2)) {
            int A04 = A04(i) & 1048575;
            Unsafe unsafe = A0D;
            long j = A04;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw JR1.A0m(obj2, this.A0A, i);
            }
            MKz A0O = A0O(i);
            if (!A0g(i, obj)) {
                if (A0j(object)) {
                    K7f DCd = A0O.DCd();
                    A0O.DCt(DCd, object);
                    unsafe.putObject(obj, j, DCd);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                A0X(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!A0j(object2)) {
                Object DCd2 = A0O.DCd();
                A0O.DCt(DCd2, object2);
                unsafe.putObject(obj, j, DCd2);
                object2 = DCd2;
            }
            A0O.DCt(object2, object);
        }
    }

    private final void A0a(Object obj, Object obj2, int i) {
        int[] iArr = this.A0A;
        int i2 = iArr[i];
        if (A0k(obj2, i2, i)) {
            int A04 = A04(i) & 1048575;
            Unsafe unsafe = A0D;
            long j = A04;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw JR1.A0m(obj2, iArr, i);
            }
            MKz A0O = A0O(i);
            if (!A0k(obj, i2, i)) {
                if (A0j(object)) {
                    K7f DCd = A0O.DCd();
                    A0O.DCt(DCd, object);
                    unsafe.putObject(obj, j, DCd);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                A0T(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!A0j(object2)) {
                Object DCd2 = A0O.DCd();
                A0O.DCt(DCd2, object2);
                unsafe.putObject(obj, j, DCd2);
                object2 = DCd2;
            }
            A0O.DCt(object2, object);
        }
    }

    public static /* bridge */ /* synthetic */ void A0b(char[] cArr, byte b, byte b2, byte b3, byte b4, int i) {
        if (A0e(b2) || JQx.A09(b, b2) != 0 || A0e(b3) || A0e(b4)) {
            throw KLv.A02();
        }
        JQz.A10(((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6), b4 & 63, cArr, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* bridge */ /* synthetic */ void A0c(char[] r301, byte r302, byte r303, byte r304, int r305) {
        /*
            r0 = r303
            boolean r0 = A0e(r0)
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L75
            r0 = -96
            r307 = r0
            r0 = -32
            r306 = r0
            r0 = r302
            r1 = r306
            if (r0 != r1) goto L5f
            r0 = r303
            r1 = r307
            if (r0 < r1) goto L75
            r0 = -32
            r302 = r0
        L22:
            r0 = r304
            boolean r0 = A0e(r0)
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L75
            r0 = r302
            r1 = 15
            r0 = r0 & r1
            r307 = r0
            r0 = r303
            r1 = 63
            r0 = r0 & r1
            r306 = r0
            r0 = r304
            r1 = 63
            r0 = r0 & r1
            r308 = r0
            r0 = r307
            r1 = 12
            int r0 = r0 << r1
            r307 = r0
            r0 = r306
            r1 = 6
            int r0 = r0 << r1
            r306 = r0
            r0 = r307
            r1 = r306
            r0 = r0 | r1
            r1 = r308
            r0 = r0 | r1
            char r0 = (char) r0
            r306 = r0
            r0 = r301
            r1 = r305
            r2 = r306
            r0[r1] = r2
            return
        L5f:
            r0 = -19
            r306 = r0
            r0 = r302
            r1 = r306
            if (r0 != r1) goto L22
            r0 = r303
            r1 = r307
            if (r0 >= r1) goto L75
            r0 = -19
            r302 = r0
            goto L22
        L75:
            X.KLv r0 = X.KLv.A02()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ldd.A0c(char[], byte, byte, byte, int):void");
    }

    public static /* bridge */ /* synthetic */ void A0d(char[] cArr, byte b, byte b2, int i) {
        if (b < -62 || A0e(b2)) {
            throw KLv.A02();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    public static boolean A0e(byte b) {
        return 4YV.A1X(b, -65);
    }

    private final boolean A0g(int i, Object obj) {
        int A03 = A03(i);
        long j = A03 & 1048575;
        if (j != 1048575) {
            return (LEl.A03(obj, j) & (1 << (A03 >>> 20))) != 0;
        }
        int A04 = A04(i);
        int i2 = 1048575 & A04;
        int A02 = A02(A04);
        long j2 = i2;
        switch (A02) {
            case 0:
                return Double.doubleToRawLongBits(LEl.A00(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(LEl.A01(obj, j2)) != 0;
            case 2:
            case 3:
            case 5:
            case 14:
            case 16:
                return LEl.A04(obj, j2) != 0;
            case 4:
            case 6:
            case 11:
            case 12:
            case 13:
            case 15:
                return LEl.A03(obj, j2) != 0;
            case 7:
                return LEl.A0R(obj, j2);
            case 8:
                Object A06 = LEl.A06(obj, j2);
                if (A06 instanceof String) {
                    return !((String) A06).isEmpty();
                }
                if (A06 instanceof Lj6) {
                    return !Lj6.A00.equals(A06);
                }
                throw JQx.A0n();
            case 9:
            case 17:
                return LEl.A06(obj, j2) != null;
            case 10:
                return !Lj6.A00.equals(LEl.A06(obj, j2));
            default:
                throw JQx.A0n();
        }
    }

    private final boolean A0h(int i, Object obj, Object obj2) {
        return AnonymousClass001.A1Q(A0g(i, obj) ? 1 : 0, A0g(i, obj2) ? 1 : 0);
    }

    public static boolean A0i(MKz mKz, Object obj, int i) {
        return mKz.DDC(LEl.A06(obj, JQx.A0N(i)));
    }

    public static boolean A0j(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof K7f) {
            return ((K7f) obj).A0U();
        }
        return true;
    }

    private final boolean A0k(Object obj, int i, int i2) {
        return AnonymousClass001.A1Q(LEl.A03(obj, JQx.A0N(A03(i2))), i);
    }

    private final boolean A0l(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? A0g(i, obj) : AnonymousClass001.A1N(i3 & i4);
    }

    public static boolean A0m(Object obj, long j) {
        return AnonymousClass001.A1V(LEl.A06(obj, j));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x1548, code lost:
    
        throw X.KLv.A02();
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x1544, code lost:
    
        throw X.KLv.A05();
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x1540, code lost:
    
        throw X.KLv.A03();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x1496, code lost:
    
        if (r315 == 1048575) goto L423;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x1499, code lost:
    
        r0.putInt(r303, r315, r314);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x14a9, code lost:
    
        r0 = r301.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x14b0, code lost:
    
        r322 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x14bb, code lost:
    
        if (r322 >= r301.A03) goto L500;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x14be, code lost:
    
        r0 = r301.A0B[r322];
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x14e4, code lost:
    
        if (X.LEl.A06(r303, A04(r0) & 1048575) == null) goto L501;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x14f2, code lost:
    
        if (A0M(r0) != null) goto L499;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x157c, code lost:
    
        throw r317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x14f5, code lost:
    
        r0 = r322 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x154f, code lost:
    
        if (r307 != 0) goto L446;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x1556, code lost:
    
        if (r309 != r306) goto L452;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x155b, code lost:
    
        return r309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x1575, code lost:
    
        r317 = X.KLv.A04();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x1560, code lost:
    
        if (r309 > r306) goto L452;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x156f, code lost:
    
        if (r313 != r307) goto L452;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x1574, code lost:
    
        return r309;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:150:0x088a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x1046. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:403:0x0184. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:161:0x1469  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x1541 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x1541 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x10a7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x1404 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x147c  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x143a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int A0n(X.L0J r302, java.lang.Object r303, byte[] r304, int r305, int r306, int r307) {
        /*
            Method dump skipped, instructions count: 5501
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ldd.A0n(X.L0J, java.lang.Object, byte[], int, int, int):int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x00a0. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0c5d  */
    @Override // X.MKz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int DC6(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 3767
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ldd.DC6(java.lang.Object):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x003c. Please report as an issue. */
    @Override // X.MKz
    public final int DCH(Object obj) {
        int i;
        int hashCode;
        int i2;
        long A0K;
        double A00;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int[] iArr = this.A0A;
            if (i3 >= iArr.length) {
                return 1BK.A03(this.A09.A02(obj), i4 * 53);
            }
            int A04 = A04(i3);
            int i5 = 1048575 & A04;
            int A02 = A02(A04);
            int i6 = iArr[i3];
            long j = i5;
            switch (A02) {
                case 0:
                    i2 = i4 * 53;
                    A00 = LEl.A00(obj, j);
                    A0K = Double.doubleToLongBits(A00);
                    Charset charset = LC1.A02;
                    i4 = AnonymousClass002.A03(A0K, i2);
                    break;
                case 1:
                    i = i4 * 53;
                    hashCode = Float.floatToIntBits(LEl.A01(obj, j));
                    i4 = hashCode + i;
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    i2 = i4 * 53;
                    A0K = LEl.A04(obj, j);
                    Charset charset2 = LC1.A02;
                    i4 = AnonymousClass002.A03(A0K, i2);
                    break;
                case 4:
                case 6:
                case 11:
                case 12:
                case 13:
                case 15:
                    i = i4 * 53;
                    hashCode = LEl.A03(obj, j);
                    i4 = hashCode + i;
                    break;
                case 7:
                    i = i4 * 53;
                    hashCode = LC1.A00(LEl.A0R(obj, j));
                    i4 = hashCode + i;
                    break;
                case 8:
                    i = i4 * 53;
                    hashCode = ((String) LEl.A06(obj, j)).hashCode();
                    i4 = hashCode + i;
                    break;
                case 9:
                case 17:
                    hashCode = i4 * 53;
                    i = JQz.A0E(LEl.A06(obj, j), 37);
                    i4 = hashCode + i;
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
                    i = i4 * 53;
                    hashCode = LEl.A06(obj, j).hashCode();
                    i4 = hashCode + i;
                    break;
                case ActionId.UNKNOWN /* 51 */:
                    if (!A0k(obj, i6, i3)) {
                        break;
                    } else {
                        i2 = i4 * 53;
                        A00 = A00(obj, j);
                        A0K = Double.doubleToLongBits(A00);
                        Charset charset22 = LC1.A02;
                        i4 = AnonymousClass002.A03(A0K, i2);
                        break;
                    }
                case ActionId.RETRY_AFTER_FAILURE /* 52 */:
                    if (!A0k(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        hashCode = Float.floatToIntBits(A01(obj, j));
                        i4 = hashCode + i;
                        break;
                    }
                case ActionId.RETRY_AFTER_RECONNECT /* 53 */:
                    if (!A0k(obj, i6, i3)) {
                        break;
                    }
                    i2 = i4 * 53;
                    A0K = A0K(obj, j);
                    Charset charset222 = LC1.A02;
                    i4 = AnonymousClass002.A03(A0K, i2);
                    break;
                case ActionId.QUEUEING_BEGIN /* 54 */:
                    if (!A0k(obj, i6, i3)) {
                        break;
                    }
                    i2 = i4 * 53;
                    A0K = A0K(obj, j);
                    Charset charset2222 = LC1.A02;
                    i4 = AnonymousClass002.A03(A0K, i2);
                    break;
                case ActionId.QUEUEING_SUCCESS /* 55 */:
                    if (!A0k(obj, i6, i3)) {
                        break;
                    }
                    i = i4 * 53;
                    hashCode = A0I(obj, j);
                    i4 = hashCode + i;
                    break;
                case ActionId.QUEUEING_FAIL /* 56 */:
                    if (!A0k(obj, i6, i3)) {
                        break;
                    }
                    i2 = i4 * 53;
                    A0K = A0K(obj, j);
                    Charset charset22222 = LC1.A02;
                    i4 = AnonymousClass002.A03(A0K, i2);
                    break;
                case ActionId.MESSAGE_UPDATE_START /* 57 */:
                    if (!A0k(obj, i6, i3)) {
                        break;
                    }
                    i = i4 * 53;
                    hashCode = A0I(obj, j);
                    i4 = hashCode + i;
                    break;
                case ActionId.MESSAGE_UPDATE_END /* 58 */:
                    if (!A0k(obj, i6, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        hashCode = LC1.A00(A0m(obj, j));
                        i4 = hashCode + i;
                        break;
                    }
                case ActionId.PHOTO_CAPTURED /* 59 */:
                    if (!A0k(obj, i6, i3)) {
                        break;
                    }
                    i = i4 * 53;
                    hashCode = ((String) LEl.A06(obj, j)).hashCode();
                    i4 = hashCode + i;
                    break;
                case ActionId.MEDIA_PREVIEW_VISIBLE /* 60 */:
                    if (!A0k(obj, i6, i3)) {
                        break;
                    }
                    i = i4 * 53;
                    hashCode = LEl.A06(obj, j).hashCode();
                    i4 = hashCode + i;
                    break;
                case ActionId.COUNTER /* 61 */:
                    if (!A0k(obj, i6, i3)) {
                        break;
                    }
                    i = i4 * 53;
                    hashCode = LEl.A06(obj, j).hashCode();
                    i4 = hashCode + i;
                    break;
                case ActionId.INTERACTION_LOAD_TIMELINE_HEADER /* 62 */:
                    if (!A0k(obj, i6, i3)) {
                        break;
                    }
                    i = i4 * 53;
                    hashCode = A0I(obj, j);
                    i4 = hashCode + i;
                    break;
                case 63:
                    if (!A0k(obj, i6, i3)) {
                        break;
                    }
                    i = i4 * 53;
                    hashCode = A0I(obj, j);
                    i4 = hashCode + i;
                    break;
                case 64:
                    if (!A0k(obj, i6, i3)) {
                        break;
                    }
                    i = i4 * 53;
                    hashCode = A0I(obj, j);
                    i4 = hashCode + i;
                    break;
                case ActionId.INTERACTION_LOAD_PAGE_HEADER /* 65 */:
                    if (!A0k(obj, i6, i3)) {
                        break;
                    }
                    i2 = i4 * 53;
                    A0K = A0K(obj, j);
                    Charset charset222222 = LC1.A02;
                    i4 = AnonymousClass002.A03(A0K, i2);
                    break;
                case ActionId.INTERACTION_LOAD_PAGE_HEADER_ADMIN /* 66 */:
                    if (!A0k(obj, i6, i3)) {
                        break;
                    }
                    i = i4 * 53;
                    hashCode = A0I(obj, j);
                    i4 = hashCode + i;
                    break;
                case ActionId.INTERACTION_LOAD_PERMALINK /* 67 */:
                    if (!A0k(obj, i6, i3)) {
                        break;
                    }
                    i2 = i4 * 53;
                    A0K = A0K(obj, j);
                    Charset charset2222222 = LC1.A02;
                    i4 = AnonymousClass002.A03(A0K, i2);
                    break;
                case ActionId.INTERACTION_OPEN_COMPOSER /* 68 */:
                    if (!A0k(obj, i6, i3)) {
                        break;
                    }
                    i = i4 * 53;
                    hashCode = LEl.A06(obj, j).hashCode();
                    i4 = hashCode + i;
                    break;
            }
            i3 += 3;
        }
    }

    @Override // X.MKz
    public final K7f DCd() {
        return ((K7f) this.A07).A0O();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x0072. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0108 A[SYNTHETIC] */
    @Override // X.MKz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void DCn(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ldd.DCn(java.lang.Object):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x003f. Please report as an issue. */
    @Override // X.MKz
    public final void DCt(Object obj, Object obj2) {
        int i;
        A0W(obj);
        obj2.getClass();
        while (true) {
            int i2 = i;
            int[] iArr = this.A0A;
            if (i2 >= iArr.length) {
                LEm.A0F(this.A09, obj, obj2);
                return;
            }
            int A04 = A04(i2);
            int i3 = 1048575 & A04;
            int A02 = A02(A04);
            int i4 = iArr[i2];
            long j = i3;
            switch (A02) {
                case 0:
                    if (A0g(i2, obj2)) {
                        LEl.A0F(obj, j, LEl.A00(obj2, j));
                        A0X(obj, i2);
                    }
                case 1:
                    if (A0g(i2, obj2)) {
                        LEl.A0G(obj, j, LEl.A01(obj2, j));
                        A0X(obj, i2);
                    }
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    if (A0g(i2, obj2)) {
                        LEl.A0I(obj, j, LEl.A04(obj2, j));
                        A0X(obj, i2);
                    }
                case 4:
                case 6:
                case 11:
                case 12:
                case 13:
                case 15:
                    if (A0g(i2, obj2)) {
                        LEl.A0H(obj, j, LEl.A03(obj2, j));
                        A0X(obj, i2);
                    }
                case 7:
                    if (A0g(i2, obj2)) {
                        LEl.A0K(obj, j, LEl.A0R(obj2, j));
                        A0X(obj, i2);
                    }
                case 8:
                case 10:
                    if (A0g(i2, obj2)) {
                        LEl.A0J(obj, j, LEl.A06(obj2, j));
                        A0X(obj, i2);
                    }
                case 9:
                case 17:
                    A0Z(obj, obj2, i2);
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
                    this.A05.A03(obj, j, obj2);
                case 50:
                    L5O l5o = LEm.A01;
                    LEl.A06(obj, j);
                    LEl.A06(obj2, j);
                    KwY.A00();
                    throw 0Q8.createAndThrow();
                case ActionId.UNKNOWN /* 51 */:
                case ActionId.RETRY_AFTER_FAILURE /* 52 */:
                case ActionId.RETRY_AFTER_RECONNECT /* 53 */:
                case ActionId.QUEUEING_BEGIN /* 54 */:
                case ActionId.QUEUEING_SUCCESS /* 55 */:
                case ActionId.QUEUEING_FAIL /* 56 */:
                case ActionId.MESSAGE_UPDATE_START /* 57 */:
                case ActionId.MESSAGE_UPDATE_END /* 58 */:
                case ActionId.PHOTO_CAPTURED /* 59 */:
                    i = A0k(obj2, i4, i2) ? 0 : i2 + 3;
                    LEl.A0J(obj, j, LEl.A06(obj2, j));
                    A0T(i4, i2, obj);
                case ActionId.MEDIA_PREVIEW_VISIBLE /* 60 */:
                case ActionId.INTERACTION_OPEN_COMPOSER /* 68 */:
                    A0a(obj, obj2, i2);
                case ActionId.COUNTER /* 61 */:
                case ActionId.INTERACTION_LOAD_TIMELINE_HEADER /* 62 */:
                case 63:
                case 64:
                case ActionId.INTERACTION_LOAD_PAGE_HEADER /* 65 */:
                case ActionId.INTERACTION_LOAD_PAGE_HEADER_ADMIN /* 66 */:
                case ActionId.INTERACTION_LOAD_PERMALINK /* 67 */:
                    if (!A0k(obj2, i4, i2)) {
                    }
                    LEl.A0J(obj, j, LEl.A06(obj2, j));
                    A0T(i4, i2, obj);
                default:
            }
        }
    }

    @Override // X.MKz
    public final void DD1(L0J l0j, Object obj, byte[] bArr, int i, int i2) {
        A0n(l0j, obj, bArr, i, i2, 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x009c. Please report as an issue. */
    @Override // X.MKz
    public final void DD5(MLI mli, Object obj) {
        int i;
        int[] iArr = this.A0A;
        Unsafe unsafe = A0D;
        int i2 = 1048575;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = i4;
            if (i5 >= iArr.length) {
                L5O l5o = this.A09;
                l5o.A05(mli, l5o.A02(obj));
                return;
            }
            int A04 = A04(i5);
            int A02 = A02(A04);
            int i6 = iArr[i5];
            boolean z = true;
            if (A02 <= 17) {
                int i7 = iArr[i5 + 2];
                int i8 = i7 & 1048575;
                if (i8 != i2) {
                    i3 = i8 == 1048575 ? 0 : unsafe.getInt(obj, i8);
                    i2 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            long j = A04 & 1048575;
            switch (A02) {
                case 0:
                    if (A0l(obj, i5, i2, i3, i)) {
                        mli.DCm(i6, LEl.A00(obj, j));
                    }
                    i4 = i5 + 3;
                case 1:
                    if (A0l(obj, i5, i2, i3, i)) {
                        mli.DDK(i6, LEl.A01(obj, j));
                    }
                    i4 = i5 + 3;
                case 2:
                    if (A0l(obj, i5, i2, i3, i)) {
                        mli.DDP(i6, unsafe.getLong(obj, j));
                    }
                    i4 = i5 + 3;
                case 3:
                    if (A0l(obj, i5, i2, i3, i)) {
                        mli.DC2(i6, unsafe.getLong(obj, j));
                    }
                    i4 = i5 + 3;
                case 4:
                    if (A0l(obj, i5, i2, i3, i)) {
                        mli.DDN(i6, unsafe.getInt(obj, j));
                    }
                    i4 = i5 + 3;
                case 5:
                    if (A0l(obj, i5, i2, i3, i)) {
                        mli.DDH(i6, unsafe.getLong(obj, j));
                    }
                    i4 = i5 + 3;
                case 6:
                    if (A0l(obj, i5, i2, i3, i)) {
                        mli.DDB(i6, unsafe.getInt(obj, j));
                    }
                    i4 = i5 + 3;
                case 7:
                    if (A0l(obj, i5, i2, i3, i)) {
                        mli.DCM(i6, LEl.A0R(obj, j));
                    }
                    i4 = i5 + 3;
                case 8:
                    if (A0l(obj, i5, i2, i3, i)) {
                        A0V(mli, unsafe.getObject(obj, j), i6);
                    }
                    i4 = i5 + 3;
                case 9:
                    if (A0l(obj, i5, i2, i3, i)) {
                        mli.DDS(A0O(i5), unsafe.getObject(obj, j), i6);
                    }
                    i4 = i5 + 3;
                case 10:
                    if (A0l(obj, i5, i2, i3, i)) {
                        mli.DCa((Lj6) unsafe.getObject(obj, j), i6);
                    }
                    i4 = i5 + 3;
                case 11:
                    if (A0l(obj, i5, i2, i3, i)) {
                        mli.DC0(i6, unsafe.getInt(obj, j));
                    }
                    i4 = i5 + 3;
                case 12:
                    if (A0l(obj, i5, i2, i3, i)) {
                        mli.DD3(i6, unsafe.getInt(obj, j));
                    }
                    i4 = i5 + 3;
                case 13:
                    if (A0l(obj, i5, i2, i3, i)) {
                        mli.DDT(i6, unsafe.getInt(obj, j));
                    }
                    i4 = i5 + 3;
                case 14:
                    if (A0l(obj, i5, i2, i3, i)) {
                        mli.DDW(i6, unsafe.getLong(obj, j));
                    }
                    i4 = i5 + 3;
                case 15:
                    if (A0l(obj, i5, i2, i3, i)) {
                        mli.DBt(i6, unsafe.getInt(obj, j));
                    }
                    i4 = i5 + 3;
                case 16:
                    if (A0l(obj, i5, i2, i3, i)) {
                        mli.DBv(i6, unsafe.getLong(obj, j));
                    }
                    i4 = i5 + 3;
                case 17:
                    if (A0l(obj, i5, i2, i3, i)) {
                        mli.DDM(A0O(i5), unsafe.getObject(obj, j), i6);
                    }
                    i4 = i5 + 3;
                case 18:
                    z = false;
                    LEm.A0M(mli, (List) unsafe.getObject(obj, j), iArr[i5], z);
                    i4 = i5 + 3;
                case 19:
                    z = false;
                    LEm.A0Q(mli, (List) unsafe.getObject(obj, j), iArr[i5], z);
                    i4 = i5 + 3;
                case 20:
                    z = false;
                    LEm.A0S(mli, (List) unsafe.getObject(obj, j), iArr[i5], z);
                    i4 = i5 + 3;
                case 21:
                    z = false;
                    LEm.A0K(mli, (List) unsafe.getObject(obj, j), iArr[i5], z);
                    i4 = i5 + 3;
                case 22:
                    z = false;
                    LEm.A0R(mli, (List) unsafe.getObject(obj, j), iArr[i5], z);
                    i4 = i5 + 3;
                case 23:
                    z = false;
                    LEm.A0P(mli, (List) unsafe.getObject(obj, j), iArr[i5], z);
                    i4 = i5 + 3;
                case 24:
                    z = false;
                    LEm.A0O(mli, (List) unsafe.getObject(obj, j), iArr[i5], z);
                    i4 = i5 + 3;
                case 25:
                    LEm.A0L(mli, (List) unsafe.getObject(obj, j), iArr[i5], false);
                    i4 = i5 + 3;
                case 26:
                    int i9 = iArr[i5];
                    List list = (List) unsafe.getObject(obj, j);
                    L5O l5o2 = LEm.A01;
                    if (list != null && !list.isEmpty()) {
                        mli.DBz(list, i9);
                    }
                    i4 = i5 + 3;
                    break;
                case 27:
                    int i10 = iArr[i5];
                    List list2 = (List) unsafe.getObject(obj, j);
                    MKz A0O = A0O(i5);
                    L5O l5o3 = LEm.A01;
                    if (list2 != null && !list2.isEmpty()) {
                        int i11 = 0;
                        while (true) {
                            int i12 = i11;
                            if (i12 < list2.size()) {
                                ((Ldf) mli).DDS(A0O, list2.get(i12), i10);
                                i11 = i12 + 1;
                            }
                        }
                    }
                    i4 = i5 + 3;
                    break;
                case 28:
                    int i13 = iArr[i5];
                    List list3 = (List) unsafe.getObject(obj, j);
                    L5O l5o4 = LEm.A01;
                    if (list3 != null && !list3.isEmpty()) {
                        mli.DCi(list3, i13);
                    }
                    i4 = i5 + 3;
                    break;
                case 29:
                    z = false;
                    LEm.A0J(mli, (List) unsafe.getObject(obj, j), iArr[i5], z);
                    i4 = i5 + 3;
                case 30:
                    z = false;
                    LEm.A0N(mli, (List) unsafe.getObject(obj, j), iArr[i5], z);
                    i4 = i5 + 3;
                case 31:
                    z = false;
                    LEm.A0T(mli, (List) unsafe.getObject(obj, j), iArr[i5], z);
                    i4 = i5 + 3;
                case 32:
                    z = false;
                    LEm.A0G(mli, (List) unsafe.getObject(obj, j), iArr[i5], z);
                    i4 = i5 + 3;
                case 33:
                    z = false;
                    LEm.A0H(mli, (List) unsafe.getObject(obj, j), iArr[i5], z);
                    i4 = i5 + 3;
                case 34:
                    LEm.A0I(mli, (List) unsafe.getObject(obj, j), iArr[i5], false);
                    i4 = i5 + 3;
                case 35:
                    LEm.A0M(mli, (List) unsafe.getObject(obj, j), iArr[i5], z);
                    i4 = i5 + 3;
                case 36:
                    LEm.A0Q(mli, (List) unsafe.getObject(obj, j), iArr[i5], z);
                    i4 = i5 + 3;
                case 37:
                    LEm.A0S(mli, (List) unsafe.getObject(obj, j), iArr[i5], z);
                    i4 = i5 + 3;
                case 38:
                    LEm.A0K(mli, (List) unsafe.getObject(obj, j), iArr[i5], z);
                    i4 = i5 + 3;
                case 39:
                    LEm.A0R(mli, (List) unsafe.getObject(obj, j), iArr[i5], z);
                    i4 = i5 + 3;
                case 40:
                    LEm.A0P(mli, (List) unsafe.getObject(obj, j), iArr[i5], z);
                    i4 = i5 + 3;
                case 41:
                    LEm.A0O(mli, (List) unsafe.getObject(obj, j), iArr[i5], z);
                    i4 = i5 + 3;
                case 42:
                    LEm.A0L(mli, (List) unsafe.getObject(obj, j), iArr[i5], true);
                    i4 = i5 + 3;
                case 43:
                    LEm.A0J(mli, (List) unsafe.getObject(obj, j), iArr[i5], z);
                    i4 = i5 + 3;
                case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                    LEm.A0N(mli, (List) unsafe.getObject(obj, j), iArr[i5], z);
                    i4 = i5 + 3;
                case ActionId.ON_CREATE_VIEW_END /* 45 */:
                    LEm.A0T(mli, (List) unsafe.getObject(obj, j), iArr[i5], z);
                    i4 = i5 + 3;
                case 46:
                    LEm.A0G(mli, (List) unsafe.getObject(obj, j), iArr[i5], z);
                    i4 = i5 + 3;
                case ActionId.ON_START_END /* 47 */:
                    LEm.A0H(mli, (List) unsafe.getObject(obj, j), iArr[i5], z);
                    i4 = i5 + 3;
                case ActionId.QUEUED /* 48 */:
                    LEm.A0I(mli, (List) unsafe.getObject(obj, j), iArr[i5], true);
                    i4 = i5 + 3;
                case ActionId.IN_PROGRESS /* 49 */:
                    int i14 = iArr[i5];
                    List list4 = (List) unsafe.getObject(obj, j);
                    MKz A0O2 = A0O(i5);
                    L5O l5o5 = LEm.A01;
                    if (list4 != null && !list4.isEmpty()) {
                        int i15 = 0;
                        while (true) {
                            int i16 = i15;
                            if (i16 < list4.size()) {
                                ((Ldf) mli).DDM(A0O2, list4.get(i16), i14);
                                i15 = i16 + 1;
                            }
                        }
                    }
                    i4 = i5 + 3;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        throw null;
                    }
                    i4 = i5 + 3;
                case ActionId.UNKNOWN /* 51 */:
                    if (A0k(obj, i6, i5)) {
                        mli.DCm(i6, A00(obj, j));
                    }
                    i4 = i5 + 3;
                case ActionId.RETRY_AFTER_FAILURE /* 52 */:
                    if (A0k(obj, i6, i5)) {
                        mli.DDK(i6, A01(obj, j));
                    }
                    i4 = i5 + 3;
                case ActionId.RETRY_AFTER_RECONNECT /* 53 */:
                    if (A0k(obj, i6, i5)) {
                        mli.DDP(i6, A0K(obj, j));
                    }
                    i4 = i5 + 3;
                case ActionId.QUEUEING_BEGIN /* 54 */:
                    if (A0k(obj, i6, i5)) {
                        mli.DC2(i6, A0K(obj, j));
                    }
                    i4 = i5 + 3;
                case ActionId.QUEUEING_SUCCESS /* 55 */:
                    if (A0k(obj, i6, i5)) {
                        mli.DDN(i6, A0I(obj, j));
                    }
                    i4 = i5 + 3;
                case ActionId.QUEUEING_FAIL /* 56 */:
                    if (A0k(obj, i6, i5)) {
                        mli.DDH(i6, A0K(obj, j));
                    }
                    i4 = i5 + 3;
                case ActionId.MESSAGE_UPDATE_START /* 57 */:
                    if (A0k(obj, i6, i5)) {
                        mli.DDB(i6, A0I(obj, j));
                    }
                    i4 = i5 + 3;
                case ActionId.MESSAGE_UPDATE_END /* 58 */:
                    if (A0k(obj, i6, i5)) {
                        mli.DCM(i6, A0m(obj, j));
                    }
                    i4 = i5 + 3;
                case ActionId.PHOTO_CAPTURED /* 59 */:
                    if (A0k(obj, i6, i5)) {
                        A0V(mli, unsafe.getObject(obj, j), i6);
                    }
                    i4 = i5 + 3;
                case ActionId.MEDIA_PREVIEW_VISIBLE /* 60 */:
                    if (A0k(obj, i6, i5)) {
                        mli.DDS(A0O(i5), unsafe.getObject(obj, j), i6);
                    }
                    i4 = i5 + 3;
                case ActionId.COUNTER /* 61 */:
                    if (A0k(obj, i6, i5)) {
                        mli.DCa((Lj6) unsafe.getObject(obj, j), i6);
                    }
                    i4 = i5 + 3;
                case ActionId.INTERACTION_LOAD_TIMELINE_HEADER /* 62 */:
                    if (A0k(obj, i6, i5)) {
                        mli.DC0(i6, A0I(obj, j));
                    }
                    i4 = i5 + 3;
                case 63:
                    if (A0k(obj, i6, i5)) {
                        mli.DD3(i6, A0I(obj, j));
                    }
                    i4 = i5 + 3;
                case 64:
                    if (A0k(obj, i6, i5)) {
                        mli.DDT(i6, A0I(obj, j));
                    }
                    i4 = i5 + 3;
                case ActionId.INTERACTION_LOAD_PAGE_HEADER /* 65 */:
                    if (A0k(obj, i6, i5)) {
                        mli.DDW(i6, A0K(obj, j));
                    }
                    i4 = i5 + 3;
                case ActionId.INTERACTION_LOAD_PAGE_HEADER_ADMIN /* 66 */:
                    if (A0k(obj, i6, i5)) {
                        mli.DBt(i6, A0I(obj, j));
                    }
                    i4 = i5 + 3;
                case ActionId.INTERACTION_LOAD_PERMALINK /* 67 */:
                    if (A0k(obj, i6, i5)) {
                        mli.DBv(i6, A0K(obj, j));
                    }
                    i4 = i5 + 3;
                case ActionId.INTERACTION_OPEN_COMPOSER /* 68 */:
                    if (A0k(obj, i6, i5)) {
                        mli.DDM(A0O(i5), unsafe.getObject(obj, j), i6);
                    }
                    i4 = i5 + 3;
                default:
                    i4 = i5 + 3;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0039. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x02cf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x015c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x02cf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x015c A[SYNTHETIC] */
    @Override // X.MKz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean DD8(java.lang.Object r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 721
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ldd.DD8(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // X.MKz
    public final boolean DDC(Object obj) {
        boolean A0l;
        int i = 1048575;
        int i2 = 0;
        int i3 = 0;
        while (i3 < this.A02) {
            int[] iArr = this.A0B;
            int[] iArr2 = this.A0A;
            int i4 = iArr[i3];
            int i5 = iArr2[i4];
            int A04 = A04(i4);
            int i6 = iArr2[i4 + 2];
            int i7 = i6 & 1048575;
            int i8 = 1 << (i6 >>> 20);
            if (i7 == i) {
                i7 = i;
            } else if (i7 != 1048575) {
                i2 = A0D.getInt(obj, i7);
            }
            if ((268435456 & A04) != 0 && !A0l(obj, i4, i7, i2, i8)) {
                return false;
            }
            int A02 = A02(A04);
            if (A02 == 9 || A02 == 17) {
                A0l = A0l(obj, i4, i7, i2, i8);
            } else {
                if (A02 != 27) {
                    if (A02 == 60 || A02 == 68) {
                        A0l = A0k(obj, i5, i4);
                    } else if (A02 != 49) {
                        if (A02 == 50) {
                            LEl.A06(obj, A04 & 1048575);
                            throw AnonymousClass001.A0Q("isEmpty");
                        }
                        i3++;
                        i = i7;
                    }
                }
                List list = (List) LEl.A06(obj, A04 & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    MKz A0O = A0O(i4);
                    for (int i9 = 0; i9 < list.size(); i9++) {
                        if (!A0O.DDC(list.get(i9))) {
                            return false;
                        }
                    }
                }
                i3++;
                i = i7;
            }
            if (A0l && !A0i(A0O(i4), obj, A04)) {
                return false;
            }
            i3++;
            i = i7;
        }
        return true;
    }
}
