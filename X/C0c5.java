package X;

/* renamed from: X.0c5, reason: invalid class name */
/* loaded from: 0c5.class */
public final class C0c5 extends 0DP {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C0p8 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0c5(C0p8 c0p8, 0DR r303) {
        super(r303);
        this.this$0 = c0p8;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= (-1) << (-1);
        return this.this$0.emit(null, this);
    }
}
