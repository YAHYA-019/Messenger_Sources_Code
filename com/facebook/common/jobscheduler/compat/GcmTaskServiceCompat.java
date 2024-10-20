package com.facebook.common.jobscheduler.compat;

import X.05X;
import X.0FI;
import X.0Pz;
import X.0fH;
import X.1BK;
import X.1Bi;
import X.1Br;
import X.3G9;
import X.49R;
import X.AnonymousClass001;
import X.C00i;
import X.C08o;
import X.C3278Jor;
import X.C3o5;
import X.C49d;
import X.C49f;
import X.C4PY;
import X.JUd;
import X.KPv;
import X.RI0;
import X.Rh8;
import X.RmX;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import com.facebook.bugreporter.core.scheduler.GCMBugReportService;
import com.facebook.common.gcmcompat.OneoffTask;
import com.facebook.conditionalworker.GooglePlayConditionalWorkerService;
import com.facebook.graphql.executor.offlinemutations.OfflineMutationsRetryGCMTaskService;
import com.facebook.inject.FbInjector;
import com.facebook.privacy.acs.falco.FalcoACSProvider;
import com.facebook.push.adm.AdmWorkGCMService;
import com.facebook.push.fcm.GetFcmTokenRegistrarGCMService;
import com.facebook.push.registration.FacebookPushServerFinishNotifiedGCMService;
import com.facebook.push.registration.FacebookPushServerRegistrarGCMService;
import com.facebook.push.registration.PushNegativeFeedbackGCMService;
import com.facebook.pushlite.PushLiteGCMJobService;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: GcmTaskServiceCompat.class */
public abstract class GcmTaskServiceCompat extends JUd {
    public static GoogleApiAvailability A00;
    public static final long A01;
    public static final long A02;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        A01 = timeUnit.toMillis(5);
        A02 = timeUnit.toMillis(2);
        A00 = GoogleApiAvailability.A00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C49d A06() {
        Object A0B;
        C49d c49d;
        if (this instanceof PushLiteGCMJobService) {
            return C3278Jor.A03;
        }
        if (this instanceof PushNegativeFeedbackGCMService) {
            synchronized (this) {
                if (FbInjector.A03 == null) {
                    FbInjector.setApplication(((Service) this).getApplication());
                }
                c49d = (C49d) 1Bi.A03(131220);
            }
            return c49d;
        }
        if (this instanceof FacebookPushServerRegistrarGCMService) {
            synchronized (this) {
                if (FbInjector.A03 == null) {
                    FbInjector.setApplication(((Service) this).getApplication());
                }
                c49d = (C49d) 1Bi.A03(131217);
            }
        } else if (this instanceof FacebookPushServerFinishNotifiedGCMService) {
            FacebookPushServerFinishNotifiedGCMService facebookPushServerFinishNotifiedGCMService = (FacebookPushServerFinishNotifiedGCMService) this;
            synchronized (this) {
                c49d = facebookPushServerFinishNotifiedGCMService.A00;
            }
        } else if (this instanceof GetFcmTokenRegistrarGCMService) {
            GetFcmTokenRegistrarGCMService getFcmTokenRegistrarGCMService = (GetFcmTokenRegistrarGCMService) this;
            synchronized (this) {
                C4PY c4py = getFcmTokenRegistrarGCMService.A00;
                c49d = c4py;
                if (c4py == null) {
                    C4PY c4py2 = (C4PY) 1Bi.A03(131225);
                    getFcmTokenRegistrarGCMService.A00 = c4py2;
                    c49d = c4py2;
                    if (c4py2 == null) {
                        throw 1BK.A0h();
                    }
                }
            }
        } else {
            if (!(this instanceof AdmWorkGCMService)) {
                if (this instanceof OfflineMutationsRetryGCMTaskService) {
                    A0B = 1Bi.A03(115952);
                } else if (this instanceof GooglePlayConditionalWorkerService) {
                    C00i c00i = ((GooglePlayConditionalWorkerService) this).A00;
                    c00i.get();
                    A0B = c00i.get();
                } else {
                    A0B = 1Br.A0B(((GCMBugReportService) this).A00);
                }
                return (C49d) A0B;
            }
            AdmWorkGCMService admWorkGCMService = (AdmWorkGCMService) this;
            synchronized (this) {
                C00i c00i2 = admWorkGCMService.A00;
                c00i2.get();
                c49d = (C49d) c00i2.get();
            }
        }
        return c49d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int A05(RI0 ri0) {
        boolean A012;
        long uptimeMillis;
        long uptimeMillis2 = SystemClock.uptimeMillis();
        String str = ri0.A01;
        49R A002 = 49R.A00(this, 1);
        int parseInt = str.matches("[0-9]+") ? Integer.parseInt(str) : 0;
        Class<?> cls = getClass();
        if (A002.A01(cls, parseInt)) {
            C49f rmX = new RmX();
            Bundle bundle = ri0.A00;
            if (bundle == null) {
                bundle = Bundle.EMPTY;
            }
            if (!A06().A02(bundle, rmX, parseInt)) {
                return 0;
            }
            try {
                uptimeMillis = A02 - (SystemClock.uptimeMillis() - uptimeMillis2);
                while (true) {
                    try {
                        break;
                    } catch (InterruptedException unused) {
                        uptimeMillis = (SystemClock.uptimeMillis() + uptimeMillis) - SystemClock.uptimeMillis();
                    }
                }
            } catch (TimeoutException unused2) {
                A012 = A06().A01(parseInt);
            }
            if (!((RmX) rmX).A00.await(uptimeMillis, TimeUnit.MILLISECONDS)) {
                throw new TimeoutException();
            }
            A012 = ((RmX) rmX).A01;
            return A012 ? 1 : 0;
        }
        0fH.A14("GcmTaskServiceCompat", "Invalid GCM task id, cancelling: %s", new Object[]{str});
        try {
            Rh8 A013 = Rh8.A01(this);
            Context context = A013.A00;
            ComponentName componentName = new ComponentName(context, cls);
            OneoffTask.A01(str);
            Rh8.A02(A013, componentName.getClassName());
            Intent A003 = Rh8.A00(componentName, A013, "CANCEL_TASK");
            if (A003 != null) {
                A003.putExtra(FalcoACSProvider.TAG, str);
                A003.putExtra("component", componentName);
                context.sendBroadcast(A003);
            }
        } catch (IllegalArgumentException e) {
            3G9.A00(new ComponentName((Context) this, cls), this, e);
        }
        Intent intent = C3o5.A0D(this, cls).setAction(0Pz.A0W("com.facebook.common.jobscheduler.compat.GcmTaskServiceCompat.gms.TRY_SCHEDULE-", str)).setPackage(getPackageName());
        05X r0 = new 05X();
        r0.A0C(intent);
        r0.A08();
        PendingIntent A03 = r0.A03(this, 0, 536870912);
        if (A03 == null) {
            return 0;
        }
        ((AlarmManager) getSystemService("alarm")).cancel(A03);
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int onStartCommand(Intent intent, int i, int i2) {
        RuntimeException runtimeException;
        int i3;
        int i4;
        int i5;
        int A012 = C08o.A01(this, 2000333845);
        int A04 = 0FI.A04(-1344329694);
        try {
        } catch (KPv e) {
            0fH.A0r("GcmTaskServiceCompat", "Unexpected service start parameters", e);
            0FI.A0A(258257326, A04);
            C08o.A03(1752497614, A012);
            return 2;
        }
        if (intent != null) {
            String action = intent.getAction();
            if (action == null) {
                0FI.A0A(609333806, A04);
                i3 = -1133190647;
            } else {
                if (!action.startsWith("com.facebook.common.jobscheduler.compat.GcmTaskServiceCompat.gms.TRY_SCHEDULE-")) {
                    if (action.startsWith("com.google")) {
                        i4 = super.onStartCommand(intent, i, i2);
                        0FI.A0A(-1764068050, A04);
                        i5 = -1716326680;
                    } else {
                        A06();
                        i4 = 2;
                        0FI.A0A(-1014263248, A04);
                        i5 = 1912722048;
                    }
                    C08o.A03(i5, A012);
                    return i4;
                }
                Bundle extras = intent.getExtras();
                if (extras.getString("job_tag", null) != null) {
                    OneoffTask oneoffTask = (OneoffTask) extras.getParcelable("task");
                    if (oneoffTask != null) {
                        int i6 = extras.getInt("num_failures", -1);
                        if (i6 > 0) {
                            int A042 = A00.A04(this, 12451000);
                            if (A042 != 0) {
                                if (i6 >= 3) {
                                    String str = oneoffTask.A05;
                                    AtomicBoolean atomicBoolean = GooglePlayServicesUtil.A02;
                                    0fH.A18("GcmTaskServiceCompat", "Job %s was not scheduled because Google Play Services became consistentlyunavailable after initial check: %s", new Object[]{str, ConnectionResult.A00(A042)});
                                } else {
                                    String str2 = oneoffTask.A05;
                                    AtomicBoolean atomicBoolean2 = GooglePlayServicesUtil.A02;
                                    0fH.A0e(str2, ConnectionResult.A00(A042), "GcmTaskServiceCompat", "Job: %s Scheduling Google Play Services retry due to: %s");
                                    int i7 = i6 + 1;
                                    try {
                                        Intent intent2 = C3o5.A0D(this, Class.forName(oneoffTask.A04)).setAction(0Pz.A0W("com.facebook.common.jobscheduler.compat.GcmTaskServiceCompat.gms.TRY_SCHEDULE-", str2)).setPackage(getPackageName());
                                        Bundle A05 = 1BK.A05();
                                        A05.putString("job_tag", str2);
                                        A05.putParcelable("task", oneoffTask);
                                        A05.putInt("num_failures", i7);
                                        intent2.putExtras(A05);
                                        long elapsedRealtime = SystemClock.elapsedRealtime() + A01;
                                        AlarmManager alarmManager = (AlarmManager) getSystemService("alarm");
                                        05X r0 = new 05X();
                                        r0.A0C(intent2);
                                        r0.A08();
                                        alarmManager.set(2, elapsedRealtime, r0.A03(this, 0, 134217728));
                                    } catch (ClassNotFoundException e2) {
                                        runtimeException = AnonymousClass001.A0U(e2);
                                    }
                                }
                                0FI.A0A(-647072025, A04);
                                i3 = -701478998;
                            } else {
                                try {
                                    Rh8.A01(this).A03(oneoffTask);
                                } catch (IllegalArgumentException e3) {
                                    3G9.A00(new ComponentName((Context) this, oneoffTask.A04), this, e3);
                                }
                                0FI.A0A(-647072025, A04);
                                i3 = -701478998;
                            }
                            0fH.A0r("GcmTaskServiceCompat", "Unexpected service start parameters", e);
                            0FI.A0A(258257326, A04);
                            C08o.A03(1752497614, A012);
                            return 2;
                        }
                        new Exception(0Pz.A0T("invalid num_failures: ", i6));
                    } else {
                        new Exception("Missing task");
                    }
                } else {
                    StringBuilder A0k = AnonymousClass001.A0k();
                    A0k.append("Invalid job_tag: ");
                    new Exception(AnonymousClass001.A0a(extras.get("job_tag"), A0k));
                }
            }
            C08o.A03(i3, A012);
            return 2;
        }
        new Exception("Received a null intent, did you ever return START_STICKY?");
        0FI.A0A(852979966, A04);
        C08o.A03(1283764449, A012);
        throw runtimeException;
    }
}
