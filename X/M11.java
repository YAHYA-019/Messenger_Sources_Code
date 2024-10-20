package X;

import android.content.res.Resources;
import android.view.View;
import com.facebook.messaging.wearable.callengine.HeraMessengerHostCallEngine;
import com.facebook.wearable.common.comms.hera.shared.engine.HeraCallEngineStateKt;
import com.facebook.wearable.common.comms.rtc.callengine2.camera.proto.CallCameraState;
import kotlin.jvm.functions.Function1;

/* loaded from: M11.class */
public final class M11 extends 01I implements C0Bd {
    public final int A00;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public M11(java.lang.Object r302, int r303) {
        /*
            r301 = this;
            r0 = r301
            r304 = r0
            r0 = r301
            r1 = r303
            r0.A00 = r1
            r0 = r303
            if (r0 == 0) goto L29
            java.lang.Class<com.facebook.messaging.wearable.callengine.HeraMessengerHostCallEngine> r0 = com.facebook.messaging.wearable.callengine.HeraMessengerHostCallEngine.class
            r305 = r0
            r0 = 3
            r306 = r0
            java.lang.String r0 = "handleActiveCameraUpdates"
            r307 = r0
            java.lang.String r0 = "handleActiveCameraUpdates(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"
            r308 = r0
        L1a:
            r0 = r304
            r1 = r306
            r2 = r302
            r3 = r305
            r4 = r307
            r5 = r308
            r6 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L29:
            java.lang.Class<androidx.compose.ui.platform.AndroidComposeView> r0 = androidx.compose.ui.platform.AndroidComposeView.class
            r305 = r0
            r0 = 3
            r306 = r0
            java.lang.String r0 = "startDrag"
            r307 = r0
            java.lang.String r0 = "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z"
            r308 = r0
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.M11.<init>(java.lang.Object, int):void");
    }

    @Override // X.C0Bd
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        if (this.A00 == 0) {
            long j = ((LCr) obj2).A00;
            Resources A0A = GOo.A0A((View) ((01K) this).receiver);
            new JXb(new LQ3(A0A.getDisplayMetrics().density, A0A.getConfiguration().fontScale), (Function1) obj3, j);
            throw AnonymousClass001.A0Q("getClipData");
        }
        String str = (String) obj;
        String str2 = (String) obj2;
        String str3 = (String) obj3;
        HeraMessengerHostCallEngine heraMessengerHostCallEngine = (HeraMessengerHostCallEngine) JR0.A0o(str, this);
        if (str2 != null) {
            C01i c01i = heraMessengerHostCallEngine.A0A;
            CallCameraState callCameraState = (CallCameraState) ((C15t) c01i.getValue()).getValue();
            if (callCameraState != null && HeraCallEngineStateKt.isWearableCameraEnabled(callCameraState)) {
                CallCameraState callCameraState2 = (CallCameraState) ((C15t) c01i.getValue()).getValue();
                str3 = null;
                str2 = callCameraState2 != null ? callCameraState2.deviceIdDesired_ : null;
                CallCameraState callCameraState3 = (CallCameraState) ((C15t) c01i.getValue()).getValue();
                if (callCameraState3 != null) {
                    str3 = callCameraState3.cameraIdDesired_;
                }
            }
        }
        heraMessengerHostCallEngine.getCameraApi().updateActiveCamera(str, str2, str3);
        0fH.A0j("HeraMessengerHostCallEngine", 0Pz.A10("updateActiveCamera with callId = ", str, ", deviceId = ", str2, ", cameraId = ", str3));
        return 04S.A00;
    }
}
