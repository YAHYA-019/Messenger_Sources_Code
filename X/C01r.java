package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;

/* renamed from: X.01r, reason: invalid class name */
/* loaded from: 01r.class */
public final class C01r implements C01s {
    public final Executor A03;
    public final Object A00 = new Object();
    public final Random A02 = new Random();
    public final List A01 = new ArrayList();

    public C01r(Executor executor) {
        this.A03 = executor;
    }

    /* JADX WARN: Type inference failed for: r0v68, types: [X.0it, java.lang.Object] */
    public static void A00(C01r c01r, String str, String str2, Throwable th) {
        synchronized (c01r) {
            if (0Lb.A01) {
                List<C0it> list = c01r.A01;
                if (!list.isEmpty()) {
                    0fH.A17("lacrima", "Sending pending soft errors... [%d]", new Object[]{Integer.valueOf(list.size())});
                    for (C0it c0it : list) {
                        synchronized (c01r.A00) {
                            try {
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                        if (0Lb.A01) {
                            0Lb.A00(c0it.A00, c0it.A01, c0it.A02);
                        }
                    }
                }
                synchronized (c01r.A00) {
                    try {
                    } catch (Throwable th3) {
                        th = th3;
                        throw th;
                    }
                }
                if (0Lb.A01) {
                    0Lb.A00(str, str2, th);
                }
            } else {
                List list2 = c01r.A01;
                if (list2.size() < 100) {
                    0fH.A17("lacrima", "Soft error detector missing: %s %s, delaying", new Object[]{str, str2});
                    ?? obj = new Object();
                    obj.A00 = str;
                    obj.A01 = str2;
                    obj.A02 = th;
                    list2.add(obj);
                } else {
                    0fH.A17("lacrima", "Soft error detector missing: %s %s, skipping", new Object[]{str, str2});
                }
            }
        }
    }

    @Override // X.C01s
    public void Cfx(C0c4 c0c4, String str, String str2) {
        Cfy(c0c4, str, str2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r302 == X.C0c4.FAIL_FUNCTIONAL) goto L6;
     */
    @Override // X.C01s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Cfy(X.C0c4 r302, java.lang.String r303, java.lang.String r304, java.lang.Throwable r305) {
        /*
            r301 = this;
            X.0c4 r0 = X.C0c4.LEGACY_FAIL_HARDER
            r306 = r0
            r0 = r302
            r1 = r306
            if (r0 == r1) goto L1b
            X.0c4 r0 = X.C0c4.FAIL_FUNCTIONAL
            r306 = r0
            r0 = 1000(0x3e8, float:1.401E-42)
            r307 = r0
            r0 = r302
            r1 = r306
            if (r0 != r1) goto L1e
        L1b:
            r0 = 1
            r307 = r0
        L1e:
            r0 = r302
            java.lang.String r0 = r0.name()
            r308 = r0
            java.lang.String r0 = "IMPACT_"
            r1 = r308
            java.lang.String r2 = "::"
            r3 = r303
            java.lang.String r0 = X.0Pz.A0v(r0, r1, r2, r3)
            r306 = r0
            r0 = r301
            r1 = r306
            r2 = r304
            r3 = r307
            r4 = r305
            r0.D0y(r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01r.Cfy(X.0c4, java.lang.String, java.lang.String, java.lang.Throwable):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0091, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r0.longValue()) >= r0.A03) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0179, code lost:
    
        if (((r0 == null ? 0 : r0.longValue()) % java.lang.Math.min(r0.A00, r0)) != 0) goto L69;
     */
    @Override // X.C01s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void CgN(java.lang.Throwable r302) {
        /*
            Method dump skipped, instructions count: 1164
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01r.CgN(java.lang.Throwable):void");
    }

    @Override // X.C01s
    public void D0u(final 0BR r302) {
        if (this.A02.nextInt(Math.max(1, r302.A00)) != 0) {
            0fH.A0g(r302.A02, "lacrima", "skipping soft error: %s");
            return;
        }
        0BU r0 = r302.A01;
        Throwable exc = r0.get() == null ? new Exception(0Pz.A0j(r302.A02, " | ", r302.A03), null) : (Throwable) r0.get();
        if (C0gp.A00 != 4) {
            final Throwable th = exc;
            this.A03.execute(new Runnable() { // from class: X.0is
                public static final String __redex_internal_original_name = "LacrimaSoftErrorImpl$1";

                @Override // java.lang.Runnable
                public void run() {
                    C01r c01r = this;
                    0BR r02 = r302;
                    C01r.A00(c01r, r02.A02, r02.A03, th);
                }
            });
        }
    }

    @Override // X.C01s
    public void D0v(String str, String str2) {
        D0u(0BR.A00(str, str2));
    }

    @Override // X.C01s
    public void D0w(String str, String str2, int i) {
        0BS r0 = new 0BS();
        r0.A02 = str;
        r0.A03 = str2;
        r0.A00 = i;
        D0u(new 0BR(r0));
    }

    @Override // X.C01s
    public void D0x(String str, Throwable th, int i) {
        String message = th.getMessage();
        if (message == null) {
            message = "Empty cause message";
        }
        D0y(str, message, 1, th);
    }

    @Override // X.C01s
    public void D0y(String str, String str2, int i, Throwable th) {
        0BS A01 = 0BR.A01(str, str2);
        A01.A04 = th;
        A01.A00 = i;
        D0u(new 0BR(A01));
    }

    @Override // X.C01s
    public void D0z(0BR r302) {
        D0u(r302);
    }

    @Override // X.C01s
    public void D11(String str, String str2) {
        Cfx(C0c4.LEGACY_FAIL_HARDER, str, str2);
    }

    @Override // X.C01s
    public void D12(String str, String str2, Throwable th) {
        Cfy(C0c4.LEGACY_FAIL_HARDER, str, str2, th);
    }

    @Override // X.C01s
    public void D13(String str, Throwable th) {
        Cfy(C0c4.LEGACY_FAIL_HARDER, str, th.getMessage() != null ? th.getMessage() : "", th);
    }

    @Override // X.C01s
    public void softReport(String str, String str2, Throwable th) {
        0BS A01 = 0BR.A01(str, str2);
        A01.A04 = th;
        D0u(new 0BR(A01));
    }

    @Override // X.C01s
    public void softReport(String str, Throwable th) {
        String message = th.getMessage();
        if (message == null) {
            message = "Empty cause message";
        }
        softReport(str, message, th);
    }
}
