package com.fasterxml.jackson.databind.ser.std;

import X.24S;
import X.3Bx;
import X.68U;
import X.AnonymousClass001;
import X.C25d;
import X.C26c;
import X.C27r;
import X.C2cb;
import X.C4Nr;
import X.JzI;
import X.Jzp;
import X.L1J;
import X.L2s;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.datatype.guava.ser.GuavaOptionalSerializer;
import com.google.common.base.Optional;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: ReferenceTypeSerializer.class */
public abstract class ReferenceTypeSerializer extends StdSerializer implements C27r {
    public static final Object A01 = C25d.NON_EMPTY;
    public static final long serialVersionUID = 1;
    public transient L2s A00;
    public final 68U _property;
    public final 24S _referredType;
    public final boolean _suppressNulls;
    public final Object _suppressableValue;
    public final L1J _unwrapper;
    public final JsonSerializer _valueSerializer;
    public final C4Nr _valueTypeSerializer;

    public ReferenceTypeSerializer(68U r302, JsonSerializer jsonSerializer, C4Nr c4Nr, ReferenceTypeSerializer referenceTypeSerializer, L1J l1j, Object obj, boolean z) {
        super(referenceTypeSerializer);
        this._referredType = referenceTypeSerializer._referredType;
        this.A00 = JzI.A00;
        this._property = r302;
        this._valueTypeSerializer = c4Nr;
        this._valueSerializer = jsonSerializer;
        this._unwrapper = l1j;
        this._suppressableValue = obj;
        this._suppressNulls = z;
    }

    public ReferenceTypeSerializer(JsonSerializer jsonSerializer, C4Nr c4Nr, 3Bx r304) {
        super((24S) r304);
        this._referredType = r304._referencedType;
        this._property = null;
        this._valueTypeSerializer = c4Nr;
        this._valueSerializer = jsonSerializer;
        this._unwrapper = null;
        this._suppressableValue = null;
        this._suppressNulls = false;
        this.A00 = JzI.A00;
    }

    private final JsonSerializer A03(C26c c26c, Class cls) {
        JsonSerializer A00 = this.A00.A00(cls);
        if (A00 == null) {
            24S r0 = this._referredType;
            if (r0.A0L()) {
                A00 = c26c.A0I(this._property, c26c.A0F(r0, cls));
            } else {
                A00 = c26c.A0M(this._property, cls);
            }
            L1J l1j = this._unwrapper;
            if (l1j != null) {
                A00 = A00.A07(l1j);
            }
            this.A00 = this.A00.A01(A00, cls);
        }
        return A00;
    }

    private ReferenceTypeSerializer A0E(68U r302, JsonSerializer jsonSerializer, C4Nr c4Nr, L1J l1j) {
        return this instanceof GuavaOptionalSerializer ? (this._property == r302 && this._valueTypeSerializer == c4Nr && this._valueSerializer == jsonSerializer && this._unwrapper == l1j) ? this : new ReferenceTypeSerializer(r302, jsonSerializer, c4Nr, this, l1j, this._suppressableValue, this._suppressNulls) : new ReferenceTypeSerializer(r302, jsonSerializer, c4Nr, this, l1j, this._suppressableValue, this._suppressNulls);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public JsonSerializer A07(L1J l1j) {
        JsonSerializer jsonSerializer = this._valueSerializer;
        JsonSerializer jsonSerializer2 = jsonSerializer;
        if (jsonSerializer != null) {
            jsonSerializer = jsonSerializer.A07(l1j);
            jsonSerializer2 = this._valueSerializer;
            if (jsonSerializer == jsonSerializer2) {
                return this;
            }
        }
        L1J l1j2 = this._unwrapper;
        if (l1j2 != null) {
            l1j = new Jzp(l1j, l1j2);
        }
        if (jsonSerializer2 == jsonSerializer && l1j2 == l1j) {
            return this;
        }
        return A0E(this._property, jsonSerializer, this._valueTypeSerializer, l1j);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public boolean A08() {
        return AnonymousClass001.A1T(this._unwrapper);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    @Override // com.fasterxml.jackson.databind.JsonSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A09(X.28Q r302, X.C26c r303, X.C4Nr r304, java.lang.Object r305) {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0 instanceof com.fasterxml.jackson.datatype.guava.ser.GuavaOptionalSerializer
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L6a
            r0 = r305
            com.google.common.base.Optional r0 = (com.google.common.base.Optional) r0
            r305 = r0
            r0 = r305
            boolean r0 = r0.isPresent()
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L56
            r0 = r305
            java.lang.Object r0 = r0.get()
            r307 = r0
        L25:
            r0 = r307
            if (r0 == 0) goto L56
            r0 = r301
            com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer r0 = (com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer) r0
            com.fasterxml.jackson.databind.JsonSerializer r0 = r0._valueSerializer
            r308 = r0
            r0 = r308
            if (r0 != 0) goto L4b
            r0 = r307
            java.lang.Class r0 = r0.getClass()
            r308 = r0
            r0 = r301
            com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer r0 = (com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer) r0
            r1 = r303
            r2 = r308
            com.fasterxml.jackson.databind.JsonSerializer r0 = r0.A03(r1, r2)
            r308 = r0
        L4b:
            r0 = r308
            r1 = r302
            r2 = r303
            r3 = r304
            r4 = r307
            r0.A09(r1, r2, r3, r4)
        L55:
            return
        L56:
            r0 = r301
            com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer r0 = (com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer) r0
            X.L1J r0 = r0._unwrapper
            r308 = r0
            r0 = r308
            if (r0 != 0) goto L55
            r0 = r303
            r1 = r302
            r0.A0W(r1)
            return
        L6a:
            r0 = r305
            java.util.concurrent.atomic.AtomicReference r0 = (java.util.concurrent.atomic.AtomicReference) r0
            r305 = r0
            r0 = r305
            java.lang.Object r0 = r0.get()
            r307 = r0
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer.A09(X.28Q, X.26c, X.4Nr, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // com.fasterxml.jackson.databind.JsonSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0A(X.28Q r302, X.C26c r303, java.lang.Object r304) {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0 instanceof com.fasterxml.jackson.datatype.guava.ser.GuavaOptionalSerializer
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L75
            r0 = r304
            com.google.common.base.Optional r0 = (com.google.common.base.Optional) r0
            r304 = r0
            r0 = r304
            boolean r0 = r0.isPresent()
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L61
            r0 = r304
            java.lang.Object r0 = r0.get()
            r306 = r0
        L21:
            r0 = r306
            if (r0 == 0) goto L61
            r0 = r301
            com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer r0 = (com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer) r0
            com.fasterxml.jackson.databind.JsonSerializer r0 = r0._valueSerializer
            r307 = r0
            r0 = r307
            if (r0 != 0) goto L47
            r0 = r306
            java.lang.Class r0 = r0.getClass()
            r308 = r0
            r0 = r301
            com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer r0 = (com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer) r0
            r1 = r303
            r2 = r308
            com.fasterxml.jackson.databind.JsonSerializer r0 = r0.A03(r1, r2)
            r307 = r0
        L47:
            r0 = r301
            com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer r0 = (com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer) r0
            X.4Nr r0 = r0._valueTypeSerializer
            r308 = r0
            r0 = r308
            if (r0 == 0) goto L83
            r0 = r307
            r1 = r302
            r2 = r303
            r3 = r308
            r4 = r306
            r0.A09(r1, r2, r3, r4)
        L60:
            return
        L61:
            r0 = r301
            com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer r0 = (com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer) r0
            X.L1J r0 = r0._unwrapper
            r308 = r0
            r0 = r308
            if (r0 != 0) goto L60
            r0 = r303
            r1 = r302
            r0.A0W(r1)
            return
        L75:
            r0 = r304
            java.util.concurrent.atomic.AtomicReference r0 = (java.util.concurrent.atomic.AtomicReference) r0
            r304 = r0
            r0 = r304
            java.lang.Object r0 = r0.get()
            r306 = r0
            goto L21
        L83:
            r0 = r307
            r1 = r302
            r2 = r303
            r3 = r306
            r0.A0A(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer.A0A(X.28Q, X.26c, java.lang.Object):void");
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public boolean A0B(C26c c26c, Object obj) {
        boolean z = this instanceof GuavaOptionalSerializer;
        if (!(z ? ((Optional) obj).isPresent() : AnonymousClass001.A1T(((AtomicReference) obj).get()))) {
            return true;
        }
        Object obj2 = z ? ((Optional) obj).get() : ((AtomicReference) obj).get();
        if (obj2 == null) {
            return this._suppressNulls;
        }
        if (this._suppressableValue == null) {
            return false;
        }
        JsonSerializer jsonSerializer = this._valueSerializer;
        if (jsonSerializer == null) {
            try {
                jsonSerializer = A03(c26c, obj2.getClass());
            } catch (C2cb e) {
                throw new RuntimeException((Throwable) e);
            }
        }
        Object obj3 = this._suppressableValue;
        return obj3 == A01 ? jsonSerializer.A0B(c26c, obj2) : obj3.equals(obj2);
    }

    public ReferenceTypeSerializer A0F(Object obj, boolean z) {
        boolean z2 = this instanceof GuavaOptionalSerializer;
        68U r0 = this._property;
        C4Nr c4Nr = this._valueTypeSerializer;
        JsonSerializer jsonSerializer = this._valueSerializer;
        L1J l1j = this._unwrapper;
        return z2 ? new ReferenceTypeSerializer(r0, jsonSerializer, c4Nr, this, l1j, obj, z) : new ReferenceTypeSerializer(r0, jsonSerializer, c4Nr, this, l1j, obj, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
    
        if (r307 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01b6, code lost:
    
        if (r301._referredType.A04() != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00c5, code lost:
    
        if (r0 == X.3Db.A01) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01fa, code lost:
    
        if (r303._config.A09(X.AnonymousClass260.A0S) != false) goto L72;
     */
    @Override // X.C27r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.databind.JsonSerializer AJN(X.68U r302, X.C26c r303) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer.AJN(X.68U, X.26c):com.fasterxml.jackson.databind.JsonSerializer");
    }
}
