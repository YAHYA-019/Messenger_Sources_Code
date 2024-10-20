package X;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: Er7.class */
public final class Er7 {
    public void A00(List list) {
        Throwable cause;
        RuntimeException runtimeException = null;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                try {
                    ((Future) it.next()).get();
                } catch (InterruptedException e) {
                    cause = AnonymousClass001.A0U(e);
                    throw cause;
                    break;
                } catch (ExecutionException e2) {
                    boolean z = e2.getCause() instanceof RuntimeException;
                    cause = e2.getCause();
                    if (!z) {
                        cause = AnonymousClass001.A0U(cause);
                    }
                    throw cause;
                    break;
                    break;
                }
            } catch (RuntimeException e3) {
                if (runtimeException == null) {
                    runtimeException = e3;
                } else {
                    7kF.A00(runtimeException, e3);
                }
            }
        }
        if (runtimeException != null) {
            throw runtimeException;
        }
    }
}
