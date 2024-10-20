package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC01033pi;
import X.C27T;
import X.C42x;

/* loaded from: NumberDeserializers$IntegerDeserializer.class */
public final class NumberDeserializers$IntegerDeserializer extends NumberDeserializers$PrimitiveOrWrapperDeserializer {
    public static final NumberDeserializers$IntegerDeserializer A00;
    public static final NumberDeserializers$IntegerDeserializer A01;
    public static final long serialVersionUID = 1;

    /* JADX WARN: Type inference failed for: r0v4, types: [com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer, com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer] */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer, com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer] */
    static {
        Class cls = Integer.TYPE;
        C42x c42x = C42x.Integer;
        A00 = new NumberDeserializers$PrimitiveOrWrapperDeserializer(c42x, cls, 0, 0);
        A01 = new NumberDeserializers$PrimitiveOrWrapperDeserializer(c42x, Integer.class, null, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public Integer A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
        int A0a;
        if (abstractC01033pi.A1o()) {
            A0a = abstractC01033pi.A15();
        } else {
            if (!this._primitive) {
                return A0n(abstractC01033pi, c27t, Integer.class);
            }
            A0a = A0a(abstractC01033pi, c27t);
        }
        return Integer.valueOf(A0a);
    }
}
