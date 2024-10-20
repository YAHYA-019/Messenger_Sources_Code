package com.facebook.xapp.messaging.generatedsticker.fragment;

import X.04S;
import X.0DO;
import X.0DQ;
import X.0DR;
import X.0Ds;
import X.0Dt;
import X.0Xs;
import X.1FV;
import X.4kH;
import X.8L7;
import X.9Pv;
import X.9hU;
import X.AnonymousClass001;
import X.C44k;
import com.google.common.collect.ImmutableList;
import kotlin.jvm.functions.Function2;

/* loaded from: GeneratedStickerSearchViewData$runFetch$2.class */
public final class GeneratedStickerSearchViewData$runFetch$2 extends 0DO implements Function2 {
    public final /* synthetic */ long $delayMs;
    public final /* synthetic */ boolean $isRegenerate;
    public final /* synthetic */ String $prompt;
    public final /* synthetic */ ImmutableList $stickerIdsToAnimate;
    public int label;
    public final /* synthetic */ 9hU this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeneratedStickerSearchViewData$runFetch$2(9hU r302, ImmutableList immutableList, String str, 0DR r305, long j, boolean z) {
        super(2, r305);
        this.$delayMs = j;
        this.this$0 = r302;
        this.$prompt = str;
        this.$isRegenerate = z;
        this.$stickerIdsToAnimate = immutableList;
    }

    public final 0DR create(Object obj, 0DR r303) {
        long j = this.$delayMs;
        return new GeneratedStickerSearchViewData$runFetch$2(this.this$0, this.$stickerIdsToAnimate, this.$prompt, r303, j, this.$isRegenerate);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        9Pv r0;
        0Xs r02;
        Object value;
        0Ds r03 = 0Ds.A02;
        int i = this.label;
        if (i == 0) {
            0Dt.A00(obj);
            long j = this.$delayMs;
            this.label = 1;
            if (C44k.A01(this, j) == r03) {
                return r03;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw AnonymousClass001.A0M();
                }
                0Dt.A00(obj);
                r0 = (9Pv) obj;
                r02 = this.this$0.A06;
                do {
                    value = r02.getValue();
                } while (!r02.AGt(value, new 8L7((ImmutableList) null, r0.A00, false, false, ((8L7) value).A05, true)));
                return 04S.A00;
            }
            0Dt.A00(obj);
        }
        1FV A04 = this.this$0.A05.A04(this.$stickerIdsToAnimate, this.$prompt, this.$isRegenerate);
        this.label = 2;
        obj = 4kH.A00(A04, this);
        if (obj == r03) {
            return r03;
        }
        r0 = (9Pv) obj;
        r02 = this.this$0.A06;
        do {
            value = r02.getValue();
        } while (!r02.AGt(value, new 8L7((ImmutableList) null, r0.A00, false, false, ((8L7) value).A05, true)));
        return 04S.A00;
    }
}
