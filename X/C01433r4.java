package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3r4, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3r4.class */
public final class C01433r4 extends 0Ep {
    public final Context A00;
    public final C00i A01;
    public final C00i A02;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C01433r4() {
        /*
            r301 = this;
            android.content.Context r0 = com.facebook.inject.FbInjector.A00()
            r302 = r0
            r0 = r302
            java.lang.Class r0 = r0.getClass()
            X.05S r0 = new X.05S
            r303 = r0
            r0 = r303
            r1 = r302
            r2 = 0
            r3 = 0
            r4 = 0
            r0.<init>(r1, r2, r3, r4)
            java.lang.Integer r0 = X.0S2.A01
            r304 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r305 = r0
            r0 = r305
            r0.<init>()
            X.097 r0 = X.AnonymousClass097.A00
            r306 = r0
            r0 = r301
            r1 = r302
            r2 = r303
            r3 = r306
            r4 = r304
            java.lang.String r5 = "MqttLite"
            r6 = r305
            r0.<init>(r1, r2, r3, r4, r5, r6)
            X.1BQ r0 = new X.1BQ
            r307 = r0
            r0 = r307
            r1 = 65904(0x10170, float:9.2351E-41)
            r0.<init>(r1)
            r0 = r301
            r1 = r307
            r0.A01 = r1
            X.1BQ r0 = new X.1BQ
            r307 = r0
            r0 = r307
            r1 = 32798(0x801e, float:4.596E-41)
            r0.<init>(r1)
            r0 = r301
            r1 = r307
            r0.A02 = r1
            r0 = r301
            r1 = 1
            r0.A02 = r1
            r0 = r301
            r1 = r302
            r0.A00 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01433r4.<init>():void");
    }

    public void A06(Intent intent, 0Gp r303, String str, String str2) {
        this.A02.get();
    }

    public void A07(0Gq r302, String str, String str2) {
        A03(str2).A02(str);
        C01443r5 c01443r5 = (C01443r5) this.A02.get();
        String obj = r302.toString();
        ((2Iq) c01443r5.A01.get()).A00(StringFormatUtil.formatStrLocaleSafe("%s-%s", "notif_discard", obj));
        2Jy r0 = new 2Jy("notif_discard");
        r0.A0D("push_id", str);
        r0.A0D("reason", obj);
        c01443r5.A03(r0);
    }

    public void A08(String str, String str2) {
    }

    public boolean A09(C0ja c0ja) {
        A05(TimeUnit.SECONDS, 30);
        FbUserSession A00 = 1Fw.A00();
        Intent intent = c0ja.A03;
        if (intent == null) {
            return true;
        }
        ((C3r6) this.A01.get()).A00(this.A00, intent, A00);
        return true;
    }

    public boolean A0A(String str, String str2, boolean z) {
        A03(str2).A02(str);
        return true;
    }
}
