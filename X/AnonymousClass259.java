package X;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringReader;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

/* renamed from: X.259, reason: invalid class name */
/* loaded from: 259.class */
public class AnonymousClass259 extends 25A implements Serializable {
    public static final 25L A02;
    public static final int A03;
    public static final int A04;
    public static final int A05;
    public static final long serialVersionUID = 2;
    public final transient 25T A00;
    public final transient 25O A01;
    public C4Nq _characterEscapes;
    public int _factoryFeatures;
    public int _generatorFeatures;
    public 3eN _inputDecorator;
    public int _maximumNonEscapedChar;
    public AnonymousClass245 _objectCodec;
    public 3eM _outputDecorator;
    public int _parserFeatures;
    public final char _quoteChar;
    public 25L _rootValueSeparator;

    static {
        int i = 0;
        for (25B r0 : 25B.values()) {
            if (r0._defaultState) {
                i |= 1 << r0.ordinal();
            }
        }
        A03 = i;
        int i2 = 0;
        for (25D r02 : 25D.values()) {
            if (r02._defaultState) {
                i2 |= r02._mask;
            }
        }
        A05 = i2;
        int i3 = 0;
        for (25E r03 : 25E.values()) {
            if (r03._defaultState) {
                i3 |= r03._mask;
            }
        }
        A04 = i3;
        A02 = 25H.A01;
    }

    public AnonymousClass259() {
        this(null);
    }

    public AnonymousClass259(AnonymousClass245 anonymousClass245) {
        long currentTimeMillis = System.currentTimeMillis();
        this.A01 = new 25O((((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1);
        long currentTimeMillis2 = System.currentTimeMillis();
        this.A00 = new 25T((((int) currentTimeMillis2) + ((int) (currentTimeMillis2 >>> 32))) | 1);
        this._factoryFeatures = A03;
        this._parserFeatures = A05;
        this._generatorFeatures = A04;
        this._rootValueSeparator = A02;
        this._objectCodec = anonymousClass245;
        this._quoteChar = '\"';
    }

    public AnonymousClass259(AnonymousClass259 anonymousClass259, AnonymousClass245 anonymousClass245) {
        long currentTimeMillis = System.currentTimeMillis();
        this.A01 = new 25O((((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1);
        long currentTimeMillis2 = System.currentTimeMillis();
        this.A00 = new 25T((((int) currentTimeMillis2) + ((int) (currentTimeMillis2 >>> 32))) | 1);
        this._factoryFeatures = A03;
        this._parserFeatures = A05;
        this._generatorFeatures = A04;
        this._rootValueSeparator = A02;
        this._objectCodec = anonymousClass245;
        this._factoryFeatures = anonymousClass259._factoryFeatures;
        this._parserFeatures = anonymousClass259._parserFeatures;
        this._generatorFeatures = anonymousClass259._generatorFeatures;
        this._inputDecorator = null;
        this._outputDecorator = null;
        this._characterEscapes = null;
        this._rootValueSeparator = anonymousClass259._rootValueSeparator;
        this._maximumNonEscapedChar = anonymousClass259._maximumNonEscapedChar;
        this._quoteChar = anonymousClass259._quoteChar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x02cc, code lost:
    
        if ((r0 & (-65281)) == 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x025b, code lost:
    
        if ((r306 & 255) == 0) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.C42V A00(X.AnonymousClass259 r301, X.3sO r302, java.io.InputStream r303) {
        /*
            Method dump skipped, instructions count: 856
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass259.A00(X.259, X.3sO, java.io.InputStream):X.42V");
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.3sQ, X.4Qg] */
    public static C4Qg A01(AnonymousClass259 anonymousClass259, final 3sO r302, final OutputStream outputStream) {
        final int i = anonymousClass259._generatorFeatures;
        final AnonymousClass245 anonymousClass245 = anonymousClass259._objectCodec;
        final char c = anonymousClass259._quoteChar;
        ?? r0 = new 3sQ(anonymousClass245, r302, outputStream, c, i) { // from class: X.4Qg
            public byte A00;
            public int A01;
            public byte[] A02;
            public char[] A03;
            public final int A04;
            public final int A05;
            public final int A06;
            public final OutputStream A07;
            public static final byte[] A09 = 25N.A00();
            public static final byte[] A0A = {110, 117, 108, 108};
            public static final byte[] A0B = {116, 114, 117, 101};
            public static final byte[] A08 = {102, 97, 108, 115, 101};

            {
                this.A07 = outputStream;
                this.A00 = (byte) c;
                if (c != '\"') {
                    char[] cArr = 25N.A00;
                    int[][] iArr = C4Ul.A01.A00;
                    int[] iArr2 = iArr[c];
                    if (iArr2 == null) {
                        iArr2 = Arrays.copyOf(25N.A07, 128);
                        if (iArr2[c] == 0) {
                            iArr2[c] = -1;
                        }
                        iArr[c] = iArr2;
                    }
                    ((3sQ) this).A03 = iArr2;
                }
                3sO.A00(r302.A03);
                3sK r02 = r302.A08;
                byte[] A00 = 3sK.A00(r02, 1);
                r302.A03 = A00;
                this.A02 = A00;
                int length = A00.length;
                this.A05 = length;
                this.A06 = length >> 3;
                3sO.A00(r302.A04);
                char[] A01 = r02.A01(1, 0);
                r302.A04 = A01;
                this.A03 = A01;
                this.A04 = A01.length;
                if (A0V(25E.A03)) {
                    ((3sQ) this).A00 = 127;
                }
            }

            private int A00(int i2, int i3) {
                int i4;
                byte[] bArr = this.A02;
                int i5 = i3 + 1;
                bArr[i3] = 92;
                int i6 = i5 + 1;
                bArr[i5] = 117;
                if (i2 > 255) {
                    int i7 = 255 & (i2 >> 8);
                    int i8 = i6 + 1;
                    byte[] bArr2 = A09;
                    bArr[i6] = bArr2[i7 >> 4];
                    i4 = i8 + 1;
                    bArr[i8] = bArr2[i7 & 15];
                    i2 &= 255;
                } else {
                    int i9 = i6 + 1;
                    bArr[i6] = 48;
                    i4 = i9 + 1;
                    bArr[i9] = 48;
                }
                int i10 = i4 + 1;
                byte[] bArr3 = A09;
                bArr[i4] = bArr3[i2 >> 4];
                int i11 = i10 + 1;
                bArr[i10] = bArr3[i2 & 15];
                return i11;
            }

            private final int A01(int i2, int i3) {
                byte[] bArr = this.A02;
                if (i2 < 55296 || i2 > 57343) {
                    int i4 = i3 + 1;
                    bArr[i3] = (byte) ((i2 >> 12) | 224);
                    int i5 = i4 + 1;
                    A08(i2 >> 6, bArr, i4);
                    int i6 = i5 + 1;
                    A08(i2, bArr, i5);
                    return i6;
                }
                int i7 = i3 + 1;
                bArr[i3] = 92;
                int i8 = i7 + 1;
                bArr[i7] = 117;
                int i9 = i8 + 1;
                byte[] bArr2 = A09;
                bArr[i8] = bArr2[(i2 >> 12) & 15];
                int i10 = i9 + 1;
                bArr[i9] = bArr2[(i2 >> 8) & 15];
                int i11 = i10 + 1;
                bArr[i10] = bArr2[(i2 >> 4) & 15];
                int i12 = i11 + 1;
                bArr[i11] = bArr2[i2 & 15];
                return i12;
            }

            public static int A02(C4Qg c4Qg) {
                int i2 = c4Qg.A01;
                c4Qg.A01 = i2 + 1;
                return i2;
            }

            public static int A03(C4Qg c4Qg, byte[] bArr, int i2) {
                int i3 = c4Qg.A01;
                int i4 = i3 + 1;
                bArr[i3] = (byte) ((i2 >> 6) | 192);
                c4Qg.A01 = i4 + 1;
                return i4;
            }

            public static final int A04(InputStream inputStream, byte[] bArr, int i2, int i3, int i4) {
                int read;
                int i5 = 0;
                while (i2 < i3) {
                    bArr[i5] = bArr[i2];
                    i5++;
                    i2++;
                }
                int min = Math.min(i4, bArr.length);
                do {
                    int i6 = min - i5;
                    if (i6 == 0 || (read = inputStream.read(bArr, i5, i6)) < 0) {
                        break;
                    }
                    i5 += read;
                } while (i5 < 3);
                return i5;
            }

            private final int A05(char[] cArr, int i2, int i3, int i4) {
                Object[] A1a;
                String str;
                if (i2 < 55296 || i2 > 57343) {
                    byte[] bArr = this.A02;
                    int i5 = this.A01;
                    int i6 = i5 + 1;
                    bArr[i5] = (byte) ((i2 >> 12) | 224);
                    int i7 = i6 + 1;
                    A08(i2 >> 6, bArr, i6);
                    this.A01 = i7 + 1;
                    A08(i2, bArr, i7);
                    return i3;
                }
                if (i3 >= i4 || cArr == null) {
                    A1a = AnonymousClass001.A1a(i2);
                    str = "Split surrogate on writeRaw() input (last character): first character 0x%4x";
                } else {
                    char c2 = cArr[i3];
                    if (c2 >= 56320 && c2 <= 57343) {
                        int i8 = ((i2 - 55296) << 10) + 65536 + (c2 - 56320);
                        if (this.A01 + 4 > this.A05) {
                            A0A(this);
                        }
                        byte[] bArr2 = this.A02;
                        int i9 = this.A01;
                        int i10 = i9 + 1;
                        bArr2[i9] = (byte) ((i8 >> 18) | 240);
                        int i11 = i10 + 1;
                        A08(i8 >> 12, bArr2, i10);
                        int i12 = i11 + 1;
                        A08(i8 >> 6, bArr2, i11);
                        this.A01 = i12 + 1;
                        A08(i8, bArr2, i12);
                        return i3 + 1;
                    }
                    A1a = AnonymousClass001.A1b(Integer.valueOf(i2), c2);
                    str = "Incomplete surrogate pair: first char 0x%04X, second 0x%04X";
                }
                throw new Jxa(this, String.format(str, A1a));
            }

            private final void A06() {
                if (this.A01 + 4 >= this.A05) {
                    A0A(this);
                }
                System.arraycopy(A0A, 0, this.A02, this.A01, 4);
                this.A01 += 4;
            }

            public static void A08(int i2, byte[] bArr, int i3) {
                bArr[i3] = (byte) ((i2 & 63) | 128);
            }

            public static void A09(C4Qg c4Qg) {
                if (c4Qg.A01 >= c4Qg.A05) {
                    A0A(c4Qg);
                }
            }

            public static final void A0A(C4Qg c4Qg) {
                int i2 = c4Qg.A01;
                if (i2 > 0) {
                    c4Qg.A01 = 0;
                    c4Qg.A07.write(c4Qg.A02, 0, i2);
                }
            }

            public static void A0B(C4Qg c4Qg, byte b) {
                byte[] bArr = c4Qg.A02;
                int i2 = c4Qg.A01;
                c4Qg.A01 = i2 + 1;
                bArr[i2] = b;
            }

            public static void A0C(C4Qg c4Qg, int i2, int i3, int i4) {
                if (i4 + ((i2 - i3) * 6) > c4Qg.A05) {
                    A0A(c4Qg);
                }
            }

            public static final void A0D(C4Qg c4Qg, byte[] bArr) {
                int length = bArr.length;
                if (c4Qg.A01 + length > c4Qg.A05) {
                    A0A(c4Qg);
                    if (length > 512) {
                        c4Qg.A07.write(bArr, 0, length);
                        return;
                    }
                }
                System.arraycopy(bArr, 0, c4Qg.A02, c4Qg.A01, length);
                c4Qg.A01 += length;
            }

            private final void A0E(String str) {
                int i2 = this.A01;
                int i3 = this.A05;
                if (i2 >= i3) {
                    A0A(this);
                }
                byte[] bArr = this.A02;
                int A022 = A02(this);
                byte b = this.A00;
                bArr[A022] = b;
                A0q(str);
                if (this.A01 >= i3) {
                    A0A(this);
                }
                A0B(this, b);
            }

            private final void A0F(String str, int i2, int i3) {
                int i4;
                int i5;
                int i6;
                int i7;
                char charAt;
                int i8 = i3 + i2;
                int i9 = this.A01;
                byte[] bArr = this.A02;
                int[] iArr = ((3sQ) this).A03;
                while (i2 < i8 && (charAt = str.charAt(i2)) <= 127 && iArr[charAt] == 0) {
                    bArr[i9] = (byte) charAt;
                    i2++;
                    i9++;
                }
                this.A01 = i9;
                if (i2 < i8) {
                    int i10 = ((3sQ) this).A00;
                    A0C(this, i8, i2, i9);
                    int i11 = this.A01;
                    if (i10 == 0) {
                        byte[] bArr2 = this.A02;
                        int[] iArr2 = ((3sQ) this).A03;
                        while (i2 < i8) {
                            int i12 = i2 + 1;
                            char charAt2 = str.charAt(i2);
                            if (charAt2 <= 127) {
                                i7 = iArr2[charAt2];
                                if (i7 == 0) {
                                    bArr2[i11] = (byte) charAt2;
                                    i2 = i12;
                                    i11++;
                                } else if (i7 > 0) {
                                    i6 = i11 + 1;
                                    bArr2[i11] = 92;
                                    i11 = i6 + 1;
                                    bArr2[i6] = (byte) i7;
                                    i2 = i12;
                                } else {
                                    i11 = A00(charAt2, i11);
                                    i2 = i12;
                                }
                            } else if (charAt2 <= 2047) {
                                i6 = i11 + 1;
                                bArr2[i11] = (byte) ((charAt2 >> 6) | 192);
                                i11 = i6 + 1;
                                i7 = (charAt2 & '?') | 128;
                                bArr2[i6] = (byte) i7;
                                i2 = i12;
                            } else {
                                i11 = A01(charAt2, i11);
                                i2 = i12;
                            }
                        }
                    } else {
                        byte[] bArr3 = this.A02;
                        int[] iArr3 = ((3sQ) this).A03;
                        int i13 = ((3sQ) this).A00;
                        while (i2 < i8) {
                            int i14 = i2 + 1;
                            char charAt3 = str.charAt(i2);
                            if (charAt3 <= 127) {
                                i5 = iArr3[charAt3];
                                if (i5 == 0) {
                                    bArr3[i11] = (byte) charAt3;
                                    i2 = i14;
                                    i11++;
                                } else {
                                    if (i5 > 0) {
                                        i4 = i11 + 1;
                                        bArr3[i11] = 92;
                                        i11 = i4 + 1;
                                        bArr3[i4] = (byte) i5;
                                    }
                                    i11 = A00(charAt3, i11);
                                }
                            } else {
                                if (charAt3 <= i13) {
                                    if (charAt3 <= 2047) {
                                        i4 = i11 + 1;
                                        bArr3[i11] = (byte) ((charAt3 >> 6) | 192);
                                        i11 = i4 + 1;
                                        i5 = (charAt3 & '?') | 128;
                                        bArr3[i4] = (byte) i5;
                                    } else {
                                        i11 = A01(charAt3, i11);
                                    }
                                }
                                i11 = A00(charAt3, i11);
                            }
                            i2 = i14;
                        }
                    }
                    this.A01 = i11;
                }
            }

            private final void A0G(String str, boolean z) {
                if (z) {
                    A09(this);
                    this.A02[A02(this)] = this.A00;
                }
                int length = str.length();
                int i2 = 0;
                while (length > 0) {
                    int min = Math.min(this.A06, length);
                    if (this.A01 + min > this.A05) {
                        A0A(this);
                    }
                    A0F(str, i2, min);
                    i2 += min;
                    length -= min;
                }
                if (z) {
                    A09(this);
                    this.A02[A02(this)] = this.A00;
                }
            }

            private final void A0H(char[] cArr, int i2, int i3) {
                int i4;
                int i5;
                int i6;
                int i7;
                char c2;
                int i8 = i3 + i2;
                int i9 = this.A01;
                byte[] bArr = this.A02;
                int[] iArr = ((3sQ) this).A03;
                while (i2 < i8 && (c2 = cArr[i2]) <= 127 && iArr[c2] == 0) {
                    bArr[i9] = (byte) c2;
                    i2++;
                    i9++;
                }
                this.A01 = i9;
                if (i2 < i8) {
                    int i10 = ((3sQ) this).A00;
                    A0C(this, i8, i2, i9);
                    int i11 = this.A01;
                    if (i10 == 0) {
                        byte[] bArr2 = this.A02;
                        int[] iArr2 = ((3sQ) this).A03;
                        while (i2 < i8) {
                            int i12 = i2 + 1;
                            char c3 = cArr[i2];
                            if (c3 <= 127) {
                                i7 = iArr2[c3];
                                if (i7 == 0) {
                                    bArr2[i11] = (byte) c3;
                                    i2 = i12;
                                    i11++;
                                } else if (i7 > 0) {
                                    i6 = i11 + 1;
                                    bArr2[i11] = 92;
                                    i11 = i6 + 1;
                                    bArr2[i6] = (byte) i7;
                                    i2 = i12;
                                } else {
                                    i11 = A00(c3, i11);
                                    i2 = i12;
                                }
                            } else if (c3 <= 2047) {
                                i6 = i11 + 1;
                                bArr2[i11] = (byte) ((c3 >> 6) | 192);
                                i11 = i6 + 1;
                                i7 = (c3 & '?') | 128;
                                bArr2[i6] = (byte) i7;
                                i2 = i12;
                            } else {
                                i11 = A01(c3, i11);
                                i2 = i12;
                            }
                        }
                    } else {
                        byte[] bArr3 = this.A02;
                        int[] iArr3 = ((3sQ) this).A03;
                        int i13 = ((3sQ) this).A00;
                        while (i2 < i8) {
                            int i14 = i2 + 1;
                            char c4 = cArr[i2];
                            if (c4 <= 127) {
                                i5 = iArr3[c4];
                                if (i5 == 0) {
                                    bArr3[i11] = (byte) c4;
                                    i2 = i14;
                                    i11++;
                                } else {
                                    if (i5 > 0) {
                                        i4 = i11 + 1;
                                        bArr3[i11] = 92;
                                        i11 = i4 + 1;
                                        bArr3[i4] = (byte) i5;
                                    }
                                    i11 = A00(c4, i11);
                                }
                            } else {
                                if (c4 <= i13) {
                                    if (c4 <= 2047) {
                                        i4 = i11 + 1;
                                        bArr3[i11] = (byte) ((c4 >> 6) | 192);
                                        i11 = i4 + 1;
                                        i5 = (c4 & '?') | 128;
                                        bArr3[i4] = (byte) i5;
                                    } else {
                                        i11 = A01(c4, i11);
                                    }
                                }
                                i11 = A00(c4, i11);
                            }
                            i2 = i14;
                        }
                    }
                    this.A01 = i11;
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:113:0x03bb, code lost:
            
                if (r324 > 0) goto L137;
             */
            /* JADX WARN: Code restructure failed: missing block: B:157:0x032b, code lost:
            
                if (r324 > 0) goto L113;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public int A0W(X.C24f r302, java.io.InputStream r303, int r304) {
                /*
                    Method dump skipped, instructions count: 1054
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C4Qg.A0W(X.24f, java.io.InputStream, int):int");
            }

            public final void A0X() {
                3sW r02 = ((3sR) this).A02;
                if (((3sX) r02).A01 != 1) {
                    throw new Jxa(this, 0Pz.A0W("Current context not Array but ", r02.A04()));
                }
                25I r03 = ((28Q) this).A00;
                if (r03 != null) {
                    r03.DB4(this, ((3sX) r02).A00 + 1);
                } else {
                    A09(this);
                    this.A02[A02(this)] = 93;
                }
                3sW r04 = ((3sR) this).A02;
                r04.A01 = null;
                ((3sR) this).A02 = r04.A05;
            }

            public final void A0Y() {
                3sW r02 = ((3sR) this).A02;
                if (((3sX) r02).A01 != 2) {
                    throw new Jxa(this, 0Pz.A0W("Current context not Object but ", r02.A04()));
                }
                25I r03 = ((28Q) this).A00;
                if (r03 != null) {
                    r03.DB5(this, ((3sX) r02).A00 + 1);
                } else {
                    A09(this);
                    this.A02[A02(this)] = 125;
                }
                3sW r04 = ((3sR) this).A02;
                r04.A01 = null;
                ((3sR) this).A02 = r04.A05;
            }

            public void A0Z() {
                A10("write a null");
                A06();
            }

            public final void A0a() {
                A10("start an array");
                ((3sR) this).A02 = ((3sR) this).A02.A08();
                25I r02 = ((28Q) this).A00;
                if (r02 != null) {
                    r02.DBH(this);
                } else {
                    A09(this);
                    this.A02[A02(this)] = 91;
                }
            }

            public final void A0b() {
                A10("start an object");
                ((3sR) this).A02 = ((3sR) this).A02.A09();
                25I r02 = ((28Q) this).A00;
                if (r02 != null) {
                    r02.DBI(this);
                } else {
                    A09(this);
                    this.A02[A02(this)] = 123;
                }
            }

            public void A0c(char c2) {
                int A032;
                byte b;
                if (this.A01 + 3 >= this.A05) {
                    A0A(this);
                }
                byte[] bArr = this.A02;
                if (c2 <= 127) {
                    A032 = A02(this);
                    b = (byte) c2;
                } else if (c2 >= 2048) {
                    A05(null, c2, 0, 0);
                    return;
                } else {
                    A032 = A03(this, bArr, c2);
                    b = (byte) ((c2 & '?') | 128);
                }
                bArr[A032] = b;
            }

            /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
            
                if ((((X.3sR) r301).A00 & X.25E.A06._mask) != 0) goto L10;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void A0d(double r302) {
                /*
                    r301 = this;
                    r0 = r301
                    boolean r0 = r0.A03
                    r304 = r0
                    r0 = r304
                    if (r0 != 0) goto L3c
                    java.lang.String[] r0 = X.43N.A04
                    r305 = r0
                    r0 = r302
                    boolean r0 = java.lang.Double.isNaN(r0)
                    r304 = r0
                    r0 = r304
                    if (r0 != 0) goto L20
                    r0 = r302
                    boolean r0 = java.lang.Double.isInfinite(r0)
                    r304 = r0
                    r0 = r304
                    if (r0 == 0) goto L49
                L20:
                    X.25E r0 = X.25E.A06
                    r305 = r0
                    r0 = r301
                    int r0 = r0.A00
                    r306 = r0
                    r0 = r305
                    int r0 = r0._mask
                    r304 = r0
                    r0 = r306
                    r1 = r304
                    r0 = r0 & r1
                    r306 = r0
                    r0 = r306
                    if (r0 == 0) goto L49
                L3c:
                    r0 = r302
                    java.lang.String r0 = java.lang.String.valueOf(r0)
                    r305 = r0
                    r0 = r301
                    r1 = r305
                    r0.A0r(r1)
                    return
                L49:
                    r0 = r301
                    java.lang.String r1 = "write a number"
                    r0.A10(r1)
                    r0 = r302
                    java.lang.String r0 = java.lang.String.valueOf(r0)
                    r305 = r0
                    r0 = r301
                    r1 = r305
                    r0.A0q(r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C4Qg.A0d(double):void");
            }

            /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
            
                if ((((X.3sR) r301).A00 & X.25E.A06._mask) != 0) goto L10;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void A0e(float r302) {
                /*
                    r301 = this;
                    r0 = r301
                    boolean r0 = r0.A03
                    r303 = r0
                    r0 = r303
                    if (r0 != 0) goto L39
                    java.lang.String[] r0 = X.43N.A04
                    r304 = r0
                    r0 = r302
                    boolean r0 = java.lang.Float.isNaN(r0)
                    r303 = r0
                    r0 = r303
                    if (r0 != 0) goto L1f
                    r0 = r302
                    boolean r0 = java.lang.Float.isInfinite(r0)
                    r303 = r0
                    r0 = r303
                    if (r0 == 0) goto L44
                L1f:
                    X.25E r0 = X.25E.A06
                    r304 = r0
                    r0 = r301
                    int r0 = r0.A00
                    r305 = r0
                    r0 = r304
                    int r0 = r0._mask
                    r303 = r0
                    r0 = r305
                    r1 = r303
                    r0 = r0 & r1
                    r305 = r0
                    r0 = r305
                    if (r0 == 0) goto L44
                L39:
                    r0 = r302
                    java.lang.String r0 = java.lang.String.valueOf(r0)
                    r304 = r0
                    r0 = r301
                    r1 = r304
                    r0.A0r(r1)
                    return
                L44:
                    r0 = r301
                    java.lang.String r1 = "write a number"
                    r0.A10(r1)
                    r0 = r302
                    java.lang.String r0 = java.lang.String.valueOf(r0)
                    r304 = r0
                    r0 = r301
                    r1 = r304
                    r0.A0q(r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C4Qg.A0e(float):void");
            }

            public void A0f(int i2) {
                A10("write a number");
                int i3 = this.A01 + 11;
                int i4 = this.A05;
                if (i3 >= i4) {
                    A0A(this);
                }
                if (!((3sR) this).A03) {
                    this.A01 = 43N.A03(this.A02, i2, this.A01);
                    return;
                }
                if (this.A01 + 13 >= i4) {
                    A0A(this);
                }
                byte[] bArr = this.A02;
                int i5 = this.A01;
                int i6 = i5 + 1;
                this.A01 = i6;
                byte b = this.A00;
                bArr[i5] = b;
                int A032 = 43N.A03(bArr, i2, i6);
                byte[] bArr2 = this.A02;
                this.A01 = A032 + 1;
                bArr2[A032] = b;
            }

            public void A0g(long j) {
                A10("write a number");
                if (!((3sR) this).A03) {
                    if (this.A01 + 21 >= this.A05) {
                        A0A(this);
                    }
                    this.A01 = 43N.A06(this.A02, this.A01, j);
                    return;
                }
                if (this.A01 + 23 >= this.A05) {
                    A0A(this);
                }
                byte[] bArr = this.A02;
                int i2 = this.A01;
                int i3 = i2 + 1;
                this.A01 = i3;
                byte b = this.A00;
                bArr[i2] = b;
                int A06 = 43N.A06(bArr, i3, j);
                byte[] bArr2 = this.A02;
                this.A01 = A06 + 1;
                bArr2[A06] = b;
            }

            public void A0h(C24f c24f, byte[] bArr, int i2, int i3) {
                byte[] bArr2;
                A10("write a binary value");
                int i4 = this.A01;
                int i5 = this.A05;
                if (i4 >= i5) {
                    A0A(this);
                }
                byte[] bArr3 = this.A02;
                int i6 = this.A01;
                int i7 = i6 + 1;
                this.A01 = i7;
                byte b = this.A00;
                bArr3[i6] = b;
                int i8 = i3 + i2;
                int i9 = i8 - 3;
                int i10 = i5 - 6;
                int i11 = c24f._maxLineLength;
                loop0: while (true) {
                    int i12 = i11 >> 2;
                    while (i2 <= i9) {
                        if (i7 > i10) {
                            A0A(this);
                        }
                        int i13 = i2 + 1;
                        int i14 = i13 + 1;
                        int i15 = ((bArr[i2] << 8) | (bArr[i13] & 255)) << 8;
                        i2 = i14 + 1;
                        int i16 = i15 | (bArr[i14] & 255);
                        bArr2 = this.A02;
                        i7 = c24f.A04(bArr2, i16, this.A01);
                        this.A01 = i7;
                        i12--;
                        if (i12 <= 0) {
                            break;
                        }
                    }
                    int i17 = i7 + 1;
                    bArr2[i7] = 92;
                    i7 = i17 + 1;
                    this.A01 = i7;
                    bArr2[i17] = 110;
                    i11 = c24f._maxLineLength;
                }
                int i18 = i8 - i2;
                if (i18 > 0) {
                    if (i7 > i10) {
                        A0A(this);
                    }
                    int i19 = i2 + 1;
                    int i20 = bArr[i2] << 16;
                    if (i18 == 2) {
                        i20 |= (bArr[i19] & 255) << 8;
                    }
                    i7 = c24f.A02(i20, this.A02, i18, this.A01);
                    this.A01 = i7;
                }
                if (i7 >= i5) {
                    A0A(this);
                }
                A0B(this, b);
            }

            public void A0i(25L r3022) {
                25I r02 = ((28Q) this).A00;
                3sW r03 = ((3sR) this).A02;
                if (r02 != null) {
                    25K r04 = (25K) r3022;
                    int A07 = r03.A07(r04._value);
                    if (A07 != 4) {
                        25I r05 = ((28Q) this).A00;
                        if (A07 == 1) {
                            r05.DBB(this);
                        } else {
                            r05.ABd(this);
                        }
                        boolean z = !((3sQ) this).A02;
                        if (z) {
                            A09(this);
                            this.A02[A02(this)] = this.A00;
                        }
                        int A8W = r3022.A8W(this.A02, this.A01);
                        if (A8W < 0) {
                            byte[] bArr = r04._quotedUTF8Ref;
                            if (bArr == null) {
                                bArr = 25K.A01.A03(r04._value);
                                r04._quotedUTF8Ref = bArr;
                            }
                            A0D(this, bArr);
                        } else {
                            this.A01 += A8W;
                        }
                        if (z) {
                            A09(this);
                            this.A02[A02(this)] = this.A00;
                            return;
                        }
                        return;
                    }
                } else {
                    25K r06 = (25K) r3022;
                    int A072 = r03.A07(r06._value);
                    if (A072 != 4) {
                        if (A072 == 1) {
                            A09(this);
                            this.A02[A02(this)] = 44;
                        }
                        if (((3sQ) this).A02) {
                            int A8W2 = r3022.A8W(this.A02, this.A01);
                            if (A8W2 >= 0) {
                                this.A01 += A8W2;
                                return;
                            }
                            byte[] bArr2 = r06._quotedUTF8Ref;
                            if (bArr2 == null) {
                                bArr2 = 25K.A01.A03(r06._value);
                                r06._quotedUTF8Ref = bArr2;
                            }
                            A0D(this, bArr2);
                            return;
                        }
                        int i2 = this.A01;
                        int i3 = this.A05;
                        if (i2 >= i3) {
                            A0A(this);
                        }
                        byte[] bArr3 = this.A02;
                        int i4 = this.A01;
                        int i5 = i4 + 1;
                        this.A01 = i5;
                        byte b = this.A00;
                        bArr3[i4] = b;
                        int A8W3 = r3022.A8W(bArr3, i5);
                        if (A8W3 < 0) {
                            byte[] bArr4 = r06._quotedUTF8Ref;
                            if (bArr4 == null) {
                                bArr4 = 25K.A01.A03(r06._value);
                                r06._quotedUTF8Ref = bArr4;
                            }
                            A0D(this, bArr4);
                        } else {
                            this.A01 += A8W3;
                        }
                        if (this.A01 >= i3) {
                            A0A(this);
                        }
                        A0B(this, b);
                        return;
                    }
                }
                throw new Jxa(this, "Can not write a field name, expecting a value");
            }

            public void A0j(25L r3022) {
                byte[] bArr = this.A02;
                int i2 = this.A01;
                25K r02 = (25K) r3022;
                byte[] bArr2 = r02._unquotedUTF8Ref;
                if (bArr2 == null) {
                    bArr2 = 25M.A02(r02._value);
                    r02._unquotedUTF8Ref = bArr2;
                }
                int length = bArr2.length;
                if (i2 + length > bArr.length) {
                    A0D(this, bArr2);
                } else {
                    System.arraycopy(bArr2, 0, bArr, i2, length);
                    this.A01 += length;
                }
            }

            public final void A0k(25L r3022) {
                A10("write a string");
                int i2 = this.A01;
                int i3 = this.A05;
                if (i2 >= i3) {
                    A0A(this);
                }
                byte[] bArr = this.A02;
                int i4 = this.A01;
                int i5 = i4 + 1;
                this.A01 = i5;
                byte b = this.A00;
                bArr[i4] = b;
                int A8W = r3022.A8W(bArr, i5);
                if (A8W < 0) {
                    25K r02 = (25K) r3022;
                    byte[] bArr2 = r02._quotedUTF8Ref;
                    if (bArr2 == null) {
                        bArr2 = 25K.A01.A03(r02._value);
                        r02._quotedUTF8Ref = bArr2;
                    }
                    A0D(this, bArr2);
                } else {
                    this.A01 += A8W;
                }
                if (this.A01 >= i3) {
                    A0A(this);
                }
                A0B(this, b);
            }

            public final void A0l(Object obj) {
                A10("start an array");
                ((3sR) this).A02 = ((3sR) this).A02.A0A(obj);
                25I r02 = ((28Q) this).A00;
                if (r02 != null) {
                    r02.DBH(this);
                } else {
                    A09(this);
                    this.A02[A02(this)] = 91;
                }
            }

            public void A0m(Object obj) {
                A10("start an object");
                ((3sR) this).A02 = ((3sR) this).A02.A0B(obj);
                25I r02 = ((28Q) this).A00;
                if (r02 != null) {
                    r02.DBI(this);
                } else {
                    A09(this);
                    this.A02[A02(this)] = 123;
                }
            }

            public void A0n(Object obj, int i2) {
                A10("start an array");
                ((3sR) this).A02 = ((3sR) this).A02.A0A(obj);
                25I r02 = ((28Q) this).A00;
                if (r02 != null) {
                    r02.DBH(this);
                } else {
                    A09(this);
                    this.A02[A02(this)] = 91;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:28:0x01f8  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void A0o(java.lang.String r302) {
                /*
                    Method dump skipped, instructions count: 595
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C4Qg.A0o(java.lang.String):void");
            }

            public void A0p(String str) {
                A10("write a number");
                if (str == null) {
                    A06();
                } else if (((3sR) this).A03) {
                    A0E(str);
                } else {
                    A0q(str);
                }
            }

            public void A0q(String str) {
                int i2;
                char c2;
                int length = str.length();
                char[] cArr = this.A03;
                int length2 = cArr.length;
                if (length <= length2) {
                    str.getChars(0, length, cArr, 0);
                    A0w(cArr, 0, length);
                    return;
                }
                int i3 = 0;
                int i4 = this.A05;
                int min = Math.min(length2, (i4 >> 2) + (i4 >> 4));
                int i5 = min * 3;
                do {
                    int min2 = Math.min(min, length);
                    str.getChars(i3, i3 + min2, cArr, 0);
                    if (this.A01 + i5 > i4) {
                        A0A(this);
                    }
                    if (min2 > 1 && (c2 = cArr[min2 - 1]) >= 55296 && c2 <= 56319) {
                        min2 = i2;
                    }
                    int i6 = 0;
                    while (i6 < min2) {
                        do {
                            char c3 = cArr[i6];
                            if (c3 > 127) {
                                i6++;
                                if (c3 < 2048) {
                                    byte[] bArr = this.A02;
                                    A08(c3, bArr, A03(this, bArr, c3));
                                } else {
                                    i6 = A05(cArr, c3, i6, min2);
                                }
                            } else {
                                this.A02[A02(this)] = (byte) c3;
                                i6++;
                            }
                        } while (i6 < min2);
                    }
                    i3 += min2;
                    length -= min2;
                } while (length > 0);
            }

            public void A0r(String str) {
                A10("write a string");
                if (str == null) {
                    A06();
                    return;
                }
                int length = str.length();
                if (length > this.A06) {
                    A0G(str, true);
                    return;
                }
                int i2 = this.A01 + length;
                int i3 = this.A05;
                if (i2 >= i3) {
                    A0A(this);
                }
                byte[] bArr = this.A02;
                int A022 = A02(this);
                byte b = this.A00;
                bArr[A022] = b;
                A0F(str, 0, length);
                if (this.A01 >= i3) {
                    A0A(this);
                }
                A0B(this, b);
            }

            public void A0s(BigDecimal bigDecimal) {
                A10("write a number");
                if (bigDecimal == null) {
                    A06();
                    return;
                }
                boolean z = ((3sR) this).A03;
                String A0y = A0y(bigDecimal);
                if (z) {
                    A0E(A0y);
                } else {
                    A0q(A0y);
                }
            }

            public void A0t(BigInteger bigInteger) {
                A10("write a number");
                if (bigInteger == null) {
                    A06();
                    return;
                }
                boolean z = ((3sR) this).A03;
                String obj = bigInteger.toString();
                if (z) {
                    A0E(obj);
                } else {
                    A0q(obj);
                }
            }

            public void A0u(short s) {
                A10("write a number");
                int i2 = this.A01 + 6;
                int i3 = this.A05;
                if (i2 >= i3) {
                    A0A(this);
                }
                if (!((3sR) this).A03) {
                    this.A01 = 43N.A03(this.A02, s, this.A01);
                    return;
                }
                if (this.A01 + 8 >= i3) {
                    A0A(this);
                }
                byte[] bArr = this.A02;
                int i4 = this.A01;
                int i5 = i4 + 1;
                this.A01 = i5;
                byte b = this.A00;
                bArr[i4] = b;
                int A032 = 43N.A03(bArr, s, i5);
                byte[] bArr2 = this.A02;
                this.A01 = A032 + 1;
                bArr2[A032] = b;
            }

            public void A0v(boolean z) {
                A10("write a boolean value");
                if (this.A01 + 5 >= this.A05) {
                    A0A(this);
                }
                byte[] bArr = z ? A0B : A08;
                int length = bArr.length;
                System.arraycopy(bArr, 0, this.A02, this.A01, length);
                this.A01 += length;
            }

            public final void A0w(char[] cArr, int i2, int i3) {
                int i4 = 0;
                int i5 = i3 + i3 + i3;
                int i6 = this.A01 + i5;
                int i7 = this.A05;
                if (i6 > i7) {
                    if (i7 < i5) {
                        int i8 = 0;
                        byte[] bArr = this.A02;
                        while (i8 < i3) {
                            do {
                                char c2 = cArr[i8];
                                int i9 = this.A01;
                                if (c2 >= 128) {
                                    if (i9 + 3 >= i7) {
                                        A0A(this);
                                    }
                                    int i10 = i8 + 1;
                                    char c3 = cArr[i8];
                                    if (c3 < 2048) {
                                        bArr[A03(this, bArr, c3)] = (byte) ((c3 & '?') | 128);
                                        i8 = i10;
                                    } else {
                                        i8 = A05(cArr, c3, i10, i3);
                                    }
                                } else {
                                    if (i9 >= i7) {
                                        A0A(this);
                                    }
                                    bArr[A02(this)] = (byte) c2;
                                    i8++;
                                }
                            } while (i8 < i3);
                            return;
                        }
                        return;
                    }
                    A0A(this);
                }
                while (i4 < i3) {
                    do {
                        char c4 = cArr[i4];
                        if (c4 > 127) {
                            i4++;
                            if (c4 < 2048) {
                                byte[] bArr2 = this.A02;
                                A08(c4, bArr2, A03(this, bArr2, c4));
                            } else {
                                i4 = A05(cArr, c4, i4, i3);
                            }
                        } else {
                            this.A02[A02(this)] = (byte) c4;
                            i4++;
                        }
                    } while (i4 < i3);
                    return;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x0078  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void A0x(char[] r302, int r303, int r304) {
                /*
                    r301 = this;
                    java.lang.String r0 = "write a string"
                    r305 = r0
                    r0 = r301
                    r1 = r305
                    r0.A10(r1)
                    r0 = r301
                    int r0 = r0.A01
                    r306 = r0
                    r0 = r301
                    int r0 = r0.A05
                    r307 = r0
                    r0 = r306
                    r1 = r307
                    if (r0 < r1) goto L22
                    r0 = r301
                    A0A(r0)
                L22:
                    r0 = r301
                    byte[] r0 = r0.A02
                    r308 = r0
                    r0 = r301
                    int r0 = r0.A01
                    r309 = r0
                    r0 = r309
                    r1 = 1
                    int r0 = r0 + r1
                    r306 = r0
                    r0 = r301
                    r1 = r306
                    r0.A01 = r1
                    r0 = r301
                    byte r0 = r0.A00
                    r310 = r0
                    r0 = r308
                    r1 = r309
                    r2 = r310
                    r0[r1] = r2
                    r0 = r301
                    int r0 = r0.A06
                    r311 = r0
                    r0 = r304
                    r1 = r311
                    if (r0 > r1) goto L83
                    r0 = r306
                    r1 = r304
                    int r0 = r0 + r1
                    r306 = r0
                    r0 = r306
                    r1 = r307
                    if (r0 <= r1) goto L64
                    r0 = r301
                    A0A(r0)
                L64:
                    r0 = r301
                    r1 = r302
                    r2 = r303
                    r3 = r304
                    r0.A0H(r1, r2, r3)
                L6b:
                    r0 = r301
                    int r0 = r0.A01
                    r306 = r0
                    r0 = r306
                    r1 = r307
                    if (r0 < r1) goto L7c
                    r0 = r301
                    A0A(r0)
                L7c:
                    r0 = r301
                    r1 = r310
                    A0B(r0, r1)
                    return
                L83:
                    r0 = r311
                    r1 = r304
                    int r0 = java.lang.Math.min(r0, r1)
                    r309 = r0
                    r0 = r301
                    int r0 = r0.A01
                    r1 = r309
                    int r0 = r0 + r1
                    r306 = r0
                    r0 = r306
                    r1 = r307
                    if (r0 <= r1) goto L9f
                    r0 = r301
                    A0A(r0)
                L9f:
                    r0 = r301
                    r1 = r302
                    r2 = r303
                    r3 = r309
                    r0.A0H(r1, r2, r3)
                    r0 = r303
                    r1 = r309
                    int r0 = r0 + r1
                    r303 = r0
                    r0 = r304
                    r1 = r309
                    int r0 = r0 - r1
                    r304 = r0
                    r0 = r304
                    if (r0 > 0) goto L83
                    goto L6b
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C4Qg.A0x(char[], int, int):void");
            }

            public void close() {
                if (this.A02 != null && A0V(25E.A01)) {
                    while (true) {
                        int i2 = ((3sX) ((3sR) this).A02).A01;
                        if (i2 != 1) {
                            if (i2 != 2) {
                                break;
                            } else {
                                A0Y();
                            }
                        } else {
                            A0X();
                        }
                    }
                }
                A0A(this);
                this.A01 = 0;
                OutputStream outputStream2 = this.A07;
                if (outputStream2 != null) {
                    if (((3sQ) this).A04.A09 || A0V(25E.A02)) {
                        outputStream2.close();
                    } else if (A0V(25E.A04)) {
                        outputStream2.flush();
                    }
                }
                byte[] bArr = this.A02;
                if (bArr != null) {
                    this.A02 = null;
                    3sO r02 = ((3sQ) this).A04;
                    byte[] bArr2 = r02.A03;
                    if (bArr != bArr2 && bArr.length < bArr2.length) {
                        throw AnonymousClass001.A0L("Trying to release buffer smaller than original");
                    }
                    r02.A03 = null;
                    r02.A08.A00.set(1, bArr);
                }
                char[] cArr = this.A03;
                if (cArr != null) {
                    this.A03 = null;
                    ((3sQ) this).A04.A03(cArr);
                }
            }
        };
        int i2 = anonymousClass259._maximumNonEscapedChar;
        if (i2 > 0) {
            ((3sQ) r0).A00 = i2;
        }
        25L r02 = anonymousClass259._rootValueSeparator;
        if (r02 != A02) {
            ((3sQ) r0).A01 = r02;
        }
        return r0;
    }

    public static Reader A02(3sO r301, InputStream inputStream, byte[] bArr, int i, int i2) {
        String str;
        InputStream inputStream2 = inputStream;
        Integer num = r301.A00;
        int intValue = num.intValue();
        switch (intValue) {
            case 3:
            case 4:
                return new 3DY(r301, inputStream2, bArr, i2, i, 3 - intValue == 0);
            default:
                if (inputStream == null) {
                    inputStream2 = new ByteArrayInputStream(bArr, i2, i);
                } else if (i2 < i) {
                    inputStream2 = new 3DV(r301, inputStream, bArr, i2, i);
                }
                switch (num.intValue()) {
                    case 1:
                        str = "UTF-16BE";
                        break;
                    case 2:
                        str = "UTF-16LE";
                        break;
                    case 3:
                        str = "UTF-32BE";
                        break;
                    case 4:
                        str = "UTF-32LE";
                        break;
                    default:
                        str = "UTF-8";
                        break;
                }
                return new InputStreamReader(inputStream2, str);
        }
    }

    public C42V A03(InputStream inputStream) {
        return A00(this, new 3sO(new 3sN(true, inputStream), A08(), false), inputStream);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x021f, code lost:
    
        if ((r0 & (-65281)) == 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01b2, code lost:
    
        if ((r317 & 255) == 0) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C42V A04(byte[] r302) {
        /*
            Method dump skipped, instructions count: 687
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass259.A04(byte[]):X.42V");
    }

    public C42f A05(String str) {
        int length = str.length();
        if (length > 32768) {
            StringReader stringReader = new StringReader(str);
            3sO r0 = new 3sO(new 3sN(true, stringReader), A08(), false);
            int i = C42f.A0F;
            return new C42f(this._objectCodec, r0, this.A01.A00(this._factoryFeatures), stringReader, this._parserFeatures);
        }
        3sO r02 = new 3sO(new 3sN(true, str), A08(), true);
        3sO.A00(r02.A06);
        char[] A01 = r02.A08.A01(0, length);
        r02.A06 = A01;
        str.getChars(0, length, A01, 0);
        int i2 = C42f.A0F;
        return new C42f(this._objectCodec, r02, this.A01.A00(this._factoryFeatures), A01, this._parserFeatures, length);
    }

    public C4Qg A06(OutputStream outputStream) {
        Integer num = 0S2.A00;
        3sO r0 = new 3sO(new 3sN(true, outputStream), A08(), false);
        r0.A00 = num;
        return A01(this, r0, outputStream);
    }

    public 3sP A07(Writer writer) {
        3sP r0 = new 3sP(this._objectCodec, new 3sO(new 3sN(true, writer), A08(), false), writer, this._quoteChar, this._generatorFeatures);
        int i = this._maximumNonEscapedChar;
        if (i > 0) {
            ((3sQ) r0).A00 = i;
        }
        25L r02 = this._rootValueSeparator;
        if (r02 != A02) {
            ((3sQ) r0).A01 = r02;
        }
        return r0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0031, code lost:
    
        if (r305 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.3sK A08() {
        /*
            r301 = this;
            X.25B r0 = X.25B.A04
            r302 = r0
            r0 = r301
            int r0 = r0._factoryFeatures
            r303 = r0
            r0 = r302
            r1 = r303
            boolean r0 = r0.A00(r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L9a
            java.lang.ThreadLocal r0 = X.3sI.A01
            r304 = r0
            r0 = r304
            java.lang.Object r0 = r0.get()
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L34
            r0 = r305
            java.lang.Object r0 = r0.get()
            X.3sK r0 = (X.3sK) r0
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L97
        L34:
            X.3sK r0 = new X.3sK
            r305 = r0
            r0 = r305
            r0.<init>()
            X.3sJ r0 = X.3sI.A00
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L85
            r0 = r302
            java.lang.ref.ReferenceQueue r0 = r0.A00
            r306 = r0
            java.lang.ref.SoftReference r0 = new java.lang.ref.SoftReference
            r307 = r0
            r0 = r307
            r1 = r305
            r2 = r306
            r0.<init>(r1, r2)
            r0 = r302
            java.util.Map r0 = r0.A01
            r308 = r0
            java.lang.Boolean r0 = X.AnonymousClass001.A0K()
            r302 = r0
            r0 = r308
            r1 = r307
            r2 = r302
            java.lang.Object r0 = r0.put(r1, r2)
        L6f:
            r0 = r306
            java.lang.ref.Reference r0 = r0.poll()
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L91
            r0 = r308
            r1 = r302
            java.lang.Object r0 = r0.remove(r1)
            goto L6f
        L85:
            java.lang.ref.SoftReference r0 = new java.lang.ref.SoftReference
            r307 = r0
            r0 = r307
            r1 = r305
            r0.<init>(r1)
        L91:
            r0 = r304
            r1 = r307
            r0.set(r1)
        L97:
            r0 = r305
            return r0
        L9a:
            X.3sK r0 = new X.3sK
            r305 = r0
            r0 = r305
            r0.<init>()
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass259.A08():X.3sK");
    }

    public Object readResolve() {
        return new AnonymousClass259(this, this._objectCodec);
    }
}
