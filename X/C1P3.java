package X;

import android.view.Choreographer;
import com.facebook.dalvikdistract.DalvikDistract;
import com.facebook.systrace.Systrace;

/* renamed from: X.1P3, reason: invalid class name */
/* loaded from: 1P3.class */
public final class C1P3 implements 0Xt {
    public static boolean A00;

    public void CRH() {
        RuntimeException A0U;
        synchronized (C1P3.class) {
            if (Systrace.A0E(262144L) && !A00) {
                String property = System.getProperty("java.vm.version");
                if (property == null || 0CV.A0b(property, "0.", false) || 0CV.A0b(property, "1.", false)) {
                    try {
                        Class<?> cls = Class.forName(0Pz.A0W(Choreographer.class.getName(), "$CallbackRecord"));
                        DalvikDistract dalvikDistract = new DalvikDistract();
                        dalvikDistract.hook(Choreographer.class.getDeclaredMethod("scheduleVsyncLocked", new Class[0]), C3Tf.class.getDeclaredMethod("hookScheduleVsyncLocked", Choreographer.class), C3Tf.class.getDeclaredMethod("originalScheduleVsyncLocked", Choreographer.class));
                        Class<?> cls2 = Long.TYPE;
                        Class cls3 = Integer.TYPE;
                        dalvikDistract.hook(Choreographer.class.getDeclaredMethod("doFrame", cls2, cls3), C3Tf.class.getDeclaredMethod("hookDoFrame", Choreographer.class, cls2, cls3), C3Tf.class.getDeclaredMethod("originalDoFrame", Choreographer.class, cls2, cls3));
                        dalvikDistract.hook(new DalvikDistract.Unsafe(cls.getDeclaredMethod("run", cls2)), C3Tf.class.getDeclaredMethod("hookRun", Object.class, cls2), C3Tf.class.getDeclaredMethod("originalRun", Object.class, cls2));
                        dalvikDistract.commit();
                        A00 = true;
                    } catch (ClassNotFoundException e) {
                        0fH.A0H(C3Tf.class, "Failed to hook", e);
                        A0U = AnonymousClass001.A0U(e);
                        throw A0U;
                    } catch (NoSuchMethodException e2) {
                        0fH.A0H(C3Tf.class, "Failed to hook", e2);
                        A0U = AnonymousClass001.A0U(e2);
                        throw A0U;
                    }
                } else {
                    0fH.A0r("FrameRateEventsTraceListener", "ART not supported", new IllegalStateException());
                }
            }
        }
    }

    public void CRI() {
        RuntimeException A0U;
        synchronized (C1P3.class) {
            if (A00) {
                try {
                    Class<?> cls = Class.forName(0Pz.A0W(Choreographer.class.getName(), "$CallbackRecord"));
                    DalvikDistract dalvikDistract = new DalvikDistract();
                    dalvikDistract.unhook(Choreographer.class.getDeclaredMethod("scheduleVsyncLocked", new Class[0]));
                    Class<?> cls2 = Long.TYPE;
                    dalvikDistract.unhook(Choreographer.class.getDeclaredMethod("doFrame", cls2, Integer.TYPE));
                    dalvikDistract.unhook(cls.getDeclaredMethod("run", cls2));
                    dalvikDistract.commit();
                    A00 = false;
                } catch (ClassNotFoundException e) {
                    0fH.A0H(C3Tf.class, "Failed to unhook", e);
                    A0U = AnonymousClass001.A0U(e);
                    throw A0U;
                } catch (NoSuchMethodException e2) {
                    0fH.A0H(C3Tf.class, "Failed to unhook", e2);
                    A0U = AnonymousClass001.A0U(e2);
                    throw A0U;
                }
            }
        }
    }
}
