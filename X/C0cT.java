package X;

/* renamed from: X.0cT, reason: invalid class name */
/* loaded from: 0cT.class */
public final class C0cT extends 0DP {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ 0pA this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0cT(0pA r302, 0DR r303) {
        super(r303);
        this.this$0 = r302;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= (-1) << (-1);
        return this.this$0.emit((Object) null, this);
    }
}
