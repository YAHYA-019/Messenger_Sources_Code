package X;

import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.03h, reason: invalid class name */
/* loaded from: 03h.class */
public final class C03h {
    public static C03h A07;
    public static final long A08 = TimeUnit.MINUTES.toMillis(2);
    public long A00;
    public volatile File A04;
    public volatile File A05;
    public volatile StatFs A03 = null;
    public volatile StatFs A02 = null;
    public volatile boolean A06 = false;
    public final Lock A01 = new ReentrantLock();

    /* JADX WARN: Multi-variable type inference failed */
    public static StatFs A00(StatFs statFs, File file) {
        if (file == null || !file.exists()) {
            return null;
        }
        try {
            if (statFs == 0) {
                return new StatFs(file.getAbsolutePath());
            }
            statFs.restat(file.getAbsolutePath());
            return statFs;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r302v3 ??, still in use, count: 2, list:
          (r302v3 ??) from 0x0019: PHI (r302v2 ??) = (r302v1 ??), (r302v3 ??) binds: [B:6:0x000a, B:10:0x0016] A[DONT_GENERATE, DONT_INLINE]
          (r302v3 ?? I:X.03h) from 0x0016: SPUT (r302v3 ?? I:X.03h) A[Catch: all -> 0x001d] X.03h.A07 X.03h
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
    public static X.C03h A01() {
        /*
            java.lang.Class<X.03h> r0 = X.C03h.class
            r301 = r0
            r0 = r301
            monitor-enter(r0)
            X.03h r0 = X.C03h.A07     // Catch: java.lang.Throwable -> L1d
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L19
            X.03h r0 = new X.03h     // Catch: java.lang.Throwable -> L1d
            r302 = r0
            r0 = r302
            r0.<init>()     // Catch: java.lang.Throwable -> L1d
            r0 = r302
            X.C03h.A07 = r0     // Catch: java.lang.Throwable -> L1d
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
        throw new UnsupportedOperationException("Method not decompiled: X.C03h.A01():X.03h");
    }

    private void A02() {
        if (this.A06) {
            return;
        }
        Lock lock = this.A01;
        lock.lock();
        try {
            if (!this.A06) {
                this.A05 = Environment.getDataDirectory();
                this.A04 = Environment.getExternalStorageDirectory();
                A04();
                this.A06 = true;
            }
        } finally {
            lock.unlock();
        }
    }

    private void A03() {
        Lock lock = this.A01;
        if (lock.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - this.A00 > A08) {
                    A04();
                }
            } finally {
                lock.unlock();
            }
        }
    }

    private void A04() {
        this.A03 = A00(this.A03, this.A05);
        this.A02 = A00(this.A02, this.A04);
        this.A00 = SystemClock.uptimeMillis();
    }

    public long A05() {
        A02();
        A03();
        StatFs statFs = this.A03;
        return statFs != null ? statFs.getBlockSizeLong() * statFs.getFreeBlocksLong() : -1;
    }

    public long A06(Integer num) {
        A02();
        A03();
        StatFs statFs = num == 0S2.A00 ? this.A03 : this.A02;
        if (statFs != null) {
            return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        }
        return 0L;
    }

    public long A07(Integer num) {
        A02();
        A03();
        StatFs statFs = num == 0S2.A00 ? this.A03 : this.A02;
        return statFs != null ? statFs.getBlockSizeLong() * statFs.getBlockCountLong() : -1;
    }

    public void A08() {
        Lock lock = this.A01;
        if (lock.tryLock()) {
            try {
                A02();
                A04();
            } finally {
                lock.unlock();
            }
        }
    }

    public boolean A09(Integer num, long j) {
        A02();
        long A06 = A06(num);
        boolean z = true;
        if (A06 > 0 && A06 >= j) {
            z = false;
        }
        return z;
    }
}
