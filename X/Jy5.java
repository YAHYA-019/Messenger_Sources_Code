package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import java.lang.reflect.Method;

/* loaded from: Jy5.class */
public final class Jy5 extends 68S {
    public static final long serialVersionUID = 1;
    public final transient Method A00;
    public final C68D _annotated;
    public final boolean _skipNulls;

    public Jy5(24S r302, C68D c68d, AnonymousClass687 anonymousClass687, C68e c68e, C24w c24w) {
        super(r302, anonymousClass687, c68e, c24w);
        this._annotated = c68d;
        this.A00 = c68d.A00;
        this._skipNulls = AnonymousClass001.A1W(((68S) this)._nullProvider, C68h.A01);
    }

    public Jy5(C26G c26g, Jy5 jy5) {
        super(c26g, jy5);
        this._annotated = jy5._annotated;
        this.A00 = jy5.A00;
        this._skipNulls = jy5._skipNulls;
    }

    public Jy5(Jy5 jy5, Method method) {
        super(jy5);
        this._annotated = jy5._annotated;
        this.A00 = method;
        this._skipNulls = jy5._skipNulls;
    }

    public Jy5(JsonDeserializer jsonDeserializer, C42o c42o, Jy5 jy5) {
        super(jsonDeserializer, c42o, jy5);
        this._annotated = jy5._annotated;
        this.A00 = jy5.A00;
        this._skipNulls = AnonymousClass001.A1W(c42o, C68h.A01);
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
        return new Jy5(jsonDeserializer, jsonDeserializer3, this);
    }

    public 68S A05(C26G c26g) {
        return new Jy5(c26g, this);
    }

    public 68S A06(C42o c42o) {
        return new Jy5(((68S) this)._valueDeserializer, c42o, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002e, code lost:
    
        if (r308 == null) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A0D(X.AbstractC01033pi r302, X.C27T r303, java.lang.Object r304) {
        /*
            r301 = this;
            X.42h r0 = X.C42h.A09
            r305 = r0
            r0 = r302
            r1 = r305
            boolean r0 = r0.A1u(r1)
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L31
            r0 = r301
            X.68e r0 = r0._valueTypeDeserializer
            r307 = r0
            r0 = r301
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r0._valueDeserializer
            r305 = r0
            r0 = r307
            if (r0 != 0) goto L4f
            r0 = r305
            r1 = r302
            r2 = r303
            java.lang.Object r0 = r0.A0M(r1, r2)
            r308 = r0
            r0 = r308
            if (r0 != 0) goto L5a
        L31:
            r0 = r301
            boolean r0 = r0._skipNulls
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L7d
            r0 = r301
            X.42o r0 = r0._nullProvider
            r305 = r0
            r0 = r305
            r1 = r303
            java.lang.Object r0 = r0.Azd(r1)
            r308 = r0
            goto L5a
        L4f:
            r0 = r305
            r1 = r302
            r2 = r303
            r3 = r307
            java.lang.Object r0 = r0.A0T(r1, r2, r3)
            r308 = r0
        L5a:
            r0 = r301
            java.lang.reflect.Method r0 = r0.A00     // Catch: java.lang.Exception -> L7f
            r307 = r0
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L7f
            r1 = r0
            r2 = 0
            r3 = r308
            r1[r2] = r3     // Catch: java.lang.Exception -> L7f
            r305 = r0
            r0 = r307
            r1 = r304
            r2 = r305
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Exception -> L7f
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L7d
            r0 = r305
            return r0
        L7d:
            r0 = r304
            return r0
        L7f:
            r305 = move-exception
            r0 = r301
            r1 = r302
            r2 = r305
            r3 = r308
            r0.A0J(r1, r2, r3)
            X.0Q8 r0 = X.0Q8.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Jy5.A0D(X.3pi, X.27T, java.lang.Object):java.lang.Object");
    }

    public Object A0F(Object obj, Object obj2) {
        try {
            Object invoke = this.A00.invoke(obj, obj2);
            return invoke != null ? invoke : obj;
        } catch (Exception e) {
            A0J((AbstractC01033pi) null, e, obj2);
            throw 0Q8.createAndThrow();
        }
    }

    public void A0K(C26L c26l) {
        this._annotated.A0E(c26l.A09(AnonymousClass260.A0K));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002e, code lost:
    
        if (r308 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0L(java.lang.Object r302, X.AbstractC01033pi r303, X.C27T r304) {
        /*
            r301 = this;
            X.42h r0 = X.C42h.A09
            r305 = r0
            r0 = r303
            r1 = r305
            boolean r0 = r0.A1u(r1)
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L31
            r0 = r301
            X.68e r0 = r0._valueTypeDeserializer
            r307 = r0
            r0 = r301
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r0._valueDeserializer
            r305 = r0
            r0 = r307
            if (r0 != 0) goto L4f
            r0 = r305
            r1 = r303
            r2 = r304
            java.lang.Object r0 = r0.A0M(r1, r2)
            r308 = r0
            r0 = r308
            if (r0 != 0) goto L5a
        L31:
            r0 = r301
            boolean r0 = r0._skipNulls
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L74
            r0 = r301
            X.42o r0 = r0._nullProvider
            r305 = r0
            r0 = r305
            r1 = r304
            java.lang.Object r0 = r0.Azd(r1)
            r308 = r0
            goto L5a
        L4f:
            r0 = r305
            r1 = r303
            r2 = r304
            r3 = r307
            java.lang.Object r0 = r0.A0T(r1, r2, r3)
            r308 = r0
        L5a:
            r0 = r301
            java.lang.reflect.Method r0 = r0.A00     // Catch: java.lang.Exception -> L75
            r307 = r0
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L75
            r1 = r0
            r2 = 0
            r3 = r308
            r1[r2] = r3     // Catch: java.lang.Exception -> L75
            r305 = r0
            r0 = r307
            r1 = r302
            r2 = r305
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Exception -> L75
        L74:
            return
        L75:
            r305 = move-exception
            r0 = r301
            r1 = r303
            r2 = r305
            r3 = r308
            r0.A0J(r1, r2, r3)
            X.0Q8 r0 = X.0Q8.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Jy5.A0L(java.lang.Object, X.3pi, X.27T):void");
    }

    public final void A0M(Object obj, Object obj2) {
        try {
            this.A00.invoke(obj, obj2);
        } catch (Exception e) {
            A0J((AbstractC01033pi) null, e, obj2);
            throw 0Q8.createAndThrow();
        }
    }

    public AbstractC00953pX AwU() {
        return this._annotated;
    }

    public Object readResolve() {
        return new Jy5(this, this._annotated.A00);
    }
}
