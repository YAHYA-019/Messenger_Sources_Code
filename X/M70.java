package X;

import kotlin.jvm.functions.Function2;

/* loaded from: M70.class */
public final class M70 extends C00q implements Function2 {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ Function2 $content;
    public final /* synthetic */ boolean $isDark;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M70(Function2 function2, int i, boolean z) {
        super(2);
        this.$isDark = z;
        this.$content = function2;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        L62.A02(JQz.A0N(obj, obj2), this.$content, Kv9.A00(this.$$changed), this.$isDark);
        return 04S.A00;
    }
}
