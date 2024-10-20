package com.fasterxml.jackson.databind.deser.std;

import X.0Q8;
import X.AbstractC01033pi;
import X.C25m;
import X.C27T;
import X.C42h;
import X.C42x;
import com.fasterxml.jackson.databind.JsonDeserializer;

/* loaded from: NumberDeserializers$DoubleDeserializer.class */
public class NumberDeserializers$DoubleDeserializer extends NumberDeserializers$PrimitiveOrWrapperDeserializer {
    public static final NumberDeserializers$DoubleDeserializer A00;
    public static final NumberDeserializers$DoubleDeserializer A01;
    public static final long serialVersionUID = 1;

    /* JADX WARN: Type inference failed for: r0v4, types: [com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.NumberDeserializers$DoubleDeserializer] */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.NumberDeserializers$DoubleDeserializer] */
    static {
        Class cls = Double.TYPE;
        Double valueOf = Double.valueOf(0.0d);
        C42x c42x = C42x.Float;
        A00 = new NumberDeserializers$PrimitiveOrWrapperDeserializer(c42x, cls, valueOf, valueOf);
        A01 = new NumberDeserializers$PrimitiveOrWrapperDeserializer(c42x, Double.class, null, valueOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public Double A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
        double A0Y;
        if (abstractC01033pi.A1u(C42h.A0A)) {
            A0Y = abstractC01033pi.A10();
        } else {
            if (!this._primitive) {
                return A01(abstractC01033pi, c27t, this);
            }
            A0Y = A0Y(abstractC01033pi, c27t);
        }
        return Double.valueOf(A0Y);
    }

    public static final Double A01(AbstractC01033pi abstractC01033pi, C27T c27t, NumberDeserializers$DoubleDeserializer numberDeserializers$DoubleDeserializer) {
        Object A0p;
        Double d;
        int A14 = abstractC01033pi.A14();
        if (A14 != 1) {
            if (A14 != 3) {
                if (A14 != 11) {
                    if (A14 == 6) {
                        String A1Z = abstractC01033pi.A1Z();
                        d = numberDeserializers$DoubleDeserializer.A0l(A1Z);
                        if (d == null) {
                            C25m A0g = numberDeserializers$DoubleDeserializer.A0g(c27t, A1Z);
                            if (A0g != C25m.AsNull) {
                                if (A0g == C25m.AsEmpty) {
                                    A0p = numberDeserializers$DoubleDeserializer._emptyValue;
                                } else {
                                    String trim = A1Z.trim();
                                    if (!numberDeserializers$DoubleDeserializer.A11(c27t, trim)) {
                                        try {
                                            return Double.valueOf("2.2250738585072012e-308".equals(trim) ? Double.MIN_NORMAL : Double.parseDouble(trim));
                                        } catch (IllegalArgumentException unused) {
                                            c27t.A0l(numberDeserializers$DoubleDeserializer._valueClass, trim, "not a valid `Double` value", new Object[0]);
                                            throw 0Q8.createAndThrow();
                                        }
                                    }
                                }
                            }
                        }
                        return d;
                    }
                    if (A14 == 7 || A14 == 8) {
                        return Double.valueOf(abstractC01033pi.A10());
                    }
                    JsonDeserializer.A05(abstractC01033pi, c27t, numberDeserializers$DoubleDeserializer);
                }
                A0p = numberDeserializers$DoubleDeserializer.Azd(c27t);
            } else {
                A0p = numberDeserializers$DoubleDeserializer.A0p(abstractC01033pi, c27t);
            }
            d = (Double) A0p;
            return d;
        }
        c27t.A0Y(abstractC01033pi, numberDeserializers$DoubleDeserializer._valueClass);
        throw 0Q8.createAndThrow();
    }
}
