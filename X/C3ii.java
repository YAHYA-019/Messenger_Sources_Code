package X;

import com.facebook.auth.viewercontext.ViewerContext;

/* renamed from: X.3ii, reason: invalid class name */
/* loaded from: 3ii.class */
public final class C3ii implements Runnable, 03X {
    public static final String __redex_internal_original_name = "ExecutorsUserScopeExecutorNotify$1";
    public final /* synthetic */ ViewerContext A00;
    public final /* synthetic */ 1EZ A01;
    public final /* synthetic */ 1EI A02;
    public final /* synthetic */ Runnable A03;

    public C3ii(ViewerContext viewerContext, 1EZ r303, 1EI r304, Runnable runnable) {
        this.A02 = r304;
        this.A03 = runnable;
        this.A01 = r303;
        this.A00 = viewerContext;
    }

    public Object getInnerRunnable() {
        return this.A03;
    }

    @Override // java.lang.Runnable
    public void run() {
        1EZ r0 = this.A01;
        r0.CZt(this.A00);
        ThreadLocal threadLocal = ViewerContext.A02;
        threadLocal.set(Boolean.TRUE);
        try {
            this.A03.run();
            threadLocal.set(Boolean.FALSE);
            r0.CXn();
        } catch (Throwable th) {
            threadLocal.set(Boolean.FALSE);
            r0.CXn();
            throw th;
        }
    }
}
