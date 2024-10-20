package com.fasterxml.jackson.datatype.guava.ser;

import X.1BL;
import X.24R;
import X.24S;
import X.28Q;
import X.68U;
import X.C26c;
import X.C27r;
import X.C42h;
import X.C4E6;
import X.C4Nr;
import X.JQy;
import X.Kls;
import X.L5M;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import java.lang.reflect.Modifier;
import java.util.Map;

/* loaded from: TableSerializer.class */
public class TableSerializer extends ContainerSerializer implements C27r {
    public static final long serialVersionUID = 1;
    public final JsonSerializer _columnSerializer;
    public final 68U _property;
    public final MapSerializer _rowMapSerializer;
    public final JsonSerializer _rowSerializer;
    public final 24S _type;
    public final JsonSerializer _valueSerializer;
    public final C4Nr _valueTypeSerializer;

    public TableSerializer(24S r302) {
        super(r302);
        this._type = r302;
        this._property = null;
        this._rowSerializer = null;
        this._columnSerializer = null;
        this._valueTypeSerializer = null;
        this._valueSerializer = null;
        this._rowMapSerializer = null;
    }

    public TableSerializer(C4Nr c4Nr, TableSerializer tableSerializer) {
        super(tableSerializer._handledType, false);
        this._type = tableSerializer._type;
        this._property = tableSerializer._property;
        this._rowSerializer = tableSerializer._rowSerializer;
        this._columnSerializer = tableSerializer._columnSerializer;
        this._valueTypeSerializer = c4Nr;
        this._valueSerializer = tableSerializer._valueSerializer;
        this._rowMapSerializer = tableSerializer._rowMapSerializer;
    }

    public TableSerializer(68U r302, JsonSerializer jsonSerializer, JsonSerializer jsonSerializer2, JsonSerializer jsonSerializer3, C4Nr c4Nr, 24R r307, TableSerializer tableSerializer) {
        super(tableSerializer._handledType, false);
        24S r0 = tableSerializer._type;
        this._type = r0;
        this._property = r302;
        this._rowSerializer = jsonSerializer;
        this._columnSerializer = jsonSerializer2;
        this._valueTypeSerializer = c4Nr;
        this._valueSerializer = jsonSerializer3;
        C4E6 A0B = r307.A0B(JQy.A0Z(r0, 1), JQy.A0Z(r0, 2), Map.class);
        this._rowMapSerializer = MapSerializer.A04(r307.A0B(JQy.A0Z(r0, 0), A0B, Map.class), jsonSerializer, MapSerializer.A04(A0B, jsonSerializer2, jsonSerializer3, c4Nr, null, null, null, false), null, null, null, null, false);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A09(28Q r302, C26c c26c, C4Nr c4Nr, Object obj) {
        L5M l5m = (L5M) obj;
        r302.A0O(l5m);
        Kls A0Z = 1BL.A0Z(r302, C42h.A06, c4Nr, l5m);
        this._rowMapSerializer.A0E(r302, c26c, l5m.A04());
        c4Nr.A02(r302, A0Z);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        L5M l5m = (L5M) obj;
        r302.A0m(l5m);
        if (!l5m.A05()) {
            this._rowMapSerializer.A0E(r302, c26c, l5m.A04());
        }
        r302.A0Y();
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ boolean A0B(C26c c26c, Object obj) {
        return ((L5M) obj).A05();
    }

    @Override // X.C27r
    public JsonSerializer AJN(68U r302, C26c c26c) {
        JsonSerializer jsonSerializer = this._valueSerializer;
        if (jsonSerializer == null) {
            24S A0Z = JQy.A0Z(this._type, 2);
            if (Modifier.isFinal(A0Z._class.getModifiers())) {
                jsonSerializer = c26c.A0J(r302, A0Z);
            }
        } else {
            jsonSerializer = JQy.A0b(r302, jsonSerializer, c26c, jsonSerializer instanceof C27r ? 1 : 0);
        }
        JsonSerializer jsonSerializer2 = this._rowSerializer;
        JsonSerializer A0H = jsonSerializer2 == null ? c26c.A0H(r302, JQy.A0Z(this._type, 0)) : JQy.A0b(r302, jsonSerializer2, c26c, jsonSerializer2 instanceof C27r ? 1 : 0);
        JsonSerializer jsonSerializer3 = this._columnSerializer;
        JsonSerializer A0H2 = jsonSerializer3 == null ? c26c.A0H(r302, JQy.A0Z(this._type, 1)) : JQy.A0b(r302, jsonSerializer3, c26c, jsonSerializer3 instanceof C27r ? 1 : 0);
        C4Nr c4Nr = this._valueTypeSerializer;
        if (c4Nr != null) {
            c4Nr = c4Nr.A04(r302);
        }
        return new TableSerializer(r302, A0H, A0H2, jsonSerializer, c4Nr, c26c.A0A(), this);
    }
}
