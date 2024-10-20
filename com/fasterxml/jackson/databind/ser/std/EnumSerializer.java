package com.fasterxml.jackson.databind.ser.std;

import X.1BK;
import X.2Go;
import X.3eT;
import X.68U;
import X.C25s;
import X.C25t;
import X.C26c;
import X.C27r;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: EnumSerializer.class */
public class EnumSerializer extends StdScalarSerializer implements C27r {
    public static final long serialVersionUID = 1;
    public final Boolean _serializeAsIndex;
    public final 3eT _values;

    public EnumSerializer(3eT r302, Boolean bool) {
        super(r302._enumClass);
        this._values = r302;
        this._serializeAsIndex = bool;
    }

    public static Boolean A03(C25s c25s, Boolean bool, Class cls, boolean z) {
        C25t c25t = c25s._shape;
        if (c25t != null && c25t != C25t.ANY && c25t != C25t.SCALAR) {
            if (c25t != C25t.STRING && c25t != C25t.NATURAL) {
                if (c25t.A00() || c25t == C25t.ARRAY) {
                    return Boolean.TRUE;
                }
                throw 1BK.A0f("Unsupported serialization shape (%s) for Enum %s, not supported as %s annotation", new Object[]{c25t, cls.getName(), z ? "class" : "property"});
            }
            bool = Boolean.FALSE;
        }
        return bool;
    }

    @Override // X.C27r
    public JsonSerializer AJN(68U r302, C26c c26c) {
        C25s A00 = StdSerializer.A00(r302, c26c, this._handledType);
        if (A00 != null) {
            Class cls = this._handledType;
            Boolean bool = this._serializeAsIndex;
            Boolean A03 = A03(A00, bool, cls, false);
            if (!2Go.A00(A03, bool)) {
                return new EnumSerializer(this._values, A03);
            }
        }
        return this;
    }
}
