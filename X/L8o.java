package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import com.facebook.acra.constants.ActionId;
import com.facebook.common.hiddenapis2.ApiExemption;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: L8o.class */
public final class L8o {
    public static L8o A06;
    public AnonymousClass046 A00;
    public Thread A01;
    public JlY A02;
    public final Object A03 = AnonymousClass001.A0R();
    public final List A04;
    public final List A05;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, X.MIE] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, X.MIE] */
    public L8o() {
        ArrayList A0s = AnonymousClass001.A0s();
        this.A04 = A0s;
        this.A05 = AnonymousClass001.A0s();
        ApiExemption.enableUnsafeExemption();
        ApiExemption.removeRestriction_DO_NOT_USE();
        HandlerThread A0E = GOo.A0E("watchdog.monitor", 0);
        A0E.start();
        String str = Lrh.__redex_internal_original_name;
        JlY jlY = new JlY(A0E.getLooper());
        this.A02 = jlY;
        A0s.add(jlY);
        A03(Looper.getMainLooper());
        A01(new Object());
        A01(new LTY());
        A01(new Object());
    }

    public static L8o A00() {
        L8o l8o = A06;
        if (l8o == null) {
            l8o = new L8o();
            A06 = l8o;
        }
        return l8o;
    }

    private void A01(MIE mie) {
        synchronized (this.A03) {
            this.A02.A01.add(mie);
        }
    }

    public void A02(Handler handler) {
        synchronized (this.A03) {
            if (!Lrh.A07.contains(handler.getLooper())) {
                this.A04.add(new Lrh(handler));
            }
        }
    }

    public void A03(Looper looper) {
        synchronized (this.A03) {
            if (!Lrh.A07.contains(looper)) {
                this.A04.add(new Lrh(new Handler(looper)));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.concurrent.ExecutorService] */
    public void A04(Object obj, String str) {
        ThreadPoolExecutor threadPoolExecutor;
        Object obj2 = obj;
        if (!(obj instanceof ThreadPoolExecutor)) {
            Field[] declaredFields = obj.getClass().getDeclaredFields();
            int length = declaredFields.length;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    return;
                }
                Field field = declaredFields[i2];
                if (ThreadPoolExecutor.class.isAssignableFrom(field.getType())) {
                    field.setAccessible(true);
                    try {
                        threadPoolExecutor = (ThreadPoolExecutor) field.get(obj);
                        break;
                    } catch (Throwable unused) {
                    }
                }
                if (Executor.class.isAssignableFrom(field.getType())) {
                    field.setAccessible(true);
                    try {
                        obj2 = field.get(obj);
                        if (obj2 != null && (obj2 instanceof ThreadPoolExecutor)) {
                            break;
                        }
                    } catch (Throwable unused2) {
                    }
                }
                i = i2 + 1;
            }
        }
        threadPoolExecutor = (ThreadPoolExecutor) obj2;
        if (threadPoolExecutor != null) {
            synchronized (this.A03) {
                this.A04.add(new Lrg(str, obj instanceof ExecutorService ? (ExecutorService) obj : threadPoolExecutor, threadPoolExecutor));
            }
        }
    }

    public void A05(String str, Throwable th) {
        AnonymousClass046 anonymousClass046 = this.A00;
        if (anonymousClass046 != null) {
            AnonymousClass047 ACv = anonymousClass046.ACv(AnonymousClass001.A0K(), str, 157812016);
            ACv.Cmr(th);
            ACv.A8L(AnonymousClass000.A00(ActionId.VIDEO_REQUESTED_PLAYING), C0ft.A09());
            ACv.A8J("time_since_app_start", SystemClock.uptimeMillis() - C0ft.A00());
            ACv.A8K("asl_session_id", C0ft.A02());
            ACv.report();
        }
    }
}
