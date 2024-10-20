package com.facebook.push.fcm;

import X.0FI;
import X.11T;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.AnonymousClass025;
import X.AnonymousClass074;
import X.C08o;
import X.C1cx;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import java.util.Map;

/* loaded from: FcmListenerService.class */
public final class FcmListenerService extends FirebaseMessagingService implements AnonymousClass025 {
    public final AnonymousClass074 A08 = new Object();
    public final 1Br A05 = 1Bu.A00(66592);
    public final 1Br A00 = 1Bu.A01(this, 82265);
    public final 1Br A02 = 1Bq.A00(131224);
    public final 1Br A01 = 1Bq.A00(131222);
    public final 1Br A03 = 1Bq.A00(131223);
    public final 1Br A04 = 1Bq.A00(49194);
    public final 1Br A07 = 1Bq.A00(83846);
    public final 1Br A06 = 1Bq.A00(16385);

    public static final int A00(RemoteMessage remoteMessage) {
        int i;
        Bundle bundle = remoteMessage.A00;
        String string = bundle.getString("google.original_priority");
        if (string == null) {
            string = bundle.getString("google.priority");
        }
        if ("high".equals(string)) {
            i = 1;
        } else {
            i = 0;
            if ("normal".equals(string)) {
                i = 2;
            }
        }
        return i - remoteMessage.A00();
    }

    public static final Bundle A01(RemoteMessage remoteMessage) {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : remoteMessage.A01().entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        return bundle;
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0675, code lost:
    
        if (r0.length() == 0) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x022a, code lost:
    
        if (r0 == null) goto L99;
     */
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A07(com.google.firebase.messaging.RemoteMessage r302) {
        /*
            Method dump skipped, instructions count: 2451
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.push.fcm.FcmListenerService.A07(com.google.firebase.messaging.RemoteMessage):void");
    }

    @Override // X.AnonymousClass025
    public Object B5M(Object obj) {
        11T.A0F(obj, 0);
        return this.A08.A00(obj);
    }

    @Override // X.AnonymousClass025
    public void CtX(Object obj, Object obj2) {
        11T.A0F(obj, 0);
        11T.A0F(obj2, 1);
        this.A08.A01(obj, obj2);
    }

    @Override // android.app.Service
    public void onCreate() {
        int A00 = C08o.A00(this, 1466331173);
        int A04 = 0FI.A04(-1288502878);
        super.onCreate();
        C1cx.A00(this);
        0FI.A0A(519230818, A04);
        C08o.A02(910138534, A00);
    }
}
