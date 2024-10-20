package com.fasterxml.jackson.datatype.guava.deser.multimap;

import X.1Mu;
import X.24S;
import X.2LD;
import X.4DN;
import X.68U;
import X.AbstractC01033pi;
import X.AnonymousClass001;
import X.AnonymousClass437;
import X.C26O;
import X.C27T;
import X.C2cb;
import X.C42h;
import X.C42o;
import X.C42x;
import X.C4E7;
import X.C68e;
import X.C68h;
import X.KnN;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: GuavaMultimapDeserializer.class */
public abstract class GuavaMultimapDeserializer extends StdDeserializer implements AnonymousClass437 {
    public static final List A00 = ImmutableList.of((Object) "copyOf", (Object) "create");
    public static final long serialVersionUID = 1;
    public final Method creatorMethod;
    public final JsonDeserializer elementDeserializer;
    public final C68e elementTypeDeserializer;
    public final KnN keyDeserializer;
    public final C42o nullProvider;
    public final boolean skipNullValues;
    public final C4E7 type;

    public GuavaMultimapDeserializer(JsonDeserializer jsonDeserializer, KnN knN, C42o c42o, C68e c68e, C4E7 c4e7, Method method) {
        super(c4e7);
        this.type = c4e7;
        this.keyDeserializer = knN;
        this.elementTypeDeserializer = c68e;
        this.elementDeserializer = jsonDeserializer;
        this.creatorMethod = method;
        this.nullProvider = c42o;
        this.skipNullValues = c42o == null ? false : AnonymousClass001.A1W(c42o, C68h.A01);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public GuavaMultimapDeserializer(com.fasterxml.jackson.databind.JsonDeserializer r302, X.KnN r303, X.C68e r304, X.C4E7 r305) {
        /*
            r301 = this;
            r0 = r305
            r306 = r0
            r0 = r305
            java.lang.Class r0 = r0._class
            r307 = r0
            java.lang.Class<com.google.common.collect.LinkedListMultimap> r0 = com.google.common.collect.LinkedListMultimap.class
            r308 = r0
            r0 = r307
            r1 = r308
            if (r0 == r1) goto La9
            java.lang.Class<X.1Mv> r0 = X.1Mv.class
            r308 = r0
            r0 = r307
            r1 = r308
            if (r0 == r1) goto La9
            java.lang.Class<X.1Mu> r0 = X.1Mu.class
            r309 = r0
            r0 = r307
            r1 = r309
            if (r0 == r1) goto La9
            java.util.List r0 = com.fasterxml.jackson.datatype.guava.deser.multimap.GuavaMultimapDeserializer.A00
            r310 = r0
            r0 = r310
            java.util.Iterator r0 = r0.iterator()
            r311 = r0
        L3a:
            r0 = r311
            boolean r0 = r0.hasNext()
            r312 = r0
            r0 = r312
            if (r0 == 0) goto L6d
            r0 = r311
            java.lang.String r0 = X.AnonymousClass001.A0i(r0)
            r313 = r0
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch: java.lang.NoSuchMethodException -> Lc2
            r1 = r0
            r2 = 0
            r3 = r309
            r1[r2] = r3     // Catch: java.lang.NoSuchMethodException -> Lc2
            r308 = r0
            r0 = r307
            r1 = r313
            r2 = r308
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> Lc2
            r314 = r0
            r0 = r314
            if (r0 == 0) goto L3a
            goto Lac
        L6d:
            r0 = r310
            java.util.Iterator r0 = r0.iterator()
            r311 = r0
        L76:
            r0 = r311
            boolean r0 = r0.hasNext()
            r312 = r0
            r0 = r312
            if (r0 == 0) goto La9
            r0 = r311
            java.lang.String r0 = X.AnonymousClass001.A0i(r0)
            r313 = r0
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch: java.lang.NoSuchMethodException -> Lc6
            r1 = r0
            r2 = 0
            r3 = r309
            r1[r2] = r3     // Catch: java.lang.NoSuchMethodException -> Lc6
            r308 = r0
            r0 = r307
            r1 = r313
            r2 = r308
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> Lc6
            r314 = r0
            r0 = r314
            if (r0 == 0) goto L76
            goto Lac
        La9:
            r0 = 0
            r314 = r0
        Lac:
            r0 = r301
            r310 = r0
            r0 = r302
            r309 = r0
            r0 = r303
            r307 = r0
            r0 = r301
            r1 = r302
            r2 = r303
            r3 = 0
            r4 = r304
            r5 = r306
            r6 = r314
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        Lc2:
            goto L3a
        Lc6:
            goto L76
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.datatype.guava.deser.multimap.GuavaMultimapDeserializer.<init>(com.fasterxml.jackson.databind.JsonDeserializer, X.KnN, X.68e, X.4E7):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public 1Mu A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
        1Mu A13;
        Object A0T;
        Object A0T2;
        Object A0T3;
        if (c27t.A0p(C26O.A04)) {
            A13 = A13();
            A01(abstractC01033pi, C42h.A06);
            while (abstractC01033pi.A1K() != C42h.A02) {
                KnN knN = this.keyDeserializer;
                Object A002 = knN != null ? knN.A00(c27t, abstractC01033pi.A1Y()) : abstractC01033pi.A1Y();
                abstractC01033pi.A1K();
                if (abstractC01033pi.A1I() != C42h.A05) {
                    if (abstractC01033pi.A1J() == C42h.A09) {
                        A0T2 = null;
                    } else {
                        C68e c68e = this.elementTypeDeserializer;
                        JsonDeserializer jsonDeserializer = this.elementDeserializer;
                        A0T2 = c68e != null ? jsonDeserializer.A0T(abstractC01033pi, c27t, c68e) : jsonDeserializer.A0M(abstractC01033pi, c27t);
                    }
                    A13.CZw(A002, A0T2);
                } else {
                    while (abstractC01033pi.A1K() != C42h.A01) {
                        if (abstractC01033pi.A1J() == C42h.A09) {
                            A0T3 = null;
                        } else {
                            C68e c68e2 = this.elementTypeDeserializer;
                            JsonDeserializer jsonDeserializer2 = this.elementDeserializer;
                            A0T3 = c68e2 != null ? jsonDeserializer2.A0T(abstractC01033pi, c27t, c68e2) : jsonDeserializer2.A0M(abstractC01033pi, c27t);
                        }
                        A13.CZw(A002, A0T3);
                    }
                }
            }
            Method method = this.creatorMethod;
            if (method != null) {
                try {
                    return (1Mu) method.invoke(null, A13);
                } catch (IllegalAccessException e) {
                    e = e;
                    String A0a = AnonymousClass001.A0a(this.type, AnonymousClass001.A0n("Could not map to "));
                    while (e.getCause() != null) {
                        e = e.getCause();
                    }
                    throw new C2cb(abstractC01033pi, A0a, e);
                } catch (IllegalArgumentException e2) {
                    e = e2;
                    String A0a2 = AnonymousClass001.A0a(this.type, AnonymousClass001.A0n("Could not map to "));
                    while (e.getCause() != null) {
                        e = e.getCause();
                    }
                    throw new C2cb(abstractC01033pi, A0a2, e);
                } catch (InvocationTargetException e3) {
                    e = e3;
                    String A0a3 = AnonymousClass001.A0a(this.type, AnonymousClass001.A0n("Could not map to "));
                    while (e.getCause() != null) {
                        e = e.getCause();
                    }
                    throw new C2cb(abstractC01033pi, A0a3, e);
                }
            }
        } else {
            A13 = A13();
            A01(abstractC01033pi, C42h.A06);
            while (abstractC01033pi.A1K() != C42h.A02) {
                KnN knN2 = this.keyDeserializer;
                Object A003 = knN2 != null ? knN2.A00(c27t, abstractC01033pi.A1Y()) : abstractC01033pi.A1Y();
                abstractC01033pi.A1K();
                A01(abstractC01033pi, C42h.A05);
                while (abstractC01033pi.A1K() != C42h.A01) {
                    if (abstractC01033pi.A1J() != C42h.A09) {
                        C68e c68e3 = this.elementTypeDeserializer;
                        JsonDeserializer jsonDeserializer3 = this.elementDeserializer;
                        A0T = c68e3 != null ? jsonDeserializer3.A0T(abstractC01033pi, c27t, c68e3) : jsonDeserializer3.A0M(abstractC01033pi, c27t);
                    } else if (!this.skipNullValues) {
                        A0T = this.nullProvider.Azd(c27t);
                    }
                    A13.CZw(A003, A0T);
                }
            }
            Method method2 = this.creatorMethod;
            if (method2 != null) {
                try {
                    return (1Mu) method2.invoke(null, A13);
                } catch (IllegalAccessException e4) {
                    e = e4;
                    String A0a4 = AnonymousClass001.A0a(this.type, AnonymousClass001.A0n("Could not map to "));
                    while (e.getCause() != null) {
                        e = e.getCause();
                    }
                    throw new C2cb(abstractC01033pi, A0a4, e);
                } catch (IllegalArgumentException e5) {
                    e = e5;
                    String A0a5 = AnonymousClass001.A0a(this.type, AnonymousClass001.A0n("Could not map to "));
                    while (e.getCause() != null) {
                        e = e.getCause();
                    }
                    throw new C2cb(abstractC01033pi, A0a5, e);
                } catch (InvocationTargetException e6) {
                    e = e6;
                    String A0a6 = AnonymousClass001.A0a(this.type, AnonymousClass001.A0n("Could not map to "));
                    while (e.getCause() != null) {
                        e = e.getCause();
                    }
                    throw new C2cb(abstractC01033pi, A0a6, e);
                }
            }
        }
        return A13;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Throwable, X.2cb, X.2LD, java.io.IOException] */
    public static void A01(AbstractC01033pi abstractC01033pi, C42h c42h) {
        if (abstractC01033pi.A1J() == c42h) {
            return;
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Expecting ");
        A0k.append(c42h);
        A0k.append(", found ");
        String A0a = AnonymousClass001.A0a(abstractC01033pi.A1J(), A0k);
        4DN A1C = abstractC01033pi.A1C();
        ?? iOException = new IOException(A0a, null);
        ((2LD) iOException)._location = A1C;
        iOException.A00 = abstractC01033pi;
        throw iOException;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public C42x A0Q() {
        return C42x.Map;
    }

    public abstract JsonDeserializer A12(JsonDeserializer jsonDeserializer, KnN knN, C42o c42o, C68e c68e, C4E7 c4e7, Method method);

    public abstract 1Mu A13();

    @Override // X.AnonymousClass437
    public JsonDeserializer AJM(68U r302, C27T c27t) {
        KnN knN = this.keyDeserializer;
        if (knN == null) {
            knN = c27t.A0L(this.type._keyType);
        }
        JsonDeserializer jsonDeserializer = this.elementDeserializer;
        24S r0 = this.type._valueType;
        JsonDeserializer A0G = jsonDeserializer == null ? c27t.A0G(r302, r0) : c27t.A0I(r302, r0, jsonDeserializer);
        C68e c68e = this.elementTypeDeserializer;
        if (c68e != null) {
            c68e = c68e.A04(r302);
        }
        return A12(A0G, knN, A0h(r302, c27t, A0G), c68e, this.type, this.creatorMethod);
    }
}
