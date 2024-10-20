package com.facebook.messaging.aibot.voice.viewcreator;

import X.04S;
import X.0DO;
import X.0DQ;
import X.0DR;
import X.0Ds;
import X.0Dt;
import X.0oO;
import X.0pC;
import X.1BK;
import X.1Br;
import X.7zM;
import X.8DP;
import X.AHx;
import X.AnonymousClass001;
import X.C0Bd;
import X.C9N8;
import X.C9ma;
import kotlin.jvm.functions.Function2;

/* loaded from: AiBotThreadVoiceModeViewCreator$loadView$1$1.class */
public final class AiBotThreadVoiceModeViewCreator$loadView$1$1 extends 0DO implements Function2 {
    public final /* synthetic */ float $initialBottomSheetHeightPct;
    public int label;
    public final /* synthetic */ C9ma this$0;

    /* renamed from: com.facebook.messaging.aibot.voice.viewcreator.AiBotThreadVoiceModeViewCreator$loadView$1$1$1, reason: invalid class name */
    /* loaded from: AiBotThreadVoiceModeViewCreator$loadView$1$1$1.class */
    public final class AnonymousClass1 extends 0DO implements C0Bd {
        public /* synthetic */ float F$0;
        public /* synthetic */ Object L$0;
        public int label;

        public AnonymousClass1(0DR r302) {
            super(3, r302);
        }

        @Override // X.C0Bd
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            float A00 = 7zM.A00(obj2);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((0DR) obj3);
            anonymousClass1.L$0 = obj;
            anonymousClass1.F$0 = A00;
            return anonymousClass1.invokeSuspend(04S.A00);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0M();
            }
            0Dt.A00(obj);
            return 1BK.A1G(this.L$0, new Float(this.F$0));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiBotThreadVoiceModeViewCreator$loadView$1$1(C9ma c9ma, 0DR r303, float f) {
        super(2, r303);
        this.this$0 = c9ma;
        this.$initialBottomSheetHeightPct = f;
    }

    public final 0DR create(Object obj, 0DR r303) {
        return new AiBotThreadVoiceModeViewCreator$loadView$1$1(this.this$0, r303, this.$initialBottomSheetHeightPct);
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
            0oO r02 = new 0oO(1, ((C9N8) 1Br.A0B(this.this$0.A0H)).A01, ((8DP) this.this$0.A0X.getValue()).A0B, new AnonymousClass1(null));
            AHx aHx = new AHx(this.this$0, this.$initialBottomSheetHeightPct);
            this.label = 1;
            if (r02.collect(new 0pC(aHx, 2), this) == r0) {
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
