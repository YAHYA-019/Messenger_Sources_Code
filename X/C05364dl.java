package X;

import com.google.common.base.Throwables;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Deque;

/* renamed from: X.4dl, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4dl.class */
public final class C05364dl implements Closeable {
    public static final InterfaceC05384dn A03;
    public Throwable A00;
    public final InterfaceC05384dn A01;
    public final Deque A02 = new ArrayDeque(4);

    static {
        InterfaceC05384dn interfaceC05384dn;
        try {
            final Method method = Throwable.class.getMethod("addSuppressed", Throwable.class);
            interfaceC05384dn = new InterfaceC05384dn(method) { // from class: X.4dm
                public final Method A00;

                {
                    this.A00 = method;
                }

                @Override // X.InterfaceC05384dn
                public void D3h(Closeable closeable, Throwable th, Throwable th2) {
                    if (th != th2) {
                        try {
                            this.A00.invoke(th, th2);
                        } catch (Throwable unused) {
                            C7wb.A00.D3h(closeable, th, th2);
                        }
                    }
                }
            };
        } catch (Throwable unused) {
            interfaceC05384dn = C7wb.A00;
        }
        A03 = interfaceC05384dn;
    }

    public C05364dl(InterfaceC05384dn interfaceC05384dn) {
        this.A01 = interfaceC05384dn;
    }

    public void A00(Closeable closeable) {
        if (closeable != null) {
            this.A02.addFirst(closeable);
        }
    }

    public void A01(Throwable th) {
        this.A00 = th;
        Throwables.throwIfInstanceOf(th, IOException.class);
        Throwables.throwIfUnchecked(th);
        throw AnonymousClass001.A0U(th);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Throwable th = this.A00;
        while (true) {
            Deque deque = this.A02;
            if (deque.isEmpty()) {
                break;
            }
            Closeable closeable = (Closeable) deque.removeFirst();
            try {
                closeable.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else {
                    this.A01.D3h(closeable, th, th2);
                }
            }
        }
        if (this.A00 != null || th == null) {
            return;
        }
        Throwables.throwIfInstanceOf(th, IOException.class);
        Throwables.throwIfUnchecked(th);
        throw new AssertionError(th);
    }
}
