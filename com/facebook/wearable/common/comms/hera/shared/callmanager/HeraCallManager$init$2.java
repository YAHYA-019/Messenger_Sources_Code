package com.facebook.wearable.common.comms.hera.shared.callmanager;

import X.04S;
import X.0DO;
import X.0DR;
import X.0Ds;
import X.0Dt;
import X.0zU;
import X.2aI;
import X.AnonymousClass001;
import X.C11i;
import com.meta.wearable.comms.calling.hera.engine.base.EngineState;
import kotlin.jvm.functions.Function2;

/* loaded from: HeraCallManager$init$2.class */
public final class HeraCallManager$init$2 extends 0DO implements Function2 {
    public int label;
    public final /* synthetic */ HeraCallManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeraCallManager$init$2(HeraCallManager heraCallManager, 0DR r303) {
        super(2, r303);
        this.this$0 = heraCallManager;
    }

    public final 0DR create(Object obj, 0DR r303) {
        return new HeraCallManager$init$2(this.this$0, r303);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(2aI r302, 0DR r303) {
        return new HeraCallManager$init$2(this.this$0, r303).invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C11i engineStateFlow;
        0Ds r0 = 0Ds.A02;
        int i = this.label;
        if (i == 0) {
            0Dt.A00(obj);
            engineStateFlow = this.this$0.getEngineStateFlow();
            final HeraCallManager heraCallManager = this.this$0;
            0zU r02 = new 0zU() { // from class: com.facebook.wearable.common.comms.hera.shared.callmanager.HeraCallManager$init$2.1
                public final Object emit(EngineState engineState, 0DR r303) {
                    HeraCallManager.this.cachedState = engineState;
                    return 04S.A00;
                }

                public /* bridge */ /* synthetic */ Object emit(Object obj2, 0DR r303) {
                    HeraCallManager.this.cachedState = (EngineState) obj2;
                    return 04S.A00;
                }
            };
            this.label = 1;
            if (engineStateFlow.collect(r02, this) == r0) {
                return r0;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0M();
            }
            0Dt.A00(obj);
        }
        throw new RuntimeException();
    }
}
