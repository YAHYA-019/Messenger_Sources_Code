package X;

import com.facebook.acra.constants.ActionId;
import java.io.Closeable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;

/* renamed from: X.3pi, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3pi.class */
public abstract class AbstractC01033pi implements Closeable {
    public static final C27Z A01 = C27Z.A00(42X.values());
    public int A00;

    public static char A02(C42f c42f) {
        char[] cArr = c42f.A06;
        int i = ((C42V) c42f).A04;
        ((C42V) c42f).A04 = i + 1;
        return cArr[i];
    }

    public static int A03(42U r301) {
        byte[] bArr = r301.A06;
        int i = r301.A04;
        r301.A04 = i + 1;
        return bArr[i] & 255;
    }

    public static 5DK A04(AbstractC01033pi abstractC01033pi, String str) {
        5DK r0 = new 5DK(abstractC01033pi, str);
        ((4EJ) r0)._requestPayload = null;
        return r0;
    }

    public static String A05(3sX r301, String str) {
        return 0Pz.A0j(str, r301.A04(), " entries");
    }

    public static void A06(C42V c42v, int i) {
        c42v.A01++;
        c42v.A02 = i;
    }

    public static void A07(C42f c42f) {
        if (((C42V) c42f).A04 < ((C42V) c42f).A03 || C42f.A0a(c42f)) {
            return;
        }
        c42f.A24();
        throw 0Q8.createAndThrow();
    }

    public static void A08(42U r301) {
        if (r301.A04 >= r301.A03) {
            42U.A0g(r301);
        }
    }

    public static void A09(42U r301, int i) {
        if (i >= r301.A03) {
            42U.A0g(r301);
        }
    }

    public byte A0z() {
        int A15 = A15();
        if (A15 < -128 || A15 > 255) {
            throw new C4Qf(this, C42h.A0B, Byte.TYPE, String.format("Numeric value (%s) out of range of Java byte", A1Z()));
        }
        return (byte) A15;
    }

    public double A10() {
        double d;
        Number number;
        C42V c42v = (C42V) this;
        int i = c42v.A06;
        if ((i & 8) == 0) {
            if (i == 0) {
                C42V.A0v(c42v, 8);
            }
            int i2 = c42v.A06;
            if ((i2 & 8) == 0) {
                if ((i2 & 16) != 0) {
                    number = c42v.A0F;
                } else if ((i2 & 4) != 0) {
                    number = c42v.A0G;
                } else {
                    if ((i2 & 2) != 0) {
                        d = c42v.A0B;
                    } else {
                        if ((i2 & 1) == 0) {
                            C42W.A0y();
                            throw 0Q8.createAndThrow();
                        }
                        d = c42v.A07;
                    }
                    c42v.A00 = d;
                    c42v.A06 |= 8;
                }
                d = number.doubleValue();
                c42v.A00 = d;
                c42v.A06 |= 8;
            }
        }
        return c42v.A00;
    }

    public double A11() {
        return A12(0.0d);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001e. Please report as an issue. */
    public double A12(double d) {
        C42W c42w = (C42W) this;
        C42h c42h = c42w.A00;
        if (c42h != null) {
            switch (c42h._id) {
                case 6:
                    String A1Z = c42w.A1Z();
                    if (!"null".equals(A1Z)) {
                        String str = C42j.A01;
                        if (A1Z != null) {
                            String trim = A1Z.trim();
                            if (trim.length() != 0) {
                                try {
                                    return C42j.A00(trim);
                                } catch (NumberFormatException unused) {
                                    break;
                                }
                            }
                        }
                        return 0.0d;
                    }
                    break;
                case 7:
                case 8:
                    return c42w.A10();
                case 9:
                    return 1.0d;
                case 12:
                    Object A1R = c42w.A1R();
                    if (A1R instanceof Number) {
                        return ((Number) A1R).doubleValue();
                    }
                    break;
            }
        }
        return 0.0d;
    }

    public float A13() {
        return (float) A10();
    }

    public int A14() {
        C42h c42h = ((C42W) this).A00;
        if (c42h == null) {
            return 0;
        }
        return c42h._id;
    }

    public int A15() {
        C42V c42v = (C42V) this;
        int i = c42v.A06;
        if ((i & 1) == 0) {
            if (i == 0) {
                return c42v.A2E();
            }
            c42v.A2N();
        }
        return c42v.A07;
    }

    public int A16() {
        C42f c42f;
        C42h c42h;
        int i;
        if (!(this instanceof 42U)) {
            c42f = (C42f) this;
            c42h = ((C42W) c42f).A00;
            if (c42h == null) {
                return 0;
            }
            i = c42h._id;
            if (i != 5) {
                if (i == 6) {
                    if (c42f.A05) {
                        c42f.A05 = false;
                        C42f.A0R(c42f);
                    }
                }
                if (i != 7) {
                    return c42h._serializedChars.length;
                }
            }
            return c42f.A0E.A04.length();
        }
        c42f = (42U) this;
        c42h = ((C42W) c42f).A00;
        if (c42h == null) {
            return 0;
        }
        i = c42h._id;
        if (i != 5) {
            if (i == 6) {
                if (((42U) c42f).A05) {
                    ((42U) c42f).A05 = false;
                    42U.A0f(c42f);
                }
            }
            if (i != 7 && i != 8) {
                return c42h._serializedChars.length;
            }
        }
        return c42f.A0E.A04.length();
        return c42f.A0O.A04();
    }

    public int A17() {
        C42f c42f;
        int i;
        if (this instanceof 42U) {
            c42f = (42U) this;
            C42h c42h = ((C42W) c42f).A00;
            if (c42h == null) {
                return 0;
            }
            i = c42h._id;
            if (i == 6) {
                if (((42U) c42f).A05) {
                    ((42U) c42f).A05 = false;
                    42U.A0f(c42f);
                }
            }
            if (i != 7 && i != 8) {
                return 0;
            }
        } else {
            c42f = (C42f) this;
            C42h c42h2 = ((C42W) c42f).A00;
            if (c42h2 == null) {
                return 0;
            }
            i = c42h2._id;
            if (i == 6) {
                if (c42f.A05) {
                    c42f.A05 = false;
                    C42f.A0R(c42f);
                }
            }
            if (i != 7) {
                return 0;
            }
        }
        int i2 = c42f.A0O.A02;
        if (i2 >= 0) {
            return i2;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b0, code lost:
    
        if (r0.A1K() == X.C42h.A0B) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int A18() {
        /*
            Method dump skipped, instructions count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC01033pi.A18():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x054d, code lost:
    
        r308.A04 = r320 - r321;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0554, code lost:
    
        r308.A2R(r302);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x055c, code lost:
    
        r309 = X.0Q8.createAndThrow();
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0347, code lost:
    
        if (r302._writePadding != false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x0541, code lost:
    
        if (r302._writePadding != false) goto L230;
     */
    /* JADX WARN: Failed to calculate best type for var: r310v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r310v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Failed to calculate best type for var: r312v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r312v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed. Error: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:70)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:116)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Not initialized variable reg: 310, insn: 0x067a: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r310 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:310:0x067a */
    /* JADX WARN: Not initialized variable reg: 312, insn: 0x067c: MOVE (r1 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r312 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:310:0x067a */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0659  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int A19(X.C24f r302, java.io.OutputStream r303) {
        /*
            Method dump skipped, instructions count: 1689
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC01033pi.A19(X.24f, java.io.OutputStream):int");
    }

    public long A1A() {
        Number number;
        long j;
        C42V c42v = (C42V) this;
        int i = c42v.A06;
        if ((i & 2) == 0) {
            if (i == 0) {
                C42V.A0v(c42v, 2);
            }
            int i2 = c42v.A06;
            if ((i2 & 2) == 0) {
                if ((i2 & 1) == 0) {
                    if ((i2 & 4) != 0) {
                        if (C42W.A08.compareTo(c42v.A0G) <= 0 && C42W.A06.compareTo(c42v.A0G) >= 0) {
                            number = c42v.A0G;
                            j = number.longValue();
                        }
                        c42v.A2B(c42v.A1Z());
                        throw 0Q8.createAndThrow();
                    }
                    if ((i2 & 8) != 0) {
                        double d = c42v.A00;
                        if (d >= -9.223372036854776E18d && d <= 9.223372036854776E18d) {
                            j = (long) d;
                        }
                    } else {
                        if ((i2 & 16) == 0) {
                            C42W.A0y();
                            throw 0Q8.createAndThrow();
                        }
                        if (C42W.A04.compareTo(c42v.A0F) <= 0 && C42W.A02.compareTo(c42v.A0F) >= 0) {
                            number = c42v.A0F;
                            j = number.longValue();
                        }
                    }
                    c42v.A2B(c42v.A1Z());
                    throw 0Q8.createAndThrow();
                }
                j = c42v.A07;
                c42v.A0B = j;
                c42v.A06 |= 2;
            }
        }
        return c42v.A0B;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0038. Please report as an issue. */
    public long A1B() {
        C42W c42w = (C42W) this;
        C42h c42h = c42w.A00;
        if (c42h == C42h.A0B || c42h == C42h.A0A) {
            return c42w.A1A();
        }
        if (c42h != null) {
            int i = c42h._id;
            if (i != 6) {
                switch (i) {
                    case 9:
                        return 1L;
                    case 12:
                        Object A1R = c42w.A1R();
                        if (A1R instanceof Number) {
                            return ((Number) A1R).longValue();
                        }
                    default:
                        return 0L;
                }
            } else {
                String A1Z = c42w.A1Z();
                if (!"null".equals(A1Z)) {
                    return C42j.A05(A1Z, 0L);
                }
            }
        }
        return 0L;
    }

    public 4DN A1C() {
        long j;
        int i;
        long j2;
        boolean z = this instanceof C42f;
        C42V c42v = (C42V) this;
        int i2 = c42v.A04;
        int i3 = (i2 - c42v.A02) + 1;
        3sN A2I = c42v.A2I();
        long j3 = c42v.A0A;
        long j4 = i2;
        if (z) {
            j2 = j4 + j3;
            i = c42v.A01;
            j = -1;
        } else {
            j = j3 + j4;
            i = c42v.A01;
            j2 = -1;
        }
        return new 4DN(A2I, i, i3, j, j2);
    }

    public 4DN A1D() {
        C42f c42f;
        3sN A2I;
        long j;
        long j2;
        long j3;
        3sN A2I2;
        long j4;
        int i;
        int i2;
        if (this instanceof C42f) {
            c42f = (C42f) this;
            if (((C42W) c42f).A00 != C42h.A03) {
                A2I = c42f.A2I();
                j = -1;
                j2 = c42f.A0C - 1;
                return new 4DN(A2I, ((C42V) c42f).A09, ((C42V) c42f).A08, j, j2);
            }
            j4 = c42f.A0A + (c42f.A02 - 1);
            A2I2 = c42f.A2I();
            j3 = -1;
            i = c42f.A01;
            i2 = c42f.A00;
            return new 4DN(A2I2, i, i2, j3, j4);
        }
        c42f = (42U) this;
        if (((C42W) c42f).A00 != C42h.A03) {
            A2I = c42f.A2I();
            j = c42f.A0C - 1;
            j2 = -1;
            return new 4DN(A2I, ((C42V) c42f).A09, ((C42V) c42f).A08, j, j2);
        }
        j3 = c42f.A0A + (((42U) c42f).A01 - 1);
        A2I2 = c42f.A2I();
        j4 = -1;
        i = ((42U) c42f).A02;
        i2 = ((42U) c42f).A00;
        return new 4DN(A2I2, i, i2, j3, j4);
    }

    public C27n A1E() {
        C42V c42v = (C42V) this;
        if (c42v.A06 == 0) {
            C42V.A0v(c42v, 0);
        }
        C42h c42h = ((C42W) c42v).A00;
        C42h c42h2 = C42h.A0B;
        int i = c42v.A06;
        return c42h == c42h2 ? (i & 1) != 0 ? C27n.INT : (i & 2) != 0 ? C27n.LONG : C27n.BIG_INTEGER : (i & 16) != 0 ? C27n.BIG_DECIMAL : C27n.DOUBLE;
    }

    public AbstractC01033pi A1F(int i) {
        if (!(this instanceof C42V)) {
            this.A00 = i;
            return this;
        }
        C42V c42v = (C42V) this;
        int i2 = ((AbstractC01033pi) c42v).A00 ^ i;
        if (i2 != 0) {
            ((AbstractC01033pi) c42v).A00 = i;
            C42V.A0w(c42v, i, i2);
        }
        return c42v;
    }

    public AbstractC01033pi A1G(int i, int i2) {
        if (!(this instanceof C42V)) {
            A1F((i & i2) | (this.A00 & (i2 ^ (-1))));
            return this;
        }
        C42V c42v = (C42V) this;
        int i3 = ((AbstractC01033pi) c42v).A00;
        int i4 = (i & i2) | ((i2 ^ (-1)) & i3);
        int i5 = i3 ^ i4;
        if (i5 != 0) {
            ((AbstractC01033pi) c42v).A00 = i4;
            C42V.A0w(c42v, i4, i5);
        }
        return c42v;
    }

    public 3sX A1H() {
        return ((C42V) this).A0E;
    }

    public C42h A1I() {
        return ((C42W) this).A00;
    }

    public C42h A1J() {
        return ((C42W) this).A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0364, code lost:
    
        if (r317 == 125) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bb, code lost:
    
        if (r306 == 125) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.C42h A1K() {
        /*
            Method dump skipped, instructions count: 1271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC01033pi.A1K():X.42h");
    }

    public C42h A1L() {
        C42h A1K = A1K();
        if (A1K == C42h.A03) {
            A1K = A1K();
        }
        return A1K;
    }

    public AnonymousClass245 A1M() {
        return this instanceof C42f ? ((C42f) this).A03 : ((42U) this).A03;
    }

    public C24a A1N() {
        AnonymousClass245 A1M = A1M();
        if (A1M != null) {
            return A1M.A0B(this);
        }
        throw AnonymousClass001.A0N("No ObjectCodec defined for parser, needed for deserialization");
    }

    public C27Z A1O() {
        return C42V.A0P;
    }

    public Number A1P() {
        C42V c42v = (C42V) this;
        if (c42v.A06 == 0) {
            C42V.A0v(c42v, 0);
        }
        C42h c42h = ((C42W) c42v).A00;
        C42h c42h2 = C42h.A0B;
        int i = c42v.A06;
        if (c42h == c42h2) {
            if ((i & 1) != 0) {
                return Integer.valueOf(c42v.A07);
            }
            if ((i & 2) != 0) {
                return Long.valueOf(c42v.A0B);
            }
            if ((i & 4) != 0) {
                return c42v.A0G;
            }
        } else {
            if ((i & 16) != 0) {
                return c42v.A0F;
            }
            if ((i & 8) != 0) {
                return Double.valueOf(c42v.A00);
            }
        }
        C42W.A0y();
        throw 0Q8.createAndThrow();
    }

    public Number A1Q() {
        if (!(this instanceof C42V)) {
            return A1P();
        }
        C42V c42v = (C42V) this;
        C42h c42h = ((C42W) c42v).A00;
        C42h c42h2 = C42h.A0B;
        int i = c42v.A06;
        if (c42h == c42h2) {
            if (i == 0) {
                C42V.A0v(c42v, 0);
            }
            int i2 = c42v.A06;
            if ((i2 & 1) != 0) {
                return Integer.valueOf(c42v.A07);
            }
            if ((i2 & 2) != 0) {
                return Long.valueOf(c42v.A0B);
            }
            if ((i2 & 4) != 0) {
                return c42v.A0G;
            }
        } else {
            if (i == 0) {
                C42V.A0v(c42v, 16);
            }
            int i3 = c42v.A06;
            if ((i3 & 16) != 0) {
                return c42v.A0F;
            }
            if ((i3 & 8) != 0) {
                return Double.valueOf(c42v.A00);
            }
        }
        C42W.A0y();
        throw 0Q8.createAndThrow();
    }

    public Object A1R() {
        return null;
    }

    public Object A1S() {
        if (this instanceof 42U) {
            return ((42U) this).A04;
        }
        if (this instanceof C42f) {
            return ((C42f) this).A04;
        }
        return null;
    }

    public Object A1T() {
        return null;
    }

    public Object A1U() {
        return null;
    }

    public Object A1V(5BC r302) {
        AnonymousClass245 A1M = A1M();
        if (A1M != null) {
            return A1M.A0D(this, r302);
        }
        throw AnonymousClass001.A0N("No ObjectCodec defined for parser, needed for deserialization");
    }

    public Object A1W(Class cls) {
        AnonymousClass245 A1M = A1M();
        if (A1M != null) {
            return A1M.A0E(this, cls);
        }
        throw AnonymousClass001.A0N("No ObjectCodec defined for parser, needed for deserialization");
    }

    public String A1X() {
        return A1Y();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (r304 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String A1Y() {
        /*
            r301 = this;
            r0 = r301
            r302 = r0
            r0 = r301
            X.42V r0 = (X.C42V) r0
            r302 = r0
            r0 = r302
            X.42h r0 = r0.A00
            r303 = r0
            X.42h r0 = X.C42h.A06
            r304 = r0
            r0 = r303
            r1 = r304
            if (r0 == r1) goto L1e
            X.42h r0 = X.C42h.A05
            r304 = r0
            r0 = r303
            r1 = r304
            if (r0 != r1) goto L2f
        L1e:
            r0 = r302
            X.42b r0 = r0.A0E
            X.42b r0 = r0.A06
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L2f
        L2a:
            r0 = r304
            java.lang.String r0 = r0.A04
            return r0
        L2f:
            r0 = r302
            X.42b r0 = r0.A0E
            r304 = r0
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC01033pi.A1Y():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String A1Z() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0 instanceof X.42U
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L33
            r0 = r301
            r303 = r0
            r0 = r301
            X.42U r0 = (X.42U) r0
            r303 = r0
            r0 = r303
            X.42h r0 = r0.A00
            r304 = r0
            X.42h r0 = X.C42h.A0C
            r305 = r0
            r0 = r304
            r1 = r305
            if (r0 != r1) goto L69
            r0 = r303
            boolean r0 = r0.A05
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L61
            r0 = r303
            r1 = 0
            r0.A05 = r1
            r0 = r303
            java.lang.String r0 = X.42U.A0Q(r0)
            return r0
        L33:
            r0 = r301
            r303 = r0
            r0 = r301
            X.42f r0 = (X.C42f) r0
            r303 = r0
            r0 = r303
            X.42h r0 = r0.A00
            r304 = r0
            X.42h r0 = X.C42h.A0C
            r305 = r0
            r0 = r304
            r1 = r305
            if (r0 != r1) goto L69
            r0 = r303
            boolean r0 = r0.A05
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L61
            r0 = 0
            r302 = r0
            r0 = 0
            r305 = r0
            r0 = r303
            r1 = 0
            r0.A05 = r1
            r0 = r303
            X.C42f.A0R(r0)
        L61:
            r0 = r303
            X.3sM r0 = r0.A0O
            java.lang.String r0 = r0.A06()
            return r0
        L69:
            r0 = r304
            if (r0 != 0) goto L6f
            r0 = 0
            return r0
        L6f:
            r0 = r304
            int r0 = r0._id
            r306 = r0
            r0 = 5
            r302 = r0
            r0 = r306
            r1 = r302
            if (r0 == r1) goto L9d
            r0 = 6
            r302 = r0
            r0 = r306
            r1 = r302
            if (r0 == r1) goto L61
            r0 = 7
            r302 = r0
            r0 = r306
            r1 = r302
            if (r0 == r1) goto L61
            r0 = 8
            r302 = r0
            r0 = r306
            r1 = r302
            if (r0 == r1) goto L61
            r0 = r304
            java.lang.String r0 = r0._serialized
            return r0
        L9d:
            r0 = r303
            X.42b r0 = r0.A0E
            java.lang.String r0 = r0.A04
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC01033pi.A1Z():java.lang.String");
    }

    public String A1a() {
        C42f c42f;
        C42h c42h;
        String A0L;
        C42h A0H;
        C42h c42h2;
        if (this instanceof 42U) {
            c42f = (42U) this;
            ((C42V) c42f).A06 = 0;
            C42h c42h3 = ((C42W) c42f).A00;
            C42h c42h4 = C42h.A03;
            if (c42h3 == c42h4) {
                42U.A0J(c42f);
                return null;
            }
            if (((42U) c42f).A05) {
                42U.A0h(c42f);
            }
            int A0E = 42U.A0E(c42f);
            if (A0E >= 0) {
                c42f.A0K = null;
                if (A0E == 93) {
                    42U.A0i(c42f);
                    ((C42W) c42f).A00 = C42h.A01;
                    return null;
                }
                if (A0E == 125) {
                    42U.A0j(c42f);
                    ((C42W) c42f).A00 = C42h.A02;
                    return null;
                }
                C42b c42b = c42f.A0E;
                int i = ((3sX) c42b).A00 + 1;
                ((3sX) c42b).A00 = i;
                if (((3sX) c42b).A01 != 0 && i > 0) {
                    if (A0E != 44) {
                        c42f.A26(A0E, A05(c42b, "was expecting comma to separate "));
                        throw 0Q8.createAndThrow();
                    }
                    A0E = 42U.A0D(c42f);
                    if ((((AbstractC01033pi) c42f).A00 & 42U.A0D) != 0) {
                        if (A0E == 93) {
                            42U.A0i(c42f);
                            c42h2 = C42h.A01;
                        } else if (A0E == 125) {
                            42U.A0j(c42f);
                            c42h2 = C42h.A02;
                        }
                        ((C42W) c42f).A00 = c42h2;
                        return null;
                    }
                }
                if (((3sX) c42f.A0E).A01 != 2) {
                    42U.A0n(c42f);
                    42U.A0N(c42f, A0E);
                    return null;
                }
                ((42U) c42f).A02 = ((C42V) c42f).A01;
                int i2 = ((C42V) c42f).A04;
                ((42U) c42f).A01 = i2;
                ((42U) c42f).A00 = i2 - ((C42V) c42f).A02;
                A0L = 42U.A0R(c42f, A0E);
                c42f.A0E.A08(A0L);
                ((C42W) c42f).A00 = c42h4;
                int A0C = 42U.A0C(c42f);
                42U.A0n(c42f);
                if (A0C == 34) {
                    ((42U) c42f).A05 = true;
                    c42f.A0D = C42h.A0C;
                    return A0L;
                }
                if (A0C == 45) {
                    A0H = 42U.A0I(c42f);
                } else if (A0C != 46) {
                    if (A0C != 91) {
                        if (A0C == 102) {
                            42U.A0k(c42f);
                            A0H = C42h.A08;
                        } else if (A0C == 110) {
                            42U.A0l(c42f);
                            A0H = C42h.A09;
                        } else if (A0C != 116) {
                            if (A0C != 123) {
                                switch (A0C) {
                                    case ActionId.QUEUED /* 48 */:
                                    case ActionId.IN_PROGRESS /* 49 */:
                                    case 50:
                                    case ActionId.UNKNOWN /* 51 */:
                                    case ActionId.RETRY_AFTER_FAILURE /* 52 */:
                                    case ActionId.RETRY_AFTER_RECONNECT /* 53 */:
                                    case ActionId.QUEUEING_BEGIN /* 54 */:
                                    case ActionId.QUEUEING_SUCCESS /* 55 */:
                                    case ActionId.QUEUEING_FAIL /* 56 */:
                                    case ActionId.MESSAGE_UPDATE_START /* 57 */:
                                        A0H = 42U.A0M(c42f, A0C);
                                        break;
                                    default:
                                        A0H = 42U.A0L(c42f, A0C);
                                        break;
                                }
                            }
                            A0H = C42h.A06;
                        } else {
                            42U.A0m(c42f);
                            A0H = C42h.A0D;
                        }
                    }
                    A0H = C42h.A05;
                } else {
                    A0H = 42U.A0K(c42f);
                }
            }
            c42f.close();
            ((C42W) c42f).A00 = null;
            return null;
        }
        if (!(this instanceof C42f)) {
            if (A1K() == C42h.A03) {
                return A1Y();
            }
            return null;
        }
        c42f = (C42f) this;
        ((C42V) c42f).A06 = 0;
        C42h c42h5 = ((C42W) c42f).A00;
        C42h c42h6 = C42h.A03;
        if (c42h5 == c42h6) {
            C42f.A0F(c42f);
            return null;
        }
        if (c42f.A05) {
            C42f.A0V(c42f);
        }
        int A012 = C42f.A01(c42f);
        if (A012 >= 0) {
            c42f.A0K = null;
            if (A012 == 93 || A012 == 125) {
                C42f.A0X(c42f, A012);
                return null;
            }
            C42b c42b2 = c42f.A0E;
            int i3 = ((3sX) c42b2).A00 + 1;
            ((3sX) c42b2).A00 = i3;
            if (((3sX) c42b2).A01 != 0 && i3 > 0) {
                A012 = C42f.A0A(c42f, A012);
                if ((((AbstractC01033pi) c42f).A00 & C42f.A0D) != 0 && (A012 == 93 || A012 == 125)) {
                    C42f.A0X(c42f, A012);
                    return null;
                }
            }
            C42b c42b3 = c42f.A0E;
            int i4 = ((3sX) c42b3).A01;
            if (i4 != 2) {
                C42f.A0W(c42f);
                if (A012 == 34) {
                    c42f.A05 = true;
                    c42h = C42h.A0C;
                } else if (A012 == 91) {
                    c42f.A0E = c42b3.A06(((C42V) c42f).A09, ((C42V) c42f).A08);
                    c42h = C42h.A05;
                } else if (A012 == 102) {
                    C42f.A0Y(c42f, "false", 1);
                    c42h = C42h.A08;
                } else if (A012 == 110) {
                    C42f.A0Y(c42f, "null", 1);
                    c42h = C42h.A09;
                } else if (A012 == 116) {
                    C42f.A0Y(c42f, "true", 1);
                    c42h = C42h.A0D;
                } else if (A012 != 123) {
                    switch (A012) {
                        case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                            if (i4 != 0 && (((AbstractC01033pi) c42f).A00 & C42f.A0A) != 0) {
                                ((C42V) c42f).A04--;
                                c42h = C42h.A09;
                                break;
                            }
                            c42h = C42f.A0I(c42f, A012);
                            break;
                        case ActionId.ON_CREATE_VIEW_END /* 45 */:
                            c42h = C42f.A0H(c42f);
                            break;
                        case 46:
                            c42h = C42f.A0G(c42f);
                            break;
                        default:
                            switch (A012) {
                                case ActionId.QUEUED /* 48 */:
                                case ActionId.IN_PROGRESS /* 49 */:
                                case 50:
                                case ActionId.UNKNOWN /* 51 */:
                                case ActionId.RETRY_AFTER_FAILURE /* 52 */:
                                case ActionId.RETRY_AFTER_RECONNECT /* 53 */:
                                case ActionId.QUEUEING_BEGIN /* 54 */:
                                case ActionId.QUEUEING_SUCCESS /* 55 */:
                                case ActionId.QUEUEING_FAIL /* 56 */:
                                case ActionId.MESSAGE_UPDATE_START /* 57 */:
                                    c42h = C42f.A0J(c42f, A012);
                                    break;
                                default:
                                    c42h = C42f.A0I(c42f, A012);
                                    break;
                            }
                    }
                } else {
                    c42f.A0E = c42b3.A07(((C42V) c42f).A09, ((C42V) c42f).A08);
                    c42h = C42h.A06;
                }
                ((C42W) c42f).A00 = c42h;
                return null;
            }
            int i5 = ((C42V) c42f).A04;
            c42f.A02 = i5;
            c42f.A01 = ((C42V) c42f).A01;
            c42f.A00 = i5 - ((C42V) c42f).A02;
            A0L = A012 == 34 ? C42f.A0L(c42f) : C42f.A0M(c42f, A012);
            c42f.A0E.A08(A0L);
            ((C42W) c42f).A00 = c42h6;
            int A00 = C42f.A00(c42f);
            C42f.A0W(c42f);
            if (A00 == 34) {
                c42f.A05 = true;
                c42f.A0D = C42h.A0C;
                return A0L;
            }
            if (A00 == 45) {
                A0H = C42f.A0H(c42f);
            } else if (A00 != 46) {
                if (A00 != 91) {
                    if (A00 == 102) {
                        C42f.A0S(c42f);
                        A0H = C42h.A08;
                    } else if (A00 == 110) {
                        C42f.A0T(c42f);
                        A0H = C42h.A09;
                    } else if (A00 != 116) {
                        if (A00 != 123) {
                            switch (A00) {
                                case ActionId.QUEUED /* 48 */:
                                case ActionId.IN_PROGRESS /* 49 */:
                                case 50:
                                case ActionId.UNKNOWN /* 51 */:
                                case ActionId.RETRY_AFTER_FAILURE /* 52 */:
                                case ActionId.RETRY_AFTER_RECONNECT /* 53 */:
                                case ActionId.QUEUEING_BEGIN /* 54 */:
                                case ActionId.QUEUEING_SUCCESS /* 55 */:
                                case ActionId.QUEUEING_FAIL /* 56 */:
                                case ActionId.MESSAGE_UPDATE_START /* 57 */:
                                    A0H = C42f.A0J(c42f, A00);
                                    break;
                                default:
                                    A0H = C42f.A0I(c42f, A00);
                                    break;
                            }
                        }
                        A0H = C42h.A06;
                    } else {
                        C42f.A0U(c42f);
                        A0H = C42h.A0D;
                    }
                }
                A0H = C42h.A05;
            } else {
                A0H = C42f.A0G(c42f);
            }
        }
        c42f.close();
        ((C42W) c42f).A00 = null;
        return null;
        c42f.A0D = A0H;
        return A0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String A1b() {
        /*
            Method dump skipped, instructions count: 415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC01033pi.A1b():java.lang.String");
    }

    public BigDecimal A1c() {
        long j;
        BigDecimal valueOf;
        C42V c42v = (C42V) this;
        int i = c42v.A06;
        if ((i & 16) == 0) {
            if (i == 0) {
                C42V.A0v(c42v, 16);
            }
            int i2 = c42v.A06;
            if ((i2 & 16) == 0) {
                if ((i2 & 8) != 0) {
                    String A1Z = c42v.A1Z();
                    String str = C42j.A01;
                    valueOf = 4VA.A01(A1Z.toCharArray());
                } else if ((i2 & 4) != 0) {
                    valueOf = new BigDecimal(c42v.A0G);
                } else {
                    if ((i2 & 2) != 0) {
                        j = c42v.A0B;
                    } else {
                        if ((i2 & 1) == 0) {
                            C42W.A0y();
                            throw 0Q8.createAndThrow();
                        }
                        j = c42v.A07;
                    }
                    valueOf = BigDecimal.valueOf(j);
                }
                c42v.A0F = valueOf;
                c42v.A06 |= 16;
            }
        }
        return c42v.A0F;
    }

    public BigInteger A1d() {
        BigInteger bigInteger;
        C42V c42v = (C42V) this;
        int i = c42v.A06;
        if ((i & 4) == 0) {
            if (i == 0) {
                C42V.A0v(c42v, 4);
            }
            int i2 = c42v.A06;
            if ((i2 & 4) == 0) {
                if ((i2 & 16) != 0) {
                    bigInteger = c42v.A0F.toBigInteger();
                } else if ((i2 & 2) != 0) {
                    bigInteger = BigInteger.valueOf(c42v.A0B);
                } else if ((i2 & 1) != 0) {
                    bigInteger = BigInteger.valueOf(c42v.A07);
                } else {
                    if ((i2 & 8) == 0) {
                        C42W.A0y();
                        throw 0Q8.createAndThrow();
                    }
                    bigInteger = BigDecimal.valueOf(c42v.A00).toBigInteger();
                }
                c42v.A0G = bigInteger;
                c42v.A06 |= 4;
            }
        }
        return c42v.A0G;
    }

    public Iterator A1e(Class cls) {
        AnonymousClass245 A1M = A1M();
        if (A1M != null) {
            return A1M.A0C(this, cls);
        }
        throw AnonymousClass001.A0N("No ObjectCodec defined for parser, needed for deserialization");
    }

    public short A1f() {
        int A15 = A15();
        if (A15 < -32768 || A15 > 32767) {
            throw new C4Qf(this, C42h.A0B, Short.TYPE, String.format("Numeric value (%s) out of range of Java short", A1Z()));
        }
        return (short) A15;
    }

    public void A1g() {
        C42W c42w = (C42W) this;
        if (c42w.A00 != null) {
            c42w.A00 = null;
        }
    }

    public void A1h(AnonymousClass245 anonymousClass245) {
        if (this instanceof 42U) {
            ((42U) this).A03 = anonymousClass245;
        } else {
            ((C42f) this).A03 = anonymousClass245;
        }
    }

    public void A1i(Object obj) {
        if (this instanceof C42V) {
            ((C42V) this).A0E.A03 = obj;
            return;
        }
        3sX A1H = A1H();
        if (A1H != null) {
            A1H.A05(obj);
        }
    }

    public boolean A1j() {
        return false;
    }

    public boolean A1k() {
        return false;
    }

    public boolean A1l() {
        return A1v(false);
    }

    public boolean A1m() {
        boolean z = false;
        if (((C42W) this).A00 != null) {
            z = true;
        }
        return z;
    }

    public boolean A1n() {
        C42V c42v = (C42V) this;
        C42h c42h = ((C42W) c42v).A00;
        if (c42h == C42h.A0C) {
            return true;
        }
        if (c42h == C42h.A03) {
            return c42v.A0I;
        }
        return false;
    }

    public boolean A1o() {
        boolean z = false;
        if (((C42W) this).A00 == C42h.A0B) {
            z = true;
        }
        return z;
    }

    public boolean A1p() {
        boolean z = false;
        if (((C42W) this).A00 == C42h.A05) {
            z = true;
        }
        return z;
    }

    public boolean A1q() {
        boolean z = false;
        if (((C42W) this).A00 == C42h.A06) {
            z = true;
        }
        return z;
    }

    public boolean A1r() {
        C42V c42v = (C42V) this;
        boolean z = false;
        if (((C42W) c42v).A00 == C42h.A0A && (c42v.A06 & 8) != 0) {
            double d = c42v.A00;
            if (Double.isNaN(d) || Double.isInfinite(d)) {
                z = true;
            }
        }
        return z;
    }

    public boolean A1s() {
        return false;
    }

    public boolean A1t(int i) {
        C42h c42h = ((C42W) this).A00;
        return c42h != null && c42h._id == 5;
    }

    public boolean A1u(C42h c42h) {
        boolean z = false;
        if (((C42W) this).A00 == c42h) {
            z = true;
        }
        return z;
    }

    public boolean A1v(boolean z) {
        C42W c42w = (C42W) this;
        C42h c42h = c42w.A00;
        if (c42h == null) {
            return false;
        }
        boolean z2 = true;
        switch (c42h._id) {
            case 6:
                return "true".equals(c42w.A1Z().trim());
            case 7:
                if (c42w.A15() == 0) {
                    z2 = false;
                    break;
                }
                break;
            case 9:
                break;
            case 12:
                Object A1R = c42w.A1R();
                if (A1R instanceof Boolean) {
                    return AnonymousClass001.A1V(A1R);
                }
                return false;
            default:
                return false;
        }
        return z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0569  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public byte[] A1w(X.C24f r302) {
        /*
            Method dump skipped, instructions count: 1422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC01033pi.A1w(X.24f):byte[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public char[] A1x() {
        /*
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC01033pi.A1x():char[]");
    }

    public int A1y() {
        C42W c42w = (C42W) this;
        C42h c42h = c42w.A00;
        return (c42h == C42h.A0B || c42h == C42h.A0A) ? c42w.A15() : c42w.A21(0);
    }

    public String A1z() {
        return ((C42W) this).A22(null);
    }

    public abstract AbstractC01033pi A20();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();
}
