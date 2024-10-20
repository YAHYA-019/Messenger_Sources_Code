package X;

import com.facebook.auth.viewercontext.ViewerContext;
import java.util.concurrent.Callable;

/* renamed from: X.3iz, reason: invalid class name */
/* loaded from: 3iz.class */
public final class C3iz implements Callable, 03X {
    public final /* synthetic */ ViewerContext A00;
    public final /* synthetic */ 1EZ A01;
    public final /* synthetic */ 1EI A02;
    public final /* synthetic */ Callable A03;

    public C3iz(ViewerContext viewerContext, 1EZ r303, 1EI r304, Callable callable) {
        this.A02 = r304;
        this.A03 = callable;
        this.A01 = r303;
        this.A00 = viewerContext;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        1EZ r0 = this.A01;
        r0.CZt(this.A00);
        ThreadLocal threadLocal = ViewerContext.A02;
        threadLocal.set(Boolean.TRUE);
        try {
            return this.A03.call();
        } finally {
            threadLocal.set(Boolean.FALSE);
            r0.CXn();
        }
    }

    public Object getInnerRunnable() {
        return this.A03;
    }
}
