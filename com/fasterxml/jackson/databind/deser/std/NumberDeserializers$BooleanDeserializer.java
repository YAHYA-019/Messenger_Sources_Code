package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC01033pi;
import X.C27T;
import X.C42h;
import X.C42x;

/* loaded from: NumberDeserializers$BooleanDeserializer.class */
public final class NumberDeserializers$BooleanDeserializer extends NumberDeserializers$PrimitiveOrWrapperDeserializer {
    public static final NumberDeserializers$BooleanDeserializer A00;
    public static final NumberDeserializers$BooleanDeserializer A01;
    public static final long serialVersionUID = 1;

    /* JADX WARN: Type inference failed for: r0v3, types: [com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BooleanDeserializer, com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BooleanDeserializer, com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer] */
    static {
        Class cls = Boolean.TYPE;
        Boolean bool = Boolean.FALSE;
        C42x c42x = C42x.Boolean;
        A00 = new NumberDeserializers$PrimitiveOrWrapperDeserializer(c42x, cls, bool, bool);
        A01 = new NumberDeserializers$PrimitiveOrWrapperDeserializer(c42x, Boolean.class, null, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public Boolean A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
        C42h A1I = abstractC01033pi.A1I();
        return A1I == C42h.A0D ? Boolean.TRUE : A1I == C42h.A08 ? Boolean.FALSE : this._primitive ? Boolean.valueOf(A10(abstractC01033pi, c27t)) : A0k(abstractC01033pi, c27t, this._valueClass);
    }
}
