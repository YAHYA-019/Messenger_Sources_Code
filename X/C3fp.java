package X;

import com.facebook.messaging.presence.plugins.msyswritepath.msyspresenceupdate.MsysPresenceUpdateImplementation;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.mci.PrivacyContextCoding;
import com.facebook.presence.DefaultPresenceManager;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.3fp, reason: invalid class name */
/* loaded from: 3fp.class */
public final class C3fp implements Runnable {
    public static final String __redex_internal_original_name = "DefaultPresenceManager$prefListener$1$1";
    public final /* synthetic */ DefaultPresenceManager A00;

    public C3fp(DefaultPresenceManager defaultPresenceManager) {
        this.A00 = defaultPresenceManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        DefaultPresenceManager defaultPresenceManager = this.A00;
        boolean A07 = ((1X6) 1Br.A0B(defaultPresenceManager.A0T)).A07();
        if (DefaultPresenceManager.A04(defaultPresenceManager).A03()) {
            3L8 A02 = DefaultPresenceManager.A02(defaultPresenceManager);
            I2r i2r = A02.A01;
            if (i2r.A02.A2a) {
                I2r.A00(i2r, A07 ? 0S2.A00 : 0S2.A0C);
            } else {
                PrivacyContext newPrivacyContextNative = PrivacyContextCoding.newPrivacyContextNative(null, "FBLegacyBroker", Long.toString(681066249448173L));
                11T.A0A(newPrivacyContextNative);
                2AV r0 = i2r.A0C;
                String valueOf = String.valueOf(1BM.A03(A07 ? 1 : 0));
                Iai iai = new Iai(4, i2r, A07);
                1Um AQV = r0.mMailboxApiHandleMetaProvider.AQV(0);
                MailboxFutureImpl A0Q = 1BK.A0Q(AQV, iai);
                1Um.A02(AQV, new Iau(A0Q, newPrivacyContextNative, r0, valueOf, A07), A0Q, false);
            }
            ((5Ch) 1Br.A0B(A02.A00.A00)).A05(A07);
        } else {
            1YA r02 = defaultPresenceManager.A0j.A00.A00;
            AtomicInteger atomicInteger = C1Y6.A04;
            int andIncrement = atomicInteger.getAndIncrement();
            1YC r03 = r02.A02;
            r03.A08("com.facebook.presence.plugins.interfaces.presenceupdate.PresenceUpdateInterfaceSpec", "presence.presenceupdate.PresenceUpdateInterfaceSpec", "updatePresenceSetting", andIncrement);
            Exception e = null;
            try {
                if (1YA.A00(r02)) {
                    int andIncrement2 = atomicInteger.getAndIncrement();
                    r03.A0A("com.facebook.messaging.presence.plugins.msyswritepath.msyspresenceupdate.MsysPresenceUpdateImplementation", "messaging.presence.msyswritepath.msyspresenceupdate.MsysPresenceUpdateImplementation", "com.facebook.presence.plugins.interfaces.presenceupdate.PresenceUpdateInterfaceSpec", andIncrement2, "presence.presenceupdate.PresenceUpdateInterfaceSpec", "com.facebook.messaging.presence.plugins.msyswritepath.MsysWritePathKillSwitch", "updatePresenceSetting");
                    try {
                        try {
                            MsysPresenceUpdateImplementation msysPresenceUpdateImplementation = r02.A00;
                            0fH.A0g(Boolean.valueOf(A07), "MsysPresenceUpdateImplementation", "MsysPresenceUpdateImplementation - updatePresenceSetting: isPresenceEnabled = %b");
                            2AV r04 = (2AV) 1Lm.A05(msysPresenceUpdateImplementation.A00, msysPresenceUpdateImplementation.A01, 65963);
                            PrivacyContext newPrivacyContextNative2 = PrivacyContextCoding.newPrivacyContextNative(null, "FBLegacyBroker", Long.toString(681066249448173L));
                            11T.A0A(newPrivacyContextNative2);
                            String valueOf2 = String.valueOf(1BM.A03(A07 ? 1 : 0));
                            Iai iai2 = new Iai(3, msysPresenceUpdateImplementation, A07);
                            1Um AQV2 = r04.mMailboxApiHandleMetaProvider.AQV(0);
                            MailboxFutureImpl A0Q2 = 1BK.A0Q(AQV2, iai2);
                            1Um.A02(AQV2, new Iau(A0Q2, newPrivacyContextNative2, r04, valueOf2, A07), A0Q2, false);
                            r03.A09("messaging.presence.msyswritepath.msyspresenceupdate.MsysPresenceUpdateImplementation", "presence.presenceupdate.PresenceUpdateInterfaceSpec", "updatePresenceSetting", andIncrement2);
                        } catch (Throwable th) {
                            r03.A04(e, "messaging.presence.msyswritepath.msyspresenceupdate.MsysPresenceUpdateImplementation", "presence.presenceupdate.PresenceUpdateInterfaceSpec", "updatePresenceSetting", andIncrement2);
                            throw th;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        throw e;
                    }
                }
                r03.A02((Exception) null, "presence.presenceupdate.PresenceUpdateInterfaceSpec", "updatePresenceSetting", andIncrement);
            } catch (Throwable th2) {
                r03.A02(e, "presence.presenceupdate.PresenceUpdateInterfaceSpec", "updatePresenceSetting", andIncrement);
                throw th2;
            }
        }
        defaultPresenceManager.A03 = Boolean.valueOf(A07);
        if (!DefaultPresenceManager.A04(defaultPresenceManager).A02()) {
            C00i c00i = defaultPresenceManager.A0U.A00;
            if (((C1mg) c00i.get()).A02 || ((C1mg) c00i.get()).A03) {
                if (A07) {
                    DefaultPresenceManager.A09(defaultPresenceManager);
                } else {
                    DefaultPresenceManager.A01(defaultPresenceManager).A00("DefaultPresenceManager", "Scheduling removal of GenericPresenceSubscription (/t_p)", new Object[0]);
                    DefaultPresenceManager.A00(defaultPresenceManager).AAs();
                    ScheduledFuture scheduledFuture = defaultPresenceManager.A04;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        defaultPresenceManager.A04 = null;
                    }
                    defaultPresenceManager.A0p.run();
                    DefaultPresenceManager.A0A(defaultPresenceManager);
                    DefaultPresenceManager.A0L(defaultPresenceManager, true);
                }
            }
        } else if (A07) {
            DefaultPresenceManager.A0G(defaultPresenceManager);
            defaultPresenceManager.A0R();
        } else {
            C00j.A05("DefaultPresenceManager.stopUnifiedPresenceSync", -77930305);
            try {
                if (defaultPresenceManager.A05) {
                    I2r i2r2 = DefaultPresenceManager.A02(defaultPresenceManager).A01;
                    AtomicBoolean atomicBoolean = i2r2.A0E;
                    synchronized (atomicBoolean) {
                        HeL heL = i2r2.A09;
                        Gs9 gs9 = i2r2.A0A;
                        11T.A0F(gs9, 0);
                        C21S.A01(gs9, (1Uj) 1Br.A0B(heL.A00));
                        atomicBoolean.set(false);
                    }
                    i2r2.A00 = null;
                    defaultPresenceManager.A05 = false;
                    i = 856817365;
                } else {
                    i = 17632488;
                }
                C00j.A01(i);
            } catch (Throwable th3) {
                C00j.A01(-613081974);
                throw th3;
            }
        }
        DefaultPresenceManager.A0L(defaultPresenceManager, true);
    }
}
