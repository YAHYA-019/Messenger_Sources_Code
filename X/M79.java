package X;

import kotlin.jvm.functions.Function2;

/* loaded from: M79.class */
public final class M79 extends C00q implements Function2 {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ Jt6 $badge;
    public final /* synthetic */ String $displayName;
    public final /* synthetic */ MLj $modifier;
    public final /* synthetic */ C2q1 $profileConfig;
    public final /* synthetic */ 2qZ $tileViewParams;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M79(MLj mLj, Jt6 jt6, C2q1 c2q1, 2qZ r305, String str, int i, int i2) {
        super(2);
        this.$tileViewParams = r305;
        this.$displayName = str;
        this.$profileConfig = c2q1;
        this.$modifier = mLj;
        this.$badge = jt6;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        MLv A0N = JQz.A0N(obj, obj2);
        2qZ r0 = this.$tileViewParams;
        String str = this.$displayName;
        L60.A01(A0N, this.$modifier, this.$badge, this.$profileConfig, r0, str, Kv9.A00(this.$$changed), this.$$default);
        return 04S.A00;
    }
}
