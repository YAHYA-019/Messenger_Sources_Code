package X;

import com.facebook.messaging.browser.MessengerBrowserLiteCallbackService;
import com.facebook.payments.p2m.asynccontroller.asyncControllerActivity;
import java.util.HashMap;

/* loaded from: Fwu.class */
public final class Fwu implements GJ2 {
    public final int A00;
    public final Object A01;

    public Fwu(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0035, code lost:
    
        if (r305 == null) goto L8;
     */
    @Override // X.GJ2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onFailure(java.lang.Throwable r302) {
        /*
            r301 = this;
            r0 = r301
            int r0 = r0.A00
            r303 = r0
            r0 = r301
            java.lang.Object r0 = r0.A01
            r304 = r0
            r0 = r303
            switch(r0) {
                case 0: goto Lb3;
                case 1: goto Lab;
                case 2: goto L89;
                default: goto L24;
            }
        L24:
            r0 = r304
            X.GCG r0 = (X.GCG) r0
            r304 = r0
            r0 = r302
            if (r0 == 0) goto L38
            r0 = r302
            java.lang.String r0 = r0.getLocalizedMessage()
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L3c
        L38:
            java.lang.String r0 = "async controller launch failed"
            r305 = r0
        L3c:
            r0 = r304
            X.1Br r0 = r0.A04
            java.lang.Object r0 = X.1Br.A0B(r0)
            X.FEH r0 = (X.FEH) r0
            r306 = r0
            r0 = r304
            X.RNf r0 = r0.A02
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L80
            r0 = r307
            java.lang.String r0 = r0.A03
            r308 = r0
            r0 = r304
            java.lang.String r0 = r0.A00()
            r309 = r0
            java.util.HashMap r0 = X.AnonymousClass001.A0u()
            r310 = r0
            r0 = r308
            r1 = r309
            X.1BL.A1F(r0, r1)
            r0 = r306
            java.lang.String r1 = "initial_async_controller_request_error"
            r2 = r305
            r3 = r308
            r4 = r309
            r5 = r310
            X.FEH.A00(r0, r1, r2, r3, r4, r5)
            r0 = r304
            r0.A01()
            return
        L80:
            java.lang.String r0 = "unifiedLauncherFlowConfig"
            X.11T.A0L(r0)
            X.0Q8 r0 = X.0Q8.createAndThrow()
            throw r0
        L89:
            r0 = r304
            com.facebook.payments.p2m.asynccontroller.asyncControllerActivity r0 = (com.facebook.payments.p2m.asynccontroller.asyncControllerActivity) r0
            r304 = r0
            r0 = r304
            X.JZj r0 = r0.A00
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L9e
            r0 = r307
            r0.dismiss()
        L9e:
            r0 = 0
            r303 = r0
            r0 = 0
            r307 = r0
            r0 = r304
            r1 = 0
            r0.A00 = r1
            goto Lbf
        Lab:
            r0 = r304
            com.facebook.base.activity.FbFragmentActivity r0 = (com.facebook.base.activity.FbFragmentActivity) r0
            r304 = r0
            goto Lbf
        Lb3:
            r0 = r304
            com.facebook.messaging.browser.MessengerBrowserLiteCallbackService$P2MTransparentActivity r0 = (com.facebook.messaging.browser.MessengerBrowserLiteCallbackService.P2MTransparentActivity) r0
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            r1 = r303
            r0.A00 = r1
        Lbf:
            r0 = r304
            r0.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Fwu.onFailure(java.lang.Throwable):void");
    }

    @Override // X.GJ2
    public void onSuccess() {
        switch (this.A00) {
            case 0:
                ((MessengerBrowserLiteCallbackService.P2MTransparentActivity) this.A01).A00 = true;
                return;
            case 1:
                return;
            case 2:
                asyncControllerActivity asynccontrolleractivity = (asyncControllerActivity) this.A01;
                JZj jZj = asynccontrolleractivity.A00;
                if (jZj != null) {
                    jZj.dismiss();
                }
                asynccontrolleractivity.A00 = null;
                return;
            default:
                GCG gcg = (GCG) this.A01;
                FEH feh = (FEH) 1Br.A0B(gcg.A04);
                RNf rNf = gcg.A02;
                if (rNf == null) {
                    11T.A0L("unifiedLauncherFlowConfig");
                    throw 0Q8.createAndThrow();
                }
                String str = rNf.A03;
                String A00 = gcg.A00();
                HashMap A0u = AnonymousClass001.A0u();
                11T.A0H(str, A00);
                FEH.A00(feh, "initial_async_controller_request_success", "", str, A00, A0u);
                gcg.A01();
                return;
        }
    }
}
