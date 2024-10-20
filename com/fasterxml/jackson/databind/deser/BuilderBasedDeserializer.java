package com.fasterxml.jackson.databind.deser;

import X.0Q8;
import X.24S;
import X.28P;
import X.68S;
import X.68X;
import X.7Rr;
import X.AbstractC01033pi;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass251;
import X.C25m;
import X.C26L;
import X.C26O;
import X.C27T;
import X.C42h;
import X.C68D;
import X.C68c;
import X.C68l;
import X.C7Rt;
import X.JQx;
import X.L1J;
import X.L8e;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer;
import java.util.Map;
import java.util.Set;

/* loaded from: BuilderBasedDeserializer.class */
public class BuilderBasedDeserializer extends BeanDeserializerBase {
    public static final long serialVersionUID = 1;
    public final C68D _buildMethod;
    public final 24S _targetType;

    public BuilderBasedDeserializer(24S r302, 68X r303, C68l c68l, AnonymousClass251 anonymousClass251, Map map, Set set, Set set2, boolean z, boolean z2) {
        super(r303, c68l, anonymousClass251, map, set, set2, z, z2);
        this._targetType = r302;
        this._buildMethod = r303.A04;
        if (this._objectIdReader == null) {
            return;
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Cannot use Object Id with Builder-based deserialization (type ");
        A0k.append(anonymousClass251.A05);
        throw AnonymousClass002.A0D(")", A0k);
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer) {
        super((BeanDeserializerBase) builderBasedDeserializer, true);
        this._buildMethod = builderBasedDeserializer._buildMethod;
        this._targetType = builderBasedDeserializer._targetType;
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, C68l c68l) {
        super(builderBasedDeserializer, c68l);
        this._buildMethod = builderBasedDeserializer._buildMethod;
        this._targetType = builderBasedDeserializer._targetType;
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, C7Rt c7Rt) {
        super(builderBasedDeserializer, c7Rt);
        this._buildMethod = builderBasedDeserializer._buildMethod;
        this._targetType = builderBasedDeserializer._targetType;
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, L1J l1j) {
        super(builderBasedDeserializer, l1j);
        this._buildMethod = builderBasedDeserializer._buildMethod;
        this._targetType = builderBasedDeserializer._targetType;
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, Set set, Set set2) {
        super(builderBasedDeserializer, set, set2);
        this._buildMethod = builderBasedDeserializer._buildMethod;
        this._targetType = builderBasedDeserializer._targetType;
    }

    private Object A00(AbstractC01033pi abstractC01033pi, C27T c27t, 28P r304, Object obj) {
        Class cls = this._needViewProcesing ? c27t._view : null;
        C42h A1I = abstractC01033pi.A1I();
        while (A1I == C42h.A03) {
            String A1X = abstractC01033pi.A1X();
            68S A02 = this._beanProperties.A02(A1X);
            abstractC01033pi.A1K();
            if (A02 != null) {
                if (cls == null || A02.A0T(cls)) {
                    try {
                        obj = A02.A0D(abstractC01033pi, c27t, obj);
                    } catch (Exception e) {
                        A1K(c27t, obj, A1X, e);
                        throw 0Q8.createAndThrow();
                    }
                } else {
                    abstractC01033pi.A20();
                }
            } else if (C68c.A01(A1X, this._ignorableProps, this._includableProps)) {
                A1G(abstractC01033pi, c27t, obj, A1X);
            } else {
                r304.A0o(A1X);
                r304.A10(abstractC01033pi);
                7Rr r0 = this._anySetter;
                if (r0 != null) {
                    r0.A01(abstractC01033pi, c27t, obj, A1X);
                }
            }
            A1I = abstractC01033pi.A1K();
        }
        r304.A0Y();
        this._unwrappedPropertyHandler.A00(c27t, r304, obj);
        return obj;
    }

    private final Object A01(AbstractC01033pi abstractC01033pi, C27T c27t, Class cls, Object obj) {
        C42h A1I = abstractC01033pi.A1I();
        while (A1I == C42h.A03) {
            String A1X = abstractC01033pi.A1X();
            abstractC01033pi.A1K();
            68S A02 = this._beanProperties.A02(A1X);
            if (A02 == null) {
                A1H(abstractC01033pi, c27t, obj, A1X);
            } else if (A02.A0T(cls)) {
                try {
                    obj = A02.A0D(abstractC01033pi, c27t, obj);
                } catch (Exception e) {
                    A1K(c27t, obj, A1X, e);
                    throw 0Q8.createAndThrow();
                }
            } else {
                abstractC01033pi.A20();
            }
            A1I = abstractC01033pi.A1K();
        }
        return obj;
    }

    private Object A02(AbstractC01033pi abstractC01033pi, C27T c27t, Object obj) {
        Class cls = this._needViewProcesing ? c27t._view : null;
        L8e l8e = new L8e(this._externalTypeIdHandler);
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
                        obj = A02.A0D(abstractC01033pi, c27t, obj);
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
        return obj;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public JsonDeserializer A0K(L1J l1j) {
        return new BuilderBasedDeserializer(this, l1j);
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
    /* JADX WARN: Failed to calculate best type for var: r306v0 ??
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
    /* JADX WARN: Failed to calculate best type for var: r306v0 ??
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
    /* JADX WARN: Failed to calculate best type for var: r307v0 ??
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
    /* JADX WARN: Failed to calculate best type for var: r307v0 ??
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
    /* JADX WARN: Failed to find 'out' block for switch in B:151:0x0078. Please report as an issue. */
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
    /* JADX WARN: Multi-variable type inference failed. Error: java.lang.NullPointerException
     */
    /* JADX WARN: Not initialized variable reg: 306, insn: 0x0491: MOVE (r2 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r306 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:161:0x048f */
    /* JADX WARN: Not initialized variable reg: 307, insn: 0x0493: MOVE (r3 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r307 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:161:0x048f */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x04d1 A[Catch: Exception -> 0x04e6, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x04e6, blocks: (B:20:0x04d1, B:22:0x04e1, B:83:0x027c), top: B:82:0x027c }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c7  */
    /* JADX WARN: Type inference failed for: r301v0, types: [com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.deser.BeanDeserializerBase, com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer] */
    /* JADX WARN: Type inference failed for: r306v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r307v0, types: [java.lang.String] */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A0M(X.AbstractC01033pi r302, X.C27T r303) {
        /*
            Method dump skipped, instructions count: 1282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.A0M(X.3pi, X.27T):java.lang.Object");
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object A0N(AbstractC01033pi abstractC01033pi, C27T c27t, Object obj) {
        Object[] objArr;
        String str;
        24S r0 = this._targetType;
        Class cls = this._beanType._class;
        Class<?> cls2 = obj.getClass();
        if (cls.isAssignableFrom(cls2)) {
            objArr = new Object[]{r0, cls.getName()};
            str = "Deserialization of %s by passing existing Builder (%s) instance not supported";
        } else {
            objArr = new Object[]{r0, cls2.getName()};
            str = "Deserialization of %s by passing existing instance (of %s) not supported";
        }
        JQx.A1I(c27t, r0, str, objArr);
        throw 0Q8.createAndThrow();
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase, com.fasterxml.jackson.databind.JsonDeserializer
    public Boolean A0R(C26L c26l) {
        return Boolean.FALSE;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public Object A0p(AbstractC01033pi abstractC01033pi, C27T c27t) {
        JsonDeserializer jsonDeserializer = this._arrayDelegateDeserializer;
        if (jsonDeserializer == null) {
            jsonDeserializer = this._delegateDeserializer;
            if (jsonDeserializer == null) {
                C25m A0f = A0f(c27t);
                boolean A0p = c27t.A0p(C26O.A0L);
                if (A0p || A0f != C25m.Fail) {
                    C42h A1K = abstractC01033pi.A1K();
                    C42h c42h = C42h.A01;
                    if (A1K == c42h) {
                        int ordinal = A0f.ordinal();
                        if (ordinal == 3) {
                            return A0U(c27t);
                        }
                        if (ordinal == 2 || ordinal == 1) {
                            return Azd(c27t);
                        }
                        c27t.A0V(abstractC01033pi, C42h.A05, A0d(c27t), null, AnonymousClass001.A1Z());
                    } else if (A0p) {
                        Object A0M = A0M(abstractC01033pi, c27t);
                        if (abstractC01033pi.A1K() == c42h) {
                            return A0M;
                        }
                        A0x(c27t);
                    }
                    throw 0Q8.createAndThrow();
                }
                JsonDeserializer.A05(abstractC01033pi, c27t, this);
                throw 0Q8.createAndThrow();
            }
        }
        Object A0D = this._valueInstantiator.A0D(c27t, jsonDeserializer.A0M(abstractC01033pi, c27t));
        if (this._injectables != null) {
            A1I(c27t);
        }
        C68D c68d = this._buildMethod;
        if (c68d == null) {
            return A0D;
        }
        try {
            return c68d.A00.invoke(A0D, null);
        } catch (Exception e) {
            A1L(c27t, e);
            throw 0Q8.createAndThrow();
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase A12() {
        return new BeanAsArrayBuilderDeserializer(this._targetType, this, this._buildMethod, this._beanProperties._propsInOrder);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase A13(C68l c68l) {
        return new BuilderBasedDeserializer(this, c68l);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase A14(C7Rt c7Rt) {
        return new BuilderBasedDeserializer(this, c7Rt);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase A15(Set set, Set set2) {
        return new BuilderBasedDeserializer(this, set, set2);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase A16(boolean z) {
        return new BuilderBasedDeserializer(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0167, code lost:
    
        r311 = r0.A02(r303, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0170, code lost:
    
        if (r309 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0187, code lost:
    
        if (r311.getClass() == r301._beanType._class) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0194, code lost:
    
        return A1E(null, r303, r309, r311);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0195, code lost:
    
        A1J(r303, r309, r311);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01a0, code lost:
    
        return r311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02bd, code lost:
    
        r305 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02bf, code lost:
    
        A1L(r303, r305);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ad, code lost:
    
        r302.A1K();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x015b, code lost:
    
        r311 = r0.A02(r303, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x01b5, code lost:
    
        if (r311.getClass() == r301._beanType._class) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x01b8, code lost:
    
        r311 = A1E(r302, r303, r309, r311);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01c6, code lost:
    
        return r311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01c9, code lost:
    
        if (r309 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01cc, code lost:
    
        A1J(r303, r309, r311);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01dd, code lost:
    
        if (r301._injectables == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01e0, code lost:
    
        A1I(r303);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01ed, code lost:
    
        if (r301._unwrappedPropertyHandler == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01ff, code lost:
    
        if (r302.A1u(X.C42h.A06) == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0202, code lost:
    
        r302.A1K();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0207, code lost:
    
        r0 = new X.28P(r302, r303);
        r0.A0b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0222, code lost:
    
        return A00(r302, r303, r0, r311);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x022b, code lost:
    
        if (r301._externalTypeIdHandler == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0236, code lost:
    
        return A02(r302, r303, r311);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x023f, code lost:
    
        if (r301._needViewProcesing == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0242, code lost:
    
        r0 = r303._view;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x024a, code lost:
    
        if (r0 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0257, code lost:
    
        return A01(r302, r303, r0, r311);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0258, code lost:
    
        r312 = r302.A1I();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0267, code lost:
    
        if (r312 != X.C42h.A06) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x026a, code lost:
    
        r312 = r302.A1K();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0274, code lost:
    
        if (r312 != r0) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0277, code lost:
    
        r0 = r302.A1X();
        r302.A1K();
        r0 = r301._beanProperties.A02(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x028f, code lost:
    
        if (r0 == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x02a0, code lost:
    
        A1H(r302, r303, r311, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x026a, code lost:
    
        r312 = r302.A1K();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0296, code lost:
    
        r311 = r0.A0D(r302, r303, r311);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x026a, code lost:
    
        r312 = r302.A1K();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x02ad, code lost:
    
        r305 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x02af, code lost:
    
        A1K(r303, r311, r0, r305);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02e2, code lost:
    
        throw X.0Q8.createAndThrow();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02c9, code lost:
    
        r312 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02cb, code lost:
    
        A1K(r303, r301._beanType._class, r0, r312);
     */
    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A17(X.AbstractC01033pi r302, X.C27T r303) {
        /*
            Method dump skipped, instructions count: 739
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer.A17(X.3pi, X.27T):java.lang.Object");
    }
}
