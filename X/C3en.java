package X;

import android.os.AsyncTask;
import android.os.Build;
import java.util.concurrent.Executor;

/* renamed from: X.3en, reason: invalid class name */
/* loaded from: 3en.class */
public final class C3en implements Runnable {
    public static final String __redex_internal_original_name = "CellDiagnostics$1";
    public final /* synthetic */ 2DH A00;

    public C3en(2DH r302) {
        this.A00 = r302;
    }

    @Override // java.lang.Runnable
    public void run() {
        2DH r0 = this.A00;
        if (r0.A03 == null || AsyncTask.SERIAL_EXECUTOR == null) {
            return;
        }
        1Rv r02 = r0.A0I.A03;
        if (r02.A08("android.permission.READ_PHONE_STATE") && r02.A08("android.permission.ACCESS_FINE_LOCATION")) {
            if (2DH.A05(r0) == null) {
                2DH.A0Z(new C01163q9(r0), r0);
            }
            int i = Build.VERSION.SDK_INT;
            1qC r03 = r0.A03;
            Executor executor = AsyncTask.SERIAL_EXECUTOR;
            C01163q9 A05 = 2DH.A05(r0);
            if (i >= 33) {
                r03.A0I(executor, A05);
            } else {
                r03.A0H(executor, A05);
            }
        }
        if (2DH.A04(r0) == null) {
            2DH.A0Y(new C01173qA(r0), r0);
        }
        1qC r04 = r0.A03;
        Executor executor2 = AsyncTask.SERIAL_EXECUTOR;
        r04.A0H(executor2, 2DH.A04(r0));
        if (r02.A08("android.permission.ACCESS_FINE_LOCATION")) {
            if (2DH.A03(r0) == null) {
                2DH.A0X(new C01183qB(r0), r0);
            }
            int i2 = Build.VERSION.SDK_INT;
            1qC r05 = r0.A03;
            if (i2 >= 33) {
                r05.A0I(executor2, 2DH.A03(r0));
            } else {
                r05.A0H(executor2, 2DH.A03(r0));
            }
        }
        if (2DH.A02(r0) == null) {
            2DH.A0W(new 3qC(r0), r0);
        }
        r0.A03.A0H(executor2, 2DH.A02(r0));
    }
}
