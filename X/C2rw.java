package X;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: X.2rw, reason: invalid class name */
/* loaded from: 2rw.class */
public abstract class C2rw {
    public static final WeakHashMap A00 = new WeakHashMap();

    public static final boolean A00(Context context) {
        int i;
        Display defaultDisplay;
        if (context == null || (i = Build.VERSION.SDK_INT) < 30) {
            return false;
        }
        WeakHashMap weakHashMap = A00;
        Boolean bool = (Boolean) weakHashMap.get(context);
        if (bool == null) {
            boolean z = false;
            Activity A002 = 0Dg.A00(context);
            if (A002 != null) {
                boolean z2 = true;
                if (i >= 31) {
                    if (!A002.isLaunchedFromBubble()) {
                        Intent intent = A002.getIntent();
                        if (intent != null) {
                            z2 = intent.getBooleanExtra("EXTRA_IS_LAUNCHED_FROM_BUBBLE", false);
                        }
                    }
                    z = z2;
                } else {
                    WindowManager windowManager = A002.getWindowManager();
                    if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null && defaultDisplay.getDisplayId() != 0) {
                        if (!(A002 instanceof DER)) {
                            Class<?> cls = null;
                            ActivityManager activityManager = (ActivityManager) A002.getSystemService("activity");
                            if (activityManager != null) {
                                int taskId = A002.getTaskId();
                                Iterator<ActivityManager.AppTask> it = activityManager.getAppTasks().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    ActivityManager.RecentTaskInfo taskInfo = it.next().getTaskInfo();
                                    11T.A0D(taskInfo);
                                    if (taskInfo.taskId == taskId) {
                                        ComponentName componentName = taskInfo.baseActivity;
                                        if (componentName != null) {
                                            try {
                                                cls = Class.forName(componentName.getClassName());
                                            } catch (ClassNotFoundException unused) {
                                            }
                                            if (cls != null && DER.class.isAssignableFrom(cls)) {
                                                z = true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        z = z2;
                    }
                }
            }
            bool = Boolean.valueOf(z);
            weakHashMap.put(context, bool);
        }
        return bool.booleanValue();
    }
}
