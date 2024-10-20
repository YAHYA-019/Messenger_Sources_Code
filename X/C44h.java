package X;

import kotlin.jvm.functions.Function2;

/* renamed from: X.44h, reason: invalid class name */
/* loaded from: 44h.class */
public abstract class C44h {
    public static final Object A00(0DR r301, Function2 function2, long j) {
        if (j > 0) {
            return A02(function2, new C44i(r301, j));
        }
        throw new 4EY("Timed out immediately", (C2a2) null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:3|(4:5|6|7|(2:9|(3:11|12|13)(3:15|16|17))(2:18|(13:20|21|22|23|24|25|26|27|28|29|30|31|(2:33|34)(2:35|36))(1:37))))|42|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e2, code lost:
    
        r315 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f6, code lost:
    
        if (r315.A00 == r312.element) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:?, code lost:
    
        return null;
     */
    /* JADX WARN: Failed to calculate best type for var: r312v0 ??
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
    /* JADX WARN: Failed to calculate best type for var: r312v0 ??
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
    /* JADX WARN: Not initialized variable reg: 312, insn: 0x00eb: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r312 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:39:0x00e4 */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0055  */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, X.0CL] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A01(X.0DR r301, kotlin.jvm.functions.Function2 r302, long r303) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44h.A01(X.0DR, kotlin.jvm.functions.Function2, long):java.lang.Object");
    }

    public static final Object A02(Function2 function2, C44i c44i) {
        Object c2s6;
        Object A0C;
        final C2a8 BQJ = C44k.A03(((C44j) c44i).A00.getContext()).BQJ(c44i, ((C2ak) c44i).A00, c44i.A00);
        c44i.BQH(new 2aC(BQJ) { // from class: X.44p
            public final C2a8 A00;

            {
                this.A00 = BQJ;
            }

            public void A05(Throwable th) {
                this.A00.dispose();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                this.A00.dispose();
                return 04S.A00;
            }
        });
        boolean z = false;
        try {
            if (function2 instanceof 0DQ) {
                C0B7.A04(function2, 2);
                c2s6 = function2.invoke(c44i, c44i);
            } else {
                c2s6 = 0DT.A00(c44i, c44i, function2);
            }
        } catch (Throwable th) {
            c2s6 = new C2s6(th, false);
        }
        0Ds r0 = 0Ds.A02;
        if (c2s6 == r0 || (A0C = c44i.A0C(c2s6)) == C2a4.A04) {
            return r0;
        }
        if (A0C instanceof C2s6) {
            4EY r307 = ((C2s6) A0C).A00;
            if (!(r307 instanceof 4EY) || r307.A00 != c44i) {
                z = true;
            }
            if (!z) {
                if (c2s6 instanceof C2s6) {
                    r307 = ((C2s6) c2s6).A00;
                }
            }
            throw ((Throwable) r307);
        }
        c2s6 = C2a4.A00(A0C);
        return c2s6;
    }
}
