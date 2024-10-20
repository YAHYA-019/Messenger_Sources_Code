package com.fasterxml.jackson.databind.ser.impl;

import X.0Q8;
import X.1BL;
import X.24S;
import X.28Q;
import X.68U;
import X.AnonymousClass001;
import X.C25d;
import X.C26c;
import X.C27r;
import X.C2cb;
import X.C42h;
import X.C4Nr;
import X.JzI;
import X.Kls;
import X.L2s;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.util.Map;

/* loaded from: MapEntrySerializer.class */
public class MapEntrySerializer extends ContainerSerializer implements C27r {
    public static final Object A00 = C25d.NON_EMPTY;
    public L2s _dynamicValueSerializers;
    public final 24S _entryType;
    public JsonSerializer _keySerializer;
    public final 24S _keyType;
    public final 68U _property;
    public final boolean _suppressNulls;
    public final Object _suppressableValue;
    public JsonSerializer _valueSerializer;
    public final 24S _valueType;
    public final boolean _valueTypeIsStatic;
    public final C4Nr _valueTypeSerializer;

    public MapEntrySerializer(68U r302, 24S r303, 24S r304, 24S r305, C4Nr c4Nr, boolean z) {
        super(r303);
        this._entryType = r303;
        this._keyType = r304;
        this._valueType = r305;
        this._valueTypeIsStatic = z;
        this._valueTypeSerializer = c4Nr;
        this._property = r302;
        this._dynamicValueSerializers = JzI.A00;
        this._suppressableValue = null;
        this._suppressNulls = false;
    }

    public MapEntrySerializer(JsonSerializer jsonSerializer, JsonSerializer jsonSerializer2, MapEntrySerializer mapEntrySerializer, Object obj, boolean z) {
        super(Map.class, false);
        this._entryType = mapEntrySerializer._entryType;
        this._keyType = mapEntrySerializer._keyType;
        this._valueType = mapEntrySerializer._valueType;
        this._valueTypeIsStatic = mapEntrySerializer._valueTypeIsStatic;
        this._valueTypeSerializer = mapEntrySerializer._valueTypeSerializer;
        this._keySerializer = jsonSerializer;
        this._valueSerializer = jsonSerializer2;
        this._dynamicValueSerializers = JzI.A00;
        this._property = mapEntrySerializer._property;
        this._suppressableValue = obj;
        this._suppressNulls = z;
    }

    private void A03(28Q r302, C26c c26c, Map.Entry entry) {
        JsonSerializer jsonSerializer;
        L2s A01;
        C4Nr c4Nr = this._valueTypeSerializer;
        Object key = entry.getKey();
        JsonSerializer jsonSerializer2 = key == null ? c26c._nullKeySerializer : this._keySerializer;
        Object value = entry.getValue();
        if (value != null) {
            jsonSerializer = this._valueSerializer;
            if (jsonSerializer == null) {
                Class<?> cls = value.getClass();
                L2s l2s = this._dynamicValueSerializers;
                jsonSerializer = l2s.A00(cls);
                if (jsonSerializer == null) {
                    24S r0 = this._valueType;
                    if (r0.A0L()) {
                        24S A0F = c26c.A0F(r0, cls);
                        jsonSerializer = c26c.A0G(this._property, A0F);
                        A01 = l2s.A01(jsonSerializer, A0F._class);
                    } else {
                        jsonSerializer = c26c.A0L(this._property, cls);
                        A01 = l2s.A01(jsonSerializer, cls);
                    }
                    if (l2s != A01) {
                        this._dynamicValueSerializers = A01;
                    }
                }
            }
            Object obj = this._suppressableValue;
            if (obj != null && ((obj == A00 && jsonSerializer.A0B(c26c, value)) || this._suppressableValue.equals(value))) {
                return;
            }
        } else if (this._suppressNulls) {
            return;
        } else {
            jsonSerializer = c26c._nullValueSerializer;
        }
        jsonSerializer2.A0A(r302, c26c, key);
        try {
            if (c4Nr == null) {
                jsonSerializer.A0A(r302, c26c, value);
            } else {
                jsonSerializer.A09(r302, c26c, c4Nr, value);
            }
        } catch (Exception e) {
            StdSerializer.A01(c26c, entry, AnonymousClass001.A0Z(key, "", AnonymousClass001.A0k()), e);
            throw 0Q8.createAndThrow();
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A09(28Q r302, C26c c26c, C4Nr c4Nr, Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        r302.A0O(entry);
        Kls A0Z = 1BL.A0Z(r302, C42h.A06, c4Nr, entry);
        A03(r302, c26c, entry);
        c4Nr.A02(r302, A0Z);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        r302.A0m(entry);
        A03(r302, c26c, entry);
        r302.A0Y();
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ boolean A0B(C26c c26c, Object obj) {
        Object value = ((Map.Entry) obj).getValue();
        if (value == null) {
            return this._suppressNulls;
        }
        if (this._suppressableValue == null) {
            return false;
        }
        JsonSerializer jsonSerializer = this._valueSerializer;
        if (jsonSerializer == null) {
            Class<?> cls = value.getClass();
            L2s l2s = this._dynamicValueSerializers;
            jsonSerializer = l2s.A00(cls);
            if (jsonSerializer == null) {
                try {
                    jsonSerializer = c26c.A0L(this._property, cls);
                    L2s A01 = l2s.A01(jsonSerializer, cls);
                    if (l2s != A01) {
                        this._dynamicValueSerializers = A01;
                    }
                } catch (C2cb unused) {
                    return false;
                }
            }
        }
        Object obj2 = this._suppressableValue;
        return obj2 == A00 ? jsonSerializer.A0B(c26c, value) : obj2.equals(value);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
    
        if (r304 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x011c, code lost:
    
        if (r0 == 1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0163, code lost:
    
        if (r301._valueType.A04() != false) goto L52;
     */
    @Override // X.C27r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.databind.JsonSerializer AJN(X.68U r302, X.C26c r303) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer.AJN(X.68U, X.26c):com.fasterxml.jackson.databind.JsonSerializer");
    }
}
