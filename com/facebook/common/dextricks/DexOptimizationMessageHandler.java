package com.facebook.common.dextricks;

import X.00F;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C0ft;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.PowerManager;
import android.os.Process;
import android.os.RemoteException;
import java.util.Iterator;
import java.util.List;

/* loaded from: DexOptimizationMessageHandler.class */
public final class DexOptimizationMessageHandler extends Handler {
    public static final int DEFAULT_RESTART_IMPORTANCE_THRESHOLD = 300;
    public static final int MSG_OPT_DONE = 2;
    public static final int MSG_OPT_RESTART_CHECK = 3;
    public static final int MSG_OPT_START = 1;
    public static final int OPT_RESULT_ERROR = 1;
    public static final int OPT_RESULT_SHUTDOWN = 2;
    public static final int OPT_RESULT_SUCCESS = 0;
    public static final int RESTART_CHECK_INTERVAL_MS = 1000;
    public static final int UNKNOWN_IMPORTANCE = 255;
    public final Context mContext;
    public final boolean mDisableProcessRestart;
    public final PowerManager mPowerManager;
    public final int mRestartImportanceThreshold;
    public final boolean mRestartOnlyIfScreenOff;

    /* loaded from: DexOptimizationMessageHandler$Api16PlusUtil.class */
    public class Api16PlusUtil {
        public static int getMyImportance() {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            return runningAppProcessInfo.importance;
        }
    }

    public DexOptimizationMessageHandler(Context context, boolean z, int i, boolean z2) {
        super(AnonymousClass002.A09("DexOptimizationMessageHandlerThread"));
        this.mContext = context.getApplicationContext();
        this.mPowerManager = (PowerManager) context.getSystemService("power");
        this.mDisableProcessRestart = z;
        this.mRestartImportanceThreshold = i <= 0 ? 300 : i;
        this.mRestartOnlyIfScreenOff = z2;
    }

    private boolean checkIfShouldRestartProcess(int i) {
        if (this.mDisableProcessRestart || i < this.mRestartImportanceThreshold) {
            return false;
        }
        if (this.mRestartOnlyIfScreenOff) {
            boolean isInteractive = this.mPowerManager.isInteractive();
            Mlog.v("[c] checking if screen is off (screen is %s) with importance %d [threshold: %d]", isInteractive ? "on" : "off", Integer.valueOf(i), Integer.valueOf(this.mRestartImportanceThreshold));
            if (isInteractive) {
                return false;
            }
        }
        return !C0ft.A09();
    }

    private int getMyImportance() {
        int i = -1;
        try {
            return Api16PlusUtil.getMyImportance();
        } catch (NullPointerException e) {
            Mlog.w(e, "getMyMemoryState failed due to NPE: falling back to legacy process list API", new Object[0]);
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.mContext.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                int myPid = Process.myPid();
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == myPid) {
                        i = next.importance;
                        break;
                    }
                }
            }
            return i;
        } catch (RuntimeException e2) {
            Mlog.w(e2, "getMyMemoryState failed due to internal error: exit gracefully", new Object[0]);
            return -1;
        }
    }

    private boolean isScreenOn() {
        return this.mPowerManager.isInteractive();
    }

    public static Looper makeLooper() {
        return AnonymousClass002.A09("DexOptimizationMessageHandlerThread");
    }

    private boolean scheduleRestartChecks() {
        return !this.mDisableProcessRestart;
    }

    public static void send(Messenger messenger, int i, int i2) {
        if (messenger == null) {
            Mlog.w("cannot send status, receiver is null", new Object[0]);
            return;
        }
        try {
            messenger.send(Message.obtain(null, i, i2, 0));
        } catch (RemoteException e) {
            Mlog.w(e, "cannot send status, receiver is dead", new Object[0]);
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            Mlog.v("[c] received opt start message, canceling any restart checks", new Object[0]);
            removeMessages(3);
            return;
        }
        if (i == 2) {
            int i2 = message.arg1;
            String str = i2 != 0 ? i2 != 1 ? i2 != 2 ? "unknown" : "interrupted due to service shutdown" : "failed" : OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_SUCCESS;
            boolean z = !this.mDisableProcessRestart;
            Mlog.v("[c] received optimization-done message (result: %s schedule checks: %s)", str, Boolean.valueOf(z));
            if (message.arg1 != 0 || !z) {
                return;
            }
        } else {
            if (i != 3) {
                super.handleMessage(message);
                return;
            }
            int myImportance = getMyImportance();
            Integer valueOf = Integer.valueOf(myImportance);
            Mlog.v("[c] current importance: %s threshold: %s", AnonymousClass001.A1b(valueOf, this.mRestartImportanceThreshold));
            if (checkIfShouldRestartProcess(myImportance)) {
                Mlog.w("[c] low importance: %s: restarting ourselves", valueOf);
                00F.A01("dextricks:MSG_OPT_RESTART_CHECK");
            }
            if (myImportance == -1) {
                Mlog.w("[c] importance unknown: not scheduling further checks", new Object[0]);
                return;
            } else {
                if (!(!this.mDisableProcessRestart)) {
                    Mlog.d("[c] Do not schedule any further restart checks", new Object[0]);
                    return;
                }
                Mlog.v("[c] scheduling another importance check in %sms", AnonymousClass001.A1a(1000));
            }
        }
        sendMessageDelayed(obtainMessage(3), 1000L);
    }
}
