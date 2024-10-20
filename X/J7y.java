package X;

import com.facebook.xapp.messaging.composer.broadcast.transportagnostic.sender.xma.StoryReplyMessageSendBinder;

/* loaded from: J7y.class */
public final class J7y extends 0DP {
    public long J$0;
    public long J$1;
    public long J$2;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ StoryReplyMessageSendBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J7y(StoryReplyMessageSendBinder storyReplyMessageSendBinder, 0DR r303) {
        super(r303);
        this.this$0 = storyReplyMessageSendBinder;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= (-1) << (-1);
        return this.this$0.A00(null, null, null, null, null, this, 0L, 0L, 0L);
    }
}
