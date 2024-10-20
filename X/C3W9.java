package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.msys.threadlist.plugins.core.itemsupplier.ThreadListItemSupplierImplementation;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.3W9, reason: invalid class name */
/* loaded from: 3W9.class */
public final class C3W9 implements 2So {
    public ThreadListItemSupplierImplementation A01;
    public Object A02;
    public String[] A03;
    public final Context A04;
    public final FbUserSession A05;
    public final 2S4 A06;
    public final 2Si A07;
    public final 2Sk A08;
    public int A00 = -1;
    public final 1YC A09 = 1YC.A03;

    public C3W9(Context context, FbUserSession fbUserSession, 2S4 r304, 2Si r305, 2Sk r306) {
        this.A04 = context;
        this.A05 = fbUserSession;
        this.A06 = r304;
        this.A07 = r305;
        this.A08 = r306;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0070 A[Catch: Exception -> 0x00c9, all -> 0x00dd, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00c9, blocks: (B:5:0x003f, B:6:0x0044, B:9:0x0050, B:12:0x0058, B:15:0x0070, B:16:0x0076, B:18:0x007e, B:21:0x008a, B:22:0x0090, B:23:0x0096, B:24:0x009c, B:26:0x00ab, B:27:0x00b1, B:28:0x00b6, B:28:0x00b6, B:31:0x00c2, B:34:0x00bd, B:36:0x0064), top: B:4:0x003f, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A00() {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3W9.A00():boolean");
    }

    public ImmutableList AqP(String str) {
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = this.A09;
        r0.A08("com.facebook.messaging.inbox.plugins.interfaces.itemsupplier.ItemSupplierInterfaceSpec", "messaging.inbox.itemsupplier.ItemSupplierInterfaceSpec", "getInboxItems", andIncrement);
        ImmutableList immutableList = null;
        try {
            if (str.equals("MSYS_THREAD_LIST") && A00()) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                String A0z = 1BK.A0z(r0, "getInboxItems", andIncrement2);
                try {
                    try {
                        immutableList = this.A01.A07();
                        r0.A09(A0z, "messaging.inbox.itemsupplier.ItemSupplierInterfaceSpec", "getInboxItems", andIncrement2);
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04((Exception) null, A0z, "messaging.inbox.itemsupplier.ItemSupplierInterfaceSpec", "getInboxItems", andIncrement2);
                    throw th;
                }
            }
            r0.A02((Exception) null, "messaging.inbox.itemsupplier.ItemSupplierInterfaceSpec", "getInboxItems", andIncrement);
            return immutableList;
        } catch (Throwable th2) {
            r0.A02((Exception) null, "messaging.inbox.itemsupplier.ItemSupplierInterfaceSpec", "getInboxItems", andIncrement);
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r303v1 */
    /* JADX WARN: Type inference failed for: r303v4 */
    /* JADX WARN: Type inference failed for: r303v5 */
    public String[] Ayr() {
        String[] strArr = this.A03;
        if (strArr == null) {
            int i = this.A00;
            int i2 = i;
            if (i == -1) {
                boolean A00 = A00();
                this.A00 = A00 ? 1 : 0;
                i2 = A00;
            }
            strArr = new String[i2];
            if (A00()) {
                strArr[0] = "MSYS_THREAD_LIST";
            }
            this.A03 = strArr;
        }
        return strArr;
    }

    public void B9M(C2g5 c2g5) {
        1BL.A19(this.A09, 1BK.A00());
    }

    public void BYI() {
        1BL.A15(this.A09, 1BK.A00());
    }

    public void BYJ() {
        1BL.A1A(this.A09, 1BK.A00());
    }

    public void BYK(String str) {
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = this.A09;
        r0.A08("com.facebook.messaging.inbox.plugins.interfaces.itemsupplier.ItemSupplierInterfaceSpec", "messaging.inbox.itemsupplier.ItemSupplierInterfaceSpec", "legacyStartLoadMoreThreads", andIncrement);
        Exception e = null;
        try {
            if (str.equals("MSYS_THREAD_LIST") && A00()) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                String A0z = 1BK.A0z(r0, "legacyStartLoadMoreThreads", andIncrement2);
                try {
                    try {
                        this.A01.A08();
                        r0.A09(A0z, "messaging.inbox.itemsupplier.ItemSupplierInterfaceSpec", "legacyStartLoadMoreThreads", andIncrement2);
                    } catch (Exception e2) {
                        e = e2;
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04(e, A0z, "messaging.inbox.itemsupplier.ItemSupplierInterfaceSpec", "legacyStartLoadMoreThreads", andIncrement2);
                    throw th;
                }
            }
            r0.A02((Exception) null, "messaging.inbox.itemsupplier.ItemSupplierInterfaceSpec", "legacyStartLoadMoreThreads", andIncrement);
        } catch (Throwable th2) {
            r0.A02(e, "messaging.inbox.itemsupplier.ItemSupplierInterfaceSpec", "legacyStartLoadMoreThreads", andIncrement);
            throw th2;
        }
    }

    public void COH() {
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = this.A09;
        r0.A08("com.facebook.messaging.inbox.plugins.interfaces.itemsupplier.ItemSupplierInterfaceSpec", "messaging.inbox.itemsupplier.ItemSupplierInterfaceSpec", "onSubscribe", andIncrement);
        try {
            if (A00()) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                String A0z = 1BK.A0z(r0, "onSubscribe", andIncrement2);
                try {
                    try {
                        this.A01.A09();
                        r0.A09(A0z, "messaging.inbox.itemsupplier.ItemSupplierInterfaceSpec", "onSubscribe", andIncrement2);
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04((Exception) null, A0z, "messaging.inbox.itemsupplier.ItemSupplierInterfaceSpec", "onSubscribe", andIncrement2);
                    throw th;
                }
            }
            r0.A02((Exception) null, "messaging.inbox.itemsupplier.ItemSupplierInterfaceSpec", "onSubscribe", andIncrement);
        } catch (Throwable th2) {
            r0.A02((Exception) null, "messaging.inbox.itemsupplier.ItemSupplierInterfaceSpec", "onSubscribe", andIncrement);
            throw th2;
        }
    }

    public void CSQ() {
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = this.A09;
        r0.A08("com.facebook.messaging.inbox.plugins.interfaces.itemsupplier.ItemSupplierInterfaceSpec", "messaging.inbox.itemsupplier.ItemSupplierInterfaceSpec", "onUnsubscribe", andIncrement);
        try {
            if (A00()) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                String A0z = 1BK.A0z(r0, "onUnsubscribe", andIncrement2);
                try {
                    try {
                        this.A01.A0A();
                        r0.A09(A0z, "messaging.inbox.itemsupplier.ItemSupplierInterfaceSpec", "onUnsubscribe", andIncrement2);
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04((Exception) null, A0z, "messaging.inbox.itemsupplier.ItemSupplierInterfaceSpec", "onUnsubscribe", andIncrement2);
                    throw th;
                }
            }
            r0.A02((Exception) null, "messaging.inbox.itemsupplier.ItemSupplierInterfaceSpec", "onUnsubscribe", andIncrement);
        } catch (Throwable th2) {
            r0.A02((Exception) null, "messaging.inbox.itemsupplier.ItemSupplierInterfaceSpec", "onUnsubscribe", andIncrement);
            throw th2;
        }
    }

    public void Cbz() {
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = this.A09;
        r0.A08("com.facebook.messaging.inbox.plugins.interfaces.itemsupplier.ItemSupplierInterfaceSpec", "messaging.inbox.itemsupplier.ItemSupplierInterfaceSpec", "refreshOnUserRequest", andIncrement);
        try {
            if (A00()) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                String A0z = 1BK.A0z(r0, "refreshOnUserRequest", andIncrement2);
                try {
                    try {
                        this.A01.A0B();
                        r0.A09(A0z, "messaging.inbox.itemsupplier.ItemSupplierInterfaceSpec", "refreshOnUserRequest", andIncrement2);
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04((Exception) null, A0z, "messaging.inbox.itemsupplier.ItemSupplierInterfaceSpec", "refreshOnUserRequest", andIncrement2);
                    throw th;
                }
            }
            r0.A02((Exception) null, "messaging.inbox.itemsupplier.ItemSupplierInterfaceSpec", "refreshOnUserRequest", andIncrement);
        } catch (Throwable th2) {
            r0.A02((Exception) null, "messaging.inbox.itemsupplier.ItemSupplierInterfaceSpec", "refreshOnUserRequest", andIncrement);
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r309v1 */
    /* JADX WARN: Type inference failed for: r309v4 */
    /* JADX WARN: Type inference failed for: r309v5 */
    public boolean[] D0n(2Sk r302, 2Sk r303) {
        int A00 = 1BK.A00();
        1YC r0 = this.A09;
        r0.A08("com.facebook.messaging.inbox.plugins.interfaces.itemsupplier.ItemSupplierInterfaceSpec", "messaging.inbox.itemsupplier.ItemSupplierInterfaceSpec", "skipRecreation", A00);
        try {
            int i = this.A00;
            int i2 = i;
            if (i == -1) {
                boolean A002 = A00();
                this.A00 = A002 ? 1 : 0;
                i2 = A002;
            }
            return new boolean[i2];
        } finally {
            r0.A06("messaging.inbox.itemsupplier.ItemSupplierInterfaceSpec", "skipRecreation", A00);
        }
    }
}
