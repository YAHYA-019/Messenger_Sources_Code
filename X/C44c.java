package X;

import com.facebook.quickpromotion.filterextensions.impl.PostLoadInitializer;

/* renamed from: X.44c, reason: invalid class name */
/* loaded from: 44c.class */
public final class C44c extends 0DP {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PostLoadInitializer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44c(PostLoadInitializer postLoadInitializer, 0DR r303) {
        super(r303);
        this.this$0 = postLoadInitializer;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= (-1) << (-1);
        return PostLoadInitializer.A01(this.this$0, null, this);
    }
}
