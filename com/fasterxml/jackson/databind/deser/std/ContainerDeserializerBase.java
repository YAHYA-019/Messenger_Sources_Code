package com.fasterxml.jackson.databind.deser.std;

import X.0Q8;
import X.1BK;
import X.24S;
import X.27C;
import X.68S;
import X.68W;
import X.AbstractC00603o4;
import X.AnonymousClass001;
import X.C26L;
import X.C26O;
import X.C27F;
import X.C27T;
import X.C2cb;
import X.C42o;
import X.C68h;
import X.JQx;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.GuavaCollectionDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.GuavaImmutableCollectionDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.GuavaMapDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.GuavaMultisetDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.ImmutableBiMapDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.ImmutableMapDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.ImmutableSortedMapDeserializer;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.RegularImmutableBiMap;
import com.google.common.collect.RegularImmutableMap;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* loaded from: ContainerDeserializerBase.class */
public abstract class ContainerDeserializerBase extends StdDeserializer {
    public final 24S _containerType;
    public final C42o _nullProvider;
    public final boolean _skipNullValues;
    public final Boolean _unwrapSingle;

    public ContainerDeserializerBase(24S r302, C42o c42o, Boolean bool) {
        super(r302);
        this._containerType = r302;
        this._unwrapSingle = bool;
        this._nullProvider = c42o;
        this._skipNullValues = AnonymousClass001.A1W(c42o, C68h.A01);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ContainerDeserializerBase(X.C42o r302, com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase r303, java.lang.Boolean r304) {
        /*
            r301 = this;
            r0 = r303
            X.24S r0 = r0._containerType
            r305 = r0
            r0 = r301
            r1 = r305
            r0.<init>(r1)
            r0 = r301
            r1 = r305
            r0._containerType = r1
            r0 = r301
            r1 = r302
            r0._nullProvider = r1
            r0 = r301
            r1 = r304
            r0._unwrapSingle = r1
            X.68h r0 = X.C68h.A01
            r305 = r0
            r0 = r302
            r1 = r305
            boolean r0 = X.AnonymousClass001.A1W(r0, r1)
            r306 = r0
            r0 = r301
            r1 = r306
            r0._skipNullValues = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase.<init>(X.42o, com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase, java.lang.Boolean):void");
    }

    public static void A04(C27T c27t, Object obj, String str, Throwable th) {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        C27F[] c27fArr = 27C.A01;
        if (!(th instanceof Error)) {
            if (c27t != null && !c27t.A0p(C26O.A0Q)) {
                27C.A0H(th);
            }
            if (!(th instanceof IOException) || (th instanceof C2cb)) {
                if (str == null) {
                    str = "N/A";
                }
                throw C2cb.A02(obj, str, th);
            }
        }
        throw th;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public 68S A0O(String str) {
        JsonDeserializer jsonDeserializer = this instanceof GuavaMapDeserializer ? ((GuavaMapDeserializer) this)._valueDeserializer : this instanceof GuavaCollectionDeserializer ? ((GuavaCollectionDeserializer) this)._valueDeserializer : this instanceof StringCollectionDeserializer ? ((StringCollectionDeserializer) this)._valueDeserializer : this instanceof ObjectArrayDeserializer ? ((ObjectArrayDeserializer) this)._elementDeserializer : this instanceof MapEntryDeserializer ? ((MapEntryDeserializer) this)._valueDeserializer : this instanceof MapDeserializer ? ((MapDeserializer) this)._valueDeserializer : this instanceof EnumMapDeserializer ? ((EnumMapDeserializer) this)._valueDeserializer : ((CollectionDeserializer) this)._valueDeserializer;
        if (jsonDeserializer != null) {
            return jsonDeserializer.A0O(str);
        }
        throw 1BK.A0f("Cannot handle managed/back reference '%s': type: container deserializer of type %s returned null for 'getContentDeserializer()'", new Object[]{str, AnonymousClass001.A0Y(this)});
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Boolean A0R(C26L c26l) {
        return this instanceof GuavaImmutableCollectionDeserializer ? Boolean.FALSE : Boolean.TRUE;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object A0U(C27T c27t) {
        if (this instanceof ImmutableSortedMapDeserializer) {
            return ImmutableSortedMap.A03;
        }
        if (this instanceof ImmutableMapDeserializer) {
            return RegularImmutableMap.A03;
        }
        if (this instanceof ImmutableBiMapDeserializer) {
            return RegularImmutableBiMap.A05;
        }
        if (this instanceof GuavaMultisetDeserializer) {
            return ((GuavaMultisetDeserializer) this).A13();
        }
        if (this instanceof GuavaImmutableCollectionDeserializer) {
            return ((GuavaCollectionDeserializer) this).A12();
        }
        if (this instanceof ObjectArrayDeserializer) {
            return ((ObjectArrayDeserializer) this)._emptyValue;
        }
        if (this instanceof EnumMapDeserializer) {
            return EnumMapDeserializer.A01(c27t, (EnumMapDeserializer) this);
        }
        68W A0i = A0i();
        if (A0i == null || !A0i.A0Q()) {
            24S r0 = this._containerType;
            JQx.A1I(c27t, r0, AbstractC00603o4.A00(338), new Object[]{r0});
            throw 0Q8.createAndThrow();
        }
        try {
            return A0i.A09(c27t);
        } catch (IOException e) {
            27C.A0D(c27t, e);
            throw 0Q8.createAndThrow();
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public 24S A0c() {
        return this._containerType;
    }
}
