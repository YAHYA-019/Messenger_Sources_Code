package X;

import com.mapbox.mapboxsdk.location.LocationComponentOptions;
import java.lang.Thread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: I8c.class */
public class I8c {
    public final JGu A00;

    public I8c() {
        this.A00 = null;
    }

    public I8c(JGu jGu) {
        this.A00 = jGu;
    }

    public static ThreadPoolExecutor A00(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, int i, boolean z) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, LocationComponentOptions.STALE_STATE_DELAY_MS, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new J5a(str, uncaughtExceptionHandler, z));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public ExecutorService A01(Integer num, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        if (uncaughtExceptionHandler == null) {
            uncaughtExceptionHandler = new J4a(this.A00);
        }
        switch (num.intValue()) {
            case 0:
            case 1:
            case 7:
                return A00(HLb.A00(num), uncaughtExceptionHandler, 2, false);
            case 2:
            case 3:
            case 4:
            case 14:
            default:
                throw 0Pz.A05("unknown type ", HLb.A00(num));
            case 5:
            case 6:
            case 13:
            case 15:
                return A00(HLb.A00(num), uncaughtExceptionHandler, 1, false);
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                return A00(HLb.A00(num), uncaughtExceptionHandler, 4, true);
        }
    }

    public ThreadPoolExecutor A02(Integer num, int i) {
        return A00(HLb.A00(num), new J4a(this.A00), i, false);
    }
}
