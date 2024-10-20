package com.facebook.push.nna;

import X.0FI;
import X.0S2;
import X.0fH;
import X.1BJ;
import X.1BL;
import X.1Bi;
import X.1G2;
import X.1OZ;
import X.1Og;
import X.1P5;
import X.1Ql;
import X.4YV;
import X.4rH;
import X.AbH;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C00i;
import X.C1Oc;
import X.C1P2;
import X.C1cx;
import X.C3r6;
import X.C5dw;
import X.HXN;
import X.LY0;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import com.facebook.acra.constants.ActionId;
import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.pushlite.model.PushInfraMetaData;
import java.util.Locale;

/* loaded from: NNAService.class */
public class NNAService extends C5dw {
    public C00i A00;
    public C00i A01;
    public final C3r6 A02;
    public final C1P2 A03;
    public final LY0 A04;
    public final HXN A05;

    public NNAService() {
        super("NNAReceiver");
        this.A04 = (LY0) 1Bi.A03(131213);
        this.A05 = (HXN) 1Bi.A03(115790);
        this.A03 = (C1P2) 1Bi.A03(16624);
        this.A02 = (C3r6) 1Bi.A03(65904);
    }

    @Override // X.C5dw
    public void A02() {
        0fH.A0A(NNAService.class, "NNA Service started");
        this.A01 = AbH.A0S();
        this.A00 = AbH.A0a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C5dw
    public void A03(Intent intent) {
        int i;
        int A04 = 0FI.A04(460991960);
        C1cx.A00(this);
        if (intent != null) {
            try {
                if (intent.getAction() != null) {
                    FbUserSession A0F = 1BL.A0F();
                    if ("com.nokia.pushnotifications.intent.REGISTRATION".equals(intent.getAction())) {
                        String stringExtra = intent.getStringExtra("error");
                        String stringExtra2 = intent.getStringExtra(1BJ.A00(219));
                        String stringExtra3 = intent.getStringExtra(AnonymousClass000.A00(276));
                        if (0fH.A01.BTv(3)) {
                            0fH.A04(NNAService.class, stringExtra2, stringExtra, stringExtra3, "dmControl: registrationId = %s, error = %s, removed = %s");
                        }
                        LY0 ly0 = this.A04;
                        if (AnonymousClass001.A1T(stringExtra3)) {
                            ly0.A02.A07();
                            ly0.A04.A0A("SUCCESS", (String) null);
                        } else {
                            1P5 r0 = ly0.A04;
                            r0.A04();
                            if (stringExtra != null) {
                                ly0.A02.A07();
                                0fH.A0S(LY0.class, "Registration error %s", new Object[]{stringExtra});
                                if (1BJ.A00(850).equals(stringExtra)) {
                                    0fH.A0A(LY0.class, "Service not available, checking connectivity and retrying.");
                                    NetworkInfo activeNetworkInfo = ((ConnectivityManager) ly0.A00.getSystemService("connectivity")).getActiveNetworkInfo();
                                    if (activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting()) {
                                        r0.A01.A01((PendingIntent) LY0.A00(ly0, 0S2.A0C).getParcelableExtra(ErrorReportingConstants.APP_NAME_KEY), r0.A02.A00);
                                    }
                                } else {
                                    0fH.A07(LY0.class, stringExtra, (AnonymousClass000.A00(ActionId.FORMAT_ERROR).equals(stringExtra) || "INVALID_PARAMETERS".equals(stringExtra)) ? "Registration failed. reason: %s" : "Registration failed with Unknown error. errorId:%s");
                                }
                                r0.A09(stringExtra.toLowerCase(Locale.US), (String) null);
                            } else {
                                C1Oc c1Oc = ly0.A02;
                                c1Oc.A0A(stringExtra2, c1Oc.A00());
                                r0.A09("SUCCESS", (String) null);
                                r0.A05();
                                ly0.A03.A07(A0F, ly0.A01, 1OZ.A07);
                            }
                        }
                    } else if ("com.nokia.pushnotifications.intent.RECEIVE".equals(intent.getAction())) {
                        0fH.A0A(NNAService.class, "Received handleMessage");
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            C00i c00i = this.A01;
                            c00i.getClass();
                            1Ql A0V = 1BL.A0V(c00i);
                            1G2 r02 = ((1Og) this.A03).A06;
                            C00i c00i2 = this.A00;
                            c00i2.getClass();
                            A0V.CaH(r02, 1BL.A08(c00i2));
                            A0V.commit();
                            String string = extras.getString("notification");
                            if (string != null) {
                                C00i c00i3 = this.A01;
                                c00i3.getClass();
                                1Ql A0V2 = 1BL.A0V(c00i3);
                                C00i c00i4 = this.A00;
                                c00i4.getClass();
                                A0V2.CaH(r02, 1BL.A08(c00i4));
                                A0V2.commit();
                                PushInfraMetaData A01 = PushInfraMetaData.Companion.A01(intent);
                                C3r6 c3r6 = this.A02;
                                4rH r03 = 4rH.A0F;
                                4YV.A1N(A0F, A01);
                                c3r6.A01(this, A0F, r03, A01, null, string, null, null, null);
                            } else {
                                0fH.A0B(NNAService.class, "NNA payload missing or null");
                            }
                        }
                    }
                    this.A05.A00.A00();
                    i = 1004683295;
                    0FI.A0A(i, A04);
                }
            } catch (Throwable th) {
                this.A05.A00.A00();
                0FI.A0A(-1586814791, A04);
                throw th;
            }
        }
        this.A05.A00.A00();
        i = 1077456408;
        0FI.A0A(i, A04);
    }
}
