package X;

import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: X.42W, reason: invalid class name */
/* loaded from: 42W.class */
public abstract class C42W extends AbstractC01033pi {
    public static final BigDecimal A01;
    public static final BigDecimal A02;
    public static final BigDecimal A03;
    public static final BigDecimal A04;
    public static final BigInteger A05;
    public static final BigInteger A06;
    public static final BigInteger A07;
    public static final BigInteger A08;
    public static final byte[] A09 = new byte[0];
    public C42h A00;

    static {
        BigInteger valueOf = BigInteger.valueOf(2147483648L);
        A07 = valueOf;
        BigInteger valueOf2 = BigInteger.valueOf(2147483647L);
        A05 = valueOf2;
        BigInteger valueOf3 = BigInteger.valueOf(Long.MIN_VALUE);
        A08 = valueOf3;
        BigInteger valueOf4 = BigInteger.valueOf(Long.MAX_VALUE);
        A06 = valueOf4;
        A04 = new BigDecimal(valueOf3);
        A02 = new BigDecimal(valueOf4);
        A03 = new BigDecimal(valueOf);
        A01 = new BigDecimal(valueOf2);
    }

    public static final String A0x(int i) {
        StringBuilder sb;
        char c = (char) i;
        if (Character.isISOControl(c)) {
            sb = AnonymousClass001.A0k();
            sb.append("(CTRL-CHAR, code ");
        } else {
            sb = new StringBuilder();
            sb.append("'");
            sb.append(c);
            sb.append("' (code ");
            if (i > 255) {
                sb.append(i);
                sb.append(" / 0x");
                sb.append(Integer.toHexString(i));
                sb.append(")");
                return sb.toString();
            }
        }
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    public static final void A0y() {
        throw AnonymousClass001.A0T("Internal error: this code path should never get executed");
    }

    @Override // X.AbstractC01033pi
    public AbstractC01033pi A20() {
        C42h c42h = this.A00;
        if (c42h != C42h.A06 && c42h != C42h.A05) {
            return this;
        }
        int i = 1;
        while (true) {
            C42h A1K = A1K();
            if (A1K == null) {
                A23();
                return this;
            }
            if (A1K._isStructStart) {
                i++;
            } else if (A1K._isStructEnd) {
                i--;
                if (i == 0) {
                    return this;
                }
            } else if (A1K == C42h.A04) {
                throw AbstractC01033pi.A04(this, String.format("Not enough content available for `skipChildren()`: non-blocking parser? (%s)", AnonymousClass001.A0Y(this)));
            }
        }
    }

    public int A21(int i) {
        C42h c42h = this.A00;
        if (c42h == C42h.A0B || c42h == C42h.A0A) {
            return A15();
        }
        if (c42h == null) {
            return 0;
        }
        int i2 = c42h._id;
        if (i2 == 6) {
            String A1Z = A1Z();
            if ("null".equals(A1Z)) {
                return 0;
            }
            return C42j.A02(A1Z, 0);
        }
        switch (i2) {
            case 9:
                return 1;
            case 12:
                Object A1R = A1R();
                if (A1R instanceof Number) {
                    return ((Number) A1R).intValue();
                }
                return 0;
            default:
                return 0;
        }
    }

    public String A22(String str) {
        String str2 = null;
        C42h c42h = this.A00;
        if (c42h != C42h.A0C) {
            if (c42h == C42h.A03) {
                str2 = A1Y();
            } else if (c42h != null && c42h != C42h.A09) {
                if (!c42h._isScalar) {
                    return null;
                }
            }
            return str2;
        }
        return A1Z();
    }

    public void A23() {
        C42V c42v = (C42V) this;
        C42b c42b = c42v.A0E;
        int i = ((3sX) c42b).A01;
        if (i == 0) {
            return;
        }
        String str = i == 1 ? "Array" : "Object";
        3sN A2I = c42v.A2I();
        int i2 = c42b.A01;
        int i3 = c42b.A00;
        long j = -1;
        c42v.A29(null, String.format(": expected close marker for %s (start marker at %s)", str, new 4DN(A2I, i2, i3, j, j)));
        throw 0Q8.createAndThrow();
    }

    public void A24() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(" in ");
        A0k.append(this.A00);
        A29(this.A00, A0k.toString());
        throw 0Q8.createAndThrow();
    }

    public void A25(int i) {
        A2C(0Pz.A0j("Illegal character (", A0x((char) i), "): only regular white space (\\r, \\n, \\t) is allowed between tokens"));
        throw 0Q8.createAndThrow();
    }

    public void A26(int i, String str) {
        if (i < 0) {
            A24();
        } else {
            String format = String.format("Unexpected character (%s)", A0x(i));
            if (str != null) {
                format = 0Pz.A0j(format, ": ", str);
            }
            A2C(format);
        }
        throw 0Q8.createAndThrow();
    }

    public void A27(int i, String str) {
        A2C(0Pz.A0j(String.format("Unexpected character (%s) in numeric value", A0x(i)), ": ", str));
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A28(C24f c24f, 3DX r303, String str) {
        try {
            c24f.A07(r303, str);
        } catch (IllegalArgumentException unused) {
            A2C(c24f.getMessage());
            throw 0Q8.createAndThrow();
        }
    }

    public void A29(final C42h c42h, String str) {
        final String A0W = 0Pz.A0W("Unexpected end-of-input", str);
        throw new 5DK(this, c42h, A0W) { // from class: X.4Qd
            public static final long serialVersionUID = 1;
            public final C42h _token;

            {
                this._token = c42h;
            }
        };
    }

    public void A2A(C42h c42h, String str) {
        int length = str.length();
        if (length >= 1000) {
            if (str.startsWith("-")) {
                length--;
            }
            str = String.format("[Integer with %d digits]", AnonymousClass001.A1a(length));
        }
        throw new C4Qf(this, c42h, Integer.TYPE, String.format("Numeric value (%s) out of range of int (%d - %s)", str, Integer.valueOf((-1) << (-1)), Integer.valueOf((-1) >>> 1)));
    }

    public void A2B(String str) {
        C42h c42h = this.A00;
        int length = str.length();
        if (length >= 1000) {
            if (str.startsWith("-")) {
                length--;
            }
            str = String.format("[Integer with %d digits]", AnonymousClass001.A1a(length));
        }
        throw new C4Qf(this, c42h, Long.TYPE, String.format("Numeric value (%s) out of range of long (%d - %s)", str, Long.MIN_VALUE, Long.MAX_VALUE));
    }

    public final void A2C(String str) {
        5DK r0 = new 5DK(this, str);
        ((4EJ) r0)._requestPayload = null;
        throw r0;
    }

    @Override // X.AbstractC01033pi, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C42V c42v = (C42V) this;
        if (c42v.A0H) {
            return;
        }
        c42v.A04 = Math.max(c42v.A04, c42v.A03);
        c42v.A0H = true;
        try {
            c42v.A2L();
        } finally {
            c42v.A2M();
        }
    }
}
