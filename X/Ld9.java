package X;

import com.facebook.acra.constants.ActionId;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import sun.misc.Unsafe;

/* loaded from: Ld9.class */
public final class Ld9 implements MKi {
    public final int[] A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final KwU A05;
    public final Kc3 A06;
    public final KY8 A07;
    public final MCx A08;
    public final KY9 A09;
    public final KwV A0A;
    public final int[] A0B;
    public final Object[] A0C;
    public static final int[] A0E = new int[0];
    public static final Unsafe A0D = LEW.A03();

    public Ld9(KwU kwU, Kc3 kc3, KY8 ky8, MCx mCx, KY9 ky9, KwV kwV, int[] iArr, int[] iArr2, Object[] objArr, int i, int i2, int i3, int i4) {
        this.A00 = iArr;
        this.A0C = objArr;
        this.A01 = i;
        this.A02 = i2;
        this.A0B = iArr2;
        this.A03 = i3;
        this.A04 = i4;
        this.A09 = ky9;
        this.A06 = kc3;
        this.A0A = kwV;
        this.A05 = kwU;
        this.A08 = mCx;
        this.A07 = ky8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002a, code lost:
    
        if (r309 >= 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A00(X.L0I r301, X.MKi r302, java.lang.Object r303, byte[] r304, int r305, int r306) {
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
            int r0 = A05(r0, r1, r2, r3)
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
            r0.DCu(r1, r2, r3, r4, r5)
            r0 = r301
            r1 = r303
            r0.A02 = r1
            r0 = r309
            return r0
        L59:
            java.lang.String r0 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            X.KLd r0 = A07(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ld9.A00(X.L0I, X.MKi, java.lang.Object, byte[], int, int):int");
    }

    public static int A01(L0I l0i, LAl lAl, byte[] bArr, int i, int i2, int i3) {
        K5U k5u;
        int i4 = i2;
        if ((i >>> 3) != 0) {
            int i5 = i & 7;
            if (i5 == 0) {
                int A04 = A04(l0i, bArr, i2);
                lAl.A02(i, Long.valueOf(l0i.A01));
                return A04;
            }
            if (i5 == 1) {
                lAl.A02(i, Long.valueOf(JR2.A0E(bArr, i2)));
                return i2 + 8;
            }
            if (i5 == 2) {
                int A03 = A03(l0i, bArr, i2);
                int i6 = l0i.A00;
                if (i6 < 0) {
                    throw A07("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                }
                int length = bArr.length;
                if (i6 > length - A03) {
                    throw A07("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (i6 == 0) {
                    k5u = Lj3.A00;
                } else {
                    Lj3.A00(A03, A03 + i6, length);
                    k5u = new K5U(JQx.A1a(bArr, i6, A03));
                }
                lAl.A02(i, k5u);
                return A03 + i6;
            }
            if (i5 == 3) {
                int i7 = (i & (-8)) | 4;
                LAl A00 = LAl.A00();
                int i8 = 0;
                while (i4 < i3) {
                    i4 = A03(l0i, bArr, i4);
                    i8 = l0i.A00;
                    if (i8 == i7) {
                        break;
                    }
                    i4 = A01(l0i, A00, bArr, i8, i4, i3);
                }
                if (i4 > i3 || i8 != i7) {
                    throw A07("Failed to parse the message.");
                }
                lAl.A02(i, A00);
                return i4;
            }
            if (i5 == 5) {
                lAl.A02(i, Integer.valueOf(A06(bArr, i2)));
                return i2 + 4;
            }
        }
        throw A07("Protocol message contained an invalid tag (zero).");
    }

    public static int A02(L0I l0i, byte[] bArr, int i) {
        int A03 = A03(l0i, bArr, i);
        int i2 = l0i.A00;
        if (i2 < 0) {
            throw A07("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int length = bArr.length;
        if (i2 > length - A03) {
            throw A07("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i2 == 0) {
            l0i.A02 = Lj3.A00;
            return A03;
        }
        Lj3.A00(A03, A03 + i2, length);
        l0i.A02 = new K5U(JQx.A1a(bArr, i2, A03));
        return A03 + i2;
    }

    public static int A03(L0I l0i, byte[] bArr, int i) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return A05(l0i, bArr, b, i2);
        }
        l0i.A00 = b;
        return i2;
    }

    public static int A04(L0I l0i, byte[] bArr, int i) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            l0i.A01 = j;
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
        l0i.A01 = j2;
        return i3;
    }

    public static int A05(L0I l0i, byte[] bArr, int i, int i2) {
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
                        l0i.A00 = i5;
                        return i6;
                    }
                }
            }
            l0i.A00 = i8 | i4;
            return i9;
        }
        i3 = b << 7;
        i5 = i7 | i3;
        l0i.A00 = i5;
        return i6;
    }

    public static int A06(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static KLd A07(String str) {
        IOException iOException = new IOException(str);
        ((KLd) iOException).zza = null;
        return iOException;
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x03ed, code lost:
    
        if (r337 == 0) goto L84;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x066b  */
    /* JADX WARN: Type inference failed for: r0v160, types: [int] */
    /* JADX WARN: Type inference failed for: r0v178, types: [int] */
    /* JADX WARN: Type inference failed for: r0v196, types: [int] */
    /* JADX WARN: Type inference failed for: r0v214, types: [int] */
    /* JADX WARN: Type inference failed for: r0v606, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.Ld9 A08(X.KwU r301, X.Kc3 r302, X.KY8 r303, X.MCw r304, X.KY9 r305, X.KwV r306) {
        /*
            Method dump skipped, instructions count: 2585
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ld9.A08(X.KwU, X.Kc3, X.KY8, X.MCw, X.KY9, X.KwV):X.Ld9");
    }

    private final MKi A09(int i) {
        Object[] objArr = this.A0C;
        int i2 = i / 3;
        int i3 = i2 + i2;
        MKi mKi = (MKi) objArr[i3];
        if (mKi == null) {
            mKi = L23.A02.A00((Class) objArr[i3 + 1]);
            objArr[i3] = mKi;
        }
        return mKi;
    }

    private final Object A0A(int i, int i2, Object obj) {
        Object object;
        MKi A09 = A09(i2);
        if (A0G(obj, i, i2)) {
            object = A0D.getObject(obj, JQx.A0S(this.A00, i2 + 1));
            if (!A0F(object)) {
                K5Q DCW = A09.DCW();
                if (object != null) {
                    A09.DCo(DCW, object);
                }
                return DCW;
            }
        } else {
            object = A09.DCW();
        }
        return object;
    }

    private final Object A0B(Object obj, int i) {
        Object object;
        MKi A09 = A09(i);
        int i2 = this.A00[i + 1] & 1048575;
        if (A0E(i, obj)) {
            object = A0D.getObject(obj, i2);
            if (!A0F(object)) {
                K5Q DCW = A09.DCW();
                if (object != null) {
                    A09.DCo(DCW, object);
                }
                return DCW;
            }
        } else {
            object = A09.DCW();
        }
        return object;
    }

    public static Field A0C(Class cls, String str) {
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

    private final void A0D(Object obj, int i) {
        int i2 = this.A00[i + 2];
        long j = 1048575 & i2;
        if (j != 1048575) {
            LEW.A07(obj, j, (1 << (i2 >>> 20)) | LEW.A00(obj, j));
        }
    }

    private final boolean A0E(int i, Object obj) {
        int[] iArr = this.A00;
        int i2 = iArr[i + 2];
        long j = i2 & 1048575;
        boolean z = false;
        if (j == 1048575) {
            int i3 = iArr[i + 1];
            int i4 = 1048575 & i3;
            int i5 = (i3 >>> 20) & 255;
            long j2 = i4;
            switch (i5) {
                case 0:
                    if (Double.doubleToRawLongBits(LEW.A00.A00(obj, j2)) != 0) {
                        return true;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(LEW.A00.A01(obj, j2)) != 0) {
                        return true;
                    }
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    if (LEW.A01(obj, j2) != 0) {
                        return true;
                    }
                    break;
                case 4:
                case 6:
                case 11:
                case 12:
                case 13:
                case 15:
                    if (LEW.A00(obj, j2) != 0) {
                        return true;
                    }
                    break;
                case 7:
                    if (!LEW.A01) {
                        return LEW.A0E(obj, j2);
                    }
                    z = LEW.A0D(obj, j2);
                    break;
                case 8:
                    Object A02 = LEW.A02(obj, j2);
                    if (A02 instanceof String) {
                        if (!((String) A02).isEmpty()) {
                            return true;
                        }
                    } else {
                        if (!(A02 instanceof Lj3)) {
                            throw JQx.A0n();
                        }
                        if (!Lj3.A00.equals(A02)) {
                            return true;
                        }
                    }
                    break;
                case 9:
                case 17:
                    if (LEW.A02(obj, j2) != null) {
                        return true;
                    }
                    break;
                case 10:
                    if (!Lj3.A00.equals(LEW.A02(obj, j2))) {
                        return true;
                    }
                    break;
                default:
                    throw JQx.A0n();
            }
        } else {
            if ((LEW.A00(obj, j) & (1 << (i2 >>> 20))) != 0) {
                return true;
            }
        }
        return z;
    }

    public static boolean A0F(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof K5Q) {
            return AnonymousClass001.A1N(((K5Q) obj).zzd & ((-1) << (-1)));
        }
        return true;
    }

    private final boolean A0G(Object obj, int i, int i2) {
        return AnonymousClass001.A1Q(LEW.A00(obj, JQx.A0S(this.A00, i2 + 2)), i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x15fa, code lost:
    
        throw A07("Protocol message had invalid UTF-8.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x15f3, code lost:
    
        throw A07("Protocol message had invalid UTF-8.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x15ec, code lost:
    
        throw A07("Protocol message had invalid UTF-8.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x1614, code lost:
    
        throw A07("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x1620, code lost:
    
        throw A07("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0223, code lost:
    
        if (r317 == 1048575) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0226, code lost:
    
        r0.putInt(r303, r317, r316);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0236, code lost:
    
        r0 = r301.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x023d, code lost:
    
        r330 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0248, code lost:
    
        if (r330 >= r301.A04) goto L570;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x024b, code lost:
    
        X.LEW.A02(r303, r301.A00[r301.A0B[r330] + 1] & 1048575);
        r0 = r330 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x15ba, code lost:
    
        if (r307 != 0) goto L447;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x15c1, code lost:
    
        if (r309 != r306) goto L453;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x15c6, code lost:
    
        return r309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x15e5, code lost:
    
        throw A07("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x15cb, code lost:
    
        if (r309 > r306) goto L453;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x15da, code lost:
    
        if (r315 != r307) goto L453;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x15df, code lost:
    
        return r309;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:296:0x0ba1. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:45:0x0346. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:509:0x0198. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0783  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x15ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x041e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x01fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x10f9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x11a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:571:0x11dc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x1578  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int A0H(X.L0I r302, java.lang.Object r303, byte[] r304, int r305, int r306, int r307) {
        /*
            Method dump skipped, instructions count: 5696
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ld9.A0H(X.L0I, java.lang.Object, byte[], int, int, int):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0044. Please report as an issue. */
    @Override // X.MKi
    public final int DC6(Object obj) {
        int i;
        int hashCode;
        boolean A1V;
        int i2;
        long A05;
        double A00;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int[] iArr = this.A00;
            if (i3 >= iArr.length) {
                return 1BK.A03(((K5Q) obj).zzc, i4 * 53);
            }
            int i5 = iArr[i3 + 1];
            int i6 = 1048575 & i5;
            int i7 = (i5 >>> 20) & 255;
            int i8 = iArr[i3];
            long j = i6;
            switch (i7) {
                case 0:
                    i2 = i4 * 53;
                    A00 = LEW.A00.A00(obj, j);
                    A05 = Double.doubleToLongBits(A00);
                    Charset charset = KdB.A02;
                    i4 = AnonymousClass002.A03(A05, i2);
                    break;
                case 1:
                    i = i4 * 53;
                    hashCode = Float.floatToIntBits(LEW.A00.A01(obj, j));
                    i4 = hashCode + i;
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    i2 = i4 * 53;
                    A05 = LEW.A01(obj, j);
                    Charset charset2 = KdB.A02;
                    i4 = AnonymousClass002.A03(A05, i2);
                    break;
                case 4:
                case 6:
                case 11:
                case 12:
                case 13:
                case 15:
                    i = i4 * 53;
                    hashCode = LEW.A00(obj, j);
                    i4 = hashCode + i;
                    break;
                case 7:
                    i = i4 * 53;
                    A1V = LEW.A01 ? LEW.A0D(obj, j) : LEW.A0E(obj, j);
                    Charset charset3 = KdB.A02;
                    hashCode = AnonymousClass002.A00(A1V ? 1 : 0);
                    i4 = hashCode + i;
                    break;
                case 8:
                    i = i4 * 53;
                    hashCode = ((String) LEW.A02(obj, j)).hashCode();
                    i4 = hashCode + i;
                    break;
                case 9:
                case 17:
                    hashCode = i4 * 53;
                    i = JQz.A0E(LEW.A02(obj, j), 37);
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
                    hashCode = LEW.A02(obj, j).hashCode();
                    i4 = hashCode + i;
                    break;
                case ActionId.UNKNOWN /* 51 */:
                    if (!A0G(obj, i8, i3)) {
                        break;
                    } else {
                        i2 = i4 * 53;
                        A00 = DKC.A00(LEW.A02(obj, j));
                        A05 = Double.doubleToLongBits(A00);
                        Charset charset22 = KdB.A02;
                        i4 = AnonymousClass002.A03(A05, i2);
                        break;
                    }
                case ActionId.RETRY_AFTER_FAILURE /* 52 */:
                    if (!A0G(obj, i8, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        hashCode = Float.floatToIntBits(7zM.A00(LEW.A02(obj, j)));
                        i4 = hashCode + i;
                        break;
                    }
                case ActionId.RETRY_AFTER_RECONNECT /* 53 */:
                    if (!A0G(obj, i8, i3)) {
                        break;
                    }
                    i2 = i4 * 53;
                    A05 = AnonymousClass001.A05(LEW.A02(obj, j));
                    Charset charset222 = KdB.A02;
                    i4 = AnonymousClass002.A03(A05, i2);
                    break;
                case ActionId.QUEUEING_BEGIN /* 54 */:
                    if (!A0G(obj, i8, i3)) {
                        break;
                    }
                    i2 = i4 * 53;
                    A05 = AnonymousClass001.A05(LEW.A02(obj, j));
                    Charset charset2222 = KdB.A02;
                    i4 = AnonymousClass002.A03(A05, i2);
                    break;
                case ActionId.QUEUEING_SUCCESS /* 55 */:
                    if (!A0G(obj, i8, i3)) {
                        break;
                    }
                    i = i4 * 53;
                    hashCode = AnonymousClass001.A03(LEW.A02(obj, j));
                    i4 = hashCode + i;
                    break;
                case ActionId.QUEUEING_FAIL /* 56 */:
                    if (!A0G(obj, i8, i3)) {
                        break;
                    }
                    i2 = i4 * 53;
                    A05 = AnonymousClass001.A05(LEW.A02(obj, j));
                    Charset charset22222 = KdB.A02;
                    i4 = AnonymousClass002.A03(A05, i2);
                    break;
                case ActionId.MESSAGE_UPDATE_START /* 57 */:
                    if (!A0G(obj, i8, i3)) {
                        break;
                    }
                    i = i4 * 53;
                    hashCode = AnonymousClass001.A03(LEW.A02(obj, j));
                    i4 = hashCode + i;
                    break;
                case ActionId.MESSAGE_UPDATE_END /* 58 */:
                    if (!A0G(obj, i8, i3)) {
                        break;
                    } else {
                        i = i4 * 53;
                        A1V = AnonymousClass001.A1V(LEW.A02(obj, j));
                        Charset charset32 = KdB.A02;
                        hashCode = AnonymousClass002.A00(A1V ? 1 : 0);
                        i4 = hashCode + i;
                        break;
                    }
                case ActionId.PHOTO_CAPTURED /* 59 */:
                    if (!A0G(obj, i8, i3)) {
                        break;
                    }
                    i = i4 * 53;
                    hashCode = ((String) LEW.A02(obj, j)).hashCode();
                    i4 = hashCode + i;
                    break;
                case ActionId.MEDIA_PREVIEW_VISIBLE /* 60 */:
                    if (!A0G(obj, i8, i3)) {
                        break;
                    }
                    i = i4 * 53;
                    hashCode = LEW.A02(obj, j).hashCode();
                    i4 = hashCode + i;
                    break;
                case ActionId.COUNTER /* 61 */:
                    if (!A0G(obj, i8, i3)) {
                        break;
                    }
                    i = i4 * 53;
                    hashCode = LEW.A02(obj, j).hashCode();
                    i4 = hashCode + i;
                    break;
                case ActionId.INTERACTION_LOAD_TIMELINE_HEADER /* 62 */:
                    if (!A0G(obj, i8, i3)) {
                        break;
                    }
                    i = i4 * 53;
                    hashCode = AnonymousClass001.A03(LEW.A02(obj, j));
                    i4 = hashCode + i;
                    break;
                case 63:
                    if (!A0G(obj, i8, i3)) {
                        break;
                    }
                    i = i4 * 53;
                    hashCode = AnonymousClass001.A03(LEW.A02(obj, j));
                    i4 = hashCode + i;
                    break;
                case 64:
                    if (!A0G(obj, i8, i3)) {
                        break;
                    }
                    i = i4 * 53;
                    hashCode = AnonymousClass001.A03(LEW.A02(obj, j));
                    i4 = hashCode + i;
                    break;
                case ActionId.INTERACTION_LOAD_PAGE_HEADER /* 65 */:
                    if (!A0G(obj, i8, i3)) {
                        break;
                    }
                    i2 = i4 * 53;
                    A05 = AnonymousClass001.A05(LEW.A02(obj, j));
                    Charset charset222222 = KdB.A02;
                    i4 = AnonymousClass002.A03(A05, i2);
                    break;
                case ActionId.INTERACTION_LOAD_PAGE_HEADER_ADMIN /* 66 */:
                    if (!A0G(obj, i8, i3)) {
                        break;
                    }
                    i = i4 * 53;
                    hashCode = AnonymousClass001.A03(LEW.A02(obj, j));
                    i4 = hashCode + i;
                    break;
                case ActionId.INTERACTION_LOAD_PERMALINK /* 67 */:
                    if (!A0G(obj, i8, i3)) {
                        break;
                    }
                    i2 = i4 * 53;
                    A05 = AnonymousClass001.A05(LEW.A02(obj, j));
                    Charset charset2222222 = KdB.A02;
                    i4 = AnonymousClass002.A03(A05, i2);
                    break;
                case ActionId.INTERACTION_OPEN_COMPOSER /* 68 */:
                    if (!A0G(obj, i8, i3)) {
                        break;
                    }
                    i = i4 * 53;
                    hashCode = LEW.A02(obj, j).hashCode();
                    i4 = hashCode + i;
                    break;
            }
            i3 += 3;
        }
    }

    @Override // X.MKi
    public final K5Q DCW() {
        return new K5W();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x0096. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012c A[SYNTHETIC] */
    @Override // X.MKi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void DCg(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 549
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ld9.DCg(java.lang.Object):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x005e. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v123, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v211, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v262, types: [java.lang.Object] */
    @Override // X.MKi
    public final void DCo(Object obj, Object obj2) {
        int i;
        K5R k5r;
        Object object;
        MKi A09;
        K5Q object2;
        K5Q DCW;
        if (!A0F(obj)) {
            throw AnonymousClass001.A0L("Mutating immutable message: ".concat(JQx.A0w(obj)));
        }
        obj2.getClass();
        while (true) {
            int i2 = i;
            int[] iArr = this.A00;
            if (i2 >= iArr.length) {
                Kyd.A00(obj, obj2);
                return;
            }
            int i3 = iArr[i2 + 1];
            int i4 = 1048575 & i3;
            int i5 = (i3 >>> 20) & 255;
            int i6 = iArr[i2];
            long j = i4;
            switch (i5) {
                case 0:
                    if (A0E(i2, obj2)) {
                        Ktw ktw = LEW.A00;
                        ktw.A02(obj, j, ktw.A00(obj2, j));
                        A0D(obj, i2);
                    }
                case 1:
                    if (A0E(i2, obj2)) {
                        Ktw ktw2 = LEW.A00;
                        ktw2.A03(obj, j, ktw2.A01(obj2, j));
                        A0D(obj, i2);
                    }
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    if (A0E(i2, obj2)) {
                        LEW.A08(obj, j, LEW.A01(obj2, j));
                        A0D(obj, i2);
                    }
                case 4:
                case 6:
                case 11:
                case 12:
                case 13:
                case 15:
                    if (A0E(i2, obj2)) {
                        LEW.A07(obj, j, LEW.A00(obj2, j));
                        A0D(obj, i2);
                    }
                case 7:
                    if (A0E(i2, obj2)) {
                        if (LEW.A01) {
                            LEW.A0A(obj, j, LEW.A0D(obj2, j));
                        } else {
                            LEW.A0B(obj, j, LEW.A0E(obj2, j));
                        }
                        A0D(obj, i2);
                    }
                case 8:
                case 10:
                    if (A0E(i2, obj2)) {
                        LEW.A09(obj, j, LEW.A02(obj2, j));
                        A0D(obj, i2);
                    }
                case 9:
                case 17:
                    if (A0E(i2, obj2)) {
                        int i7 = iArr[i2 + 1] & 1048575;
                        Unsafe unsafe = A0D;
                        long j2 = i7;
                        object = unsafe.getObject(obj2, j2);
                        if (object == null) {
                            throw JR1.A0m(obj2, iArr, i2);
                        }
                        A09 = A09(i2);
                        if (A0E(i2, obj)) {
                            object2 = unsafe.getObject(obj, j2);
                            if (!A0F(object2)) {
                                DCW = A09.DCW();
                                A09.DCo(DCW, object2);
                                unsafe.putObject(obj, j2, DCW);
                                object2 = DCW;
                            }
                            A09.DCo(object2, object);
                        } else {
                            if (A0F(object)) {
                                K5Q DCW2 = A09.DCW();
                                A09.DCo(DCW2, object);
                                unsafe.putObject(obj, j2, DCW2);
                            } else {
                                unsafe.putObject(obj, j2, object);
                            }
                            A0D(obj, i2);
                        }
                    } else {
                        continue;
                    }
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
                    if (this.A06 instanceof K5X) {
                        MRP mrp = (MRP) LEW.A02(obj, j);
                        MRP mrp2 = (List) LEW.A02(obj2, j);
                        int size = mrp.size();
                        int size2 = mrp2.size();
                        if (size > 0) {
                            if (size2 > 0) {
                                if (!((Ly6) mrp).A00) {
                                    mrp = mrp.DCX(size2 + size);
                                }
                                mrp.addAll(mrp2);
                            }
                            mrp2 = mrp;
                        }
                        LEW.A09(obj, j, mrp2);
                    } else {
                        K5R k5r2 = (List) LEW.A02(obj2, j);
                        int size3 = k5r2.size();
                        K5R k5r3 = (List) LEW.A02(obj, j);
                        if (k5r3.isEmpty()) {
                            k5r3 = k5r3 instanceof MRI ? new K5R(size3) : AnonymousClass001.A0t(size3);
                            LEW.A09(obj, j, k5r3);
                        } else {
                            if (JR0.A1V(K5Y.A00, k5r3)) {
                                k5r = JR1.A12(k5r3, size3);
                                k5r.addAll(k5r3);
                            } else if (k5r3 instanceof Ly7) {
                                MRI mri = K5R.A01;
                                k5r = new K5R(((List) k5r3).size() + size3);
                                k5r.addAll(k5r.size(), (Collection) k5r3);
                            }
                            LEW.A09(obj, j, k5r);
                            k5r3 = k5r;
                        }
                        int size4 = k5r3.size();
                        int size5 = k5r2.size();
                        if (size4 > 0) {
                            if (size5 > 0) {
                                k5r3.addAll(k5r2);
                            }
                            k5r2 = k5r3;
                        }
                        LEW.A09(obj, j, k5r2);
                    }
                case 50:
                    KwV kwV = Kyd.A01;
                    LEW.A02(obj, j);
                    LEW.A02(obj2, j);
                    throw AnonymousClass001.A0Q("isEmpty");
                case ActionId.UNKNOWN /* 51 */:
                case ActionId.RETRY_AFTER_FAILURE /* 52 */:
                case ActionId.RETRY_AFTER_RECONNECT /* 53 */:
                case ActionId.QUEUEING_BEGIN /* 54 */:
                case ActionId.QUEUEING_SUCCESS /* 55 */:
                case ActionId.QUEUEING_FAIL /* 56 */:
                case ActionId.MESSAGE_UPDATE_START /* 57 */:
                case ActionId.MESSAGE_UPDATE_END /* 58 */:
                case ActionId.PHOTO_CAPTURED /* 59 */:
                    i = A0G(obj2, i6, i2) ? 0 : i2 + 3;
                    LEW.A09(obj, j, LEW.A02(obj2, j));
                    LEW.A07(obj, iArr[i2 + 2] & 1048575, i6);
                case ActionId.MEDIA_PREVIEW_VISIBLE /* 60 */:
                case ActionId.INTERACTION_OPEN_COMPOSER /* 68 */:
                    int i8 = iArr[i2];
                    if (A0G(obj2, i8, i2)) {
                        int i9 = iArr[i2 + 1] & 1048575;
                        Unsafe unsafe2 = A0D;
                        long j3 = i9;
                        object = unsafe2.getObject(obj2, j3);
                        if (object == null) {
                            throw JR1.A0m(obj2, iArr, i2);
                        }
                        A09 = A09(i2);
                        if (A0G(obj, i8, i2)) {
                            object2 = unsafe2.getObject(obj, j3);
                            if (!A0F(object2)) {
                                DCW = A09.DCW();
                                A09.DCo(DCW, object2);
                                unsafe2.putObject(obj, j3, DCW);
                                object2 = DCW;
                            }
                            A09.DCo(object2, object);
                        } else {
                            if (A0F(object)) {
                                K5Q DCW3 = A09.DCW();
                                A09.DCo(DCW3, object);
                                unsafe2.putObject(obj, j3, DCW3);
                            } else {
                                unsafe2.putObject(obj, j3, object);
                            }
                            LEW.A07(obj, iArr[i2 + 2] & 1048575, i8);
                        }
                    } else {
                        continue;
                    }
                case ActionId.COUNTER /* 61 */:
                case ActionId.INTERACTION_LOAD_TIMELINE_HEADER /* 62 */:
                case 63:
                case 64:
                case ActionId.INTERACTION_LOAD_PAGE_HEADER /* 65 */:
                case ActionId.INTERACTION_LOAD_PAGE_HEADER_ADMIN /* 66 */:
                case ActionId.INTERACTION_LOAD_PERMALINK /* 67 */:
                    if (!A0G(obj2, i6, i2)) {
                    }
                    LEW.A09(obj, j, LEW.A02(obj2, j));
                    LEW.A07(obj, iArr[i2 + 2] & 1048575, i6);
                default:
            }
        }
    }

    @Override // X.MKi
    public final void DCu(L0I l0i, Object obj, byte[] bArr, int i, int i2) {
        A0H(l0i, obj, bArr, i, i2, 0);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0045. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0348 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0168 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0348 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0168 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0348 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0168 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v52, types: [int] */
    /* JADX WARN: Type inference failed for: r0v54, types: [int] */
    @Override // X.MKi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean DD0(java.lang.Object r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 842
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ld9.DD0(java.lang.Object, java.lang.Object):boolean");
    }
}
