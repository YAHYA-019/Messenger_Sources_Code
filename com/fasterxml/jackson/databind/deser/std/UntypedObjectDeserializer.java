package com.fasterxml.jackson.databind.deser.std;

import X.0Q8;
import X.24R;
import X.24S;
import X.27C;
import X.AbstractC01033pi;
import X.AnonymousClass001;
import X.AnonymousClass436;
import X.AnonymousClass437;
import X.C24b;
import X.C26O;
import X.C27T;
import X.C42h;
import X.L8v;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: UntypedObjectDeserializer.class */
public class UntypedObjectDeserializer extends StdDeserializer implements AnonymousClass436, AnonymousClass437 {
    public static final Object[] A00 = new Object[0];
    public static final long serialVersionUID = 1;
    public JsonDeserializer _listDeserializer;
    public 24S _listType;
    public JsonDeserializer _mapDeserializer;
    public 24S _mapType;
    public final boolean _nonMerging;
    public JsonDeserializer _numberDeserializer;
    public JsonDeserializer _stringDeserializer;

    /* loaded from: UntypedObjectDeserializer$Vanilla.class */
    public class Vanilla extends StdDeserializer {
        public static final Vanilla A00 = new Vanilla(false);
        public static final long serialVersionUID = 1;
        public final boolean _nonMerging;

        public Vanilla() {
            this(false);
        }

        public Vanilla(boolean z) {
            super(Object.class);
            this._nonMerging = z;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0104, code lost:
        
            if (r306.put(r0, r309) != null) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x006e, code lost:
        
            if (r301.A1K() == X.C42h.A02) goto L8;
         */
        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0014. Please report as an issue. */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.Object A00(X.AbstractC01033pi r301, X.C27T r302, com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla r303, int r304) {
            /*
                Method dump skipped, instructions count: 994
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla.A00(X.3pi, X.27T, com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer$Vanilla, int):java.lang.Object");
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            return A00(abstractC01033pi, c27t, this, 0);
        }
    }

    public UntypedObjectDeserializer() {
        this((24S) null, (24S) null);
    }

    public UntypedObjectDeserializer(24S r302, 24S r303) {
        super(Object.class);
        this._listType = r302;
        this._mapType = r303;
        this._nonMerging = false;
    }

    public UntypedObjectDeserializer(UntypedObjectDeserializer untypedObjectDeserializer, boolean z) {
        super(Object.class);
        this._mapDeserializer = untypedObjectDeserializer._mapDeserializer;
        this._listDeserializer = untypedObjectDeserializer._listDeserializer;
        this._stringDeserializer = untypedObjectDeserializer._stringDeserializer;
        this._numberDeserializer = untypedObjectDeserializer._numberDeserializer;
        this._listType = untypedObjectDeserializer._listType;
        this._mapType = untypedObjectDeserializer._mapType;
        this._nonMerging = z;
    }

    public static ArrayList A00(AbstractC01033pi abstractC01033pi, C27T c27t, UntypedObjectDeserializer untypedObjectDeserializer) {
        C42h A1K = abstractC01033pi.A1K();
        C42h c42h = C42h.A01;
        int i = 2;
        if (A1K == c42h) {
            return AnonymousClass001.A0t(2);
        }
        Object A0M = untypedObjectDeserializer.A0M(abstractC01033pi, c27t);
        if (abstractC01033pi.A1K() == c42h) {
            ArrayList A0t = AnonymousClass001.A0t(2);
            A0t.add(A0M);
            return A0t;
        }
        Object A0M2 = untypedObjectDeserializer.A0M(abstractC01033pi, c27t);
        if (abstractC01033pi.A1K() == c42h) {
            ArrayList A0t2 = AnonymousClass001.A0t(2);
            A0t2.add(A0M);
            A0t2.add(A0M2);
            return A0t2;
        }
        L8v A0T = c27t.A0T();
        Object[] A03 = A0T.A03();
        A03[0] = A0M;
        A03[1] = A0M2;
        int i2 = 2;
        while (true) {
            int i3 = i2;
            Object A0M3 = untypedObjectDeserializer.A0M(abstractC01033pi, c27t);
            i++;
            if (i3 >= A03.length) {
                A03 = A0T.A04(A03);
                i3 = 0;
            }
            int i4 = i3 + 1;
            A03[i3] = A0M3;
            if (abstractC01033pi.A1K() == c42h) {
                ArrayList A0t3 = AnonymousClass001.A0t(i);
                A0T.A02(A0t3, A03, i4);
                return A0t3;
            }
            i2 = i4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x009a, code lost:
    
        if (r308.put(r0, r0) != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009d, code lost:
    
        r0 = r302.A0o(X.42X.A01);
        com.fasterxml.jackson.databind.JsonDeserializer.A06(r0, r0, r306, r308, r0 ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b8, code lost:
    
        if (r311 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00bb, code lost:
    
        r301.A1K();
        r0 = r303.A0M(r301, r302);
        r0 = r308.put(r311, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d5, code lost:
    
        if (r0 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d8, code lost:
    
        com.fasterxml.jackson.databind.JsonDeserializer.A06(r0, r0, r306, r308, r0 ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e4, code lost:
    
        r311 = r301.A1a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x010d, code lost:
    
        if (r308.put(r0, r0) != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0113, code lost:
    
        r301.A1K();
        r0 = r303.A0M(r301, r302);
        r0 = r308.put(r311, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x012b, code lost:
    
        if (r0 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0184, code lost:
    
        r311 = r301.A1a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x018c, code lost:
    
        if (r311 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0191, code lost:
    
        return r308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x012e, code lost:
    
        r309 = r301.A1a();
        r0 = r302.A0o(X.42X.A01);
        com.fasterxml.jackson.databind.JsonDeserializer.A06(r0, r0, r311, r308, r0 ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x014f, code lost:
    
        if (r309 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0152, code lost:
    
        r301.A1K();
        r0 = r303.A0M(r301, r302);
        r0 = r308.put(r309, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x016c, code lost:
    
        if (r0 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x016f, code lost:
    
        com.fasterxml.jackson.databind.JsonDeserializer.A06(r0, r0, r311, r308, r0 ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x017b, code lost:
    
        r309 = r301.A1a();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.LinkedHashMap A01(X.AbstractC01033pi r301, X.C27T r302, com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer r303) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.A01(X.3pi, X.27T, com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer):java.util.LinkedHashMap");
    }

    public static Object[] A02(AbstractC01033pi abstractC01033pi, C27T c27t, UntypedObjectDeserializer untypedObjectDeserializer) {
        C42h A1K = abstractC01033pi.A1K();
        C42h c42h = C42h.A01;
        if (A1K == c42h) {
            return A00;
        }
        L8v A0T = c27t.A0T();
        Object[] A03 = A0T.A03();
        int i = 0;
        while (true) {
            int i2 = i;
            Object A0M = untypedObjectDeserializer.A0M(abstractC01033pi, c27t);
            if (i2 >= A03.length) {
                A03 = A0T.A04(A03);
                i2 = 0;
            }
            int i3 = i2 + 1;
            A03[i2] = A0M;
            if (abstractC01033pi.A1K() == c42h) {
                int i4 = A0T.A00 + i3;
                Object[] objArr = new Object[i4];
                L8v.A01(A0T, objArr, A03, i4, i3);
                L8v.A00(A0T);
                return objArr;
            }
            i = i3;
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
        switch (abstractC01033pi.A14()) {
            case 1:
            case 2:
            case 5:
                JsonDeserializer jsonDeserializer = this._mapDeserializer;
                return jsonDeserializer != null ? jsonDeserializer.A0M(abstractC01033pi, c27t) : A01(abstractC01033pi, c27t, this);
            case 3:
                if (c27t.A0p(C26O.A0O)) {
                    return A02(abstractC01033pi, c27t, this);
                }
                JsonDeserializer jsonDeserializer2 = this._listDeserializer;
                return jsonDeserializer2 != null ? jsonDeserializer2.A0M(abstractC01033pi, c27t) : A00(abstractC01033pi, c27t, this);
            case 4:
            default:
                c27t.A0Y(abstractC01033pi, Object.class);
                throw 0Q8.createAndThrow();
            case 6:
                JsonDeserializer jsonDeserializer3 = this._stringDeserializer;
                return jsonDeserializer3 != null ? jsonDeserializer3.A0M(abstractC01033pi, c27t) : abstractC01033pi.A1Z();
            case 7:
                JsonDeserializer jsonDeserializer4 = this._numberDeserializer;
                return jsonDeserializer4 != null ? jsonDeserializer4.A0M(abstractC01033pi, c27t) : (StdDeserializer.A00 & c27t._featureFlags) != 0 ? StdDeserializer.A0E(abstractC01033pi, c27t) : abstractC01033pi.A1P();
            case 8:
                JsonDeserializer jsonDeserializer5 = this._numberDeserializer;
                return jsonDeserializer5 != null ? jsonDeserializer5.A0M(abstractC01033pi, c27t) : c27t.A0p(C26O.A0M) ? abstractC01033pi.A1c() : abstractC01033pi.A1P();
            case 9:
                return Boolean.TRUE;
            case 10:
                return Boolean.FALSE;
            case 11:
                return null;
            case 12:
                return abstractC01033pi.A1R();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004d, code lost:
    
        if (r0.equals(r307) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003d, code lost:
    
        if (r307 != null) goto L10;
     */
    @Override // X.AnonymousClass437
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.databind.JsonDeserializer AJM(X.68U r302, X.C27T r303) {
        /*
            r301 = this;
            r0 = r302
            if (r0 != 0) goto L50
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r304 = r0
            r0 = r303
            X.26L r0 = r0._config
            r305 = r0
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r306 = r0
            r0 = r305
            X.25b r0 = r0._configOverrides
            java.util.Map r0 = r0._overrides
            r307 = r0
            r0 = r307
            if (r0 == 0) goto La6
            r0 = r307
            r1 = r306
            java.lang.Object r0 = r0.get(r1)
            X.25y r0 = (X.C25y) r0
            r307 = r0
            r0 = r307
            if (r0 == 0) goto La6
            r0 = r307
            java.lang.Boolean r0 = r0._mergeable
            r307 = r0
            r0 = r307
            if (r0 == 0) goto La6
        L40:
            r0 = r304
            r1 = r307
            boolean r0 = r0.equals(r1)
            r308 = r0
            r0 = 1
            r309 = r0
            r0 = r308
            if (r0 != 0) goto L56
        L50:
            r0 = 0
            r309 = r0
            r0 = 0
            r305 = r0
        L56:
            r0 = r301
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r0._stringDeserializer
            r307 = r0
            r0 = r307
            if (r0 != 0) goto Lb7
            r0 = r301
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r0._numberDeserializer
            r307 = r0
            r0 = r307
            if (r0 != 0) goto Lb7
            r0 = r301
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r0._mapDeserializer
            r307 = r0
            r0 = r307
            if (r0 != 0) goto Lb7
            r0 = r301
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r0._listDeserializer
            r307 = r0
            r0 = r307
            if (r0 != 0) goto Lb7
            r0 = r301
            java.lang.Class r0 = r0.getClass()
            r306 = r0
            java.lang.Class<com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer> r0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.class
            r307 = r0
            r0 = r306
            r1 = r307
            if (r0 != r1) goto Lb7
            r0 = r309
            if (r0 == 0) goto Lb3
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer$Vanilla r0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer$Vanilla
            r307 = r0
            r0 = r307
            r1 = 1
            r0.<init>(r1)
            r0 = r307
            return r0
        La6:
            r0 = r305
            X.25b r0 = r0._configOverrides
            java.lang.Boolean r0 = r0._defaultMergeable
            r307 = r0
            goto L40
        Lb3:
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer$Vanilla r0 = com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.Vanilla.A00
            return r0
        Lb7:
            r0 = r301
            boolean r0 = r0._nonMerging
            r308 = r0
            r0 = r309
            r1 = r308
            if (r0 == r1) goto Ld4
            com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer r0 = new com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer
            r307 = r0
            r0 = r307
            r1 = r301
            r2 = r309
            r0.<init>(r1, r2)
            r0 = r307
            return r0
        Ld4:
            r0 = r301
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer.AJM(X.68U, X.27T):com.fasterxml.jackson.databind.JsonDeserializer");
    }

    @Override // X.AnonymousClass436
    public void Cht(C27T c27t) {
        JsonDeserializer A02;
        JsonDeserializer A022;
        24S A0F = c27t.A0F(Object.class);
        24S A0F2 = c27t.A0F(String.class);
        24R A0A = c27t.A0A();
        24S r0 = this._listType;
        if (r0 == null) {
            A02 = c27t._cache.A02(c27t, A0A.A0A(A0F, List.class), c27t._factory);
            if (27C.A0L(A02)) {
                A02 = null;
            }
        } else {
            A02 = c27t._cache.A02(c27t, r0, c27t._factory);
        }
        this._listDeserializer = A02;
        24S r02 = this._mapType;
        if (r02 == null) {
            A022 = c27t._cache.A02(c27t, A0A.A0B(A0F2, A0F, Map.class), c27t._factory);
            if (27C.A0L(A022)) {
                A022 = null;
            }
        } else {
            A022 = c27t._cache.A02(c27t, r02, c27t._factory);
        }
        this._mapDeserializer = A022;
        JsonDeserializer A023 = c27t._cache.A02(c27t, A0F2, c27t._factory);
        if (27C.A0L(A023)) {
            A023 = null;
        }
        this._stringDeserializer = A023;
        JsonDeserializer A024 = c27t._cache.A02(c27t, A0A.A09(Number.class), c27t._factory);
        if (27C.A0L(A024)) {
            A024 = null;
        }
        this._numberDeserializer = A024;
        C24b c24b = 24R.A03;
        this._mapDeserializer = c27t.A0I(null, c24b, this._mapDeserializer);
        this._listDeserializer = c27t.A0I(null, c24b, this._listDeserializer);
        this._stringDeserializer = c27t.A0I(null, c24b, this._stringDeserializer);
        this._numberDeserializer = c27t.A0I(null, c24b, this._numberDeserializer);
    }
}
