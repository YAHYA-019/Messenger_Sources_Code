package com.facebook.messaging.composer.avatar;

import X.04S;
import X.0DO;
import X.0DR;
import X.0Ds;
import X.0Dt;
import X.AnonymousClass001;
import kotlin.jvm.functions.Function2;

/* loaded from: StickerSuggestionsController$handleTextChanged$1.class */
public final class StickerSuggestionsController$handleTextChanged$1 extends 0DO implements Function2 {
    public final /* synthetic */ String $text;
    public int label;
    public final /* synthetic */ StickerSuggestionsController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerSuggestionsController$handleTextChanged$1(StickerSuggestionsController stickerSuggestionsController, String str, 0DR r304) {
        super(2, r304);
        this.this$0 = stickerSuggestionsController;
        this.$text = str;
    }

    public final 0DR create(Object obj, 0DR r303) {
        return new StickerSuggestionsController$handleTextChanged$1(this.this$0, this.$text, r303);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create(obj, (0DR) obj2).invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0Ds r0 = 0Ds.A02;
        int i = this.label;
        if (i == 0) {
            0Dt.A00(obj);
            StickerSuggestionsController stickerSuggestionsController = this.this$0;
            String str = this.$text;
            this.label = 1;
            if (StickerSuggestionsController.A00(stickerSuggestionsController, str, this) == r0) {
                return r0;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0M();
            }
            0Dt.A00(obj);
        }
        return 04S.A00;
    }
}
