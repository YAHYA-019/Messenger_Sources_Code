package com.fasterxml.jackson.databind.ser.std;

import X.24S;
import X.27C;
import X.28Q;
import X.68U;
import X.C26c;
import X.C27r;
import X.C3m9;
import X.C43M;
import X.C4Nr;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: StdDelegatingSerializer.class */
public class StdDelegatingSerializer extends StdSerializer implements C27r, C43M {
    public final C3m9 _converter;
    public final JsonSerializer _delegateSerializer;
    public final 24S _delegateType;

    public StdDelegatingSerializer(24S r302, JsonSerializer jsonSerializer, C3m9 c3m9) {
        super(r302);
        this._converter = c3m9;
        this._delegateType = r302;
        this._delegateSerializer = jsonSerializer;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void A09(28Q r302, C26c c26c, C4Nr c4Nr, Object obj) {
        Object AI5 = this._converter.AI5(obj);
        JsonSerializer jsonSerializer = this._delegateSerializer;
        if (jsonSerializer == null) {
            jsonSerializer = c26c.A0S(obj.getClass());
        }
        jsonSerializer.A09(r302, c26c, c4Nr, AI5);
    }

    @Override // X.C27r
    public JsonSerializer AJN(68U r302, C26c c26c) {
        JsonSerializer jsonSerializer = this._delegateSerializer;
        24S r305 = this._delegateType;
        if (jsonSerializer == null) {
            if (r305 == null) {
                r305 = this._converter.B0m(c26c.A0A());
            }
            if (r305._class != Object.class) {
                jsonSerializer = c26c.A0Q(r305);
            }
        }
        if (jsonSerializer instanceof C27r) {
            jsonSerializer = c26c.A0K(r302, jsonSerializer);
        }
        if (jsonSerializer == this._delegateSerializer && r305 == this._delegateType) {
            return this;
        }
        C3m9 c3m9 = this._converter;
        27C.A0F(StdDelegatingSerializer.class, this, "withDelegate");
        return new StdDelegatingSerializer(r305, jsonSerializer, c3m9);
    }

    @Override // X.C43M
    public void Chu(C26c c26c) {
        Object obj = this._delegateSerializer;
        if (obj == null || !(obj instanceof C43M)) {
            return;
        }
        ((C43M) obj).Chu(c26c);
    }
}
