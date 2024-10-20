package com.fasterxml.jackson.databind.deser;

import X.0Q8;
import X.24S;
import X.27C;
import X.28P;
import X.4rL;
import X.68S;
import X.7Rr;
import X.AbstractC00603o4;
import X.AbstractC01033pi;
import X.C25m;
import X.C26O;
import X.C27T;
import X.C42h;
import X.C68c;
import X.L1J;
import X.L8e;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.Serializable;

/* loaded from: BeanDeserializer.class */
public class BeanDeserializer extends BeanDeserializerBase implements Serializable {
    public static final long serialVersionUID = 1;
    public transient Exception A00;
    public volatile transient L1J A01;

    private final Object A00(AbstractC01033pi abstractC01033pi, C27T c27t) {
        Object A09 = this._valueInstantiator.A09(c27t);
        abstractC01033pi.A1i(A09);
        if (abstractC01033pi.A1t(5)) {
            String A1X = abstractC01033pi.A1X();
            do {
                abstractC01033pi.A1K();
                68S A02 = this._beanProperties.A02(A1X);
                if (A02 != null) {
                    try {
                        A02.A0L(A09, abstractC01033pi, c27t);
                    } catch (Exception e) {
                        A1K(c27t, A09, A1X, e);
                        throw 0Q8.createAndThrow();
                    }
                } else {
                    A1H(abstractC01033pi, c27t, A09, A1X);
                }
                A1X = abstractC01033pi.A1a();
            } while (A1X != null);
        }
        return A09;
    }

    public static final Object A01(AbstractC01033pi abstractC01033pi, C27T c27t, BeanDeserializer beanDeserializer, 68S r304) {
        try {
            return r304.A0C(abstractC01033pi, c27t);
        } catch (Exception e) {
            beanDeserializer.A1K(c27t, beanDeserializer._beanType._class, r304._propName._simpleName, e);
            throw 0Q8.createAndThrow();
        }
    }

    private void A02(AbstractC01033pi abstractC01033pi, C27T c27t, L8e l8e, Object obj) {
        Class cls = this._needViewProcesing ? c27t._view : null;
        C42h A1I = abstractC01033pi.A1I();
        while (A1I == C42h.A03) {
            String A1X = abstractC01033pi.A1X();
            C42h A1K = abstractC01033pi.A1K();
            68S A02 = this._beanProperties.A02(A1X);
            if (A02 != null) {
                if (A1K._isScalar) {
                    l8e.A01(abstractC01033pi, c27t, obj, A1X);
                }
                if (cls == null || A02.A0T(cls)) {
                    try {
                        A02.A0L(obj, abstractC01033pi, c27t);
                    } catch (Exception e) {
                        A1K(c27t, obj, A1X, e);
                        throw 0Q8.createAndThrow();
                    }
                } else {
                    abstractC01033pi.A20();
                }
            } else if (C68c.A01(A1X, this._ignorableProps, this._includableProps)) {
                A1G(abstractC01033pi, c27t, obj, A1X);
            } else if (!l8e.A03(abstractC01033pi, c27t, obj, A1X)) {
                7Rr r0 = this._anySetter;
                if (r0 != null) {
                    r0.A01(abstractC01033pi, c27t, obj, A1X);
                } else {
                    A0w(abstractC01033pi, c27t, obj, A1X);
                }
            }
            A1I = abstractC01033pi.A1K();
        }
        l8e.A02(obj, abstractC01033pi, c27t);
    }

    private final void A03(AbstractC01033pi abstractC01033pi, C27T c27t, Class cls, Object obj) {
        if (abstractC01033pi.A1t(5)) {
            String A1X = abstractC01033pi.A1X();
            do {
                abstractC01033pi.A1K();
                68S A02 = this._beanProperties.A02(A1X);
                if (A02 == null) {
                    A1H(abstractC01033pi, c27t, obj, A1X);
                } else if (A02.A0T(cls)) {
                    try {
                        A02.A0L(obj, abstractC01033pi, c27t);
                    } catch (Exception e) {
                        A1K(c27t, obj, A1X, e);
                        throw 0Q8.createAndThrow();
                    }
                } else {
                    abstractC01033pi.A20();
                }
                A1X = abstractC01033pi.A1a();
            } while (A1X != null);
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public JsonDeserializer A0K(L1J l1j) {
        if (getClass() != BeanDeserializer.class || this.A01 == l1j) {
            return this;
        }
        this.A01 = l1j;
        try {
            return new BeanDeserializerBase(this, l1j);
        } finally {
            this.A01 = null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f5, code lost:
    
        if (r308 != null) goto L31;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0034. Please report as an issue. */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A0M(X.AbstractC01033pi r302, X.C27T r303) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializer.A0M(X.3pi, X.27T):java.lang.Object");
    }

    /* JADX WARN: Failed to calculate best type for var: r301v0 'this'  ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:390)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:355)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Failed to calculate best type for var: r310v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r310v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Failed to set immutable type for var: r301v0 'this'  ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:390)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:355)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:70)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:100)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:100)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Multi-variable type inference failed. Error: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:390)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:355)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:70)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:116)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Not initialized variable reg: 310, insn: 0x01ec: MOVE (r3 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r310 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:83:0x01e9 */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object A0N(AbstractC01033pi abstractC01033pi, C27T c27t, Object obj) {
        String str;
        String A1X;
        Class cls;
        abstractC01033pi.A1i(obj);
        if (this._injectables != null) {
            A1I(c27t);
        }
        try {
            if (this._unwrappedPropertyHandler == null) {
                L8e l8e = this._externalTypeIdHandler;
                if (l8e != null) {
                    A02(abstractC01033pi, c27t, new L8e(l8e), obj);
                    return obj;
                }
                if (abstractC01033pi.A1q()) {
                    A1X = abstractC01033pi.A1a();
                    if (A1X == null) {
                        return obj;
                    }
                } else if (abstractC01033pi.A1t(5)) {
                    A1X = abstractC01033pi.A1X();
                }
                if (this._needViewProcesing && (cls = c27t._view) != null) {
                    A03(abstractC01033pi, c27t, cls, obj);
                    return obj;
                }
                do {
                    abstractC01033pi.A1K();
                    68S A02 = this._beanProperties.A02(A1X);
                    if (A02 != null) {
                        A02.A0L(obj, abstractC01033pi, c27t);
                    } else {
                        A1H(abstractC01033pi, c27t, obj, A1X);
                    }
                    A1X = abstractC01033pi.A1a();
                } while (A1X != null);
                return obj;
            }
            C42h A1I = abstractC01033pi.A1I();
            if (A1I == C42h.A06) {
                A1I = abstractC01033pi.A1K();
            }
            28P r0 = new 28P(abstractC01033pi, c27t);
            r0.A0b();
            Class cls2 = this._needViewProcesing ? c27t._view : null;
            while (A1I == C42h.A03) {
                String A1X2 = abstractC01033pi.A1X();
                68S A022 = this._beanProperties.A02(A1X2);
                abstractC01033pi.A1K();
                if (A022 != null) {
                    if (cls2 == null || A022.A0T(cls2)) {
                        A022.A0L(obj, abstractC01033pi, c27t);
                    } else {
                        abstractC01033pi.A20();
                    }
                } else if (C68c.A01(A1X2, this._ignorableProps, this._includableProps)) {
                    A1G(abstractC01033pi, c27t, obj, A1X2);
                } else if (this._anySetter == null) {
                    r0.A0o(A1X2);
                    r0.A10(abstractC01033pi);
                } else {
                    28P r02 = new 28P(abstractC01033pi, c27t);
                    r02.A10(abstractC01033pi);
                    r0.A0o(A1X2);
                    r0.A12(r02);
                    7Rr r03 = this._anySetter;
                    4rL A00 = 28P.A00(r02.A02, r02);
                    A00.A1K();
                    r03.A01(A00, c27t, obj, A1X2);
                }
                A1I = abstractC01033pi.A1K();
            }
            r0.A0Y();
            this._unwrappedPropertyHandler.A00(c27t, r0, obj);
            return obj;
        } catch (Exception e) {
            A1K(c27t, obj, str, e);
            throw 0Q8.createAndThrow();
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public Object A0p(AbstractC01033pi abstractC01033pi, C27T c27t) {
        Object A0D;
        C42h c42h;
        24S A0d;
        Object[] objArr;
        String str;
        JsonDeserializer jsonDeserializer = this._arrayDelegateDeserializer;
        if (jsonDeserializer == null) {
            jsonDeserializer = this._delegateDeserializer;
            if (jsonDeserializer == null) {
                C25m A0f = A0f(c27t);
                boolean A0p = c27t.A0p(C26O.A0L);
                if (A0p || A0f != C25m.Fail) {
                    C42h A1K = abstractC01033pi.A1K();
                    C42h c42h2 = C42h.A01;
                    if (A1K == c42h2) {
                        int ordinal = A0f.ordinal();
                        if (ordinal == 3) {
                            return A0U(c27t);
                        }
                        if (ordinal == 2 || ordinal == 1) {
                            return Azd(c27t);
                        }
                        A0d = A0d(c27t);
                        c42h = C42h.A05;
                        str = null;
                        objArr = new Object[0];
                    } else if (A0p) {
                        C42h A1K2 = abstractC01033pi.A1K();
                        c42h = C42h.A05;
                        if (A1K2 != c42h) {
                            A0D = A0M(abstractC01033pi, c27t);
                            if (abstractC01033pi.A1K() != c42h2) {
                                A0x(c27t);
                                throw 0Q8.createAndThrow();
                            }
                            return A0D;
                        }
                        A0d = A0d(c27t);
                        objArr = new Object[]{27C.A04(A0d), AbstractC00603o4.A00(344)};
                        str = "Cannot deserialize value of type %s from deeply-nested JSON Array: only single wrapper allowed with `%s`";
                    }
                    c27t.A0V(abstractC01033pi, c42h, A0d, str, objArr);
                    throw 0Q8.createAndThrow();
                }
                c27t.A0W(abstractC01033pi, A0d(c27t));
                throw 0Q8.createAndThrow();
            }
        }
        A0D = this._valueInstantiator.A0D(c27t, jsonDeserializer.A0M(abstractC01033pi, c27t));
        if (this._injectables != null) {
            A1I(c27t);
        }
        return A0D;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0772  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0806  */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.String, X.7Rt] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A1M(X.AbstractC01033pi r302, X.C27T r303) {
        /*
            Method dump skipped, instructions count: 2655
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializer.A1M(X.3pi, X.27T):java.lang.Object");
    }
}
