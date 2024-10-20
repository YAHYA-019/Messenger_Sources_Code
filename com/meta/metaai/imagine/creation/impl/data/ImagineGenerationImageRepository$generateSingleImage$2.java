package com.meta.metaai.imagine.creation.impl.data;

import X.04S;
import X.0DO;
import X.0DQ;
import X.0DR;
import X.EN2;
import kotlin.jvm.functions.Function2;

/* loaded from: ImagineGenerationImageRepository$generateSingleImage$2.class */
public final class ImagineGenerationImageRepository$generateSingleImage$2 extends 0DO implements Function2 {
    public final /* synthetic */ String $displayPrompt;
    public final /* synthetic */ EN2 $imagineType;
    public final /* synthetic */ boolean $isMEmuResultEnabled;
    public final /* synthetic */ boolean $needsPromptSummarization;
    public final /* synthetic */ String $prompt;
    public final /* synthetic */ String $promptSubmissionEventId;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ ImagineGenerationImageRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImagineGenerationImageRepository$generateSingleImage$2(ImagineGenerationImageRepository imagineGenerationImageRepository, EN2 en2, String str, String str2, String str3, 0DR r307, boolean z, boolean z2) {
        super(2, r307);
        this.this$0 = imagineGenerationImageRepository;
        this.$needsPromptSummarization = z;
        this.$prompt = str;
        this.$isMEmuResultEnabled = z2;
        this.$imagineType = en2;
        this.$promptSubmissionEventId = str2;
        this.$displayPrompt = str3;
    }

    public final 0DR create(Object obj, 0DR r303) {
        ImagineGenerationImageRepository imagineGenerationImageRepository = this.this$0;
        boolean z = this.$needsPromptSummarization;
        ImagineGenerationImageRepository$generateSingleImage$2 imagineGenerationImageRepository$generateSingleImage$2 = new ImagineGenerationImageRepository$generateSingleImage$2(imagineGenerationImageRepository, this.$imagineType, this.$prompt, this.$promptSubmissionEventId, this.$displayPrompt, r303, z, this.$isMEmuResultEnabled);
        imagineGenerationImageRepository$generateSingleImage$2.L$0 = obj;
        return imagineGenerationImageRepository$generateSingleImage$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x020d  */
    /* JADX WARN: Type inference failed for: r0v140, types: [X.4cZ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 587
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository$generateSingleImage$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
