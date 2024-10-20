package com.meta.metaai.imagine.creation.impl.data;

import X.04S;
import X.07E;
import X.07I;
import X.0DL;
import X.0DO;
import X.0DQ;
import X.0DR;
import X.0Ds;
import X.0Dt;
import X.1BL;
import X.2aI;
import X.2aK;
import X.7zR;
import X.9Er;
import X.AnonymousClass001;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;

/* loaded from: ImagineGenerationImageRepository$generateImages$3.class */
public final class ImagineGenerationImageRepository$generateImages$3 extends 0DO implements Function2 {
    public final /* synthetic */ String $displayPrompt;
    public final /* synthetic */ boolean $isIgPersonalizationEnabled;
    public final /* synthetic */ boolean $isMEmuOnlyCreation;
    public final /* synthetic */ boolean $isMEmuResultsEnabled;
    public final /* synthetic */ boolean $needsPromptSummarization;
    public final /* synthetic */ int $numberOfImages;
    public final /* synthetic */ String $prompt;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ ImagineGenerationImageRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImagineGenerationImageRepository$generateImages$3(ImagineGenerationImageRepository imagineGenerationImageRepository, String str, String str2, 0DR r305, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        super(2, r305);
        this.$numberOfImages = i;
        this.$displayPrompt = str;
        this.$prompt = str2;
        this.this$0 = imagineGenerationImageRepository;
        this.$isMEmuOnlyCreation = z;
        this.$isIgPersonalizationEnabled = z2;
        this.$isMEmuResultsEnabled = z3;
        this.$needsPromptSummarization = z4;
    }

    public final 0DR create(Object obj, 0DR r303) {
        int i = this.$numberOfImages;
        ImagineGenerationImageRepository$generateImages$3 imagineGenerationImageRepository$generateImages$3 = new ImagineGenerationImageRepository$generateImages$3(this.this$0, this.$displayPrompt, this.$prompt, r303, i, this.$isMEmuOnlyCreation, this.$isIgPersonalizationEnabled, this.$isMEmuResultsEnabled, this.$needsPromptSummarization);
        imagineGenerationImageRepository$generateImages$3.L$0 = obj;
        return imagineGenerationImageRepository$generateImages$3;
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
            2aI r02 = (2aI) this.L$0;
            String A0s = 7zR.A0s();
            07E r03 = new 07E(1, this.$numberOfImages);
            String str = this.$displayPrompt;
            String str2 = this.$prompt;
            ImagineGenerationImageRepository imagineGenerationImageRepository = this.this$0;
            boolean z = this.$isMEmuOnlyCreation;
            boolean z2 = this.$isIgPersonalizationEnabled;
            boolean z3 = this.$isMEmuResultsEnabled;
            boolean z4 = this.$needsPromptSummarization;
            ArrayList A0z = 1BL.A0z(r03);
            07I it = r03.iterator();
            while (it.hasNext()) {
                A0z.add(2aK.A02(0DL.A00, new ImagineGenerationImageRepository$generateImages$3$1$1(imagineGenerationImageRepository, str, str2, A0s, null, it.A00(), z, z2, z3, z4), r02));
            }
            this.label = 1;
            if (9Er.A00(A0z, this) == r0) {
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
