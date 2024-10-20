package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* loaded from: I8m.class */
public final class I8m {
    public static I8m A08;
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public final I4V A07 = I4V.A00();
    public Handler A06 = new Handler(Looper.getMainLooper(), new IHS(this));

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r302v3 ??, still in use, count: 2, list:
          (r302v3 ??) from 0x0019: PHI (r302v2 ??) = (r302v1 ??), (r302v3 ??) binds: [B:6:0x000a, B:10:0x0016] A[DONT_GENERATE, DONT_INLINE]
          (r302v3 ?? I:X.I8m) from 0x0016: SPUT (r302v3 ?? I:X.I8m) A[Catch: all -> 0x001d] X.I8m.A08 X.I8m
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
    public static X.I8m A00() {
        /*
            java.lang.Class<X.I8m> r0 = X.I8m.class
            r301 = r0
            r0 = r301
            monitor-enter(r0)
            X.I8m r0 = X.I8m.A08     // Catch: java.lang.Throwable -> L1d
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L19
            X.I8m r0 = new X.I8m     // Catch: java.lang.Throwable -> L1d
            r302 = r0
            r0 = r302
            r0.<init>()     // Catch: java.lang.Throwable -> L1d
            r0 = r302
            X.I8m.A08 = r0     // Catch: java.lang.Throwable -> L1d
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
        throw new UnsupportedOperationException("Method not decompiled: X.I8m.A00():X.I8m");
    }

    public static void A01(I8m i8m, int i, long j) {
        if (i8m.A07.A00.isEmpty()) {
            return;
        }
        Handler handler = i8m.A06;
        Message obtain = Message.obtain(handler, i);
        obtain.arg1 = (int) (SystemClock.elapsedRealtime() - j);
        handler.sendMessage(obtain);
    }

    public void A02() {
        long j = this.A02;
        if (j == 0) {
            this.A02 = SystemClock.elapsedRealtime();
            A01(this, 5, this.A00);
        } else {
            A01(this, 3, j);
            this.A02 = SystemClock.elapsedRealtime();
        }
    }

    public void A03() {
        long j = this.A01;
        if (j == 0) {
            this.A01 = SystemClock.elapsedRealtime();
            A01(this, 4, this.A00);
        } else {
            A01(this, 2, j);
            this.A01 = SystemClock.elapsedRealtime();
        }
    }
}
