package com.facebook.messaging.notify.logging.conditionalworkerimpl;

import X.04J;
import X.0fH;
import X.11T;
import X.1BQ;
import X.1BV;
import X.1CO;
import X.1Fv;
import X.1G1;
import X.1G2;
import X.1GU;
import X.1Ql;
import X.1UD;
import X.1UG;
import X.1ZG;
import X.21W;
import X.24X;
import X.2LD;
import X.2Pi;
import X.46I;
import X.4tB;
import X.AbstractC09534qe;
import X.AnonymousClass244;
import X.C00i;
import X.C09514qb;
import X.C0dp;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.net.Uri;
import com.facebook.common.util.TriState;
import com.facebook.inject.FbInjector;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.push.init.PushInitializer;
import com.google.common.base.Objects;
import java.util.HashMap;

/* loaded from: PushSettingsReporter.class */
public final class PushSettingsReporter {
    public final C00i A07 = new 1BV(49333);
    public final C00i A09 = new 1BV(65920);
    public final C00i A05 = new 1BQ(66536);
    public final C00i A00 = new 1BQ(16458);
    public final C00i A04 = new 1BQ(16385);
    public final C00i A06 = new 1BQ(68335);
    public final C00i A08 = new 1BQ(49285);
    public final C00i A01 = new 1BV(66000);
    public final C00i A03 = new 1BQ(16634);
    public final C00i A02 = new 1BQ(66351);

    public void A00() {
        boolean A03;
        boolean z;
        String str;
        ((1GU) this.A00.get()).AAq();
        0fH.A0m("PushSettingsReporter", "Report push_settings.");
        1G1 A04 = ((1Fv) this.A02.get()).A04();
        if (A04.A07) {
            0fH.A0k("PushSettingsReporter", "Do not report push_settings for logged out user.");
            return;
        }
        String str2 = A04.A02;
        String str3 = null;
        synchronized (this) {
            A03 = ((2Pi) this.A09.get()).A03();
            if (((21W) this.A05.get()).A07()) {
                AnonymousClass244 anonymousClass244 = (AnonymousClass244) this.A06.get();
                C09514qb c09514qb = (C09514qb) this.A01.get();
                HashMap hashMap = new HashMap();
                for (NotificationChannel notificationChannel : ((NotificationManager) c09514qb.A00.A00.get()).getNotificationChannels()) {
                    String A01 = 46I.A01(notificationChannel.getId());
                    if (A01 != null) {
                        HashMap hashMap2 = new HashMap();
                        String str4 = null;
                        if (notificationChannel.getSound() != null) {
                            Context context = FbInjector.A03;
                            11T.A0A(context);
                            Uri sound = notificationChannel.getSound();
                            11T.A0A(sound);
                            str = AbstractC09534qe.A00(context, sound);
                        } else {
                            str = null;
                        }
                        hashMap2.put("sound", str);
                        hashMap2.put("importance", String.valueOf(notificationChannel.getImportance()));
                        hashMap2.put("mask", String.valueOf(46I.A00(notificationChannel)));
                        hashMap2.put("lock_screen", String.valueOf(notificationChannel.getLockscreenVisibility()));
                        try {
                            C00i c00i = c09514qb.A01.A00;
                            str4 = ((AnonymousClass244) c00i.get()).A0W(((AnonymousClass244) c00i.get()).A0T(24X.class, hashMap2));
                        } catch (2LD e) {
                            0fH.A0w("ChannelsLoggingInfoProvider", "Errors when transforming channel jsonNode to string", e);
                        }
                        hashMap.put(A01, str4);
                    }
                }
                str3 = ((24X) anonymousClass244.A0T(24X.class, hashMap)).toString();
            }
            4tB r0 = (4tB) this.A07.get();
            long Auy = ((1CO) this.A04.get()).Auy(36592339679314621L);
            1G2 A0D = 4tB.A08.A0D(str2);
            1G2 A0D2 = 4tB.A06.A0D(str2);
            1G2 A0D3 = 4tB.A0A.A0D(str2);
            C00i c00i2 = r0.A05;
            r0.A02 = ((FbSharedPreferences) c00i2.get()).AZo(A0D);
            r0.A03 = ((FbSharedPreferences) c00i2.get()).BD0(A0D2);
            r0.A01 = ((FbSharedPreferences) c00i2.get()).Av1(A0D3, 0L);
            long now = ((C0dp) r0.A04.get()).now();
            TriState triState = r0.A02;
            if (triState == TriState.UNSET || triState != TriState.valueOf(A03) || !Objects.equal(r0.A03, str3) || now - r0.A01 >= Auy * 60000) {
                r0.A02 = TriState.valueOf(A03);
                r0.A03 = str3;
                r0.A01 = now;
                1Ql putBoolean = ((FbSharedPreferences) c00i2.get()).edit().putBoolean(A0D, A03);
                putBoolean.CaH(A0D3, now);
                if (str3 == null) {
                    putBoolean.Cdj(A0D2);
                } else {
                    putBoolean.CaL(A0D2, str3);
                }
                putBoolean.commit();
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            1UG A00 = 1UD.A00((04J) this.A03.get(), 1ZG.A01, "android_msgr_notif_sys");
            if (A00.isSampled()) {
                A00.A5H("is_notif_enabled", Boolean.valueOf(A03));
                A00.A7R("channels_setting", str3);
                A00.BZL();
            }
        }
    }

    public void A01() {
        int i;
        boolean z;
        ((1GU) this.A00.get()).AAq();
        0fH.A0m("PushSettingsReporter", "token register with system notification settings");
        1G1 A04 = ((1Fv) this.A02.get()).A04();
        if (A04.A07) {
            0fH.A0k("PushSettingsReporter", "Do not register token when notification change for logged out user.");
            return;
        }
        String str = A04.A02;
        synchronized (this) {
            C00i c00i = this.A09;
            boolean A03 = ((2Pi) c00i.get()).A03();
            2Pi r0 = (2Pi) c00i.get();
            NotificationManager notificationManager = r0.A00;
            if (notificationManager != null && r0.A04.A07()) {
                for (NotificationChannel notificationChannel : notificationManager.getNotificationChannels()) {
                    String A01 = 46I.A01(notificationChannel.getId());
                    if (A01 != null && A01.equals("messenger_orca_050_messaging")) {
                        i = 46I.A00(notificationChannel);
                        break;
                    }
                }
            }
            i = -1;
            4tB r02 = (4tB) this.A07.get();
            1G2 A0D = 4tB.A09.A0D(str);
            1G2 A0D2 = 4tB.A07.A0D(str);
            C00i c00i2 = r02.A05;
            r02.A02 = ((FbSharedPreferences) c00i2.get()).AZo(A0D);
            int ArU = ((FbSharedPreferences) c00i2.get()).ArU(A0D2, -1);
            r02.A00 = ArU;
            TriState triState = r02.A02;
            if (triState != TriState.UNSET && triState == TriState.valueOf(A03) && ArU == i) {
                z = false;
            } else {
                r02.A02 = TriState.valueOf(A03);
                r02.A00 = i;
                1Ql putBoolean = ((FbSharedPreferences) c00i2.get()).edit().putBoolean(A0D, A03);
                if (i != -1) {
                    putBoolean.CaE(A0D2, i);
                } else {
                    putBoolean.Cdj(A0D2);
                }
                putBoolean.commit();
                z = true;
            }
        }
        if (z) {
            ((PushInitializer) this.A08.get()).A03("PushInitializer.settingChangeRegister");
        }
    }
}
