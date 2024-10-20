package X;

/* renamed from: X.1so, reason: invalid class name */
/* loaded from: 1so.class */
public abstract class C1so implements Runnable {
    public static final String __redex_internal_original_name = "ThreadTracingRunnable";
    public Throwable A00;

    public C1so() {
        Throwable th;
        if (C02A.enableThreadTracingStacktrace) {
            Thread currentThread = Thread.currentThread();
            th = new Throwable(0Pz.A0t("Runnable instantiated on thread id: ", ", name: ", currentThread.getName(), currentThread.getId()));
        } else {
            th = null;
        }
        this.A00 = th;
    }

    public void A00() {
        if (this instanceof 2lI) {
            2Xo r0 = ((2lI) this).A00;
            try {
                2Xo.A0H(r0);
                return;
            } catch (IndexOutOfBoundsException e) {
                throw 2Xo.A03(r0.A03, r0, e);
            }
        }
        2Xu r02 = (2Xu) this;
        synchronized (r02) {
            if (r02.A02) {
                int i = r02.A00;
                String str = r02.A01;
                r02.A00 = -1;
                r02.A01 = null;
                r02.A02 = false;
                try {
                    2Xo.A0K(r02.A04, str, i);
                } catch (IndexOutOfBoundsException e2) {
                    2Xo r03 = r02.A04;
                    throw 2Xo.A03(r03.A03, r03, e2);
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            A00();
        } catch (Throwable th) {
            Throwable th2 = this.A00;
            if (th2 != null) {
                android.util.Log.w("LithoThreadTracing", "--- start debug trace");
                android.util.Log.w("LithoThreadTracing", "Thread tracing stacktrace", th2);
                android.util.Log.w("LithoThreadTracing", "--- end debug trace");
            }
            throw th;
        }
    }
}
