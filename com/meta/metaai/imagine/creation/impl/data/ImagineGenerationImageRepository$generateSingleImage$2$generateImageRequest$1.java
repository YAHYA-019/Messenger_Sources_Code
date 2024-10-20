package com.meta.metaai.imagine.creation.impl.data;

import X.04S;
import X.0DO;
import X.0DQ;
import X.0DR;
import X.0Ds;
import X.0Dt;
import X.AnonymousClass001;
import X.EMg;
import X.EN2;
import com.meta.metaai.imagine.service.ImagineNetworkService;
import kotlin.jvm.functions.Function2;

/* loaded from: ImagineGenerationImageRepository$generateSingleImage$2$generateImageRequest$1.class */
public final class ImagineGenerationImageRepository$generateSingleImage$2$generateImageRequest$1 extends 0DO implements Function2 {
    public final /* synthetic */ String $displayPrompt;
    public final /* synthetic */ EN2 $imagineType;
    public final /* synthetic */ boolean $isMEmuResultEnabled;
    public final /* synthetic */ String $prompt;
    public final /* synthetic */ String $promptSubmissionEventId;
    public int label;
    public final /* synthetic */ ImagineGenerationImageRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImagineGenerationImageRepository$generateSingleImage$2$generateImageRequest$1(ImagineGenerationImageRepository imagineGenerationImageRepository, EN2 en2, String str, String str2, String str3, 0DR r307, boolean z) {
        super(2, r307);
        this.this$0 = imagineGenerationImageRepository;
        this.$prompt = str;
        this.$isMEmuResultEnabled = z;
        this.$imagineType = en2;
        this.$promptSubmissionEventId = str2;
        this.$displayPrompt = str3;
    }

    public final 0DR create(Object obj, 0DR r303) {
        return new ImagineGenerationImageRepository$generateSingleImage$2$generateImageRequest$1(this.this$0, this.$imagineType, this.$prompt, this.$promptSubmissionEventId, this.$displayPrompt, r303, this.$isMEmuResultEnabled);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0Ds r0 = 0Ds.A02;
        int i = this.label;
        if (i == 0) {
            0Dt.A00(obj);
            ImagineGenerationImageRepository imagineGenerationImageRepository = this.this$0;
            ImagineNetworkService imagineNetworkService = imagineGenerationImageRepository.A06;
            String str = this.$prompt;
            EMg eMg = imagineGenerationImageRepository.A05;
            boolean z = this.$isMEmuResultEnabled;
            EN2 en2 = this.$imagineType;
            String str2 = this.$promptSubmissionEventId;
            String str3 = this.$displayPrompt;
            this.label = 1;
            obj = imagineNetworkService.A02(eMg, en2, str, str2, str3, this, z);
            if (obj == r0) {
                return r0;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0M();
            }
            0Dt.A00(obj);
        }
        return obj;
    }
}
