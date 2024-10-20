package X;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Lyy.class */
public final class Lyy extends AtomicInteger implements Runnable, MQs {
    public static final String __redex_internal_original_name = "ObservableScalarXMap$ScalarDisposable";
    public static final long serialVersionUID = 3880992722410194083L;
    public final MKH observer;
    public final Object value;

    public Lyy(MKH mkh, Object obj) {
        this.observer = mkh;
        this.value = obj;
    }

    @Override // X.MQt
    public int Cgx(int i) {
        lazySet(1);
        return 1;
    }

    @Override // X.MJr
    public void clear() {
        lazySet(3);
    }

    public void dispose() {
        set(3);
    }

    @Override // X.MJr
    public boolean offer(Object obj) {
        throw AnonymousClass001.A0q("Should not be called!");
    }

    @Override // X.MJr
    public Object poll() {
        if (get() != 1) {
            return null;
        }
        lazySet(3);
        return this.value;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (get() == 0 && compareAndSet(0, 2)) {
            this.observer.C9Q(this.value);
            if (get() == 2) {
                lazySet(3);
                this.observer.Bpm();
            }
        }
    }
}
