package X;

import kotlin.jvm.functions.Function1;

/* loaded from: M3n.class */
public final class M3n extends C00q implements Function1 {
    public final /* synthetic */ int $steps = 0;
    public final /* synthetic */ float $value;
    public final /* synthetic */ C0zw $valueRange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M3n(C0zw c0zw, float f) {
        super(1);
        this.$value = f;
        this.$valueRange = c0zw;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        L4E l4e = L4E.A03;
        ((MEV) obj).ClM(KdW.A0J, new L4E(this.$valueRange, 7zM.A00(07C.A05(Float.valueOf(this.$value), this.$valueRange)), this.$steps));
        return 04S.A00;
    }
}
