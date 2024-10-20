package X;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.List;

/* renamed from: X.0fa, reason: invalid class name */
/* loaded from: 0fa.class */
public final class C0fa {
    public C15h A00;
    public 0FL A01 = null;
    public boolean A02 = false;
    public final Context A03;
    public final boolean A04;

    public C0fa(Context context, C15h c15h, boolean z) {
        this.A03 = context;
        this.A04 = z;
        this.A00 = c15h;
    }

    public 0FL A00(int i) {
        0FL r307;
        if (this.A02) {
            return this.A01;
        }
        synchronized (this) {
            if (!this.A02) {
                if (Build.VERSION.SDK_INT >= 30) {
                    this.A01 = 0FL.A00(this.A03, i, this.A04);
                    this.A02 = true;
                } else {
                    this.A02 = true;
                    r307 = null;
                }
            }
            r307 = this.A01;
        }
        return r307;
    }

    public String A01() {
        List<ApplicationExitInfo> historicalProcessExitReasons;
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Context context = this.A03;
        ActivityManager activityManager = (ActivityManager) context.getSystemService(ActivityManager.class);
        if (activityManager == null || (historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(context.getPackageName(), 0, 16)) == null || historicalProcessExitReasons.isEmpty()) {
            return null;
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        for (ApplicationExitInfo applicationExitInfo : historicalProcessExitReasons) {
            A0k.append(applicationExitInfo.getPid());
            A0k.append("::");
            A0k.append(applicationExitInfo.getProcessName());
            A0k.append("::");
            A0k.append(applicationExitInfo.getReason());
            A0k.append("::");
            A0k.append(applicationExitInfo.getTimestamp());
            A0k.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        }
        return A0k.toString();
    }
}
