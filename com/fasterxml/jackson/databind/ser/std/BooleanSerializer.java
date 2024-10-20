package com.fasterxml.jackson.databind.ser.std;

import X.28Q;
import X.68U;
import X.C25s;
import X.C25t;
import X.C26c;
import X.C27r;
import X.C4Nr;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: BooleanSerializer.class */
public final class BooleanSerializer extends StdScalarSerializer implements C27r {
    public static final long serialVersionUID = 1;
    public final boolean _forPrimitive;

    /* loaded from: BooleanSerializer$AsNumber.class */
    public final class AsNumber extends StdScalarSerializer implements C27r {
        public static final long serialVersionUID = 1;
        public final boolean _forPrimitive;

        public AsNumber(boolean z) {
            super(z ? Boolean.TYPE : Boolean.class);
            this._forPrimitive = z;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.JsonSerializer
        public final void A09(28Q r302, C26c c26c, C4Nr c4Nr, Object obj) {
            r302.A0v(Boolean.TRUE.equals(obj));
        }

        @Override // X.C27r
        public JsonSerializer AJN(68U r302, C26c c26c) {
            C25s A00 = StdSerializer.A00(r302, c26c, Boolean.class);
            return (A00 == null || A00._shape.A00()) ? this : new BooleanSerializer(this._forPrimitive);
        }
    }

    public BooleanSerializer(boolean z) {
        super(z ? Boolean.TYPE : Boolean.class);
        this._forPrimitive = z;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public final void A09(28Q r302, C26c c26c, C4Nr c4Nr, Object obj) {
        r302.A0v(Boolean.TRUE.equals(obj));
    }

    @Override // X.C27r
    public JsonSerializer AJN(68U r302, C26c c26c) {
        C25s A00 = StdSerializer.A00(r302, c26c, this._handledType);
        if (A00 != null) {
            C25t c25t = A00._shape;
            if (c25t.A00()) {
                return new AsNumber(this._forPrimitive);
            }
            if (c25t == C25t.STRING) {
                return new StdSerializer(this._handledType, false);
            }
        }
        return this;
    }
}
