package com.fasterxml.jackson.databind.ser.std;

import X.68U;
import X.C25s;
import X.C26c;
import X.C27r;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: NumberSerializer.class */
public class NumberSerializer extends StdScalarSerializer implements C27r {
    public static final NumberSerializer A00 = new NumberSerializer(Number.class);
    public final boolean _isInt;

    /* loaded from: NumberSerializer$BigDecimalAsStringSerializer.class */
    public final class BigDecimalAsStringSerializer extends ToStringSerializerBase {
        public static final BigDecimalAsStringSerializer A00 = new BigDecimalAsStringSerializer();

        public BigDecimalAsStringSerializer() {
            super(BigDecimal.class, false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NumberSerializer(Class cls) {
        super(cls);
        boolean z = false;
        this._isInt = cls == BigInteger.class ? true : z;
    }

    @Override // X.C27r
    public JsonSerializer AJN(68U r302, C26c c26c) {
        C25s A002 = StdSerializer.A00(r302, c26c, this._handledType);
        return (A002 == null || A002._shape.ordinal() != 8) ? this : this._handledType == BigDecimal.class ? BigDecimalAsStringSerializer.A00 : ToStringSerializer.A00;
    }
}
