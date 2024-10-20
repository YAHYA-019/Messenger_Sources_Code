package com.facebook.advancedcryptotransport;

import X.11T;
import X.1hA;
import X.1hB;
import X.2F1;
import X.2F3;
import X.2F4;
import X.C00j;
import X.C1h9;
import X.C1z8;
import X.C2y1;
import com.facebook.simplejni.NativeHolder;
import java.util.Iterator;
import java.util.List;

/* loaded from: DnsResolverImpl.class */
public class DnsResolverImpl {
    public static final DnsResolverImpl $redex_init_class = null;

    static {
        C1z8.A00();
    }

    public static void dnsResolveAsync(String str, NativeHolder nativeHolder, int i) {
        C00j.A05("dnsResolveAsync", -176517551);
        2F3 A00 = 2F1.A00();
        11T.A0F(str, 0);
        List list = A00.A03;
        synchronized (list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                1hA r0 = ((1hB) it.next()).A00;
                C2y1 c2y1 = new C2y1(str, r0, 1);
                if (((C1h9) r0).A02) {
                    synchronized (r0) {
                        c2y1.invoke();
                    }
                }
            }
        }
        new Thread((Runnable) new 2F4(str, nativeHolder, i)).start();
        C00j.A01(1508151821);
    }

    public static native void dnsResolveAsyncCompletionHandler(List list, int i, NativeHolder nativeHolder);
}
