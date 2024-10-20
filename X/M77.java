package X;

import kotlin.jvm.functions.Function2;

/* loaded from: M77.class */
public final class M77 extends C00q implements Function2 {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ MLj $modifier;
    public final /* synthetic */ C00m $onClick;
    public final /* synthetic */ String $text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M77(MLj mLj, String str, C00m c00m, int i, int i2, boolean z) {
        super(2);
        this.$text = str;
        this.$modifier = mLj;
        this.$enabled = z;
        this.$onClick = c00m;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        MLv A0N = JQz.A0N(obj, obj2);
        String str = this.$text;
        KWg.A00(A0N, this.$modifier, str, this.$onClick, Kv9.A00(this.$$changed), this.$$default, this.$enabled);
        return 04S.A00;
    }
}
