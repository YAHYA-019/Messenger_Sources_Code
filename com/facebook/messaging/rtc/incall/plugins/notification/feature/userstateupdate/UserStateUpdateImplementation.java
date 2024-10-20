package com.facebook.messaging.rtc.incall.plugins.notification.feature.userstateupdate;

import X.11T;
import X.1BK;
import X.1BL;
import X.1Br;
import X.1Bu;
import X.1YC;
import X.4YU;
import X.C1Y6;
import X.GOn;
import X.Gyx;
import X.HBr;
import X.HEt;
import X.HVp;
import X.HyU;
import X.I8a;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: UserStateUpdateImplementation.class */
public final class UserStateUpdateImplementation extends HEt {
    public Future A00;
    public final Context A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final Gyx A0C;

    public UserStateUpdateImplementation(Context context, FbUserSession fbUserSession) {
        1BL.A1F(context, fbUserSession);
        this.A01 = context;
        this.A02 = GOn.A0a(context, fbUserSession);
        this.A08 = GOn.A0Z(context, fbUserSession);
        this.A07 = GOn.A0b(context, fbUserSession);
        this.A05 = 1Bu.A01(context, 114937);
        this.A0B = GOn.A0T(context, fbUserSession);
        this.A0A = GOn.A0P();
        this.A03 = 1Bu.A01(context, 82590);
        this.A04 = 1Bu.A01(context, 67579);
        this.A06 = GOn.A0U(context, fbUserSession);
        this.A09 = 1Bu.A00(83872);
        this.A0C = new Gyx(this, 12);
    }

    public static final void A00(HVp hVp, UserStateUpdateImplementation userStateUpdateImplementation, String str, String str2) {
        String str3;
        if (str2 == null || str2.length() == 0) {
            HyU hyU = hVp.A00.A00;
            AtomicInteger atomicInteger = C1Y6.A04;
            int andIncrement = atomicInteger.getAndIncrement();
            1YC r0 = hyU.A02;
            r0.A08("com.facebook.messaging.rtc.incall.plugins.interfaces.notification.content.NotificationContentPluginInterfaceSpec", "messaging.rtc.incall.notification.content.NotificationContentPluginInterfaceSpec", "getParticipantJoinedGeneralNotificationString", andIncrement);
            str3 = null;
            try {
                if (HyU.A00(hyU)) {
                    int andIncrement2 = atomicInteger.getAndIncrement();
                    try {
                        r0.A0A("com.facebook.messaging.rtc.incall.plugins.notification.content.videocalls.VideocallsNotificationContentPlugin", "messaging.rtc.incall.notification.content.videocalls.VideocallsNotificationContentPlugin", "com.facebook.messaging.rtc.incall.plugins.interfaces.notification.content.NotificationContentPluginInterfaceSpec", andIncrement2, "messaging.rtc.incall.notification.content.NotificationContentPluginInterfaceSpec", "com.facebook.messaging.rtc.incall.plugins.notification.content.RtcIncallNotificationContentKillSwitch", "getParticipantJoinedGeneralNotificationString");
                        try {
                            Context context = hyU.A01;
                            11T.A0F(context, 0);
                            str3 = 4YU.A0t(context.getResources(), 2131964192);
                            r0.A09("messaging.rtc.incall.notification.content.videocalls.VideocallsNotificationContentPlugin", "messaging.rtc.incall.notification.content.NotificationContentPluginInterfaceSpec", "getParticipantJoinedGeneralNotificationString", andIncrement2);
                        } catch (Exception e) {
                            throw e;
                        }
                    } catch (Throwable th) {
                        r0.A04((Exception) null, "messaging.rtc.incall.notification.content.videocalls.VideocallsNotificationContentPlugin", "messaging.rtc.incall.notification.content.NotificationContentPluginInterfaceSpec", "getParticipantJoinedGeneralNotificationString", andIncrement2);
                        throw th;
                    }
                }
                r0.A02((Exception) null, "messaging.rtc.incall.notification.content.NotificationContentPluginInterfaceSpec", "getParticipantJoinedGeneralNotificationString", andIncrement);
                if (str3 == null) {
                    str3 = userStateUpdateImplementation.A01.getString(2131965354);
                }
            } catch (Throwable th2) {
                r0.A02((Exception) null, "messaging.rtc.incall.notification.content.NotificationContentPluginInterfaceSpec", "getParticipantJoinedGeneralNotificationString", andIncrement);
                throw th2;
            }
        } else {
            HyU hyU2 = hVp.A00.A00;
            AtomicInteger atomicInteger2 = C1Y6.A04;
            int andIncrement3 = atomicInteger2.getAndIncrement();
            1YC r02 = hyU2.A02;
            r02.A08("com.facebook.messaging.rtc.incall.plugins.interfaces.notification.content.NotificationContentPluginInterfaceSpec", "messaging.rtc.incall.notification.content.NotificationContentPluginInterfaceSpec", "getParticipantJoinedUserNotificationString", andIncrement3);
            str3 = null;
            Exception e2 = null;
            try {
                if (HyU.A00(hyU2)) {
                    int andIncrement4 = atomicInteger2.getAndIncrement();
                    r02.A0A("com.facebook.messaging.rtc.incall.plugins.notification.content.videocalls.VideocallsNotificationContentPlugin", "messaging.rtc.incall.notification.content.videocalls.VideocallsNotificationContentPlugin", "com.facebook.messaging.rtc.incall.plugins.interfaces.notification.content.NotificationContentPluginInterfaceSpec", andIncrement4, "messaging.rtc.incall.notification.content.NotificationContentPluginInterfaceSpec", "com.facebook.messaging.rtc.incall.plugins.notification.content.RtcIncallNotificationContentKillSwitch", "getParticipantJoinedUserNotificationString");
                    try {
                        try {
                            Context context2 = hyU2.A01;
                            11T.A0F(context2, 0);
                            str3 = context2.getResources().getString(2131964191, str2);
                            11T.A0A(str3);
                            r02.A09("messaging.rtc.incall.notification.content.videocalls.VideocallsNotificationContentPlugin", "messaging.rtc.incall.notification.content.NotificationContentPluginInterfaceSpec", "getParticipantJoinedUserNotificationString", andIncrement4);
                        } catch (Throwable th3) {
                            r02.A04(e2, "messaging.rtc.incall.notification.content.videocalls.VideocallsNotificationContentPlugin", "messaging.rtc.incall.notification.content.NotificationContentPluginInterfaceSpec", "getParticipantJoinedUserNotificationString", andIncrement4);
                            throw th3;
                        }
                    } catch (Exception e3) {
                        e2 = e3;
                        throw e2;
                    }
                }
                r02.A02((Exception) null, "messaging.rtc.incall.notification.content.NotificationContentPluginInterfaceSpec", "getParticipantJoinedUserNotificationString", andIncrement3);
                if (str3 == null) {
                    str3 = 1BK.A0v(userStateUpdateImplementation.A01, str2, 2131965353);
                }
            } catch (Throwable th4) {
                r02.A02(e2, "messaging.rtc.incall.notification.content.NotificationContentPluginInterfaceSpec", "getParticipantJoinedUserNotificationString", andIncrement3);
                throw th4;
            }
        }
        I8a i8a = ((HEt) userStateUpdateImplementation).A00;
        if (i8a != null) {
            I8a.A01(i8a, HBr.A17, str3, str);
        }
    }
}
