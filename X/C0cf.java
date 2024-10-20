package X;

/* renamed from: X.0cf, reason: invalid class name */
/* loaded from: 0cf.class */
public final class C0cf extends 0DP {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ 0oS this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0cf(0oS r302, 0DR r303) {
        super(r303);
        this.this$0 = r302;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= (-1) << (-1);
        return this.this$0.collect((0zU) null, this);
    }
}
