package X;

import com.facebook.mqtt.service.ConnectionConfig;
import com.facebook.mqtt.service.XplatNativeClientWrapper;
import com.facebook.mqtt.service.XplatServiceDelegate;
import java.util.LinkedList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.1lq, reason: invalid class name */
/* loaded from: 1lq.class */
public final class C1lq implements Runnable {
    public static final String __redex_internal_original_name = "XplatServiceDelegate$startClient$1";
    public final /* synthetic */ ConnectionConfig A00;
    public final /* synthetic */ XplatServiceDelegate A01;

    public C1lq(ConnectionConfig connectionConfig, XplatServiceDelegate xplatServiceDelegate) {
        this.A01 = xplatServiceDelegate;
        this.A00 = connectionConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String A0N;
        XplatServiceDelegate xplatServiceDelegate = this.A01;
        ConnectionConfig connectionConfig = this.A00;
        if (XplatServiceDelegate.A09 == null) {
            0fH.A0k("MqttXplatService", "Service have been destroyed!");
            return;
        }
        boolean z = false;
        if (XplatServiceDelegate.A08 != null) {
            1nK r0 = XplatServiceDelegate.A08;
            if (r0 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Client already created. State = ");
                sb.append(r0.getConnectionState());
                0fH.A0j("MqttXplatService", sb.toString());
                C1lu.A00 = 0S2.A0N;
                r0.kickOffConnection();
                ConnectionConfig connectionConfig2 = XplatServiceDelegate.A04.A00;
                if (connectionConfig2 == null || (str = connectionConfig2.userId) == null || str.length() == 0 || (A0N = xplatServiceDelegate.A0N()) == null || A0N.length() == 0 || A0N.equals(str)) {
                    return;
                }
                0fH.A0n("MqttXplatService", 0Pz.A0w("Current user ", str, " is different from logged in user ", A0N, '!'));
                XplatServiceDelegate.A01.A01(new C3fm(xplatServiceDelegate));
                return;
            }
            return;
        }
        if (connectionConfig == null) {
            C1lu.A00 = 0S2.A00;
            connectionConfig = xplatServiceDelegate.A0L(true);
            XplatServiceDelegate.A04.A00 = connectionConfig;
        } else {
            C1lu.A00 = 0S2.A0j;
        }
        C1lj c1lj = XplatServiceDelegate.A02;
        if (connectionConfig != null) {
            z = true;
        }
        try {
            ReentrantReadWriteLock reentrantReadWriteLock = c1lj.A05;
            reentrantReadWriteLock.writeLock().lock();
            c1lj.A01 = z;
            if (!z) {
                0fH.A0n("MqttXplatPublisher", "Disabling publisher and flushing pending tasks");
                while (true) {
                    LinkedList linkedList = c1lj.A04;
                    if (linkedList.isEmpty()) {
                        break;
                    }
                    C4Eh c4Eh = (C4Eh) linkedList.poll();
                    1BL.A1I(c4Eh, "Remove delayed publish ", "MqttXplatPublisher", AnonymousClass001.A0k());
                    if (c4Eh != null && !c4Eh.A04.get() && c4Eh.A00.compareAndSet(true, false)) {
                        c4Eh.onFailure(0, 0);
                    }
                }
            }
            reentrantReadWriteLock.writeLock().unlock();
            if (connectionConfig != null) {
                C1nL c1nL = XplatNativeClientWrapper.Companion;
                0fH.A0l(XplatNativeClientWrapper.TAG, "Xplat mqtt jni library ready");
                CountDownLatch countDownLatch = new CountDownLatch(1);
                C1nO.A00.execute(new 1nQ(connectionConfig, xplatServiceDelegate, countDownLatch));
                countDownLatch.await(10, TimeUnit.SECONDS);
            }
        } catch (Throwable th) {
            AnonymousClass001.A1L(c1lj.A05);
            throw th;
        }
    }
}
