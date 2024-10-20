package com.fasterxml.jackson.databind.deser.std;

import X.0Q8;
import X.1BJ;
import X.AbstractC01033pi;
import X.C25m;
import X.C27T;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.math.BigDecimal;

/* loaded from: NumberDeserializers$BigDecimalDeserializer.class */
public class NumberDeserializers$BigDecimalDeserializer extends StdScalarDeserializer {
    public static final NumberDeserializers$BigDecimalDeserializer A00 = new NumberDeserializers$BigDecimalDeserializer();

    public NumberDeserializers$BigDecimalDeserializer() {
        super(BigDecimal.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public BigDecimal A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
        Object A0p;
        int A14 = abstractC01033pi.A14();
        if (A14 != 1) {
            if (A14 == 3) {
                A0p = A0p(abstractC01033pi, c27t);
            } else if (A14 == 6) {
                String A1Z = abstractC01033pi.A1Z();
                C25m A0g = A0g(c27t, A1Z);
                if (A0g != C25m.AsNull) {
                    if (A0g == C25m.AsEmpty) {
                        A0p = BigDecimal.ZERO;
                    } else {
                        String trim = A1Z.trim();
                        if (!"null".equals(trim)) {
                            try {
                                return new BigDecimal(trim);
                            } catch (IllegalArgumentException unused) {
                                c27t.A0l(this._valueClass, trim, 1BJ.A00(498), new Object[0]);
                                throw 0Q8.createAndThrow();
                            }
                        }
                    }
                }
                A0p = Azd(c27t);
            } else {
                if (A14 == 7 || A14 == 8) {
                    return abstractC01033pi.A1c();
                }
                JsonDeserializer.A05(abstractC01033pi, c27t, this);
            }
            return (BigDecimal) A0p;
        }
        c27t.A0Y(abstractC01033pi, this._valueClass);
        throw 0Q8.createAndThrow();
    }
}
