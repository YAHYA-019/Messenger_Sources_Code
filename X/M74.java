package X;

import kotlin.jvm.functions.Function2;

/* loaded from: M74.class */
public final class M74 extends C00q implements Function2 {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $color;
    public final /* synthetic */ MLj $modifier;
    public final /* synthetic */ float $strokeWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M74(MLj mLj, float f, int i, int i2, long j) {
        super(2);
        this.$modifier = mLj;
        this.$color = j;
        this.$strokeWidth = f;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        LC0.A02(JQz.A0N(obj, obj2), this.$modifier, this.$strokeWidth, Kv9.A00(this.$$changed), this.$$default, this.$color);
        return 04S.A00;
    }
}
