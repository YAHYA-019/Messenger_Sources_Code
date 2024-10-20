package X;

import com.facebook.quickpromotion.sdk.fetcher.ondemand.OnDemandSurfaceTriggerCache;

/* loaded from: G8l.class */
public final class G8l extends 0DP {
    public long J$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ OnDemandSurfaceTriggerCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G8l(OnDemandSurfaceTriggerCache onDemandSurfaceTriggerCache, 0DR r303) {
        super(r303);
        this.this$0 = onDemandSurfaceTriggerCache;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= (-1) << (-1);
        return OnDemandSurfaceTriggerCache.A01(null, this.this$0, this);
    }
}
