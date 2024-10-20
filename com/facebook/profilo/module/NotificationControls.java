package com.facebook.profilo.module;

import X.05X;
import X.0H4;
import X.0LP;
import X.0Pz;
import X.0Tb;
import X.1BK;
import X.1BQ;
import X.1Bn;
import X.1G2;
import X.1Gz;
import X.1HH;
import X.1HN;
import X.1Ql;
import X.AnonymousClass001;
import X.C00i;
import X.C03w;
import X.C0lp;
import X.C10924uz;
import X.C51z;
import X.DKB;
import android.R;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import androidx.core.app.NotificationCompat$BigTextStyle;
import com.facebook.inject.FbInjector;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.profilo.ipc.TraceConfigExtras;
import com.facebook.profilo.ipc.TraceContext;
import java.util.List;

/* loaded from: NotificationControls.class */
public final class NotificationControls implements C03w, 1HN {
    public Notification A00;
    public Context A01;
    public NotificationCompat$BigTextStyle A02;
    public C10924uz A03;
    public 1Gz A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final C00i A09;
    public final C00i A0A;
    public final C00i A0B;
    public final C00i A0C;
    public static final String A0F = 0Pz.A0T("com.facebook.profilo.CONTROL_TOGGLE.", Process.myPid());
    public static final String A0E = 0Pz.A0T("com.facebook.profilo.DISMISS.", Process.myPid());
    public static final String A0D = 0Pz.A0T("com.facebook.profilo.COPY.", Process.myPid());
    public static final String A0G = 0Pz.A0T("com.facebook.profilo.STOP.", Process.myPid());

    public NotificationControls() {
        Context context = (Context) 1Bn.A0A(83719);
        this.A01 = context;
        this.A0C = new 1HH(context, 100188);
        this.A0B = new 1BQ(33013);
        this.A0A = FbInjector.A00;
        this.A09 = new 1BQ(16885);
        this.A07 = false;
        this.A06 = false;
        this.A08 = true;
    }

    private PendingIntent A00(String str) {
        05X r0 = new 05X();
        r0.A08();
        r0.A0A();
        r0.A0C(new Intent(str));
        return r0.A02(1BK.A04(this.A0A), 0, 134217728);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Throwable, android.app.NotificationManager] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A01(int r302, android.app.Notification r303) {
        /*
            r301 = this;
            r0 = r303
            if (r0 == 0) goto L1d
            r0 = r301
            X.00i r0 = r0.A0C     // Catch: java.lang.NullPointerException -> L1c
            r304 = r0
            r0 = r304
            java.lang.Object r0 = r0.get()     // Catch: java.lang.NullPointerException -> L1c
            r304 = r0
            r0 = r304
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0     // Catch: java.lang.NullPointerException -> L1c
            r304 = r0
            r0 = r304
            r1 = r302
            r2 = r303
            r0.notify(r1, r2)     // Catch: java.lang.NullPointerException -> L1c
            return
        L1c:
            throw r0
        L1d:
            java.lang.String r0 = "notification can't be null"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0L(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.profilo.module.NotificationControls.A01(int, android.app.Notification):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:177:0x0198, code lost:
    
        if (X.AnonymousClass001.A1Y(r309) == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x021b, code lost:
    
        throw r309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0200, code lost:
    
        if (X.AnonymousClass001.A1Y(r309) == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01d3, code lost:
    
        if (r0.A01.checkSignatures(r0, r0) != 0) goto L120;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x021c  */
    /* JADX WARN: Type inference failed for: r0v174, types: [androidx.core.app.NotificationCompat$BigTextStyle, X.4vI] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A02(com.facebook.profilo.module.NotificationControls r301, boolean r302) {
        /*
            Method dump skipped, instructions count: 1178
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.profilo.module.NotificationControls.A02(com.facebook.profilo.module.NotificationControls, boolean):void");
    }

    private void A03(boolean z) {
        String str;
        CharSequence charSequence;
        String format;
        CharSequence charSequence2;
        0H4 r0 = 0H4.A0C;
        if (r0 == null) {
            throw AnonymousClass001.A0N("TraceControl is null and we're showing a notification");
        }
        String[] A0G2 = r0.A0G();
        String str2 = A0G2 != null ? A0G2[A0G2.length - 1] : "Not tracing";
        StringBuilder A0k = AnonymousClass001.A0k();
        if (z) {
            charSequence = "Tap to stop and upload trace";
            format = String.format("%s\n\nTrace ID: %s\n\n%s", charSequence, str2, A0k.toString());
            str = "Performance tracing started";
            charSequence2 = "Profilo is weaving";
        } else {
            str = this.A08 ? "Performance tracing ready" : "Performance tracing stopped";
            charSequence = "Tap to start tracing";
            format = String.format("%s\n\n%s", charSequence, A0k.toString());
            charSequence2 = "Profilo is primed and ready";
        }
        C10924uz c10924uz = this.A03;
        c10924uz.A0M(str);
        c10924uz.A0L(charSequence2);
        c10924uz.A0K(charSequence);
        NotificationCompat$BigTextStyle notificationCompat$BigTextStyle = this.A02;
        notificationCompat$BigTextStyle.A08(format);
        c10924uz.A0J(notificationCompat$BigTextStyle);
        Notification A07 = c10924uz.A07();
        this.A00 = A07;
        this.A08 = false;
        A01(200, A07);
    }

    public void A04(TraceContext traceContext, boolean z) {
        synchronized (this) {
            if (traceContext.A01 == 0Tb.A00 && this.A07 && this.A06 != z) {
                this.A06 = z;
                A03(z);
            }
        }
    }

    public void A05(Integer num, int i) {
        String str;
        CharSequence charSequence;
        synchronized (this) {
            if (this.A07) {
                int intValue = num.intValue();
                if (intValue == 0) {
                    str = "Uploading Profilo trace";
                    charSequence = "Uploading trace";
                } else if (intValue != 1) {
                    String str2 = "Unknown";
                    if (i == 1) {
                        str2 = DKB.A00(271);
                    } else if (i == 2) {
                        str2 = "No connection";
                    } else if (i == 3) {
                        str2 = "No bytes remaining";
                    }
                    str = 0Pz.A0W("Trace upload failed. Reason: ", str2);
                    charSequence = "Upload failed";
                } else {
                    str = "Trace upload was successful";
                    charSequence = "Upload successful";
                }
                C10924uz c10924uz = new C10924uz(1BK.A04(this.A0A), (String) null);
                c10924uz.A03 = -1;
                c10924uz.A0T = "profilo";
                c10924uz.A0B(R.drawable.ic_menu_upload);
                c10924uz.A0L(str);
                c10924uz.A0S = "profilo_channel";
                c10924uz.A0M(charSequence);
                A01(201, c10924uz.A07());
            }
        }
    }

    @Override // X.C03w
    public void BqL(C0lp c0lp) {
        synchronized (this) {
            C00i c00i = this.A0B;
            FbSharedPreferences A0R = 1BK.A0R(c00i);
            1G2 r0 = C51z.A02;
            boolean z = false;
            boolean AZn = A0R.AZn(r0, false);
            if (c0lp != null) {
                z = true;
            }
            if (AZn != z) {
                1Ql.A03(r0, c00i.get(), z);
            }
        }
    }

    public void onSharedPreferenceChanged(FbSharedPreferences fbSharedPreferences, 1G2 r303) {
        synchronized (this) {
            1G2 r0 = C51z.A02;
            if (r303.equals(r0)) {
                boolean A1T = 1BK.A1T(fbSharedPreferences, r0);
                if (A1T != AnonymousClass001.A1T(0LP.A00().A00)) {
                    if (A1T) {
                        0LP.A00().A02((TraceConfigExtras) null, (List) null);
                    } else {
                        0LP.A00().A01();
                    }
                }
                A02(this, A1T);
            }
        }
    }
}
