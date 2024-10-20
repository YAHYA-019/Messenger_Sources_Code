package com.fasterxml.jackson.databind.deser;

import X.0Q8;
import X.1BJ;
import X.24R;
import X.24S;
import X.27C;
import X.3eQ;
import X.68S;
import X.68U;
import X.7Rm;
import X.AbstractC00953pX;
import X.AbstractC01033pi;
import X.AnonymousClass001;
import X.AnonymousClass248;
import X.AnonymousClass437;
import X.C26G;
import X.C27T;
import X.C42x;
import X.C7Rt;
import X.JQx;
import X.JxY;
import X.JxZ;
import X.MCW;
import com.facebook.acra.constants.ActionId;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.Serializable;
import java.util.Map;

/* loaded from: AbstractDeserializer.class */
public class AbstractDeserializer extends JsonDeserializer implements AnonymousClass437, Serializable {
    public static final long serialVersionUID = 1;
    public transient Map A00;
    public final boolean _acceptBoolean;
    public final boolean _acceptDouble;
    public final boolean _acceptInt;
    public final boolean _acceptString;
    public final Map _backRefProperties;
    public final 24S _baseType;
    public final C7Rt _objectIdReader;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0049, code lost:
    
        if (r0.isAssignableFrom(java.lang.Boolean.class) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0070, code lost:
    
        if (r0.isAssignableFrom(java.lang.Integer.class) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AbstractDeserializer(X.AnonymousClass251 r302) {
        /*
            r301 = this;
            r0 = r301
            r0.<init>()
            r0 = r302
            X.24S r0 = r0.A05
            r303 = r0
            r0 = r301
            r1 = r303
            r0._baseType = r1
            r0 = r301
            r1 = 0
            r0._objectIdReader = r1
            r0 = r301
            r1 = 0
            r0._backRefProperties = r1
            r0 = r303
            java.lang.Class r0 = r0._class
            r304 = r0
            r0 = r304
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            boolean r0 = r0.isAssignableFrom(r1)
            r305 = r0
            r0 = r301
            r1 = r305
            r0._acceptString = r1
            java.lang.Class r0 = java.lang.Boolean.TYPE
            r306 = r0
            r0 = 0
            r307 = r0
            r0 = r304
            r1 = r306
            if (r0 == r1) goto L4c
            r0 = r304
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            boolean r0 = r0.isAssignableFrom(r1)
            r308 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r306 = r0
            r0 = r308
            if (r0 == 0) goto L4f
        L4c:
            r0 = 1
            r305 = r0
        L4f:
            r0 = r301
            r1 = r305
            r0._acceptBoolean = r1
            java.lang.Class r0 = java.lang.Integer.TYPE
            r306 = r0
            r0 = r304
            r1 = r306
            if (r0 == r1) goto L73
            r0 = r304
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            boolean r0 = r0.isAssignableFrom(r1)
            r308 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r306 = r0
            r0 = r308
            if (r0 == 0) goto L76
        L73:
            r0 = 1
            r305 = r0
        L76:
            r0 = r301
            r1 = r305
            r0._acceptInt = r1
            java.lang.Class r0 = java.lang.Double.TYPE
            r306 = r0
            r0 = r304
            r1 = r306
            if (r0 == r1) goto L98
            java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
            r306 = r0
            r0 = r304
            r1 = r306
            boolean r0 = r0.isAssignableFrom(r1)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L9b
        L98:
            r0 = 1
            r307 = r0
        L9b:
            r0 = r301
            r1 = r307
            r0._acceptDouble = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.AbstractDeserializer.<init>(X.251):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x005d, code lost:
    
        if (r0.isAssignableFrom(java.lang.Boolean.class) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0086, code lost:
    
        if (r0.isAssignableFrom(java.lang.Integer.class) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AbstractDeserializer(X.68X r302, X.AnonymousClass251 r303, java.util.Map r304, java.util.Map r305) {
        /*
            r301 = this;
            r0 = r301
            r0.<init>()
            r0 = r303
            X.24S r0 = r0.A05
            r306 = r0
            r0 = r301
            r1 = r306
            r0._baseType = r1
            r0 = r302
            X.7Rt r0 = r0.A03
            r307 = r0
            r0 = r301
            r1 = r307
            r0._objectIdReader = r1
            r0 = r301
            r1 = r304
            r0._backRefProperties = r1
            r0 = r301
            r1 = r305
            r0.A00 = r1
            r0 = r306
            java.lang.Class r0 = r0._class
            r308 = r0
            r0 = r308
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            boolean r0 = r0.isAssignableFrom(r1)
            r309 = r0
            r0 = r301
            r1 = r309
            r0._acceptString = r1
            java.lang.Class r0 = java.lang.Boolean.TYPE
            r307 = r0
            r0 = 0
            r310 = r0
            r0 = r308
            r1 = r307
            if (r0 == r1) goto L60
            r0 = r308
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            boolean r0 = r0.isAssignableFrom(r1)
            r311 = r0
            r0 = 0
            r309 = r0
            r0 = 0
            r307 = r0
            r0 = r311
            if (r0 == 0) goto L63
        L60:
            r0 = 1
            r309 = r0
        L63:
            r0 = r301
            r1 = r309
            r0._acceptBoolean = r1
            java.lang.Class r0 = java.lang.Integer.TYPE
            r307 = r0
            r0 = r308
            r1 = r307
            if (r0 == r1) goto L89
            r0 = r308
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            boolean r0 = r0.isAssignableFrom(r1)
            r311 = r0
            r0 = 0
            r309 = r0
            r0 = 0
            r307 = r0
            r0 = r311
            if (r0 == 0) goto L8c
        L89:
            r0 = 1
            r309 = r0
        L8c:
            r0 = r301
            r1 = r309
            r0._acceptInt = r1
            java.lang.Class r0 = java.lang.Double.TYPE
            r307 = r0
            r0 = r308
            r1 = r307
            if (r0 == r1) goto Lb0
            java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
            r307 = r0
            r0 = r308
            r1 = r307
            boolean r0 = r0.isAssignableFrom(r1)
            r309 = r0
            r0 = r309
            if (r0 == 0) goto Lb3
        Lb0:
            r0 = 1
            r310 = r0
        Lb3:
            r0 = r301
            r1 = r310
            r0._acceptDouble = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.AbstractDeserializer.<init>(X.68X, X.251, java.util.Map, java.util.Map):void");
    }

    public AbstractDeserializer(AbstractDeserializer abstractDeserializer, C7Rt c7Rt) {
        this._baseType = abstractDeserializer._baseType;
        this._backRefProperties = abstractDeserializer._backRefProperties;
        this._acceptString = abstractDeserializer._acceptString;
        this._acceptBoolean = abstractDeserializer._acceptBoolean;
        this._acceptInt = abstractDeserializer._acceptInt;
        this._acceptDouble = abstractDeserializer._acceptDouble;
        this._objectIdReader = c7Rt;
        this.A00 = null;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
        Class cls = this._baseType._class;
        if (c27t._config._problemHandlers != null) {
            throw AnonymousClass001.A0Q(1BJ.A00(1401));
        }
        c27t.A0E(String.format(1BJ.A00(664), 27C.A06(cls), "abstract types either need to be mapped to concrete types, have custom deserializer, or contain additional type information"), cls);
        throw 0Q8.createAndThrow();
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public 68S A0O(String str) {
        Map map = this._backRefProperties;
        if (map == null) {
            return null;
        }
        return (68S) map.get(str);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public C7Rt A0P() {
        return this._objectIdReader;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public C42x A0Q() {
        return C42x.POJO;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Class A0S() {
        return this._baseType._class;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x00f7. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0189  */
    /* JADX WARN: Type inference failed for: r0v82, types: [java.lang.Throwable, X.2cb, X.2LD, java.io.IOException, X.81f] */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A0T(X.AbstractC01033pi r302, X.C27T r303, X.C68e r304) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.AbstractDeserializer.A0T(X.3pi, X.27T, X.68e):java.lang.Object");
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public boolean A0W() {
        return true;
    }

    @Override // X.AnonymousClass437
    public JsonDeserializer AJM(68U r302, C27T c27t) {
        C7Rt c7Rt;
        AbstractC00953pX AwU;
        7Rm A0J;
        24S r311;
        3eQ A06;
        AnonymousClass248 A02 = c27t._config.A02();
        68S r306 = null;
        if (r302 != null && A02 != null && (AwU = r302.AwU()) != null && (A0J = A02.A0J(AwU)) != null) {
            MCW A07 = c27t.A07(A0J);
            7Rm A0K = A02.A0K(AwU, A0J);
            Class cls = A0K.A01;
            if (cls == JxY.class) {
                C26G c26g = A0K.A00;
                Map map = this.A00;
                if (map != null) {
                    r306 = (68S) map.get(c26g._simpleName);
                    if (r306 != null) {
                        r311 = r306._type;
                        A06 = new JxZ(A0K.A03);
                    }
                }
                24S r0 = this._baseType;
                JQx.A1I(c27t, r0, 1BJ.A00(ActionId.APP_FIRST_VIEW_CONTROLLER), new Object[]{27C.A06(r0._class), c26g == null ? "[null]" : 27C.A08(c26g._simpleName)});
                throw 0Q8.createAndThrow();
            }
            A07 = c27t.A07(A0K);
            r311 = 24R.A05(c27t.A0F(cls), 3eQ.class)[0];
            A06 = c27t.A06(A0K);
            c7Rt = new C7Rt(A06, A07, r311, c27t.A0J(r311), A0K.A00, r306);
        } else {
            if (this.A00 == null) {
                return this;
            }
            c7Rt = this._objectIdReader;
        }
        return new AbstractDeserializer(this, c7Rt);
    }
}
