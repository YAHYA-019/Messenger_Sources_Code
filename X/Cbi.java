package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.os.Handler;
import android.os.PowerManager;
import android.os.Vibrator;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.SparseIntArray;
import androidx.media.AudioAttributesCompat;
import androidx.media.AudioAttributesImplApi26;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.messaging.business.bizrtc.model.PageIncomingCallNotification;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.Set;

/* loaded from: Cbi.class */
public final class Cbi implements CallerContextable {
    public static final CallerContext A0D = CallerContext.A08(Cbi.class, "pages_public_view");
    public static final Set A0E = AnonymousClass001.A0v();
    public static final String __redex_internal_original_name = "PageIncomingCallNotificationHandler";
    public 1BY A00;
    public PowerManager.WakeLock A01;
    public final C00i A05 = 1BV.A01((1BY) null, 49358);
    public final C00i A08 = 1BV.A01((1BY) null, 116395);
    public final C00i A0B = 1BQ.A02(84898);
    public final C00i A0C = 1BQ.A02(84858);
    public final C00i A04 = 1BQ.A02(49212);
    public final C00i A03 = 1BQ.A02(65609);
    public final C00i A09 = 1BV.A01((1BY) null, 84854);
    public final C00i A02 = 1BV.A01((1BY) null, 68141);
    public final C00i A07 = 1BV.A01((1BY) null, 68463);
    public final C00i A06 = 1BV.A01((1BY) null, 49844);
    public final Handler A0A = AnonymousClass001.A07();

    public Cbi(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x02de, code lost:
    
        if (r305.equals("NOTIFICATION") != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.app.PendingIntent A00(android.app.PendingIntent r302, android.content.Context r303, com.facebook.messaging.business.bizrtc.model.PageIncomingCallNotification r304, java.lang.String r305, int r306) {
        /*
            Method dump skipped, instructions count: 740
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cbi.A00(android.app.PendingIntent, android.content.Context, com.facebook.messaging.business.bizrtc.model.PageIncomingCallNotification, java.lang.String, int):android.app.PendingIntent");
    }

    public static String A01(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        return 0Pz.A0W(str, str2);
    }

    /* JADX WARN: Type inference failed for: r0v115, types: [java.lang.Object, androidx.media.AudioAttributesCompat] */
    public static void A02(Notification notification, PendingIntent pendingIntent, PendingIntent pendingIntent2, Context context, PageIncomingCallNotification pageIncomingCallNotification, Cbi cbi, int i, boolean z) {
        int ringerMode;
        ((4aO) cbi.A07.get()).A02(i, notification);
        CMD cmd = (CMD) cbi.A0C.get();
        if (cmd.A00) {
            CMD.A00(context);
            C00i c00i = cmd.A02;
            if (!CMD.A05.equals(1BK.A0R(c00i).BD0(51K.A0F)) && !CMD.A00(context)) {
                ((IEj) cmd.A03.get()).A0B(false);
            }
            if (1BK.A0R(c00i).AZn(51K.A0G, true) && !CMD.A00(context) && ((ringerMode = ((AudioManager) cmd.A01.get()).getRingerMode()) == 1 || ringerMode == 2)) {
                SparseIntArray sparseIntArray = AudioAttributesCompat.A01;
                5Vd r0 = new 5Vd();
                AudioAttributes.Builder builder = r0.A00;
                builder.setUsage(6);
                builder.setContentType(4);
                AudioAttributesImplApi26 A00 = r0.A00();
                ?? obj = new Object();
                obj.A00 = A00;
                I9i.A02((Vibrator) cmd.A04.get(), obj, CMD.A06);
            }
        }
        String str = pageIncomingCallNotification.A08;
        String str2 = pageIncomingCallNotification.A02;
        String A01 = A01(str, str2);
        if (!TextUtils.isEmpty(A01)) {
            Set set = A0E;
            synchronized (set) {
                set.add(A01);
            }
        }
        cbi.A0A.postDelayed(new SEU(pendingIntent, pendingIntent2, context, pageIncomingCallNotification, cbi), 60000L);
        C1244Abm c1244Abm = (C1244Abm) cbi.A09.get();
        boolean z2 = !TextUtils.isEmpty(pageIncomingCallNotification.A04);
        if (C1244Abm.A01(c1244Abm)) {
            1UG A08 = 1BK.A08(1BK.A07(c1244Abm.A00), 1BJ.A00(1900));
            if (A08.isSampled()) {
                if (str == null) {
                    str = "";
                }
                A08.A7R("page_id", str);
                A08.A7R("call_id", C1244Abm.A00(c1244Abm, str2));
                A08.A5H("user_name_available", Boolean.valueOf(z2));
                A08.A5H("user_profile_available", Boolean.valueOf(z));
                A08.A6J("extra_info", (java.util.Map) null);
                A08.BZL();
            }
        }
    }

    public void A03(PendingIntent pendingIntent, PendingIntent pendingIntent2, Context context, PageIncomingCallNotification pageIncomingCallNotification, int i) {
        PowerManager.WakeLock newWakeLock;
        String str;
        String A0v;
        2Dp A01;
        boolean contains;
        String str2 = pageIncomingCallNotification.A08;
        String str3 = pageIncomingCallNotification.A02;
        String A012 = A01(str2, str3);
        if (!TextUtils.isEmpty(A012)) {
            Set set = A0E;
            synchronized (set) {
                contains = set.contains(A012);
            }
            if (contains) {
                return;
            }
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null || !powerManager.isScreenOn()) {
            PowerManager powerManager2 = (PowerManager) context.getSystemService("power");
            if (powerManager2 == null) {
                newWakeLock = null;
            } else {
                newWakeLock = powerManager2.newWakeLock(805306394, __redex_internal_original_name);
                0Ew.A02(newWakeLock, __redex_internal_original_name);
                0Iz.A02(newWakeLock);
            }
            this.A01 = newWakeLock;
            if (newWakeLock != null) {
                newWakeLock.acquire(60000L);
                0Ew.A01(newWakeLock, 60000L);
            }
        }
        String str4 = pageIncomingCallNotification.A09;
        if (str4 == null) {
            str = null;
            A0v = null;
        } else {
            str = pageIncomingCallNotification.A04;
            if (str == null) {
                str = context.getString(2131962915);
            }
            A0v = 1BK.A0v(context, str4, 2131962914);
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(A0v)) {
            return;
        }
        C10914uy A00 = AbG.A0l(this.A05).A00(context, null, null, i);
        A00.A0L(str);
        A00.A0K(A0v);
        A00.A0D(A00(pendingIntent, context, pageIncomingCallNotification, "NOTIFICATION", i));
        SpannableString spannableString = new SpannableString(context.getString(2131964903));
        spannableString.setSpan(new ForegroundColorSpan(context.getColor(2132214516)), 0, spannableString.length(), 0);
        A00.A08(A00(pendingIntent, context, pageIncomingCallNotification, "DECLINE", i), spannableString, 2132347257);
        SpannableString spannableString2 = new SpannableString(context.getString(2131964763));
        spannableString2.setSpan(new ForegroundColorSpan(context.getColor(2132214646)), 0, spannableString2.length(), 0);
        A00.A08(A00(pendingIntent, context, pageIncomingCallNotification, "ACCEPT", i), spannableString2, 2132347253);
        5qG r0 = (5qG) this.A06.get();
        Intent A08 = 4YV.A08("fb-messenger-secure://page_rtc_notification_to_account_switch");
        A08.putExtra("PageIncomingCallNotificationConstACCOUNT_SWITCH_ACTION_TYPE", "DELETE");
        A08.putExtra("PageIncomingCallNotificationConstACCOUNT_SWITCH_CALLING_USER_ID", pageIncomingCallNotification.A03);
        A08.putExtra("PageIncomingCallNotificationConstACCOUNT_SWITCH_PAGE_ID", str2);
        A08.putExtra("PageIncomingCallNotificationConstACCOUNT_SWITCH_CALL_ID", str3);
        A00.A0E(r0.A05(A08.addFlags(268435456), pageIncomingCallNotification, 0S2.A00, (String) null, i));
        A00.A0B = pendingIntent;
        C10924uz.A04(A00, 128, true);
        A00.A0B(2132347260);
        ((C10924uz) A00).A03 = 2;
        A00.A0N(false);
        ((C10924uz) A00).A01 = AbG.A00(context);
        String str5 = pageIncomingCallNotification.A05;
        if (TextUtils.isEmpty(str5) || (A01 = 2Dp.A01(str5)) == null) {
            A02(A00.A07(), pendingIntent, pendingIntent2, context, pageIncomingCallNotification, this, i, false);
        } else {
            ((2Ff) this.A03.get()).A0A(A01, A0D).D3K(new ArJ(pendingIntent, pendingIntent2, context, A00, pageIncomingCallNotification, this, i), 1JU.A01);
        }
    }

    public void A04(PendingIntent pendingIntent, PendingIntent pendingIntent2, Context context, PageIncomingCallNotification pageIncomingCallNotification, Integer num, int i) {
        boolean contains;
        2Dp A01;
        String str = pageIncomingCallNotification.A03;
        if (str != null) {
            ((HpJ) this.A0B.get()).A00(str);
        }
        String str2 = pageIncomingCallNotification.A08;
        String str3 = pageIncomingCallNotification.A02;
        C00i c00i = this.A02;
        if (AbK.A0n(c00i).AZk(36313939898604819L)) {
            String A012 = A01(str2, str3);
            if (!TextUtils.isEmpty(A012)) {
                Set set = A0E;
                synchronized (set) {
                    contains = set.contains(A012);
                }
                if (contains && !AbK.A0n(c00i).AZk(36313939900833067L)) {
                    C1244Abm c1244Abm = (C1244Abm) this.A09.get();
                    String str4 = str2;
                    if (C1244Abm.A01(c1244Abm)) {
                        1UG A08 = 1BK.A08(1BK.A07(c1244Abm.A00), "page_rtc_missed_call_notification_impression");
                        if (A08.isSampled()) {
                            if (str2 == null) {
                                str4 = "";
                            }
                            A08.A7R("page_id", str4);
                            A08.BZL();
                        }
                    }
                    String str5 = pageIncomingCallNotification.A04;
                    if (str5 == null) {
                        str5 = context.getString(2131962911);
                    }
                    if (!TextUtils.isEmpty(str5)) {
                        String A0v = 1BK.A0v(context, pageIncomingCallNotification.A09, 2131962912);
                        PendingIntent A00 = A00(pendingIntent, context, pageIncomingCallNotification, "NOTIFICATION", i);
                        C10914uy A002 = AbG.A0l(this.A05).A00(context, null, null, i);
                        A002.A0L(str5);
                        A002.A0K(A0v);
                        A002.A0D(A00);
                        AbH.A1G(A00, context, A002, 2131962910, 2132345168);
                        A002.A0E(pendingIntent2);
                        A002.A0B(2132347259);
                        ((C10924uz) A002).A03 = 2;
                        A002.A0N(true);
                        ((C10924uz) A002).A01 = context.getColor(2132214516);
                        String str6 = pageIncomingCallNotification.A05;
                        if (TextUtils.isEmpty(str6) || (A01 = 2Dp.A01(str6)) == null) {
                            AbN.A0w(A002, this.A07, i);
                        } else {
                            ((2Ff) this.A03.get()).A0A(A01, A0D).D3K(new Q9M(A002, this, i), 1JU.A01);
                        }
                    }
                }
            }
        }
        A05(num, str2, str3, null);
    }

    public void A05(Integer num, String str, String str2, String str3) {
        boolean remove;
        String str4;
        String A01 = A01(str, str2);
        if (TextUtils.isEmpty(A01)) {
            return;
        }
        Set set = A0E;
        synchronized (set) {
            remove = set.remove(A01);
        }
        if (remove) {
            C1244Abm c1244Abm = (C1244Abm) this.A09.get();
            if (C1244Abm.A01(c1244Abm)) {
                1UG A08 = 1BK.A08(1BK.A07(c1244Abm.A00), "page_rtc_notification_dismissed");
                if (A08.isSampled()) {
                    if (str == null) {
                        str = "";
                    }
                    A08.A7R("page_id", str);
                    A08.A7R("call_id", C1244Abm.A00(c1244Abm, str2));
                    switch (num.intValue()) {
                        case 0:
                            str4 = "CALL_HANGUP";
                            break;
                        case 1:
                            str4 = "CLEARED";
                            break;
                        default:
                            str4 = "AUTO_DISMISS";
                            break;
                    }
                    A08.A7R(Property.SYMBOL_Z_ORDER_SOURCE, str4);
                    AbF.A1M(A08, str3);
                    A08.A6J("extra_info", (java.util.Map) null);
                    A08.BZL();
                }
            }
            ((4aO) this.A07.get()).A01(10075);
            CMD cmd = (CMD) this.A0C.get();
            if (cmd.A00) {
                ((Vibrator) cmd.A04.get()).cancel();
                ((IEj) cmd.A03.get()).A06();
            }
            PowerManager.WakeLock wakeLock = this.A01;
            if (wakeLock != null) {
                0Iz.A01(wakeLock);
                this.A01 = null;
            }
        }
    }
}
