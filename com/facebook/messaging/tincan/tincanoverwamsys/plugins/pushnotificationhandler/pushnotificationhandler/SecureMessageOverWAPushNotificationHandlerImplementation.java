package com.facebook.messaging.tincan.tincanoverwamsys.plugins.pushnotificationhandler.pushnotificationhandler;

import X.1BY;
import X.1Bi;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1De;
import X.1ED;
import X.1EZ;
import X.1Fw;
import X.1JU;
import X.1Kd;
import X.1Lm;
import X.1P8;
import X.1PB;
import X.2yD;
import X.C00i;
import X.C00m;
import X.C1yw;
import X.C25e;
import X.GQu;
import android.util.Pair;
import com.facebook.auth.usersession.FbUserSession;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: SecureMessageOverWAPushNotificationHandlerImplementation.class */
public final class SecureMessageOverWAPushNotificationHandlerImplementation {
    public final 1De A01;
    public final 1Br A03;
    public final 1Br A02 = 1Bq.A00(16385);
    public final C00i A00 = 1Bq.A00(66427);
    public final 1PB A04 = ((1P8) 1Bi.A03(16626)).A00("notification_instance");

    public SecureMessageOverWAPushNotificationHandlerImplementation(1De r302) {
        this.A01 = r302;
        this.A03 = 1Bu.A03(r302.A00, 16428);
    }

    public static final C25e A00(SecureMessageOverWAPushNotificationHandlerImplementation secureMessageOverWAPushNotificationHandlerImplementation) {
        FbUserSession A04 = 1Fw.A04((1EZ) secureMessageOverWAPushNotificationHandlerImplementation.A03.A00.get());
        1BY r0 = secureMessageOverWAPushNotificationHandlerImplementation.A01.A00;
        ((C1yw) 1Lm.A07(A04, r0, 16888)).AQX();
        return (C25e) 1Lm.A03(A04, r0, 16892).get();
    }

    public static final void A01(SecureMessageOverWAPushNotificationHandlerImplementation secureMessageOverWAPushNotificationHandlerImplementation, final C00m c00m) {
        if (!((2yD) secureMessageOverWAPushNotificationHandlerImplementation.A02.A00.get()).AZk(36317006506765211L)) {
            c00m.invoke();
            return;
        }
        final int i = 0;
        1Kd.A0F(new GQu(), ((1ED) 1Bi.A03(16431)).D3C(new Callable(c00m, i) { // from class: X.4Xc
            public final int A00;
            public final Object A01;

            {
                this.A00 = i;
                this.A01 = c00m;
            }

            @Override // java.util.concurrent.Callable
            public /* bridge */ /* synthetic */ Object call() {
                boolean z;
                boolean z2;
                switch (this.A00) {
                    case 0:
                        ((C00m) this.A01).invoke();
                        return 04S.A00;
                    case 1:
                        41N.A01((41N) this.A01);
                        return null;
                    default:
                        41N r0 = (41N) this.A01;
                        try {
                            long A09 = 1BL.A09(r0.A02);
                            synchronized (41N.A0H) {
                                if (A09 - 41N.A07 > 41N.A06) {
                                    41N.A07 = A09;
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            }
                            if (z2 && 41N.A08 != null) {
                                UUID A00 = C04I.A00();
                                StringBuilder A0k = AnonymousClass001.A0k();
                                A0k.append(A00);
                                A0k.append("-");
                                String A0d = AnonymousClass001.A0d(41N.A09, A0k);
                                StringBuilder A0k2 = AnonymousClass001.A0k();
                                A0k2.append(A00);
                                A0k2.append("-");
                                String A0d2 = AnonymousClass001.A0d(41N.A0A, A0k2);
                                C00i c00i = r0.A01;
                                Future submit = ((ExecutorService) c00i.get()).submit(new Ltd(A0d, r0, 4));
                                Future submit2 = ((ExecutorService) c00i.get()).submit(new Ltd(A0d2, r0, 4));
                                TimeUnit timeUnit = TimeUnit.SECONDS;
                                long j = 5;
                                Pair pair = (Pair) submit.get(j, timeUnit);
                                Pair pair2 = (Pair) submit2.get(j, timeUnit);
                                C4T2 c4t2 = 41N.A08;
                                String str = (String) pair.first;
                                String str2 = (String) pair.second;
                                String str3 = (String) pair2.first;
                                String str4 = (String) pair2.second;
                                1UG A002 = 1UD.A00(c4t2.A00, 1ZG.A01, "netseer_ipaddr_assoc");
                                if (A002.isSampled()) {
                                    A002.A7R("target_hostname_v4", A0d);
                                    A002.A7R("target_hostname_v6", A0d2);
                                    if (!str.equals("")) {
                                        A002.A7R("client_public_ipv4", str);
                                    }
                                    if (!str2.equals("")) {
                                        A002.A7R("server_ipv4", str2);
                                    }
                                    if (!str3.equals("")) {
                                        A002.A7R("client_public_ipv6", str3);
                                    }
                                    if (!str4.equals("")) {
                                        A002.A7R("server_ipv6", str4);
                                    }
                                    A002.BZL();
                                }
                            }
                            z = true;
                        } catch (InterruptedException | RuntimeException | ExecutionException | TimeoutException unused) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                }
            }
        }), 1JU.A01);
    }
}
