package com.fasterxml.jackson.databind.deser.std;

import X.0Q8;
import X.24S;
import X.27C;
import X.68U;
import X.68W;
import X.68Z;
import X.7Rq;
import X.AbF;
import X.AbstractC00953pX;
import X.AbstractC01033pi;
import X.AnonymousClass001;
import X.AnonymousClass248;
import X.AnonymousClass260;
import X.AnonymousClass436;
import X.AnonymousClass437;
import X.C27T;
import X.C42o;
import X.C42x;
import X.C68c;
import X.C68e;
import X.C81f;
import X.JQx;
import X.JQy;
import X.JyD;
import X.KjH;
import X.KnN;
import X.LiO;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: MapDeserializer.class */
public class MapDeserializer extends ContainerDeserializerBase implements AnonymousClass436, AnonymousClass437 {
    public static final long serialVersionUID = 1;
    public JsonDeserializer _delegateDeserializer;
    public final boolean _hasDefaultCreator;
    public Set _ignorableProperties;
    public Set _includableProperties;
    public LiO _inclusionChecker;
    public final KnN _keyDeserializer;
    public 7Rq _propertyBasedCreator;
    public boolean _standardStringKey;
    public final JsonDeserializer _valueDeserializer;
    public final 68W _valueInstantiator;
    public final C68e _valueTypeDeserializer;

    public MapDeserializer(24S r302, JsonDeserializer jsonDeserializer, KnN knN, 68W r305, C68e c68e) {
        super(r302, (C42o) null, (Boolean) null);
        this._keyDeserializer = knN;
        this._valueDeserializer = jsonDeserializer;
        this._valueTypeDeserializer = c68e;
        this._valueInstantiator = r305;
        this._hasDefaultCreator = r305.A0Q();
        this._delegateDeserializer = null;
        this._propertyBasedCreator = null;
        this._standardStringKey = A03(r302, knN);
        this._inclusionChecker = null;
    }

    public MapDeserializer(JsonDeserializer jsonDeserializer, KnN knN, C42o c42o, MapDeserializer mapDeserializer, C68e c68e, Set set, Set set2) {
        super(c42o, mapDeserializer, mapDeserializer._unwrapSingle);
        this._keyDeserializer = knN;
        this._valueDeserializer = jsonDeserializer;
        this._valueTypeDeserializer = c68e;
        this._valueInstantiator = mapDeserializer._valueInstantiator;
        this._propertyBasedCreator = mapDeserializer._propertyBasedCreator;
        this._delegateDeserializer = mapDeserializer._delegateDeserializer;
        this._hasDefaultCreator = mapDeserializer._hasDefaultCreator;
        this._ignorableProperties = set;
        this._includableProperties = set2;
        this._inclusionChecker = C68c.A00(set, set2);
        this._standardStringKey = A03(this._containerType, knN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x029a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:128:0x02bd -> B:87:0x0296). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x006d -> B:8:0x0044). Please report as a decompilation issue!!! */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Map A0M(X.AbstractC01033pi r302, X.C27T r303) {
        /*
            Method dump skipped, instructions count: 917
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.MapDeserializer.A0M(X.3pi, X.27T):java.util.Map");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x00c0 -> B:15:0x008d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void A01(X.AbstractC01033pi r302, X.C27T r303, java.util.Map r304) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.MapDeserializer.A01(X.3pi, X.27T, java.util.Map):void");
    }

    private void A02(C27T c27t, C81f c81f, KjH kjH, Object obj) {
        if (kjH == null) {
            c27t.A0e(this, AnonymousClass001.A0Z(c81f, "Unresolved forward reference but no identity info: ", AnonymousClass001.A0k()), AnonymousClass001.A1Z());
            throw 0Q8.createAndThrow();
        }
        JyD jyD = new JyD(c81f, kjH, kjH.A02, obj);
        kjH.A00.add(jyD);
        c81f._roid.A00(jyD);
    }

    public static final boolean A03(24S r301, KnN knN) {
        24S A06;
        Class cls;
        return knN == null || (A06 = r301.A06()) == null || (((cls = A06._class) == String.class || cls == Object.class) && 27C.A0L(knN));
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0130, code lost:
    
        if (r306 != r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x022f, code lost:
    
        if (r306 != r0) goto L83;
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
    /* JADX WARN: Multi-variable type inference failed. Error: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:70)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:116)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Not initialized variable reg: 310, insn: 0x024e: MOVE (r2 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r310 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:106:0x024c */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0176  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:104:0x01a4 -> B:67:0x0171). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x00a5 -> B:19:0x007c). Please report as a decompilation issue!!! */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ java.lang.Object A0N(X.AbstractC01033pi r302, X.C27T r303, java.lang.Object r304) {
        /*
            Method dump skipped, instructions count: 603
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.MapDeserializer.A0N(X.3pi, X.27T, java.lang.Object):java.lang.Object");
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public C42x A0Q() {
        return C42x.Map;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object A0T(AbstractC01033pi abstractC01033pi, C27T c27t, C68e c68e) {
        return c68e.A07(abstractC01033pi, c27t);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if (r301._includableProperties != null) goto L12;
     */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0W() {
        /*
            r301 = this;
            r0 = r301
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r0._valueDeserializer
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L2f
            r0 = r301
            X.KnN r0 = r0._keyDeserializer
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L2f
            r0 = r301
            X.68e r0 = r0._valueTypeDeserializer
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L2f
            r0 = r301
            java.util.Set r0 = r0._ignorableProperties
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L2f
            r0 = r301
            java.util.Set r0 = r0._includableProperties
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 == 0) goto L33
        L2f:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L33:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.MapDeserializer.A0W():boolean");
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public 68W A0i() {
        return this._valueInstantiator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v88, types: [java.util.AbstractCollection] */
    @Override // X.AnonymousClass437
    public JsonDeserializer AJM(68U r302, C27T c27t) {
        AbstractC00953pX AwU;
        KnN knN = this._keyDeserializer;
        if (knN == null) {
            knN = c27t.A0L(this._containerType.A06());
        }
        JsonDeserializer jsonDeserializer = this._valueDeserializer;
        if (r302 != null) {
            jsonDeserializer = StdDeserializer.A0A(r302, c27t, jsonDeserializer);
        }
        JsonDeserializer A0a = JQy.A0a(r302, c27t, jsonDeserializer, this);
        C68e c68e = this._valueTypeDeserializer;
        if (c68e != null) {
            c68e = c68e.A04(r302);
        }
        Set set = this._ignorableProperties;
        Set set2 = this._includableProperties;
        AnonymousClass248 A02 = c27t._config.A02();
        if (A02 != null && r302 != null && (AwU = r302.AwU()) != null) {
            68Z A07 = A02.A07(AwU);
            Set emptySet = A07._allowSetters ? Collections.emptySet() : A07._ignored;
            if (!emptySet.isEmpty()) {
                set = set == null ? AnonymousClass001.A0v() : AbF.A1E(set);
                Iterator it = emptySet.iterator();
                while (it.hasNext()) {
                    JQx.A1S(set, it);
                }
            }
            Set set3 = A02.A09(AwU)._included;
            if (set3 != null) {
                HashSet A0v = AnonymousClass001.A0v();
                if (set2 == null) {
                    A0v = AbF.A1E(set3);
                } else {
                    for (Object obj : set3) {
                        if (set2.contains(obj)) {
                            A0v.add(obj);
                        }
                    }
                }
                set2 = A0v;
            }
        }
        C42o A0h = A0h(r302, c27t, A0a);
        return (this._keyDeserializer == knN && this._valueDeserializer == A0a && this._valueTypeDeserializer == c68e && this._nullProvider == A0h && this._ignorableProperties == set && this._includableProperties == set2) ? this : new MapDeserializer(A0a, knN, A0h, this, c68e, set, set2);
    }

    @Override // X.AnonymousClass436
    public void Cht(C27T c27t) {
        24S A04;
        24S r307;
        Object[] objArr;
        String str;
        68W r0 = this._valueInstantiator;
        if (r0.A0R()) {
            A04 = r0.A05();
            if (A04 == null) {
                r307 = this._containerType;
                objArr = new Object[]{r307, AnonymousClass001.A0Y(r0)};
                str = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'";
                JQx.A1I(c27t, r307, str, objArr);
                throw 0Q8.createAndThrow();
            }
            this._delegateDeserializer = c27t.A0G(null, A04);
        } else if (r0.A0P()) {
            A04 = r0.A04();
            if (A04 == null) {
                r307 = this._containerType;
                objArr = new Object[]{r307, AnonymousClass001.A0Y(r0)};
                str = "Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'";
                JQx.A1I(c27t, r307, str, objArr);
                throw 0Q8.createAndThrow();
            }
            this._delegateDeserializer = c27t.A0G(null, A04);
        }
        68W r02 = this._valueInstantiator;
        if (r02.A0N()) {
            this._propertyBasedCreator = 7Rq.A00(c27t, this._valueInstantiator, r02.A0T(c27t._config), c27t._config.A09(AnonymousClass260.A02));
        }
        this._standardStringKey = A03(this._containerType, this._keyDeserializer);
    }
}
