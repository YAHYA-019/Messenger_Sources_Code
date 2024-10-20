package X;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;

/* renamed from: X.0ob, reason: invalid class name */
/* loaded from: 0ob.class */
public abstract class C0ob extends JobService implements AnonymousClass025 {
    public static final Set A01 = AnonymousClass001.A0v();
    public C0oc A00;

    public C0ob() {
        11T.A0A(AnonymousClass001.A0Y(this));
    }

    public static C0ob A00(C0ob c0ob, String str) {
        0Xp.A01(str);
        return c0ob.A01().A02;
    }

    private final C0oc A01() {
        C0oc c0oc;
        Object A0U;
        synchronized (this) {
            0eC.A00();
            synchronized (this) {
                try {
                    c0oc = this.A00;
                    if (c0oc == null) {
                        0Xq.A00("AsyncJobService.getDelegateInstance()");
                        try {
                            try {
                                Object newInstance = Class.forName("com.facebook.analytics2.logger.legacy.uploader.LollipopUploadServiceDelegate").getDeclaredConstructor(C0ob.class).newInstance(this);
                                11T.A0I(newInstance, "null cannot be cast to non-null type com.facebook.startup.services.AsyncJobServiceDelegate");
                                c0oc = (C0oc) newInstance;
                                this.A00 = c0oc;
                            } catch (Exception e) {
                                if (e instanceof InvocationTargetException) {
                                    A0U = e.getCause();
                                    if (A0U == null) {
                                        A0U = e;
                                    }
                                    if (!(A0U instanceof RuntimeException)) {
                                        A0U = AnonymousClass001.A0U((Throwable) A0U);
                                    }
                                } else if ((e instanceof ClassNotFoundException) || (e instanceof InstantiationException) || (e instanceof NoSuchMethodException) || (e instanceof IllegalAccessException)) {
                                    new IllegalArgumentException(e);
                                } else {
                                    A0U = AnonymousClass001.A0U(e);
                                }
                                throw ((Throwable) A0U);
                            }
                        } finally {
                            0Xp.A00();
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            }
            return c0oc;
        }
        C0k4.A00(c0oc);
        synchronized (c0oc) {
            try {
                if (!c0oc.A00) {
                    c0oc.A00 = true;
                    super.onCreate();
                }
            } catch (Throwable th2) {
                th = th2;
                C0oc c0oc2 = c0oc;
                throw th;
            }
        }
        return c0oc;
    }

    public final void A02() {
        super.onDestroy();
    }

    @Override // X.AnonymousClass025
    public Object B5M(Object obj) {
        11T.A0F(obj, 0);
        return A01().A01.A00(obj);
    }

    @Override // X.AnonymousClass025
    public void CtX(Object obj, Object obj2) {
        11T.A0H(obj, obj2);
        A01().CtX(obj, obj2);
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        11T.A0F(context, 0);
        0Xq.A00("AsyncJobService.attachBaseContext()");
        super.attachBaseContext(context);
        A01();
        0Xp.A00();
    }

    @Override // android.app.Service
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        11T.A0H(fileDescriptor, printWriter);
        11T.A0F(strArr, 2);
        super.dump(fileDescriptor, printWriter, strArr);
        0Xp.A00();
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        11T.A0F(configuration, 0);
        super.onConfigurationChanged(configuration);
        0Xp.A00();
    }

    @Override // android.app.Service
    public void onCreate() {
        int A00 = C08o.A00(this, 1480644006);
        int A04 = 0FI.A04(-682206136);
        0Xq.A00("AsyncJobService.onCreate()");
        A01().A02();
        0Xp.A00();
        0FI.A0A(560067652, A04);
        C08o.A02(-1426617165, A00);
    }

    @Override // android.app.Service
    public void onDestroy() {
        int A04 = 0FI.A04(1239182287);
        0Xq.A00("AsyncJobService.onDestroy()");
        A01().A01();
        0Xp.A00();
        0FI.A0A(-1839215291, A04);
        C01w.A00(this);
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        0Xp.A00();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        int A04 = 0FI.A04(1571256607);
        super.onRebind(intent);
        0Xp.A00();
        0FI.A0A(1803412913, A04);
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i) {
        super.onStart(intent, i);
        0Xp.A00();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        int A012 = C08o.A01(this, -685649291);
        int A04 = 0FI.A04(368094462);
        0Xq.A00("AsyncJobService.onStartCommand()");
        int A00 = A01().A00(intent, i, i2);
        0Xp.A00();
        0FI.A0A(497383843, A04);
        C08o.A03(-17483348, A012);
        return A00;
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        11T.A0F(jobParameters, 0);
        0Xq.A00("AsyncJobService.onStartJob()");
        boolean A03 = A01().A03(jobParameters);
        0Xp.A00();
        return A03;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        11T.A0F(jobParameters, 0);
        0Xq.A00("AsyncJobService.onStopJob()");
        A01().A04(jobParameters);
        0Xp.A00();
        return true;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        0Xp.A00();
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        0Xp.A00();
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        boolean onUnbind = super.onUnbind(intent);
        0Xp.A00();
        return onUnbind;
    }
}
