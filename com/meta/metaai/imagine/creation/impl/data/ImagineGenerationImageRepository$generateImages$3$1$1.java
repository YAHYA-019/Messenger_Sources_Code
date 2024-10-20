package com.meta.metaai.imagine.creation.impl.data;

import X.04S;
import X.0DO;
import X.0DQ;
import X.0DR;
import X.0Ds;
import X.0Dt;
import X.0S2;
import X.0Xs;
import X.11T;
import X.1BK;
import X.2aG;
import X.AnonymousClass001;
import X.EKA;
import X.EKB;
import X.EN2;
import X.ESN;
import X.Eyx;
import X.F9y;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;

/* loaded from: ImagineGenerationImageRepository$generateImages$3$1$1.class */
public final class ImagineGenerationImageRepository$generateImages$3$1$1 extends 0DO implements Function2 {
    public final /* synthetic */ String $displayPrompt;
    public final /* synthetic */ int $index;
    public final /* synthetic */ boolean $isIgPersonalizationEnabled;
    public final /* synthetic */ boolean $isMEmuOnlyCreation;
    public final /* synthetic */ boolean $isMEmuResultsEnabled;
    public final /* synthetic */ boolean $needsPromptSummarization;
    public final /* synthetic */ String $prompt;
    public final /* synthetic */ String $promptSubmissionEventId;
    public int label;
    public final /* synthetic */ ImagineGenerationImageRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImagineGenerationImageRepository$generateImages$3$1$1(ImagineGenerationImageRepository imagineGenerationImageRepository, String str, String str2, String str3, 0DR r306, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        super(2, r306);
        this.$displayPrompt = str;
        this.$prompt = str2;
        this.this$0 = imagineGenerationImageRepository;
        this.$isMEmuOnlyCreation = z;
        this.$isIgPersonalizationEnabled = z2;
        this.$index = i;
        this.$isMEmuResultsEnabled = z3;
        this.$promptSubmissionEventId = str3;
        this.$needsPromptSummarization = z4;
    }

    public final 0DR create(Object obj, 0DR r303) {
        String str = this.$displayPrompt;
        String str2 = this.$prompt;
        ImagineGenerationImageRepository imagineGenerationImageRepository = this.this$0;
        boolean z = this.$isMEmuOnlyCreation;
        boolean z2 = this.$isIgPersonalizationEnabled;
        return new ImagineGenerationImageRepository$generateImages$3$1$1(imagineGenerationImageRepository, str, str2, this.$promptSubmissionEventId, r303, this.$index, z, z2, this.$isMEmuResultsEnabled, this.$needsPromptSummarization);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return 0DQ.A00(obj2, obj, this).invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        Object value;
        int i;
        Eyx eyx;
        0Ds r0 = 0Ds.A02;
        int i2 = this.label;
        if (i2 == 0) {
            0Dt.A00(obj);
            EN2 en2 = (this.$displayPrompt != null && 11T.A0O(this.$prompt, this.this$0.A08) && this.$isMEmuOnlyCreation) ? EN2.A06 : this.$isMEmuOnlyCreation ? EN2.A04 : (this.$isIgPersonalizationEnabled && this.$index == 1) ? EN2.A03 : EN2.A02;
            ImagineGenerationImageRepository imagineGenerationImageRepository = this.this$0;
            String str = this.$prompt;
            String str2 = this.$displayPrompt;
            boolean z = this.$isMEmuResultsEnabled;
            String str3 = this.$promptSubmissionEventId;
            boolean z2 = this.$needsPromptSummarization;
            this.label = 1;
            obj = 2aG.A00(this, new ImagineGenerationImageRepository$generateSingleImage$2(imagineGenerationImageRepository, en2, str, str3, str2, null, z2, z));
            if (obj == r0) {
                return r0;
            }
        } else {
            if (i2 != 1) {
                throw AnonymousClass001.A0M();
            }
            0Dt.A00(obj);
        }
        EKB ekb = (ESN) obj;
        ImagineGenerationImageRepository imagineGenerationImageRepository2 = this.this$0;
        String str4 = this.$prompt;
        0Xs r02 = imagineGenerationImageRepository2.A0C;
        do {
            value = r02.getValue();
            Eyx eyx2 = (Eyx) value;
            ArrayList A17 = eyx2 != null ? 1BK.A17(eyx2.A02) : AnonymousClass001.A0s();
            Iterator it = A17.iterator();
            int i3 = 0;
            while (true) {
                i = i3;
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (((F9y) it.next()).A02 == 0S2.A00) {
                    break;
                }
                i3 = i + 1;
            }
            eyx = null;
            if (ekb instanceof EKB) {
                A17.set(i, new F9y(null, ekb.A00, 0S2.A01, str4));
            } else if (ekb instanceof EKA) {
                A17.set(i, new F9y(((EKA) ekb).A00, null, 0S2.A0C, str4));
            }
            if (eyx2 != null) {
                eyx = new Eyx(eyx2.A01, A17, eyx2.A00, eyx2.A03);
            }
        } while (!r02.AGt(value, eyx));
        return 04S.A00;
    }
}
