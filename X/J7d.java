package X;

import com.google.common.base.Preconditions;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: J7d.class */
public final class J7d extends AtomicReference implements Executor, Runnable {
    public static final String __redex_internal_original_name = "ExecutionSequencer$TaskNonReentrantExecutor";
    public Executor delegate;
    public 5V6 sequencer;
    public Thread submitting;
    public Runnable task;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (get() == H9p.CANCELLED) {
            this.delegate = null;
            this.sequencer = null;
            return;
        }
        this.submitting = Thread.currentThread();
        try {
            5V6 r0 = this.sequencer;
            r0.getClass();
            5V7 r02 = r0.A00;
            if (r02.A01 == this.submitting) {
                this.sequencer = null;
                Preconditions.checkState(AnonymousClass001.A1U(r02.A00));
                r02.A00 = runnable;
                Executor executor = this.delegate;
                executor.getClass();
                r02.A02 = executor;
                this.delegate = null;
            } else {
                Executor executor2 = this.delegate;
                executor2.getClass();
                this.delegate = null;
                this.task = runnable;
                executor2.execute(this);
            }
        } finally {
            this.submitting = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.5V7] */
    @Override // java.lang.Runnable
    public void run() {
        Thread currentThread = Thread.currentThread();
        if (currentThread != this.submitting) {
            Runnable runnable = this.task;
            runnable.getClass();
            this.task = null;
            runnable.run();
            return;
        }
        ?? obj = new Object();
        ((5V7) obj).A01 = currentThread;
        5V6 r0 = this.sequencer;
        r0.getClass();
        r0.A00 = obj;
        this.sequencer = null;
        try {
            Runnable runnable2 = this.task;
            runnable2.getClass();
            this.task = null;
            runnable2.run();
            while (true) {
                Runnable runnable3 = ((5V7) obj).A00;
                if (runnable3 == null) {
                    break;
                }
                Executor executor = ((5V7) obj).A02;
                if (executor == null) {
                    break;
                }
                ((5V7) obj).A00 = null;
                ((5V7) obj).A02 = null;
                executor.execute(runnable3);
            }
        } finally {
            ((5V7) obj).A01 = null;
        }
    }
}
