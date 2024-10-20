package com.facebook.forker;

import X.0Pz;
import X.AnonymousClass001;
import X.C0il;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.facebook.acra.util.JavaProcFileReader;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: Process.class */
public final class Process extends java.lang.Process implements Closeable {
    public static final int FD_STREAM_INPUT = 0;
    public static final int FD_STREAM_OUTPUT = 1;
    public static final int IGNORE_FD = 255;
    public static final int SD_BLACK_HOLE = 253;
    public static final int SD_INHERIT = 254;
    public static final int SD_PIPE = 252;
    public static final int SD_STDOUT = 251;
    public static final int SIGCONT = 18;
    public static final int SIGKILL = 9;
    public static final int SIGSTOP = 19;
    public static final int SIGTERM = 15;
    public static final int SIGTSTP = 20;
    public static final int STATUS_EXITED = 4;
    public static final int STATUS_RUNNING = 1;
    public static final int STATUS_STOPPED = 2;
    public static final int STDERR = 2;
    public static final int STDIN = 0;
    public static final int STDOUT = 1;
    public static final String TAG = "fb-Process";
    public static final int WAIT_RESULT_RUNNING = -2147483646;
    public static final int WAIT_RESULT_STOPPED = -2147483647;
    public static final int WAIT_RESULT_TIMEOUT = Integer.MIN_VALUE;
    public InputStream mChildStderr;
    public OutputStream mChildStdin;
    public InputStream mChildStdout;
    public int mExitStatus;
    public int mPid;
    public int mProcessStatus;
    public WaiterThread mWaiterThread = new WaiterThread();

    /* loaded from: Process$WaiterThread.class */
    public final class WaiterThread extends Thread {
        public WaiterThread() {
            super("PidWaiter:Ready");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.this.nativeWait();
        }
    }

    static {
        C0il.A0B("forker");
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0149, code lost:
    
        if (r322 == (-1)) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Process(java.lang.String r302, java.lang.String[] r303, byte[] r304, int[] r305, int[] r306, java.io.File r307) {
        /*
            Method dump skipped, instructions count: 767
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.forker.Process.<init>(java.lang.String, java.lang.String[], byte[], int[], int[], java.io.File):void");
    }

    public static String describeStatus(int i) {
        StringBuilder A0k;
        if (i < 0) {
            A0k = AnonymousClass001.A0k();
            A0k.append("killed by signal ");
            i = -i;
        } else {
            if (i <= 0) {
                return "exited successfully";
            }
            A0k = AnonymousClass001.A0k();
            A0k.append("exited with status ");
        }
        A0k.append(i);
        return A0k.toString();
    }

    public static String fdMagicName(int i) {
        int myPid = android.os.Process.myPid();
        int myTid = android.os.Process.myTid();
        StringBuilder A1D = 0Pz.A1D("/proc/", "/task/", myPid);
        A1D.append(myTid);
        return AnonymousClass001.A0e(JavaProcFileReader.FD_DIR_STRING, A1D, i);
    }

    private native void nativeKill(int i);

    private native int nativeLaunch(String str, String[] strArr, byte[] bArr, int[] iArr, int[] iArr2);

    public static native void nativeUnixClose(int i);

    public static native int nativeUnixCreateTmpFile(String str);

    public static native int nativeUnixOpen(String str);

    public static native int[] nativeUnixPipe(int[] iArr);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeWait();

    public static Object openFdStream(int i, int i2) {
        String fdMagicName = fdMagicName(i);
        try {
            return i2 == 0 ? new FileInputStream(fdMagicName) : new FileOutputStream(fdMagicName);
        } catch (FileNotFoundException unused) {
            ParcelFileDescriptor fromFd = ParcelFileDescriptor.fromFd(i);
            return i2 == 0 ? new ParcelFileDescriptor.AutoCloseInputStream(fromFd) : new ParcelFileDescriptor.AutoCloseOutputStream(fromFd);
        }
    }

    public static void safeClose(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                Log.d(TAG, "suppressing close error", e);
            }
        }
    }

    public static void unixClose(int i) {
        if (i != -1) {
            nativeUnixClose(i);
        }
    }

    public static void unixClose(int[] iArr) {
        if (iArr == null) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= iArr.length) {
                return;
            }
            unixClose(iArr[i2]);
            i = i2 + 1;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        destroy();
    }

    @Override // java.lang.Process
    public void destroy() {
        nativeKill(9);
        boolean z = false;
        while (true) {
            try {
                this.mWaiterThread.join();
                break;
            } catch (InterruptedException unused) {
                z = true;
                Thread.interrupted();
            }
        }
        synchronized (this) {
            safeClose(this.mChildStdin);
            safeClose(this.mChildStdout);
            safeClose(this.mChildStderr);
        }
        if (z) {
            AnonymousClass001.A13();
        }
    }

    @Override // java.lang.Process
    public int exitValue() {
        int exitValueEx = exitValueEx();
        if (exitValueEx < 0) {
            exitValueEx = (-exitValueEx) + 128;
        }
        return exitValueEx;
    }

    public int exitValueEx() {
        int i;
        synchronized (this) {
            if (this.mProcessStatus != 4) {
                throw new IllegalThreadStateException(0Pz.A0T("Process has not yet terminated: ", this.mPid));
            }
            i = this.mExitStatus;
        }
        return i;
    }

    @Override // java.lang.Process
    public InputStream getErrorStream() {
        return this.mChildStderr;
    }

    @Override // java.lang.Process
    public InputStream getInputStream() {
        return this.mChildStdout;
    }

    @Override // java.lang.Process
    public OutputStream getOutputStream() {
        return this.mChildStdin;
    }

    public int getPid() {
        return this.mPid;
    }

    public void kill(int i) {
        nativeKill(i);
    }

    @Override // java.lang.Process
    public int waitFor() {
        int exitValue;
        synchronized (this) {
            while (this.mProcessStatus != 4) {
                wait();
            }
            exitValue = exitValue();
        }
        return exitValue;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00be, code lost:
    
        throw r313;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int waitFor(int r302, int r303) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.forker.Process.waitFor(int, int):int");
    }

    public int waitForUninterruptibly() {
        int waitFor;
        boolean z = false;
        while (true) {
            try {
                waitFor = waitFor();
                break;
            } catch (InterruptedException unused) {
                z = true;
                Thread.interrupted();
            }
        }
        if (z) {
            AnonymousClass001.A13();
        }
        return waitFor;
    }

    public int waitForUninterruptibly(int i, int i2) {
        int i3 = (-1) << (-1);
        long j = 0;
        boolean z = false;
        int i4 = (-1) << (-1);
        do {
            if (i > 0) {
                j = System.currentTimeMillis();
            }
            try {
                i4 = waitFor(i, i2);
                if (i4 != i3) {
                    break;
                }
            } catch (InterruptedException unused) {
                z = true;
                Thread.interrupted();
            }
            if (i > 0) {
                long max = Math.max(0L, System.currentTimeMillis() - j);
                if (i < max) {
                    break;
                }
                i -= (int) max;
            }
        } while (i != 0);
        if (z) {
            AnonymousClass001.A13();
        }
        return i4;
    }
}
