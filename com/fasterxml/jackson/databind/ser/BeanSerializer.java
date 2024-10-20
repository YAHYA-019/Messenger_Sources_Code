package com.fasterxml.jackson.databind.ser;

import X.0Q8;
import X.28Q;
import X.C26c;
import X.JQx;
import X.L1J;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;

/* loaded from: BeanSerializer.class */
public class BeanSerializer extends BeanSerializerBase {
    public static final long serialVersionUID = 29;

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public JsonSerializer A07(L1J l1j) {
        return new UnwrappingBeanSerializer(this, l1j);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void A0A(28Q r302, C26c c26c, Object obj) {
        if (this._objectIdWriter != null) {
            r302.A0O(obj);
            A0I(r302, c26c, obj, true);
            return;
        }
        r302.A0m(obj);
        Object obj2 = this._propertyFilterId;
        if (obj2 != null) {
            A0D(c26c, obj2);
            throw 0Q8.createAndThrow();
        }
        A0H(r302, c26c, obj);
        r302.A0Y();
    }

    public String toString() {
        return JQx.A0v(this._handledType, "BeanSerializer for ");
    }
}
