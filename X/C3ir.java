package X;

import com.facebook.auth.viewercontext.ViewerContext;
import java.util.concurrent.Callable;

/* renamed from: X.3ir, reason: invalid class name */
/* loaded from: 3ir.class */
public final class C3ir implements Callable {
    public final ViewerContext A00;
    public final 1EZ A01;

    public C3ir(ViewerContext viewerContext, 1EZ r303) {
        this.A00 = viewerContext;
        this.A01 = r303;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        ViewerContext viewerContext = this.A00;
        if (viewerContext == null) {
            1EZ r0 = this.A01;
            viewerContext = r0.B0v() != null ? r0.B0v() : r0.ChJ();
        }
        return viewerContext.mUserId;
    }
}
