package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3Vv, reason: invalid class name */
/* loaded from: 3Vv.class */
public final class C3Vv implements 1Gs {
    public final 1Gr A00;
    public final C0dr A01;

    public C3Vv(1Gr r302, C0dr c0dr) {
        this.A00 = r302;
        this.A01 = c0dr;
    }

    /* renamed from: Cjg, reason: merged with bridge method [inline-methods] */
    public 1FA schedule(Runnable runnable, TimeUnit timeUnit, long j) {
        1FA Cjg = this.A00.Cjg(runnable, timeUnit, j);
        C0dr c0dr = this.A01;
        return new C3e8(c0dr, Cjg, timeUnit, c0dr.now(), j);
    }

    /* renamed from: Cji, reason: merged with bridge method [inline-methods] */
    public 1FA schedule(Callable callable, TimeUnit timeUnit, long j) {
        1FA Cji = this.A00.Cji(callable, timeUnit, j);
        C0dr c0dr = this.A01;
        return new C3e8(c0dr, Cji, timeUnit, c0dr.now(), j);
    }

    public ListenableFuture D3B(Runnable runnable) {
        throw AnonymousClass001.A0p();
    }

    public ListenableFuture D3C(Callable callable) {
        throw AnonymousClass001.A0p();
    }

    public ListenableFuture D3G(Object obj, Runnable runnable) {
        throw AnonymousClass001.A0p();
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        this.A00.awaitTermination(j, timeUnit);
        throw null;
    }

    public void execute(Runnable runnable) {
        throw AnonymousClass001.A0p();
    }

    public List invokeAll(Collection collection) {
        throw AnonymousClass001.A0p();
    }

    public List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        throw AnonymousClass001.A0p();
    }

    public Object invokeAny(Collection collection) {
        throw AnonymousClass001.A0p();
    }

    public Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        throw AnonymousClass001.A0p();
    }

    public boolean isShutdown() {
        return this.A00.isShutdown();
    }

    public boolean isTerminated() {
        return this.A00.isTerminated();
    }

    public /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw AnonymousClass001.A0p();
    }

    public /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw AnonymousClass001.A0p();
    }

    public void shutdown() {
        this.A00.shutdown();
        throw null;
    }

    public List shutdownNow() {
        this.A00.shutdownNow();
        throw null;
    }

    public /* bridge */ /* synthetic */ Future submit(Runnable runnable) {
        throw AnonymousClass001.A0p();
    }

    public /* bridge */ /* synthetic */ Future submit(Runnable runnable, Object obj) {
        throw AnonymousClass001.A0p();
    }

    public /* bridge */ /* synthetic */ Future submit(Callable callable) {
        throw AnonymousClass001.A0p();
    }
}
