package com.facebook.messaging.msys.thread.aibot.aitypeahead.network;

import X.04S;
import X.0DO;
import X.0DQ;
import X.0DR;
import X.9Z9;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import kotlin.jvm.functions.Function2;

/* loaded from: AiFlashTypeAheadFetcher$fetchTypeAheadSuggestion$1.class */
public final class AiFlashTypeAheadFetcher$fetchTypeAheadSuggestion$1 extends 0DO implements Function2 {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ boolean $isHostedInBottomSheet;
    public final /* synthetic */ String $query;
    public final /* synthetic */ ThreadKey $threadKey;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ 9Z9 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiFlashTypeAheadFetcher$fetchTypeAheadSuggestion$1(Context context, ThreadKey threadKey, 9Z9 r304, String str, 0DR r306, boolean z) {
        super(2, r306);
        this.this$0 = r304;
        this.$threadKey = threadKey;
        this.$isHostedInBottomSheet = z;
        this.$query = str;
        this.$context = context;
    }

    public final 0DR create(Object obj, 0DR r303) {
        9Z9 r0 = this.this$0;
        ThreadKey threadKey = this.$threadKey;
        boolean z = this.$isHostedInBottomSheet;
        AiFlashTypeAheadFetcher$fetchTypeAheadSuggestion$1 aiFlashTypeAheadFetcher$fetchTypeAheadSuggestion$1 = new AiFlashTypeAheadFetcher$fetchTypeAheadSuggestion$1(this.$context, threadKey, r0, this.$query, r303, z);
        aiFlashTypeAheadFetcher$fetchTypeAheadSuggestion$1.L$0 = obj;
        return aiFlashTypeAheadFetcher$fetchTypeAheadSuggestion$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x02e7, code lost:
    
        if (r0.getBooleanValue(-1867169789) != true) goto L69;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v119, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r0v209, types: [com.google.common.util.concurrent.ListenableFuture, com.google.common.util.concurrent.SettableFuture] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r306v1 */
    /* JADX WARN: Type inference failed for: r306v13 */
    /* JADX WARN: Type inference failed for: r306v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 1217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.msys.thread.aibot.aitypeahead.network.AiFlashTypeAheadFetcher$fetchTypeAheadSuggestion$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
