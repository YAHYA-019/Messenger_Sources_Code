package com.facebook.messaging.qrcode.fragments.fullscreenfragment;

import android.content.BroadcastReceiver;

/* loaded from: QrCodeFragment$Companion$ShareReceiver.class */
public final class QrCodeFragment$Companion$ShareReceiver extends BroadcastReceiver {
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006e, code lost:
    
        if (r311 == null) goto L13;
     */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onReceive(android.content.Context r302, android.content.Intent r303) {
        /*
            r301 = this;
            r0 = 1773343743(0x69b313ff, float:2.7061519E25)
            int r0 = X.0FI.A01(r0)
            r304 = r0
            r0 = r302
            r1 = r303
            X.11T.A0H(r0, r1)
            X.02w r0 = X.C09h.A03()
            r305 = r0
            r0 = r305
            r1 = r302
            r2 = r303
            r3 = r301
            boolean r0 = r0.A04(r1, r2, r3)
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L2b
            r0 = -1739069058(0xffffffff9857e97e, float:-2.7905982E-24)
            r306 = r0
        L23:
            r0 = r306
            r1 = r304
            r2 = r303
            X.0FI.A0D(r0, r1, r2)
            return
        L2b:
            r0 = 68572(0x10bdc, float:9.609E-41)
            java.lang.Object r0 = X.1Bn.A0A(r0)
            X.9XO r0 = (X.9XO) r0
            r307 = r0
            r0 = r303
            java.lang.String r1 = "hash"
            java.lang.String r0 = r0.getStringExtra(r1)
            r308 = r0
            java.lang.String r0 = ""
            r309 = r0
            java.lang.String r0 = "android.intent.extra.CHOSEN_COMPONENT"
            r305 = r0
            r0 = r303
            r1 = r305
            android.os.Parcelable r0 = r0.getParcelableExtra(r1)
            r310 = r0
            r0 = r310
            boolean r0 = r0 instanceof android.content.ComponentName
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L71
            r0 = r310
            android.content.ComponentName r0 = (android.content.ComponentName) r0
            r310 = r0
            r0 = r310
            if (r0 == 0) goto L71
            r0 = r310
            java.lang.String r0 = r0.getPackageName()
            r311 = r0
            r0 = r311
            if (r0 != 0) goto L75
        L71:
            r0 = r309
            r311 = r0
        L75:
            r0 = r308
            if (r0 != 0) goto L7e
            r0 = r309
            r308 = r0
        L7e:
            r0 = r307
            X.1Br r0 = r0.A00
            X.04J r0 = X.1Br.A02(r0)
            r310 = r0
            r0 = 553(0x229, float:7.75E-43)
            java.lang.String r0 = X.1BJ.A00(r0)
            r305 = r0
            r0 = r310
            r1 = r305
            X.1UG r0 = X.1BK.A08(r0, r1)
            r310 = r0
            r0 = r310
            boolean r0 = r0.isSampled()
            r306 = r0
            r0 = r306
            if (r0 == 0) goto Lc0
            r0 = r310
            java.lang.String r1 = "qr_unique_id"
            r2 = r308
            r0.A7R(r1, r2)
            java.lang.String r0 = "share_target"
            r305 = r0
            r0 = r310
            r1 = r305
            r2 = r311
            r0.A7R(r1, r2)
            r0 = r310
            r0.BZL()
        Lc0:
            r0 = 1897098661(0x71136da5, float:7.300296E29)
            r306 = r0
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.qrcode.fragments.fullscreenfragment.QrCodeFragment$Companion$ShareReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
