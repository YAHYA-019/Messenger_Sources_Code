package com.fasterxml.jackson.databind.ser.std;

import X.1BL;
import X.24S;
import X.28Q;
import X.68U;
import X.C26c;
import X.C27r;
import X.C42h;
import X.C4Nr;
import X.JzI;
import X.Kls;
import X.L2s;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer;
import com.fasterxml.jackson.databind.ser.impl.IteratorSerializer;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: AsArraySerializerBase.class */
public abstract class AsArraySerializerBase extends ContainerSerializer implements C27r {
    public L2s _dynamicSerializers;
    public final JsonSerializer _elementSerializer;
    public final 24S _elementType;
    public final 68U _property;
    public final boolean _staticTyping;
    public final Boolean _unwrapSingle;
    public final C4Nr _valueTypeSerializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsArraySerializerBase(24S r302, JsonSerializer jsonSerializer, C4Nr c4Nr, Class cls, boolean z) {
        super(cls, false);
        boolean z2 = false;
        this._elementType = r302;
        if (z || (r302 != null && Modifier.isFinal(r302._class.getModifiers()))) {
            z2 = true;
        }
        this._staticTyping = z2;
        this._valueTypeSerializer = c4Nr;
        this._property = null;
        this._elementSerializer = jsonSerializer;
        this._dynamicSerializers = JzI.A00;
        this._unwrapSingle = null;
    }

    public AsArraySerializerBase(68U r302, JsonSerializer jsonSerializer, C4Nr c4Nr, AsArraySerializerBase asArraySerializerBase, Boolean bool) {
        super(asArraySerializerBase._handledType, false);
        this._elementType = asArraySerializerBase._elementType;
        this._staticTyping = asArraySerializerBase._staticTyping;
        this._valueTypeSerializer = c4Nr;
        this._property = r302;
        this._elementSerializer = jsonSerializer;
        this._dynamicSerializers = JzI.A00;
        this._unwrapSingle = bool;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void A09(28Q r302, C26c c26c, C4Nr c4Nr, Object obj) {
        Kls A0Z = 1BL.A0Z(r302, C42h.A05, c4Nr, obj);
        r302.A0O(obj);
        if (this instanceof IterableSerializer) {
            IterableSerializer.A03(r302, c26c, (IterableSerializer) this, (Iterable) obj);
        } else if (this instanceof EnumSetSerializer) {
            EnumSetSerializer.A03(r302, c26c, (EnumSetSerializer) this, (EnumSet) obj);
        } else if (this instanceof CollectionSerializer) {
            CollectionSerializer.A03(r302, c26c, (CollectionSerializer) this, (Collection) obj);
        } else if (this instanceof IteratorSerializer) {
            IteratorSerializer.A03(r302, c26c, (IteratorSerializer) this, (Iterator) obj);
        } else {
            IndexedListSerializer.A03(r302, c26c, (IndexedListSerializer) this, (List) obj);
        }
        c4Nr.A02(r302, A0Z);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0074  */
    @Override // X.C27r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.databind.JsonSerializer AJN(X.68U r302, X.C26c r303) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase.AJN(X.68U, X.26c):com.fasterxml.jackson.databind.JsonSerializer");
    }
}
