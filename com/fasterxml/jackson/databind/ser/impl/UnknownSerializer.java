package com.fasterxml.jackson.databind.ser.impl;

import X.0Q8;
import X.26D;
import X.28Q;
import X.AnonymousClass001;
import X.C26c;
import X.C4Nr;
import com.fasterxml.jackson.databind.ser.std.ToEmptyObjectSerializer;

/* loaded from: UnknownSerializer.class */
public class UnknownSerializer extends ToEmptyObjectSerializer {
    public UnknownSerializer() {
        super(Object.class, false);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ToEmptyObjectSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public void A09(28Q r302, C26c c26c, C4Nr c4Nr, Object obj) {
        if (c26c._config.A0G(26D.A02)) {
            c26c.A0E(String.format("No serializer found for class %s and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS)", AnonymousClass001.A0Y(obj)), this._handledType);
            throw 0Q8.createAndThrow();
        }
        super.A09(r302, c26c, c4Nr, obj);
    }
}
