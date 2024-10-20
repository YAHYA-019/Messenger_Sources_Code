package X;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: Lz1.class */
public final class Lz1 extends AtomicReferenceArray implements Runnable, Callable, MHY {
    public static final String __redex_internal_original_name = "ScheduledRunnable";
    public static final long serialVersionUID = -6120223772001106981L;
    public final Runnable actual;
    public static final Object A02 = AnonymousClass001.A0R();
    public static final Object A03 = AnonymousClass001.A0R();
    public static final Object A00 = AnonymousClass001.A0R();
    public static final Object A01 = AnonymousClass001.A0R();

    public Lz1(MJG mjg, Runnable runnable) {
        super(3);
        this.actual = runnable;
        lazySet(0, mjg);
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        run();
        return null;
    }

    public void dispose() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        while (true) {
            Object obj5 = get(1);
            obj = A01;
            if (obj5 == obj) {
                break;
            }
            Object obj6 = A03;
            if (obj5 == obj6 || obj5 == (obj4 = A00)) {
                break;
            }
            boolean z = false;
            if (get(2) != Thread.currentThread()) {
                z = true;
                obj6 = obj4;
            }
            if (compareAndSet(1, obj5, obj6)) {
                if (obj5 != null) {
                    ((Future) obj5).cancel(z);
                }
            }
        }
        do {
            obj2 = get(0);
            if (obj2 == obj || obj2 == (obj3 = A02) || obj2 == null) {
                return;
            }
        } while (!compareAndSet(0, obj2, obj3));
        ((MJG) obj2).AMc(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        Object obj2;
        Object obj3;
        boolean compareAndSet;
        Object obj4;
        Object obj5;
        lazySet(2, Thread.currentThread());
        try {
            this.actual.run();
        } finally {
            try {
                lazySet(2, null);
                obj4 = get(0);
                if (obj4 != A02) {
                    ((MJG) obj4).AMc(this);
                }
                do {
                    obj5 = get(1);
                    if (obj5 != A03) {
                        return;
                    } else {
                        return;
                    }
                } while (!compareAndSet(1, obj5, A01));
            } catch (Throwable th) {
                do {
                    if (obj == obj2) {
                        break;
                    } else if (obj == obj3) {
                        break;
                    }
                } while (!compareAndSet);
            }
        }
        lazySet(2, null);
        obj4 = get(0);
        if (obj4 != A02 && compareAndSet(0, obj4, A01) && obj4 != null) {
            ((MJG) obj4).AMc(this);
        }
        do {
            obj5 = get(1);
            if (obj5 != A03 || obj5 == A00) {
                return;
            }
        } while (!compareAndSet(1, obj5, A01));
    }
}
