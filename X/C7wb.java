package X;

import com.google.common.io.Closeables;
import java.io.Closeable;
import java.util.logging.Level;

/* renamed from: X.7wb, reason: invalid class name */
/* loaded from: 7wb.class */
public final class C7wb implements InterfaceC05384dn {
    public static final C7wb A00 = new Object();

    @Override // X.InterfaceC05384dn
    public void D3h(Closeable closeable, Throwable th, Throwable th2) {
        Closeables.A00.log(Level.WARNING, AnonymousClass001.A0Z(closeable, "Suppressing exception thrown when closing ", AnonymousClass001.A0k()), th2);
    }
}
