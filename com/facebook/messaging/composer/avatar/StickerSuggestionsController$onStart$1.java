package com.facebook.messaging.composer.avatar;

import X.04S;
import X.0DO;
import X.0DR;
import X.0Ds;
import X.0Dt;
import X.0N2;
import X.0Pf;
import X.0zV;
import X.7Mx;
import X.AnonymousClass001;
import X.C82t;
import com.facebook.messaging.model.threadkey.ThreadKey;
import kotlin.jvm.functions.Function2;

/* loaded from: StickerSuggestionsController$onStart$1.class */
public final class StickerSuggestionsController$onStart$1 extends 0DO implements Function2 {
    public final /* synthetic */ long $debounceMs;
    public final /* synthetic */ ThreadKey $threadKey;
    public int label;
    public final /* synthetic */ StickerSuggestionsController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerSuggestionsController$onStart$1(StickerSuggestionsController stickerSuggestionsController, ThreadKey threadKey, 0DR r304, long j) {
        super(2, r304);
        this.this$0 = stickerSuggestionsController;
        this.$debounceMs = j;
        this.$threadKey = threadKey;
    }

    public final 0DR create(Object obj, 0DR r303) {
        return new StickerSuggestionsController$onStart$1(this.this$0, this.$threadKey, r303, this.$debounceMs);
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
            0zV A00 = 0Pf.A00(new 7Mx(this.this$0.A0N), this.$debounceMs);
            C82t c82t = new C82t(this.this$0, this.$threadKey, null);
            this.label = 1;
            if (0N2.A00(this, c82t, A00) == r0) {
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
