package com.facebook.common.dextricks;

import android.os.Process;
import java.io.Closeable;

/* loaded from: Prio.class */
public final class Prio {
    public final int cpuPriority;
    public final int ioPriority;

    /* loaded from: Prio$With.class */
    public final class With implements Closeable {
        public final int savedCpuPriority;
        public final int savedIoPriority;

        public With() {
            int i = (-1) << (-1);
            this.savedIoPriority = i;
            this.savedCpuPriority = i;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            int i = this.savedIoPriority;
            int i2 = (-1) << (-1);
            if (i != i2) {
                DalvikInternals.ioprio_set(1, 0, i);
            }
            if (this.savedCpuPriority != i2) {
                Process.setThreadPriority(Process.myTid(), this.savedCpuPriority);
            }
        }
    }

    public Prio(int i, int i2) {
        this.ioPriority = i;
        this.cpuPriority = i2;
    }

    public static Prio lowest() {
        return new Prio(DalvikInternals.IOPRIO_BACKGROUND, 19);
    }

    public static Prio unchanged() {
        int i = (-1) << (-1);
        return new Prio(i, i);
    }

    public Prio ioOnly() {
        return new Prio(this.ioPriority, (-1) << (-1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r301.cpuPriority >= 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isDefault() {
        /*
            r301 = this;
            r0 = r301
            int r0 = r0.ioPriority
            r302 = r0
            r0 = r302
            if (r0 >= 0) goto L14
            r0 = r301
            int r0 = r0.cpuPriority
            r303 = r0
            r0 = 1
            r302 = r0
            r0 = r303
            if (r0 < 0) goto L16
        L14:
            r0 = 0
            r302 = r0
        L16:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.Prio.isDefault():boolean");
    }

    public With with() {
        return new With();
    }
}
