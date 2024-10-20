package com.meta.metaai.components.voice.viewmodel;

import X.04S;
import X.0DO;
import X.0DR;
import X.0Dt;
import X.1BK;
import X.AnonymousClass001;
import kotlin.jvm.functions.Function1;

/* loaded from: MetaAiVoiceSessionViewModel$startVoiceSession$1.class */
public final class MetaAiVoiceSessionViewModel$startVoiceSession$1 extends 0DO implements Function1 {
    public int label;

    public MetaAiVoiceSessionViewModel$startVoiceSession$1(0DR r302) {
        super(1, r302);
    }

    public final 0DR create(0DR r302) {
        return new MetaAiVoiceSessionViewModel$startVoiceSession$1(r302);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new MetaAiVoiceSessionViewModel$startVoiceSession$1((0DR) obj).invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0M();
        }
        0Dt.A00(obj);
        return 1BK.A0d();
    }
}
