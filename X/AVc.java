package X;

import kotlin.jvm.functions.Function2;

/* loaded from: AVc.class */
public final class AVc extends C00q implements Function2 {
    public final /* synthetic */ int $changed;
    public final /* synthetic */ Object $p1;
    public final /* synthetic */ Object $p2;
    public final /* synthetic */ Object $p3;
    public final /* synthetic */ Object $p4;
    public final /* synthetic */ Object $p5;
    public final /* synthetic */ AHs this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AVc(AHs aHs, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        super(2);
        this.this$0 = aHs;
        this.$p1 = obj;
        this.$p2 = obj2;
        this.$p3 = obj3;
        this.$p4 = obj4;
        this.$p5 = obj5;
        this.$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        7zL.A1P(obj2);
        this.this$0.A07((MLv) obj, this.$p1, this.$p2, this.$p3, this.$p4, this.$p5, Kv9.A01(this.$changed) | 1);
        return 04S.A00;
    }
}
