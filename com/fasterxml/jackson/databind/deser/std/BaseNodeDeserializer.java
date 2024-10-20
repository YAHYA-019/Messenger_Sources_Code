package com.fasterxml.jackson.databind.deser.std;

import X.0Q8;
import X.24X;
import X.2DM;
import X.2DO;
import X.2Jz;
import X.2LD;
import X.3Ba;
import X.3Bb;
import X.42X;
import X.4DO;
import X.4rK;
import X.AbstractC01033pi;
import X.AnonymousClass438;
import X.C02053tt;
import X.C03353xs;
import X.C09924rw;
import X.C26O;
import X.C26T;
import X.C27T;
import X.C2cb;
import X.C42h;

/* loaded from: BaseNodeDeserializer.class */
public abstract class BaseNodeDeserializer extends StdDeserializer {
    public final Boolean _supportsUpdates;

    public BaseNodeDeserializer(Boolean bool, Class cls) {
        super(cls);
        this._supportsUpdates = bool;
    }

    public static final 24X A01(AbstractC01033pi abstractC01033pi) {
        Object A1R = abstractC01033pi.A1R();
        if (A1R == null) {
            return C09924rw.A00;
        }
        if (A1R.getClass() != byte[].class) {
            return ((A1R instanceof 4rK) || !(A1R instanceof 24X)) ? new 3Ba(A1R) : (24X) A1R;
        }
        byte[] bArr = (byte[]) A1R;
        if (bArr == null) {
            return null;
        }
        return bArr.length == 0 ? 3Bb.A00 : new 3Bb(bArr);
    }

    private final 24X A02(AbstractC01033pi abstractC01033pi, C27T c27t) {
        int A14 = abstractC01033pi.A14();
        if (A14 == 2) {
            return new 2DM(c27t._config._nodeFactory);
        }
        if (A14 == 8) {
            return A07(abstractC01033pi, c27t, c27t._config._nodeFactory);
        }
        if (A14 == 12) {
            return A01(abstractC01033pi);
        }
        c27t.A0Y(abstractC01033pi, A0S());
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0060, code lost:
    
        return new X.4RF(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
    
        return new X.C02043ts(r301.A1A());
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        if (r0 == X.C27n.LONG) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if ((r302 & X.C26O.A0N._mask) != 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        r0 = r301.A1d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r0 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        return X.C09924rw.A00;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final X.2K0 A03(X.AbstractC01033pi r301, int r302) {
        /*
            r0 = r302
            if (r0 == 0) goto L22
            X.26O r0 = X.C26O.A0N
            r303 = r0
            r0 = r303
            int r0 = r0._mask
            r304 = r0
            r0 = r302
            r1 = r304
            r0 = r0 & r1
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L44
        L15:
            r0 = r301
            java.math.BigInteger r0 = r0.A1d()
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L56
            X.4rw r0 = X.C09924rw.A00
            return r0
        L22:
            r0 = r301
            X.27n r0 = r0.A1E()
            r305 = r0
            X.27n r0 = X.C27n.INT
            r303 = r0
            r0 = r305
            r1 = r303
            if (r0 != r1) goto L3a
            r0 = r301
            int r0 = r0.A15()
            X.2K1 r0 = X.2K1.A00(r0)
            return r0
        L3a:
            X.27n r0 = X.C27n.LONG
            r303 = r0
            r0 = r305
            r1 = r303
            if (r0 != r1) goto L15
        L44:
            r0 = r301
            long r0 = r0.A1A()
            r306 = r0
            X.3ts r0 = new X.3ts
            r301 = r0
            r0 = r301
            r1 = r306
            r0.<init>(r1)
            r0 = r301
            return r0
        L56:
            X.4RF r0 = new X.4RF
            r301 = r0
            r0 = r301
            r1 = r303
            r0.<init>(r1)
            r0 = r301
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.A03(X.3pi, int):X.2K0");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final X.2K0 A04(X.AbstractC01033pi r301, X.C27T r302) {
        /*
            r0 = r302
            int r0 = r0._featureFlags
            r303 = r0
            int r0 = com.fasterxml.jackson.databind.deser.std.StdDeserializer.A00
            r1 = r303
            r0 = r0 & r1
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L54
            X.26O r0 = X.C26O.A0N
            r305 = r0
            r0 = r305
            int r0 = r0._mask
            r1 = r303
            r0 = r0 & r1
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L39
            X.27n r0 = X.C27n.BIG_INTEGER
            r306 = r0
        L25:
            X.27n r0 = X.C27n.INT
            r305 = r0
            r0 = r306
            r1 = r305
            if (r0 != r1) goto L5d
            r0 = r301
            int r0 = r0.A15()
            X.2K1 r0 = X.2K1.A00(r0)
            return r0
        L39:
            X.26O r0 = X.C26O.A0P
            r305 = r0
            r0 = r305
            int r0 = r0._mask
            r304 = r0
            r0 = r303
            r1 = r304
            r0 = r0 & r1
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L54
            X.27n r0 = X.C27n.LONG
            r306 = r0
            goto L25
        L54:
            r0 = r301
            X.27n r0 = r0.A1E()
            r306 = r0
            goto L25
        L5d:
            X.27n r0 = X.C27n.LONG
            r305 = r0
            r0 = r306
            r1 = r305
            if (r0 != r1) goto L7b
            r0 = r301
            long r0 = r0.A1A()
            r307 = r0
            X.3ts r0 = new X.3ts
            r301 = r0
            r0 = r301
            r1 = r307
            r0.<init>(r1)
            r0 = r301
            return r0
        L7b:
            r0 = r301
            java.math.BigInteger r0 = r0.A1d()
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L8a
            X.4rw r0 = X.C09924rw.A00
            return r0
        L8a:
            X.4RF r0 = new X.4RF
            r301 = r0
            r0 = r301
            r1 = r305
            r0.<init>(r1)
            r0 = r301
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.A04(X.3pi, X.27T):X.2K0");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002a, code lost:
    
        if (r301.A1r() != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final X.2K0 A07(X.AbstractC01033pi r301, X.C27T r302, X.C26T r303) {
        /*
            r0 = r301
            X.27n r0 = r0.A1E()
            r304 = r0
            X.27n r0 = X.C27n.BIG_DECIMAL
            r305 = r0
            r0 = r304
            r1 = r305
            if (r0 == r1) goto L5c
            X.26O r0 = X.C26O.A0M
            r305 = r0
            r0 = r302
            r1 = r305
            boolean r0 = r0.A0p(r1)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L3f
            r0 = r301
            boolean r0 = r0.A1r()
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L5c
        L2d:
            r0 = r301
            double r0 = r0.A10()
            r307 = r0
            X.4mx r0 = new X.4mx
            r301 = r0
            r0 = r301
            r1 = r307
            r0.<init>(r1)
            r0 = r301
            return r0
        L3f:
            X.27n r0 = X.C27n.FLOAT
            r305 = r0
            r0 = r304
            r1 = r305
            if (r0 != r1) goto L2d
            r0 = r301
            float r0 = r0.A13()
            r309 = r0
            X.5DL r0 = new X.5DL
            r301 = r0
            r0 = r301
            r1 = r309
            r0.<init>(r1)
            r0 = r301
            return r0
        L5c:
            r0 = r301
            java.math.BigDecimal r0 = r0.A1c()
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L69
            X.4rw r0 = X.C09924rw.A00
            return r0
        L69:
            r0 = r303
            boolean r0 = r0._cfgBigDecimalExact
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L7f
            X.4RE r0 = new X.4RE
            r301 = r0
            r0 = r301
            r1 = r304
            r0.<init>(r1)
            r0 = r301
            return r0
        L7f:
            r0 = r304
            int r0 = r0.signum()
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L8e
            X.4RE r0 = X.4RE.A00
            return r0
        L8e:
            r0 = r304
            java.math.BigDecimal r0 = r0.stripTrailingZeros()     // Catch: java.lang.ArithmeticException -> L9e
            r304 = r0
        L93:
            X.4RE r0 = new X.4RE
            r301 = r0
            r0 = r301
            r1 = r304
            r0.<init>(r1)
            r0 = r301
            return r0
        L9e:
            goto L93
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.A07(X.3pi, X.27T, X.26T):X.2K0");
    }

    public static void A08(C27T c27t, 24X r302, 24X r303, C26T c26t, 2DM r305, String str) {
        if (c27t.A0p(C26O.A0D)) {
            2LD c2cb = new C2cb(c27t.A00, String.format("Duplicate field '%s' for `ObjectNode`: not allowed when `DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY` enabled", str));
            ((4DO) c2cb)._targetType = 24X.class;
            throw c2cb;
        }
        if (c27t.A0o(42X.A01)) {
            if (r302.A0R()) {
                ((C03353xs) r302).A0d(r303);
                r305._children.put(str, r302);
            } else {
                C03353xs c03353xs = new C03353xs(c26t);
                c03353xs.A0d(r302);
                c03353xs.A0d(r303);
                r305._children.put(str, c03353xs);
            }
        }
    }

    public final 24X A12(AbstractC01033pi abstractC01033pi, C27T c27t) {
        C26T c26t = c27t._config._nodeFactory;
        int A14 = abstractC01033pi.A14();
        if (A14 == 2) {
            return new 2DM(c26t);
        }
        switch (A14) {
            case 6:
                return 2Jz.A00(abstractC01033pi.A1Z());
            case 7:
                return A04(abstractC01033pi, c27t);
            case 8:
                return A07(abstractC01033pi, c27t, c26t);
            case 9:
                return C02053tt.A01;
            case 10:
                return C02053tt.A00;
            case 11:
                return C09924rw.A00;
            case 12:
                return A01(abstractC01033pi);
            default:
                c27t.A0Y(abstractC01033pi, A0S());
                throw 0Q8.createAndThrow();
        }
    }

    public final 24X A13(AbstractC01033pi abstractC01033pi, C27T c27t, AnonymousClass438 anonymousClass438, 2DM r305) {
        String A1X;
        2DM r314;
        if (abstractC01033pi.A1q()) {
            A1X = abstractC01033pi.A1a();
        } else {
            if (!abstractC01033pi.A1u(C42h.A03)) {
                return (24X) A0M(abstractC01033pi, c27t);
            }
            A1X = abstractC01033pi.A1X();
        }
        C26T c26t = c27t._config._nodeFactory;
        while (A1X != null) {
            C42h A1K = abstractC01033pi.A1K();
            C09924rw A0D = r305.A0D(A1X);
            if (A0D != null) {
                if (A0D instanceof 2DM) {
                    if (A1K == C42h.A06) {
                        C09924rw A13 = A13(abstractC01033pi, c27t, anonymousClass438, (2DM) A0D);
                        if (A13 != A0D) {
                            if (A13 == null) {
                                A13 = C09924rw.A00;
                            }
                            r305._children.put(A1X, A13);
                        }
                    }
                } else if ((A0D instanceof C03353xs) && A1K == C42h.A05) {
                    A15(abstractC01033pi, c27t, anonymousClass438, (2DO) A0D, c26t);
                }
                A1X = abstractC01033pi.A1a();
            }
            if (A1K == null) {
                A1K = C42h.A04;
            }
            int i = A1K._id;
            if (i == 1) {
                r314 = new 2DM(c26t);
                A15(abstractC01033pi, c27t, anonymousClass438, r314, c26t);
            } else if (i == 3) {
                r314 = new C03353xs(c26t);
                A15(abstractC01033pi, c27t, anonymousClass438, r314, c26t);
            } else if (i == 6) {
                r314 = 2Jz.A00(abstractC01033pi.A1Z());
            } else if (i != 7) {
                switch (i) {
                    case 9:
                        r314 = C02053tt.A01;
                        break;
                    case 10:
                        r314 = C02053tt.A00;
                        break;
                    case 11:
                        r314 = C09924rw.A00;
                        break;
                    default:
                        r314 = A02(abstractC01033pi, c27t);
                        break;
                }
            } else {
                r314 = A04(abstractC01033pi, c27t);
            }
            if (r314 == null) {
                r314 = C09924rw.A00;
            }
            r305._children.put(A1X, r314);
            A1X = abstractC01033pi.A1a();
        }
        return r305;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0090 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X.2DM A14(X.AbstractC01033pi r302, X.C27T r303, X.AnonymousClass438 r304, X.C26T r305) {
        /*
            r301 = this;
            X.2DM r0 = new X.2DM
            r306 = r0
            r0 = r305
            r307 = r0
            r0 = r306
            r1 = r305
            r0.<init>(r1)
            r0 = r302
            r308 = r0
            r0 = r302
            java.lang.String r0 = r0.A1X()
            r309 = r0
        L19:
            r0 = r309
            if (r0 == 0) goto Lc5
            r0 = r302
            X.42h r0 = r0.A1K()
            r310 = r0
            r0 = r310
            if (r0 != 0) goto L2e
            X.42h r0 = X.C42h.A04
            r310 = r0
        L2e:
            r0 = r310
            int r0 = r0._id
            r311 = r0
            r0 = 1
            r312 = r0
            r0 = r301
            r313 = r0
            r0 = r303
            r314 = r0
            r0 = r311
            r1 = r312
            if (r0 == r1) goto L99
            r0 = 3
            r312 = r0
            r0 = r311
            r1 = r312
            if (r0 == r1) goto La8
            r0 = r301
            r1 = r302
            r2 = r303
            X.24X r0 = r0.A12(r1, r2)
            r315 = r0
        L57:
            r0 = r315
            r316 = r0
            r0 = r315
            if (r0 != 0) goto L65
            X.4rw r0 = X.C09924rw.A00
            r316 = r0
        L65:
            r0 = r306
            java.util.Map r0 = r0._children
            r310 = r0
            r0 = r310
            r1 = r309
            r2 = r316
            java.lang.Object r0 = r0.put(r1, r2)
            X.24X r0 = (X.24X) r0
            r317 = r0
            r0 = r317
            if (r0 == 0) goto L90
            r0 = r314
            r1 = r317
            r2 = r315
            r3 = r307
            r4 = r306
            r5 = r309
            A08(r0, r1, r2, r3, r4, r5)
        L90:
            r0 = r302
            java.lang.String r0 = r0.A1a()
            r309 = r0
            goto L19
        L99:
            X.2DM r0 = new X.2DM
            r315 = r0
            r0 = r315
            r1 = r307
            r0.<init>(r1)
            goto Lb4
        La8:
            X.3xs r0 = new X.3xs
            r315 = r0
            r0 = r315
            r1 = r307
            r0.<init>(r1)
        Lb4:
            r0 = r313
            r1 = r308
            r2 = r314
            r3 = r304
            r4 = r315
            r5 = r307
            r0.A15(r1, r2, r3, r4, r5)
            goto L57
        Lc5:
            r0 = r306
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.A14(X.3pi, X.27T, X.438, X.26T):X.2DM");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x02c3, code lost:
    
        r0.A0d(r308);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x01e0. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:21:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x02f9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A15(X.AbstractC01033pi r302, X.C27T r303, X.AnonymousClass438 r304, X.2DO r305, X.C26T r306) {
        /*
            Method dump skipped, instructions count: 762
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.A15(X.3pi, X.27T, X.438, X.2DO, X.26T):void");
    }
}
