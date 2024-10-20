package com.fasterxml.jackson.databind.deser.std;

import X.0Q8;
import X.AbstractC01033pi;
import X.C25m;
import X.C27T;
import X.C42h;
import X.C42x;
import com.fasterxml.jackson.databind.JsonDeserializer;

/* loaded from: NumberDeserializers$FloatDeserializer.class */
public class NumberDeserializers$FloatDeserializer extends NumberDeserializers$PrimitiveOrWrapperDeserializer {
    public static final NumberDeserializers$FloatDeserializer A00;
    public static final NumberDeserializers$FloatDeserializer A01;
    public static final long serialVersionUID = 1;

    /* JADX WARN: Type inference failed for: r0v4, types: [com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.NumberDeserializers$FloatDeserializer] */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.NumberDeserializers$FloatDeserializer] */
    static {
        Class cls = Float.TYPE;
        Float valueOf = Float.valueOf(0.0f);
        C42x c42x = C42x.Float;
        A00 = new NumberDeserializers$PrimitiveOrWrapperDeserializer(c42x, cls, valueOf, valueOf);
        A01 = new NumberDeserializers$PrimitiveOrWrapperDeserializer(c42x, Float.class, null, valueOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public Float A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
        float A13;
        Float f;
        Object A0p;
        if (!abstractC01033pi.A1u(C42h.A0A)) {
            if (this._primitive) {
                A13 = A0Z(abstractC01033pi, c27t);
                f = Float.valueOf(A13);
                return f;
            }
            int A14 = abstractC01033pi.A14();
            if (A14 != 1) {
                if (A14 != 3) {
                    if (A14 != 11) {
                        if (A14 == 6) {
                            String A1Z = abstractC01033pi.A1Z();
                            f = A0m(A1Z);
                            if (f == null) {
                                C25m A0g = A0g(c27t, A1Z);
                                if (A0g != C25m.AsNull) {
                                    if (A0g == C25m.AsEmpty) {
                                        A0p = this._emptyValue;
                                    } else {
                                        String trim = A1Z.trim();
                                        if (!A11(c27t, trim)) {
                                            try {
                                                return Float.valueOf(Float.parseFloat(trim));
                                            } catch (IllegalArgumentException unused) {
                                                c27t.A0l(this._valueClass, trim, "not a valid `Float` value", new Object[0]);
                                                throw 0Q8.createAndThrow();
                                            }
                                        }
                                    }
                                }
                            }
                            return f;
                        }
                        if (A14 != 7 && A14 != 8) {
                            JsonDeserializer.A05(abstractC01033pi, c27t, this);
                        }
                    }
                    A0p = Azd(c27t);
                } else {
                    A0p = A0p(abstractC01033pi, c27t);
                }
                return (Float) A0p;
            }
            c27t.A0Y(abstractC01033pi, this._valueClass);
            throw 0Q8.createAndThrow();
        }
        A13 = abstractC01033pi.A13();
        f = Float.valueOf(A13);
        return f;
    }
}
