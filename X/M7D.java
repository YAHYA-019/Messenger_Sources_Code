package X;

import kotlin.jvm.functions.Function2;

/* loaded from: M7D.class */
public final class M7D extends C00q implements Function2 {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $color;
    public final /* synthetic */ String $contentDescription;
    public final /* synthetic */ MLf $contentScale;
    public final /* synthetic */ C1u3 $icon;
    public final /* synthetic */ MLj $modifier;
    public final /* synthetic */ C1u4 $size;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M7D(MLj mLj, MLf mLf, C1u3 c1u3, C1u4 c1u4, String str, int i, int i2, long j) {
        super(2);
        this.$icon = c1u3;
        this.$modifier = mLj;
        this.$color = j;
        this.$size = c1u4;
        this.$contentScale = mLf;
        this.$contentDescription = str;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        MLv A0N = JQz.A0N(obj, obj2);
        C1u3 c1u3 = this.$icon;
        MLj mLj = this.$modifier;
        long j = this.$color;
        KWZ.A00(A0N, mLj, this.$contentScale, c1u3, this.$size, this.$contentDescription, Kv9.A00(this.$$changed), this.$$default, j);
        return 04S.A00;
    }
}
