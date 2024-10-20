package X;

import androidx.compose.foundation.gestures.ScrollableNestedScrollConnection;

/* loaded from: LzM.class */
public final class LzM extends 0DP {
    public long J$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ScrollableNestedScrollConnection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LzM(ScrollableNestedScrollConnection scrollableNestedScrollConnection, 0DR r303) {
        super(r303);
        this.this$0 = scrollableNestedScrollConnection;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= (-1) << (-1);
        return this.this$0.CCy(this, 0L, 0L);
    }
}
