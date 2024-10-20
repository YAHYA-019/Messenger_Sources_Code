package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* renamed from: X.277, reason: invalid class name */
/* loaded from: 277.class */
public abstract class AnonymousClass277 extends AnonymousClass278 implements Serializable {
    public final C27I _factoryConfig;

    static {
        C26G c26g = C26G.A00;
        C27F[] c27fArr = 27C.A01;
    }

    public AnonymousClass277(C27I c27i) {
        this._factoryConfig = c27i;
    }

    public static JsonDeserializer A05(C27T c27t, C24r c24r) {
        Object A0a;
        AnonymousClass248 A02 = c27t._config.A02();
        if (A02 == null || (A0a = A02.A0a(c24r)) == null) {
            return null;
        }
        return c27t.A0K(A0a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x01b5, code lost:
    
        if (r310 != null) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [X.68e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private X.68S A06(X.7Ro r302, X.C27T r303, X.C26G r304, X.68H r305, X.AnonymousClass251 r306, int r307) {
        /*
            Method dump skipped, instructions count: 517
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass277.A06(X.7Ro, X.27T, X.26G, X.68H, X.251, int):X.68S");
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x0699, code lost:
    
        if (r317 != null) goto L151;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.68V A07(X.C27T r301, X.AnonymousClass277 r302, X.AnonymousClass251 r303) {
        /*
            Method dump skipped, instructions count: 3953
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass277.A07(X.27T, X.277, X.251):X.68V");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fb, code lost:
    
        if (r313 == java.lang.Byte.class) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.String[], java.lang.String[][]] */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.248] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r302v0, types: [X.24r, X.3pX] */
    /* JADX WARN: Type inference failed for: r310v0, types: [java.util.AbstractMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.3eW A08(X.C26L r301, X.AbstractC00953pX r302, java.lang.Class r303) {
        /*
            Method dump skipped, instructions count: 527
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass277.A08(X.26L, X.3pX, java.lang.Class):X.3eW");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0101, code lost:
    
        if (r322 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0123, code lost:
    
        if (r0.A0P() != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0171, code lost:
    
        if (r322 == null) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A09(X.C27T r302, X.C01003pd r303, X.68Q r304, X.C67s r305, X.AnonymousClass251 r306) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass277.A09(X.27T, X.3pd, X.68Q, X.67s, X.251):void");
    }

    private void A0A(C27T c27t, 68Q r303, C67s c67s, AnonymousClass251 anonymousClass251) {
        Object[] objArr;
        String str;
        int i = r303.A00;
        68S[] r0 = new 68S[i];
        int i2 = -1;
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 < i) {
                68R r02 = r303.A02[i4];
                68H r03 = r02.A01;
                7Ro r04 = r02.A00;
                if (r04 == null) {
                    if (i2 >= 0) {
                        objArr = new Object[]{Integer.valueOf(i2), Integer.valueOf(i4), r303};
                        str = "More than one argument (#%d and #%d) left as delegating for Creator %s: only one allowed";
                        break;
                    }
                    i2 = i4;
                } else {
                    r0[i4] = A06(r04, c27t, null, r03, anonymousClass251, i4);
                }
                i3 = i4 + 1;
            } else {
                if (i2 >= 0) {
                    3pW r05 = r303.A01;
                    if (i != 1) {
                        c67s.A02(r05, r0, i2, true);
                        return;
                    }
                    A0C(c67s, r05, true, true);
                    AnonymousClass687 anonymousClass687 = r303.A02[0].A02;
                    if (anonymousClass687 != null) {
                        ((AnonymousClass686) anonymousClass687).A00 = null;
                        return;
                    }
                    return;
                }
                objArr = new Object[]{r303};
                str = "No argument left as delegating for Creator %s: exactly one required";
            }
        }
        c27t.A0h(anonymousClass251, str, objArr);
        throw 0Q8.createAndThrow();
    }

    private void A0B(C27T c27t, 68Q r303, C67s c67s, AnonymousClass251 anonymousClass251) {
        Object[] A1a;
        String str;
        C26G c26g;
        int i = r303.A00;
        68S[] r0 = new 68S[i];
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= i) {
                c67s.A03(r303.A01, r0, true);
                return;
            }
            68R r02 = r303.A02[i3];
            7Ro r03 = r02.A00;
            AbstractC00953pX abstractC00953pX = r02.A01;
            AnonymousClass687 anonymousClass687 = r02.A02;
            if (anonymousClass687 != null) {
                c26g = anonymousClass687.A0D();
                if (c26g != null) {
                    continue;
                    r0[i3] = A06(r03, c27t, c26g, abstractC00953pX, anonymousClass251, i3);
                    i2 = i3 + 1;
                }
            }
            if (c27t._config.A02().A0M(abstractC00953pX) != null) {
                A1a = AnonymousClass001.A1a(((68H) abstractC00953pX)._index);
                str = "Cannot define Creator parameter %d as `@JsonUnwrapped`: combination not yet supported";
                break;
            }
            c26g = null;
            if (r03 == null) {
                A1a = new Object[]{Integer.valueOf(i3), r303};
                str = "Argument #%d of constructor %s has no property name (and is not Injectable): can not use as property-based Creator";
                break;
            } else {
                r0[i3] = A06(r03, c27t, c26g, abstractC00953pX, anonymousClass251, i3);
                i2 = i3 + 1;
            }
        }
        c27t.A0h(anonymousClass251, str, A1a);
        throw 0Q8.createAndThrow();
    }

    public static void A0C(C67s c67s, 3pW r302, boolean z, boolean z2) {
        Class A0J = r302.A0J(0);
        int i = 1;
        if (A0J == String.class || A0J == CharSequence.class) {
            if (!z && !z2) {
                return;
            }
        } else if (A0J == Integer.TYPE || A0J == Integer.class) {
            if (!z && !z2) {
                return;
            } else {
                i = 2;
            }
        } else if (A0J == Long.TYPE || A0J == Long.class) {
            if (!z && !z2) {
                return;
            } else {
                i = 3;
            }
        } else if (A0J == Double.TYPE || A0J == Double.class) {
            if (!z && !z2) {
                return;
            } else {
                i = 5;
            }
        } else {
            if (A0J != Boolean.TYPE && A0J != Boolean.class) {
                if (A0J == BigInteger.class && (z || z2)) {
                    C67s.A01(c67s, r302, 4, z);
                }
                if (A0J == BigDecimal.class) {
                    if (!z && !z2) {
                        return;
                    } else {
                        C67s.A01(c67s, r302, 6, z);
                    }
                }
                if (z) {
                    c67s.A02(r302, null, 0, z);
                    return;
                }
                return;
            }
            if (!z && !z2) {
                return;
            } else {
                i = 7;
            }
        }
        C67s.A01(c67s, r302, i, z);
    }

    public static boolean A0D(AnonymousClass248 anonymousClass248, 3pW r302, AnonymousClass687 anonymousClass687) {
        String A0M;
        return ((anonymousClass687 == null || !anonymousClass687.A0U()) && anonymousClass248.A04(r302.A0I(0)) == null && (anonymousClass687 == null || (A0M = anonymousClass687.A0M()) == null || A0M.isEmpty() || !anonymousClass687.A0P())) ? false : true;
    }

    public 24S A0H(C27T c27t, 24S r303, AbstractC00953pX abstractC00953pX) {
        InterfaceC00923pT interfaceC00923pT;
        Jyp A0G;
        InterfaceC00923pT A00;
        KnN A0M;
        AnonymousClass248 A02 = c27t._config.A02();
        if (A02 == null) {
            return r303;
        }
        if (r303.A0R() && r303.A06() != null && (A0M = c27t.A0M(A02.A0c(abstractC00953pX))) != null) {
            r303 = ((C4E7) r303).A0W(A0M);
        }
        if (!(r303 instanceof C24b) || (((C24b) r303) instanceof 3Bx)) {
            JsonDeserializer A0K = c27t.A0K(A02.A0X(abstractC00953pX));
            if (A0K != null) {
                r303 = r303.A0F(A0K);
            }
            C26L c26l = c27t._config;
            if (!(c26l.A02() instanceof AnonymousClass247)) {
                interfaceC00923pT = null;
            } else {
                if (r303.A05() == null) {
                    StringBuilder A0k = AnonymousClass001.A0k();
                    A0k.append("Must call method with a container or reference type (got ");
                    A0k.append(r303);
                    throw AnonymousClass002.A0D(")", A0k);
                }
                interfaceC00923pT = AnonymousClass247.A00(c26l, abstractC00953pX);
            }
            24S A05 = r303.A05();
            Jyp A0G2 = interfaceC00923pT == null ? A0G(c26l, A05) : interfaceC00923pT.ACs(c26l, A05, c26l._subtypeResolver.A04(A05, c26l, abstractC00953pX));
            if (A0G2 != null) {
                r303 = r303.A0E(A0G2);
            }
        }
        C26L c26l2 = c27t._config;
        if (!(c26l2.A02() instanceof AnonymousClass247) || r303.A0Q() || ((24T) r303).A04() || (A00 = AnonymousClass247.A00(c26l2, abstractC00953pX)) == null) {
            A0G = A0G(c26l2, r303);
        } else {
            try {
                A0G = A00.ACs(c26l2, r303, c26l2._subtypeResolver.A04(r303, c26l2, abstractC00953pX));
            } catch (IllegalArgumentException | IllegalStateException e) {
                3Af r0 = new 3Af((AbstractC01033pi) null, r303, 27C.A09(e));
                r0.initCause(e);
                throw r0;
            }
        }
        if (A0G != null) {
            r303 = r303.A0G(A0G);
        }
        return A02.A0D(r303, c27t._config, abstractC00953pX);
    }

    public abstract AnonymousClass275 A0I(C27I c27i);

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0079, code lost:
    
        if (r305 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01ae, code lost:
    
        if (r304.getClass() != r0) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.68W A0J(X.C27T r302, X.AnonymousClass251 r303) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass277.A0J(X.27T, X.251):X.68W");
    }
}
