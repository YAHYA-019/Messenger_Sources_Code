package androidx.work.impl.workers;

import X.11T;
import X.1BL;
import X.4IS;
import X.8E8;
import X.AnonymousClass001;
import X.AnonymousClass996;
import X.C4Jt;
import X.C4Kf;
import X.C4Ks;
import X.C4Ky;
import X.Ka4;
import android.content.Context;
import android.os.Build;
import androidx.work.WorkerParameters;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: ConstraintTrackingWorker.class */
public final class ConstraintTrackingWorker extends C4Ky implements C4Jt {
    public C4Ky A00;
    public final WorkerParameters A01;
    public final C4Ks A02;
    public final Object A03;
    public volatile boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, X.4Ks] */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        1BL.A1F(context, workerParameters);
        this.A01 = workerParameters;
        this.A03 = AnonymousClass001.A0R();
        this.A02 = new Object();
    }

    @Override // X.C4Jt
    public void Bqz(AnonymousClass996 anonymousClass996, C4Kf c4Kf) {
        boolean A1W = 1BL.A1W(c4Kf, anonymousClass996);
        4IS.A00().A02(Ka4.A00, AnonymousClass001.A0Z(c4Kf, "Constraints changed for ", AnonymousClass001.A0k()));
        if (anonymousClass996 instanceof 8E8) {
            synchronized (this.A03) {
                this.A04 = A1W;
            }
        }
    }

    @Override // X.C4Ky
    public void onStopped() {
        C4Ky c4Ky = this.A00;
        if (c4Ky == null || c4Ky.isStopped()) {
            return;
        }
        c4Ky.stop(Build.VERSION.SDK_INT >= 31 ? getStopReason() : 0);
    }

    @Override // X.C4Ky
    public ListenableFuture startWork() {
        this.mWorkerParams.A0A.execute(new Runnable() { // from class: X.Lk5
            public static final String __redex_internal_original_name = "ConstraintTrackingWorker$$ExternalSyntheticLambda0";

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v65, types: [java.util.concurrent.Executor, java.lang.Object] */
            @Override // java.lang.Runnable
            public final void run() {
                Object obj;
                Object obj2;
                final ConstraintTrackingWorker constraintTrackingWorker = ConstraintTrackingWorker.this;
                C4Ks c4Ks = constraintTrackingWorker.A02;
                if (c4Ks.isCancelled()) {
                    return;
                }
                String A02 = constraintTrackingWorker.mWorkerParams.A02.A02("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                4IS A00 = 4IS.A00();
                11T.A0A(A00);
                if (A02 == null || A02.length() == 0) {
                    android.util.Log.e(Ka4.A00, "No worker to delegate to.");
                } else {
                    C4Ky A01 = constraintTrackingWorker.mWorkerParams.A05.A01(constraintTrackingWorker.mAppContext, constraintTrackingWorker.A01, A02);
                    constraintTrackingWorker.A00 = A01;
                    if (A01 == null) {
                        A00.A02(Ka4.A00, "No worker to delegate to.");
                    } else {
                        4IU A002 = 4IU.A00(constraintTrackingWorker.mAppContext);
                        11T.A0A(A002);
                        C4Kf BKy = A002.A04.A0E().BKy(11T.A02(constraintTrackingWorker.mWorkerParams.A09));
                        if (BKy != null) {
                            C4Ja c4Ja = A002.A09;
                            11T.A0A(c4Ja);
                            C4Jw c4Jw = new C4Jw(c4Ja);
                            2Zs r0 = ((C4Ih) A002.A06).A03;
                            11T.A0A(r0);
                            final C2a0 A003 = KxE.A00(constraintTrackingWorker, c4Jw, BKy, r0);
                            c4Ks.addListener(new Runnable() { // from class: X.Lk6
                                public static final String __redex_internal_original_name = "ConstraintTrackingWorker$$ExternalSyntheticLambda1";

                                @Override // java.lang.Runnable
                                public final void run() {
                                    C2a2 c2a2 = C2a2.this;
                                    11T.A0F(c2a2, 0);
                                    c2a2.AE0(null);
                                }
                            }, new Object());
                            boolean A004 = c4Jw.A00(BKy);
                            String str = Ka4.A00;
                            if (!A004) {
                                A00.A02(str, 0Pz.A0j("Constraints not met for delegate ", A02, ". Requesting retry."));
                                obj = new Object();
                                c4Ks.A06(obj);
                            }
                            A00.A02(str, 0Pz.A0W("Constraints met for delegate ", A02));
                            try {
                                C4Ky c4Ky = constraintTrackingWorker.A00;
                                11T.A0D(c4Ky);
                                final ListenableFuture startWork = c4Ky.startWork();
                                11T.A0A(startWork);
                                startWork.addListener(new Runnable() { // from class: X.Lmk
                                    public static final String __redex_internal_original_name = "ConstraintTrackingWorker$$ExternalSyntheticLambda2";

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ConstraintTrackingWorker constraintTrackingWorker2 = ConstraintTrackingWorker.this;
                                        ListenableFuture listenableFuture = startWork;
                                        synchronized (constraintTrackingWorker2.A03) {
                                            if (constraintTrackingWorker2.A04) {
                                                C4Ks c4Ks2 = constraintTrackingWorker2.A02;
                                                11T.A09(c4Ks2);
                                                c4Ks2.A06(new Object());
                                            } else {
                                                constraintTrackingWorker2.A02.A05(listenableFuture);
                                            }
                                        }
                                    }
                                }, constraintTrackingWorker.mWorkerParams.A0A);
                                return;
                            } catch (Throwable th) {
                                String A0j = 0Pz.A0j("Delegated worker ", A02, " threw exception in startWork.");
                                if (A00.A00 <= 3) {
                                    android.util.Log.d(str, A0j, th);
                                }
                                synchronized (constraintTrackingWorker.A03) {
                                    if (constraintTrackingWorker.A04) {
                                        A00.A02(str, "Constraints were unmet, Retrying.");
                                        new Object();
                                    } else {
                                        new C4Kq();
                                    }
                                    c4Ks.A06(obj2);
                                    return;
                                }
                            }
                        }
                    }
                }
                obj = new C4Kq();
                c4Ks.A06(obj);
            }
        });
        C4Ks c4Ks = this.A02;
        11T.A09(c4Ks);
        return c4Ks;
    }
}
