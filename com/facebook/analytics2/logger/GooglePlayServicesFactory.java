package com.facebook.analytics2.logger;

import X.0fH;
import X.4mR;
import X.AnonymousClass001;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.analytics2.logger.GooglePlayUploadService;
import com.facebook.common.build.BuildConstants;
import com.facebook.common.gcmcompat.OneoffTask;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesUtil;

/* loaded from: GooglePlayServicesFactory.class */
public class GooglePlayServicesFactory {
    public static final String TAG = "GooglePlayServicesFactory";

    public static boolean canLoadUploaderService() {
        try {
            Class.forName("com.facebook.analytics2.logger.GooglePlayUploadService");
            return true;
        } catch (ClassNotFoundException e) {
            0fH.A12(TAG, "Can't class load GooglePlayUploadService %s, className: %s", e, new Object[]{"com.facebook.analytics2.logger.GooglePlayUploadService"});
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.content.pm.PackageManager] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.content.pm.ApplicationInfo, android.content.pm.PackageItemInfo] */
    public static boolean canUseGooglePlayServices(Context context) {
        Bundle bundle;
        ?? packageManager = context.getPackageManager();
        try {
            packageManager = packageManager.getApplicationInfo(context.getPackageName(), 128);
            if (packageManager == 0 || (bundle = ((PackageItemInfo) packageManager).metaData) == null) {
                return false;
            }
            return bundle.containsKey("com.google.android.gms.version");
        } catch (PackageManager.NameNotFoundException unused) {
            throw AnonymousClass001.A0U(packageManager);
        }
    }

    public static 4mR createUploadSchedulerImpl(final Context context) {
        String str;
        if (!canLoadUploaderService()) {
            str = "Not using Google Play services: failed to load GooglePlayUploadService.";
        } else {
            if (canUseGooglePlayServices(context)) {
                int A04 = GoogleApiAvailability.A00.A04(context, 12451000);
                if (A04 != 0) {
                    boolean z = GooglePlayServicesUtil.A00;
                    0fH.A0h(ConnectionResult.A00(A04), TAG, "Failed to connect to Google Play services: %s");
                    return null;
                }
                0fH.A0j(TAG, "GMS found, scheduling with GcmNetworkManager");
                GooglePlayUploadService.A01(context);
                return new 4mR(context) { // from class: X.34b
                    public final ComponentName A00;
                    public final Context A01;

                    {
                        this.A01 = context;
                        this.A00 = new ComponentName(context, (Class<?>) GooglePlayUploadService.class);
                    }

                    public long A01(int i) {
                        return Long.MAX_VALUE;
                    }

                    public void A02(C1lR c1lR, String str2, int i, long j, long j2) {
                        IllegalArgumentException A0L;
                        Context context2 = this.A01;
                        synchronized (GooglePlayUploadService.class) {
                            GooglePlayUploadService.A01(context2);
                            long j3 = j / 1000;
                            long j4 = j2 / 1000;
                            if (j2 < j) {
                                0fH.A18("GooglePlay-MaxDelay", "MaxDelayms(%d) < MinDelayms(%d)", new Object[]{Long.valueOf(j2), Long.valueOf(j)});
                            }
                            if (j3 >= j4) {
                                j4 = 1 + j3;
                            }
                            Bundle A05 = 1BK.A05();
                            if (str2 != null) {
                                A05.putString("action", str2);
                            }
                            A05.putInt("__VERSION_CODE", BuildConstants.A01());
                            String name = GooglePlayUploadService.class.getName();
                            String A0T = 0Pz.A0T("analytics2-gcm-", i);
                            String str3 = c1lR.A0B;
                            if (str3 != null) {
                                A05.putString("uploader_class", str3);
                            }
                            String str4 = c1lR.A08;
                            if (str4 != null) {
                                A05.putString("flexible_sampling_updater", str4);
                            }
                            String str5 = c1lR.A07;
                            if (str5 != null) {
                                A05.putString("privacy_policy", str5);
                            }
                            String str6 = c1lR.A09;
                            if (str6 != null) {
                                A05.putString("thread_handler_factory", str6);
                            }
                            String str7 = c1lR.A0A;
                            if (str7 != null) {
                                A05.putString("upload_job_instrumentation", str7);
                            }
                            String absolutePath = c1lR.A02.getAbsolutePath();
                            if (absolutePath != null) {
                                A05.putString("priority_dir", absolutePath);
                            }
                            A05.putInt("network_priority", c1lR.A03.intValue());
                            String str8 = c1lR.A06;
                            if (str8 != null) {
                                A05.putString("marauder_tier", str8);
                            }
                            A05.putInt("multi_batch_payload_size", c1lR.A01);
                            A05.putInt("non_sticky_handling", c1lR.A0C ? 1 : 0);
                            A05.putInt("use_fifo_uploads", c1lR.A0D ? 1 : 0);
                            String str9 = c1lR.A04;
                            if (str9 != null) {
                                A05.putString("batch_payload_iterator_factory", str9);
                            }
                            String str10 = c1lR.A00;
                            if (str10 != null) {
                                A05.putString("acs_provider", str10);
                            }
                            String str11 = c1lR.A05;
                            if (str11 != null) {
                                A05.putString("ffdb_provider", str11);
                            }
                            boolean z2 = GooglePlayUploadService.A01;
                            if (name != null) {
                                OneoffTask.A01(A0T);
                                OneoffTask.A00(A05);
                                long j5 = -1;
                                if (j3 == j5 || j4 == j5) {
                                    A0L = AnonymousClass001.A0L("Must specify an execution window using setExecutionWindow.");
                                } else if (j3 < 0 || j4 < 0) {
                                    A0L = AnonymousClass001.A0L("Window start and end cannot be negative.");
                                } else if (j3 < j4) {
                                    GooglePlayUploadService.A03(context2, new OneoffTask(A05, name, A0T, j4, j3, z2), i);
                                    GooglePlayUploadService.A01 = true;
                                } else {
                                    A0L = AnonymousClass001.A0L("Window start must be shorter than window end.");
                                }
                            } else {
                                A0L = AnonymousClass001.A0L("Must provide an endpoint for this task by calling setService(ComponentName).");
                            }
                            throw A0L;
                        }
                    }
                };
            }
            str = "Not using Google Play services: missing required manifest metadata.";
        }
        0fH.A0l(TAG, str);
        return null;
    }
}
