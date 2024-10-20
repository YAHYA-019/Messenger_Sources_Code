package X;

import com.facebook.fury.context.ReqContext;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.4cm, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4cm.class */
public final class CallableC05024cm implements Callable {
    public final /* synthetic */ InterfaceC04494b5 A00;
    public final /* synthetic */ 4cI A01;
    public final /* synthetic */ Object A02;
    public final /* synthetic */ AtomicBoolean A03;

    public CallableC05024cm(InterfaceC04494b5 interfaceC04494b5, 4cI r303, Object obj, AtomicBoolean atomicBoolean) {
        this.A02 = obj;
        this.A03 = atomicBoolean;
        this.A01 = r303;
        this.A00 = interfaceC04494b5;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        Throwable th;
        Object obj = this.A02;
        ReqContext A00 = 1OS.A00(obj);
        try {
            if (this.A03.get()) {
                new CancellationException();
            } else {
                4cI r0 = this.A01;
                4cK r02 = r0.A03;
                InterfaceC04494b5 interfaceC04494b5 = this.A00;
                2Ds A002 = r02.A00(interfaceC04494b5);
                if (A002 != null) {
                    interfaceC04494b5.BIN();
                    r0.A02.CMc(interfaceC04494b5);
                } else {
                    interfaceC04494b5.BIN();
                    2DR r03 = r0.A02;
                    try {
                        r03.CMd(interfaceC04494b5);
                        try {
                            interfaceC04494b5.BIN();
                            4cS B7g = r0.A00.B7g(interfaceC04494b5);
                            if (B7g == null) {
                                interfaceC04494b5.BIN();
                                r03.Bu0(interfaceC04494b5);
                                1OS.A03(A00);
                                return null;
                            }
                            interfaceC04494b5.BIN();
                            r03.Btz(interfaceC04494b5);
                            InputStream CWH = B7g.CWH();
                            try {
                                4dQ A003 = r0.A04.A00(CWH, (int) B7g.size());
                                interfaceC04494b5.BIN();
                                2EU A02 = 2EU.A02(A003);
                                11T.A0A(A02);
                                try {
                                    new 2Ds(A02);
                                    A02.close();
                                } catch (Throwable th2) {
                                    th = th2;
                                    A02.close();
                                    throw th;
                                }
                            } finally {
                                CWH.close();
                            }
                        } catch (IOException e) {
                            th = e;
                            C0d7.A04(4cI.class, "Exception reading from cache for %s", th, interfaceC04494b5.BIN());
                            r03.Bty(interfaceC04494b5);
                        }
                    } catch (Exception unused) {
                        1OS.A03(A00);
                        return null;
                    }
                }
                if (!Thread.interrupted()) {
                    1OS.A03(A00);
                    return A002;
                }
                A002.close();
                new InterruptedException();
            }
            throw th;
        } catch (Throwable th3) {
            try {
                1OS.A04(obj, th3);
                throw th3;
            } catch (Throwable th4) {
                1OS.A03(A00);
                throw th4;
            }
        }
    }
}
