package X;

import com.facebook.common.callercontext.CallerContext;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: G4q.class */
public final class G4q implements Runnable {
    public static final String __redex_internal_original_name = "PersistentComponentManager$1";
    public final /* synthetic */ InterfaceC03993zi A00;
    public final /* synthetic */ F8R A01;
    public final /* synthetic */ CallerContext A02;
    public final /* synthetic */ ConcurrentLinkedQueue A03;

    public G4q(InterfaceC03993zi interfaceC03993zi, F8R f8r, CallerContext callerContext, ConcurrentLinkedQueue concurrentLinkedQueue) {
        this.A01 = f8r;
        this.A02 = callerContext;
        this.A00 = interfaceC03993zi;
        this.A03 = concurrentLinkedQueue;
    }

    @Override // java.lang.Runnable
    public void run() {
        F8R.A00(this.A00, this.A01, this.A03);
    }
}
