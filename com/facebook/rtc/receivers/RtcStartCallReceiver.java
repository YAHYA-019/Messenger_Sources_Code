package com.facebook.rtc.receivers;

import X.11T;
import X.1BL;
import X.1BY;
import X.1Bn;
import X.1Br;
import X.1G2;
import X.1Lm;
import X.1NK;
import X.1Ql;
import X.2QN;
import X.2QO;
import X.2R2;
import X.4YU;
import X.4YV;
import X.4aS;
import X.4zI;
import X.4zJ;
import X.51V;
import X.5Uu;
import X.7zS;
import X.AbM;
import X.AbstractC03303xn;
import X.AnonymousClass000;
import X.BHl;
import X.C01p;
import X.C01q;
import X.C0A2;
import X.C5V0;
import X.C7u;
import X.C7v;
import X.COI;
import X.HCL;
import X.Hrj;
import X.I3V;
import X.I6E;
import X.IFc;
import X.IRF;
import X.IZI;
import X.JOJ;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.rtc.interfaces.CallSurfaceLoggingParams;
import com.facebook.rtc.interfaces.RtcCallVideoOptions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: RtcStartCallReceiver.class */
public final class RtcStartCallReceiver extends 51V {
    public RtcStartCallReceiver() {
        super(new String[]{"RTC_START_CALL_ACTION", "RTC_DECLINE_CALL_ACTION", "RTC_JOIN_CONFERENCE_CALL_ACTION", "RTC_END_CALL_ACTION", "RTC_TRY_SCREEN_SHARING_CALL_ACTION", "RTC_MEETUPS_NOTIFICATION_JOIN_ACTION", "ROOMS_SPEAKEASY_GENERIC_NOTIFICATION_JOIN_WITH_CAMERA_ON_ACTION", "ROOMS_SPEAKEASY_GENERIC_NOTIFICATION_JOIN_WITH_CAMERA_OFF_ACTION", "ROOMS_SPEAKEASY_NOTIFICATION_JOIN_ROOM_ACTION", "RTC_MEETUPS_NOTIFICATION_DISMISS_ACTION"});
    }

    public static final void A01(Context context, Intent intent, FbUserSession fbUserSession, int i, boolean z, boolean z2) {
        String stringExtra = intent.getStringExtra("VIDEO_CHAT_LINK");
        C01p.A00(stringExtra);
        11T.A0A(stringExtra);
        String stringExtra2 = intent.getStringExtra("EXTRA_VIDEO_CHAT_LINK_NOTIF_TAG");
        if (Build.VERSION.SDK_INT <= 30) {
            context.sendBroadcast(4YU.A0A(AnonymousClass000.A00(43)));
        }
        new 4aS(context).A00.cancel(stringExtra2, i);
        ((IFc) 1Lm.A05(context, fbUserSession, 67965)).A07.A04(stringExtra, "vcl_meetups_notification");
        I3V i3v = (I3V) 1Bn.A0E(context, (1BY) null, 115771);
        Uri A03 = C0A2.A03(stringExtra);
        11T.A0A(A03);
        i3v.A01(context, intent, A03, new RtcCallVideoOptions(z, z2), (ImmutableList) null, 4YU.A0k(), "vcl_meetups_notification", (String) null, (String) null, (ArrayList) null, true, true);
    }

    public static final void A02(4aS r301, long j) {
        String valueOf = String.valueOf(j);
        NotificationManager notificationManager = r301.A00;
        notificationManager.cancel(valueOf, 10010);
        notificationManager.cancel(valueOf, 10088);
        1G2 r0 = 1NK.A06;
        1G2 A08 = AbstractC03303xn.A08(valueOf);
        1Ql edit = 1BL.A0W().edit();
        11T.A0A(edit);
        edit.Cdj(A08);
        edit.commit();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0080. Please report as an issue. */
    public void A09(Context context, Intent intent, C01q c01q, String str) {
        4zJ r321;
        Object[] objArr;
        String str2;
        String str3;
        int i;
        Context context2;
        Intent intent2;
        FbUserSession fbUserSession;
        boolean z;
        boolean z2;
        11T.A0F(context, 0);
        7zS.A16(1, intent, c01q, str);
        FbUserSession A0E = 4YV.A0E(context);
        Hrj hrj = (Hrj) 1Bn.A0E(context, (1BY) null, 83913);
        2QN r0 = (2QO) 1Lm.A05(context, A0E, 99977);
        C5V0 c5v0 = (C5V0) 1Lm.A05(context, A0E, 115765);
        1Br A00 = 1Lm.A00(context, A0E, 67965);
        IZI izi = (JOJ) 1Lm.A05(context, A0E, 83902);
        switch (str.hashCode()) {
            case -2057557849:
                if (str.equals("ROOMS_SPEAKEASY_NOTIFICATION_JOIN_ROOM_ACTION")) {
                    i = 10067;
                    context2 = context;
                    intent2 = intent;
                    fbUserSession = A0E;
                    z = true;
                    z2 = false;
                    A01(context2, intent2, fbUserSession, i, z, z2);
                    return;
                }
                r321 = 4zI.A03;
                objArr = new Object[]{str};
                str2 = "RtcStartCallReceiver";
                str3 = "Unknown action for onReceive %s";
                r321.A08(str2, str3, objArr);
                return;
            case -1022656829:
                if (str.equals("RTC_TRY_SCREEN_SHARING_CALL_ACTION")) {
                    c5v0.A0G(A0E, "RtcStartCallReceiver_TryScreenSharingCallAction", false);
                    return;
                }
                r321 = 4zI.A03;
                objArr = new Object[]{str};
                str2 = "RtcStartCallReceiver";
                str3 = "Unknown action for onReceive %s";
                r321.A08(str2, str3, objArr);
                return;
            case -705976141:
                if (str.equals("RTC_MEETUPS_NOTIFICATION_DISMISS_ACTION")) {
                    String stringExtra = intent.getStringExtra("CONFERENCE_NAME");
                    C01p.A00(stringExtra);
                    11T.A0A(stringExtra);
                    String stringExtra2 = intent.getStringExtra("VIDEO_CHAT_LINK");
                    C01p.A00(stringExtra2);
                    11T.A0A(stringExtra2);
                    2R2 A01 = IFc.A01((IFc) 1Lm.A05(context, A0E, 67965), "meetup_notification_dismissed");
                    if (A01 != null) {
                        A01.A0E("links_surface", "vcl_meetups_notification");
                        A01.A0E("links_link_url", stringExtra2);
                        A01.A0E("conference_name", stringExtra);
                        A01.BZL();
                    }
                    4zI.A03.A05("VideoChatLinksAnalyticsLogger", "Event: %s. surface: %s. link: %s", new Object[]{"meetup_notification_dismissed", "vcl_meetups_notification", stringExtra2});
                    return;
                }
                r321 = 4zI.A03;
                objArr = new Object[]{str};
                str2 = "RtcStartCallReceiver";
                str3 = "Unknown action for onReceive %s";
                r321.A08(str2, str3, objArr);
                return;
            case 689688803:
                if (str.equals("RTC_MEETUPS_NOTIFICATION_JOIN_ACTION")) {
                    i = 10065;
                    context2 = context;
                    intent2 = intent;
                    fbUserSession = A0E;
                    z = true;
                    z2 = false;
                    A01(context2, intent2, fbUserSession, i, z, z2);
                    return;
                }
                r321 = 4zI.A03;
                objArr = new Object[]{str};
                str2 = "RtcStartCallReceiver";
                str3 = "Unknown action for onReceive %s";
                r321.A08(str2, str3, objArr);
                return;
            case 810256444:
                if (str.equals("RTC_START_CALL_ACTION")) {
                    ThreadKey threadKey = (ThreadKey) intent.getParcelableExtra("THREAD_KEY");
                    long longExtra = intent.getLongExtra("CONTACT_ID", 0L);
                    boolean booleanExtra = intent.getBooleanExtra("IS_VIDEO_CALL", false);
                    String stringExtra3 = intent.getStringExtra("trigger");
                    C01p.A00(stringExtra3);
                    11T.A0A(stringExtra3);
                    A02(new 4aS(context), longExtra);
                    if (ThreadKey.A0Q(threadKey)) {
                        ((5Uu) 1Bn.A0E(context, (1BY) null, 65938)).A05(context, threadKey, stringExtra3, longExtra, booleanExtra);
                        return;
                    }
                    if (threadKey != null) {
                        ((C5V0) 1Lm.A05(context, A0E, 115765)).A0B(context, A0E, new BHl(threadKey, (CallSurfaceLoggingParams) null, stringExtra3, (String) null, "start_call_receiver", 4001, longExtra, booleanExtra, false));
                        return;
                    }
                    C7v A002 = COI.A00();
                    A002.A01("location", "RtcCallStartReceiver");
                    A002.A01("call_start_error", "threadKey null");
                    A002.A00();
                    return;
                }
                r321 = 4zI.A03;
                objArr = new Object[]{str};
                str2 = "RtcStartCallReceiver";
                str3 = "Unknown action for onReceive %s";
                r321.A08(str2, str3, objArr);
                return;
            case 820612122:
                if (str.equals("ROOMS_SPEAKEASY_GENERIC_NOTIFICATION_JOIN_WITH_CAMERA_ON_ACTION")) {
                    A01(context, intent, A0E, 10067, true, true);
                    return;
                }
                r321 = 4zI.A03;
                objArr = new Object[]{str};
                str2 = "RtcStartCallReceiver";
                str3 = "Unknown action for onReceive %s";
                r321.A08(str2, str3, objArr);
                return;
            case 1405990946:
                if (str.equals("ROOMS_SPEAKEASY_GENERIC_NOTIFICATION_JOIN_WITH_CAMERA_OFF_ACTION")) {
                    i = 10067;
                    context2 = context;
                    intent2 = intent;
                    fbUserSession = A0E;
                    z = false;
                    z2 = true;
                    A01(context2, intent2, fbUserSession, i, z, z2);
                    return;
                }
                r321 = 4zI.A03;
                objArr = new Object[]{str};
                str2 = "RtcStartCallReceiver";
                str3 = "Unknown action for onReceive %s";
                r321.A08(str2, str3, objArr);
                return;
            case 1426052683:
                if (str.equals("RTC_JOIN_CONFERENCE_CALL_ACTION")) {
                    ThreadKey threadKey2 = (ThreadKey) intent.getParcelableExtra("THREAD_KEY");
                    ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("ALL_PARTICIPANTS");
                    Parcelable parcelableExtra = intent.getParcelableExtra("THREAD_SUMMARY");
                    if (parcelableExtra == null && !ThreadKey.A0P(threadKey2)) {
                        r321 = 4zI.A03;
                        objArr = new Object[0];
                        str2 = "RtcStartCallReceiver";
                        str3 = "Received null threadSummary";
                        r321.A08(str2, str3, objArr);
                        return;
                    }
                    boolean booleanExtra2 = intent.getBooleanExtra("IS_VIDEO_CALL", false);
                    String stringExtra4 = intent.getStringExtra("trigger");
                    C01p.A00(stringExtra4);
                    11T.A0A(stringExtra4);
                    String stringExtra5 = intent.getStringExtra("SERVER_INFO_DATA");
                    4aS r02 = new 4aS(context);
                    int intExtra = intent.getIntExtra("notification_id", -1);
                    String stringExtra6 = intent.getStringExtra("notification_tag");
                    if (intExtra != -1 && stringExtra6 != null && stringExtra6.length() != 0) {
                        r02.A00.cancel(stringExtra6, intExtra);
                    }
                    if (ThreadKey.A0P(threadKey2)) {
                        5Uu r03 = (5Uu) 1Bn.A0E(context, (1BY) null, 65938);
                        C01p.A00(threadKey2);
                        11T.A0A(threadKey2);
                        A02(r02, threadKey2.A0r());
                        ImmutableList copyOf = stringArrayListExtra != null ? ImmutableList.copyOf((Collection) stringArrayListExtra) : ImmutableList.of();
                        11T.A0D(copyOf);
                        r03.A04(context, threadKey2, copyOf, stringExtra4, false, booleanExtra2);
                        return;
                    }
                    C7u c7u = (C7u) 1Bn.A0A(99984);
                    C01p.A00(parcelableExtra);
                    11T.A0A(parcelableExtra);
                    ThreadSummary threadSummary = (ThreadSummary) parcelableExtra;
                    ThreadKey threadKey3 = threadSummary.A0n;
                    A02(r02, threadKey3.A0r());
                    c7u.A01(context, threadKey3, threadSummary, stringExtra5, stringExtra4, null, booleanExtra2);
                    return;
                }
                r321 = 4zI.A03;
                objArr = new Object[]{str};
                str2 = "RtcStartCallReceiver";
                str3 = "Unknown action for onReceive %s";
                r321.A08(str2, str3, objArr);
                return;
            case 1550914640:
                if (str.equals("RTC_DECLINE_CALL_ACTION")) {
                    if (r0.A0V) {
                        AbM.A0b(A00).A0N("room_ringback_declined", (String) null, "notification");
                    }
                    I6E.A00(HCL.A0G, intent.getStringExtra(AnonymousClass000.A00(ActionId.POPULATE_CONSISTENCY_MEMORY_CACHE)), null, null);
                    izi.BZo("DECLINE_CALL", ImmutableMap.of((Object) "tag_incomingCallSurface", (Object) "INCOMING_CALL_NOTIFICATION"));
                    hrj.A01(A0E, "RTC_DECLINE_CALL_ACTION received");
                    return;
                }
                r321 = 4zI.A03;
                objArr = new Object[]{str};
                str2 = "RtcStartCallReceiver";
                str3 = "Unknown action for onReceive %s";
                r321.A08(str2, str3, objArr);
                return;
            case 1599493045:
                if (str.equals("RTC_END_CALL_ACTION")) {
                    11T.A0F(A0E, 1);
                    ((IRF) 4YU.A0o(A0E, c5v0.A00, 99979)).A0r("RtcStartCallReceiver_EndCallAction");
                    if (Build.VERSION.SDK_INT <= 30) {
                        context.sendBroadcast(4YU.A0A(AnonymousClass000.A00(43)));
                        return;
                    }
                    return;
                }
                r321 = 4zI.A03;
                objArr = new Object[]{str};
                str2 = "RtcStartCallReceiver";
                str3 = "Unknown action for onReceive %s";
                r321.A08(str2, str3, objArr);
                return;
            default:
                r321 = 4zI.A03;
                objArr = new Object[]{str};
                str2 = "RtcStartCallReceiver";
                str3 = "Unknown action for onReceive %s";
                r321.A08(str2, str3, objArr);
                return;
        }
    }
}
