package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC01033pi;
import X.C27T;
import X.C42x;

/* loaded from: NumberDeserializers$LongDeserializer.class */
public final class NumberDeserializers$LongDeserializer extends NumberDeserializers$PrimitiveOrWrapperDeserializer {
    public static final NumberDeserializers$LongDeserializer A00;
    public static final NumberDeserializers$LongDeserializer A01;
    public static final long serialVersionUID = 1;

    /* JADX WARN: Type inference failed for: r0v4, types: [com.fasterxml.jackson.databind.deser.std.NumberDeserializers$LongDeserializer, com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer] */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.fasterxml.jackson.databind.deser.std.NumberDeserializers$LongDeserializer, com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer] */
    static {
        Class cls = Long.TYPE;
        C42x c42x = C42x.Integer;
        A00 = new NumberDeserializers$PrimitiveOrWrapperDeserializer(c42x, cls, 0L, 0L);
        A01 = new NumberDeserializers$PrimitiveOrWrapperDeserializer(c42x, Long.class, null, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public Long A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
        long A0b;
        if (abstractC01033pi.A1o()) {
            A0b = abstractC01033pi.A1A();
        } else {
            if (!this._primitive) {
                return A0o(abstractC01033pi, c27t, Long.class);
            }
            A0b = A0b(abstractC01033pi, c27t);
        }
        return Long.valueOf(A0b);
    }
}
