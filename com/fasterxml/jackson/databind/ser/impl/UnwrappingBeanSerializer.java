package com.fasterxml.jackson.databind.ser.impl;

import X.0Q8;
import X.26D;
import X.28Q;
import X.C26c;
import X.C4Nr;
import X.JQx;
import X.JzF;
import X.Kl7;
import X.L1J;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import java.io.Serializable;
import java.util.Set;

/* loaded from: UnwrappingBeanSerializer.class */
public class UnwrappingBeanSerializer extends BeanSerializerBase implements Serializable {
    public static final long serialVersionUID = 1;
    public final L1J _nameTransformer;

    public UnwrappingBeanSerializer(Kl7 kl7, UnwrappingBeanSerializer unwrappingBeanSerializer) {
        super(kl7, unwrappingBeanSerializer, unwrappingBeanSerializer._propertyFilterId);
        this._nameTransformer = unwrappingBeanSerializer._nameTransformer;
    }

    public UnwrappingBeanSerializer(Kl7 kl7, UnwrappingBeanSerializer unwrappingBeanSerializer, Object obj) {
        super(kl7, unwrappingBeanSerializer, obj);
        this._nameTransformer = unwrappingBeanSerializer._nameTransformer;
    }

    public UnwrappingBeanSerializer(UnwrappingBeanSerializer unwrappingBeanSerializer, Set set, Set set2) {
        super(unwrappingBeanSerializer, set, set2);
        this._nameTransformer = unwrappingBeanSerializer._nameTransformer;
    }

    public UnwrappingBeanSerializer(UnwrappingBeanSerializer unwrappingBeanSerializer, JzF[] jzFArr, JzF[] jzFArr2) {
        super(unwrappingBeanSerializer, jzFArr, jzFArr2);
        this._nameTransformer = unwrappingBeanSerializer._nameTransformer;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public UnwrappingBeanSerializer(com.fasterxml.jackson.databind.ser.std.BeanSerializerBase r302, X.L1J r303) {
        /*
            r301 = this;
            r0 = r302
            X.JzF[] r0 = r0._props
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L55
            r0 = r304
            int r0 = r0.length
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L55
            r0 = r303
            if (r0 == 0) goto L55
            X.L1J r0 = X.L1J.A00
            r306 = r0
            r0 = r303
            r1 = r306
            if (r0 == r1) goto L55
            r0 = r305
            X.JzF[] r0 = new X.JzF[r0]
            r307 = r0
            r0 = 0
            r308 = r0
        L2b:
            r0 = r304
            r1 = r308
            r0 = r0[r1]
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L45
            r0 = r306
            r1 = r303
            X.JzF r0 = r0.A02(r1)
            r306 = r0
            r0 = r307
            r1 = r308
            r2 = r306
            r0[r1] = r2
        L45:
            r0 = r308
            r1 = 1
            int r0 = r0 + r1
            r308 = r0
            r0 = r308
            r1 = r305
            if (r0 < r1) goto L2b
            r0 = r307
            r304 = r0
        L55:
            r0 = r302
            X.JzF[] r0 = r0._filteredProps
            r309 = r0
            r0 = r309
            if (r0 == 0) goto Laf
            r0 = r309
            int r0 = r0.length
            r305 = r0
            r0 = r305
            if (r0 == 0) goto Laf
            r0 = r303
            if (r0 == 0) goto Laf
            X.L1J r0 = X.L1J.A00
            r306 = r0
            r0 = r303
            r1 = r306
            if (r0 == r1) goto Laf
            r0 = r305
            X.JzF[] r0 = new X.JzF[r0]
            r307 = r0
            r0 = 0
            r308 = r0
        L83:
            r0 = r309
            r1 = r308
            r0 = r0[r1]
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L9e
            r0 = r306
            r1 = r303
            X.JzF r0 = r0.A02(r1)
            r306 = r0
            r0 = r307
            r1 = r308
            r2 = r306
            r0[r1] = r2
        L9e:
            r0 = r308
            r1 = 1
            int r0 = r0 + r1
            r308 = r0
            r0 = r308
            r1 = r305
            if (r0 < r1) goto L83
            r0 = r307
            r309 = r0
        Laf:
            r0 = r301
            r1 = r302
            r2 = r304
            r3 = r309
            r0.<init>(r1, r2, r3)
            r0 = r301
            r1 = r303
            r0._nameTransformer = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer.<init>(com.fasterxml.jackson.databind.ser.std.BeanSerializerBase, X.L1J):void");
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public JsonSerializer A07(L1J l1j) {
        return new UnwrappingBeanSerializer(this, l1j);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public boolean A08() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.BeanSerializerBase, com.fasterxml.jackson.databind.JsonSerializer
    public void A09(28Q r302, C26c c26c, C4Nr c4Nr, Object obj) {
        if (c26c._config.A0G(26D.A04)) {
            c26c.A0E("Unwrapped property requires use of type information: cannot serialize without disabling `SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS`", this._handledType);
        } else {
            r302.A0O(obj);
            if (this._objectIdWriter != null) {
                A0G(r302, c26c, c4Nr, obj);
                return;
            }
            Object obj2 = this._propertyFilterId;
            if (obj2 == null) {
                A0H(r302, c26c, obj);
                return;
            }
            A0D(c26c, obj2);
        }
        throw 0Q8.createAndThrow();
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void A0A(28Q r302, C26c c26c, Object obj) {
        r302.A0O(obj);
        if (this._objectIdWriter != null) {
            A0I(r302, c26c, obj, false);
            return;
        }
        Object obj2 = this._propertyFilterId;
        if (obj2 != null) {
            A0D(c26c, obj2);
            throw 0Q8.createAndThrow();
        }
        A0H(r302, c26c, obj);
    }

    public String toString() {
        return JQx.A0v(this._handledType, "UnwrappingBeanSerializer for ");
    }
}
