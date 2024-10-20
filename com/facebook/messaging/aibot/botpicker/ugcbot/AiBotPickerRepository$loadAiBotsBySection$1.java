package com.facebook.messaging.aibot.botpicker.ugcbot;

import X.04S;
import X.0DO;
import X.0DQ;
import X.0DR;
import X.0Ds;
import X.0Dt;
import X.0zU;
import X.9Rx;
import X.AnonymousClass001;
import android.content.Context;
import com.facebook.messaging.aibot.botpicker.ugcbot.services.UgcAiBotPickerFetchSectionService;
import kotlin.jvm.functions.Function2;

/* loaded from: AiBotPickerRepository$loadAiBotsBySection$1.class */
public final class AiBotPickerRepository$loadAiBotsBySection$1 extends 0DO implements Function2 {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ String $sectionId;
    public final /* synthetic */ boolean $shouldCacheResponse;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ 9Rx this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiBotPickerRepository$loadAiBotsBySection$1(Context context, 9Rx r303, String str, 0DR r305, boolean z) {
        super(2, r305);
        this.this$0 = r303;
        this.$context = context;
        this.$sectionId = str;
        this.$shouldCacheResponse = z;
    }

    public final 0DR create(Object obj, 0DR r303) {
        AiBotPickerRepository$loadAiBotsBySection$1 aiBotPickerRepository$loadAiBotsBySection$1 = new AiBotPickerRepository$loadAiBotsBySection$1(this.$context, this.this$0, this.$sectionId, r303, this.$shouldCacheResponse);
        aiBotPickerRepository$loadAiBotsBySection$1.L$0 = obj;
        return aiBotPickerRepository$loadAiBotsBySection$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0zU r307;
        0Ds r0 = 0Ds.A02;
        int i = this.label;
        if (i == 0) {
            0Dt.A00(obj);
            r307 = (0zU) this.L$0;
            UgcAiBotPickerFetchSectionService ugcAiBotPickerFetchSectionService = this.this$0.A01;
            Context context = this.$context;
            String str = this.$sectionId;
            boolean z = this.$shouldCacheResponse;
            this.L$0 = r307;
            this.label = 1;
            obj = ugcAiBotPickerFetchSectionService.A00(context, str, this, z);
            if (obj == r0) {
                return r0;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw AnonymousClass001.A0M();
                }
                0Dt.A00(obj);
                return 04S.A00;
            }
            r307 = (0zU) this.L$0;
            0Dt.A00(obj);
        }
        this.L$0 = null;
        this.label = 2;
        if (r307.emit(obj, this) == r0) {
            return r0;
        }
        return 04S.A00;
    }
}
