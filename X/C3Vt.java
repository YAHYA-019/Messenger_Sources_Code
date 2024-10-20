package X;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3Vt, reason: invalid class name */
/* loaded from: 3Vt.class */
public final class C3Vt implements C01s {
    public static C01s A00;
    public static final C3Vt A01 = new Object();

    public static final C01s A00() {
        C01s c01s = A00;
        if (c01s == null) {
            synchronized (RCz.class) {
                if (RCz.A00 == null) {
                    RCz.A00 = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, (BlockingQueue<Runnable>) new LinkedBlockingQueue(), (ThreadFactory) new SFZ());
                }
            }
            c01s = new C01r(RCz.A00);
            A00 = c01s;
        }
        if (c01s != null) {
            return c01s;
        }
        11T.A0L("_reporter");
        throw 0Q8.createAndThrow();
    }

    public static final void A01(QqJ qqJ, String str, String str2, Throwable th) {
        C01s A002 = A00();
        C0c4 c0c4 = qqJ.fbErrorReportImpact;
        if (c0c4 == null) {
            c0c4 = C0c4.LOGGING;
        }
        A002.Cfy(c0c4, str, str2, th);
    }

    @Override // X.C01s
    public void Cfx(C0c4 c0c4, String str, String str2) {
        11T.A0G(c0c4, 0, str2);
        A00().Cfx(c0c4, str, str2);
    }

    @Override // X.C01s
    public void Cfy(C0c4 c0c4, String str, String str2, Throwable th) {
        11T.A0H(c0c4, str);
        11T.A0F(str2, 2);
        A00().Cfy(c0c4, str, str2, th);
    }

    @Override // X.C01s
    public void CgN(Throwable th) {
        A00().CgN(th);
    }

    @Override // X.C01s
    public void D0u(0BR r302) {
        11T.A0F(r302, 0);
        A00().D0u(r302);
    }

    @Override // X.C01s
    public void D0v(String str, String str2) {
        11T.A0H(str, str2);
        A00().D0v(str, str2);
    }

    @Override // X.C01s
    public void D0w(String str, String str2, int i) {
        11T.A0H(str, str2);
        A00().D0w(str, str2, i);
    }

    @Override // X.C01s
    public void D0x(String str, Throwable th, int i) {
        11T.A0F(str, 0);
        A00().D0x(str, th, 1);
    }

    @Override // X.C01s
    public void D0y(String str, String str2, int i, Throwable th) {
        11T.A0H(str, str2);
        A00().D0y(str, str2, i, th);
    }

    @Override // X.C01s
    public void D0z(0BR r302) {
        A00().D0z(r302);
    }

    @Override // X.C01s
    public void D11(String str, String str2) {
        11T.A0H(str, str2);
        A00().D11(str, str2);
    }

    @Override // X.C01s
    public void D12(String str, String str2, Throwable th) {
        11T.A0H(str, str2);
        A00().D12(str, str2, th);
    }

    @Override // X.C01s
    public void D13(String str, Throwable th) {
        11T.A0F(str, 0);
        A00().D13(str, th);
    }

    @Override // X.C01s
    public void softReport(String str, String str2, Throwable th) {
        11T.A0H(str, str2);
        A00().softReport(str, str2, th);
    }

    @Override // X.C01s
    public void softReport(String str, Throwable th) {
        11T.A0F(str, 0);
        A00().softReport(str, th);
    }
}
