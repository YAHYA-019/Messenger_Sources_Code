package com.facebook.notifications.channels;

import X.0Cc;
import X.0fH;
import X.11T;
import X.1BJ;
import X.1BK;
import X.1BL;
import X.1BP;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1G2;
import X.1G3;
import X.1Ql;
import X.1UG;
import X.2yD;
import X.3tI;
import X.50I;
import X.7uF;
import X.AnonymousClass001;
import X.AnonymousClass469;
import X.C00i;
import X.C0A2;
import X.C0et;
import X.C15h;
import X.HWi;
import X.K94;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.media.AudioAttributes;
import com.facebook.inject.FbInjector;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.user.model.User;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: NotificationChannelsManager.class */
public final class NotificationChannelsManager {
    public static final long[] A08 = {0, 100};
    public final 1BP A07 = FbInjector.A00;
    public final 1Br A01 = 1Bq.A00(33013);
    public final 1Br A03 = 1Bq.A00(16385);
    public final 1Br A02 = 1Bq.A00(16634);
    public final C15h A06 = 50I.A00;
    public final 1Br A00 = 1Bu.A00(82041);
    public final 1Br A05 = 1Bq.A00(83604);
    public final 1Br A04 = 1Bu.A00(115125);

    public static final ArrayList A00(String str) {
        String str2;
        String str3;
        ArrayList A0s = AnonymousClass001.A0s();
        try {
            Object systemService = FbInjector.A00().getSystemService("notification");
            11T.A0I(systemService, 1BJ.A00(18));
            for (NotificationChannel notificationChannel : ((NotificationManager) systemService).getNotificationChannels()) {
                try {
                    1BL.A1E(notificationChannel);
                    7uF r0 = new 7uF(notificationChannel);
                    if (str.equals(r0.A00.getGroup())) {
                        A0s.add(r0);
                    }
                } catch (IllegalArgumentException e) {
                    0fH.A0r("NotificationChannelsManager", "System Channel returned null channel id", e);
                }
            }
        } catch (Exception e2) {
            e = e2;
            str2 = "NotificationChannelsManager";
            str3 = "Failed to fetch categories from system.";
            0fH.A0r(str2, str3, e);
            return A0s;
        } catch (NoSuchMethodError e3) {
            e = e3;
            str2 = "NotificationChannelsManager";
            str3 = "Failed to fetch categories from system due to NoSuchMethodError.";
            0fH.A0r(str2, str3, e);
            return A0s;
        }
        return A0s;
    }

    public static final ArrayList A01(String str, String str2, String str3) {
        ArrayList A0s = AnonymousClass001.A0s();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String A0i = AnonymousClass001.A0i(keys);
                Object opt = jSONObject.opt(A0i);
                JSONObject jSONObject2 = opt instanceof JSONObject ? (JSONObject) opt : null;
                if (jSONObject2 != null) {
                    String optString = jSONObject2.optString("n");
                    String optString2 = jSONObject2.optString("i");
                    String optString3 = jSONObject2.optString("d");
                    int optInt = jSONObject2.optInt(K94.__redex_internal_original_name);
                    11T.A0D(A0i);
                    11T.A0F(A0i, 1);
                    11T.A0D(optString2);
                    11T.A0F(optString2, 0);
                    A0s.add(new 7uF(str2, A0i, optString, optInt, optString3, optString2, str3));
                }
            }
        } catch (JSONException e) {
            0fH.A0r("NotificationChannelsManager", "Failed to parse mobile config value for categories.", e);
        }
        return A0s;
    }

    public final void A02() {
        if (this.A05.A00.get() != C0et.A0C || FbInjector.A03.getApplicationInfo().targetSdkVersion < 26) {
            return;
        }
        NotificationManager notificationManager = (NotificationManager) FbInjector.A03.getSystemService(NotificationManager.class);
        if (notificationManager == null) {
            throw 1BK.A0h();
        }
        C00i c00i = this.A03.A00;
        String A02 = 2yD.A02(1BK.A0M(c00i), 36873483942166571L);
        C15h c15h = this.A06;
        User user = (User) c15h.get();
        if (A02.length() != 0 && user != null) {
            String BD0 = 1Br.A07(((HWi) 1Br.A0B(this.A04)).A00).AZk(36312698653381580L) ? 1Br.A09(this.A01).BD0(3tI.A11) : null;
            String str = user.A13;
            notificationManager.createNotificationChannelGroup(new NotificationChannelGroup(str, user.A0X.A00()));
            11T.A0A(str);
            ArrayList A01 = A01(A02, str, BD0);
            Iterator it = A01.iterator();
            while (it.hasNext()) {
                7uF r0 = (7uF) it.next();
                C00i c00i2 = this.A01.A00;
                boolean AZn = 1BK.A0S(c00i2).AZn(3tI.A0q, true);
                boolean AZn2 = 1BK.A0S(c00i2).AZn(3tI.A0a, true);
                boolean AZn3 = 1BK.A0S(c00i2).AZn(3tI.A13, true);
                FbSharedPreferences A0S = 1BK.A0S(c00i2);
                1G2 r02 = 3tI.A11;
                String BD02 = A0S.BD0(r02);
                if (BD02 == null) {
                    Context context = FbInjector.A03;
                    11T.A0A(context);
                    StringBuilder A0k = AnonymousClass001.A0k();
                    A0k.append("android.resource://");
                    A0k.append(context.getResources().getResourcePackageName(2131886164));
                    A0k.append('/');
                    A0k.append(context.getResources().getResourceTypeName(2131886164));
                    A0k.append('/');
                    BD02 = 0Cc.A0k(AnonymousClass001.A0d(context.getResources().getResourceEntryName(2131886164), A0k));
                    1Ql A0U = 1BL.A0U(c00i2);
                    A0U.CaL(r02, BD02);
                    A0U.commit();
                }
                String str2 = r0.A01;
                if (11T.A0O(str2, "messaging_sound") || 11T.A0O(str2, "messaging_sound_vibration")) {
                    BD02 = AnonymousClass469.A00(FbInjector.A03, 2131886165).toString();
                }
                if (11T.A0O(str2, "comments") && 1BK.A0M(c00i).AZk(36310533988811069L)) {
                    BD02 = AnonymousClass469.A00(FbInjector.A03, 2131886165).toString();
                }
                AudioAttributes build = new AudioAttributes.Builder().setContentType(4).setUsage(6).build();
                if (11T.A0O(str2, "messaging_vibration") || 11T.A0O(str2, "messaging_sound_vibration")) {
                    r0.A00.setVibrationPattern(A08);
                    build = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
                }
                NotificationChannel notificationChannel = r0.A00;
                notificationChannel.enableLights(AZn2);
                notificationChannel.enableVibration(AZn);
                notificationChannel.setSound(C0A2.A03(BD02), build);
                if (!AZn3) {
                    notificationChannel.setImportance(2);
                }
                notificationManager.createNotificationChannel(notificationChannel);
            }
            Iterator it2 = A00(str).iterator();
            while (it2.hasNext()) {
                7uF r03 = (7uF) it2.next();
                if (!A01.contains(r03)) {
                    String id = r03.A00.getId();
                    if (id == null) {
                        throw AnonymousClass001.A0N("We assigned this, it should not be null");
                    }
                    notificationManager.deleteNotificationChannel(id);
                }
            }
        }
        User user2 = (User) c15h.get();
        if (user2 != null) {
            1G2 r04 = 3tI.A13;
            String str3 = user2.A13;
            11T.A0A(str3);
            1G2 A00 = 1G3.A00(3tI.A0W, str3);
            C00i c00i3 = this.A01.A00;
            String BD03 = 1BK.A0S(c00i3).BD0(A00);
            ArrayList A002 = A00(str3);
            1Ql A0U2 = 1BL.A0U(c00i3);
            JSONObject A12 = AnonymousClass001.A12();
            Iterator it3 = A002.iterator();
            while (it3.hasNext()) {
                7uF r05 = (7uF) it3.next();
                JSONObject A122 = AnonymousClass001.A12();
                try {
                    A122.put("i", r05.A00());
                    A12.put(r05.A01, A122);
                } catch (JSONException e) {
                    0fH.A0r("NotificationChannelsManager", "Failed to serialize categories.", e);
                }
            }
            A0U2.CaL(A00, 11T.A02(A12));
            A0U2.commit();
            if (BD03 == null || BD03.length() == 0) {
                return;
            }
            Iterator it4 = A01(BD03, str3, 1Br.A07(((HWi) 1Br.A0B(this.A04)).A00).AZk(36312698653381580L) ? 1BK.A0S(c00i3).BD0(3tI.A11) : null).iterator();
            while (it4.hasNext()) {
                7uF r06 = (7uF) it4.next();
                String str4 = r06.A01;
                Object obj = null;
                if (str4 != null && !str3.equals(ConstantsKt.CAMERA_ID_FRONT)) {
                    Iterator it5 = A00(str3).iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            break;
                        }
                        Object next = it5.next();
                        if (str4.equals(((7uF) next).A01)) {
                            obj = next;
                            break;
                        }
                    }
                    7uF r07 = (7uF) obj;
                    if (r07 != null && r07.A00.getImportance() != r06.A00.getImportance()) {
                        1UG A082 = 1BK.A08(1Br.A02(this.A02), "android_notification_channel_user_action");
                        if (A082.isSampled()) {
                            A082.A7R("channel_id", r07.A01);
                            A082.A7R("new_importance", r07.A00());
                            A082.A7R("old_importance", r06.A00());
                            A082.BZL();
                        }
                    }
                }
            }
        }
    }
}
