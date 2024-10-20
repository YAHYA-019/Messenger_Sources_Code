package com.google.android.gms.common;

import X.06Z;
import X.0D2;
import X.33B;
import X.3C9;
import X.4vI;
import X.AbstractC00481b7;
import X.AnonymousClass001;
import X.C10924uz;
import X.C3Tb;
import X.LFG;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.util.DeviceProperties;

/* loaded from: GoogleApiAvailability.class */
public final class GoogleApiAvailability extends GoogleApiAvailabilityLight {
    public static final Object A01 = new Object();
    public static final GoogleApiAvailability A00 = new Object();

    public static final AlertDialog A00(Context context, DialogInterface.OnCancelListener onCancelListener, LFG lfg, int i) {
        int i2;
        AlertDialog alertDialog = null;
        if (i != 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
            AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : new AlertDialog.Builder(context);
            builder.setMessage(C3Tb.A01(context, i));
            if (onCancelListener != null) {
                builder.setOnCancelListener(onCancelListener);
            }
            Resources resources = context.getResources();
            if (i == 1) {
                i2 = 2131954416;
            } else if (i != 2) {
                i2 = 2131954413;
                if (i != 3) {
                    i2 = 17039370;
                }
            } else {
                i2 = 2131954423;
            }
            String string = resources.getString(i2);
            if (string != null) {
                builder.setPositiveButton((CharSequence) string, (DialogInterface.OnClickListener) lfg);
            }
            String A02 = C3Tb.A02(context, i);
            if (A02 != null) {
                builder.setTitle(A02);
            }
            Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", AnonymousClass001.A1a(i)), new IllegalArgumentException());
            alertDialog = builder.create();
        }
        return alertDialog;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.32d, android.app.DialogFragment] */
    public static final void A01(Activity activity, Dialog dialog, DialogInterface.OnCancelListener onCancelListener, String str) {
        if (activity instanceof FragmentActivity) {
            06Z BDe = ((FragmentActivity) activity).BDe();
            0D2 r0 = new 0D2();
            AbstractC00481b7.A03(dialog, "Cannot display null dialog");
            dialog.setOnCancelListener(null);
            dialog.setOnDismissListener(null);
            ((33B) r0).A00 = dialog;
            ((33B) r0).A01 = onCancelListener;
            r0.A0m(BDe, str);
            return;
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        ?? dialogFragment = new DialogFragment();
        AbstractC00481b7.A03(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        dialogFragment.A00 = dialog;
        dialogFragment.A01 = onCancelListener;
        dialogFragment.show(fragmentManager, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v53, types: [androidx.core.app.NotificationCompat$BigTextStyle, X.4vI] */
    public static final void A02(PendingIntent pendingIntent, Context context, GoogleApiAvailability googleApiAvailability, int i) {
        String format;
        int i2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i), null), new IllegalArgumentException());
        if (i == 18) {
            new 3C9(context, googleApiAvailability).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String A03 = i == 6 ? C3Tb.A03(context, "common_google_play_services_resolution_required_title") : C3Tb.A02(context, i);
        if (A03 == null) {
            A03 = context.getResources().getString(2131954420);
        }
        if (i == 6 || i == 19) {
            String A002 = C3Tb.A00(context);
            Resources resources = context.getResources();
            String A032 = C3Tb.A03(context, "common_google_play_services_resolution_required_text");
            if (A032 == null) {
                A032 = resources.getString(2131954421);
            }
            format = String.format(resources.getConfiguration().locale, A032, A002);
        } else {
            format = C3Tb.A01(context, i);
        }
        Resources resources2 = context.getResources();
        Object systemService = context.getSystemService("notification");
        AbstractC00481b7.A02(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        C10924uz c10924uz = new C10924uz(context, (String) null);
        c10924uz.A0e = true;
        c10924uz.A0N(true);
        c10924uz.A0L(A03);
        ?? r0 = new 4vI();
        r0.A08(format);
        c10924uz.A0J(r0);
        PackageManager packageManager = context.getPackageManager();
        Boolean bool = DeviceProperties.A00;
        if (bool == null) {
            boolean z = false;
            if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z = true;
            }
            bool = Boolean.valueOf(z);
            DeviceProperties.A00 = bool;
        }
        if (bool.booleanValue()) {
            c10924uz.A0B(((PackageItemInfo) context.getApplicationInfo()).icon);
            c10924uz.A03 = 2;
            if (DeviceProperties.A00(context)) {
                c10924uz.A08(pendingIntent, resources2.getString(2131954432), 2132345073);
            } else {
                c10924uz.A0D(pendingIntent);
            }
        } else {
            c10924uz.A0B(R.drawable.stat_sys_warning);
            c10924uz.A0M(resources2.getString(2131954420));
            c10924uz.A0C(System.currentTimeMillis());
            c10924uz.A0D(pendingIntent);
            c10924uz.A0K(format);
        }
        synchronized (A01) {
        }
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
        String string = context.getResources().getString(2131954419);
        if (notificationChannel != null) {
            if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
            }
            c10924uz.A0S = "com.google.android.gms.availability";
            Notification A07 = c10924uz.A07();
            if (i != 1 || i == 2 || i == 3) {
                GooglePlayServicesUtil.A02.set(false);
                i2 = 10436;
            } else {
                i2 = 39789;
            }
            notificationManager.notify(i2, A07);
        }
        notificationChannel = new NotificationChannel("com.google.android.gms.availability", string, 4);
        notificationManager.createNotificationChannel(notificationChannel);
        c10924uz.A0S = "com.google.android.gms.availability";
        Notification A072 = c10924uz.A07();
        if (i != 1) {
        }
        GooglePlayServicesUtil.A02.set(false);
        i2 = 10436;
        notificationManager.notify(i2, A072);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b7, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:
    
        if (r302.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X.C32i A06(android.content.Context r302, X.3Fo r303) {
        /*
            r301 = this;
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r304 = r0
            r0 = r304
            java.lang.String r1 = "android.intent.action.PACKAGE_ADDED"
            r0.<init>(r1)
            java.lang.String r0 = "package"
            r305 = r0
            r0 = r304
            r1 = r305
            r0.addDataScheme(r1)
            X.32i r0 = new X.32i
            r306 = r0
            r0 = r306
            r1 = r303
            r0.<init>(r1)
            int r0 = android.os.Build.VERSION.SDK_INT
            r307 = r0
            r0 = 33
            r308 = r0
            r0 = r307
            r1 = r308
            if (r0 < r1) goto L50
            r0 = 2
            r308 = r0
            r0 = r302
            r1 = r306
            r2 = r304
            r3 = r308
            android.content.Intent r0 = r0.registerReceiver(r1, r2, r3)
        L3e:
            r0 = r306
            r1 = r302
            r0.A00 = r1
            java.lang.String r0 = "com.google.android.gms"
            r304 = r0
            boolean r0 = com.google.android.gms.common.GooglePlayServicesUtil.A00
            r308 = r0
            goto L5b
        L50:
            r0 = r302
            r1 = r306
            r2 = r304
            android.content.Intent r0 = r0.registerReceiver(r1, r2)
            goto L3e
        L5b:
            r0 = r302
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Throwable -> Ld7
            r305 = r0
            r0 = r305
            android.content.pm.PackageInstaller r0 = r0.getPackageInstaller()     // Catch: java.lang.Throwable -> Ld7
            r305 = r0
            r0 = r305
            java.util.List r0 = r0.getAllSessions()
            r305 = r0
            goto L82
        L72:
            r0 = r308
            if (r0 != 0) goto Lb5
        L77:
            r0 = r303
            r0.A00()
            r0 = r306
            r0.A00()
            r0 = 0
            return r0
        L82:
            r0 = r305
            java.util.Iterator r0 = r0.iterator()
            r309 = r0
        L8b:
            r0 = r309
            boolean r0 = r0.hasNext()
            r308 = r0
            r0 = r308
            if (r0 == 0) goto Lb8
            r0 = r309
            java.lang.Object r0 = r0.next()
            android.content.pm.PackageInstaller$SessionInfo r0 = (android.content.pm.PackageInstaller.SessionInfo) r0
            java.lang.String r0 = r0.getAppPackageName()
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = r0.equals(r1)
            r308 = r0
            r0 = r308
            if (r0 == 0) goto L8b
        Lb5:
            r0 = r306
            return r0
        Lb8:
            r0 = r302
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r309 = r0
            r0 = 8192(0x2000, float:1.148E-41)
            r308 = r0
            r0 = r309
            r1 = r304
            r2 = r308
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r1, r2)     // Catch: java.lang.Throwable -> Ld7
            r305 = r0
            r0 = r305
            boolean r0 = r0.enabled     // Catch: java.lang.Throwable -> Ld7
            r308 = r0
            goto L72
        Ld7:
            goto L77
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GoogleApiAvailability.A06(android.content.Context, X.3Fo):X.32i");
    }
}
