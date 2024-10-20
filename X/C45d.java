package X;

import android.app.ActivityManager;
import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.acra.constants.ActionId;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.common.netchecker.NetChecker;
import com.facebook.common.network.FbNetworkManager;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.notify.type.MessageReactionNotification;
import com.facebook.messaging.notify.type.MessageRequestNotification;
import com.facebook.messaging.notify.type.MessagingNotification;
import com.facebook.messaging.notify.type.NewMessageNotification;
import com.facebook.messaging.service.model.MarkThreadFields;
import com.facebook.messaging.service.model.SendMessageParams;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.push.constants.PushProperty;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.facebook.user.model.UserKey;
import com.google.common.base.Throwables;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMap;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.45d, reason: invalid class name */
/* loaded from: 45d.class */
public final class C45d {
    public final 2Iq A00;
    public final C01443r5 A01;
    public final C45m A02;
    public final NetChecker A03;
    public final C0qy A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final 1Br A0D;
    public final 1Br A0E;
    public final 1Br A0F;
    public final C00653oY A0G;
    public final C45o A0H;
    public final C1m1 A0I;
    public final ActivityManager.MemoryInfo A0J;
    public final Context A0K;

    public C45d() {
        Context A00 = FbInjector.A00();
        11T.A0A(A00);
        this.A0K = A00;
        this.A04 = (C0qy) 1Bi.A03(83603);
        this.A03 = (NetChecker) 1Bi.A03(32903);
        this.A02 = (C45m) 1Bi.A03(32905);
        this.A05 = 1Bq.A00(99390);
        this.A0D = 1Bq.A00(84488);
        this.A0E = 1Bq.A00(68335);
        this.A09 = 1Bq.A00(66934);
        this.A01 = (C01443r5) 1Bi.A03(32798);
        this.A07 = 1Bq.A00(16634);
        this.A00 = (2Iq) 1Bi.A03(16960);
        this.A0G = (C00653oY) 1Bi.A03(32769);
        this.A0A = 1Bq.A00(116076);
        this.A0I = (C1m1) 1Bi.A03(16782);
        this.A0B = 1Bu.A00(66592);
        this.A0J = new ActivityManager.MemoryInfo();
        this.A06 = 1Bq.A00(16687);
        this.A0H = (C45o) 1Bi.A03(32906);
        this.A08 = 1Bq.A00(83846);
        this.A0F = 1Bq.A00(83868);
        this.A0C = 1Bq.A00(83227);
    }

    public static final ImmutableMap A00(ImmutableMap immutableMap) {
        ImmutableMap.Builder builder = new ImmutableMap.Builder(4);
        if (immutableMap != null) {
            Iterator it = immutableMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(it);
                String A0j = AnonymousClass001.A0j(A0z);
                builder.put(0Pz.A0W("client_tag_", A0j), A0z.getValue());
            }
        }
        ImmutableMap build = builder.build();
        11T.A0A(build);
        return build;
    }

    public static final Integer A01(MessagingNotification messagingNotification) {
        PushProperty pushProperty = messagingNotification.A02;
        return 5bI.A00(pushProperty != null ? pushProperty.A04 : null);
    }

    public static final String A02(C45d c45d) {
        return String.valueOf(((C0dp) c45d.A05.A00.get()).now());
    }

    public static final String A03(C45d c45d, long j) {
        return String.valueOf(((C0dr) c45d.A0D.A00.get()).now() - j);
    }

    public static final String A04(ImmutableList immutableList) {
        if (immutableList.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        boolean z = true;
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!z) {
                sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            }
            sb.append('\"');
            sb.append(str);
            sb.append('\"');
            z = false;
        }
        sb.append("]");
        return sb.toString();
    }

    public static final String A05(1Mv r301) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : r301.keySet()) {
            for (Object obj2 : r301.AUg(obj)) {
                sb.append("{\"");
                sb.append(obj.toString());
                sb.append("\":\"");
                sb.append(obj2.toString());
                sb.append("\"}");
                sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            }
        }
        sb.append("]");
        String obj3 = sb.toString();
        11T.A0A(obj3);
        return obj3;
    }

    public static final void A06(Bxz bxz, java.util.Map map, boolean z) {
        A0C(1BJ.A00(571), map, bxz.A06);
        A0C("photo_attachment_count", map, bxz.A02);
        A0C("video_attachment_count", map, bxz.A05);
        A0C("audio_attachment_count", map, bxz.A00);
        A0C("sticker_attachment_count", map, bxz.A04);
        A0C("like_attachment_count", map, bxz.A01);
        A0C("share_attachment_count", map, bxz.A03);
        ImmutableList immutableList = bxz.A07;
        if (!immutableList.isEmpty()) {
            map.put("attachment_mime_type_list", A04(immutableList));
        }
        if (z) {
            ImmutableListMultimap immutableListMultimap = bxz.A08;
            if (immutableListMultimap.isEmpty()) {
                return;
            }
            map.put("type_source_map", A05(immutableListMultimap));
        }
    }

    public static final void A07(ThreadKey threadKey, java.util.Map map) {
        C1yg c1yg;
        String valueOf;
        Object obj;
        if (threadKey == null || (c1yg = threadKey.A06) == null) {
            return;
        }
        int ordinal = c1yg.ordinal();
        if (ordinal == 1 || ordinal == 23) {
            valueOf = String.valueOf(threadKey.A04);
            obj = "thread_fbid";
        } else if (ordinal == 0) {
            valueOf = String.valueOf(threadKey.A02);
            obj = "user_fbid";
        } else {
            if (ordinal != 7) {
                return;
            }
            valueOf = String.valueOf(threadKey.A04);
            obj = "sms_tid";
        }
        map.put(obj, valueOf);
    }

    public static final void A08(C45d c45d, PushProperty pushProperty, String str, String str2) {
        double A03 = C05c.A03(c45d.A0K) / 1.073741824E9d;
        String str3 = (0.0d > A03 || A03 > 0.75d) ? (75.0d > A03 || A03 > 100.0d) ? (100.0d > A03 || A03 > 150.0d) ? (150.0d > A03 || A03 > 200.0d) ? (200.0d > A03 || A03 > 300.0d) ? (300.0d > A03 || A03 > 400.0d) ? "4+ gb" : "3-4 gb" : "2-3 gb" : "1.5-2 gb" : "1-1.5 gb" : "0.75-1 gb" : "0-0.75 gb";
        0fH.A0a(str, pushProperty, str2, "MessagesReliabilityLogger", "notif_debug event_type: %s pushProperty: %s debugInfo: %s");
        1UG A00 = 1UD.A00((04J) c45d.A07.A00.get(), 1ZG.A01, "notif_debug");
        boolean isSampled = A00.isSampled();
        if (pushProperty == null) {
            if (!isSampled) {
                return;
            }
            A00.A7R(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
            A00.A7R("debug_info", str2);
        } else {
            if (!isSampled) {
                return;
            }
            A00.A7R("debug_info", str2);
            A00.A7R("message_id", pushProperty.A08);
            A00.A7R("notif_type", pushProperty.A0B);
            A00.A7R("push_id", pushProperty.A0A);
            A00.A7R(Property.SYMBOL_Z_ORDER_SOURCE, pushProperty.A04.toString());
            A00.A7R(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
            A00.A7R("sender_id", pushProperty.A0E);
            A00.A7R("delivery_id", pushProperty.A06);
            A00.A7R("ram_class", str3);
            A00.A5H("is_memory_low", Boolean.valueOf(c45d.A0J.lowMemory));
            A00.A7R("connection_state", ((FbNetworkManager) c45d.A06.A00.get()).A0E());
        }
        A00.BZL();
    }

    public static final void A09(C45d c45d, java.util.Map map) {
        2Jy r0 = new 2Jy("notif_abnormal");
        for (Map.Entry entry : map.entrySet()) {
            r0.A0D((String) entry.getKey(), (String) entry.getValue());
        }
        c45d.A01.A03(r0);
    }

    private final void A0A(MessagingNotification messagingNotification, String str, 0Be r304, boolean z) {
        String str2;
        String str3;
        String str4;
        String str5;
        String obj = 4rH.A03.toString();
        PushProperty pushProperty = messagingNotification.A02;
        if (11T.A0O(obj, pushProperty == null ? null : pushProperty.A04.toString())) {
            if (messagingNotification instanceof NewMessageNotification) {
                NewMessageNotification newMessageNotification = (NewMessageNotification) messagingNotification;
                String str6 = newMessageNotification.A0H.A1V;
                if (str6 != null) {
                    String A00 = C5p9.A00(str6);
                    if (A00 == null) {
                        0fH.A0j("MessagesReliabilityLogger", "We cannot find the armadillo msg id due its violation of act_notification_id_$id format or _ is the last index");
                        return;
                    }
                    r304.invoke(A00, str6, newMessageNotification.A08, newMessageNotification.A06);
                    ((C21p) this.A0B.A00.get()).A04(null, "secure_message", "notif_displayed", A00, str6, null, null, null, null);
                    ((5Jh) 1Lm.A06(((1Fv) 1Bi.A03(66351)).A04(), 68577)).A01(newMessageNotification.A07, newMessageNotification.A05, newMessageNotification.A08, str, !z);
                    return;
                }
                return;
            }
            if (messagingNotification instanceof MessageReactionNotification) {
                MessageReactionNotification messageReactionNotification = (MessageReactionNotification) messagingNotification;
                String str7 = messageReactionNotification.A02;
                String str8 = messageReactionNotification.A05;
                if (str7 == null || str8 == null) {
                    str2 = "try to log reaction notification but msg id or notification id is null";
                    0fH.A0o("MessagesReliabilityLogger", str2);
                    return;
                }
                str3 = messageReactionNotification.A08;
                r304.invoke(str7, str8, str3, messageReactionNotification.A06);
                ((C21p) this.A0B.A00.get()).A04(null, "secure_message", "notif_displayed", str7, str8, null, null, null, "Reaction notification");
                str4 = messageReactionNotification.A07;
                str5 = messageReactionNotification.A04;
                ((5Jh) 1Lm.A06(((1Fv) 1Bi.A03(66351)).A04(), 68577)).A01(str4, str5, str3, str, !z);
            }
            if (messagingNotification instanceof MessageRequestNotification) {
                MessageRequestNotification messageRequestNotification = (MessageRequestNotification) messagingNotification;
                String str9 = messageRequestNotification.A02;
                String str10 = messageRequestNotification.A05;
                if (str9 == null || str10 == null) {
                    str2 = "tried to log message request notification but msg id or notification id is null";
                    0fH.A0o("MessagesReliabilityLogger", str2);
                    return;
                }
                str3 = messageRequestNotification.A07;
                r304.invoke(str9, str10, str3, (Object) null);
                ((C21p) 1Br.A0B(this.A0B)).A02(null, 1BJ.A00(2018), "notif_displayed", str9, str10, "Message request notification");
                str4 = messageRequestNotification.A06;
                str5 = messageRequestNotification.A04;
                ((5Jh) 1Lm.A06(((1Fv) 1Bi.A03(66351)).A04(), 68577)).A01(str4, str5, str3, str, !z);
            }
        }
    }

    public static void A0B(ImmutableList immutableList, ImmutableListMultimap immutableListMultimap, java.util.Map map, int i, int i2, int i3, int i4, int i5, int i6, long j, boolean z) {
        A0C(1BJ.A00(571), map, j);
        A0C("photo_attachment_count", map, i3);
        A0C("video_attachment_count", map, i6);
        A0C("audio_attachment_count", map, i);
        A0C("sticker_attachment_count", map, i5);
        A0C("like_attachment_count", map, i2);
        A0C("share_attachment_count", map, i4);
        if (!immutableList.isEmpty()) {
            map.put("attachment_mime_type_list", A04(immutableList));
        }
        if (!z || immutableListMultimap.isEmpty()) {
            return;
        }
        map.put("type_source_map", A05(immutableListMultimap));
    }

    public static final void A0C(String str, java.util.Map map, long j) {
        if (j > 0) {
            map.put(str, Long.toString(j));
        }
    }

    public final void A0D(DLB dlb, MessagingNotification messagingNotification, String str, boolean z) {
        Long l;
        A0A(messagingNotification, str, new 5bK(this, str), true);
        C1253Abv.A01((C1253Abv) this.A08.A00.get(), messagingNotification.A02, str);
        C1233Aba c1233Aba = (C1233Aba) this.A0F.A00.get();
        String str2 = messagingNotification instanceof MessageReactionNotification ? ((MessageReactionNotification) messagingNotification).A02 : messagingNotification instanceof NewMessageNotification ? ((NewMessageNotification) messagingNotification).A0H.A1V : null;
        String str3 = null;
        if ((messagingNotification instanceof NewMessageNotification) && (l = ((NewMessageNotification) messagingNotification).A04) != null) {
            str3 = String.valueOf(l);
        }
        if (z) {
            c1233Aba.A00(dlb, str2, str3);
        } else {
            c1233Aba.A01(dlb, str2, str3, false);
        }
    }

    public final void A0E(DLB dlb, NewMessageNotification newMessageNotification, String str, String str2, boolean z) {
        if (newMessageNotification.A04()) {
            A08(this, ((MessagingNotification) newMessageNotification).A02, str, str2);
            if (z) {
                A0D(dlb, newMessageNotification, str, false);
            }
        }
    }

    public final void A0F(DLB dlb, NewMessageNotification newMessageNotification, String str, boolean z) {
        if (newMessageNotification.A04()) {
            HashMap A0u = AnonymousClass001.A0u();
            A0u.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
            HashMap A03 = newMessageNotification.A03();
            11T.A0A(A03);
            A0u.putAll(A03);
            A09(this, A0u);
            if (z) {
                A0D(dlb, newMessageNotification, str, true);
            }
        }
    }

    public final void A0G(Message message) {
        this.A01.A0D("msg_error_retry_selected", C45m.A00("offline_threading_id", message.A1g, "send_error", message.A08().A02.serializedString));
    }

    public final void A0H(Message message, ThreadKey threadKey, C5ap c5ap, String str, boolean z) {
        UserKey userKey;
        if (threadKey != null) {
            1UG A00 = 1UD.A00((04J) this.A07.A00.get(), 1ZG.A01, 1BJ.A00(1695));
            if (A00.isSampled()) {
                A00.A7R("thread", threadKey.A0u());
                A00.A7R("action", str);
                if (message != null) {
                    A00.A7R("offlineThreadId", message.A1g);
                    ParticipantInfo participantInfo = message.A0K;
                    A00.A7R("messageId", message.A1V);
                    if (participantInfo != null && (userKey = participantInfo.A0F) != null) {
                        String str2 = userKey.id;
                        11T.A0A(str2);
                        A00.A6H("sender_id", Long.valueOf(Long.parseLong(str2)));
                    }
                }
                A00.A7R("info", z ? OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_SUCCESS : "failed");
                if (c5ap != null) {
                    A00.A7R("notification_type", c5ap.toString());
                }
                A00.BZL();
            }
        }
    }

    public final void A0I(Bxz bxz, BPV bpv, SendMessageParams sendMessageParams, String str, long j, boolean z) {
        String A01;
        11T.A0F(bpv, 3);
        Message message = sendMessageParams.A05;
        11T.A09(message);
        String A0W = 0Pz.A0W(AbE.A00(592), str);
        ImmutableMap A00 = A00(message.A13);
        String[] strArr = new String[28];
        String str2 = message.A1g;
        String A002 = 1BJ.A00(227);
        String valueOf = String.valueOf(message.A04);
        String A003 = 1BJ.A00(2025);
        String valueOf2 = String.valueOf(j);
        String A004 = 1BJ.A00(178);
        String obj = bpv.failedMessage.A08().A02.toString();
        String message2 = bpv.getMessage();
        String A02 = A02(this);
        String A005 = 1BJ.A00(ActionId.ON_VIEW_CREATED_END);
        String bool = Boolean.toString(z);
        String A006 = 1BJ.A00(1832);
        NetChecker netChecker = this.A03;
        System.arraycopy(new String[]{"offline_threading_id", str2, A002, valueOf, A003, valueOf2, A004, obj, "error_message", message2, "current_time", A02, A005, bool, "channel", "graph", A006, netChecker.A0B.toString(), 1BJ.A00(1459), String.valueOf(netChecker.A0A), TraceFieldType.RetryCount, String.valueOf(sendMessageParams.A01), "first_send_delta", A03(this, sendMessageParams.A03), "first_message_first_send_delta", A03(this, sendMessageParams.A02), "message_type"}, 0, strArr, 0, 27);
        System.arraycopy(new String[]{this.A0G.A01(message)}, 0, strArr, 27, 1);
        HashMap A007 = C45m.A00(strArr);
        if (!A00.isEmpty()) {
            A007.putAll(A00);
        }
        A07(message.A0V, A007);
        A06(bxz, A007, false);
        C0er c0er = this.A04.A01;
        C0er c0er2 = C0er.PUBLIC;
        String A008 = AnonymousClass000.A00(9);
        if (c0er == c0er2) {
            if (bpv.getCause() instanceof NullPointerException) {
                A01 = 0G8.A01(bpv.getCause());
            }
            this.A01.A07(A0W, "failed", null, null, null, A007);
        }
        A01 = 0G8.A01(bpv);
        A007.put(A008, A01);
        this.A01.A07(A0W, "failed", null, null, null, A007);
    }

    public final void A0J(Bxz bxz, SendMessageParams sendMessageParams, Integer num, boolean z) {
        Message message = sendMessageParams.A05;
        11T.A09(message);
        C45m c45m = this.A02;
        HashMap A00 = C45m.A00("offline_threading_id", message.A1g, "current_time", A02(this), 1BJ.A00(ActionId.ON_VIEW_CREATED_END), Boolean.toString(z), "channel", num.intValue() != 0 ? "graph" : "mqtt", TraceFieldType.RetryCount, String.valueOf(sendMessageParams.A01), "first_send_delta", A03(this, sendMessageParams.A03), "first_message_first_send_delta", A03(this, sendMessageParams.A02), "message_type", this.A0G.A01(message));
        A07(message.A0V, A00);
        A06(bxz, A00, true);
        c45m.A01(A00);
        this.A01.A08("msg_send_attempted", null, null, null, null, A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0032, code lost:
    
        if (r312 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0K(com.facebook.messaging.model.threadkey.ThreadKey r302, java.lang.String r303, java.lang.String r304) {
        /*
            r301 = this;
            r0 = 1
            r305 = r0
            r0 = r304
            r306 = r0
            r0 = r304
            r1 = r305
            X.11T.A0F(r0, r1)
            java.lang.String r0 = "offline_threading_id"
            r307 = r0
            java.lang.String r0 = "waterfall_event"
            r308 = r0
            java.lang.String r0 = "current_time"
            r309 = r0
            r0 = r301
            java.lang.String r0 = A02(r0)
            r310 = r0
            java.lang.String r0 = "thread_key"
            r311 = r0
            r0 = r302
            if (r0 == 0) goto L35
            r0 = r302
            java.lang.String r0 = X.1BK.A0w(r0)
            r312 = r0
            r0 = r312
            if (r0 != 0) goto L3a
        L35:
            java.lang.String r0 = ""
            r312 = r0
        L3a:
            r0 = 8
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = r0
            r2 = r0; r3 = r1; 
            r4 = 0
            r5 = r307
            r3[r4] = r5
            r3 = 1
            r4 = r306
            r2[r3] = r4
            r2 = r0; r3 = r1; 
            r4 = 2
            r5 = r308
            r3[r4] = r5
            r3 = 3
            r4 = r303
            r2[r3] = r4
            r2 = r0; r3 = r1; 
            r4 = 4
            r5 = r309
            r3[r4] = r5
            r3 = 5
            r4 = r310
            r2[r3] = r4
            r2 = 6
            r3 = r311
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = r312
            r1[r2] = r3
            java.util.HashMap r0 = X.C45m.A00(r0)
            r308 = r0
            r0 = r301
            X.3r5 r0 = r0.A01
            java.lang.String r1 = "msg_send_waterfall"
            r2 = r308
            r0.A0D(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45d.A0K(com.facebook.messaging.model.threadkey.ThreadKey, java.lang.String, java.lang.String):void");
    }

    public final void A0L(ThreadKey threadKey, String str, String str2, String str3, Throwable th) {
        String A0w;
        11T.A0F(str2, 2);
        11T.A0F(str3, 3);
        String str4 = "";
        String obj = Throwables.getRootCause(th).toString();
        if (obj == null) {
            obj = str4;
        }
        String A02 = A02(this);
        if (threadKey != null && (A0w = 1BK.A0w(threadKey)) != null) {
            str4 = A0w;
        }
        this.A01.A0D("msg_send_waterfall", C45m.A00("offline_threading_id", str2, "waterfall_event", str, "current_time", A02, "thread_key", str4, "error_message", StringFormatUtil.formatStrLocaleSafe("error_message: %s, addition_info: %s", obj, str3)));
    }

    public final void A0M(MessagingNotification messagingNotification, String str) {
        A08(this, messagingNotification.A02, str, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0N(com.facebook.messaging.notify.type.MessagingNotification r302, java.lang.String r303, int r304) {
        /*
            Method dump skipped, instructions count: 990
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45d.A0N(com.facebook.messaging.notify.type.MessagingNotification, java.lang.String, int):void");
    }

    public final void A0O(MessagingNotification messagingNotification, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
        HashMap A03 = messagingNotification.A03();
        11T.A0A(A03);
        hashMap.putAll(A03);
        if (str2 != null) {
            hashMap.put("debug_info", str2);
        }
        A09(this, hashMap);
    }

    public final void A0P(NewMessageNotification newMessageNotification) {
        String A00 = 4YT.A00(439);
        String obj = 4rH.A03.toString();
        PushProperty pushProperty = ((MessagingNotification) newMessageNotification).A02;
        if (11T.A0O(obj, pushProperty == null ? null : pushProperty.A04.toString())) {
            ((C21p) 1Br.A0B(this.A0B)).A03(null, "secure_message", 1BJ.A00(1841), newMessageNotification.A0H.A1V, null, A00);
        }
    }

    public final void A0Q(NewMessageNotification newMessageNotification) {
        String str;
        Message message = newMessageNotification.A0H;
        11T.A09(message);
        PushProperty pushProperty = ((MessagingNotification) newMessageNotification).A02;
        if (pushProperty == null || (str = message.A1V) == null) {
            return;
        }
        ThreadKey threadKey = message.A0V;
        String name = pushProperty.A04.name();
        String str2 = pushProperty.A0A;
        HashMap hashMap = new HashMap();
        A07(threadKey, hashMap);
        this.A01.A06(name, str2, "Build&Send", "message_id", str, hashMap);
    }

    public final void A0R(MarkThreadFields markThreadFields, Integer num, Integer num2) {
        11T.A0F(markThreadFields, 1);
        this.A01.A0D("mark_thread", C45m.A00("mark_type", C3Ov.A00(num), "state", String.valueOf(markThreadFields.A07), "channel", num2.intValue() != 0 ? "graph" : "mqtt"));
    }
}
