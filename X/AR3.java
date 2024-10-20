package X;

import kotlin.jvm.functions.Function1;

/* loaded from: AR3.class */
public final class AR3 extends C00q implements Function1 {
    public final /* synthetic */ float $endVal;
    public final /* synthetic */ Function1 $onUpdateVal;
    public final /* synthetic */ float $startVal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AR3(Function1 function1, float f, float f2) {
        super(1);
        this.$endVal = f;
        this.$startVal = f2;
        this.$onUpdateVal = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        float A00 = 7zM.A00(obj);
        float f = this.$endVal;
        float f2 = this.$startVal;
        this.$onUpdateVal.invoke(Float.valueOf(f2 + ((f - f2) * A00)));
        return 04S.A00;
    }
}
