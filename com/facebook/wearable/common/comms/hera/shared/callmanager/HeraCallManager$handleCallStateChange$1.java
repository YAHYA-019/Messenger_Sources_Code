package com.facebook.wearable.common.comms.hera.shared.callmanager;

import X.04S;
import X.0DO;
import X.0DR;
import X.C0Bd;
import com.facebook.wearable.common.comms.rtc.callengine2.callcore.proto.Call;

/* loaded from: HeraCallManager$handleCallStateChange$1.class */
public final class HeraCallManager$handleCallStateChange$1 extends 0DO implements C0Bd {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ HeraCallManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeraCallManager$handleCallStateChange$1(HeraCallManager heraCallManager, 0DR r303) {
        super(3, r303);
        this.this$0 = heraCallManager;
    }

    @Override // X.C0Bd
    public final Object invoke(Call call, Call call2, 0DR r304) {
        HeraCallManager$handleCallStateChange$1 heraCallManager$handleCallStateChange$1 = new HeraCallManager$handleCallStateChange$1(this.this$0, r304);
        heraCallManager$handleCallStateChange$1.L$0 = call;
        heraCallManager$handleCallStateChange$1.L$1 = call2;
        return heraCallManager$handleCallStateChange$1.invokeSuspend(04S.A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.common.comms.hera.shared.callmanager.HeraCallManager$handleCallStateChange$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
