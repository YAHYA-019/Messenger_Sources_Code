package X;

import kotlin.jvm.functions.Function1;

/* loaded from: M6y.class */
public final class M6y extends C00q implements Function1 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M6y(Object obj, Object obj2, int i) {
        super(1);
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M6y(Function1 function1, Function1 function12, int i) {
        super(1);
        this.A00 = i;
        if (19 - i != 0) {
            this.A02 = function1;
            this.A01 = function12;
        } else {
            this.A01 = function1;
            this.A02 = function12;
        }
    }

    public static C2874Jbr A00(Object obj, Object obj2) {
        return LCW.A00(new M6n(obj, 45), new M6y(obj2, obj, 18));
    }

    public static M6y A01(MLv mLv, Object obj, Object obj2, int i) {
        M6y m6y = new M6y(obj, obj2, i);
        mLv.D7k(m6y);
        return m6y;
    }

    /*  JADX ERROR: Types fix failed
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
        */
    /* JADX WARN: Not initialized variable reg: 304, insn: 0x0d30: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r304 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:237:0x0d30 */
    /* JADX WARN: Not initialized variable reg: 308, insn: 0x0d37: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r308 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:233:0x0d37 */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 3462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.M6y.invoke(java.lang.Object):java.lang.Object");
    }
}
