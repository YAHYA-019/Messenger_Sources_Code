package X;

import android.util.Pair;
import com.facebook.mobileconfig.init.MobileConfigApi2LoggerImpl;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3ht, reason: invalid class name */
/* loaded from: 3ht.class */
public final class C3ht implements Runnable {
    public static final String __redex_internal_original_name = "MobileConfigApi2LoggerImpl$1";
    public final /* synthetic */ MobileConfigApi2LoggerImpl A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public C3ht(MobileConfigApi2LoggerImpl mobileConfigApi2LoggerImpl, String str, String str2) {
        this.A00 = mobileConfigApi2LoggerImpl;
        this.A01 = str;
        this.A02 = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        MobileConfigApi2LoggerImpl mobileConfigApi2LoggerImpl = this.A00;
        AtomicBoolean atomicBoolean = mobileConfigApi2LoggerImpl.A03;
        if (atomicBoolean.get()) {
            C00j.A05("MobileConfigApi2LoggerImpl_scheduleLog", 622328475);
            try {
                MobileConfigApi2LoggerImpl.A00(mobileConfigApi2LoggerImpl, this.A01, this.A02);
                C00j.A01(502691439);
                return;
            } catch (Throwable th) {
                C00j.A01(46166411);
                throw th;
            }
        }
        synchronized (mobileConfigApi2LoggerImpl.A01) {
            if (atomicBoolean.get()) {
                C00j.A05("MobileConfigApi2LoggerImpl_scheduleLog", 622328475);
                try {
                    MobileConfigApi2LoggerImpl.A00(mobileConfigApi2LoggerImpl, this.A01, this.A02);
                    C00j.A01(502691439);
                } catch (Throwable th2) {
                    C00j.A01(46166411);
                    throw th2;
                }
            } else {
                mobileConfigApi2LoggerImpl.A02.add(new Pair(this.A01, this.A02));
            }
        }
    }
}
