package com.facebook.messenger.crashloop;

import X.0OK;
import X.C0A2;
import android.content.Context;
import android.net.Uri;
import com.facebook.sosource.bsod.BSODActivity;
import java.util.Arrays;

/* loaded from: MessengerCrashLoopRemedyHandler.class */
public class MessengerCrashLoopRemedyHandler extends 0OK {
    public static final Uri A00 = C0A2.A03("https://www.facebook.com/help/messenger-app/522894144496549");
    public static final String[] A01 = {"user_storage_device_key", "tincan_db.*"};

    /* JADX WARN: Code restructure failed: missing block: B:160:0x0403, code lost:
    
        if (r317 != null) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x040f, code lost:
    
        if (r317 == X.0S2.A00) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x043a, code lost:
    
        r0 = r317.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x044c, code lost:
    
        switch(r0) {
            case 1: goto L196;
            case 2: goto L197;
            case 3: goto L198;
            case 4: goto L199;
            default: goto L174;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x046c, code lost:
    
        r307 = "NO_OP";
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0471, code lost:
    
        android.util.Log.d("MessengerCrashLoopRemedyHandler", X.0Pz.A0W("Got remediation code: ", r307));
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0485, code lost:
    
        if (r0 == 0) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x048f, code lost:
    
        if (r0 == 1) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0499, code lost:
    
        if (r0 == 2) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x04a3, code lost:
    
        if (r0 == 3) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x04ad, code lost:
    
        if (r0 != 4) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x04b0, code lost:
    
        X.0OK.A02(r302);
        r0 = r302.getFilesDir();
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x04bc, code lost:
    
        if (r0 == null) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x04bf, code lost:
    
        r0 = r0.listFiles();
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x04c8, code lost:
    
        if (r0 == null) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x04cb, code lost:
    
        android.util.Log.d("CrashLoopRemedy", "clearing mobileconfig dir ");
        r0 = r0.length;
        r323 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x04ec, code lost:
    
        if (r323 >= r0) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x04ef, code lost:
    
        r0 = r0[r323];
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x050d, code lost:
    
        if (r0.getName().equals("mobileconfig") == false) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0510, code lost:
    
        X.0OK.A03(r0, new java.lang.String[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x051d, code lost:
    
        r323 = r323 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x05cb, code lost:
    
        r302.getSharedPreferences("crash_loop_critical_data", 0).edit().putLong("backoff_until", java.lang.System.currentTimeMillis() + 10800000).commit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0609, code lost:
    
        return new X.0lL(true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x058b, code lost:
    
        r307 = new java.lang.String[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x05c4, code lost:
    
        A07(r302, r307);
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x05bf, code lost:
    
        r307 = com.facebook.messenger.crashloop.MessengerCrashLoopRemedyHandler.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0594, code lost:
    
        r302.startActivity(new android.content.Intent("android.intent.action.VIEW", com.facebook.messenger.crashloop.MessengerCrashLoopRemedyHandler.A00).addFlags(268435456));
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x054e, code lost:
    
        r302.getSharedPreferences("crash_loop_critical_data", 0).edit().putLong("backoff_until", java.lang.System.currentTimeMillis() + 1800000).commit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0526, code lost:
    
        r307 = "LAUNCH_URL";
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x052e, code lost:
    
        r307 = "CLEAN_RECOVERABLE_STATE";
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0536, code lost:
    
        r307 = "CLEAN_STATE";
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x053e, code lost:
    
        r307 = "CLEAN_MOBILECONFIG_STATE";
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0432, code lost:
    
        if (new java.io.File(r302.getApplicationInfo().dataDir, "flags/is_employee").exists() == false) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0435, code lost:
    
        r317 = X.0S2.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0548, code lost:
    
        if (r317 != null) goto L172;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.0lL A04(android.content.Context r302, int r303, int r304) {
        /*
            Method dump skipped, instructions count: 1550
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messenger.crashloop.MessengerCrashLoopRemedyHandler.A04(android.content.Context, int, int):X.0lL");
    }

    public String A05() {
        return "Messenger Crash Loop Remedy";
    }

    public void A06(Context context, String str, int i) {
        BSODActivity.A00(context, 2131951714, 2131951713, 2131951712, 2131952789);
    }

    public String[] A08(Context context) {
        String[] strArr = (String[]) Arrays.copyOf(0OK.A00, 10);
        System.arraycopy(new String[]{"instacrash_threshold", "instacrash_interval"}, 0, strArr, 8, 2);
        return strArr;
    }
}
