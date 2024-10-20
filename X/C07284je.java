package X;

import com.facebook.messaging.msys.thread.aibot.repository.MetaAiRepository;

/* renamed from: X.4je, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4je.class */
public final class C07284je extends 0DP {
    public Object L$0;
    public Object L$1;
    public boolean Z$0;
    public boolean Z$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MetaAiRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C07284je(MetaAiRepository metaAiRepository, 0DR r303) {
        super(r303);
        this.this$0 = metaAiRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= (-1) << (-1);
        return this.this$0.A02(null, this, false);
    }
}
