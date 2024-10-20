package com.fasterxml.jackson.databind.deser.impl;

import X.0Q8;
import X.24S;
import X.2LD;
import X.4DO;
import X.68S;
import X.AbstractC01033pi;
import X.AnonymousClass001;
import X.C26G;
import X.C26L;
import X.C26O;
import X.C27T;
import X.C2cb;
import X.C42h;
import X.C68D;
import X.C68l;
import X.C7Rt;
import X.L1J;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;
import java.util.Set;

/* loaded from: BeanAsArrayBuilderDeserializer.class */
public class BeanAsArrayBuilderDeserializer extends BeanDeserializerBase {
    public static final long serialVersionUID = 1;
    public final C68D _buildMethod;
    public final BeanDeserializerBase _delegate;
    public final 68S[] _orderedProperties;
    public final 24S _targetType;

    public BeanAsArrayBuilderDeserializer(24S r302, BeanDeserializerBase beanDeserializerBase, C68D c68d, 68S[] r305) {
        super(beanDeserializerBase, beanDeserializerBase._ignoreAllUnknown);
        this._delegate = beanDeserializerBase;
        this._targetType = r302;
        this._orderedProperties = r305;
        this._buildMethod = c68d;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public JsonDeserializer A0K(L1J l1j) {
        return this._delegate.A0K(l1j);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
        Object A09;
        C26G c26g;
        if (abstractC01033pi.A1p()) {
            if (this._vanillaProcessing) {
                A09 = this._valueInstantiator.A09(c27t);
                68S[] r0 = this._orderedProperties;
                int length = r0.length;
                int i = 0;
                while (true) {
                    C42h A1K = abstractC01033pi.A1K();
                    C42h c42h = C42h.A01;
                    if (A1K != c42h) {
                        if (i != length) {
                            68S r02 = r0[i];
                            if (r02 != null) {
                                try {
                                    A09 = r02.A0D(abstractC01033pi, c27t, A09);
                                } catch (Exception e) {
                                    e = e;
                                    c26g = r02._propName;
                                    A1K(c27t, A09, c26g._simpleName, e);
                                    throw 0Q8.createAndThrow();
                                }
                            } else {
                                abstractC01033pi.A20();
                            }
                            i++;
                        } else {
                            if (!this._ignoreAllUnknown && c27t.A0p(C26O.A0F)) {
                                Class cls = this._beanType._class;
                                2LD c2cb = new C2cb(c27t.A00, String.format("Unexpected JSON values; expected at most %d properties (in JSON Array)", AnonymousClass001.A1a(length)));
                                ((4DO) c2cb)._targetType = cls;
                                throw c2cb;
                            }
                            while (abstractC01033pi.A1K() != c42h) {
                                abstractC01033pi.A20();
                            }
                        }
                    }
                }
            } else if (this._nonStandardCreation) {
                A09 = A1C(abstractC01033pi, c27t);
            } else {
                A09 = this._valueInstantiator.A09(c27t);
                if (this._injectables != null) {
                    A1I(c27t);
                }
                Class cls2 = this._needViewProcesing ? c27t._view : null;
                68S[] r03 = this._orderedProperties;
                int length2 = r03.length;
                int i2 = 0;
                while (true) {
                    C42h A1K2 = abstractC01033pi.A1K();
                    C42h c42h2 = C42h.A01;
                    if (A1K2 != c42h2) {
                        if (i2 != length2) {
                            68S r04 = r03[i2];
                            i2++;
                            if (r04 == null || !(cls2 == null || r04.A0T(cls2))) {
                                abstractC01033pi.A20();
                            } else {
                                try {
                                    r04.A0D(abstractC01033pi, c27t, A09);
                                } catch (Exception e2) {
                                    e = e2;
                                    c26g = r04._propName;
                                    A1K(c27t, A09, c26g._simpleName, e);
                                    throw 0Q8.createAndThrow();
                                }
                            }
                        } else if (this._ignoreAllUnknown || !c27t.A0p(C26O.A0F)) {
                            while (abstractC01033pi.A1K() != c42h2) {
                                abstractC01033pi.A20();
                            }
                        } else {
                            c27t.A0a(c42h2, this, "Unexpected JSON value(s); expected at most %d properties (in JSON Array)", AnonymousClass001.A1a(length2));
                        }
                    }
                }
            }
            try {
                return this._buildMethod.A00.invoke(A09, null);
            } catch (Exception e3) {
                A1L(c27t, e3);
            }
        } else {
            24S A0d = A0d(c27t);
            C42h A1I = abstractC01033pi.A1I();
            c27t.A0V(abstractC01033pi, A1I, A0d, "Cannot deserialize a POJO (of type %s) from non-Array representation (token: %s): type/property designed to be serialized as JSON Array", this._beanType._class.getName(), A1I);
        }
        throw 0Q8.createAndThrow();
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object A0N(AbstractC01033pi abstractC01033pi, C27T c27t, Object obj) {
        return this._delegate.A0N(abstractC01033pi, c27t, obj);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase, com.fasterxml.jackson.databind.JsonDeserializer
    public Boolean A0R(C26L c26l) {
        return Boolean.FALSE;
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase A12() {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase A13(C68l c68l) {
        BeanDeserializerBase A13 = this._delegate.A13(c68l);
        return new BeanAsArrayBuilderDeserializer(this._targetType, A13, this._buildMethod, this._orderedProperties);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase A14(C7Rt c7Rt) {
        BeanDeserializerBase A14 = this._delegate.A14(c7Rt);
        return new BeanAsArrayBuilderDeserializer(this._targetType, A14, this._buildMethod, this._orderedProperties);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase A15(Set set, Set set2) {
        BeanDeserializerBase A15 = this._delegate.A15(set, set2);
        return new BeanAsArrayBuilderDeserializer(this._targetType, A15, this._buildMethod, this._orderedProperties);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase A16(boolean z) {
        BeanDeserializerBase A16 = this._delegate.A16(true);
        return new BeanAsArrayBuilderDeserializer(this._targetType, A16, this._buildMethod, this._orderedProperties);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x017b, code lost:
    
        if (r311 != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0185, code lost:
    
        return r0.A02(r303, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0186, code lost:
    
        r305 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0188, code lost:
    
        A1L(r303, r305);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01af, code lost:
    
        return r311;
     */
    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A17(X.AbstractC01033pi r302, X.C27T r303) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer.A17(X.3pi, X.27T):java.lang.Object");
    }
}
