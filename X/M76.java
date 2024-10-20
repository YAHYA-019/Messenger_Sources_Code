package X;

import kotlin.jvm.functions.Function2;

/* loaded from: M76.class */
public final class M76 extends C00q implements Function2 {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $color;
    public final /* synthetic */ MLj $modifier;
    public final /* synthetic */ Float $progress;
    public final /* synthetic */ KOD $size;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M76(MLj mLj, KOD kod, Float f, int i, int i2, long j) {
        super(2);
        this.$modifier = mLj;
        this.$color = j;
        this.$progress = f;
        this.$size = kod;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        MLv A0N = JQz.A0N(obj, obj2);
        MLj mLj = this.$modifier;
        long j = this.$color;
        KWf.A00(A0N, mLj, this.$size, this.$progress, Kv9.A00(this.$$changed), this.$$default, j);
        return 04S.A00;
    }
}
