package com.facebook.messaging.composer.avatar;

import X.04S;
import X.0DO;
import X.0DR;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* loaded from: StickerSuggestionsController$queryStickerGuide$2.class */
public final class StickerSuggestionsController$queryStickerGuide$2 extends 0DO implements Function2 {
    public final /* synthetic */ List $cachedStickers;
    public final /* synthetic */ String $recommendationSessionId;
    public final /* synthetic */ List $resultList;
    public int label;
    public final /* synthetic */ StickerSuggestionsController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerSuggestionsController$queryStickerGuide$2(StickerSuggestionsController stickerSuggestionsController, String str, List list, List list2, 0DR r306) {
        super(2, r306);
        this.this$0 = stickerSuggestionsController;
        this.$cachedStickers = list;
        this.$resultList = list2;
        this.$recommendationSessionId = str;
    }

    public final 0DR create(Object obj, 0DR r303) {
        return new StickerSuggestionsController$queryStickerGuide$2(this.this$0, this.$recommendationSessionId, this.$cachedStickers, this.$resultList, r303);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create(obj, (0DR) obj2).invokeSuspend(04S.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 1206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.composer.avatar.StickerSuggestionsController$queryStickerGuide$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
