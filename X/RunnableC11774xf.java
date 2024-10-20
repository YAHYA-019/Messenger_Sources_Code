package X;

import com.facebook.http.config.proxies.ProxyDetector;
import java.net.Proxy;
import java.util.Iterator;

/* renamed from: X.4xf, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4xf.class */
public final class RunnableC11774xf implements Runnable {
    public static final String __redex_internal_original_name = "ProxyDetector$1";
    public final /* synthetic */ ProxyDetector A00;

    public RunnableC11774xf(ProxyDetector proxyDetector) {
        this.A00 = proxyDetector;
    }

    @Override // java.lang.Runnable
    public void run() {
        C11794xh c11794xh;
        5DI r0;
        ProxyDetector proxyDetector = this.A00;
        1Du it = proxyDetector.A02.iterator();
        while (true) {
            if (!it.hasNext()) {
                c11794xh = InterfaceC11734xb.A00;
                break;
            }
            c11794xh = ((InterfaceC11734xb) it.next()).Cay();
            if (c11794xh != null) {
                if (c11794xh.A03 == null && ((r0 = c11794xh.A01) == null || r0.A00() != Proxy.Type.SOCKS)) {
                    break;
                } else {
                    0fH.A0g(c11794xh, "ProxyDetector", "unsupported proxy config %s");
                }
            }
        }
        boolean z = false;
        synchronized (proxyDetector) {
            C11794xh c11794xh2 = proxyDetector.A00;
            if (c11794xh2 == null || !c11794xh.equals(c11794xh2)) {
                z = true;
            }
            proxyDetector.A00 = c11794xh;
        }
        if (z) {
            Iterator it2 = proxyDetector.A03.iterator();
            if (it2.hasNext()) {
                it2.next();
                throw AnonymousClass001.A0Q("onProxyConfigChanged");
            }
        }
    }
}
