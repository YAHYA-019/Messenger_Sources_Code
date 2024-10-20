package com.fasterxml.jackson.databind;

import X.0Q8;
import X.AnonymousClass001;
import X.C26c;
import X.L1J;
import com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase;
import com.fasterxml.jackson.databind.ser.std.NumberSerializer;
import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import com.fasterxml.jackson.databind.ser.std.StringSerializer;
import com.fasterxml.jackson.databind.ser.std.ToEmptyObjectSerializer;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializerBase;
import com.fasterxml.jackson.databind.ser.std.UUIDSerializer;
import com.fasterxml.jackson.datatype.guava.ser.CacheSerializer;
import java.util.UUID;

/* loaded from: JsonSerializer.class */
public abstract class JsonSerializer {

    /* loaded from: JsonSerializer$None.class */
    public abstract class None extends JsonSerializer {
        public None() {
            throw 0Q8.createAndThrow();
        }
    }

    public boolean A06() {
        return false;
    }

    public JsonSerializer A07(L1J l1j) {
        return this;
    }

    public boolean A08() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        if (r308 == null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A09(X.28Q r302, X.C26c r303, X.C4Nr r304, java.lang.Object r305) {
        /*
            r301 = this;
            r0 = r301
            r306 = r0
            r0 = r301
            boolean r0 = r0 instanceof com.fasterxml.jackson.databind.ser.std.StdSerializer
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L59
            r0 = r301
            com.fasterxml.jackson.databind.ser.std.StdSerializer r0 = (com.fasterxml.jackson.databind.ser.std.StdSerializer) r0
            r306 = r0
            r0 = r306
            java.lang.Class r0 = r0._handledType
            r308 = r0
        L1b:
            r0 = r308
            if (r0 != 0) goto L27
        L20:
            r0 = r305
            java.lang.Class r0 = r0.getClass()
            r308 = r0
        L27:
            r0 = r308
            java.lang.String r0 = r0.getName()
            r306 = r0
            r0 = r301
            java.lang.String r0 = X.AnonymousClass001.A0Y(r0)
            r309 = r0
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = r0
            r2 = 0
            r3 = r306
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = r309
            r1[r2] = r3
            r306 = r0
            java.lang.String r0 = "Type id handling not implemented for type %s (by serializer of type %s)"
            r1 = r306
            java.lang.String r0 = java.lang.String.format(r0, r1)
            r309 = r0
            r0 = r303
            r1 = r309
            r2 = r308
            r0.A0E(r1, r2)
            X.0Q8 r0 = X.0Q8.createAndThrow()
            throw r0
        L59:
            r0 = r301
            boolean r0 = r0 instanceof com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L20
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r308 = r0
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.JsonSerializer.A09(X.28Q, X.26c, X.4Nr, java.lang.Object):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0c2a, code lost:
    
        if (r306._customFormat == null) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x0fd3, code lost:
    
        r306.A0F(r302, r303, r304);
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0fdb, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0c58, code lost:
    
        if (r306.A0G(r303) != false) goto L284;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0A(X.28Q r302, X.C26c r303, java.lang.Object r304) {
        /*
            Method dump skipped, instructions count: 4176
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.JsonSerializer.A0A(X.28Q, X.26c, java.lang.Object):void");
    }

    public boolean A0B(C26c c26c, Object obj) {
        boolean z;
        if ((this instanceof CacheSerializer) || (this instanceof ToEmptyObjectSerializer)) {
            return true;
        }
        if (this instanceof StdDelegatingSerializer) {
            StdDelegatingSerializer stdDelegatingSerializer = (StdDelegatingSerializer) this;
            Object AI5 = stdDelegatingSerializer._converter.AI5(obj);
            z = true;
            if (AI5 != null) {
                JsonSerializer jsonSerializer = stdDelegatingSerializer._delegateSerializer;
                if (jsonSerializer != null) {
                    return jsonSerializer.A0B(c26c, AI5);
                }
                if (obj != null) {
                    return false;
                }
            }
        } else {
            if (this instanceof ToStringSerializerBase) {
                ToStringSerializerBase toStringSerializerBase = (ToStringSerializerBase) this;
                if (toStringSerializerBase instanceof NumberSerializer.BigDecimalAsStringSerializer) {
                    return false;
                }
                if (toStringSerializerBase instanceof ToStringSerializer) {
                    return obj.toString().isEmpty();
                }
                throw new IllegalStateException();
            }
            if (!(this instanceof UUIDSerializer)) {
                if (this instanceof StringSerializer) {
                    return ((String) obj).isEmpty();
                }
                if (this instanceof DateTimeSerializerBase) {
                    return false;
                }
                return AnonymousClass001.A1U(obj);
            }
            UUID uuid = (UUID) obj;
            if (uuid.getLeastSignificantBits() != 0) {
                return false;
            }
            z = true;
            if (uuid.getMostSignificantBits() != 0) {
                return false;
            }
        }
        return z;
    }
}
