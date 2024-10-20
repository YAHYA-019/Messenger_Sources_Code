package X;

import android.app.ActivityManager;
import android.app.ActivityThread;
import android.app.Application;
import android.app.ApplicationExitInfo;
import android.os.Build;
import java.util.List;

/* renamed from: X.0h4, reason: invalid class name */
/* loaded from: 0h4.class */
public abstract class C0h4 {
    public static int A00 = 255;
    public static int A01 = 255;

    public static boolean A00(int i, int i2) {
        int importance;
        Integer num;
        Integer num2;
        Integer num3;
        if (i != -1) {
            int i3 = Build.VERSION.SDK_INT;
            switch (i3) {
                case 28:
                    switch (i) {
                        case 2:
                            num = 0S2.A01;
                            break;
                        case 3:
                            num = 0S2.A0Y;
                            break;
                        case 4:
                            num = 0S2.A0j;
                            break;
                        case 5:
                            num = 0S2.A0u;
                            break;
                        case 6:
                            num = 0S2.A15;
                            break;
                        case 7:
                            num = 0S2.A1G;
                            break;
                        case 8:
                            num = 0S2.A1J;
                            break;
                        case 9:
                            num = 0S2.A02;
                            break;
                        case 10:
                            num = 0S2.A03;
                            break;
                        case 11:
                            num = 0S2.A04;
                            break;
                        case 12:
                            num = 0S2.A05;
                            break;
                        case 13:
                            num = 0S2.A06;
                            break;
                        case 14:
                            num = 0S2.A07;
                            break;
                        case 15:
                            num = 0S2.A08;
                            break;
                        case 16:
                            num = 0S2.A09;
                            break;
                        case 17:
                            num = 0S2.A0A;
                            break;
                        case 18:
                            num = 0S2.A0B;
                            break;
                        case 19:
                            num = 0S2.A0D;
                            break;
                        default:
                            num = 0S2.A0E;
                            break;
                    }
                    switch (num.intValue()) {
                        case 1:
                        case 4:
                        case 5:
                            return true;
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                            return false;
                    }
                case 29:
                    switch (i) {
                        case 2:
                            num2 = 0S2.A01;
                            break;
                        case 3:
                            num2 = 0S2.A0C;
                            break;
                        case 4:
                            num2 = 0S2.A0N;
                            break;
                        case 5:
                            num2 = 0S2.A0Y;
                            break;
                        case 6:
                            num2 = 0S2.A0j;
                            break;
                        case 7:
                            num2 = 0S2.A0u;
                            break;
                        case 8:
                            num2 = 0S2.A15;
                            break;
                        case 9:
                            num2 = 0S2.A1G;
                            break;
                        case 10:
                            num2 = 0S2.A1J;
                            break;
                        case 11:
                            num2 = 0S2.A02;
                            break;
                        case 12:
                            num2 = 0S2.A03;
                            break;
                        case 13:
                            num2 = 0S2.A04;
                            break;
                        case 14:
                            num2 = 0S2.A05;
                            break;
                        case 15:
                            num2 = 0S2.A06;
                            break;
                        case 16:
                            num2 = 0S2.A07;
                            break;
                        case 17:
                            num2 = 0S2.A08;
                            break;
                        case 18:
                            num2 = 0S2.A09;
                            break;
                        case 19:
                            num2 = 0S2.A0A;
                            break;
                        case 20:
                            num2 = 0S2.A0B;
                            break;
                        case 21:
                            num2 = 0S2.A0D;
                            break;
                        default:
                            num2 = 0S2.A0E;
                            break;
                    }
                    switch (num2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            return true;
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                            return false;
                    }
                default:
                    if (i3 >= 30) {
                        switch (i) {
                            case 2:
                                num3 = 0S2.A01;
                                break;
                            case 3:
                                num3 = 0S2.A0N;
                                break;
                            case 4:
                                num3 = 0S2.A0Y;
                                break;
                            case 5:
                                num3 = 0S2.A0j;
                                break;
                            case 6:
                                num3 = 0S2.A0u;
                                break;
                            case 7:
                                num3 = 0S2.A15;
                                break;
                            case 8:
                                num3 = 0S2.A1G;
                                break;
                            case 9:
                                num3 = 0S2.A1J;
                                break;
                            case 10:
                                num3 = 0S2.A02;
                                break;
                            case 11:
                                num3 = 0S2.A03;
                                break;
                            case 12:
                                num3 = 0S2.A04;
                                break;
                            case 13:
                                num3 = 0S2.A05;
                                break;
                            case 14:
                                num3 = 0S2.A06;
                                break;
                            case 15:
                                num3 = 0S2.A07;
                                break;
                            case 16:
                                num3 = 0S2.A08;
                                break;
                            case 17:
                                num3 = 0S2.A09;
                                break;
                            case 18:
                                num3 = 0S2.A0A;
                                break;
                            case 19:
                                num3 = 0S2.A0B;
                                break;
                            case 20:
                                num3 = 0S2.A0D;
                                break;
                            default:
                                num3 = 0S2.A0E;
                                break;
                        }
                        switch (num3.intValue()) {
                            case 1:
                            case 3:
                            case 4:
                            case 5:
                                return true;
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                                return false;
                        }
                    }
                    break;
            }
        }
        if (Build.VERSION.SDK_INT < 30 || i2 <= 0) {
            return false;
        }
        if (A01 == i2) {
            importance = A00;
        } else {
            Application application = ActivityThread.currentActivityThread().getApplication();
            String packageName = application.getPackageName();
            ActivityManager activityManager = (ActivityManager) application.getSystemService(ActivityManager.class);
            if (activityManager == null) {
                return false;
            }
            List<ApplicationExitInfo> historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(packageName, i2, 1);
            if (historicalProcessExitReasons.isEmpty()) {
                return false;
            }
            ApplicationExitInfo applicationExitInfo = historicalProcessExitReasons.get(0);
            A01 = i2;
            A00 = applicationExitInfo.getImportance();
            importance = applicationExitInfo.getImportance();
        }
        return importance >= 100 && importance <= 125;
    }
}
