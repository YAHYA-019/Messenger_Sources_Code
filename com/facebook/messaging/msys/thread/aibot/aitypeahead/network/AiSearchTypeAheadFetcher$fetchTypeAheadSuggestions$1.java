package com.facebook.messaging.msys.thread.aibot.aitypeahead.network;

import X.04S;
import X.0DO;
import X.0DQ;
import X.0DR;
import X.9OL;
import android.content.Context;
import kotlin.jvm.functions.Function2;

/* loaded from: AiSearchTypeAheadFetcher$fetchTypeAheadSuggestions$1.class */
public final class AiSearchTypeAheadFetcher$fetchTypeAheadSuggestions$1 extends 0DO implements Function2 {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ int $limit;
    public final /* synthetic */ String $query;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ 9OL this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiSearchTypeAheadFetcher$fetchTypeAheadSuggestions$1(Context context, 9OL r303, String str, 0DR r305, int i) {
        super(2, r305);
        this.$query = str;
        this.$limit = i;
        this.this$0 = r303;
        this.$context = context;
    }

    public final 0DR create(Object obj, 0DR r303) {
        String str = this.$query;
        int i = this.$limit;
        AiSearchTypeAheadFetcher$fetchTypeAheadSuggestions$1 aiSearchTypeAheadFetcher$fetchTypeAheadSuggestions$1 = new AiSearchTypeAheadFetcher$fetchTypeAheadSuggestions$1(this.$context, this.this$0, str, r303, i);
        aiSearchTypeAheadFetcher$fetchTypeAheadSuggestions$1.L$0 = obj;
        return aiSearchTypeAheadFetcher$fetchTypeAheadSuggestions$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008a  */
    /* JADX WARN: Type inference failed for: r0v132, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r313v5 */
    /* JADX WARN: Type inference failed for: r313v6 */
    /* JADX WARN: Type inference failed for: r313v8, types: [java.util.AbstractCollection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 645
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.msys.thread.aibot.aitypeahead.network.AiSearchTypeAheadFetcher$fetchTypeAheadSuggestions$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
