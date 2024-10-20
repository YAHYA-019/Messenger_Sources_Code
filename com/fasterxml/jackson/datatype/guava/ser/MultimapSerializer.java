package com.fasterxml.jackson.datatype.guava.ser;

import X.0Q8;
import X.1BL;
import X.1Mu;
import X.24S;
import X.28Q;
import X.68U;
import X.AnonymousClass001;
import X.C26c;
import X.C27r;
import X.C42h;
import X.C4E7;
import X.C4Nr;
import X.JQy;
import X.JzI;
import X.Kls;
import X.L2s;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: MultimapSerializer.class */
public class MultimapSerializer extends ContainerSerializer implements C27r {
    public static final long serialVersionUID = 1;
    public L2s _dynamicValueSerializers;
    public final Object _filterId;
    public final Set _ignoredEntries;
    public final JsonSerializer _keySerializer;
    public final 68U _property;
    public final boolean _sortKeys;
    public final C4E7 _type;
    public final JsonSerializer _valueSerializer;
    public final C4Nr _valueTypeSerializer;

    public MultimapSerializer(68U r302, JsonSerializer jsonSerializer, JsonSerializer jsonSerializer2, C4Nr c4Nr, MultimapSerializer multimapSerializer, Object obj, Set set, boolean z) {
        super(multimapSerializer._handledType, false);
        this._type = multimapSerializer._type;
        this._property = r302;
        this._keySerializer = jsonSerializer;
        this._valueTypeSerializer = c4Nr;
        this._valueSerializer = jsonSerializer2;
        this._dynamicValueSerializers = multimapSerializer._dynamicValueSerializers;
        this._ignoredEntries = set;
        this._filterId = obj;
        this._sortKeys = z;
    }

    public MultimapSerializer(JsonSerializer jsonSerializer, JsonSerializer jsonSerializer2, C4Nr c4Nr, C4E7 c4e7, Object obj, Set set) {
        super(((24S) c4e7)._class, false);
        this._type = c4e7;
        this._property = null;
        this._keySerializer = jsonSerializer;
        this._valueTypeSerializer = c4Nr;
        this._valueSerializer = jsonSerializer2;
        this._ignoredEntries = set;
        this._filterId = obj;
        this._sortKeys = false;
        this._dynamicValueSerializers = JzI.A00;
    }

    private final void A03(28Q r302, C26c c26c, 1Mu r304) {
        Set set = this._ignoredEntries;
        L2s l2s = this._dynamicValueSerializers;
        Iterator A0y = AnonymousClass001.A0y(r304.AAK());
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            Object key = A0z.getKey();
            if (set == null || !set.contains(key)) {
                if (key == null) {
                    c26c._nullKeySerializer.A0A(r302, c26c, null);
                } else {
                    this._keySerializer.A0A(r302, c26c, key);
                }
                r302.A0a();
                for (Object obj : (Collection) A0z.getValue()) {
                    if (obj == null) {
                        c26c.A0W(r302);
                    } else {
                        JsonSerializer jsonSerializer = this._valueSerializer;
                        if (jsonSerializer == null) {
                            Class<?> cls = obj.getClass();
                            jsonSerializer = l2s.A00(cls);
                            if (jsonSerializer == null) {
                                jsonSerializer = c26c.A0L(this._property, cls);
                                L2s A01 = l2s.A01(jsonSerializer, cls);
                                if (l2s != A01) {
                                    this._dynamicValueSerializers = A01;
                                }
                                l2s = this._dynamicValueSerializers;
                            }
                        }
                        JQy.A1J(r302, jsonSerializer, c26c, this._valueTypeSerializer, obj);
                    }
                }
                r302.A0X();
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A09(28Q r302, C26c c26c, C4Nr c4Nr, Object obj) {
        1Mu r0 = (1Mu) obj;
        r302.A0O(r0);
        Kls A0Z = 1BL.A0Z(r302, C42h.A06, c4Nr, r0);
        if (!r0.isEmpty()) {
            Object obj2 = this._filterId;
            if (obj2 != null) {
                A0D(c26c, obj2);
                throw 0Q8.createAndThrow();
            }
            A03(r302, c26c, r0);
        }
        c4Nr.A02(r302, A0Z);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        1Mu r0 = (1Mu) obj;
        r302.A0b();
        r302.A0O(r0);
        if (!r0.isEmpty()) {
            Object obj2 = this._filterId;
            if (obj2 != null) {
                A0D(c26c, obj2);
                throw 0Q8.createAndThrow();
            }
            A03(r302, c26c, r0);
        }
        r302.A0Y();
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ boolean A0B(C26c c26c, Object obj) {
        return ((1Mu) obj).isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0177 A[LOOP:0: B:51:0x0169->B:53:0x0177, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x018b  */
    /* JADX WARN: Type inference failed for: r0v78, types: [java.util.AbstractCollection] */
    @Override // X.C27r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.databind.JsonSerializer AJN(X.68U r302, X.C26c r303) {
        /*
            Method dump skipped, instructions count: 571
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.datatype.guava.ser.MultimapSerializer.AJN(X.68U, X.26c):com.fasterxml.jackson.databind.JsonSerializer");
    }
}
