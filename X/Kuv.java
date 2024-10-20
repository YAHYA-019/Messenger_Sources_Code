package X;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: Kuv.class */
public abstract class Kuv {
    public int A00;
    public LDr A01;

    public static KED A0C(byte[] bArr, int i, int i2) {
        KED ked = new KED(bArr, i, i2);
        try {
            ked.A0N(i2);
            return ked;
        } catch (KLt e) {
            throw new IllegalArgumentException((Throwable) e);
        }
    }

    public double A0D() {
        return Double.longBitsToDouble(this instanceof KEI ? KEI.A03((KEI) this) : this instanceof KEE ? KEE.A03((KEE) this) : KED.A03((KED) this));
    }

    public float A0E() {
        return Float.intBitsToFloat(this instanceof KEI ? KEI.A00((KEI) this) : this instanceof KEE ? KEE.A00((KEE) this) : KED.A00((KED) this));
    }

    public int A0F() {
        if (this instanceof KEI) {
            KEI kei = (KEI) this;
            return (int) (kei.A03 - kei.A04);
        }
        if (this instanceof KEE) {
            KEE kee = (KEE) this;
            return kee.A04 + kee.A03;
        }
        KED ked = (KED) this;
        return ked.A03 - ked.A04;
    }

    public int A0G() {
        return this instanceof KEI ? KEI.A01((KEI) this) : this instanceof KEE ? KEE.A01((KEE) this) : KED.A01((KED) this);
    }

    public int A0H() {
        return this instanceof KEI ? KEI.A00((KEI) this) : this instanceof KEE ? KEE.A00((KEE) this) : KED.A00((KED) this);
    }

    public int A0I() {
        return this instanceof KEI ? KEI.A01((KEI) this) : this instanceof KEE ? KEE.A01((KEE) this) : KED.A01((KED) this);
    }

    public int A0J() {
        return this instanceof KEI ? KEI.A00((KEI) this) : this instanceof KEE ? KEE.A00((KEE) this) : KED.A00((KED) this);
    }

    public int A0K() {
        return this instanceof KEI ? JQx.A07(KEI.A01((KEI) this)) : this instanceof KEE ? JQx.A07(KEE.A01((KEE) this)) : JQx.A07(KED.A01((KED) this));
    }

    public int A0L() {
        int A01;
        if (this instanceof KEI) {
            KEI kei = (KEI) this;
            if (kei.A0Y()) {
                A01 = 0;
                kei.A01 = 0;
            } else {
                A01 = KEI.A01(kei);
                kei.A01 = A01;
                if ((A01 >>> 3) == 0) {
                    throw KLt.A02("Protocol message contained an invalid tag (zero).");
                }
            }
        } else if (this instanceof KEE) {
            KEE kee = (KEE) this;
            if (kee.A0Y()) {
                kee.A02 = 0;
                return 0;
            }
            A01 = KEE.A01(kee);
            kee.A02 = A01;
            if ((A01 >>> 3) == 0) {
                throw KLt.A02("Protocol message contained an invalid tag (zero).");
            }
        } else {
            KED ked = (KED) this;
            if (ked.A0Y()) {
                ked.A01 = 0;
                return 0;
            }
            A01 = KED.A01(ked);
            ked.A01 = A01;
            if ((A01 >>> 3) == 0) {
                throw KLt.A02("Protocol message contained an invalid tag (zero).");
            }
        }
        return A01;
    }

    public int A0M() {
        return this instanceof KEI ? KEI.A01((KEI) this) : this instanceof KEE ? KEE.A01((KEE) this) : KED.A01((KED) this);
    }

    public int A0N(int i) {
        if (this instanceof KEI) {
            KEI kei = (KEI) this;
            if (i < 0) {
                throw KLt.A02("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            int i2 = i + ((int) (kei.A03 - kei.A04));
            int i3 = kei.A00;
            if (i2 > i3) {
                throw KLt.A02("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            kei.A00 = i2;
            KEI.A05(kei);
            return i3;
        }
        if (this instanceof KEE) {
            KEE kee = (KEE) this;
            if (i < 0) {
                throw KLt.A02("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            int i4 = i + kee.A04 + kee.A03;
            int i5 = kee.A01;
            if (i4 > i5) {
                throw KLt.A02("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            kee.A01 = i4;
            KEE.A06(kee);
            return i5;
        }
        KED ked = (KED) this;
        if (i < 0) {
            throw KLt.A02("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i6 = i + (ked.A03 - ked.A04);
        if (i6 < 0) {
            throw KLt.A02("Failed to parse the message.");
        }
        int i7 = ked.A00;
        if (i6 > i7) {
            throw KLt.A02("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        ked.A00 = i6;
        KED.A05(ked);
        return i7;
    }

    public long A0O() {
        return this instanceof KEI ? KEI.A03((KEI) this) : this instanceof KEE ? KEE.A03((KEE) this) : KED.A03((KED) this);
    }

    public long A0P() {
        return this instanceof KEI ? KEI.A04((KEI) this) : this instanceof KEE ? KEE.A04((KEE) this) : KED.A04((KED) this);
    }

    public long A0Q() {
        return this instanceof KEI ? KEI.A03((KEI) this) : this instanceof KEE ? KEE.A03((KEE) this) : KED.A03((KED) this);
    }

    public long A0R() {
        return this instanceof KEI ? JQy.A0M(KEI.A04((KEI) this)) : this instanceof KEE ? JQy.A0M(KEE.A04((KEE) this)) : JQy.A0M(KED.A04((KED) this));
    }

    public long A0S() {
        return this instanceof KEI ? KEI.A04((KEI) this) : this instanceof KEE ? KEE.A04((KEE) this) : KED.A04((KED) this);
    }

    public Lj5 A0T() {
        byte[] bArr;
        if (this instanceof KEI) {
            KEI kei = (KEI) this;
            int A01 = KEI.A01(kei);
            if (A01 <= 0) {
                if (A01 != 0) {
                    throw KLt.A02("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                }
                return Lj5.A00;
            }
            long j = kei.A02;
            long j2 = kei.A03;
            if (A01 > ((int) (j - j2))) {
                throw KLt.A02("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            bArr = new byte[A01];
            long j3 = A01;
            LE5.A02.A0I(bArr, j2, 0L, j3);
            kei.A03 += j3;
            return new KEB(bArr);
        }
        if (this instanceof KEE) {
            KEE kee = (KEE) this;
            int A012 = KEE.A01(kee);
            int i = kee.A00;
            int i2 = kee.A03;
            if (A012 <= i - i2 && A012 > 0) {
                KEB A013 = Lj5.A01(kee.A07, i2, A012);
                kee.A03 += A012;
                return A013;
            }
            if (A012 != 0) {
                byte[] A0B = KEE.A0B(kee, A012);
                if (A0B != null) {
                    return Lj5.A01(A0B, 0, A0B.length);
                }
                int i3 = kee.A03;
                int i4 = kee.A00;
                int i5 = i4 - i3;
                kee.A04 += i4;
                kee.A03 = 0;
                kee.A00 = 0;
                ArrayList A05 = KEE.A05(kee, A012 - i5);
                bArr = new byte[A012];
                System.arraycopy(kee.A07, i3, bArr, 0, i5);
                Iterator it = A05.iterator();
                while (it.hasNext()) {
                    byte[] bArr2 = (byte[]) it.next();
                    int length = bArr2.length;
                    System.arraycopy(bArr2, 0, bArr, i5, length);
                    i5 += length;
                }
                return new KEB(bArr);
            }
        } else {
            KED ked = (KED) this;
            int A014 = KED.A01(ked);
            if (A014 > 0) {
                int i6 = ked.A02;
                int i7 = ked.A03;
                if (A014 > i6 - i7) {
                    throw KLt.A02("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                KEB A015 = Lj5.A01(ked.A06, i7, A014);
                ked.A03 += A014;
                return A015;
            }
            if (A014 != 0) {
                throw KLt.A02("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
        }
        return Lj5.A00;
    }

    public String A0U() {
        String A0y;
        if (this instanceof KEI) {
            KEI kei = (KEI) this;
            int A01 = KEI.A01(kei);
            if (A01 <= 0) {
                if (A01 != 0) {
                    throw KLt.A02("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                }
                return "";
            }
            long j = kei.A02;
            long j2 = kei.A03;
            if (A01 > ((int) (j - j2))) {
                throw KLt.A02("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            byte[] bArr = new byte[A01];
            long j3 = A01;
            LE5.A02.A0I(bArr, j2, 0L, j3);
            String str = new String(bArr, Kyu.A04);
            kei.A03 += j3;
            return str;
        }
        if (!(this instanceof KEE)) {
            KED ked = (KED) this;
            int A012 = KED.A01(ked);
            if (A012 <= 0) {
                if (A012 != 0) {
                    throw KLt.A02("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                }
                return "";
            }
            int i = ked.A02;
            int i2 = ked.A03;
            if (A012 > i - i2) {
                throw KLt.A02("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            String A0y2 = JQx.A0y(Kyu.A04, ked.A06, i2, A012);
            ked.A03 += A012;
            return A0y2;
        }
        KEE kee = (KEE) this;
        int A013 = KEE.A01(kee);
        if (A013 > 0) {
            int i3 = kee.A00;
            int i4 = kee.A03;
            if (A013 <= i3 - i4) {
                A0y = JQx.A0y(Kyu.A04, kee.A07, i4, A013);
                kee.A03 += A013;
                return A0y;
            }
        } else if (A013 == 0) {
            return "";
        }
        if (A013 > kee.A00) {
            return new String(KEE.A0A(kee, A013), Kyu.A04);
        }
        KEE.A07(kee, A013);
        A0y = JQx.A0y(Kyu.A04, kee.A07, kee.A03, A013);
        kee.A03 += A013;
        return A0y;
    }

    public String A0V() {
        byte[] A0A;
        String A01;
        int i;
        byte A012;
        byte A013;
        if (!(this instanceof KEI)) {
            if (!(this instanceof KEE)) {
                KED ked = (KED) this;
                int A014 = KED.A01(ked);
                if (A014 <= 0) {
                    if (A014 != 0) {
                        throw KLt.A02("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                    }
                    return "";
                }
                int i2 = ked.A02;
                int i3 = ked.A03;
                if (A014 > i2 - i3) {
                    throw KLt.A02("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                String A04 = Kxt.A00.A04(ked.A06, i3, A014);
                ked.A03 += A014;
                return A04;
            }
            KEE kee = (KEE) this;
            int A015 = KEE.A01(kee);
            int i4 = kee.A03;
            int i5 = kee.A00;
            if (A015 <= i5 - i4 && A015 > 0) {
                A0A = kee.A07;
                kee.A03 = i4 + A015;
            } else {
                if (A015 == 0) {
                    return "";
                }
                if (A015 <= i5) {
                    KEE.A07(kee, A015);
                    A0A = kee.A07;
                    kee.A03 = A015;
                } else {
                    A0A = KEE.A0A(kee, A015);
                }
                i4 = 0;
            }
            return Kxt.A00.A04(A0A, i4, A015);
        }
        KEI kei = (KEI) this;
        int A016 = KEI.A01(kei);
        if (A016 <= 0) {
            if (A016 != 0) {
                throw KLt.A02("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            return "";
        }
        long j = kei.A02;
        long j2 = kei.A03;
        if (A016 > ((int) (j - j2))) {
            throw KLt.A02("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i6 = (int) (j2 - kei.A06);
        ByteBuffer byteBuffer = kei.A07;
        KsA ksA = Kxt.A00;
        if (byteBuffer.hasArray()) {
            A01 = ksA.A04(byteBuffer.array(), byteBuffer.arrayOffset() + i6, A016);
        } else {
            if (byteBuffer.isDirect() && (ksA instanceof KJk)) {
                if ((i6 | A016 | ((byteBuffer.limit() - i6) - A016)) < 0) {
                    throw JQx.A0l("buffer limit=%d, index=%d, limit=%d", JQy.A1a(byteBuffer.limit(), i6, A016));
                }
                L5X l5x = LE5.A02;
                long A07 = l5x.A07(byteBuffer, LE5.A00) + i6;
                long j3 = A016 + A07;
                char[] cArr = new char[A016];
                int i7 = 0;
                while (true) {
                    i = i7;
                    if (A07 >= j3 || (A013 = l5x.A01(A07)) < 0) {
                        break;
                    }
                    A07++;
                    cArr[i] = (char) A013;
                    i7 = i + 1;
                }
                loop1: while (true) {
                    int i8 = i;
                    while (A07 < j3) {
                        long j4 = A07 + 1;
                        byte A017 = l5x.A01(A07);
                        if (A017 < 0) {
                            if (A017 >= -32) {
                                if (A017 >= -16) {
                                    if (j4 >= j3 - 2) {
                                        break;
                                    }
                                    long j5 = j4 + 1;
                                    byte A018 = l5x.A01(j4);
                                    long j6 = j5 + 1;
                                    A07 = j6 + 1;
                                    L6J.A00(cArr, A017, A018, l5x.A01(j5), l5x.A01(j6), i);
                                    i = i + 1 + 1;
                                } else {
                                    if (j4 >= j3 - 1) {
                                        break;
                                    }
                                    long j7 = j4 + 1;
                                    A07 = j7 + 1;
                                    i++;
                                    L6J.A01(cArr, A017, l5x.A01(j4), l5x.A01(j7), i8);
                                }
                            } else {
                                if (j4 >= j3) {
                                    break;
                                }
                                A07 = j4 + 1;
                                i++;
                                L6J.A02(cArr, A017, l5x.A01(j4), i8);
                            }
                        } else {
                            i++;
                            cArr[i8] = (char) A017;
                            while (j4 < j3 && (A012 = l5x.A01(j4)) >= 0) {
                                j4++;
                                cArr[i] = (char) A012;
                                i++;
                            }
                            i8 = i;
                            A07 = j4;
                        }
                    }
                    A01 = new String(cArr, 0, i);
                    break loop1;
                }
                throw KLt.A02("Protocol message had invalid UTF-8.");
            }
            A01 = KsA.A01(byteBuffer, i6, A016);
        }
        kei.A03 += A016;
        return A01;
    }

    public void A0W(int i) {
        if (this instanceof KEI) {
            if (((KEI) this).A01 != i) {
                throw KLt.A02("Protocol message end-group tag did not match expected tag.");
            }
        } else if (this instanceof KEE) {
            if (((KEE) this).A02 != i) {
                throw KLt.A02("Protocol message end-group tag did not match expected tag.");
            }
        } else if (((KED) this).A01 != i) {
            throw KLt.A02("Protocol message end-group tag did not match expected tag.");
        }
    }

    public void A0X(int i) {
        if (this instanceof KEI) {
            KEI kei = (KEI) this;
            kei.A00 = i;
            KEI.A05(kei);
        } else if (this instanceof KEE) {
            KEE kee = (KEE) this;
            kee.A01 = i;
            KEE.A06(kee);
        } else {
            KED ked = (KED) this;
            ked.A00 = i;
            KED.A05(ked);
        }
    }

    public boolean A0Y() {
        if (this instanceof KEI) {
            KEI kei = (KEI) this;
            return AnonymousClass001.A1O((kei.A03 > kei.A02 ? 1 : (kei.A03 == kei.A02 ? 0 : -1)));
        }
        if (this instanceof KEE) {
            KEE kee = (KEE) this;
            return kee.A03 == kee.A00 && !KEE.A09(kee, 1);
        }
        KED ked = (KED) this;
        return AnonymousClass001.A1Q(ked.A03, ked.A02);
    }

    public boolean A0Z() {
        return this instanceof KEI ? AnonymousClass001.A1N((KEI.A04((KEI) this) > 0L ? 1 : (KEI.A04((KEI) this) == 0L ? 0 : -1))) : this instanceof KEE ? AnonymousClass001.A1N((KEE.A04((KEE) this) > 0L ? 1 : (KEE.A04((KEE) this) == 0L ? 0 : -1))) : AnonymousClass001.A1N((KED.A04((KED) this) > 0L ? 1 : (KED.A04((KED) this) == 0L ? 0 : -1)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01db, code lost:
    
        if (r305 != ((X.KEE) r304).A00) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01de, code lost:
    
        X.KEE.A07(r304, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01e4, code lost:
    
        r0 = ((X.KEE) r304).A07;
        r0 = ((X.KEE) r304).A03;
        r305 = r0 + 1;
        ((X.KEE) r304).A03 = r305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0200, code lost:
    
        if (r0[r0] >= 0) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0203, code lost:
    
        r318 = r318 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x020d, code lost:
    
        if (r318 < 10) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0216, code lost:
    
        throw X.KLt.A02("CodedInputStream encountered a malformed varint.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0254, code lost:
    
        if (r0 == 5) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02ba, code lost:
    
        if ((r0 - r305) >= 10) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02bd, code lost:
    
        r0 = r0.A06;
        r0 = r307;
        r307 = r307 + 1;
        r0.A03 = r307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (r0 == 5) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02da, code lost:
    
        if (r0[r0] >= 0) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02dd, code lost:
    
        r318 = r318 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02e7, code lost:
    
        if (r318 < 10) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02f0, code lost:
    
        throw X.KLt.A02("CodedInputStream encountered a malformed varint.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02f1, code lost:
    
        r0 = r305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02f9, code lost:
    
        if (r305 == r0) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02fc, code lost:
    
        r0 = r0.A06;
        r305 = r305 + 1;
        r0.A03 = r305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0317, code lost:
    
        if (r0[r0] >= 0) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x031a, code lost:
    
        r318 = r318 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0324, code lost:
    
        if (r318 < 10) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x032d, code lost:
    
        throw X.KLt.A02("CodedInputStream encountered a malformed varint.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0386, code lost:
    
        throw X.KLt.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b2, code lost:
    
        if (((int) (r304.A02 - r304.A03)) >= 10) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b5, code lost:
    
        r0 = r304.A03;
        r304.A03 = 1 + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d5, code lost:
    
        if (X.LE5.A02.A01(r0) >= 0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d8, code lost:
    
        r315 = r315 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e2, code lost:
    
        if (r315 < 10) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00eb, code lost:
    
        throw X.KLt.A02("CodedInputStream encountered a malformed varint.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ec, code lost:
    
        r0 = r304.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0101, code lost:
    
        if (r0 == r304.A02) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0104, code lost:
    
        r304.A03 = 1 + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x011e, code lost:
    
        if (X.LE5.A02.A01(r0) >= 0) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0121, code lost:
    
        r315 = r315 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012b, code lost:
    
        if (r315 < 10) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0134, code lost:
    
        throw X.KLt.A02("CodedInputStream encountered a malformed varint.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x019e, code lost:
    
        if ((r0 - r305) >= 10) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a1, code lost:
    
        r0 = ((X.KEE) r304).A07;
        r0 = r307;
        r307 = r307 + 1;
        ((X.KEE) r304).A03 = r307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01bc, code lost:
    
        if (r0[r0] >= 0) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01bf, code lost:
    
        r318 = r318 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01c9, code lost:
    
        if (r318 < 10) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01d2, code lost:
    
        throw X.KLt.A02("CodedInputStream encountered a malformed varint.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0a(int r302) {
        /*
            Method dump skipped, instructions count: 949
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Kuv.A0a(int):boolean");
    }
}
