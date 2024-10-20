package com.facebook.wearable.common.comms.hera.shared.callmanager;

import X.04S;
import X.0DO;
import X.0DR;
import X.C0Bd;
import com.meta.wearable.comms.calling.hera.engine.base.EngineState;

/* loaded from: HeraCallManager$handleCameraStateChanges$1.class */
public final class HeraCallManager$handleCameraStateChanges$1 extends 0DO implements C0Bd {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;
    public final /* synthetic */ HeraCallManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeraCallManager$handleCameraStateChanges$1(HeraCallManager heraCallManager, 0DR r303) {
        super(3, r303);
        this.this$0 = heraCallManager;
    }

    @Override // X.C0Bd
    public final Object invoke(EngineState engineState, EngineState engineState2, 0DR r304) {
        HeraCallManager$handleCameraStateChanges$1 heraCallManager$handleCameraStateChanges$1 = new HeraCallManager$handleCameraStateChanges$1(this.this$0, r304);
        heraCallManager$handleCameraStateChanges$1.L$0 = engineState;
        heraCallManager$handleCameraStateChanges$1.L$1 = engineState2;
        return heraCallManager$handleCameraStateChanges$1.invokeSuspend(04S.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0246, code lost:
    
        if (X.11T.A0O(r313 != null ? r313.activeDeviceId_ : null, r315 != null ? r315.activeDeviceId_ : null) == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0344, code lost:
    
        if (X.11T.A0O(r313 != null ? r313.cameraIdDesired_ : null, r315.cameraIdDesired_) == false) goto L105;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r312v25 */
    /* JADX WARN: Type inference failed for: r312v26 */
    /* JADX WARN: Type inference failed for: r312v27, types: [java.util.AbstractCollection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 1331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.common.comms.hera.shared.callmanager.HeraCallManager$handleCameraStateChanges$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
