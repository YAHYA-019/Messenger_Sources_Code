package com.facebook.messaging.advancedcrypto.plugins.core.privacysettings.unseencount;

import X.0BY;
import X.0Pz;
import X.0fH;
import X.11T;
import X.1Br;
import X.1Bu;
import X.1Lm;
import X.20U;
import X.4VO;
import X.5dQ;
import X.C04I;
import X.C0Bx;
import X.C1qM;
import X.C4I3;
import X.C5x2;
import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.advancedcrypto.plugins.core.privacysettings.unseencount.SecurityAlertsUnseenCountProvider;
import com.facebook.messaging.messengerprefs.advancedcrypto.securityalerts.SecurityAlertsActivity;
import java.util.Map;
import java.util.Set;

/* loaded from: SecurityAlertsUnseenCountProvider.class */
public final class SecurityAlertsUnseenCountProvider {
    public int A00;
    public boolean A01;
    public final Context A02;
    public final Observer A03;
    public final FbUserSession A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final C1qM A09;
    public final String A0A;
    public final C4I3 A0B;

    public SecurityAlertsUnseenCountProvider(Context context, FbUserSession fbUserSession, C4I3 c4i3) {
        11T.A0F(context, 1);
        11T.A0F(c4i3, 2);
        11T.A0F(fbUserSession, 3);
        this.A02 = context;
        this.A0B = c4i3;
        this.A04 = fbUserSession;
        Class<?> cls = getClass();
        Map map = 0BY.A03;
        11T.A0F(cls, 1);
        this.A0A = C0Bx.A01(cls);
        this.A08 = 1Bu.A00(66576);
        this.A07 = 1Lm.A00(context, fbUserSession, 65848);
        this.A05 = 1Bu.A01(context, 116343);
        this.A03 = new 4VO(this, 0);
        this.A06 = 1Bu.A00(66548);
        this.A09 = new C1qM() { // from class: X.4I8
            @Override // X.C1qM
            public void CNu(Set set) {
                11T.A0F(set, 0);
                if (set.contains("SecureMessageFetchUnreadPeerDeviceChangeAlert")) {
                    SecurityAlertsUnseenCountProvider securityAlertsUnseenCountProvider = SecurityAlertsUnseenCountProvider.this;
                    0fH.A0j(securityAlertsUnseenCountProvider.A0A, "fetching alert count on stored procedure change");
                    ((5dQ) 1Br.A0B(securityAlertsUnseenCountProvider.A07)).A00(securityAlertsUnseenCountProvider.A04);
                }
            }
        };
    }

    public static final int A00(SecurityAlertsUnseenCountProvider securityAlertsUnseenCountProvider) {
        int i = 0;
        if (((20U) securityAlertsUnseenCountProvider.A08.A00.get()).A03() && securityAlertsUnseenCountProvider.A01) {
            LiveData liveData = (LiveData) ((5dQ) securityAlertsUnseenCountProvider.A07.A00.get()).A06.getValue();
            11T.A0I(liveData, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Int>");
            Number number = (Number) liveData.getValue();
            if (number == null) {
                number = 0;
            }
            int intValue = number.intValue();
            i = 100;
            if (intValue <= 100) {
                if (intValue > 0) {
                    C5x2.A00(SecurityAlertsActivity.A01, Long.valueOf(intValue), C04I.A00().toString(), 5);
                }
                return intValue;
            }
        }
        return i;
    }

    public static final void A01(SecurityAlertsUnseenCountProvider securityAlertsUnseenCountProvider) {
        int A00 = A00(securityAlertsUnseenCountProvider);
        int i = securityAlertsUnseenCountProvider.A00;
        if (i != A00) {
            0fH.A0m(securityAlertsUnseenCountProvider.A0A, 0Pz.A0C(i, A00, "oldValue=", ", newValue="));
            securityAlertsUnseenCountProvider.A00 = A00;
            securityAlertsUnseenCountProvider.A0B.CSO();
        }
    }
}
