package X;

/* renamed from: X.4Op, reason: invalid class name */
/* loaded from: 4Op.class */
public final class C4Op extends 0DP {
    public int I$0;
    public long J$0;
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C4G6 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4Op(0DR r302, C4G6 c4g6) {
        super(r302);
        this.this$0 = c4g6;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= (-1) << (-1);
        Object A03 = C4G6.A03(this, this.this$0, null, 0, 0L);
        return A03 != 0Ds.A02 ? new 5qQ(A03) : A03;
    }
}
