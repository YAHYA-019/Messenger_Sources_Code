package X;

import android.content.Context;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: X.4Es, reason: invalid class name */
/* loaded from: 4Es.class */
public final class C4Es {
    public static C4Es A04;
    public String A02 = null;
    public Boolean A00 = null;
    public Boolean A01 = null;
    public final Queue A03 = new ArrayDeque();

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r302v3 ??, still in use, count: 2, list:
          (r302v3 ??) from 0x0019: PHI (r302v2 ??) = (r302v1 ??), (r302v3 ??) binds: [B:6:0x000a, B:10:0x0016] A[DONT_GENERATE, DONT_INLINE]
          (r302v3 ?? I:X.4Es) from 0x0016: SPUT (r302v3 ?? I:X.4Es) A[Catch: all -> 0x001d] X.4Es.A04 X.4Es
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    public static X.C4Es A00() {
        /*
            java.lang.Class<X.4Es> r0 = X.C4Es.class
            r301 = r0
            r0 = r301
            monitor-enter(r0)
            X.4Es r0 = X.C4Es.A04     // Catch: java.lang.Throwable -> L1d
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L19
            X.4Es r0 = new X.4Es     // Catch: java.lang.Throwable -> L1d
            r302 = r0
            r0 = r302
            r0.<init>()     // Catch: java.lang.Throwable -> L1d
            r0 = r302
            X.C4Es.A04 = r0     // Catch: java.lang.Throwable -> L1d
        L19:
            r0 = r301
            monitor-exit(r0)
            r0 = r302
            return r0
        L1d:
            r302 = move-exception
            r0 = r301
            monitor-exit(r0)
            r0 = r302
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4Es.A00():X.4Es");
    }

    public final boolean A01(Context context) {
        Boolean bool = this.A00;
        if (bool == null) {
            boolean z = false;
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                z = true;
            }
            bool = Boolean.valueOf(z);
            this.A00 = bool;
        }
        if (!bool.booleanValue()) {
            String A00 = 1BJ.A00(744);
            if (android.util.Log.isLoggable(A00, 3)) {
                android.util.Log.d(A00, "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
            }
        }
        return this.A00.booleanValue();
    }
}
