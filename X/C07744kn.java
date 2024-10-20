package X;

import com.facebook.msys.mca.MailboxCallback;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;

/* renamed from: X.4kn, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4kn.class */
public final class C07744kn implements MailboxCallback {
    public final int A00;
    public final int A01;
    public final C07574k9 A02;
    public final WeakReference A03;
    public final ExecutorService A04;

    public C07744kn(C07484k0 c07484k0, C07574k9 c07574k9, ExecutorService executorService, int i, int i2) {
        this.A04 = executorService;
        this.A02 = c07574k9;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = new WeakReference(c07484k0);
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        final C07764kq c07764kq = (C07764kq) obj;
        11T.A0F(c07764kq, 0);
        this.A04.execute(new Runnable(this) { // from class: X.4ky
            public static final String __redex_internal_original_name = "MailboxThreadSourceImpl$ThreadViewObserverResultCallback$onCompletion$1";
            public final /* synthetic */ C07744kn A00;

            {
                this.A00 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C07764kq c07764kq2;
                C07764kq c07764kq3 = c07764kq;
                C00j.A05(0Pz.A0O("MailboxThreadSource#onComplete_Runnable#run [result: ", ']', c07764kq3.hashCode()), 981365302);
                try {
                    C07744kn c07744kn = this.A00;
                    C07574k9 c07574k9 = c07744kn.A02;
                    int i = c07744kn.A00;
                    ((4kI) c07574k9.A04.A00.get()).A01(c07744kn.A01, i, "tv_result_callback_onCompletion");
                    0fH.A0g(Integer.valueOf(i), "MailboxThreadSource", "onThreadViewObserverResultCallbackCompletion, %d");
                    C07484k0 c07484k0 = (C07484k0) c07744kn.A03.get();
                    if (c07484k0 != null) {
                        synchronized (c07484k0) {
                            c07764kq2 = c07484k0.A02;
                            c07484k0.A02 = c07764kq3;
                        }
                        if (c07764kq2 != null) {
                            c07764kq2.D5r();
                        }
                        C07574k9 c07574k92 = c07484k0.A08;
                        C07594kL c07594kL = c07484k0.A0A;
                        int i2 = c07594kL.A00;
                        ((4kI) c07574k92.A04.A00.get()).A01(c07594kL.A01, i2, "set_data_observer_callback");
                        0fH.A0g(Integer.valueOf(i2), "MailboxThreadSource", "onSetDataObserverCallback, %d");
                        if (c07764kq2 != null) {
                            ((1Lr) 1Br.A0B(c07484k0.A05)).A00(c07764kq2, "ThreadViewDataObserver");
                        }
                        if (!c07484k0.A0C.get() && ((1CO) c07484k0.A06.A00.get()).AZk(36324681611104161L)) {
                            C07484k0.A00(c07484k0);
                        }
                    } else {
                        11T.A0A(c07764kq3.D5r());
                    }
                    C00j.A01(985288525);
                } catch (Throwable th) {
                    C00j.A01(1551786242);
                    throw th;
                }
            }
        });
    }
}
