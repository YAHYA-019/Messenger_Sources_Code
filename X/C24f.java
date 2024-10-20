package X;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: X.24f, reason: invalid class name */
/* loaded from: 24f.class */
public final class C24f implements Serializable {
    public static final long serialVersionUID = 1;
    public final transient char[] A00;
    public final transient int[] A01;
    public final transient byte[] A02;
    public final int _maxLineLength;
    public final String _name;
    public final char _paddingChar;
    public final C24g _paddingReadBehaviour;
    public final boolean _writePadding;

    public C24f(C24g c24g, C24f c24f, String str, char c, int i, boolean z) {
        int[] iArr = new int[128];
        this.A01 = iArr;
        char[] cArr = new char[64];
        this.A00 = cArr;
        byte[] bArr = new byte[64];
        this.A02 = bArr;
        this._name = str;
        System.arraycopy(c24f.A02, 0, bArr, 0, 64);
        System.arraycopy(c24f.A00, 0, cArr, 0, 64);
        System.arraycopy(c24f.A01, 0, iArr, 0, 128);
        this._writePadding = z;
        this._paddingChar = c;
        this._maxLineLength = i;
        this._paddingReadBehaviour = c24g;
    }

    public C24f(String str, String str2, char c, int i, boolean z) {
        int[] iArr;
        C24g c24g;
        int[] iArr2 = new int[128];
        this.A01 = iArr2;
        char[] cArr = new char[64];
        this.A00 = cArr;
        this.A02 = new byte[64];
        this._name = str;
        this._writePadding = z;
        this._paddingChar = c;
        this._maxLineLength = i;
        int length = str2.length();
        if (length != 64) {
            throw 0Pz.A06("Base64Alphabet length must be exactly 64 (was ", ")", length);
        }
        int i2 = 0;
        str2.getChars(0, length, cArr, 0);
        Arrays.fill(iArr2, -1);
        do {
            char c2 = this.A00[i2];
            this.A02[i2] = (byte) c2;
            iArr = this.A01;
            iArr[c2] = i2;
            i2++;
        } while (i2 < length);
        if (z) {
            iArr[c] = -2;
            c24g = C24g.PADDING_REQUIRED;
        } else {
            c24g = C24g.PADDING_FORBIDDEN;
        }
        this._paddingReadBehaviour = c24g;
    }

    private void A00(String str, char c, int i) {
        String str2;
        StringBuilder A0k;
        String str3;
        if (c <= ' ') {
            A0k = AnonymousClass001.A0k();
            1BL.A1M("Illegal white space character (code 0x", A0k, c);
            A0k.append(") as character #");
            A0k.append(i + 1);
            str2 = " of 4-char base64 unit: can only used between units";
        } else {
            char c2 = this._paddingChar;
            if (c == c2) {
                A0k = AnonymousClass001.A0k();
                A0k.append("Unexpected padding character ('");
                A0k.append(c2);
                A0k.append("') as character #");
                A0k.append(i + 1);
                str2 = " of 4-char base64 unit: padding only legal as 3rd or 4th character";
            } else {
                str2 = ") in base64 content";
                if (!Character.isDefined(c) || Character.isISOControl(c)) {
                    A0k = AnonymousClass001.A0k();
                    str3 = "Illegal character (code 0x";
                } else {
                    A0k = AnonymousClass001.A0k();
                    A0k.append("Illegal character '");
                    A0k.append(c);
                    str3 = "' (code 0x";
                }
                1BL.A1M(str3, A0k, c);
            }
        }
        String A0d = AnonymousClass001.A0d(str2, A0k);
        if (str != null) {
            A0d = 0Pz.A0j(A0d, ": ", str);
        }
        throw AnonymousClass001.A0L(A0d);
    }

    public int A01(char c) {
        if (c <= 127) {
            return this.A01[c];
        }
        return -1;
    }

    public int A02(int i, byte[] bArr, int i2, int i3) {
        int i4 = i3 + 1;
        byte[] bArr2 = this.A02;
        bArr[i3] = bArr2[(i >> 18) & 63];
        int i5 = i4 + 1;
        bArr[i4] = bArr2[(i >> 12) & 63];
        if (this._writePadding) {
            byte b = (byte) this._paddingChar;
            int i6 = i5 + 1;
            bArr[i5] = i2 == 2 ? bArr2[(i >> 6) & 63] : b;
            i5 = i6 + 1;
            bArr[i6] = b;
        } else if (i2 == 2) {
            int i7 = i5 + 1;
            bArr[i5] = bArr2[(i >> 6) & 63];
            return i7;
        }
        return i5;
    }

    public int A03(int i, char[] cArr, int i2) {
        int i3 = i2 + 1;
        char[] cArr2 = this.A00;
        cArr[i2] = cArr2[(i >> 18) & 63];
        int i4 = i3 + 1;
        cArr[i3] = cArr2[(i >> 12) & 63];
        int i5 = i4 + 1;
        cArr[i4] = cArr2[(i >> 6) & 63];
        int i6 = i5 + 1;
        cArr[i5] = cArr2[i & 63];
        return i6;
    }

    public int A04(byte[] bArr, int i, int i2) {
        int i3 = i2 + 1;
        byte[] bArr2 = this.A02;
        bArr[i2] = bArr2[(i >> 18) & 63];
        int i4 = i3 + 1;
        bArr[i3] = bArr2[(i >> 12) & 63];
        int i5 = i4 + 1;
        bArr[i4] = bArr2[(i >> 6) & 63];
        int i6 = i5 + 1;
        bArr[i5] = bArr2[i & 63];
        return i6;
    }

    public int A05(char[] cArr, int i, int i2, int i3) {
        int i4 = i3 + 1;
        char[] cArr2 = this.A00;
        cArr[i3] = cArr2[(i >> 18) & 63];
        int i5 = i4 + 1;
        cArr[i4] = cArr2[(i >> 12) & 63];
        if (this._writePadding) {
            int i6 = i5 + 1;
            cArr[i5] = i2 == 2 ? cArr2[(i >> 6) & 63] : this._paddingChar;
            i5 = i6 + 1;
            cArr[i6] = this._paddingChar;
        } else if (i2 == 2) {
            int i7 = i5 + 1;
            cArr[i5] = cArr2[(i >> 6) & 63];
            return i7;
        }
        return i5;
    }

    public String A06(byte[] bArr) {
        char c;
        int length = bArr.length;
        StringBuilder A0l = AnonymousClass001.A0l((length >> 2) + length + (length >> 3));
        int i = this._maxLineLength >> 2;
        int i2 = 0;
        int i3 = length - 3;
        while (i2 <= i3) {
            int i4 = i2 + 1;
            int i5 = i4 + 1;
            int i6 = ((bArr[i2] << 8) | (bArr[i4] & 255)) << 8;
            i2 = i5 + 1;
            int i7 = i6 | (bArr[i5] & 255);
            char[] cArr = this.A00;
            A0l.append(cArr[(i7 >> 18) & 63]);
            A0l.append(cArr[(i7 >> 12) & 63]);
            A0l.append(cArr[(i7 >> 6) & 63]);
            A0l.append(cArr[i7 & 63]);
            i--;
            if (i <= 0) {
                A0l.append('\\');
                A0l.append('n');
                i = i;
            }
        }
        int i8 = length - i2;
        if (i8 > 0) {
            int i9 = i2 + 1;
            int i10 = bArr[i2] << 16;
            if (i8 == 2) {
                i10 |= (bArr[i9] & 255) << 8;
            }
            char[] cArr2 = this.A00;
            A0l.append(cArr2[(i10 >> 18) & 63]);
            A0l.append(cArr2[(i10 >> 12) & 63]);
            if (this._writePadding) {
                A0l.append(i8 == 2 ? cArr2[(i10 >> 6) & 63] : this._paddingChar);
                c = this._paddingChar;
            } else if (i8 == 2) {
                c = cArr2[(i10 >> 6) & 63];
            }
            A0l.append(c);
        }
        return A0l.toString();
    }

    public void A07(3DX r302, String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            char charAt = str.charAt(i);
            if (charAt > ' ') {
                int A01 = A01(charAt);
                if (A01 >= 0) {
                    if (i2 < length) {
                        int i3 = i2 + 1;
                        char charAt2 = str.charAt(i2);
                        int A012 = A01(charAt2);
                        if (A012 < 0) {
                            A00(null, charAt2, 1);
                        } else {
                            int i4 = (A01 << 6) | A012;
                            if (i3 < length) {
                                int i5 = i3 + 1;
                                char charAt3 = str.charAt(i3);
                                int A013 = A01(charAt3);
                                if (A013 >= 0) {
                                    int i6 = (i4 << 6) | A013;
                                    if (i5 < length) {
                                        i2 = i5 + 1;
                                        char charAt4 = str.charAt(i5);
                                        int A014 = A01(charAt4);
                                        if (A014 >= 0) {
                                            r302.A03((i6 << 6) | A014);
                                        } else if (A014 != -2) {
                                            A00(null, charAt4, 3);
                                        } else {
                                            if (this._paddingReadBehaviour == C24g.PADDING_FORBIDDEN) {
                                                throw 1BK.A0f("Unexpected end of base64-encoded String: base64 variant '%s' expects no padding at the end while decoding. This Base64Variant might have been incorrectly configured", new Object[]{this._name});
                                            }
                                            r302.A04(i6 >> 2);
                                        }
                                    } else if (this._paddingReadBehaviour != C24g.PADDING_REQUIRED) {
                                        r302.A04(i6 >> 2);
                                        return;
                                    }
                                } else if (A013 != -2) {
                                    A00(null, charAt3, 2);
                                } else {
                                    if (this._paddingReadBehaviour == C24g.PADDING_FORBIDDEN) {
                                        throw 1BK.A0f("Unexpected end of base64-encoded String: base64 variant '%s' expects no padding at the end while decoding. This Base64Variant might have been incorrectly configured", new Object[]{this._name});
                                    }
                                    if (i5 < length) {
                                        i = i5 + 1;
                                        char charAt5 = str.charAt(i5);
                                        char c = this._paddingChar;
                                        if (charAt5 == c) {
                                            r302.A02(i4 >> 4);
                                        } else {
                                            A00(0Pz.A0Y(AbstractC00603o4.A00(488), "'", c), charAt5, 3);
                                        }
                                    }
                                }
                            } else if (this._paddingReadBehaviour != C24g.PADDING_REQUIRED) {
                                r302.A02(i4 >> 4);
                                return;
                            }
                        }
                    }
                    throw 1BK.A0f("Unexpected end of base64-encoded String: base64 variant '%s' expects padding (one or more '%c' characters) at the end. This Base64Variant might have been incorrectly configured", new Object[]{this._name, Character.valueOf(this._paddingChar)});
                }
                A00(null, charAt, 0);
                throw 0Q8.createAndThrow();
            }
            i = i2;
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            C24f c24f = (C24f) obj;
            if (c24f._paddingChar != this._paddingChar || c24f._maxLineLength != this._maxLineLength || c24f._writePadding != this._writePadding || c24f._paddingReadBehaviour != this._paddingReadBehaviour || !this._name.equals(c24f._name)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this._name.hashCode();
    }

    public Object readResolve() {
        String str = this._name;
        C24f c24f = C24e.A00;
        if (!c24f._name.equals(str)) {
            c24f = C24e.A01;
            if (!c24f._name.equals(str)) {
                c24f = C24e.A03;
                if (!c24f._name.equals(str)) {
                    c24f = C24e.A02;
                    if (!c24f._name.equals(str)) {
                        throw 0Pz.A05("No Base64Variant with name ", str == null ? "<null>" : 0Pz.A0j("'", str, "'"));
                    }
                }
            }
        }
        boolean z = this._writePadding;
        if (z == c24f._writePadding && this._paddingChar == c24f._paddingChar && this._paddingReadBehaviour == c24f._paddingReadBehaviour && this._maxLineLength == c24f._maxLineLength) {
            return c24f;
        }
        return new C24f(this._paddingReadBehaviour, c24f, str, this._paddingChar, this._maxLineLength, z);
    }

    public String toString() {
        return this._name;
    }
}
