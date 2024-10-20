package X;

import androidx.lifecycle.LiveData;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Jgk, reason: case insensitive filesystem */
/* loaded from: Jgk.class */
public final class C3021Jgk extends LiveData {
    public final KoV A00;
    public final C4Il A01;
    public final Callable A04;
    public final C4J8 A09;
    public final boolean A08 = true;
    public final AtomicBoolean A06 = DKC.A1E(true);
    public final AtomicBoolean A05 = DKC.A1E(false);
    public final AtomicBoolean A07 = DKC.A1E(false);
    public final Runnable A03 = new Runnable() { // from class: X.Ljy
        public static final String __redex_internal_original_name = "RoomTrackingLiveData$$ExternalSyntheticLambda0";

        @Override // java.lang.Runnable
        public final void run() {
            AtomicBoolean atomicBoolean;
            C3021Jgk c3021Jgk = C3021Jgk.this;
            if (c3021Jgk.A07.compareAndSet(false, true)) {
                C4J6 c4j6 = c3021Jgk.A01.A06;
                KoV koV = c3021Jgk.A00;
                11T.A0F(koV, 0);
                c4j6.A02(new JiM(koV, c4j6));
            }
            do {
                AtomicBoolean atomicBoolean2 = c3021Jgk.A05;
                if (!atomicBoolean2.compareAndSet(false, true)) {
                    return;
                }
                Object obj = null;
                boolean z = false;
                while (true) {
                    try {
                        atomicBoolean = c3021Jgk.A06;
                        if (!atomicBoolean.compareAndSet(true, false)) {
                            break;
                        }
                        try {
                            obj = c3021Jgk.A04.call();
                            z = true;
                        } catch (Exception e) {
                            throw 1BK.A0s("Exception while computing database live data.", e);
                        }
                    } catch (Throwable th) {
                        atomicBoolean2.set(false);
                        throw th;
                    }
                }
                if (z) {
                    c3021Jgk.postValue(obj);
                }
                atomicBoolean2.set(false);
                if (!z) {
                    return;
                }
            } while (atomicBoolean.get());
        }
    };
    public final Runnable A02 = new Runnable() { // from class: X.Ljz
        public static final String __redex_internal_original_name = "RoomTrackingLiveData$$ExternalSyntheticLambda1";

        @Override // java.lang.Runnable
        public final void run() {
            Executor executor;
            String str;
            C3021Jgk c3021Jgk = C3021Jgk.this;
            boolean hasActiveObservers = c3021Jgk.hasActiveObservers();
            if (c3021Jgk.A06.compareAndSet(false, true) && hasActiveObservers) {
                boolean z = c3021Jgk.A08;
                C4Il c4Il = c3021Jgk.A01;
                if (z) {
                    executor = c4Il.A04;
                    if (executor == null) {
                        str = "internalTransactionExecutor";
                        11T.A0L(str);
                        throw 0Q8.createAndThrow();
                    }
                    executor.execute(c3021Jgk.A03);
                }
                executor = c4Il.A03;
                if (executor == null) {
                    str = "internalQueryExecutor";
                    11T.A0L(str);
                    throw 0Q8.createAndThrow();
                }
                executor.execute(c3021Jgk.A03);
            }
        }
    };

    public C3021Jgk(C4J8 c4j8, C4Il c4Il, Callable callable, String[] strArr) {
        this.A01 = c4Il;
        this.A09 = c4j8;
        this.A04 = callable;
        this.A00 = new JiL(this, strArr);
    }

    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        Executor executor;
        String str;
        this.A09.A01.add(this);
        boolean z = this.A08;
        C4Il c4Il = this.A01;
        if (z) {
            executor = c4Il.A04;
            if (executor == null) {
                str = "internalTransactionExecutor";
                11T.A0L(str);
                throw 0Q8.createAndThrow();
            }
            executor.execute(this.A03);
        }
        executor = c4Il.A03;
        if (executor == null) {
            str = "internalQueryExecutor";
            11T.A0L(str);
            throw 0Q8.createAndThrow();
        }
        executor.execute(this.A03);
    }

    @Override // androidx.lifecycle.LiveData
    public void onInactive() {
        this.A09.A01.remove(this);
    }
}
