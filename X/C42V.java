package X;

import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: X.42V, reason: invalid class name */
/* loaded from: 42V.class */
public abstract class C42V extends C42W {
    public static final C27Z A0P = AbstractC01033pi.A01;
    public double A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public C42h A0D;
    public C42b A0E;
    public BigDecimal A0F;
    public BigInteger A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public byte[] A0K;
    public char[] A0L;
    public 3DX A0M;
    public final 3sO A0N;
    public final 3sM A0O;

    public C42V(3sO r302, int i) {
        ((AbstractC01033pi) this).A00 = i;
        this.A01 = 1;
        this.A09 = 1;
        this.A06 = 0;
        this.A0N = r302;
        this.A0O = new 3sM(r302.A08);
        this.A0E = new C42b((i & 25D.A0E._mask) != 0 ? new 3sY(this) : null, null, 0, 1, 0);
    }

    public static IllegalArgumentException A0u(C24f c24f, String str, int i, int i2) {
        String A00;
        StringBuilder A0k;
        String A002;
        String A0d;
        if (i <= 32) {
            A0d = String.format("Illegal white space character (code 0x%s) as character #%d of 4-char base64 unit: can only used between units", AnonymousClass001.A1b(Integer.toHexString(i), i2 + 1));
        } else {
            char c = c24f._paddingChar;
            if (i == c) {
                A0k = AnonymousClass001.A0k();
                A0k.append(1BJ.A00(893));
                A0k.append(c);
                A0k.append(1BJ.A00(600));
                A0k.append(i2 + 1);
                A00 = 1BJ.A00(596);
            } else {
                boolean isDefined = Character.isDefined(i);
                A00 = 1BJ.A00(601);
                if (!isDefined || Character.isISOControl(i)) {
                    A0k = AnonymousClass001.A0k();
                    A002 = 1BJ.A00(763);
                } else {
                    A0k = AnonymousClass001.A0k();
                    A0k.append(1BJ.A00(762));
                    A0k.append((char) i);
                    A002 = "' (code 0x";
                }
                A0k.append(A002);
                A0k.append(Integer.toHexString(i));
            }
            A0d = AnonymousClass001.A0d(A00, A0k);
        }
        if (str != null) {
            A0d = 0Pz.A0j(A0d, ": ", str);
        }
        return AnonymousClass001.A0L(A0d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01bc, code lost:
    
        if (r0 < 0) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0v(X.C42V r301, int r302) {
        /*
            Method dump skipped, instructions count: 1082
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42V.A0v(X.42V, int):void");
    }

    public static void A0w(C42V c42v, int i, int i2) {
        int i3 = 25D.A0E._mask;
        if ((i2 & i3) == 0 || (i & i3) == 0) {
            return;
        }
        C42b c42b = c42v.A0E;
        c42b.A02 = c42b.A02 == null ? new 3sY(c42v) : null;
        c42v.A0E = c42b;
    }

    private void A2O(char c) {
        25D r0 = 25D.A01;
        int i = ((AbstractC01033pi) this).A00;
        if ((r0._mask & i) == 0) {
            if (c != '\'' || (i & 25D.A07._mask) == 0) {
                A2C(0Pz.A0W("Unrecognized character escape ", C42W.A0x(c)));
                throw 0Q8.createAndThrow();
            }
        }
    }

    public char A2D() {
        if (this instanceof 42U) {
            42U r0 = (42U) this;
            if (r0.A04 < r0.A03 || 42U.A0s(r0)) {
                byte[] bArr = r0.A06;
                int i = r0.A04;
                int i2 = i + 1;
                r0.A04 = i2;
                byte b = bArr[i];
                if (b != 34 && b != 47 && b != 92) {
                    if (b == 98) {
                        return '\b';
                    }
                    if (b == 102) {
                        return '\f';
                    }
                    if (b == 110) {
                        return '\n';
                    }
                    if (b == 114) {
                        return '\r';
                    }
                    if (b == 116) {
                        return '\t';
                    }
                    if (b != 117) {
                        char A0F = (char) 42U.A0F(r0, b);
                        r0.A2O(A0F);
                        return A0F;
                    }
                    int i3 = 0;
                    b = 0;
                    do {
                        if (i2 < r0.A03 || 42U.A0s(r0)) {
                            byte[] bArr2 = r0.A06;
                            int i4 = r0.A04;
                            i2 = i4 + 1;
                            r0.A04 = i2;
                            int i5 = bArr2[i4] & 255;
                            int i6 = 25N.A01[i5];
                            if (i6 < 0) {
                                r0.A26(i5, "expected a hex-digit for character escape sequence");
                            } else {
                                b = ((b << 4) | i6) == true ? 1 : 0;
                                i3++;
                            }
                        }
                    } while (i3 < 4);
                }
                return (char) b;
            }
            r0.A29(C42h.A0C, " in character escape sequence");
        } else {
            C42f c42f = (C42f) this;
            if (((C42V) c42f).A04 < ((C42V) c42f).A03 || C42f.A0a(c42f)) {
                char[] cArr = c42f.A06;
                int i7 = ((C42V) c42f).A04;
                int i8 = i7 + 1;
                ((C42V) c42f).A04 = i8;
                char c = cArr[i7];
                if (c != '\"' && c != '/' && c != '\\') {
                    if (c == 'b') {
                        return '\b';
                    }
                    if (c == 'f') {
                        return '\f';
                    }
                    if (c == 'n') {
                        return '\n';
                    }
                    if (c == 'r') {
                        return '\r';
                    }
                    if (c == 't') {
                        return '\t';
                    }
                    if (c == 'u') {
                        int i9 = 0;
                        int i10 = 0;
                        do {
                            if (i8 < ((C42V) c42f).A03 || C42f.A0a(c42f)) {
                                char[] cArr2 = c42f.A06;
                                int i11 = ((C42V) c42f).A04;
                                i8 = i11 + 1;
                                ((C42V) c42f).A04 = i8;
                                char c2 = cArr2[i11];
                                int i12 = 25N.A01[c2 & 255];
                                if (i12 < 0) {
                                    c42f.A26(c2, "expected a hex-digit for character escape sequence");
                                } else {
                                    i10 = (i10 << 4) | i12;
                                    i9++;
                                }
                            }
                        } while (i9 < 4);
                        return (char) i10;
                    }
                    c42f.A2O(c);
                }
                return c;
            }
            c42f.A29(C42h.A0C, " in character escape sequence");
        }
        throw 0Q8.createAndThrow();
    }

    public int A2E() {
        if (this.A0H) {
            A2C("Internal error: _parseNumericValue called when parser instance closed");
            throw 0Q8.createAndThrow();
        }
        if (((C42W) this).A00 != C42h.A0B || this.A05 > 9) {
            A0v(this, 1);
            if ((this.A06 & 1) == 0) {
                A2N();
            }
            return this.A07;
        }
        int A05 = this.A0O.A05(this.A0J);
        this.A07 = A05;
        this.A06 = 1;
        return A05;
    }

    public final int A2F(C24f c24f, char c, int i) {
        int A01;
        if (c == '\\') {
            c = A2D();
            if (c > ' ' || i != 0) {
                A01 = c24f.A01(c);
                if (A01 < 0) {
                    if (A01 == -2 && i >= 2) {
                        return A01;
                    }
                }
            } else {
                A01 = -1;
            }
            return A01;
        }
        throw A0u(c24f, null, c, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002a, code lost:
    
        if (r303 <= 127) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int A2G(X.C24f r302, int r303, int r304) {
        /*
            r301 = this;
            r0 = 92
            r305 = r0
            r0 = r303
            r1 = r305
            if (r0 != r1) goto L4c
            r0 = r301
            char r0 = r0.A2D()
            r303 = r0
            r0 = 32
            r305 = r0
            r0 = r303
            r1 = r305
            if (r0 > r1) goto L23
            r0 = r304
            if (r0 != 0) goto L2d
            r0 = -1
            r306 = r0
        L20:
            r0 = r306
            return r0
        L23:
            r0 = 127(0x7f, float:1.78E-43)
            r305 = r0
            r0 = r303
            r1 = r305
            if (r0 > r1) goto L4c
        L2d:
            r0 = r302
            int[] r0 = r0.A01
            r307 = r0
            r0 = r307
            r1 = r303
            r0 = r0[r1]
            r306 = r0
            r0 = r306
            if (r0 >= 0) goto L20
            r0 = -2
            r305 = r0
            r0 = r306
            r1 = r305
            if (r0 != r1) goto L4c
            r0 = r306
            return r0
        L4c:
            r0 = r302
            r1 = 0
            r2 = r303
            r3 = r304
            java.lang.IllegalArgumentException r0 = A0u(r0, r1, r2, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42V.A2G(X.24f, int, int):int");
    }

    public final C42h A2H(String str, double d) {
        3sM r0 = this.A0O;
        r0.A08 = null;
        r0.A02 = -1;
        r0.A01 = 0;
        r0.A04 = str;
        r0.A09 = null;
        if (r0.A06) {
            3sM.A00(r0);
        }
        r0.A00 = 0;
        this.A00 = d;
        this.A06 = 8;
        return C42h.A0A;
    }

    public 3sN A2I() {
        return (((AbstractC01033pi) this).A00 & 25D.A0D._mask) != 0 ? this.A0N.A07 : 3sN.A01;
    }

    public 3DX A2J() {
        3DX r0 = this.A0M;
        if (r0 == null) {
            this.A0M = new 3DX();
        } else {
            r0.A01();
        }
        return this.A0M;
    }

    public String A2K() {
        return (((AbstractC01033pi) this).A00 & 25D.A05._mask) != 0 ? "(JSON String, Number (or 'NaN'/'INF'/'+INF'), Array, Object or token 'null', 'true' or 'false')" : "(JSON String, Number, Array, Object or token 'null', 'true' or 'false')";
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x008d, code lost:
    
        if ((r0.A00 & X.25D.A0C._mask) != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0042, code lost:
    
        if ((((X.AbstractC01033pi) r0).A00 & X.25D.A0C._mask) != 0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A2L() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0 instanceof X.C42f
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L54
            r0 = r301
            r303 = r0
            r0 = r301
            X.42f r0 = (X.C42f) r0
            r303 = r0
            r0 = r303
            java.io.Reader r0 = r0.A04
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L53
            r0 = r303
            X.3sO r0 = r0.A0N
            r305 = r0
            r0 = r305
            boolean r0 = r0.A09
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L45
            X.25D r0 = X.25D.A0C
            r305 = r0
            r0 = r303
            int r0 = r0.A00
            r306 = r0
            r0 = r305
            int r0 = r0._mask
            r302 = r0
            r0 = r306
            r1 = r302
            r0 = r0 & r1
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L49
        L45:
            r0 = r304
            r0.close()
        L49:
            r0 = 0
            r302 = r0
            r0 = 0
            r305 = r0
            r0 = r303
            r1 = 0
            r0.A04 = r1
        L53:
            return
        L54:
            r0 = r301
            r303 = r0
            r0 = r301
            X.42U r0 = (X.42U) r0
            r303 = r0
            r0 = r303
            java.io.InputStream r0 = r0.A04
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L53
            r0 = r303
            X.3sO r0 = r0.A0N
            r305 = r0
            r0 = r305
            boolean r0 = r0.A09
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L90
            X.25D r0 = X.25D.A0C
            r305 = r0
            r0 = r303
            int r0 = r0.A00
            r306 = r0
            r0 = r305
            int r0 = r0._mask
            r302 = r0
            r0 = r306
            r1 = r302
            r0 = r0 & r1
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L94
        L90:
            r0 = r304
            r0.close()
        L94:
            r0 = r303
            r1 = 0
            r0.A04 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42V.A2L():void");
    }

    public void A2M() {
        this.A0O.A07();
        char[] cArr = this.A0L;
        if (cArr != null) {
            this.A0L = null;
            3sO r0 = this.A0N;
            char[] cArr2 = r0.A05;
            if (cArr != cArr2 && cArr.length < cArr2.length) {
                throw AnonymousClass001.A0L("Trying to release buffer smaller than original");
            }
            r0.A05 = null;
            r0.A08.A01.set(3, cArr);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0021, code lost:
    
        if (r306 != r0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A2N() {
        /*
            Method dump skipped, instructions count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42V.A2N():void");
    }

    public void A2P(int i, char c) {
        C42b c42b = this.A0E;
        Character valueOf = Character.valueOf((char) i);
        Character valueOf2 = Character.valueOf(c);
        String A04 = c42b.A04();
        3sN A2I = A2I();
        int i2 = c42b.A01;
        int i3 = c42b.A00;
        long j = -1;
        A2C(String.format("Unexpected close marker '%s': expected '%c' (for %s starting at %s)", valueOf, valueOf2, A04, new 4DN(A2I, i2, i3, j, j)));
        throw 0Q8.createAndThrow();
    }

    public void A2Q(int i, String str) {
        if ((((AbstractC01033pi) this).A00 & 25D.A09._mask) == 0 || i > 32) {
            A2C(0Pz.A0v("Illegal unquoted character (", C42W.A0x((char) i), "): has to be escaped using backslash to be included in ", str));
            throw 0Q8.createAndThrow();
        }
    }

    public void A2R(C24f c24f) {
        A2C(String.format(1BJ.A00(891), c24f._name, Character.valueOf(c24f._paddingChar)));
        throw 0Q8.createAndThrow();
    }
}
