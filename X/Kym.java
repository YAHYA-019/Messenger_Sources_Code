package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: Kym.class */
public abstract class Kym {
    public static final C0A9 A00 = new C0A9(16);
    public static final 0QO A01;
    public static final Object A02;
    public static final ExecutorService A03;

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.Lts, java.util.concurrent.ThreadFactory] */
    static {
        ?? obj = new Object();
        obj.A01 = "fonts-androidx";
        obj.A00 = 10;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), (ThreadFactory) obj);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        A03 = threadPoolExecutor;
        A02 = AnonymousClass001.A0R();
        A01 = new 0QO(0);
    }

    public static Kze A00(Context context, KqD kqD, String str, int i) {
        int length;
        C0A9 c0a9 = A00;
        Typeface typeface = (Typeface) c0a9.A03(str);
        if (typeface == null) {
            try {
                Kgb A002 = KxA.A00(context, kqD);
                int i2 = -3;
                if (A002.A00 != 0) {
                    i2 = -2;
                } else {
                    Kkl[] kklArr = A002.A01;
                    if (kklArr == null || (length = kklArr.length) == 0) {
                        i2 = 1;
                    } else {
                        int i3 = 0;
                        while (true) {
                            int i4 = kklArr[i3].A00;
                            if (i4 == 0) {
                                i3++;
                                if (i3 >= length) {
                                    typeface = LBv.A00.A03(context, null, kklArr, i);
                                    if (typeface != null) {
                                        c0a9.A04(str, typeface);
                                    }
                                }
                            } else if (i4 >= 0) {
                                i2 = i4;
                            }
                        }
                    }
                }
                return new Kze(i2);
            } catch (PackageManager.NameNotFoundException unused) {
                return new Kze(-1);
            }
        }
        return new Kze(typeface);
    }
}
