package com.fasterxml.jackson.databind.deser.std;

import X.0Q8;
import X.1BJ;
import X.AbstractC01033pi;
import X.C25m;
import X.C27T;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.math.BigInteger;

/* loaded from: NumberDeserializers$BigIntegerDeserializer.class */
public class NumberDeserializers$BigIntegerDeserializer extends StdScalarDeserializer {
    public static final NumberDeserializers$BigIntegerDeserializer A00 = new NumberDeserializers$BigIntegerDeserializer();

    public NumberDeserializers$BigIntegerDeserializer() {
        super(BigInteger.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public BigInteger A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
        Object A0p;
        if (abstractC01033pi.A1o()) {
            return abstractC01033pi.A1d();
        }
        int A14 = abstractC01033pi.A14();
        if (A14 != 1) {
            if (A14 == 3) {
                A0p = A0p(abstractC01033pi, c27t);
            } else if (A14 == 6) {
                String A1Z = abstractC01033pi.A1Z();
                C25m A0g = A0g(c27t, A1Z);
                if (A0g != C25m.AsNull) {
                    if (A0g != C25m.AsEmpty) {
                        String trim = A1Z.trim();
                        if (!"null".equals(trim)) {
                            try {
                                return new BigInteger(trim);
                            } catch (IllegalArgumentException unused) {
                                c27t.A0l(this._valueClass, trim, 1BJ.A00(498), new Object[0]);
                                throw 0Q8.createAndThrow();
                            }
                        }
                    }
                    A0p = BigInteger.ZERO;
                }
                A0p = Azd(c27t);
            } else if (A14 != 8) {
                JsonDeserializer.A05(abstractC01033pi, c27t, this);
            } else {
                C25m A0e = A0e(abstractC01033pi, c27t, this._valueClass);
                if (A0e != C25m.AsNull) {
                    if (A0e != C25m.AsEmpty) {
                        return abstractC01033pi.A1c().toBigInteger();
                    }
                    A0p = BigInteger.ZERO;
                }
                A0p = Azd(c27t);
            }
            return (BigInteger) A0p;
        }
        c27t.A0Y(abstractC01033pi, this._valueClass);
        throw 0Q8.createAndThrow();
    }
}
