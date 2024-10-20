package com.fasterxml.jackson.databind.deser;

import X.0Pz;
import X.0Q8;
import X.24S;
import X.27C;
import X.28P;
import X.2LD;
import X.3eS;
import X.3pW;
import X.4DN;
import X.4DO;
import X.4rL;
import X.68S;
import X.68U;
import X.68W;
import X.6rW;
import X.7Rq;
import X.7Rr;
import X.7Rs;
import X.7Ru;
import X.AbstractC01033pi;
import X.AnonymousClass001;
import X.AnonymousClass436;
import X.AnonymousClass437;
import X.C24q;
import X.C25t;
import X.C26G;
import X.C26L;
import X.C26O;
import X.C27T;
import X.C42h;
import X.C42x;
import X.C68N;
import X.C68c;
import X.C68e;
import X.C68l;
import X.C68r;
import X.C7Rt;
import X.C81f;
import X.InterfaceC00923pT;
import X.JyB;
import X.KtU;
import X.L4v;
import X.L8e;
import X.La0;
import X.Liw;
import X.MCW;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: BeanDeserializerBase.class */
public abstract class BeanDeserializerBase extends StdDeserializer implements AnonymousClass436, AnonymousClass437, Serializable {
    public static final C26G A01 = new C26G("#temporary-name", null);
    public static final long serialVersionUID = 1;
    public transient HashMap A00;
    public 7Rr _anySetter;
    public JsonDeserializer _arrayDelegateDeserializer;
    public final Map _backRefs;
    public final C68l _beanProperties;
    public final 24S _beanType;
    public JsonDeserializer _delegateDeserializer;
    public L8e _externalTypeIdHandler;
    public final Set _ignorableProps;
    public final boolean _ignoreAllUnknown;
    public final Set _includableProps;
    public final 7Rs[] _injectables;
    public final boolean _needViewProcesing;
    public boolean _nonStandardCreation;
    public final C7Rt _objectIdReader;
    public 7Rq _propertyBasedCreator;
    public final C25t _serializationShape;
    public 7Ru _unwrappedPropertyHandler;
    public final 68W _valueInstantiator;
    public boolean _vanillaProcessing;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00da, code lost:
    
        if (r0.A0Q() == false) goto L15;
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public BeanDeserializerBase(X.68X r302, X.C68l r303, X.AnonymousClass251 r304, java.util.Map r305, java.util.Set r306, java.util.Set r307, boolean r308, boolean r309) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.<init>(X.68X, X.68l, X.251, java.util.Map, java.util.Set, java.util.Set, boolean, boolean):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public BeanDeserializerBase(com.fasterxml.jackson.databind.deser.BeanDeserializerBase r302, X.C68l r303) {
        /*
            r301 = this;
            r0 = r302
            X.24S r0 = r0._beanType
            r304 = r0
            r0 = r301
            r1 = r304
            r0.<init>(r1)
            r0 = r301
            r1 = r304
            r0._beanType = r1
            r0 = r302
            X.68W r0 = r0._valueInstantiator
            r304 = r0
            r0 = r301
            r1 = r304
            r0._valueInstantiator = r1
            r0 = r302
            r1 = r301
            X.4YW.A0I(r0, r1)
            r0 = r301
            r1 = r303
            r0._beanProperties = r1
            r0 = r302
            java.util.Map r0 = r0._backRefs
            r304 = r0
            r0 = r301
            r1 = r304
            r0._backRefs = r1
            r0 = r302
            java.util.Set r0 = r0._ignorableProps
            r304 = r0
            r0 = r301
            r1 = r304
            r0._ignorableProps = r1
            r0 = r302
            boolean r0 = r0._ignoreAllUnknown
            r305 = r0
            r0 = r301
            r1 = r305
            r0._ignoreAllUnknown = r1
            r0 = r302
            java.util.Set r0 = r0._includableProps
            r304 = r0
            r0 = r301
            r1 = r304
            r0._includableProps = r1
            r0 = r302
            X.7Rr r0 = r0._anySetter
            r304 = r0
            r0 = r301
            r1 = r304
            r0._anySetter = r1
            r0 = r302
            X.7Rs[] r0 = r0._injectables
            r304 = r0
            r0 = r301
            r1 = r304
            r0._injectables = r1
            r0 = r302
            X.7Rt r0 = r0._objectIdReader
            r304 = r0
            r0 = r301
            r1 = r304
            r0._objectIdReader = r1
            r0 = r302
            boolean r0 = r0._nonStandardCreation
            r305 = r0
            r0 = r301
            r1 = r305
            r0._nonStandardCreation = r1
            r0 = r302
            X.7Ru r0 = r0._unwrappedPropertyHandler
            r304 = r0
            r0 = r301
            r1 = r304
            r0._unwrappedPropertyHandler = r1
            r0 = r302
            boolean r0 = r0._needViewProcesing
            r305 = r0
            r0 = r301
            r1 = r305
            r0._needViewProcesing = r1
            r0 = r302
            X.25t r0 = r0._serializationShape
            r304 = r0
            r0 = r301
            r1 = r304
            r0._serializationShape = r1
            r0 = r302
            boolean r0 = r0._vanillaProcessing
            r305 = r0
            r0 = r301
            r1 = r305
            r0._vanillaProcessing = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.<init>(com.fasterxml.jackson.databind.deser.BeanDeserializerBase, X.68l):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public BeanDeserializerBase(com.fasterxml.jackson.databind.deser.BeanDeserializerBase r302, X.C7Rt r303) {
        /*
            Method dump skipped, instructions count: 178
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.<init>(com.fasterxml.jackson.databind.deser.BeanDeserializerBase, X.7Rt):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public BeanDeserializerBase(com.fasterxml.jackson.databind.deser.BeanDeserializerBase r302, X.L1J r303) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.<init>(com.fasterxml.jackson.databind.deser.BeanDeserializerBase, X.L1J):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public BeanDeserializerBase(com.fasterxml.jackson.databind.deser.BeanDeserializerBase r302, java.util.Set r303, java.util.Set r304) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.<init>(com.fasterxml.jackson.databind.deser.BeanDeserializerBase, java.util.Set, java.util.Set):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public BeanDeserializerBase(com.fasterxml.jackson.databind.deser.BeanDeserializerBase r302, boolean r303) {
        /*
            r301 = this;
            r0 = r302
            X.24S r0 = r0._beanType
            r304 = r0
            r0 = r301
            r1 = r304
            r0.<init>(r1)
            r0 = r301
            r1 = r304
            r0._beanType = r1
            r0 = r302
            X.68W r0 = r0._valueInstantiator
            r304 = r0
            r0 = r301
            r1 = r304
            r0._valueInstantiator = r1
            r0 = r302
            r1 = r301
            X.4YW.A0I(r0, r1)
            r0 = r302
            X.68l r0 = r0._beanProperties
            r304 = r0
            r0 = r301
            r1 = r304
            r0._beanProperties = r1
            r0 = r302
            java.util.Map r0 = r0._backRefs
            r304 = r0
            r0 = r301
            r1 = r304
            r0._backRefs = r1
            r0 = r302
            java.util.Set r0 = r0._ignorableProps
            r304 = r0
            r0 = r301
            r1 = r304
            r0._ignorableProps = r1
            r0 = r301
            r1 = r303
            r0._ignoreAllUnknown = r1
            r0 = r302
            java.util.Set r0 = r0._includableProps
            r304 = r0
            r0 = r301
            r1 = r304
            r0._includableProps = r1
            r0 = r302
            X.7Rr r0 = r0._anySetter
            r304 = r0
            r0 = r301
            r1 = r304
            r0._anySetter = r1
            r0 = r302
            X.7Rs[] r0 = r0._injectables
            r304 = r0
            r0 = r301
            r1 = r304
            r0._injectables = r1
            r0 = r302
            X.7Rt r0 = r0._objectIdReader
            r304 = r0
            r0 = r301
            r1 = r304
            r0._objectIdReader = r1
            r0 = r302
            boolean r0 = r0._nonStandardCreation
            r305 = r0
            r0 = r301
            r1 = r305
            r0._nonStandardCreation = r1
            r0 = r302
            X.7Ru r0 = r0._unwrappedPropertyHandler
            r304 = r0
            r0 = r301
            r1 = r304
            r0._unwrappedPropertyHandler = r1
            r0 = r302
            boolean r0 = r0._needViewProcesing
            r305 = r0
            r0 = r301
            r1 = r305
            r0._needViewProcesing = r1
            r0 = r302
            X.25t r0 = r0._serializationShape
            r304 = r0
            r0 = r301
            r1 = r304
            r0._serializationShape = r1
            r0 = r302
            boolean r0 = r0._vanillaProcessing
            r305 = r0
            r0 = r301
            r1 = r305
            r0._vanillaProcessing = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.<init>(com.fasterxml.jackson.databind.deser.BeanDeserializerBase, boolean):void");
    }

    public static JsonDeserializer A04(C27T c27t, 24S r302, 3pW r303) {
        68U r0 = new 6rW(r302, C68N.A01, A01, r303);
        C68e c68e = (C68e) r302._typeHandler;
        if (c68e == null) {
            C26L c26l = c27t._config;
            C24q c24q = c26l.A05(r302._class).A07;
            InterfaceC00923pT A0L = c26l.A02().A0L(c26l, c24q);
            ArrayList arrayList = null;
            if (A0L == null) {
                A0L = c26l._base._typeResolverBuilder;
                if (A0L == null) {
                    c68e = null;
                }
            } else {
                arrayList = c26l._subtypeResolver.A05(c26l, c24q);
            }
            c68e = A0L.ACs(c26l, r302, arrayList);
        }
        JsonDeserializer jsonDeserializer = (JsonDeserializer) r302._valueHandler;
        JsonDeserializer A0G = jsonDeserializer == null ? c27t.A0G(r0, r302) : c27t.A0I(r0, r302, jsonDeserializer);
        if (c68e != null) {
            return new TypeWrappedDeserializer(A0G, c68e.A04(r0));
        }
        return A0G;
    }

    public static void A07(68S r301, 68S r302, C68l c68l, 68S[] r304) {
        Object[] objArr = c68l._hashArea;
        int length = objArr.length;
        int i = 1;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                throw new NoSuchElementException(0Pz.A0j("No entry '", r301._propName._simpleName, "' found, can't replace"));
            }
            if (objArr[i2] == r301) {
                objArr[i2] = r302;
                c68l._propsInOrder[C68l.A00(r301, c68l)] = r302;
                if (r304 != null) {
                    int length2 = r304.length;
                    for (int i3 = 0; i3 < length2; i3++) {
                        if (r304[i3] == r301) {
                            r304[i3] = r302;
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            i = i2 + 2;
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public 68S A0O(String str) {
        Map map = this._backRefs;
        if (map == null) {
            return null;
        }
        return (68S) map.get(str);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public C7Rt A0P() {
        return this._objectIdReader;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public C42x A0Q() {
        return C42x.POJO;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Boolean A0R(C26L c26l) {
        return Boolean.TRUE;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Class A0S() {
        return this._beanType._class;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object A0T(AbstractC01033pi abstractC01033pi, C27T c27t, C68e c68e) {
        Object A1T;
        if (this._objectIdReader != null) {
            if (abstractC01033pi.A1j() && (A1T = abstractC01033pi.A1T()) != null) {
                return A1F(abstractC01033pi, c27t, c68e.A07(abstractC01033pi, c27t), A1T);
            }
            C42h A1I = abstractC01033pi.A1I();
            if (A1I != null) {
                if (A1I._isScalar) {
                    return A1B(abstractC01033pi, c27t);
                }
                if (A1I == C42h.A06) {
                    abstractC01033pi.A1K();
                }
            }
        }
        return c68e.A07(abstractC01033pi, c27t);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object A0U(C27T c27t) {
        try {
            return this._valueInstantiator.A09(c27t);
        } catch (IOException e) {
            27C.A0D(c27t, e);
            throw 0Q8.createAndThrow();
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Collection A0V() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this._beanProperties.iterator();
        while (it.hasNext()) {
            arrayList.add(((68S) it.next())._propName._simpleName);
        }
        return arrayList;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public boolean A0W() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public 24S A0c() {
        return this._beanType;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public 68W A0i() {
        return this._valueInstantiator;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public void A0w(AbstractC01033pi abstractC01033pi, C27T c27t, Object obj, String str) {
        if (this._ignoreAllUnknown) {
            abstractC01033pi.A20();
            return;
        }
        if (C68c.A01(str, this._ignorableProps, this._includableProps)) {
            A1G(abstractC01033pi, c27t, obj, str);
        }
        super.A0w(abstractC01033pi, c27t, obj, str);
    }

    public BeanDeserializerBase A12() {
        return new BeanAsArrayDeserializer(this, this._beanProperties._propsInOrder);
    }

    public BeanDeserializerBase A13(C68l c68l) {
        return new BeanDeserializerBase(this, c68l);
    }

    public BeanDeserializerBase A14(C7Rt c7Rt) {
        return new BeanDeserializerBase(this, c7Rt);
    }

    public BeanDeserializerBase A15(Set set, Set set2) {
        return new BeanDeserializerBase(this, set, set2);
    }

    public BeanDeserializerBase A16(boolean z) {
        return new BeanDeserializerBase(this, true);
    }

    public Object A17(AbstractC01033pi abstractC01033pi, C27T c27t) {
        String A1X;
        68S r0;
        BeanDeserializer beanDeserializer = (BeanDeserializer) this;
        7Rq r02 = beanDeserializer._propertyBasedCreator;
        L4v A012 = r02.A01(abstractC01033pi, c27t, beanDeserializer._objectIdReader);
        Class cls = beanDeserializer._needViewProcesing ? c27t._view : null;
        C42h A1I = abstractC01033pi.A1I();
        ArrayList arrayList = null;
        28P r312 = null;
        while (A1I == C42h.A03) {
            try {
                A1X = abstractC01033pi.A1X();
                abstractC01033pi.A1K();
                r0 = (68S) r02.A02.get(A1X);
            } catch (Exception e) {
                beanDeserializer.A1L(c27t, e);
            }
            if (!A012.A04(A1X) || r0 != null) {
                if (r0 == null) {
                    68S A02 = beanDeserializer._beanProperties.A02(A1X);
                    if (A02 != null) {
                        try {
                            A012.A02(A02, BeanDeserializer.A01(abstractC01033pi, c27t, beanDeserializer, A02));
                        } catch (C81f e2) {
                            JyB jyB = new JyB(c27t, A02._type, A02, e2);
                            e2._roid.A00(jyB);
                            if (arrayList == null) {
                                arrayList = AnonymousClass001.A0s();
                            }
                            arrayList.add(jyB);
                        }
                    } else if (C68c.A01(A1X, beanDeserializer._ignorableProps, beanDeserializer._includableProps)) {
                        beanDeserializer.A1G(abstractC01033pi, c27t, beanDeserializer._beanType._class, A1X);
                    } else {
                        7Rr r03 = beanDeserializer._anySetter;
                        if (r03 != null) {
                            try {
                                A012.A01(r03, r03.A00(abstractC01033pi, c27t), A1X);
                            } catch (Exception e3) {
                                beanDeserializer.A1K(c27t, beanDeserializer._beanType._class, A1X, e3);
                            }
                        } else if (beanDeserializer._ignoreAllUnknown) {
                            abstractC01033pi.A20();
                        } else {
                            if (r312 == null) {
                                r312 = new 28P(abstractC01033pi, c27t);
                            }
                            r312.A0o(A1X);
                            r312.A10(abstractC01033pi);
                        }
                    }
                } else if (cls != null && !r0.A0T(cls)) {
                    abstractC01033pi.A20();
                } else if (A012.A03(r0, BeanDeserializer.A01(abstractC01033pi, c27t, beanDeserializer, r0))) {
                    abstractC01033pi.A1K();
                    Object A022 = r02.A02(c27t, A012);
                    if (A022 == null) {
                        Class cls2 = beanDeserializer._beanType._class;
                        Exception exc = beanDeserializer.A00;
                        if (exc == null) {
                            exc = AnonymousClass001.A0Q("JSON Creator returned null");
                            beanDeserializer.A00 = exc;
                        }
                        c27t.A0m(cls2, exc);
                        throw 0Q8.createAndThrow();
                    }
                    abstractC01033pi.A1i(A022);
                    if (A022.getClass() != beanDeserializer._beanType._class) {
                        return beanDeserializer.A1E(abstractC01033pi, c27t, r312, A022);
                    }
                    if (r312 != null) {
                        beanDeserializer.A1J(c27t, r312, A022);
                    }
                    beanDeserializer.A0N(abstractC01033pi, c27t, A022);
                    return A022;
                }
            }
            A1I = abstractC01033pi.A1K();
        }
        Object A023 = r02.A02(c27t, A012);
        if (beanDeserializer._injectables != null) {
            beanDeserializer.A1I(c27t);
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((JyB) it.next()).A00 = A023;
            }
        }
        if (r312 != null) {
            if (A023.getClass() == beanDeserializer._beanType._class) {
                beanDeserializer.A1J(c27t, r312, A023);
                return A023;
            }
            A023 = beanDeserializer.A1E(null, c27t, r312, A023);
        }
        return A023;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r304 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A18(X.AbstractC01033pi r302, X.C27T r303) {
        /*
            r301 = this;
            r0 = r301
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r0._delegateDeserializer
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L12
            r0 = r301
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r0._arrayDelegateDeserializer
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L2e
        L12:
            r0 = r301
            X.68W r0 = r0._valueInstantiator
            r305 = r0
            r0 = r305
            boolean r0 = r0.A0K()
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L2e
            r0 = r302
            r1 = r303
            r2 = r304
            r3 = r301
            r4 = r305
            java.lang.Object r0 = X.68W.A03(r0, r1, r2, r3, r4)
            return r0
        L2e:
            r0 = r302
            X.42h r0 = r0.A1I()
            r305 = r0
            X.42h r0 = X.C42h.A0D
            r307 = r0
            r0 = r305
            r1 = r307
            boolean r0 = X.AnonymousClass001.A1W(r0, r1)
            r308 = r0
            r0 = r301
            X.68W r0 = r0._valueInstantiator
            r1 = r303
            r2 = r308
            java.lang.Object r0 = r0.A0I(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.A18(X.3pi, X.27T):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (r306 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006f, code lost:
    
        return r301._valueInstantiator.A0G(r303, r302.A1c());
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        if (r304._fromBigDecimalCreator != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b2, code lost:
    
        if (r306 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ea, code lost:
    
        return r301._valueInstantiator.A0A(r303, r302.A10());
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d3, code lost:
    
        if (r304._fromDoubleCreator != null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A19(X.AbstractC01033pi r302, X.C27T r303) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.A19(X.3pi, X.27T):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (r307.A0L() == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:
    
        if (r307.A0L() == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ad, code lost:
    
        if (((X.68V) r307)._fromBigIntegerCreator != null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A1A(X.AbstractC01033pi r302, X.C27T r303) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.A1A(X.3pi, X.27T):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Throwable, X.2cb, X.2LD, java.io.IOException, X.81f] */
    public Object A1B(AbstractC01033pi abstractC01033pi, C27T c27t) {
        Object A0M = this._objectIdReader._deserializer.A0M(abstractC01033pi, c27t);
        C7Rt c7Rt = this._objectIdReader;
        KtU A0P = c27t.A0P(c7Rt.generator, c7Rt.resolver, A0M);
        MCW mcw = A0P.A00;
        3eS r0 = A0P.A03;
        Map map = ((La0) mcw).A00;
        Object obj = map == null ? null : map.get(r0);
        A0P.A01 = obj;
        if (obj != null) {
            return obj;
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Could not resolve Object Id [");
        A0k.append(A0M);
        A0k.append("] (for ");
        A0k.append(this._beanType);
        String A0d = AnonymousClass001.A0d(").", A0k);
        4DN A1C = abstractC01033pi.A1C();
        ?? iOException = new IOException(A0d, null);
        ((2LD) iOException)._location = A1C;
        iOException.A00 = abstractC01033pi;
        iOException._roid = A0P;
        throw iOException;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0065, code lost:
    
        if (r0.getEnclosingClass() == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A1C(X.AbstractC01033pi r302, X.C27T r303) {
        /*
            r301 = this;
            r0 = r301
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r0._delegateDeserializer
            r304 = r0
            r0 = r304
            if (r0 != 0) goto La7
            r0 = r301
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r0._arrayDelegateDeserializer
            r304 = r0
            r0 = r304
            if (r0 != 0) goto La7
            r0 = r301
            X.7Rq r0 = r0._propertyBasedCreator
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L24
            r0 = r301
            r1 = r302
            r2 = r303
            java.lang.Object r0 = r0.A17(r1, r2)
            return r0
        L24:
            r0 = r301
            X.24S r0 = r0._beanType
            java.lang.Class r0 = r0._class
            r306 = r0
            java.util.Iterator r0 = X.27C.A00
            r305 = r0
            r0 = r306
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            r307 = r0
            r0 = r307
            if (r0 != 0) goto L68
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r305 = r0
            r0 = r306
            r1 = r305
            if (r0 == r1) goto L68
            r0 = r306
            boolean r0 = r0.isPrimitive()
            r307 = r0
            r0 = r307
            if (r0 != 0) goto L68
            r0 = r306
            java.lang.Class r0 = r0.getEnclosingClass()
            r305 = r0
            r0 = 1
            r308 = r0
            r0 = r305
            if (r0 != 0) goto L6e
        L68:
            r0 = 0
            r308 = r0
            r0 = 0
            r309 = r0
        L6e:
            r0 = 0
            r304 = r0
            r0 = r308
            if (r0 == 0) goto L94
            r0 = 0
            r307 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r309 = r0
            java.lang.String r0 = "non-static inner classes like this can only by instantiated using default, no-argument constructor"
            r304 = r0
        L85:
            r0 = r303
            r1 = r305
            r2 = r306
            r3 = r304
            r4 = r309
            r0.A0f(r1, r2, r3, r4)
            X.0Q8 r0 = X.0Q8.createAndThrow()
            throw r0
        L94:
            r0 = r301
            X.68W r0 = r0._valueInstantiator
            r305 = r0
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r309 = r0
            java.lang.String r0 = "cannot deserialize from Object value (no delegate- or property-based Creator)"
            r304 = r0
            goto L85
        La7:
            r0 = r301
            X.68W r0 = r0._valueInstantiator
            r305 = r0
            r0 = r302
            r1 = r303
            r2 = r304
            r3 = r301
            r4 = r305
            java.lang.Object r0 = X.68W.A03(r0, r1, r2, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.A1C(X.3pi, X.27T):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (r305 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A1D(X.AbstractC01033pi r302, X.C27T r303) {
        /*
            r301 = this;
            r0 = r301
            X.7Rt r0 = r0._objectIdReader
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L10
            r0 = r301
            r1 = r302
            r2 = r303
            java.lang.Object r0 = r0.A1B(r1, r2)
            return r0
        L10:
            r0 = r301
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r0._delegateDeserializer
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L26
            r0 = r301
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r0._arrayDelegateDeserializer
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L43
        L26:
            r0 = r301
            X.68W r0 = r0._valueInstantiator
            r306 = r0
            r0 = r306
            boolean r0 = r0.A0O()
            r307 = r0
            r0 = r307
            if (r0 != 0) goto L43
            r0 = r302
            r1 = r303
            r2 = r305
            r3 = r301
            r4 = r306
            java.lang.Object r0 = X.68W.A03(r0, r1, r2, r3, r4)
            return r0
        L43:
            r0 = r301
            r1 = r302
            r2 = r303
            java.lang.Object r0 = r0.A0q(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.A1D(X.3pi, X.27T):java.lang.Object");
    }

    public Object A1E(AbstractC01033pi abstractC01033pi, C27T c27t, 28P r304, Object obj) {
        JsonDeserializer jsonDeserializer;
        synchronized (this) {
            HashMap hashMap = this.A00;
            jsonDeserializer = hashMap == null ? null : (JsonDeserializer) hashMap.get(new Liw(obj.getClass()));
        }
        if (jsonDeserializer == null) {
            Class<?> cls = obj.getClass();
            jsonDeserializer = c27t.A0J(c27t.A0F(cls));
            if (jsonDeserializer != null) {
                synchronized (this) {
                    HashMap hashMap2 = this.A00;
                    if (hashMap2 == null) {
                        hashMap2 = AnonymousClass001.A0u();
                        this.A00 = hashMap2;
                    }
                    hashMap2.put(new Liw(cls), jsonDeserializer);
                }
            }
        }
        if (jsonDeserializer != null) {
            if (r304 != null) {
                r304.A0Y();
                4rL A00 = 28P.A00(r304.A02, r304);
                A00.A1K();
                obj = jsonDeserializer.A0N(A00, c27t, obj);
            }
            if (abstractC01033pi != null) {
                obj = jsonDeserializer.A0N(abstractC01033pi, c27t, obj);
            }
        } else {
            if (r304 != null) {
                A1J(c27t, r304, obj);
            }
            if (abstractC01033pi != null) {
                return A0N(abstractC01033pi, c27t, obj);
            }
        }
        return obj;
    }

    public Object A1F(AbstractC01033pi abstractC01033pi, C27T c27t, Object obj, Object obj2) {
        JsonDeserializer jsonDeserializer = this._objectIdReader._deserializer;
        if (jsonDeserializer.A0S() != obj2.getClass()) {
            28P r0 = new 28P(abstractC01033pi, c27t);
            if (obj2 instanceof String) {
                r0.A0r((String) obj2);
            } else if (obj2 instanceof Long) {
                r0.A0g(AnonymousClass001.A05(obj2));
            } else if (obj2 instanceof Integer) {
                r0.A0f(AnonymousClass001.A03(obj2));
            } else {
                r0.A0P(obj2);
            }
            AbstractC01033pi A00 = 28P.A00(r0.A02, r0);
            A00.A1K();
            obj2 = jsonDeserializer.A0M(A00, c27t);
        }
        C7Rt c7Rt = this._objectIdReader;
        c27t.A0P(c7Rt.generator, c7Rt.resolver, obj2).A01(obj);
        68S r02 = this._objectIdReader.idProperty;
        return r02 != null ? r02.A0F(obj, obj2) : obj;
    }

    public void A1G(AbstractC01033pi abstractC01033pi, C27T c27t, Object obj, String str) {
        if (!c27t.A0p(C26O.A06)) {
            abstractC01033pi.A20();
            return;
        }
        Collection A0V = A0V();
        Class<?> cls = obj instanceof Class ? (Class) obj : obj.getClass();
        4DO c68r = new C68r(abstractC01033pi.A1C(), abstractC01033pi, cls, String.format("Ignored field \"%s\" (class %s) encountered; mapper configured not to allow this", str, cls.getName()), str, A0V);
        c68r.A08(obj, str);
        throw c68r;
    }

    public void A1H(AbstractC01033pi abstractC01033pi, C27T c27t, Object obj, String str) {
        if (C68c.A01(str, this._ignorableProps, this._includableProps)) {
            A1G(abstractC01033pi, c27t, obj, str);
            return;
        }
        7Rr r0 = this._anySetter;
        if (r0 == null) {
            A0w(abstractC01033pi, c27t, obj, str);
            return;
        }
        try {
            r0.A01(abstractC01033pi, c27t, obj, str);
        } catch (Exception e) {
            A1K(c27t, obj, str, e);
            throw 0Q8.createAndThrow();
        }
    }

    public void A1I(C27T c27t) {
        7Rs[] r0 = this._injectables;
        if (0 < r0.length) {
            c27t.A0n(r0[0]._valueId);
            throw 0Q8.createAndThrow();
        }
    }

    public void A1J(C27T c27t, 28P r303, Object obj) {
        r303.A0Y();
        4rL A00 = 28P.A00(r303.A02, r303);
        while (A00.A1K() != C42h.A02) {
            String A1X = A00.A1X();
            A00.A1K();
            A0w(A00, c27t, obj, A1X);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        if (r302.A0p(X.C26O.A0Q) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006f, code lost:
    
        if ((r305 instanceof X.2LE) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1K(X.C27T r302, java.lang.Object r303, java.lang.String r304, java.lang.Throwable r305) {
        /*
            r301 = this;
        L0:
            r0 = r305
            boolean r0 = r0 instanceof java.lang.reflect.InvocationTargetException
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L28
            r0 = r305
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.Throwable r0 = r0.getCause()
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L28
            r0 = r305
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.Throwable r0 = r0.getCause()
            r305 = r0
            goto L0
        L28:
            java.util.Iterator r0 = X.27C.A00
            r307 = r0
            r0 = r305
            boolean r0 = r0 instanceof java.lang.Error
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L8d
            r0 = r302
            if (r0 == 0) goto L52
            X.26O r0 = X.C26O.A0Q
            r307 = r0
            r0 = r302
            r1 = r307
            boolean r0 = r0.A0p(r1)
            r306 = r0
            r0 = 0
            r308 = r0
            r0 = r306
            if (r0 == 0) goto L55
        L52:
            r0 = 1
            r308 = r0
        L55:
            r0 = r305
            boolean r0 = r0 instanceof java.io.IOException
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L7d
            r0 = r308
            if (r0 == 0) goto L8d
            r0 = r305
            boolean r0 = r0 instanceof X.2LE
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L8d
        L72:
            r0 = r303
            r1 = r304
            r2 = r305
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            X.2cb r0 = X.C2cb.A02(r0, r1, r2)
            throw r0
        L7d:
            r0 = r308
            if (r0 != 0) goto L72
            r0 = r305
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            X.27C.A0H(r0)
            goto L72
        L8d:
            r0 = r305
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.A1K(X.27T, java.lang.Object, java.lang.String, java.lang.Throwable):void");
    }

    public void A1L(C27T c27t, Throwable th) {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        Iterator it = 27C.A00;
        if ((th instanceof Error) || (th instanceof IOException)) {
            throw th;
        }
        if (c27t == null) {
            throw new IllegalArgumentException(th.getMessage(), th);
        }
        if (!c27t.A0p(C26O.A0Q)) {
            27C.A0H(th);
        }
        c27t.A0m(this._beanType._class, th);
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0090, code lost:
    
        if (r313 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00f9, code lost:
    
        r314 = r313._type;
        r312 = new X.JxZ(r0.A03);
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r0 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0289, code lost:
    
        if (r308 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00b3, code lost:
    
        if (r313 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x011c, code lost:
    
        if (r304 != null) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02b6  */
    @Override // X.AnonymousClass437
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.databind.JsonDeserializer AJM(X.68U r302, X.C27T r303) {
        /*
            Method dump skipped, instructions count: 835
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.AJM(X.68U, X.27T):com.fasterxml.jackson.databind.JsonDeserializer");
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x03ee, code lost:
    
        if (r0.A01 != false) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0505 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x019b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x079f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x08de A[SYNTHETIC] */
    @Override // X.AnonymousClass436
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Cht(X.C27T r302) {
        /*
            Method dump skipped, instructions count: 2684
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerBase.Cht(X.27T):void");
    }
}
