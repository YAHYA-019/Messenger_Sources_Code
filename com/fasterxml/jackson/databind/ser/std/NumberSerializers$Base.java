package com.fasterxml.jackson.databind.ser.std;

import X.68U;
import X.C25s;
import X.C26c;
import X.C27n;
import X.C27r;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializer;
import java.math.BigDecimal;

/* loaded from: NumberSerializers$Base.class */
public abstract class NumberSerializers$Base extends StdScalarSerializer implements C27r {
    public final boolean _isInt;
    public final C27n _numberType;
    public final String _schemaType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NumberSerializers$Base(C27n c27n, Class cls, String str) {
        super(cls);
        boolean z = false;
        this._numberType = c27n;
        this._schemaType = str;
        this._isInt = (c27n == C27n.INT || c27n == C27n.LONG || c27n == C27n.BIG_INTEGER) ? true : z;
    }

    @Override // X.C27r
    public JsonSerializer AJN(68U r302, C26c c26c) {
        C25s A00 = StdSerializer.A00(r302, c26c, this._handledType);
        return (A00 == null || A00._shape.ordinal() != 8) ? this : this._handledType == BigDecimal.class ? NumberSerializer.BigDecimalAsStringSerializer.A00 : ToStringSerializer.A00;
    }
}
