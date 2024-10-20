package com.meta.metaai.components.voice.viewmodel;

import X.04S;
import X.0DO;
import X.0DR;
import X.0Dt;
import X.9cZ;
import X.AX8;
import X.AnonymousClass001;
import X.C0Bf;
import com.facebook.rsys.metaaivoicestate.gen.MetaAiVoiceState;

/* loaded from: MetaAiVoiceSessionViewModel$startVoiceSession$4$1$1$1.class */
public final class MetaAiVoiceSessionViewModel$startVoiceSession$4$1$1$1 extends 0DO implements C0Bf {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public /* synthetic */ boolean Z$0;
    public /* synthetic */ boolean Z$1;
    public int label;

    public MetaAiVoiceSessionViewModel$startVoiceSession$4$1$1$1(0DR r302) {
        super(5, r302);
    }

    @Override // X.C0Bf
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean A1V = AnonymousClass001.A1V(obj3);
        boolean A1V2 = AnonymousClass001.A1V(obj4);
        MetaAiVoiceSessionViewModel$startVoiceSession$4$1$1$1 metaAiVoiceSessionViewModel$startVoiceSession$4$1$1$1 = new MetaAiVoiceSessionViewModel$startVoiceSession$4$1$1$1((0DR) obj5);
        metaAiVoiceSessionViewModel$startVoiceSession$4$1$1$1.L$0 = obj;
        metaAiVoiceSessionViewModel$startVoiceSession$4$1$1$1.L$1 = obj2;
        metaAiVoiceSessionViewModel$startVoiceSession$4$1$1$1.Z$0 = A1V;
        metaAiVoiceSessionViewModel$startVoiceSession$4$1$1$1.Z$1 = A1V2;
        return metaAiVoiceSessionViewModel$startVoiceSession$4$1$1$1.invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0M();
        }
        0Dt.A00(obj);
        return new 9cZ((AX8) this.L$0, (MetaAiVoiceState) this.L$1, this.Z$0, this.Z$1);
    }
}
