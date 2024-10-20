package com.fasterxml.jackson.databind.ser.std;

import X.0Q8;
import X.24S;
import X.27C;
import X.28Q;
import X.68U;
import X.AbstractC00953pX;
import X.AnonymousClass001;
import X.AnonymousClass248;
import X.AnonymousClass251;
import X.C24c;
import X.C25t;
import X.C26G;
import X.C26c;
import X.C27F;
import X.C27r;
import X.C2cb;
import X.C3m9;
import X.C42h;
import X.C43M;
import X.C4Nr;
import X.C68c;
import X.JQx;
import X.JzF;
import X.KkO;
import X.Kl7;
import X.Kls;
import X.Krb;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer;
import com.fasterxml.jackson.databind.ser.impl.IteratorSerializer;
import com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer;
import com.fasterxml.jackson.databind.ser.impl.StringArraySerializer;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer;
import com.fasterxml.jackson.datatype.guava.ser.MultimapSerializer;
import com.fasterxml.jackson.datatype.guava.ser.TableSerializer;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* loaded from: BeanSerializerBase.class */
public abstract class BeanSerializerBase extends StdSerializer implements C27r, C43M {
    public static final JzF[] A00;
    public final KkO _anyGetterWriter;
    public final 24S _beanType;
    public final JzF[] _filteredProps;
    public final Kl7 _objectIdWriter;
    public final Object _propertyFilterId;
    public final JzF[] _props;
    public final C25t _serializationShape;
    public final AbstractC00953pX _typeId;

    static {
        C26G c26g = C26G.A00;
        C27F[] c27fArr = 27C.A01;
        A00 = new JzF[0];
    }

    public BeanSerializerBase(24S r302, AbstractC00953pX abstractC00953pX, AnonymousClass251 anonymousClass251, KkO kkO, Kl7 kl7, Object obj, JzF[] jzFArr, JzF[] jzFArr2) {
        super(r302);
        this._beanType = r302;
        this._props = jzFArr;
        this._filteredProps = jzFArr2;
        this._typeId = abstractC00953pX;
        this._anyGetterWriter = kkO;
        this._propertyFilterId = obj;
        this._objectIdWriter = kl7;
        this._serializationShape = anonymousClass251.A02()._shape;
    }

    public BeanSerializerBase(Kl7 kl7, BeanSerializerBase beanSerializerBase, Object obj) {
        super(beanSerializerBase._handledType);
        this._beanType = beanSerializerBase._beanType;
        this._props = beanSerializerBase._props;
        this._filteredProps = beanSerializerBase._filteredProps;
        this._typeId = beanSerializerBase._typeId;
        this._anyGetterWriter = beanSerializerBase._anyGetterWriter;
        this._objectIdWriter = kl7;
        this._propertyFilterId = obj;
        this._serializationShape = beanSerializerBase._serializationShape;
    }

    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, Set set, Set set2) {
        super(beanSerializerBase._handledType);
        this._beanType = beanSerializerBase._beanType;
        JzF[] jzFArr = beanSerializerBase._props;
        JzF[] jzFArr2 = beanSerializerBase._filteredProps;
        int length = jzFArr.length;
        ArrayList A0t = AnonymousClass001.A0t(length);
        JzF[] jzFArr3 = null;
        ArrayList A0t2 = jzFArr2 == null ? null : AnonymousClass001.A0t(length);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                break;
            }
            JzF jzF = jzFArr[i2];
            if (!C68c.A01(jzF._name._value, set, set2)) {
                A0t.add(jzF);
                if (jzFArr2 != null) {
                    A0t2.add(jzFArr2[i2]);
                }
            }
            i = i2 + 1;
        }
        this._props = (JzF[]) A0t.toArray(new JzF[A0t.size()]);
        this._filteredProps = A0t2 != null ? (JzF[]) A0t2.toArray(new JzF[A0t2.size()]) : jzFArr3;
        this._typeId = beanSerializerBase._typeId;
        this._anyGetterWriter = beanSerializerBase._anyGetterWriter;
        this._objectIdWriter = beanSerializerBase._objectIdWriter;
        this._propertyFilterId = beanSerializerBase._propertyFilterId;
        this._serializationShape = beanSerializerBase._serializationShape;
    }

    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, JzF[] jzFArr, JzF[] jzFArr2) {
        super(beanSerializerBase._handledType);
        this._beanType = beanSerializerBase._beanType;
        this._props = jzFArr;
        this._filteredProps = jzFArr2;
        this._typeId = beanSerializerBase._typeId;
        this._anyGetterWriter = beanSerializerBase._anyGetterWriter;
        this._objectIdWriter = beanSerializerBase._objectIdWriter;
        this._propertyFilterId = beanSerializerBase._propertyFilterId;
        this._serializationShape = beanSerializerBase._serializationShape;
    }

    private BeanSerializerBase A0F(Kl7 kl7) {
        return this instanceof UnwrappingBeanSerializer ? new UnwrappingBeanSerializer(kl7, (UnwrappingBeanSerializer) this) : this instanceof BeanAsArraySerializer ? ((BeanAsArraySerializer) this)._defaultSerializer.A0F(kl7) : new BeanSerializerBase(kl7, this, this._propertyFilterId);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public boolean A06() {
        return AnonymousClass001.A1T(this._objectIdWriter);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void A09(28Q r302, C26c c26c, C4Nr c4Nr, Object obj) {
        if (this._objectIdWriter != null) {
            A0G(r302, c26c, c4Nr, obj);
            return;
        }
        Kls A0E = A0E(C42h.A06, c4Nr, obj);
        c4Nr.A01(r302, A0E);
        r302.A0O(obj);
        Object obj2 = this._propertyFilterId;
        if (obj2 != null) {
            A0D(c26c, obj2);
            throw 0Q8.createAndThrow();
        }
        A0H(r302, c26c, obj);
        c4Nr.A02(r302, A0E);
    }

    public final Kls A0E(C42h c42h, C4Nr c4Nr, Object obj) {
        AbstractC00953pX abstractC00953pX = this._typeId;
        if (abstractC00953pX == null) {
            return c4Nr.A03(c42h, obj);
        }
        Object A0B = abstractC00953pX.A0B(obj);
        if (A0B == null) {
            A0B = "";
        }
        Kls A03 = c4Nr.A03(c42h, obj);
        A03.A04 = A0B;
        return A03;
    }

    public final void A0G(28Q r302, C26c c26c, C4Nr c4Nr, Object obj) {
        Kl7 kl7 = this._objectIdWriter;
        Krb A0U = c26c.A0U(kl7.A00, obj);
        if (A0U.A01(r302, c26c, kl7)) {
            return;
        }
        Object obj2 = A0U.A00;
        if (obj2 == null) {
            obj2 = A0U.A02.A01(obj);
            A0U.A00 = obj2;
        }
        if (kl7.A04) {
            kl7.A03.A0A(r302, c26c, obj2);
            return;
        }
        Kl7 kl72 = this._objectIdWriter;
        Kls A0E = A0E(C42h.A06, c4Nr, obj);
        c4Nr.A01(r302, A0E);
        r302.A0O(obj);
        A0U.A00(r302, c26c, kl72);
        Object obj3 = this._propertyFilterId;
        if (obj3 != null) {
            A0D(c26c, obj3);
            throw 0Q8.createAndThrow();
        }
        A0H(r302, c26c, obj);
        c4Nr.A02(r302, A0E);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Throwable, X.2cc, X.2cb] */
    public void A0H(28Q r302, C26c c26c, Object obj) {
        JzF[] jzFArr = this._filteredProps;
        if (jzFArr == null || c26c._serializationView == null) {
            jzFArr = this._props;
        }
        try {
            for (JzF jzF : jzFArr) {
                if (jzF != null) {
                    jzF.A04(r302, c26c, obj);
                }
            }
            KkO kkO = this._anyGetterWriter;
            if (kkO != null) {
                AbstractC00953pX abstractC00953pX = kkO.A03;
                Object A0B = abstractC00953pX.A0B(obj);
                if (A0B != null) {
                    if (!(A0B instanceof Map)) {
                        JQx.A1I(c26c, kkO.A02.BHb(), "Value returned by 'any-getter' %s() not java.util.Map but %s", new Object[]{abstractC00953pX.A05(), AnonymousClass001.A0Y(A0B)});
                        throw 0Q8.createAndThrow();
                    }
                    MapSerializer mapSerializer = kkO.A01;
                    if (mapSerializer != null) {
                        mapSerializer.A0F(r302, c26c, (Map) A0B);
                    } else {
                        kkO.A00.A0A(r302, c26c, A0B);
                    }
                }
            }
        } catch (Exception e) {
            StdSerializer.A01(c26c, obj, 0 != jzFArr.length ? jzFArr[0]._name._value : "[anySetter]", e);
            throw 0Q8.createAndThrow();
        } catch (StackOverflowError e2) {
            ?? c2cb = new C2cb(r302, "Infinite recursion (StackOverflowError)", e2);
            c2cb.A08(obj, 0 != jzFArr.length ? jzFArr[0]._name._value : "[anySetter]");
            throw c2cb;
        }
    }

    public final void A0I(28Q r302, C26c c26c, Object obj, boolean z) {
        Kl7 kl7 = this._objectIdWriter;
        Krb A0U = c26c.A0U(kl7.A00, obj);
        if (A0U.A01(r302, c26c, kl7)) {
            return;
        }
        Object obj2 = A0U.A00;
        if (obj2 == null) {
            obj2 = A0U.A02.A01(obj);
            A0U.A00 = obj2;
        }
        if (kl7.A04) {
            kl7.A03.A0A(r302, c26c, obj2);
            return;
        }
        if (z) {
            r302.A0m(obj);
        }
        A0U.A00(r302, c26c, kl7);
        Object obj3 = this._propertyFilterId;
        if (obj3 != null) {
            A0D(c26c, obj3);
            throw 0Q8.createAndThrow();
        }
        A0H(r302, c26c, obj);
        if (z) {
            r302.A0Y();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x030e  */
    @Override // X.C27r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.databind.JsonSerializer AJN(X.68U r302, X.C26c r303) {
        /*
            Method dump skipped, instructions count: 1757
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.BeanSerializerBase.AJN(X.68U, X.26c):com.fasterxml.jackson.databind.JsonSerializer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r311v0 */
    @Override // X.C43M
    public void Chu(C26c c26c) {
        JsonSerializer A0J;
        C4Nr c4Nr;
        ContainerSerializer asArraySerializerBase;
        ContainerSerializer containerSerializer;
        JzF jzF;
        AbstractC00953pX abstractC00953pX;
        Object A0e;
        JsonSerializer jsonSerializer;
        JzF jzF2;
        JzF[] jzFArr = this._filteredProps;
        int length = jzFArr == null ? 0 : jzFArr.length;
        int length2 = this._props.length;
        for (int i = 0; i < length2; i++) {
            JzF jzF3 = this._props[i];
            if (!jzF3._suppressNulls && jzF3._nullSerializer == null && (jsonSerializer = c26c._nullValueSerializer) != null) {
                jzF3.A05(jsonSerializer);
                if (i < length && (jzF2 = this._filteredProps[i]) != null) {
                    jzF2.A05(jsonSerializer);
                }
            }
            if (jzF3._serializer == null) {
                AnonymousClass248 A02 = c26c._config.A02();
                if (A02 == null || (abstractC00953pX = jzF3._member) == null || (A0e = A02.A0e(abstractC00953pX)) == null) {
                    24S r311 = jzF3._cfgSerializationType;
                    if (r311 == null) {
                        r311 = jzF3._declaredType;
                        if (!Modifier.isFinal(r311._class.getModifiers())) {
                            if (r311.A0Q() || ((C24c) r311)._bindings._types.length > 0) {
                                jzF3._nonTrivialBaseType = r311;
                            }
                        }
                    }
                    A0J = c26c.A0J(jzF3, r311);
                    if (r311.A0Q() && (c4Nr = (C4Nr) r311.A05()._typeHandler) != null && (A0J instanceof ContainerSerializer)) {
                        ContainerSerializer containerSerializer2 = (ContainerSerializer) A0J;
                        if (containerSerializer2 instanceof TableSerializer) {
                            asArraySerializerBase = new TableSerializer(c4Nr, (TableSerializer) containerSerializer2);
                        } else if (containerSerializer2 instanceof MultimapSerializer) {
                            MultimapSerializer multimapSerializer = (MultimapSerializer) containerSerializer2;
                            asArraySerializerBase = new MultimapSerializer(multimapSerializer._property, multimapSerializer._keySerializer, multimapSerializer._valueSerializer, c4Nr, multimapSerializer, multimapSerializer._filterId, multimapSerializer._ignoredEntries, multimapSerializer._sortKeys);
                        } else if (containerSerializer2 instanceof MapSerializer) {
                            MapSerializer mapSerializer = (MapSerializer) containerSerializer2;
                            C4Nr c4Nr2 = mapSerializer._valueTypeSerializer;
                            containerSerializer = mapSerializer;
                            if (c4Nr2 != c4Nr) {
                                27C.A0F(MapSerializer.class, mapSerializer, "_withValueTypeSerializer");
                                asArraySerializerBase = new MapSerializer(c4Nr, mapSerializer, mapSerializer._suppressableValue, mapSerializer._suppressNulls);
                            }
                            asArraySerializerBase = containerSerializer;
                        } else {
                            boolean z = containerSerializer2 instanceof StdArraySerializers$TypedPrimitiveArraySerializer;
                            containerSerializer = containerSerializer2;
                            if (!z) {
                                boolean z2 = containerSerializer2 instanceof StdArraySerializers$IntArraySerializer;
                                containerSerializer = containerSerializer2;
                                if (!z2) {
                                    boolean z3 = containerSerializer2 instanceof StdArraySerializers$DoubleArraySerializer;
                                    containerSerializer = containerSerializer2;
                                    if (!z3) {
                                        boolean z4 = containerSerializer2 instanceof StdArraySerializers$BooleanArraySerializer;
                                        containerSerializer = containerSerializer2;
                                        if (!z4) {
                                            if (containerSerializer2 instanceof ObjectArraySerializer) {
                                                ObjectArraySerializer objectArraySerializer = (ObjectArraySerializer) containerSerializer2;
                                                asArraySerializerBase = new ObjectArraySerializer(objectArraySerializer._elementType, objectArraySerializer._elementSerializer, c4Nr, objectArraySerializer._staticTyping);
                                            } else {
                                                boolean z5 = containerSerializer2 instanceof StringArraySerializer;
                                                containerSerializer = containerSerializer2;
                                                if (!z5) {
                                                    if (containerSerializer2 instanceof MapEntrySerializer) {
                                                        MapEntrySerializer mapEntrySerializer = (MapEntrySerializer) containerSerializer2;
                                                        asArraySerializerBase = new MapEntrySerializer(mapEntrySerializer._keySerializer, mapEntrySerializer._valueSerializer, mapEntrySerializer, mapEntrySerializer._suppressableValue, mapEntrySerializer._suppressNulls);
                                                    } else if (containerSerializer2 instanceof IterableSerializer) {
                                                        AsArraySerializerBase asArraySerializerBase2 = (AsArraySerializerBase) containerSerializer2;
                                                        asArraySerializerBase = new AsArraySerializerBase(asArraySerializerBase2._property, asArraySerializerBase2._elementSerializer, c4Nr, asArraySerializerBase2, asArraySerializerBase2._unwrapSingle);
                                                    } else {
                                                        boolean z6 = containerSerializer2 instanceof EnumSetSerializer;
                                                        containerSerializer = containerSerializer2;
                                                        if (!z6) {
                                                            if (containerSerializer2 instanceof CollectionSerializer) {
                                                                AsArraySerializerBase asArraySerializerBase3 = (AsArraySerializerBase) containerSerializer2;
                                                                asArraySerializerBase = new AsArraySerializerBase(asArraySerializerBase3._property, asArraySerializerBase3._elementSerializer, c4Nr, asArraySerializerBase3, asArraySerializerBase3._unwrapSingle);
                                                            } else {
                                                                boolean z7 = containerSerializer2 instanceof IteratorSerializer;
                                                                AsArraySerializerBase asArraySerializerBase4 = (AsArraySerializerBase) containerSerializer2;
                                                                68U r0 = asArraySerializerBase4._property;
                                                                JsonSerializer jsonSerializer2 = asArraySerializerBase4._elementSerializer;
                                                                Boolean bool = asArraySerializerBase4._unwrapSingle;
                                                                asArraySerializerBase = z7 ? new AsArraySerializerBase(r0, jsonSerializer2, c4Nr, asArraySerializerBase4, bool) : new AsArraySerializerBase(r0, jsonSerializer2, c4Nr, asArraySerializerBase4, bool);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            asArraySerializerBase = containerSerializer;
                        }
                        A0J = asArraySerializerBase;
                    }
                } else {
                    C3m9 A0B = c26c.A0B(A0e);
                    24S B0m = A0B.B0m(c26c.A0A());
                    A0J = new StdDelegatingSerializer(B0m, B0m._class != Object.class ? c26c.A0J(jzF3, B0m) : null, A0B);
                }
                if (i >= length || (jzF = this._filteredProps[i]) == null) {
                    jzF3.A06(A0J);
                } else {
                    jzF.A06(A0J);
                }
            }
        }
        KkO kkO = this._anyGetterWriter;
        if (kkO != null) {
            ?? r3112 = kkO.A00;
            if (r3112 instanceof C27r) {
                68U r02 = kkO.A02;
                JsonSerializer jsonSerializer3 = r3112;
                if (r3112 != 0) {
                    jsonSerializer3 = ((C27r) r3112).AJN(r02, c26c);
                }
                kkO.A00 = jsonSerializer3;
                if (jsonSerializer3 instanceof MapSerializer) {
                    kkO.A01 = (MapSerializer) jsonSerializer3;
                }
            }
        }
    }
}
