package com.fasterxml.jackson.databind.ser.std;

import X.0Pz;
import X.0Q8;
import X.1BL;
import X.24S;
import X.28Q;
import X.68U;
import X.AbstractC00953pX;
import X.AnonymousClass001;
import X.C26c;
import X.C27r;
import X.C2cb;
import X.C42h;
import X.C4Nr;
import X.Jyj;
import X.JzI;
import X.Kls;
import X.L2s;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: JsonValueSerializer.class */
public class JsonValueSerializer extends StdSerializer implements C27r {
    public transient L2s A00;
    public final AbstractC00953pX _accessor;
    public final boolean _forceTypeInformation;
    public final 68U _property;
    public final JsonSerializer _valueSerializer;
    public final 24S _valueType;
    public final C4Nr _valueTypeSerializer;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public JsonValueSerializer(X.68U r302, com.fasterxml.jackson.databind.JsonSerializer r303, X.C4Nr r304, com.fasterxml.jackson.databind.ser.std.JsonValueSerializer r305, boolean r306) {
        /*
            r301 = this;
            r0 = r305
            java.lang.Class r0 = r0._handledType
            r307 = r0
            r0 = r307
            if (r0 != 0) goto L10
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r307 = r0
        L10:
            r0 = r301
            r1 = r307
            r0.<init>(r1)
            r0 = r305
            X.3pX r0 = r0._accessor
            r307 = r0
            r0 = r301
            r1 = r307
            r0._accessor = r1
            r0 = r305
            X.24S r0 = r0._valueType
            r307 = r0
            r0 = r301
            r1 = r307
            r0._valueType = r1
            r0 = r301
            r1 = r304
            r0._valueTypeSerializer = r1
            r0 = r301
            r1 = r303
            r0._valueSerializer = r1
            r0 = r301
            r1 = r302
            r0._property = r1
            r0 = r301
            r1 = r306
            r0._forceTypeInformation = r1
            X.JzI r0 = X.JzI.A00
            r307 = r0
            r0 = r301
            r1 = r307
            r0.A00 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.JsonValueSerializer.<init>(X.68U, com.fasterxml.jackson.databind.JsonSerializer, X.4Nr, com.fasterxml.jackson.databind.ser.std.JsonValueSerializer, boolean):void");
    }

    public JsonValueSerializer(JsonSerializer jsonSerializer, AbstractC00953pX abstractC00953pX, C4Nr c4Nr) {
        super(abstractC00953pX.A03());
        this._accessor = abstractC00953pX;
        this._valueType = abstractC00953pX.A03();
        this._valueTypeSerializer = c4Nr;
        this._valueSerializer = jsonSerializer;
        this._property = null;
        this._forceTypeInformation = true;
        this.A00 = JzI.A00;
    }

    private JsonSerializer A03(C26c c26c, Class cls) {
        L2s A01;
        JsonSerializer A00 = this.A00.A00(cls);
        if (A00 == null) {
            24S r0 = this._valueType;
            if (r0.A0L()) {
                24S A0F = c26c.A0F(r0, cls);
                A00 = c26c.A0I(this._property, A0F);
                A01 = this.A00.A01(A00, A0F._class);
            } else {
                A00 = c26c.A0M(this._property, cls);
                A01 = this.A00.A01(A00, cls);
            }
            this.A00 = A01;
        }
        return A00;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void A09(28Q r302, C26c c26c, C4Nr c4Nr, Object obj) {
        try {
            Object A0B = this._accessor.A0B(obj);
            if (A0B == null) {
                c26c.A0W(r302);
                return;
            }
            JsonSerializer jsonSerializer = this._valueSerializer;
            if (jsonSerializer == null) {
                jsonSerializer = A03(c26c, A0B.getClass());
            } else if (this._forceTypeInformation) {
                Kls A0Z = 1BL.A0Z(r302, C42h.A0C, c4Nr, obj);
                jsonSerializer.A0A(r302, c26c, A0B);
                c4Nr.A02(r302, A0Z);
                return;
            }
            jsonSerializer.A09(r302, c26c, new Jyj(c4Nr, obj), A0B);
        } catch (Exception e) {
            StdSerializer.A01(c26c, obj, 0Pz.A0W(this._accessor.A05(), "()"), e);
            throw 0Q8.createAndThrow();
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void A0A(28Q r302, C26c c26c, Object obj) {
        try {
            Object A0B = this._accessor.A0B(obj);
            if (A0B == null) {
                c26c.A0W(r302);
                return;
            }
            JsonSerializer jsonSerializer = this._valueSerializer;
            if (jsonSerializer == null) {
                jsonSerializer = A03(c26c, A0B.getClass());
            }
            C4Nr c4Nr = this._valueTypeSerializer;
            if (c4Nr != null) {
                jsonSerializer.A09(r302, c26c, c4Nr, A0B);
            } else {
                jsonSerializer.A0A(r302, c26c, A0B);
            }
        } catch (Exception e) {
            StdSerializer.A01(c26c, obj, 0Pz.A0W(this._accessor.A05(), "()"), e);
            throw 0Q8.createAndThrow();
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public boolean A0B(C26c c26c, Object obj) {
        Object A0B = this._accessor.A0B(obj);
        if (A0B == null) {
            return true;
        }
        JsonSerializer jsonSerializer = this._valueSerializer;
        if (jsonSerializer == null) {
            try {
                jsonSerializer = A03(c26c, A0B.getClass());
            } catch (C2cb e) {
                throw new RuntimeException((Throwable) e);
            }
        }
        return jsonSerializer.A0B(c26c, A0B);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c8, code lost:
    
        if (r0 == r309) goto L33;
     */
    @Override // X.C27r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.databind.JsonSerializer AJN(X.68U r302, X.C26c r303) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.JsonValueSerializer.AJN(X.68U, X.26c):com.fasterxml.jackson.databind.JsonSerializer");
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("(@JsonValue serializer for method ");
        A0k.append(this._accessor.A0A());
        A0k.append("#");
        A0k.append(this._accessor.A05());
        return AnonymousClass001.A0d(")", A0k);
    }
}
