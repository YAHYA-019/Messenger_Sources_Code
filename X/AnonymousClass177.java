package X;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: X.177, reason: invalid class name */
/* loaded from: 177.class */
public final class AnonymousClass177 implements Future {
    public static final AnonymousClass177 A01 = new AnonymousClass177(null);
    public final Object A00;

    public AnonymousClass177(Object obj) {
        this.A00 = obj;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.A00;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        return get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }
}
