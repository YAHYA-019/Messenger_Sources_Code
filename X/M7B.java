package X;

import kotlin.jvm.functions.Function2;

/* loaded from: M7B.class */
public final class M7B extends C00q implements Function2 {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ String $contentDescription;
    public final /* synthetic */ MLf $contentScale;
    public final /* synthetic */ MLj $modifier;
    public final /* synthetic */ Krv $painter;
    public final /* synthetic */ long $tint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M7B(MLj mLj, Krv krv, MLf mLf, String str, int i, int i2, long j) {
        super(2);
        this.$painter = krv;
        this.$contentDescription = str;
        this.$modifier = mLj;
        this.$tint = j;
        this.$contentScale = mLf;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        MLv A0N = JQz.A0N(obj, obj2);
        Krv krv = this.$painter;
        String str = this.$contentDescription;
        Kxx.A00(A0N, this.$modifier, krv, this.$contentScale, str, Kv9.A00(this.$$changed), this.$$default, this.$tint);
        return 04S.A00;
    }
}
