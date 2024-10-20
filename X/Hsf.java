package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: Hsf.class */
public final class Hsf {
    public final 1De A00;
    public final 1Br A01;
    public final HbF A02;
    public final 5VC A03;
    public final 5V4 A04;
    public final ExecutorService A05;
    public final C5V1 A06;

    public Hsf(1De r302) {
        this.A00 = r302;
        1BY r0 = r302.A00;
        this.A05 = (ExecutorService) 1Bn.A0E((Context) null, r0, 16478);
        this.A01 = 1Bq.A00(16449);
        C5V1 c5v1 = (C5V1) 1Bi.A03(49755);
        this.A06 = c5v1;
        this.A04 = c5v1.A00();
        this.A02 = (HbF) 1Bn.A0E((Context) null, r0, 114816);
        this.A03 = new IfR();
    }

    public void A00(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 0);
        GOp.A1G(this.A01).submit(new Iy9(fbUserSession, this));
    }

    public final void A01(FbUserSession fbUserSession, 5VC r303) {
        IllegalStateException th;
        synchronized (this) {
            11T.A0F(r303, 0);
            5V4 r0 = this.A04;
            Integer Ak0 = r0.Ak0();
            if (Ak0 == null) {
                Ak0 = 0S2.A00;
            }
            r303.Bw4(fbUserSession, Ak0);
            if (Ak0 == 0S2.A0C || Ak0 == 0S2.A01) {
                r303.Bw2(fbUserSession);
            } else {
                Context A0A = 7zM.A0A();
                I6E.A00(HCL.A0X, null, null, null);
                try {
                    1BY r02 = this.A00.A00;
                    if (AnonymousClass001.A1V(1Bn.A0E((Context) null, r02, 68219))) {
                        HbF hbF = this.A02;
                        1BY r03 = hbF.A00.A00;
                        ((1Uj) 1Lo.A04((Context) null, fbUserSession, r03, 16686)).A06(Ibt.A00);
                        hbF.A01.execute(new IrB(1Bu.A03(r03, 131159)));
                        I8S i8s = (I8S) 1Lo.A04((Context) null, fbUserSession, r02, 114864);
                        if (!i8s.A01) {
                            i8s.A01 = true;
                            GOn.A1U(i8s.A05, GOp.A0O(i8s.A02));
                            GOp.A0w(i8s.A04).A7G(i8s.A07);
                        }
                        C03933zc c03933zc = (C03933zc) 1Lo.A04((Context) null, fbUserSession, r02, 81979);
                        synchronized (c03933zc) {
                            try {
                                if (!c03933zc.A05) {
                                    GOn.A1U(c03933zc.A09, GOp.A0O(c03933zc.A06));
                                    c03933zc.A05 = true;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        I7f i7f = (I7f) 1Lo.A04((Context) null, fbUserSession, r02, 114796);
                        synchronized (i7f) {
                            try {
                                if (!i7f.A03) {
                                    GOn.A1U(i7f.A08, GOp.A0O(i7f.A04));
                                    i7f.A03 = true;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                        QuickPerformanceLogger qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance();
                        I7z.A00 = qPLInstance;
                        if (qPLInstance != null) {
                            qPLInstance.markerStart(805185511);
                        }
                        if (this.A06.A01) {
                            GOn.A1W(4zI.A03, "RtcInitializer", "Using Async Engine init flow.");
                            ((GyC) 1Lo.A04((Context) null, fbUserSession, r02, 83904)).A03.triggerEarlyConnection(false);
                            1Kd.A0E(new Inh(12, r303, this, fbUserSession), r0.BP2(fbUserSession, (JDH) null, (IlE) 1Bi.A03(115283), new Fvl(fbUserSession, A0A, 1), "RtcInitializer.init", true));
                        } else {
                            ((GyC) 1Lo.A04((Context) null, fbUserSession, r02, 83904)).A03.triggerEarlyConnection(false);
                            IlE ilE = (IlE) 1Bi.A03(115283);
                            Future submit = this.A05.submit((Callable) new J5V(fbUserSession, A0A, 34));
                            11T.A0A(submit);
                            Object obj = submit.get();
                            11T.A0A(obj);
                            r0.BP1(fbUserSession, (JDH) null, (IRF) obj, ilE, "RtcInitializer.init", true);
                            r303.Bw2(fbUserSession);
                            I6E.A00(HCL.A0V, null, null, null);
                        }
                    } else {
                        th = AnonymousClass001.A0N("trying to init RTC engine while audio call is disabled");
                    }
                    throw th;
                } catch (J6t | IllegalStateException | InterruptedException | NullPointerException | ExecutionException e) {
                    r303.Bw3(fbUserSession, e);
                    I6E.A00(HCL.A0W, null, null, 1BK.A1D("exception", e.toString()));
                    4zI.A03.A04("RtcInitializer", "RTC init failed", e, new Object[0]);
                }
            }
        }
    }
}
