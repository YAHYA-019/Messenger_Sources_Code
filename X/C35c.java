package X;

import android.database.SQLException;
import com.facebook.fbservice.service.ServiceException;
import java.util.concurrent.CancellationException;

/* renamed from: X.35c, reason: invalid class name */
/* loaded from: 35c.class */
public final class C35c extends 1T3 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C35c(2fC r302, 2Ur r303, int i) {
        this.A00 = i;
        this.A01 = r303;
        this.A02 = r302;
    }

    public void A03(Throwable th) {
        2Iq r308;
        String str;
        int i = this.A00;
        ServiceException A00 = ServiceException.A00(th);
        2Ur r0 = (2Ur) this.A01;
        if (i != 0) {
            r0.A01 = null;
            2fC r02 = (2fC) this.A02;
            2Ur.A03(new 2fP(A00, r02.A04, true), r02, r0);
            1BK.A0U(r0.A0J).markerEnd(5505136, r0.A00, (short) 3);
            1Uy r03 = (1Uy) r0.A0I.get();
            r03.A05.execute(new C3ga(r03, (short) 3));
            2iN r04 = (2iN) r0.A0K.get();
            Throwable th2 = A00.result.errorThrowable;
            boolean z = false;
            if (th2 != null) {
                int i2 = 0;
                while (true) {
                    if (!SQLException.class.isInstance(th2)) {
                        th2 = th2.getCause();
                        if (th2 == null) {
                            break;
                        }
                        int i3 = i2 + 1;
                        if (i2 >= 5) {
                            break;
                        } else {
                            i2 = i3;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
            }
            C00i c00i = r04.A00.A00;
            ((2Iq) c00i.get()).A01("android_messenger_thread_list_load_more_threads_failure");
            if (!z) {
                return;
            }
            r308 = (2Iq) c00i.get();
            str = "android_messenger_thread_list_load_more_threads_db_failure";
        } else {
            r0.A02 = null;
            2fC r05 = r0.A08;
            r0.A08 = null;
            2fC r06 = (2fC) this.A02;
            0fH.A0j("ThreadListLoader", "onFetchThreadsError");
            2Ur.A03(new 2fP(A00, r06.A04, r06.A06), r06, r0);
            if (r05 != null) {
                0fH.A0j("ThreadListLoader", "start load thread list for delayedForceUpdate after error.");
                2Ur.A06(r05, r0, "onFetchThreadsError");
            }
            2iN r07 = (2iN) r0.A0K.get();
            Throwable th3 = A00.result.errorThrowable;
            boolean z2 = false;
            if (th3 != null) {
                int i4 = 0;
                while (true) {
                    if (!SQLException.class.isInstance(th3)) {
                        th3 = th3.getCause();
                        if (th3 == null) {
                            break;
                        }
                        int i5 = i4 + 1;
                        if (i4 >= 5) {
                            break;
                        } else {
                            i4 = i5;
                        }
                    } else {
                        z2 = true;
                        break;
                    }
                }
            }
            C00i c00i2 = r07.A00.A00;
            ((2Iq) c00i2.get()).A01("android_messenger_thread_list_load_threads_failure");
            if (!z2) {
                return;
            }
            r308 = (2Iq) c00i2.get();
            str = "android_messenger_thread_list_load_threads_db_failure";
        }
        r308.A01(str);
    }

    public void A04(CancellationException cancellationException) {
        int i = this.A00;
        2Ur r0 = (2Ur) this.A01;
        if (i != 0) {
            r0.A01 = null;
            1Uy r02 = (1Uy) r0.A0I.get();
            r02.A05.execute(new C3ga(r02, (short) 4));
        } else {
            r0.A02 = null;
        }
        r0.A06.Bmm(cancellationException);
    }
}
