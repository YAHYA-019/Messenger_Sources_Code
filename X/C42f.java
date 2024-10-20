package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.io.Reader;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.42f, reason: invalid class name */
/* loaded from: 42f.class */
public final class C42f extends C42V {
    public int A00;
    public int A01;
    public long A02;
    public AnonymousClass245 A03;
    public Reader A04;
    public boolean A05;
    public char[] A06;
    public boolean A07;
    public final int A08;
    public final 25O A09;
    public static final int A0D = 25D.A08._mask;
    public static final int A0C = 25D.A06._mask;
    public static final int A0I = 25D.A05._mask;
    public static final int A0A = 25D.A04._mask;
    public static final int A0G = 25D.A07._mask;
    public static final int A0H = 25D.A0A._mask;
    public static final int A0F = 25D.A02._mask;
    public static final int A0B = 25D.A0B._mask;
    public static final int[] A0E = 25N.A02;

    public C42f(AnonymousClass245 anonymousClass245, 3sO r303, 25O r304, Reader reader, int i) {
        super(r303, i);
        this.A04 = reader;
        3sO.A00(r303.A06);
        char[] A01 = r303.A08.A01(0, 0);
        r303.A06 = A01;
        this.A06 = A01;
        super.A04 = 0;
        super.A03 = 0;
        this.A03 = anonymousClass245;
        this.A09 = r304;
        this.A08 = r304.A0A;
        this.A07 = true;
    }

    public C42f(AnonymousClass245 anonymousClass245, 3sO r303, 25O r304, char[] cArr, int i, int i2) {
        super(r303, i);
        this.A04 = null;
        this.A03 = anonymousClass245;
        this.A06 = cArr;
        super.A04 = 0;
        super.A03 = i2;
        super.A02 = 0;
        this.A0A = 0L;
        this.A09 = r304;
        this.A08 = r304.A0A;
        this.A07 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005a, code lost:
    
        if (r306 == ':') goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0094, code lost:
    
        if (r306 > ' ') goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int A00(X.C42f r301) {
        /*
            Method dump skipped, instructions count: 189
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42f.A00(X.42f):int");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c7 A[EDGE_INSN: B:39:0x00c7->B:40:0x00c7 BREAK  A[LOOP:0: B:24:0x0068->B:35:0x0068], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00ab -> B:23:0x0068). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x015f -> B:23:0x0068). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int A01(X.C42f r301) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42f.A01(X.42f):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0165, code lost:
    
        return r306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007d, code lost:
    
        if (((X.C42V) r301).A04 < ((X.C42V) r301).A03) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0086, code lost:
    
        if (A0a(r301) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009a, code lost:
    
        throw X.AbstractC01033pi.A04(r301, X.AbstractC01033pi.A05(r301.A0E, "Unexpected end-of-input within/between "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009b, code lost:
    
        r0 = r301.A06;
        r0 = ((X.C42V) r301).A04;
        r0 = r0 + 1;
        ((X.C42V) r301).A04 = r0;
        r306 = r0[r0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bd, code lost:
    
        if (r306 <= ' ') goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f8, code lost:
    
        if (r306 >= ' ') goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0101, code lost:
    
        if (r306 != '\n') goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0113, code lost:
    
        if (r306 != '\r') goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0123, code lost:
    
        if (r306 == '\t') goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0116, code lost:
    
        r301.A0P();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0104, code lost:
    
        X.AbstractC01033pi.A06(r301, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00c6, code lost:
    
        if (r306 != '/') goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00d6, code lost:
    
        if (r306 != '#') goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00eb, code lost:
    
        if ((((X.AbstractC01033pi) r301).A00 & X.C42f.A0B) == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00ee, code lost:
    
        r301.A0O();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00c9, code lost:
    
        r301.A0N();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int A0A(X.C42f r301, int r302) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42f.A0A(X.42f, int):int");
    }

    private final int A0B(boolean z) {
        while (true) {
            if (super.A04 >= super.A03 && !A0a(this)) {
                A29(null, AbstractC01033pi.A05(this.A0E, " within/between "));
                break;
            }
            char[] cArr = this.A06;
            int i = super.A04;
            int i2 = i + 1;
            super.A04 = i2;
            char c = cArr[i];
            if (c > ' ') {
                if (c == '/') {
                    A0N();
                } else if (c == '#' && (((AbstractC01033pi) this).A00 & A0B) != 0) {
                    A0O();
                } else {
                    if (z) {
                        return c;
                    }
                    if (c != ':') {
                        A26(c, "was expecting a colon to separate field name and value");
                        break;
                    }
                    z = true;
                }
            } else if (c >= ' ') {
                continue;
            } else if (c == '\n') {
                AbstractC01033pi.A06(this, i2);
            } else if (c == '\r') {
                A0P();
            } else if (c != '\t') {
                A25(c);
                break;
            }
        }
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b2, code lost:
    
        r315 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final X.C42h A0C(int r302, int r303, int r304, int r305, boolean r306) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42f.A0C(int, int, int, int, boolean):X.42h");
    }

    private C42h A0D(int i, boolean z) {
        String str;
        if (i == 73) {
            if (super.A04 < super.A03 || A0a(this)) {
                i = AbstractC01033pi.A02(this);
                double d = (-1.0d) / 0.0d;
                if (i == 78) {
                    str = z ? "-INF" : "+INF";
                } else if (i == 110) {
                    str = z ? "-Infinity" : "+Infinity";
                }
                A0Y(this, str, 3);
                if ((((AbstractC01033pi) this).A00 & A0I) != 0) {
                    if (!z) {
                        d = 1.0d / 0.0d;
                    }
                    return A2H(str, d);
                }
                A2C(0Pz.A0j("Non-standard token '", str, "': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"));
            } else {
                A29(C42h.A0B, " in a Number value");
            }
            throw 0Q8.createAndThrow();
        }
        A27(i, "expected digit (0-9) to follow minus sign, for valid numeric value");
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00af, code lost:
    
        if (r0 <= '9') goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x045d, code lost:
    
        if (r316 == '0') goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x046b, code lost:
    
        if (r320 < r301.A03) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0477, code lost:
    
        if (A0a(r301) == false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x047a, code lost:
    
        r0 = r301.A06;
        r0 = r301.A04;
        r316 = r0[r0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0493, code lost:
    
        if (r316 < '0') goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x049a, code lost:
    
        if (r316 > '9') goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x049d, code lost:
    
        r320 = r0 + 1;
        r301.A04 = r320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x04ae, code lost:
    
        if (r316 == '0') goto L157;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final X.C42h A0E(int r302, boolean r303) {
        /*
            Method dump skipped, instructions count: 1361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42f.A0E(int, boolean):X.42h");
    }

    public static final C42h A0F(C42f c42f) {
        C42b A07;
        c42f.A0I = false;
        C42h c42h = c42f.A0D;
        c42f.A0D = null;
        if (c42h != C42h.A05) {
            if (c42h == C42h.A06) {
                A07 = c42f.A0E.A07(((C42V) c42f).A09, ((C42V) c42f).A08);
            }
            ((C42W) c42f).A00 = c42h;
            return c42h;
        }
        A07 = c42f.A0E.A06(((C42V) c42f).A09, ((C42V) c42f).A08);
        c42f.A0E = A07;
        ((C42W) c42f).A00 = c42h;
        return c42h;
    }

    public static final C42h A0G(C42f c42f) {
        if ((((AbstractC01033pi) c42f).A00 & 3En.A01._mappedFeature._mask) != 0) {
            int i = ((C42V) c42f).A04;
            return c42f.A0C(46, i - 1, i, 0, false);
        }
        A0I(c42f, 46);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
    
        if (r0 != 'E') goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a5, code lost:
    
        r0 = r0 - 1;
        ((X.C42V) r301).A04 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00be, code lost:
    
        if (((X.3sX) r301.A0E).A01 != 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c1, code lost:
    
        r301.A0Q(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c7, code lost:
    
        r301.A0O.A0A(r301.A06, r0, r0 - r0);
        r301.A0J = true;
        ((X.C42V) r301).A05 = r311;
        ((X.C42V) r301).A06 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f7, code lost:
    
        return X.C42h.A0B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a2, code lost:
    
        if (r0 != '.') goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final X.C42h A0H(X.C42f r301) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42f.A0H(X.42f):X.42h");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        if (r302 != 44) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00bd, code lost:
    
        if (((X.3sX) r301.A0E).A01 == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d2, code lost:
    
        if ((((X.AbstractC01033pi) r301).A00 & X.C42f.A0A) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d5, code lost:
    
        ((X.C42V) r301).A04--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e5, code lost:
    
        return X.C42h.A09;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ad, code lost:
    
        if (((X.3sX) r301.A0E).A01 == 1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.C42h A0I(X.C42f r301, int r302) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42f.A0I(X.42f, int):X.42h");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006b, code lost:
    
        if (r0 != 'E') goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008d, code lost:
    
        r0 = r0 - 1;
        ((X.C42V) r301).A04 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a8, code lost:
    
        if (((X.3sX) r301.A0E).A01 != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
    
        r301.A0Q(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b1, code lost:
    
        r301.A0O.A0A(r301.A06, r0, r0 - r0);
        r301.A0J = false;
        ((X.C42V) r301).A05 = r308;
        ((X.C42V) r301).A06 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e2, code lost:
    
        return X.C42h.A0B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008a, code lost:
    
        if (r0 != '.') goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final X.C42h A0J(X.C42f r301, int r302) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42f.A0J(X.42f, int):X.42h");
    }

    private String A0K(int i, int i2, int i3) {
        3sM r0 = this.A0O;
        r0.A0A(this.A06, i, super.A04 - i);
        char[] A0E2 = r0.A0E();
        int i4 = r0.A00;
        while (true) {
            int i5 = i4;
            while (true) {
                int i6 = i5;
                if (super.A04 >= super.A03 && !A0a(this)) {
                    A29(C42h.A03, " in field name");
                    throw 0Q8.createAndThrow();
                }
                char[] cArr = this.A06;
                int i7 = super.A04;
                super.A04 = i7 + 1;
                char c = cArr[i7];
                if (c <= '\\') {
                    if (c == '\\') {
                        c = A2D();
                    } else if (c <= i3) {
                        if (c == i3) {
                            r0.A00 = i6;
                            char[] A0F2 = r0.A0F();
                            int i8 = r0.A02;
                            if (i8 < 0) {
                                i8 = 0;
                            }
                            return this.A09.A01(A0F2, i8, r0.A04(), i2);
                        }
                        if (c < ' ') {
                            A2Q(c, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                        }
                    }
                }
                i2 = (i2 * 33) + c;
                i4 = i6 + 1;
                A0E2[i6] = c;
                if (i4 >= A0E2.length) {
                    A0E2 = r0.A0D();
                    i5 = 0;
                }
            }
        }
    }

    public static final String A0L(C42f c42f) {
        int i = ((C42V) c42f).A04;
        int i2 = c42f.A08;
        int[] iArr = A0E;
        while (true) {
            if (i >= ((C42V) c42f).A03) {
                break;
            }
            char[] cArr = c42f.A06;
            char c = cArr[i];
            if (c >= 256 || iArr[c] == 0) {
                i2 = (i2 * 33) + c;
                i++;
            } else if (c == '\"') {
                ((C42V) c42f).A04 = i + 1;
                return c42f.A09.A01(cArr, i, i - i, i2);
            }
        }
        ((C42V) c42f).A04 = i;
        return c42f.A0K(i, i2, 34);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x010c, code lost:
    
        if (r316 < r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x010f, code lost:
    
        r0 = r301.A06;
        r0 = r0[r316];
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x011e, code lost:
    
        if (r0 >= 256) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0129, code lost:
    
        if (r0[r0] == 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x018f, code lost:
    
        r310 = (r310 * 33) + r0;
        r316 = r316 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01a2, code lost:
    
        if (r316 < r0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x012c, code lost:
    
        r0 = ((X.C42V) r301).A04 - 1;
        ((X.C42V) r301).A04 = r316;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0152, code lost:
    
        return r301.A09.A01(r0, r0, r316 - r0, r310);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x015c, code lost:
    
        if (java.lang.Character.isJavaIdentifierPart(r0) != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x015f, code lost:
    
        r0 = ((X.C42V) r301).A04 - 1;
        ((X.C42V) r301).A04 = r316;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x018e, code lost:
    
        return r301.A09.A01(r301.A06, r0, r316 - r0, r310);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01a5, code lost:
    
        r0 = ((X.C42V) r301).A04 - 1;
        ((X.C42V) r301).A04 = r316;
        r0 = r301.A0O;
        r0.A0A(r301.A06, r0, r316 - r0);
        r311 = r0.A0E();
        r307 = r0.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01dd, code lost:
    
        r0 = r307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01e1, code lost:
    
        r308 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01ef, code lost:
    
        if (((X.C42V) r301).A04 < ((X.C42V) r301).A03) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01fa, code lost:
    
        if (A0a(r301) != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01fd, code lost:
    
        r0.A00 = r308;
        r0 = r0.A0F();
        r312 = r0.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0214, code lost:
    
        if (r312 >= 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0217, code lost:
    
        r312 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x022e, code lost:
    
        return r301.A09.A01(r0, r312, r0.A04(), r310);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x022f, code lost:
    
        r0 = r301.A06[((X.C42V) r301).A04];
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0244, code lost:
    
        if (r0 >= 256) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x024f, code lost:
    
        if (r0[r0] == 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0263, code lost:
    
        ((X.C42V) r301).A04++;
        r310 = (r310 * 33) + r0;
        r307 = r308 + 1;
        r311[r308] = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x028f, code lost:
    
        if (r307 < r311.length) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0292, code lost:
    
        r311 = r0.A0D();
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x025d, code lost:
    
        if (java.lang.Character.isJavaIdentifierPart(r0) != false) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String A0M(X.C42f r301, int r302) {
        /*
            Method dump skipped, instructions count: 691
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42f.A0M(X.42f, int):java.lang.String");
    }

    private void A0N() {
        if ((((AbstractC01033pi) this).A00 & A0F) == 0) {
            A26(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        } else {
            if (super.A04 < super.A03 || A0a(this)) {
                char A02 = AbstractC01033pi.A02(this);
                if (A02 != '/') {
                    if (A02 == '*') {
                        while (true) {
                            if (super.A04 >= super.A03 && !A0a(this)) {
                                break;
                            }
                            char[] cArr = this.A06;
                            int i = super.A04;
                            int i2 = i + 1;
                            super.A04 = i2;
                            char c = cArr[i];
                            if (c <= '*') {
                                if (c == '*') {
                                    if (i2 >= super.A03 && !A0a(this)) {
                                        break;
                                    }
                                    char[] cArr2 = this.A06;
                                    int i3 = super.A04;
                                    if (cArr2[i3] == '/') {
                                        super.A04 = i3 + 1;
                                        return;
                                    }
                                } else if (c >= ' ') {
                                    continue;
                                } else if (c == '\n') {
                                    AbstractC01033pi.A06(this, i2);
                                } else if (c == '\r') {
                                    A0P();
                                } else if (c != '\t') {
                                    A25(c);
                                    break;
                                }
                            }
                        }
                    } else {
                        A26(A02, "was expecting either '*' or '/' for a comment");
                    }
                } else {
                    A0O();
                    return;
                }
            }
            A29(null, " in a comment");
        }
        throw 0Q8.createAndThrow();
    }

    private void A0O() {
        while (true) {
            if (super.A04 >= super.A03 && !A0a(this)) {
                return;
            }
            char[] cArr = this.A06;
            int i = super.A04;
            int i2 = i + 1;
            super.A04 = i2;
            char c = cArr[i];
            if (c < ' ') {
                if (c == '\n') {
                    AbstractC01033pi.A06(this, i2);
                    return;
                } else if (c == '\r') {
                    A0P();
                    return;
                } else if (c != '\t') {
                    A25(c);
                    throw 0Q8.createAndThrow();
                }
            }
        }
    }

    private final void A0P() {
        if (super.A04 < super.A03 || A0a(this)) {
            char[] cArr = this.A06;
            int i = super.A04;
            if (cArr[i] == '\n') {
                super.A04 = i + 1;
            }
        }
        super.A01++;
        super.A02 = super.A04;
    }

    private final void A0Q(int i) {
        int i2 = super.A04 + 1;
        super.A04 = i2;
        if (i != 9) {
            if (i == 10) {
                AbstractC01033pi.A06(this, i2);
            } else if (i == 13) {
                A0P();
            } else if (i != 32) {
                A26(i, "Expected space separating root-level values");
                throw 0Q8.createAndThrow();
            }
        }
    }

    public static final void A0R(C42f c42f) {
        int i = ((C42V) c42f).A04;
        int i2 = ((C42V) c42f).A03;
        if (i < i2) {
            int[] iArr = A0E;
            while (true) {
                char[] cArr = c42f.A06;
                char c = cArr[i];
                if (c >= 256 || iArr[c] == 0) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                } else if (c == '\"') {
                    c42f.A0O.A0A(cArr, i, i - i);
                    ((C42V) c42f).A04 = i + 1;
                    return;
                }
            }
        }
        3sM r0 = c42f.A0O;
        char[] cArr2 = c42f.A06;
        int i3 = i - i;
        r0.A08 = null;
        r0.A02 = -1;
        r0.A01 = 0;
        r0.A04 = null;
        r0.A09 = null;
        if (r0.A06) {
            3sM.A00(r0);
        } else if (r0.A07 == null) {
            r0.A07 = 3sM.A03(r0, i3);
        }
        r0.A03 = 0;
        r0.A00 = 0;
        r0.A09(cArr2, i, i3);
        ((C42V) c42f).A04 = i;
        char[] A0E2 = r0.A0E();
        int i4 = r0.A00;
        int i5 = i4;
        int[] iArr2 = A0E;
        while (true) {
            if (((C42V) c42f).A04 >= ((C42V) c42f).A03 && !A0a(c42f)) {
                c42f.A29(C42h.A0C, ": was expecting closing quote for a string value");
                throw 0Q8.createAndThrow();
            }
            char[] cArr3 = c42f.A06;
            int i6 = ((C42V) c42f).A04;
            ((C42V) c42f).A04 = i6 + 1;
            char c2 = cArr3[i6];
            if (c2 < 256 && iArr2[c2] != 0) {
                if (c2 == '\"') {
                    r0.A00 = i4;
                    return;
                } else if (c2 == '\\') {
                    c2 = c42f.A2D();
                } else if (c2 < ' ') {
                    c42f.A2Q(c2, "string value");
                }
            }
            if (i4 >= A0E2.length) {
                A0E2 = r0.A0D();
                i5 = 0;
            }
            i4 = i5 + 1;
            A0E2[i5] = c2;
            i5 = i4;
        }
    }

    public static final void A0S(C42f c42f) {
        int i;
        char c;
        int i2 = ((C42V) c42f).A04;
        if (i2 + 4 < ((C42V) c42f).A03) {
            char[] cArr = c42f.A06;
            if (cArr[i2] == 'a') {
                int i3 = i2 + 1;
                if (cArr[i3] == 'l') {
                    int i4 = i3 + 1;
                    if (cArr[i4] == 's') {
                        int i5 = i4 + 1;
                        if (cArr[i5] == 'e' && ((c = cArr[(i = i5 + 1)]) < '0' || c == ']' || c == '}')) {
                            ((C42V) c42f).A04 = i;
                            return;
                        }
                    }
                }
            }
        }
        A0Y(c42f, "false", 1);
    }

    public static final void A0T(C42f c42f) {
        int i;
        char c;
        int i2 = ((C42V) c42f).A04;
        if (i2 + 3 < ((C42V) c42f).A03) {
            char[] cArr = c42f.A06;
            if (cArr[i2] == 'u') {
                int i3 = i2 + 1;
                if (cArr[i3] == 'l') {
                    int i4 = i3 + 1;
                    if (cArr[i4] == 'l' && ((c = cArr[(i = i4 + 1)]) < '0' || c == ']' || c == '}')) {
                        ((C42V) c42f).A04 = i;
                        return;
                    }
                }
            }
        }
        A0Y(c42f, "null", 1);
    }

    public static final void A0U(C42f c42f) {
        int i;
        char c;
        int i2 = ((C42V) c42f).A04;
        if (i2 + 3 < ((C42V) c42f).A03) {
            char[] cArr = c42f.A06;
            if (cArr[i2] == 'r') {
                int i3 = i2 + 1;
                if (cArr[i3] == 'u') {
                    int i4 = i3 + 1;
                    if (cArr[i4] == 'e' && ((c = cArr[(i = i4 + 1)]) < '0' || c == ']' || c == '}')) {
                        ((C42V) c42f).A04 = i;
                        return;
                    }
                }
            }
        }
        A0Y(c42f, "true", 1);
    }

    public static final void A0V(C42f c42f) {
        c42f.A05 = false;
        int i = ((C42V) c42f).A04;
        int i2 = ((C42V) c42f).A03;
        char[] cArr = c42f.A06;
        while (true) {
            if (i >= i2) {
                ((C42V) c42f).A04 = i;
                if (!A0a(c42f)) {
                    c42f.A29(C42h.A0C, ": was expecting closing quote for a string value");
                    throw 0Q8.createAndThrow();
                }
                i = ((C42V) c42f).A04;
                i2 = ((C42V) c42f).A03;
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c <= '\\') {
                if (c == '\\') {
                    ((C42V) c42f).A04 = i3;
                    c42f.A2D();
                    i = ((C42V) c42f).A04;
                    i2 = ((C42V) c42f).A03;
                } else if (c <= '\"') {
                    if (c == '\"') {
                        ((C42V) c42f).A04 = i3;
                        return;
                    } else if (c < ' ') {
                        ((C42V) c42f).A04 = i3;
                        c42f.A2Q(c, "string value");
                    }
                }
            }
            i = i3;
        }
    }

    public static final void A0W(C42f c42f) {
        int i = ((C42V) c42f).A04;
        c42f.A0C = c42f.A0A + i;
        ((C42V) c42f).A09 = ((C42V) c42f).A01;
        ((C42V) c42f).A08 = i - ((C42V) c42f).A02;
    }

    public static void A0X(C42f c42f, int i) {
        C42h c42h;
        if (i == 93) {
            A0W(c42f);
            C42b c42b = c42f.A0E;
            if (((3sX) c42b).A01 != 1) {
                c42f.A2P(i, '}');
                throw 0Q8.createAndThrow();
            }
            c42b.A03 = null;
            c42f.A0E = c42b.A06;
            c42h = C42h.A01;
            ((C42W) c42f).A00 = c42h;
        }
        if (i == 125) {
            A0W(c42f);
            C42b c42b2 = c42f.A0E;
            if (((3sX) c42b2).A01 != 2) {
                c42f.A2P(i, ']');
                throw 0Q8.createAndThrow();
            }
            c42b2.A03 = null;
            c42f.A0E = c42b2.A06;
            c42h = C42h.A02;
            ((C42W) c42f).A00 = c42h;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0058, code lost:
    
        if (r301.A06[((X.C42V) r301).A04] != r302.charAt(r303)) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005b, code lost:
    
        r305 = ((X.C42V) r301).A04 + 1;
        ((X.C42V) r301).A04 = r305;
        r303 = r303 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0073, code lost:
    
        if (r303 < r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0080, code lost:
    
        if (r305 < ((X.C42V) r301).A03) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008b, code lost:
    
        if (A0a(r301) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d5, code lost:
    
        r306 = r301.A06[((X.C42V) r301).A04];
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00f0, code lost:
    
        if (r306 < '0') goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00fb, code lost:
    
        if (r306 == ']') goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0106, code lost:
    
        if (r306 == '}') goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0113, code lost:
    
        if (java.lang.Character.isJavaIdentifierPart(r306) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x001f, code lost:
    
        if ((r305 + r0) >= ((X.C42V) r301).A03) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a7, code lost:
    
        if (r301.A06[r306] != r302.charAt(r303)) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00aa, code lost:
    
        r306 = ((X.C42V) r301).A04 + 1;
        ((X.C42V) r301).A04 = r306;
        r303 = r303 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c2, code lost:
    
        if (r303 < r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c5, code lost:
    
        r306 = r301.A06[r306];
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002c, code lost:
    
        if (r305 < ((X.C42V) r301).A03) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0037, code lost:
    
        if (A0a(r301) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0116, code lost:
    
        r301.A0Z(r302.substring(0, r303), r301.A2K());
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x012f, code lost:
    
        throw X.0Q8.createAndThrow();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A0Y(X.C42f r301, java.lang.String r302, int r303) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42f.A0Y(X.42f, java.lang.String, int):void");
    }

    private void A0Z(String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            if (super.A04 >= super.A03 && !A0a(this)) {
                break;
            }
            char c = this.A06[super.A04];
            if (!Character.isJavaIdentifierPart(c)) {
                break;
            }
            super.A04++;
            sb.append(c);
            if (sb.length() >= 256) {
                sb.append("...");
                break;
            }
        }
        5DK r0 = new 5DK(this, String.format("Unrecognized token '%s': was expecting %s", sb, str2));
        ((4EJ) r0)._requestPayload = null;
        throw r0;
    }

    public static boolean A0a(C42f c42f) {
        Reader reader = c42f.A04;
        if (reader == null) {
            return false;
        }
        char[] cArr = c42f.A06;
        int read = reader.read(cArr, 0, cArr.length);
        if (read <= 0) {
            c42f.A2L();
            if (read == 0) {
                throw new IOException(0Pz.A0T("Reader returned 0 characters when trying to read ", ((C42V) c42f).A03));
            }
            return false;
        }
        int i = ((C42V) c42f).A03;
        long j = i;
        c42f.A0A += j;
        ((C42V) c42f).A02 -= i;
        c42f.A02 -= j;
        ((C42V) c42f).A04 = 0;
        ((C42V) c42f).A03 = read;
        return true;
    }

    @Override // X.AbstractC01033pi
    public final String A1z() {
        C42h c42h = ((C42W) this).A00;
        if (c42h != C42h.A0C) {
            return c42h == C42h.A03 ? A1Y() : super.A22(null);
        }
        if (this.A05) {
            this.A05 = false;
            A0R(this);
        }
        return this.A0O.A06();
    }

    @Override // X.C42W
    public final String A22(String str) {
        C42h c42h = ((C42W) this).A00;
        if (c42h != C42h.A0C) {
            return c42h == C42h.A03 ? A1Y() : super.A22(null);
        }
        if (this.A05) {
            this.A05 = false;
            A0R(this);
        }
        return this.A0O.A06();
    }

    @Override // X.C42V
    public void A2M() {
        char[] cArr;
        25O r0;
        super.A2M();
        25O r02 = this.A09;
        if ((!r02.A06) && (r0 = r02.A0B) != null && r02.A05) {
            25S r305 = new 25S(r02);
            int i = r305.A01;
            AtomicReference atomicReference = r0.A0C;
            25S r03 = (25S) atomicReference.get();
            if (i != r03.A01) {
                if (i > 12000) {
                    r305 = new 25S(new 25Q[32], new String[64]);
                }
                1MG.A00(atomicReference, r03, r305);
            }
            r02.A06 = true;
        }
        if (!this.A07 || (cArr = this.A06) == null) {
            return;
        }
        this.A06 = null;
        3sO r04 = this.A0N;
        char[] cArr2 = r04.A06;
        if (cArr != cArr2 && cArr.length < cArr2.length) {
            throw AnonymousClass001.A0L("Trying to release buffer smaller than original");
        }
        r04.A06 = null;
        r04.A08.A01.set(0, cArr);
    }
}
