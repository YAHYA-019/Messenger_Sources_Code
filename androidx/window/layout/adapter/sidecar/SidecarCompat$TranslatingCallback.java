package androidx.window.layout.adapter.sidecar;

import X.11T;
import X.1BK;
import X.HGM;
import X.ILo;
import X.ILp;
import android.app.Activity;
import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.Iterator;

/* loaded from: SidecarCompat$TranslatingCallback.class */
public final class SidecarCompat$TranslatingCallback implements SidecarInterface.SidecarCallback {
    public final /* synthetic */ ILp A00;

    public SidecarCompat$TranslatingCallback(ILp iLp) {
        this.A00 = iLp;
    }

    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
        SidecarInterface A01;
        11T.A0F(sidecarDeviceState, 0);
        ILp iLp = this.A00;
        Iterator A1A = 1BK.A1A(iLp.A04);
        while (A1A.hasNext()) {
            Activity activity = (Activity) A1A.next();
            IBinder A00 = HGM.A00(activity);
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
            if (A00 != null && (A01 = iLp.A01()) != null) {
                sidecarWindowLayoutInfo = A01.getWindowLayoutInfo(A00);
            }
            ILo iLo = iLp.A00;
            if (iLo != null) {
                iLo.CVD(activity, iLp.A01.A01(sidecarDeviceState, sidecarWindowLayoutInfo));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x004f, code lost:
    
        if (r305 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onWindowLayoutChanged(android.os.IBinder r302, androidx.window.sidecar.SidecarWindowLayoutInfo r303) {
        /*
            r301 = this;
            r0 = r302
            r1 = r303
            X.11T.A0H(r0, r1)
            r0 = r301
            X.ILp r0 = r0.A00
            r304 = r0
            r0 = r304
            java.util.Map r0 = r0.A04
            r305 = r0
            r0 = r305
            r1 = r302
            java.lang.Object r0 = r0.get(r1)
            android.app.Activity r0 = (android.app.Activity) r0
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L33
            java.lang.String r0 = "SidecarCompat"
            r307 = r0
            java.lang.String r0 = "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?"
            r305 = r0
            r0 = r307
            r1 = r305
            int r0 = android.util.Log.w(r0, r1)
        L32:
            return
        L33:
            r0 = r304
            X.IAb r0 = r0.A01
            r307 = r0
            r0 = r304
            androidx.window.sidecar.SidecarInterface r0 = r0.A01()
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L52
            r0 = r305
            androidx.window.sidecar.SidecarDeviceState r0 = r0.getDeviceState()
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L5c
        L52:
            androidx.window.sidecar.SidecarDeviceState r0 = new androidx.window.sidecar.SidecarDeviceState
            r305 = r0
            r0 = r305
            r0.<init>()
        L5c:
            r0 = r307
            r1 = r305
            r2 = r303
            X.HtB r0 = r0.A01(r1, r2)
            r307 = r0
            r0 = r304
            X.ILo r0 = r0.A00
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L32
            r0 = r305
            r1 = r306
            r2 = r307
            r0.CVD(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.adapter.sidecar.SidecarCompat$TranslatingCallback.onWindowLayoutChanged(android.os.IBinder, androidx.window.sidecar.SidecarWindowLayoutInfo):void");
    }
}
