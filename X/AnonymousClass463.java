package X;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.content.Context;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import com.facebook.common.dextricks.LogcatReader;
import com.facebook.inject.FbInjector;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.HashMap;

/* renamed from: X.463, reason: invalid class name */
/* loaded from: 463.class */
public final class AnonymousClass463 {
    public static final String A0D = "MessagesNotificationChannelModels";
    public C46H A00;
    public C46H A01;
    public ImmutableMap A02;
    public ImmutableMap A03;
    public ImmutableMap A04;
    public static final ImmutableSet A0F = ImmutableSet.A04("050_default", "750_high", "800_medium", "900_low");
    public static final ImmutableSet A0E = ImmutableSet.A04("messenger_orca_050_messaging", "messenger_orca_400_stories", "messenger_orca_500_reminders", "messenger_orca_700_other");
    public static final java.util.Map A0G = new HashMap();
    public final C00i A06 = FbInjector.A00;
    public final C00i A0C = new 1BQ(66536);
    public final C00i A0A = new 1BQ(66539);
    public final C00i A09 = new 1BQ(16385);
    public final C00i A08 = new 1BQ(83605);
    public final C00i A05 = new 1BV(33230);
    public final C00i A07 = new 1BQ(68470);
    public final C45a A0B = (C45a) 1Bi.A03(83227);

    static {
        A03("messenger_orca_050_messaging", LogcatReader.DEFAULT_WAIT_TIME, 10151, 10051, 10085, 10106, 10107, 26357, 10138, 10145, 10138, 10146, 10147, 10148, 10149, 10150, 10153, 2, 10136, 36875);
        A03("messenger_orca_250_calls", 10043, 10010, 10069, 10064, 10065, 10041, 10088);
        A03("messenger_orca_270_admin", 10032, 10034, 10003, 10015, 10001, 10029, 10031, 10035, 10092, 10099, 10102, 10135, 10189, 10094);
        A03("messenger_orca_200_sms", 10072);
        A03("messenger_orca_700_other", 10004, 10152, 30948, 10011, 10014, 10081, 10016, 10017, 10018, 10019, 10026, 10045, 10048, 10093, 50001, 10055, 10056, 10086, 10090, 26376, 26780, 26670, 27085, 29852, 29850, 29851, 29853, 30512, 30947);
        A03("messenger_orca_400_stories", 10037, 10038, 10039, 10040, 10049, 10053, 10059);
        A03("messenger_orca_500_reminders", 10066, 10074, 10084, 10089);
        A03("messenger_orca_900_chathead_active", 20001);
        A03("messenger_orca_910_overlay_active", 20024);
        A03("messenger_orca_749_voip_incoming", 10075, 20023, 20037);
        A03("messenger_orca_750_voip", 10054, 20002);
        A03("messenger_orca_800_live_location", 20009, 20022, 20030);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x05c2, code lost:
    
        if (X.1Wd.A00(r0).AZr(r0, 36325291497968207L) == false) goto L31;
     */
    /* JADX WARN: Type inference failed for: r0v247, types: [X.464, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v338, types: [java.lang.Object, X.46H] */
    /* JADX WARN: Type inference failed for: r0v352, types: [X.464, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v362, types: [X.464, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [X.464, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v428, types: [java.lang.Object, X.46H] */
    /* JADX WARN: Type inference failed for: r0v51, types: [X.464, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AnonymousClass463() {
        /*
            Method dump skipped, instructions count: 2705
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass463.<init>():void");
    }

    public static NotificationChannel A00(NotificationChannel notificationChannel) {
        if (notificationChannel == null) {
            return null;
        }
        String id = notificationChannel.getId();
        CharSequence name = notificationChannel.getName();
        int importance = notificationChannel.getImportance();
        boolean shouldShowLights = notificationChannel.shouldShowLights();
        Integer valueOf = Integer.valueOf(notificationChannel.getLightColor());
        boolean shouldVibrate = notificationChannel.shouldVibrate();
        long[] vibrationPattern = notificationChannel.getVibrationPattern();
        return A01(notificationChannel.getAudioAttributes(), notificationChannel.getSound(), name, valueOf, id, notificationChannel.getGroup(), vibrationPattern, importance, shouldShowLights, shouldVibrate, notificationChannel.canShowBadge());
    }

    public static NotificationChannel A01(AudioAttributes audioAttributes, Uri uri, CharSequence charSequence, Integer num, String str, String str2, long[] jArr, int i, boolean z, boolean z2, boolean z3) {
        NotificationChannel notificationChannel = new NotificationChannel(str, charSequence, i);
        if (!1JF.A0B(str2)) {
            notificationChannel.setGroup(str2);
        }
        if (z) {
            notificationChannel.enableLights(true);
            if (num != null) {
                notificationChannel.setLightColor(num.intValue());
            }
        } else {
            notificationChannel.enableLights(false);
        }
        if (z2) {
            notificationChannel.setVibrationPattern(jArr);
            notificationChannel.enableVibration(true);
        } else {
            notificationChannel.enableVibration(false);
        }
        notificationChannel.setSound(uri, audioAttributes);
        notificationChannel.setShowBadge(z3);
        return notificationChannel;
    }

    private 46F A02() {
        String string = ((Context) this.A06.get()).getString(2131960816);
        AnonymousClass465 anonymousClass465 = AnonymousClass465.A02;
        AnonymousClass466 anonymousClass466 = AnonymousClass466.A06;
        Uri A02 = this.A0B.A02();
        AudioAttributes audioAttributes = Notification.AUDIO_ATTRIBUTES_DEFAULT;
        audioAttributes.getClass();
        46F r0 = new 46F(audioAttributes, A02, anonymousClass465, anonymousClass466, "messenger_orca_050_messaging", string, "messenger_orca_10_group_notifications", 4, true);
        r0.mShowBadge = true;
        return r0;
    }

    public static void A03(String str, int... iArr) {
        int length = iArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            A0G.put(Integer.valueOf(iArr[i2]), str);
            i = i2 + 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0074, code lost:
    
        if ((!((X.2yD) r301.A09.get()).AZk(36320137536158795L)) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x004b, code lost:
    
        if (((X.2yD) r0.get()).AZr(r0, 36313939897949453L) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0077, code lost:
    
        r302 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x007d, code lost:
    
        return r302;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A04() {
        /*
            r301 = this;
            boolean r0 = X.46G.A00()
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L4e
            r0 = r301
            X.00i r0 = r0.A09
            r303 = r0
            r0 = r303
            java.lang.Object r0 = r0.get()
            X.2yD r0 = (X.2yD) r0
            r304 = r0
            r0 = 36312419479392642(0x8101f400011182, double:3.0274585249202913E-306)
            r305 = r0
            X.1GD r0 = X.1GD.A07
            r307 = r0
            r0 = r304
            r1 = r307
            r2 = r305
            boolean r0 = r0.AZr(r1, r2)
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L4e
            r0 = r303
            java.lang.Object r0 = r0.get()
            X.2yD r0 = (X.2yD) r0
            r304 = r0
            r0 = 36313939897949453(0x81035600031d0d, double:3.028420043737853E-306)
            r305 = r0
            r0 = r304
            r1 = r307
            r2 = r305
            boolean r0 = r0.AZr(r1, r2)
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L77
        L4e:
            r0 = r301
            X.00i r0 = r0.A09
            r308 = r0
            r0 = r308
            java.lang.Object r0 = r0.get()
            X.2yD r0 = (X.2yD) r0
            r304 = r0
            r0 = 36320137536158795(0x8108f900093c4b, double:3.0323394550973266E-306)
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = r0.AZk(r1)
            r1 = 1
            r0 = r0 ^ r1
            r309 = r0
            r0 = 1
            r302 = r0
            r0 = r309
            if (r0 != 0) goto L7c
        L77:
            r0 = 0
            r302 = r0
            r0 = 0
            r308 = r0
        L7c:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass463.A04():boolean");
    }

    public NotificationChannel A05(CharSequence charSequence, String str) {
        Uri uri;
        46F r0 = (46F) this.A00.A01.get("messenger_orca_050_messaging");
        if (r0 == null) {
            0fH.A0o(A0D, "default channel setting was null");
            return null;
        }
        long[] A02 = 46I.A02(r0.mNotifyVibrate);
        AnonymousClass465 anonymousClass465 = r0.mLight;
        Integer num = null;
        if (anonymousClass465 != null && anonymousClass465.ordinal() == 0) {
            num = -16711936;
        }
        int i = r0.mImportance;
        boolean z = false;
        if (num != null) {
            z = true;
        }
        boolean z2 = r0.mShouldVibrate;
        String str2 = r0.mSoundUri;
        if (str2 == null) {
            uri = null;
        } else {
            uri = null;
            try {
                uri = C0A2.A03(str2);
            } catch (SecurityException unused) {
            }
        }
        return A01(r0.mAudioAttributes, uri, charSequence, num, str, Build.VERSION.SDK_INT >= 30 ? "messenger_orca_10_group_notifications" : 4YT.A00(1292), A02, i, z, z2, r0.mShowBadge);
    }

    public String A06(int i) {
        ImmutableMap immutableMap = this.A04;
        Integer valueOf = Integer.valueOf(i);
        if (immutableMap.containsKey(valueOf)) {
            return (String) this.A04.get(valueOf);
        }
        0fH.A14(A0D, "Notification id: %s has not been associated with a notification channel", new Object[]{valueOf});
        this.A04.keySet().isEmpty();
        return "messenger_orca_700_other";
    }

    public void A07() {
        Uri uri;
        0fH.A0l(A0D, "Initializing channel models");
        C46H c46h = ((21W) this.A0C.get()).A01.A00.get() == C0et.A0g ? this.A01 : this.A00;
        this.A04 = ImmutableMap.copyOf(c46h.A02);
        HashMap hashMap = new HashMap();
        for (AnonymousClass464 anonymousClass464 : c46h.A00.values()) {
            String str = anonymousClass464.mId;
            hashMap.put(str, new NotificationChannelGroup(str, anonymousClass464.mName));
        }
        this.A02 = ImmutableMap.copyOf((java.util.Map) hashMap);
        HashMap hashMap2 = new HashMap();
        for (46F r0 : c46h.A01.values()) {
            String str2 = r0.mChannelId;
            AnonymousClass465 anonymousClass465 = r0.mLight;
            Integer num = null;
            if (anonymousClass465 != null && anonymousClass465.ordinal() == 0) {
                num = -16711936;
            }
            long[] A02 = 46I.A02(r0.mNotifyVibrate);
            String str3 = r0.mName;
            int i = r0.mImportance;
            boolean z = num != null;
            boolean z2 = r0.mShouldVibrate;
            String str4 = r0.mSoundUri;
            if (str4 == null) {
                uri = null;
            } else {
                uri = null;
                try {
                    uri = C0A2.A03(str4);
                } catch (SecurityException unused) {
                }
            }
            hashMap2.put(str2, A01(r0.mAudioAttributes, uri, str3, num, str2, r0.mGroupId, A02, i, z, z2, r0.mShowBadge));
        }
        this.A03 = ImmutableMap.copyOf((java.util.Map) hashMap2);
    }
}
