package com.fasterxml.jackson.databind.ser.std;

import X.0Q8;
import X.1BK;
import X.1BL;
import X.24R;
import X.24S;
import X.27C;
import X.28Q;
import X.68U;
import X.AnonymousClass001;
import X.C25d;
import X.C26c;
import X.C27r;
import X.C2cc;
import X.C42h;
import X.C4Nr;
import X.C68c;
import X.JzI;
import X.Kls;
import X.L2s;
import X.LiO;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/* loaded from: MapSerializer.class */
public class MapSerializer extends ContainerSerializer implements C27r {
    public static final long serialVersionUID = 1;
    public L2s _dynamicValueSerializers;
    public final Object _filterId;
    public final Set _ignoredEntries;
    public final Set _includedEntries;
    public final LiO _inclusionChecker;
    public JsonSerializer _keySerializer;
    public final 24S _keyType;
    public final 68U _property;
    public final boolean _sortKeys;
    public final boolean _suppressNulls;
    public final Object _suppressableValue;
    public JsonSerializer _valueSerializer;
    public final 24S _valueType;
    public final boolean _valueTypeIsStatic;
    public final C4Nr _valueTypeSerializer;
    public static final 24S A01 = 24R.A03;
    public static final Object A00 = C25d.NON_EMPTY;

    public MapSerializer(24S r302, 24S r303, JsonSerializer jsonSerializer, JsonSerializer jsonSerializer2, C4Nr c4Nr, Set set, Set set2, boolean z) {
        super(Map.class, false);
        set = (set == null || set.isEmpty()) ? null : set;
        this._ignoredEntries = set;
        this._includedEntries = set2;
        this._keyType = r302;
        this._valueType = r303;
        this._valueTypeIsStatic = z;
        this._valueTypeSerializer = c4Nr;
        this._keySerializer = jsonSerializer;
        this._valueSerializer = jsonSerializer2;
        this._dynamicValueSerializers = JzI.A00;
        this._property = null;
        this._filterId = null;
        this._sortKeys = false;
        this._suppressableValue = null;
        this._suppressNulls = false;
        this._inclusionChecker = C68c.A00(set, set2);
    }

    public MapSerializer(C4Nr c4Nr, MapSerializer mapSerializer, Object obj, boolean z) {
        super(Map.class, false);
        this._ignoredEntries = mapSerializer._ignoredEntries;
        this._includedEntries = mapSerializer._includedEntries;
        this._keyType = mapSerializer._keyType;
        this._valueType = mapSerializer._valueType;
        this._valueTypeIsStatic = mapSerializer._valueTypeIsStatic;
        this._valueTypeSerializer = c4Nr;
        this._keySerializer = mapSerializer._keySerializer;
        this._valueSerializer = mapSerializer._valueSerializer;
        this._dynamicValueSerializers = mapSerializer._dynamicValueSerializers;
        this._property = mapSerializer._property;
        this._filterId = mapSerializer._filterId;
        this._sortKeys = mapSerializer._sortKeys;
        this._suppressableValue = obj;
        this._suppressNulls = z;
        this._inclusionChecker = mapSerializer._inclusionChecker;
    }

    public MapSerializer(68U r302, JsonSerializer jsonSerializer, JsonSerializer jsonSerializer2, MapSerializer mapSerializer, Set set, Set set2) {
        super(Map.class, false);
        set = (set == null || set.isEmpty()) ? null : set;
        this._ignoredEntries = set;
        this._includedEntries = set2;
        this._keyType = mapSerializer._keyType;
        this._valueType = mapSerializer._valueType;
        this._valueTypeIsStatic = mapSerializer._valueTypeIsStatic;
        this._valueTypeSerializer = mapSerializer._valueTypeSerializer;
        this._keySerializer = jsonSerializer;
        this._valueSerializer = jsonSerializer2;
        this._dynamicValueSerializers = JzI.A00;
        this._property = r302;
        this._filterId = mapSerializer._filterId;
        this._sortKeys = mapSerializer._sortKeys;
        this._suppressableValue = mapSerializer._suppressableValue;
        this._suppressNulls = mapSerializer._suppressNulls;
        this._inclusionChecker = C68c.A00(set, set2);
    }

    public MapSerializer(MapSerializer mapSerializer, Object obj, boolean z) {
        super(Map.class, false);
        this._ignoredEntries = mapSerializer._ignoredEntries;
        this._includedEntries = mapSerializer._includedEntries;
        this._keyType = mapSerializer._keyType;
        this._valueType = mapSerializer._valueType;
        this._valueTypeIsStatic = mapSerializer._valueTypeIsStatic;
        this._valueTypeSerializer = mapSerializer._valueTypeSerializer;
        this._keySerializer = mapSerializer._keySerializer;
        this._valueSerializer = mapSerializer._valueSerializer;
        this._dynamicValueSerializers = JzI.A00;
        this._property = mapSerializer._property;
        this._filterId = obj;
        this._sortKeys = z;
        this._suppressableValue = mapSerializer._suppressableValue;
        this._suppressNulls = mapSerializer._suppressNulls;
        this._inclusionChecker = mapSerializer._inclusionChecker;
    }

    private final JsonSerializer A03(C26c c26c, Object obj) {
        L2s A012;
        Class<?> cls = obj.getClass();
        L2s l2s = this._dynamicValueSerializers;
        JsonSerializer A002 = l2s.A00(cls);
        if (A002 == null) {
            24S r0 = this._valueType;
            if (r0.A0L()) {
                24S A0F = c26c.A0F(r0, cls);
                A002 = c26c.A0G(this._property, A0F);
                A012 = l2s.A01(A002, A0F._class);
            } else {
                A002 = c26c.A0L(this._property, cls);
                A012 = l2s.A01(A002, cls);
            }
            if (l2s != A012) {
                this._dynamicValueSerializers = A012;
            }
        }
        return A002;
    }

    public static MapSerializer A04(24S r301, JsonSerializer jsonSerializer, JsonSerializer jsonSerializer2, C4Nr c4Nr, Object obj, Set set, Set set2, boolean z) {
        24S A06;
        24S A05;
        if (r301 == null) {
            A06 = A01;
            A05 = A06;
        } else {
            A06 = r301.A06();
            A05 = r301._class == Properties.class ? 24R.A03 : r301.A05();
        }
        boolean z2 = false;
        if (z) {
            z2 = true;
            if (A05._class == Object.class) {
                z2 = false;
            }
        } else if (A05 != null && Modifier.isFinal(A05._class.getModifiers())) {
            z2 = true;
        }
        MapSerializer mapSerializer = new MapSerializer(A06, A05, jsonSerializer, jsonSerializer2, c4Nr, set, set2, z2);
        if (obj == null || mapSerializer._filterId == obj) {
            return mapSerializer;
        }
        27C.A0F(MapSerializer.class, mapSerializer, "withFilterId");
        return new MapSerializer(mapSerializer, obj, mapSerializer._sortKeys);
    }

    private void A05(28Q r302, C26c c26c, Object obj, Map map) {
        JsonSerializer jsonSerializer;
        JsonSerializer jsonSerializer2;
        boolean equals;
        boolean A1W = AnonymousClass001.A1W(A00, obj);
        Iterator A0y = AnonymousClass001.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            Object key = A0z.getKey();
            if (key == null) {
                jsonSerializer = c26c._nullKeySerializer;
            } else {
                LiO liO = this._inclusionChecker;
                if (liO == null || !liO.A00(key)) {
                    jsonSerializer = this._keySerializer;
                }
            }
            Object value = A0z.getValue();
            if (value != null) {
                jsonSerializer2 = this._valueSerializer;
                if (jsonSerializer2 == null) {
                    jsonSerializer2 = A03(c26c, value);
                }
                if (A1W) {
                    equals = jsonSerializer2.A0B(c26c, value);
                } else if (obj != null) {
                    equals = obj.equals(value);
                } else {
                    jsonSerializer.A0A(r302, c26c, key);
                    jsonSerializer2.A09(r302, c26c, this._valueTypeSerializer, value);
                }
                if (equals) {
                    continue;
                } else {
                    jsonSerializer.A0A(r302, c26c, key);
                    jsonSerializer2.A09(r302, c26c, this._valueTypeSerializer, value);
                }
            } else if (this._suppressNulls) {
                continue;
            } else {
                jsonSerializer2 = c26c._nullValueSerializer;
                jsonSerializer.A0A(r302, c26c, key);
                try {
                    jsonSerializer2.A09(r302, c26c, this._valueTypeSerializer, value);
                } catch (Exception e) {
                    StdSerializer.A01(c26c, map, String.valueOf(key), e);
                    throw 0Q8.createAndThrow();
                }
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A09(28Q r302, C26c c26c, C4Nr c4Nr, Object obj) {
        Map map = (Map) obj;
        r302.A0O(map);
        Kls A0Z = 1BL.A0Z(r302, C42h.A06, c4Nr, map);
        A0F(r302, c26c, map);
        c4Nr.A02(r302, A0Z);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        Map map = (Map) obj;
        r302.A0m(map);
        A0F(r302, c26c, map);
        r302.A0Y();
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ boolean A0B(C26c c26c, Object obj) {
        boolean equals;
        Map map = (Map) obj;
        if (map.isEmpty()) {
            return true;
        }
        Object obj2 = this._suppressableValue;
        if (obj2 == null && !this._suppressNulls) {
            return false;
        }
        JsonSerializer jsonSerializer = this._valueSerializer;
        boolean A1W = AnonymousClass001.A1W(A00, obj2);
        Iterator A1A = 1BK.A1A(map);
        if (jsonSerializer != null) {
            while (A1A.hasNext()) {
                Object next = A1A.next();
                if (next != null) {
                    if (A1W) {
                        equals = jsonSerializer.A0B(c26c, next);
                    } else {
                        if (obj2 == null) {
                            return false;
                        }
                        equals = obj2.equals(map);
                    }
                    if (!equals) {
                        return false;
                    }
                } else if (!this._suppressNulls) {
                    return false;
                }
            }
            return true;
        }
        while (A1A.hasNext()) {
            Object next2 = A1A.next();
            if (next2 != null) {
                try {
                    JsonSerializer A03 = A03(c26c, next2);
                    if (A1W) {
                        if (!A03.A0B(c26c, next2)) {
                            return false;
                        }
                    } else if (obj2 == null || !obj2.equals(map)) {
                        return false;
                    }
                } catch (C2cc unused) {
                    return false;
                }
            } else if (!this._suppressNulls) {
                return false;
            }
        }
        return true;
    }

    public void A0E(28Q r302, C26c c26c, Map map) {
        Object obj = null;
        if (this._valueTypeSerializer != null) {
            A05(r302, c26c, null, map);
            return;
        }
        JsonSerializer jsonSerializer = this._keySerializer;
        try {
            Iterator A0y = AnonymousClass001.A0y(map);
            Object obj2 = null;
            while (A0y.hasNext()) {
                try {
                    Map.Entry A0z = AnonymousClass001.A0z(A0y);
                    Object value = A0z.getValue();
                    obj2 = A0z.getKey();
                    if (obj2 == null) {
                        c26c._nullKeySerializer.A0A(r302, c26c, null);
                    } else {
                        LiO liO = this._inclusionChecker;
                        if (liO == null || !liO.A00(obj2)) {
                            jsonSerializer.A0A(r302, c26c, obj2);
                        }
                    }
                    if (value == null) {
                        c26c.A0W(r302);
                    } else {
                        JsonSerializer jsonSerializer2 = this._valueSerializer;
                        if (jsonSerializer2 == null) {
                            jsonSerializer2 = A03(c26c, value);
                        }
                        jsonSerializer2.A0A(r302, c26c, value);
                    }
                } catch (Exception e) {
                    e = e;
                    obj = obj2;
                    StdSerializer.A01(c26c, map, String.valueOf(obj), e);
                    throw 0Q8.createAndThrow();
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002e, code lost:
    
        if (r303._config.A0G(X.26D.A07) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0F(X.28Q r302, X.C26c r303, java.util.Map r304) {
        /*
            Method dump skipped, instructions count: 827
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.MapSerializer.A0F(X.28Q, X.26c, java.util.Map):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x016d, code lost:
    
        if (r305 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x030a, code lost:
    
        if (r0 != 1) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x035b, code lost:
    
        if (r301._valueType.A04() != false) goto L106;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01c2  */
    /* JADX WARN: Type inference failed for: r0v158, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r0v171, types: [java.util.AbstractCollection] */
    @Override // X.C27r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.databind.JsonSerializer AJN(X.68U r302, X.C26c r303) {
        /*
            Method dump skipped, instructions count: 940
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.MapSerializer.AJN(X.68U, X.26c):com.fasterxml.jackson.databind.JsonSerializer");
    }
}
