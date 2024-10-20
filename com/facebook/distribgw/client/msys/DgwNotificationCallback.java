package com.facebook.distribgw.client.msys;

import X.0Pz;
import X.0S2;
import X.0fH;
import X.11T;
import X.1Uk;
import X.1Ul;
import X.3GF;

/* loaded from: DgwNotificationCallback.class */
public final class DgwNotificationCallback {
    public static final Companion Companion = new Object();
    public static volatile 1Uk gListener;

    /* loaded from: DgwNotificationCallback$Companion.class */
    public final class Companion {
        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r308v0, types: [java.util.Map] */
        /* JADX WARN: Type inference failed for: r308v1 */
        /* JADX WARN: Type inference failed for: r308v2, types: [java.util.List] */
        public final void reportConnectionState(final String str, final int i) {
            1Uk r0 = DgwNotificationCallback.gListener;
            if (r0 != null) {
                11T.A0F(str, 0);
                0fH.A0j("DgwConnectivityTracker", 0Pz.A0T("Dgw connection state changed to ", i));
                ?? r308 = r0.A05;
                synchronized (r308) {
                    try {
                        r308.put(str, Integer.valueOf(i));
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                r308 = r0.A04;
                synchronized (r308) {
                    for (final 1Ul r02 : r308) {
                        r02.A01.execute(new Runnable() { // from class: X.1h0
                            public static final String __redex_internal_original_name = "DgwConnectivityTracker$sendConnectionState$1$1$1";

                            @Override // java.lang.Runnable
                            public final void run() {
                                int i2 = i;
                                C3m3 c3m3 = r02.A00;
                                String str2 = str;
                                if (i2 == 1) {
                                    c3m3.Bqj(str2);
                                } else {
                                    c3m3.Bql(str2);
                                }
                            }
                        });
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r313v0, types: [java.util.Map] */
        /* JADX WARN: Type inference failed for: r313v1 */
        /* JADX WARN: Type inference failed for: r313v2, types: [java.util.List] */
        public final void reportDisconnect(final String str, int i, final String str2) {
            1Uk r0 = DgwNotificationCallback.gListener;
            if (r0 != null) {
                11T.A0F(str, 0);
                11T.A0F(str2, 2);
                final Integer num = 0S2.A00(6)[i];
                0fH.A0j("DgwConnectivityTracker", 0Pz.A0v("Dgw disconnected with error:", num != null ? 3GF.A00(num) : "null", " and reason:", str2));
                ?? r313 = r0.A05;
                synchronized (r313) {
                    try {
                        r313.put(str, 2);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                r313 = r0.A04;
                synchronized (r313) {
                    for (final 1Ul r02 : r313) {
                        r02.A01.execute(new Runnable() { // from class: X.3i5
                            public static final String __redex_internal_original_name = "DgwConnectivityTracker$sendDisconnection$1$1$1";

                            @Override // java.lang.Runnable
                            public final void run() {
                                r02.A00.Btw(str, num, str2);
                            }
                        });
                    }
                }
            }
        }
    }

    public static final void reportConnectionState(String str, int i) {
        Companion.reportConnectionState(str, i);
    }

    public static final void reportDisconnect(String str, int i, String str2) {
        Companion.reportDisconnect(str, i, str2);
    }
}
