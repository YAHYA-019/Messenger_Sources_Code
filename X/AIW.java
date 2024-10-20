package X;

import com.facebook.messaging.avatar.stickersuggestions.datasource.IntentStickerFetcher;

/* loaded from: AIW.class */
public final class AIW extends 0DP {
    public Object L$0;
    public Object L$1;
    public boolean Z$0;
    public boolean Z$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ IntentStickerFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIW(IntentStickerFetcher intentStickerFetcher, 0DR r303) {
        super(r303);
        this.this$0 = intentStickerFetcher;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= (-1) << (-1);
        return IntentStickerFetcher.A00(this.this$0, null, this, false, false);
    }
}
