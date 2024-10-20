package X;

import com.facebook.quickpromotion.filterextensions.impl.PostLoadInitializer;

/* renamed from: X.44d, reason: invalid class name */
/* loaded from: 44d.class */
public final class C44d extends 0DP {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PostLoadInitializer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44d(PostLoadInitializer postLoadInitializer, 0DR r303) {
        super(r303);
        this.this$0 = postLoadInitializer;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= (-1) << (-1);
        return PostLoadInitializer.A00(this.this$0, null, this);
    }
}
