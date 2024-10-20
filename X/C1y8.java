package X;

import com.facebook.omnistore.OmnistoreIOException;
import com.facebook.omnistore.util.DeviceIdUtil;
import java.util.Iterator;

/* renamed from: X.1y8, reason: invalid class name */
/* loaded from: 1y8.class */
public final class C1y8 implements Runnable {
    public static final String __redex_internal_original_name = "SynchronousOmnistoreBroadcastReceiver$1";
    public final /* synthetic */ C1o9 A00;
    public final /* synthetic */ C1oA A01;

    public C1y8(C1o9 c1o9, C1oA c1oA) {
        this.A00 = c1o9;
        this.A01 = c1oA;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                try {
                    C1oA c1oA = this.A01;
                    synchronized (c1oA) {
                        if (!DeviceIdUtil.isPagesManager("256002347743983") && !DeviceIdUtil.isCreatorApp("256002347743983")) {
                            if (!c1oA.A03) {
                                0fH.A0A(C1oA.class, "First Omnistore MQTT Connection!");
                                C1oA.A01(c1oA).start();
                                Iterator it = C1oA.A00(c1oA).iterator();
                                while (it.hasNext()) {
                                    try {
                                        ((3qP) it.next()).C9q(c1oA);
                                    } catch (Throwable th) {
                                        c1oA.A05.softReport("SynchronousOmnistoreWrapper_conected_ComponentThrew", th);
                                    }
                                }
                                c1oA.A03 = true;
                            }
                            c1oA.A02.onConnectionEstablished();
                        }
                    }
                } catch (AnonymousClass483 e) {
                    0fH.A0P(C1o9.class, "Starting Omnistore failed because there's no ViewerContext", e, new Object[0]);
                } catch (AnonymousClass484 e2) {
                    0fH.A0P(C1o9.class, "Starting omnistore failed because there's no valid user.", e2, new Object[0]);
                }
            } catch (OmnistoreIOException e3) {
                0fH.A0N(C1o9.class, "Omnistore IO error during connect.", e3, new Object[0]);
            }
        } finally {
            this.A00.A02 = false;
        }
    }
}
