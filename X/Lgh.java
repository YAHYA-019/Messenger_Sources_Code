package X;

import com.facebook.acra.constants.ActionId;
import com.google.repack.protobuf.MessageLite;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: Lgh.class */
public final class Lgh implements MLr {
    public final int A00;
    public final int A01;
    public final KoP A02;
    public final MessageLite A03;
    public final int[] A04;
    public final int[] A05;
    public final Object[] A06;
    public final int A07;
    public final int A08;
    public final Kwh A09;
    public final L6I A0A;
    public final KYm A0B;
    public final L1E A0C;
    public final boolean A0D;
    public final boolean A0E;
    public static final int[] A0G = new int[0];
    public static final Unsafe A0F = LE5.A04();

    public Lgh(Kwh kwh, KoP koP, L6I l6i, MessageLite messageLite, KYm kYm, L1E l1e, int[] iArr, int[] iArr2, Object[] objArr, int i, int i2, int i3, int i4, boolean z) {
        this.A04 = iArr;
        this.A06 = objArr;
        this.A08 = i;
        this.A07 = i2;
        this.A0D = messageLite instanceof KJb;
        this.A0E = z;
        this.A05 = iArr2;
        this.A00 = i3;
        this.A01 = i4;
        this.A0B = kYm;
        this.A02 = koP;
        this.A0C = l1e;
        this.A09 = kwh;
        this.A03 = messageLite;
        this.A0A = l6i;
    }

    private int A00(int i) {
        int i2;
        if (i >= this.A08 && i <= this.A07) {
            int i3 = 0;
            int[] iArr = this.A04;
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

    private int A01(int i, int i2) {
        int i3;
        if (i >= this.A08 && i <= this.A07) {
            int[] iArr = this.A04;
            int length = (iArr.length / 3) - 1;
            while (true) {
                i3 = -1;
                if (i2 > length) {
                    break;
                }
                int i4 = (length + i2) >>> 1;
                i3 = i4 * 3;
                int i5 = iArr[i3];
                if (i == i5) {
                    break;
                }
                if (i < i5) {
                    length = i4 - 1;
                } else {
                    i2 = i4 + 1;
                }
            }
        } else {
            i3 = -1;
        }
        return i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0028, code lost:
    
        if (r308 >= 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A02(X.L0L r301, X.MLr r302, byte[] r303, int r304, int r305) {
        /*
            r0 = r304
            r1 = 1
            int r0 = r0 + r1
            r306 = r0
            r0 = r303
            r307 = r0
            r0 = r303
            r1 = r304
            r0 = r0[r1]
            r308 = r0
            r0 = r301
            r309 = r0
            r0 = r308
            if (r0 >= 0) goto L2b
            r0 = r301
            r1 = r303
            r2 = r308
            r3 = r306
            int r0 = A0D(r0, r1, r2, r3)
            r306 = r0
            r0 = r301
            int r0 = r0.A00
            r308 = r0
            r0 = r308
            if (r0 < 0) goto L69
        L2b:
            r0 = r305
            r1 = r306
            int r0 = r0 - r1
            r305 = r0
            r0 = r308
            r1 = r305
            if (r0 > r1) goto L69
            r0 = r302
            java.lang.Object r0 = r0.BfF()
            r310 = r0
            r0 = r308
            r1 = r306
            int r0 = r0 + r1
            r308 = r0
            r0 = r302
            r1 = r309
            r2 = r310
            r3 = r307
            r4 = r306
            r5 = r308
            r0.Be8(r1, r2, r3, r4, r5)
            r0 = r302
            r1 = r310
            r0.BcF(r1)
            r0 = r301
            r1 = r310
            r0.A02 = r1
            r0 = r308
            return r0
        L69:
            java.lang.String r0 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            X.KLt r0 = X.KLt.A02(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Lgh.A02(X.L0L, X.MLr, byte[], int, int):int");
    }

    public static int A03(L0L l0l, MLr mLr, byte[] bArr, int i, int i2, int i3) {
        Lgh lgh = (Lgh) mLr;
        Object BfF = lgh.BfF();
        int A0X = lgh.A0X(l0l, BfF, bArr, i, i2, i3);
        lgh.BcF(BfF);
        l0l.A02 = BfF;
        return A0X;
    }

    public static int A04(L0L l0l, L57 l57, byte[] bArr, int i, int i2, int i3) {
        int i4 = i2;
        if ((i >>> 3) != 0) {
            int i5 = i & 7;
            if (i5 == 0) {
                int A0C = A0C(l0l, bArr, i2);
                l57.A01(i, Long.valueOf(l0l.A01));
                return A0C;
            }
            if (i5 == 1) {
                l57.A01(i, Long.valueOf(JR2.A0F(bArr, i2)));
                return i2 + 8;
            }
            if (i5 == 2) {
                int A0B = A0B(l0l, bArr, i2);
                int i6 = l0l.A00;
                if (i6 < 0) {
                    throw KLt.A02("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                }
                if (i6 > bArr.length - A0B) {
                    throw KLt.A02("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                l57.A01(i, i6 == 0 ? Lj5.A00 : Lj5.A01(bArr, A0B, i6));
                return A0B + i6;
            }
            if (i5 == 3) {
                L57 l572 = new L57();
                int i7 = (i & (-8)) | 4;
                int i8 = 0;
                while (i4 < i3) {
                    i4 = A0B(l0l, bArr, i4);
                    i8 = l0l.A00;
                    if (i8 == i7) {
                        break;
                    }
                    i4 = A04(l0l, l572, bArr, i8, i4, i3);
                }
                if (i4 > i3 || i8 != i7) {
                    throw KLt.A02("Failed to parse the message.");
                }
                l57.A01(i, l572);
                return i4;
            }
            if (i5 == 5) {
                l57.A01(i, Integer.valueOf(JR2.A08(bArr, i2)));
                return i2 + 4;
            }
        }
        throw KLt.A02("Protocol message contained an invalid tag (zero).");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0014. Please report as an issue. */
    public static int A05(L0L l0l, KOI koi, Class cls, byte[] bArr, int i, int i2) {
        Object valueOf;
        Object valueOf2;
        int A0C;
        Object valueOf3;
        switch (KbJ.A00[koi.ordinal()]) {
            case 1:
                A0C = A0C(l0l, bArr, i);
                valueOf3 = Boolean.valueOf(AnonymousClass001.A1N((l0l.A01 > 0L ? 1 : (l0l.A01 == 0L ? 0 : -1))));
                l0l.A02 = valueOf3;
                return A0C;
            case 2:
                return A09(l0l, bArr, i);
            case 3:
                valueOf = Double.valueOf(Double.longBitsToDouble(JR2.A0F(bArr, i)));
                l0l.A02 = valueOf;
                return i + 8;
            case 4:
            case 5:
                valueOf2 = Integer.valueOf(JR2.A08(bArr, i));
                l0l.A02 = valueOf2;
                return i + 4;
            case 6:
            case 7:
                valueOf = Long.valueOf(JR2.A0F(bArr, i));
                l0l.A02 = valueOf;
                return i + 8;
            case 8:
                valueOf2 = Float.valueOf(Float.intBitsToFloat(JR2.A08(bArr, i)));
                l0l.A02 = valueOf2;
                return i + 4;
            case 9:
            case 10:
            case 11:
                A0C = A0B(l0l, bArr, i);
                valueOf3 = Integer.valueOf(l0l.A00);
                l0l.A02 = valueOf3;
                return A0C;
            case 12:
            case 13:
                A0C = A0C(l0l, bArr, i);
                valueOf3 = Long.valueOf(l0l.A01);
                l0l.A02 = valueOf3;
                return A0C;
            case 14:
                return A02(l0l, L26.A02.A00(cls), bArr, i, i2);
            case 15:
                A0C = A0B(l0l, bArr, i);
                valueOf3 = Integer.valueOf(JQx.A07(l0l.A00));
                l0l.A02 = valueOf3;
                return A0C;
            case 16:
                A0C = A0C(l0l, bArr, i);
                valueOf3 = Long.valueOf(JQy.A0M(l0l.A01));
                l0l.A02 = valueOf3;
                return A0C;
            case 17:
                return A0A(l0l, bArr, i);
            default:
                throw AnonymousClass001.A0T("unsupported field type.");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x003f. Please report as an issue. */
    private int A06(L0L l0l, Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j) {
        int A03;
        Object object;
        Object valueOf;
        Object object2;
        Unsafe unsafe = A0F;
        long A0S = JQx.A0S(this.A04, i8 + 2);
        switch (i7) {
            case ActionId.UNKNOWN /* 51 */:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(JR2.A0F(bArr, i))));
                    A03 = i + 8;
                    unsafe.putInt(obj, A0S, i4);
                    return A03;
                }
                return i;
            case ActionId.RETRY_AFTER_FAILURE /* 52 */:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(JR2.A08(bArr, i))));
                    A03 = i + 4;
                    unsafe.putInt(obj, A0S, i4);
                    return A03;
                }
                return i;
            case ActionId.RETRY_AFTER_RECONNECT /* 53 */:
            case ActionId.QUEUEING_BEGIN /* 54 */:
                if (i5 == 0) {
                    A03 = A0C(l0l, bArr, i);
                    valueOf = Long.valueOf(l0l.A01);
                    unsafe.putObject(obj, j, valueOf);
                    unsafe.putInt(obj, A0S, i4);
                    return A03;
                }
                return i;
            case ActionId.QUEUEING_SUCCESS /* 55 */:
            case ActionId.INTERACTION_LOAD_TIMELINE_HEADER /* 62 */:
                if (i5 == 0) {
                    A03 = A0B(l0l, bArr, i);
                    valueOf = Integer.valueOf(l0l.A00);
                    unsafe.putObject(obj, j, valueOf);
                    unsafe.putInt(obj, A0S, i4);
                    return A03;
                }
                return i;
            case ActionId.QUEUEING_FAIL /* 56 */:
            case ActionId.INTERACTION_LOAD_PAGE_HEADER /* 65 */:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(JR2.A0F(bArr, i)));
                    A03 = i + 8;
                    unsafe.putInt(obj, A0S, i4);
                    return A03;
                }
                return i;
            case ActionId.MESSAGE_UPDATE_START /* 57 */:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(JR2.A08(bArr, i)));
                    A03 = i + 4;
                    unsafe.putInt(obj, A0S, i4);
                    return A03;
                }
                return i;
            case ActionId.MESSAGE_UPDATE_END /* 58 */:
                if (i5 == 0) {
                    A03 = A0C(l0l, bArr, i);
                    valueOf = Boolean.valueOf(AnonymousClass001.A1N((l0l.A01 > 0L ? 1 : (l0l.A01 == 0L ? 0 : -1))));
                    unsafe.putObject(obj, j, valueOf);
                    unsafe.putInt(obj, A0S, i4);
                    return A03;
                }
                return i;
            case ActionId.PHOTO_CAPTURED /* 59 */:
                if (i5 == 2) {
                    A03 = A0B(l0l, bArr, i);
                    int i9 = l0l.A00;
                    if (i9 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else {
                        if ((i6 & 536870912) != 0) {
                            if (Kxt.A00.A03(bArr, A03, A03 + i9) != 0) {
                                throw KLt.A02("Protocol message had invalid UTF-8.");
                            }
                        }
                        unsafe.putObject(obj, j, JQx.A0y(Kyu.A04, bArr, A03, i9));
                        A03 += i9;
                    }
                    unsafe.putInt(obj, A0S, i4);
                    return A03;
                }
                return i;
            case ActionId.MEDIA_PREVIEW_VISIBLE /* 60 */:
                if (i5 == 2) {
                    A03 = A02(l0l, A0L(i8), bArr, i, i2);
                    unsafe.putObject(obj, j, (unsafe.getInt(obj, A0S) != i4 || (object2 = unsafe.getObject(obj, j)) == null) ? l0l.A02 : Kyu.A00(object2, l0l.A02));
                    unsafe.putInt(obj, A0S, i4);
                    return A03;
                }
                return i;
            case ActionId.COUNTER /* 61 */:
                if (i5 == 2) {
                    A03 = A09(l0l, bArr, i);
                    unsafe.putObject(obj, j, l0l.A02);
                    unsafe.putInt(obj, A0S, i4);
                    return A03;
                }
                return i;
            case 63:
                if (i5 == 0) {
                    A03 = A0B(l0l, bArr, i);
                    unsafe.putObject(obj, j, Integer.valueOf(l0l.A00));
                    unsafe.putInt(obj, A0S, i4);
                    return A03;
                }
                return i;
            case ActionId.INTERACTION_LOAD_PAGE_HEADER_ADMIN /* 66 */:
                if (i5 == 0) {
                    A03 = A0B(l0l, bArr, i);
                    valueOf = Integer.valueOf(JQx.A07(l0l.A00));
                    unsafe.putObject(obj, j, valueOf);
                    unsafe.putInt(obj, A0S, i4);
                    return A03;
                }
                return i;
            case ActionId.INTERACTION_LOAD_PERMALINK /* 67 */:
                if (i5 == 0) {
                    A03 = A0C(l0l, bArr, i);
                    valueOf = Long.valueOf(JQy.A0M(l0l.A01));
                    unsafe.putObject(obj, j, valueOf);
                    unsafe.putInt(obj, A0S, i4);
                    return A03;
                }
                return i;
            case ActionId.INTERACTION_OPEN_COMPOSER /* 68 */:
                if (i5 == 3) {
                    A03 = A03(l0l, A0L(i8), bArr, i, i2, (i3 & (-8)) | 4);
                    unsafe.putObject(obj, j, (unsafe.getInt(obj, A0S) != i4 || (object = unsafe.getObject(obj, j)) == null) ? l0l.A02 : Kyu.A00(object, l0l.A02));
                    unsafe.putInt(obj, A0S, i4);
                    return A03;
                }
                return i;
            default:
                return i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0703, code lost:
    
        if (r321 != r320) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0557, code lost:
    
        if (r321 == r0) goto L156;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0069. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:153:0x06ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int A07(X.L0L r302, java.lang.Object r303, byte[] r304, int r305, int r306, int r307, int r308, int r309, int r310, long r311, long r313) {
        /*
            Method dump skipped, instructions count: 1911
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Lgh.A07(X.L0L, java.lang.Object, byte[], int, int, int, int, int, int, long, long):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v91, types: [int] */
    private int A08(L0L l0l, Object obj, byte[] bArr, int i, int i2, int i3, long j) {
        Unsafe unsafe = A0F;
        Object obj2 = this.A06[(i3 / 3) * 2];
        Object object = unsafe.getObject(obj, j);
        if (!((Lyh) object).isMutable) {
            Lyh A01 = Lyh.A00.A01();
            L6I.A01(A01, object);
            unsafe.putObject(obj, j, A01);
            object = A01;
        }
        KkY kkY = ((Kjl) obj2).A00;
        AbstractMap abstractMap = (AbstractMap) object;
        int A0B = A0B(l0l, bArr, i);
        int i4 = l0l.A00;
        if (i4 < 0 || i4 > i2 - A0B) {
            throw KLt.A02("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i5 = A0B + i4;
        Object obj3 = "";
        Object obj4 = kkY.A03;
        Object obj5 = obj4;
        while (A0B < i5) {
            int i6 = A0B + 1;
            byte b = bArr[A0B];
            if (b < 0) {
                i6 = A0D(l0l, bArr, b, i6);
                b = l0l.A00;
            }
            int i7 = b >>> 3;
            int i8 = b & 7;
            if (i7 != 1) {
                if (i7 == 2) {
                    KOI koi = kkY.A01;
                    if (i8 == koi.wireType) {
                        A0B = A05(l0l, koi, obj4.getClass(), bArr, i6, i2);
                        obj5 = l0l.A02;
                    }
                }
                A0B = A0E(l0l, bArr, b, i6, i2);
            } else {
                KOI koi2 = kkY.A00;
                if (i8 == koi2.wireType) {
                    A0B = A05(l0l, koi2, null, bArr, i6, i2);
                    obj3 = l0l.A02;
                } else {
                    A0B = A0E(l0l, bArr, b, i6, i2);
                }
            }
        }
        if (A0B != i5) {
            throw KLt.A02("Failed to parse the message.");
        }
        abstractMap.put(obj3, obj5);
        return i5;
    }

    public static int A09(L0L l0l, byte[] bArr, int i) {
        int A0B = A0B(l0l, bArr, i);
        int i2 = l0l.A00;
        if (i2 < 0) {
            throw KLt.A02("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 > bArr.length - A0B) {
            throw KLt.A02("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i2 == 0) {
            l0l.A02 = Lj5.A00;
            return A0B;
        }
        l0l.A02 = Lj5.A01(bArr, A0B, i2);
        return A0B + i2;
    }

    public static int A0A(L0L l0l, byte[] bArr, int i) {
        int A0B = A0B(l0l, bArr, i);
        int i2 = l0l.A00;
        if (i2 < 0) {
            throw KLt.A02("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 == 0) {
            l0l.A02 = "";
            return A0B;
        }
        l0l.A02 = Kxt.A00.A04(bArr, A0B, i2);
        return A0B + i2;
    }

    public static int A0B(L0L l0l, byte[] bArr, int i) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return A0D(l0l, bArr, b, i2);
        }
        l0l.A00 = b;
        return i2;
    }

    public static int A0C(L0L l0l, byte[] bArr, int i) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            l0l.A01 = j;
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
        l0l.A01 = j2;
        return i3;
    }

    public static int A0D(L0L l0l, byte[] bArr, int i, int i2) {
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
                        l0l.A00 = i5;
                        return i7;
                    }
                }
            }
            l0l.A00 = i8 | i4;
            return i9;
        }
        i3 = b << 7;
        i5 = i6 | i3;
        l0l.A00 = i5;
        return i7;
    }

    public static int A0E(L0L l0l, byte[] bArr, int i, int i2, int i3) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return A0C(l0l, bArr, i2);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return A0B(l0l, bArr, i2) + l0l.A00;
            }
            if (i4 == 3) {
                int i5 = (i & (-8)) | 4;
                int i6 = 0;
                while (i2 < i3) {
                    i2 = A0B(l0l, bArr, i2);
                    i6 = l0l.A00;
                    if (i6 == i5) {
                        break;
                    }
                    i2 = A0E(l0l, bArr, i6, i2, i3);
                }
                if (i2 > i3 || i6 != i5) {
                    throw KLt.A02("Failed to parse the message.");
                }
                return i2;
            }
            if (i4 == 5) {
                return i2 + 4;
            }
        }
        throw KLt.A02("Protocol message contained an invalid tag (zero).");
    }

    public static int A0F(Object obj) {
        L1E l1e = LEh.A02;
        return ((List) obj).size();
    }

    public static int A0G(Object obj, int i) {
        return LE5.A02.A06(obj, i & 1048575);
    }

    public static long A0H(LDr lDr, int i) {
        long j = i & 1048575;
        LDr.A08(lDr, 0);
        return j;
    }

    public static long A0I(LDr lDr, int i) {
        long j = i & 1048575;
        LDr.A08(lDr, 1);
        return j;
    }

    public static long A0J(LDr lDr, int i) {
        long j = i & 1048575;
        LDr.A08(lDr, 5);
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x03fb, code lost:
    
        if (r0 == false) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v164, types: [int] */
    /* JADX WARN: Type inference failed for: r0v182, types: [int] */
    /* JADX WARN: Type inference failed for: r0v200, types: [int] */
    /* JADX WARN: Type inference failed for: r0v218, types: [int] */
    /* JADX WARN: Type inference failed for: r0v265 */
    /* JADX WARN: Type inference failed for: r0v293 */
    /* JADX WARN: Type inference failed for: r0v358, types: [int] */
    /* JADX WARN: Type inference failed for: r0v398 */
    /* JADX WARN: Type inference failed for: r0v415 */
    /* JADX WARN: Type inference failed for: r0v419 */
    /* JADX WARN: Type inference failed for: r0v521, types: [int] */
    /* JADX WARN: Type inference failed for: r0v543, types: [int] */
    /* JADX WARN: Type inference failed for: r0v560, types: [int] */
    /* JADX WARN: Type inference failed for: r0v591, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.Lgh A0K(X.Kwh r301, X.KoP r302, X.L6I r303, X.KYm r304, X.KkZ r305, X.L1E r306) {
        /*
            Method dump skipped, instructions count: 2548
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Lgh.A0K(X.Kwh, X.KoP, X.L6I, X.KYm, X.KkZ, X.L1E):X.Lgh");
    }

    private MLr A0L(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.A06;
        MLr mLr = (MLr) objArr[i2];
        if (mLr == null) {
            mLr = L26.A02.A00((Class) objArr[i2 + 1]);
            objArr[i2] = mLr;
        }
        return mLr;
    }

    public static Object A0M(int i, Object obj) {
        return LE5.A02.A09(obj, i & 1048575);
    }

    public static Field A0N(Class cls, String str) {
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

    public static List A0O(int i, Object obj) {
        return (List) LE5.A02.A09(obj, i & 1048575);
    }

    public static List A0P(Lgh lgh, Object obj, int i) {
        return lgh.A02.A01(obj, i & 1048575);
    }

    public static List A0Q(Object obj, long j) {
        List list = (List) LE5.A02.A09(obj, j);
        L1E l1e = LEh.A02;
        return list;
    }

    private void A0R(LDr lDr, Object obj, int i) {
        long A0N;
        String A0U;
        if ((536870912 & i) != 0) {
            A0N = JQx.A0N(i);
            LDr.A08(lDr, 2);
            A0U = lDr.A03.A0V();
        } else {
            boolean z = this.A0D;
            A0N = JQx.A0N(i);
            LDr.A08(lDr, 2);
            Kuv kuv = lDr.A03;
            A0U = z ? kuv.A0U() : kuv.A0T();
        }
        LE5.A06(obj, A0N, A0U);
    }

    private void A0S(Kg7 kg7, Object obj, int i, int i2) {
        if (obj != null) {
            KkY kkY = ((Kjl) this.A06[(i2 / 3) * 2]).A00;
            KEH keh = kg7.A00;
            Iterator A0x = AnonymousClass001.A0x((AbstractMap) obj);
            while (A0x.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0x);
                Kwg.A07(keh, i);
                Object key = A0z.getKey();
                Object value = A0z.getValue();
                KOI koi = kkY.A00;
                int A00 = LCK.A00(koi, key, 1);
                KOI koi2 = kkY.A01;
                keh.A08(A00 + LCK.A00(koi2, value, 2));
                Object key2 = A0z.getKey();
                Object value2 = A0z.getValue();
                LCK.A01(keh, koi, key2, 1);
                LCK.A01(keh, koi2, value2, 2);
            }
        }
    }

    private void A0T(Object obj, int i) {
        int i2 = this.A04[i + 2];
        long j = 1048575 & i2;
        if (j != 1048575) {
            LE5.A05(obj, j, (1 << (i2 >>> 20)) | LE5.A02.A06(obj, j));
        }
    }

    private final void A0U(Object obj, int i) {
        LE5.A02.A09(obj, JQx.A0S(this.A04, i + 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x01bb, code lost:
    
        r310 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e9, code lost:
    
        if (java.lang.Float.floatToRawIntBits(X.LE5.A02.A04(r303, r0)) != 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0147, code lost:
    
        if (X.LE5.A02.A06(r303, r0) != 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0165, code lost:
    
        if (X.LE5.A02.A07(r303, r0) != 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x01b8, code lost:
    
        if (X.L5X.A00(r303, r0) != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01a8, code lost:
    
        if ((X.LE5.A02.A06(r303, r0) & (1 << (r0 >>> 20))) != 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00cb, code lost:
    
        if (java.lang.Double.doubleToRawLongBits(X.LE5.A02.A03(r303, r0)) != 0) goto L39;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0053. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0V(int r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Lgh.A0V(int, java.lang.Object):boolean");
    }

    private boolean A0W(Object obj, int i, int i2) {
        return AnonymousClass001.A1Q(A0G(obj, this.A04[i2 + 2]), i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:57:0x01b1. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0435  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int A0X(X.L0L r302, java.lang.Object r303, byte[] r304, int r305, int r306, int r307) {
        /*
            Method dump skipped, instructions count: 1753
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Lgh.A0X(X.L0L, java.lang.Object, byte[], int, int, int):int");
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
    @Override // X.MLr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean AQr(java.lang.Object r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 821
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Lgh.AQr(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0554, code lost:
    
        if (r315 >= 0) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x078d, code lost:
    
        if (r315 >= 0) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0952, code lost:
    
        if (r315 >= 0) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0cc6, code lost:
    
        if (r315 >= 0) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x1442, code lost:
    
        r321 = 10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0d6c, code lost:
    
        if (r315 >= 0) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x127a, code lost:
    
        if (r315 >= 0) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x1430, code lost:
    
        if (r315 >= 0) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x04a6, code lost:
    
        if (r315 >= 0) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0964, code lost:
    
        r315 = 10;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:213:0x0b18. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0055. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0804  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x086e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x08c3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x097b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x099b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0a3d  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x11f1  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0c3c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x1212  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0c3c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x1290  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0c3c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x12d1  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0c3c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x12f1  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0c3c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x1356  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0c3c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x13a6  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0c3c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x1459  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0c3c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x1479  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0c3c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x1525  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0c3c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:350:0x1120  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0c3c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0704  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0725  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x07a3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x07c4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x07e4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0178 A[SYNTHETIC] */
    @Override // X.MLr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int BA4(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 5505
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Lgh.BA4(java.lang.Object):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x003a. Please report as an issue. */
    @Override // X.MLr
    public int BNo(Object obj) {
        int i;
        int hashCode;
        long A05;
        boolean A1V;
        float A00;
        double A002;
        int[] iArr = this.A04;
        int length = iArr.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int i4 = iArr[i3 + 1];
            int i5 = iArr[i3];
            long A0N = JQx.A0N(i4);
            switch (JQx.A06(i4)) {
                case 0:
                    i = i2 * 53;
                    A002 = LE5.A02.A03(obj, A0N);
                    A05 = Double.doubleToLongBits(A002);
                    Charset charset = Kyu.A04;
                    hashCode = 1BL.A01(A05);
                    i2 = i + hashCode;
                    break;
                case 1:
                    i = i2 * 53;
                    A00 = LE5.A02.A04(obj, A0N);
                    hashCode = Float.floatToIntBits(A00);
                    i2 = i + hashCode;
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    i = i2 * 53;
                    A05 = LE5.A02.A07(obj, A0N);
                    Charset charset2 = Kyu.A04;
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
                    hashCode = LE5.A02.A06(obj, A0N);
                    i2 = i + hashCode;
                    break;
                case 7:
                    i = i2 * 53;
                    A1V = LE5.A02.A0L(obj, A0N);
                    Charset charset3 = Kyu.A04;
                    hashCode = AnonymousClass002.A00(A1V ? 1 : 0);
                    i2 = i + hashCode;
                    break;
                case 8:
                    i = i2 * 53;
                    hashCode = ((String) L5X.A00(obj, A0N)).hashCode();
                    i2 = i + hashCode;
                    break;
                case 9:
                case 17:
                    hashCode = JQz.A0E(L5X.A00(obj, A0N), 37);
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
                    hashCode = L5X.A00(obj, A0N).hashCode();
                    i2 = i + hashCode;
                    break;
                case ActionId.UNKNOWN /* 51 */:
                    if (A0W(obj, i5, i3)) {
                        i = i2 * 53;
                        A002 = DKC.A00(L5X.A00(obj, A0N));
                        A05 = Double.doubleToLongBits(A002);
                        Charset charset22 = Kyu.A04;
                        hashCode = 1BL.A01(A05);
                        i2 = i + hashCode;
                        break;
                    } else {
                        break;
                    }
                case ActionId.RETRY_AFTER_FAILURE /* 52 */:
                    if (A0W(obj, i5, i3)) {
                        i = i2 * 53;
                        A00 = 7zM.A00(L5X.A00(obj, A0N));
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
                    if (A0W(obj, i5, i3)) {
                        i = i2 * 53;
                        A05 = AnonymousClass001.A05(L5X.A00(obj, A0N));
                        Charset charset222 = Kyu.A04;
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
                    if (A0W(obj, i5, i3)) {
                        i = i2 * 53;
                        hashCode = AnonymousClass001.A03(L5X.A00(obj, A0N));
                        i2 = i + hashCode;
                        break;
                    } else {
                        break;
                    }
                case ActionId.MESSAGE_UPDATE_END /* 58 */:
                    if (A0W(obj, i5, i3)) {
                        i = i2 * 53;
                        A1V = AnonymousClass001.A1V(L5X.A00(obj, A0N));
                        Charset charset32 = Kyu.A04;
                        hashCode = AnonymousClass002.A00(A1V ? 1 : 0);
                        i2 = i + hashCode;
                        break;
                    } else {
                        break;
                    }
                case ActionId.PHOTO_CAPTURED /* 59 */:
                    if (!A0W(obj, i5, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    hashCode = ((String) L5X.A00(obj, A0N)).hashCode();
                    i2 = i + hashCode;
                    break;
                case ActionId.MEDIA_PREVIEW_VISIBLE /* 60 */:
                case ActionId.COUNTER /* 61 */:
                case ActionId.INTERACTION_OPEN_COMPOSER /* 68 */:
                    if (!A0W(obj, i5, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    hashCode = L5X.A00(obj, A0N).hashCode();
                    i2 = i + hashCode;
                    break;
            }
        }
        return 1BK.A03(((KJb) obj).unknownFields, i2 * 53);
    }

    @Override // X.MLr
    public final boolean BTV(Object obj) {
        boolean A0V;
        int i = 1048575;
        int i2 = 0;
        int i3 = 0;
        while (i3 < this.A00) {
            int i4 = this.A05[i3];
            int[] iArr = this.A04;
            int i5 = iArr[i4];
            int i6 = iArr[i4 + 1];
            int i7 = iArr[i4 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 == i) {
                i8 = i;
            } else if (i8 != 1048575) {
                i2 = A0F.getInt(obj, i8);
            }
            if ((268435456 & i6) != 0) {
                if (i8 == 1048575) {
                    if (!A0V(i4, obj)) {
                        return false;
                    }
                } else if ((i2 & i9) == 0) {
                    return false;
                }
            }
            int A06 = JQx.A06(i6);
            if (A06 == 9 || A06 == 17) {
                A0V = i8 == 1048575 ? A0V(i4, obj) : i2 & i9;
            } else {
                if (A06 != 27) {
                    if (A06 == 60 || A06 == 68) {
                        A0V = A0W(obj, i5, i4);
                    } else if (A06 != 49) {
                        if (A06 == 50) {
                            Lyh lyh = (Lyh) L5X.A00(obj, i6 & 1048575);
                            if (!lyh.isEmpty() && ((Kjl) this.A06[(i4 / 3) * 2]).A00.A01.javaType == KO5.MESSAGE) {
                                MLr mLr = null;
                                Iterator A1A = 1BK.A1A(lyh);
                                while (A1A.hasNext()) {
                                    Object next = A1A.next();
                                    if (mLr == null) {
                                        mLr = JR1.A0g(next);
                                    }
                                    if (!mLr.BTV(next)) {
                                        return false;
                                    }
                                }
                            }
                        } else {
                            continue;
                        }
                        i3++;
                        i = i8;
                    }
                }
                List list = (List) L5X.A00(obj, i6 & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    MLr A0L = A0L(i4);
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        if (!A0L.BTV(list.get(i10))) {
                            return false;
                        }
                    }
                }
                i3++;
                i = i8;
            }
            if (A0V && !A0L(i4).BTV(L5X.A00(obj, i6 & 1048575))) {
                return false;
            }
            i3++;
            i = i8;
        }
        return true;
    }

    @Override // X.MLr
    public void BcF(Object obj) {
        int i;
        List unmodifiableList;
        LyC lyC;
        int i2 = this.A00;
        while (true) {
            int i3 = i2;
            i = this.A01;
            if (i3 >= i) {
                break;
            }
            long A0S = JQx.A0S(this.A04, this.A05[i3] + 1);
            Object A00 = L5X.A00(obj, A0S);
            if (A00 != null) {
                ((Lyh) A00).isMutable = false;
                LE5.A06(obj, A0S, A00);
            }
            i2 = i3 + 1;
        }
        int[] iArr = this.A05;
        int length = iArr.length;
        while (i < length) {
            KoP koP = this.A02;
            long j = iArr[i];
            boolean z = koP instanceof KJd;
            Object A002 = L5X.A00(obj, j);
            if (z) {
                lyC = (LyC) ((MRR) A002);
            } else {
                LyC lyC2 = (List) A002;
                if (lyC2 instanceof MRL) {
                    unmodifiableList = ((MRL) lyC2).BI3();
                } else {
                    if (!JR0.A1V(KJe.A00, lyC2)) {
                        if ((lyC2 instanceof MDj) && (lyC2 instanceof MRR)) {
                            lyC = (MRR) lyC2;
                            if (!lyC.A00) {
                            }
                        } else {
                            unmodifiableList = Collections.unmodifiableList((List) lyC2);
                        }
                    }
                    i++;
                }
                LE5.A06(obj, j, unmodifiableList);
                i++;
            }
            lyC.A00 = false;
            i++;
        }
        ((KJb) obj).unknownFields.A02 = false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x003a. Please report as an issue. */
    @Override // X.MLr
    public void Be4(Object obj, Object obj2) {
        int i;
        Object A09;
        obj2.getClass();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            int[] iArr = this.A04;
            if (i3 >= iArr.length) {
                LEh.A0Q(obj, obj2);
                return;
            }
            int i4 = iArr[i3 + 1];
            long A0N = JQx.A0N(i4);
            int i5 = iArr[i3];
            switch (JQx.A06(i4)) {
                case 0:
                    if (!A0V(i3, obj2)) {
                        break;
                    } else {
                        L5X l5x = LE5.A02;
                        l5x.A0C(obj, A0N, l5x.A03(obj2, A0N));
                        A0T(obj, i3);
                        break;
                    }
                case 1:
                    if (!A0V(i3, obj2)) {
                        break;
                    } else {
                        L5X l5x2 = LE5.A02;
                        l5x2.A0D(obj, A0N, l5x2.A04(obj2, A0N));
                        A0T(obj, i3);
                        break;
                    }
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    if (!A0V(i3, obj2)) {
                        break;
                    } else {
                        L5X l5x3 = LE5.A02;
                        l5x3.A0F(obj, A0N, l5x3.A07(obj2, A0N));
                        A0T(obj, i3);
                        break;
                    }
                case 4:
                case 6:
                case 11:
                case 12:
                case 13:
                case 15:
                    if (!A0V(i3, obj2)) {
                        break;
                    } else {
                        LE5.A05(obj, A0N, LE5.A02.A06(obj2, A0N));
                        A0T(obj, i3);
                        break;
                    }
                case 7:
                    if (!A0V(i3, obj2)) {
                        break;
                    } else {
                        L5X l5x4 = LE5.A02;
                        l5x4.A0H(obj, A0N, l5x4.A0L(obj2, A0N));
                        A0T(obj, i3);
                        break;
                    }
                case 8:
                case 10:
                    if (!A0V(i3, obj2)) {
                        break;
                    } else {
                        A09 = L5X.A00(obj2, A0N);
                        LE5.A06(obj, A0N, A09);
                        A0T(obj, i3);
                        break;
                    }
                case 9:
                case 17:
                    if (!A0V(i3, obj2)) {
                        break;
                    } else {
                        L5X l5x5 = LE5.A02;
                        Object A092 = l5x5.A09(obj, A0N);
                        A09 = l5x5.A09(obj2, A0N);
                        if (A092 == null) {
                            if (A09 == null) {
                                break;
                            }
                            LE5.A06(obj, A0N, A09);
                        } else if (A09 == null) {
                            break;
                        } else {
                            A09 = Kyu.A00(A092, A09);
                            LE5.A06(obj, A0N, A09);
                        }
                        A0T(obj, i3);
                        break;
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
                    if (!(this.A02 instanceof KJd)) {
                        List list = (List) L5X.A00(obj2, A0N);
                        List A00 = KJe.A00(obj, list.size(), A0N);
                        int size = A00.size();
                        int size2 = list.size();
                        if (size > 0) {
                            if (size2 > 0) {
                                A00.addAll(list);
                            }
                            list = A00;
                        }
                        LE5.A06(obj, A0N, list);
                        break;
                    } else {
                        L5X l5x6 = LE5.A02;
                        LyC lyC = (MRR) l5x6.A09(obj, A0N);
                        LyC lyC2 = (List) l5x6.A09(obj2, A0N);
                        int size3 = lyC.size();
                        int size4 = lyC2.size();
                        if (size3 > 0) {
                            if (size4 > 0) {
                                if (!lyC.A00) {
                                    lyC = lyC.Bel(size4 + size3);
                                }
                                lyC.addAll(lyC2);
                            }
                            lyC2 = lyC;
                        }
                        LE5.A06(obj, A0N, lyC2);
                        break;
                    }
                case 50:
                    L1E l1e = LEh.A02;
                    L5X l5x7 = LE5.A02;
                    LE5.A06(obj, A0N, L6I.A01(l5x7.A09(obj, A0N), l5x7.A09(obj2, A0N)));
                    break;
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
                    if (!A0W(obj2, i5, i3)) {
                        break;
                    } else {
                        LE5.A06(obj, A0N, L5X.A00(obj2, A0N));
                        i = iArr[i3 + 2] & 1048575;
                        LE5.A05(obj, i, i5);
                        break;
                    }
                case ActionId.MEDIA_PREVIEW_VISIBLE /* 60 */:
                case ActionId.INTERACTION_OPEN_COMPOSER /* 68 */:
                    if (!A0W(obj2, i5, i3)) {
                        break;
                    } else {
                        Object obj3 = null;
                        if (A0W(obj, i5, i3)) {
                            obj3 = L5X.A00(obj, A0N);
                        }
                        Object A002 = L5X.A00(obj2, A0N);
                        if (obj3 == null) {
                            if (A002 == null) {
                                break;
                            }
                            LE5.A06(obj, A0N, A002);
                            i = iArr[i3 + 2] & 1048575;
                        } else if (A002 == null) {
                            break;
                        } else {
                            A002 = Kyu.A00(obj3, A002);
                            LE5.A06(obj, A0N, A002);
                            i = iArr[i3 + 2] & 1048575;
                        }
                        LE5.A05(obj, i, i5);
                        break;
                    }
            }
            i2 = i3 + 3;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r315v6 ??, still in use, count: 2, list:
          (r315v6 ??) from 0x0f7e: PHI (r315v5 ??) = (r315v4 ??), (r315v6 ??) binds: [B:859:0x0f6a, B:862:0x0f79] A[DONT_GENERATE, DONT_INLINE]
          (r315v6 ?? I:X.L57) from 0x0f7b: IPUT (r315v6 ?? I:X.L57), (r0v125 ?? I:X.KJb) A[Catch: all -> 0x1048] X.KJb.unknownFields X.L57
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
    @Override // X.MLr
    public void Be7(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r315v6 ??, still in use, count: 2, list:
          (r315v6 ??) from 0x0f7e: PHI (r315v5 ??) = (r315v4 ??), (r315v6 ??) binds: [B:859:0x0f6a, B:862:0x0f79] A[DONT_GENERATE, DONT_INLINE]
          (r315v6 ?? I:X.L57) from 0x0f7b: IPUT (r315v6 ?? I:X.L57), (r0v125 ?? I:X.KJb) A[Catch: all -> 0x1048] X.KJb.unknownFields X.L57
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x019e. Please report as an issue. */
    @Override // X.MLr
    public void Be8(L0L l0l, Object obj, byte[] bArr, int i, int i2) {
        long j;
        int i3;
        Object A00;
        int i4 = i;
        if (!this.A0E) {
            A0X(l0l, obj, bArr, i, i2, 0);
            return;
        }
        Unsafe unsafe = A0F;
        int i5 = -1;
        float f = 0.0f / 0.0f;
        int i6 = 0;
        int i7 = 0;
        int i8 = 1048575;
        while (i4 < i2) {
            int i9 = i4 + 1;
            int i10 = bArr[i4];
            if (i10 < 0) {
                i9 = A0D(l0l, bArr, i10, i9);
                i10 = l0l.A00;
            }
            int i11 = i10 >>> 3;
            int i12 = i10 & 7;
            i6 = i11 > i5 ? A01(i11, i6 / 3) : A00(i11);
            if (i6 == -1) {
                i6 = 0;
            } else {
                int[] iArr = this.A04;
                int i13 = iArr[i6 + 1];
                int A06 = JQx.A06(i13);
                long j2 = i13 & 1048575;
                if (A06 <= 17) {
                    int i14 = iArr[i6 + 2];
                    boolean z = true;
                    int i15 = 1 << (i14 >>> 20);
                    int i16 = i14 & 1048575;
                    if (i16 != i8) {
                        if (i8 != 1048575) {
                            unsafe.putInt(obj, i8, i7);
                        }
                        if (i16 != 1048575) {
                            i7 = unsafe.getInt(obj, i16);
                        }
                        i8 = i16;
                    }
                    switch (A06) {
                        case 0:
                            if (i12 == 1) {
                                LE5.A02.A0C(obj, j2, Double.longBitsToDouble(JR2.A0F(bArr, i9)));
                                i4 = i9 + 8;
                                i7 |= i15;
                                i5 = i11;
                            }
                            break;
                        case 1:
                            if (i12 == 5) {
                                LE5.A02.A0D(obj, j2, Float.intBitsToFloat(JR2.A08(bArr, i9)));
                                i4 = i9 + 4;
                                i7 |= i15;
                                i5 = i11;
                            }
                            break;
                        case 2:
                        case 3:
                            if (i12 == 0) {
                                i4 = A0C(l0l, bArr, i9);
                                j = l0l.A01;
                                unsafe.putLong(obj, j2, j);
                                i7 |= i15;
                                i5 = i11;
                            }
                            break;
                        case 4:
                        case 11:
                        case 12:
                            if (i12 == 0) {
                                i4 = A0B(l0l, bArr, i9);
                                i3 = l0l.A00;
                                unsafe.putInt(obj, j2, i3);
                                i7 |= i15;
                                i5 = i11;
                            }
                            break;
                        case 5:
                        case 14:
                            if (i12 == 1) {
                                unsafe.putLong(obj, j2, JR2.A0F(bArr, i9));
                                i4 = i9 + 8;
                                i7 |= i15;
                                i5 = i11;
                            }
                            break;
                        case 6:
                        case 13:
                            if (i12 == 5) {
                                unsafe.putInt(obj, j2, JR2.A08(bArr, i9));
                                i4 = i9 + 4;
                                i7 |= i15;
                                i5 = i11;
                            }
                            break;
                        case 7:
                            if (i12 == 0) {
                                i4 = A0C(l0l, bArr, i9);
                                if (l0l.A01 == 0) {
                                    z = false;
                                }
                                LE5.A02.A0H(obj, j2, z);
                                i7 |= i15;
                                i5 = i11;
                            }
                            break;
                        case 8:
                            if (i12 == 2) {
                                if ((i13 & 536870912) == 0) {
                                    i4 = A0B(l0l, bArr, i9);
                                    int i17 = l0l.A00;
                                    if (i17 < 0) {
                                        throw KLt.A02("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                    }
                                    if (i17 == 0) {
                                        l0l.A02 = "";
                                    } else {
                                        l0l.A02 = JQx.A0y(Kyu.A04, bArr, i4, i17);
                                        i4 += i17;
                                    }
                                } else {
                                    i4 = A0A(l0l, bArr, i9);
                                }
                                A00 = l0l.A02;
                                unsafe.putObject(obj, j2, A00);
                                i7 |= i15;
                                i5 = i11;
                            }
                            break;
                        case 9:
                            if (i12 == 2) {
                                i4 = A02(l0l, A0L(i6), bArr, i9, i2);
                                Object object = unsafe.getObject(obj, j2);
                                if (object != null) {
                                    A00 = Kyu.A00(object, l0l.A02);
                                    unsafe.putObject(obj, j2, A00);
                                    i7 |= i15;
                                    i5 = i11;
                                }
                                A00 = l0l.A02;
                                unsafe.putObject(obj, j2, A00);
                                i7 |= i15;
                                i5 = i11;
                            }
                            break;
                        case 10:
                            if (i12 == 2) {
                                i4 = A09(l0l, bArr, i9);
                                A00 = l0l.A02;
                                unsafe.putObject(obj, j2, A00);
                                i7 |= i15;
                                i5 = i11;
                            }
                            break;
                        case 15:
                            if (i12 == 0) {
                                i4 = A0B(l0l, bArr, i9);
                                i3 = JQx.A07(l0l.A00);
                                unsafe.putInt(obj, j2, i3);
                                i7 |= i15;
                                i5 = i11;
                            }
                            break;
                        case 16:
                            if (i12 == 0) {
                                i4 = A0C(l0l, bArr, i9);
                                long j3 = l0l.A01;
                                j = (-(j3 & 1)) ^ (j3 >>> 1);
                                unsafe.putLong(obj, j2, j);
                                i7 |= i15;
                                i5 = i11;
                            }
                            break;
                    }
                } else if (A06 != 27) {
                    if (A06 <= 49) {
                        i4 = A07(l0l, obj, bArr, i9, i2, i10, i12, i6, A06, i13, j2);
                    } else if (A06 != 50) {
                        i4 = A06(l0l, obj, bArr, i9, i2, i10, i11, i12, i13, A06, i6, j2);
                    } else if (i12 == 2) {
                        i4 = A08(l0l, obj, bArr, i9, i2, i6, j2);
                    }
                    if (i4 == i9) {
                        i9 = i4;
                    } else {
                        i5 = i11;
                    }
                } else if (i12 == 2) {
                    MRR mrr = (MRR) unsafe.getObject(obj, j2);
                    if (!((LyC) mrr).A00) {
                        mrr = mrr.Bel(JQy.A0J(mrr));
                        unsafe.putObject(obj, j2, mrr);
                    }
                    MLr A0L = A0L(i6);
                    do {
                        i4 = A02(l0l, A0L, bArr, i9, i2);
                        mrr.add(l0l.A02);
                        if (i4 < i2) {
                            i9 = A0B(l0l, bArr, i4);
                        }
                        i5 = i11;
                    } while (i10 == l0l.A00);
                    i5 = i11;
                }
            }
            KJb kJb = (KJb) obj;
            L57 l57 = kJb.unknownFields;
            if (l57 == L57.A05) {
                l57 = new L57();
                kJb.unknownFields = l57;
            }
            i4 = A04(l0l, l57, bArr, i10, i9, i2);
            i5 = i11;
        }
        if (i8 != 1048575) {
            unsafe.putInt(obj, i8, i7);
        }
        if (i4 != i2) {
            throw KLt.A02("Failed to parse the message.");
        }
    }

    @Override // X.MLr
    public Object BfF() {
        return this.A03.dynamicMethod(KMJ.A06, (Object) null, (Object) null);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:280:0x0d28. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x004b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0a25  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x016c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0a88  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x016c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0ac6  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x016c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0c6e  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x016c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:357:0x164e  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0e4c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:367:0x16b3  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0e4c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:373:0x16f3  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0e4c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:409:0x185d  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0e4c A[SYNTHETIC] */
    @Override // X.MLr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void DBL(X.Kg7 r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 6292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Lgh.DBL(X.Kg7, java.lang.Object):void");
    }
}
