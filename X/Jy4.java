package X;

import com.fasterxml.jackson.databind.JsonDeserializer;

/* loaded from: Jy4.class */
public final class Jy4 extends 68S {
    public static final long serialVersionUID = 1;
    public final 68S _forward;

    public Jy4(C26G c26g, Jy4 jy4) {
        super(c26g, jy4);
        this._forward = jy4._forward;
        ((68S) this)._objectIdInfo = ((68S) jy4)._objectIdInfo;
    }

    public Jy4(68S r302, 7Rm r303) {
        super(r302);
        this._forward = r302;
        ((68S) this)._objectIdInfo = r303;
    }

    public Jy4(JsonDeserializer jsonDeserializer, C42o c42o, Jy4 jy4) {
        super(jsonDeserializer, c42o, jy4);
        this._forward = jy4._forward;
        ((68S) this)._objectIdInfo = ((68S) jy4)._objectIdInfo;
    }

    public int A02() {
        return this._forward.A02();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.42o] */
    public 68S A04(JsonDeserializer jsonDeserializer) {
        JsonDeserializer jsonDeserializer2 = ((68S) this)._valueDeserializer;
        if (jsonDeserializer2 == jsonDeserializer) {
            return this;
        }
        JsonDeserializer jsonDeserializer3 = ((68S) this)._nullProvider;
        if (jsonDeserializer2 == jsonDeserializer3) {
            jsonDeserializer3 = jsonDeserializer;
        }
        return new Jy4(jsonDeserializer, jsonDeserializer3, this);
    }

    public 68S A05(C26G c26g) {
        return new Jy4(c26g, this);
    }

    public 68S A06(C42o c42o) {
        return new Jy4(((68S) this)._valueDeserializer, c42o, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        if (((X.68S) r301)._valueDeserializer.A0P() != null) goto L13;
     */
    /* JADX WARN: Type inference failed for: r307v0, types: [java.lang.Throwable, X.81f] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A0D(X.AbstractC01033pi r302, X.C27T r303, java.lang.Object r304) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            r2 = r303
            java.lang.Object r0 = r0.A0C(r1, r2)     // Catch: X.C81f -> L17
            r305 = r0
            r0 = r301
            X.68S r0 = r0._forward     // Catch: X.C81f -> L17
            r306 = r0
            r0 = r306
            r1 = r304
            r2 = r305
            java.lang.Object r0 = r0.A0F(r1, r2)     // Catch: X.C81f -> L17
            return r0
        L17:
            r307 = move-exception
            r0 = r301
            X.7Rm r0 = r0._objectIdInfo
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L38
            r0 = r301
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r0._valueDeserializer
            X.7Rt r0 = r0.A0P()
            r305 = r0
            r0 = 0
            r308 = r0
            r0 = 0
            r306 = r0
            r0 = r305
            if (r0 == 0) goto L3b
        L38:
            r0 = 1
            r308 = r0
        L3b:
            r0 = r308
            if (r0 == 0) goto L69
            r0 = r307
            X.KtU r0 = r0._roid
            r309 = r0
            r0 = r301
            X.24S r0 = r0._type
            java.lang.Class r0 = r0._class
            r305 = r0
            X.Jy9 r0 = new X.Jy9
            r306 = r0
            r0 = r306
            r1 = r307
            r2 = r301
            r3 = r305
            r4 = r304
            r0.<init>(r1, r2, r3, r4)
            r0 = r309
            r1 = r306
            r0.A00(r1)
            r0 = 0
            return r0
        L69:
            X.2cb r0 = new X.2cb
            r306 = r0
            r0 = r306
            r1 = r302
            java.lang.String r2 = "Unresolved forward reference but no identity info"
            r3 = r307
            r0.<init>(r1, r2, r3)
            r0 = r306
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Jy4.A0D(X.3pi, X.27T, java.lang.Object):java.lang.Object");
    }

    public Object A0F(Object obj, Object obj2) {
        return this._forward.A0F(obj, obj2);
    }

    public void A0K(C26L c26l) {
        68S r0 = this._forward;
        if (r0 != null) {
            r0.A0K(c26l);
        }
    }

    public void A0L(Object obj, AbstractC01033pi abstractC01033pi, C27T c27t) {
        A0D(abstractC01033pi, c27t, obj);
    }

    public void A0M(Object obj, Object obj2) {
        this._forward.A0M(obj, obj2);
    }

    public AbstractC00953pX AwU() {
        return this._forward.AwU();
    }
}
