package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.rtc.incall.impl.notification.NotificationView;
import com.facebook.messaging.rtc.incall.plugins.notification.feature.audioevents.AudioEventsImplementation;
import com.facebook.messaging.rtc.incall.plugins.notification.feature.audiooutput.AudioOutputImplementation;
import com.facebook.messaging.rtc.incall.plugins.notification.feature.avatar.AvatarImplementation;
import com.facebook.messaging.rtc.incall.plugins.notification.feature.cowatch.CoWatchNotificationFeature;
import com.facebook.messaging.rtc.incall.plugins.notification.feature.effect.EffectImplementation;
import com.facebook.messaging.rtc.incall.plugins.notification.feature.effect.interactive.InteractiveEffectNotificationFeature;
import com.facebook.messaging.rtc.incall.plugins.notification.feature.groupescalation.GroupEscalationImplementation;
import com.facebook.messaging.rtc.incall.plugins.notification.feature.lowbatterynotification.LowBatteryNotificationImplementation;
import com.facebook.messaging.rtc.incall.plugins.notification.feature.moderatorcontrols.ModeratorControlsImplementation;
import com.facebook.messaging.rtc.incall.plugins.notification.feature.promotions.PromotionNotificationFeature;
import com.facebook.messaging.rtc.incall.plugins.notification.feature.raisehand.RaiseHandImplementation;
import com.facebook.messaging.rtc.incall.plugins.notification.feature.room.RoomImplementation;
import com.facebook.messaging.rtc.incall.plugins.notification.feature.rooms2live.Rooms2LiveImplementation;
import com.facebook.messaging.rtc.incall.plugins.notification.feature.screensharing.ScreenSharingImplementation;
import com.facebook.messaging.rtc.incall.plugins.notification.feature.userstateupdate.UserStateUpdateImplementation;
import com.facebook.messaging.rtc.incall.plugins.notification.feature.voiceactivity.VoiceActivityImplementation;
import com.facebook.rtc.interfaces.WebrtcUiHandlerListenerParams;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Gr7.class */
public final class Gr7 extends GS2 {
    public GjI A00;
    public HVq A01;
    public Future A02;
    public boolean A03;
    public final Context A04;
    public final FbUserSession A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final JLm A0C;
    public final I8a A0D;
    public final 2Qn A0E;
    public final Runnable A0F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gr7(FbUserSession fbUserSession, Context context) {
        super("NotificationPresenter");
        1BL.A1F(fbUserSession, context);
        this.A05 = fbUserSession;
        this.A04 = context;
        this.A08 = GOn.A0a(context, fbUserSession);
        this.A0A = GOn.A0V(context, fbUserSession);
        this.A07 = 1Bu.A01(context, 85162);
        this.A0B = GOn.A0P();
        this.A06 = GOn.A0Y(context, fbUserSession);
        this.A09 = GOn.A0S(context);
        this.A0F = new Irz(this);
        this.A0E = IYv.A00(this, 30);
        this.A0C = GpZ.A00(this, 30);
        this.A0D = new I8a(this);
    }

    public static void A00(IFk iFk, HEt hEt) {
        I8a i8a = iFk.A0Z;
        11T.A0F(i8a, 0);
        hEt.A00 = i8a;
    }

    public static final void A01(Gr7 gr7, GjI gjI) {
        gr7.A00 = gjI;
        long j = gjI.A04;
        long j2 = -1;
        Future future = gr7.A02;
        if (j == j2) {
            GOo.A1R(future);
        } else {
            GOo.A1R(future);
            gr7.A02 = GOp.A1H(gr7.A0B).schedule(gr7.A0F, j, TimeUnit.MILLISECONDS);
        }
    }

    public void A0b() {
        int andIncrement;
        GOp.A0e(this.A0A).A03(this.A0E);
        Future future = this.A02;
        if (future != null) {
            future.cancel(false);
            this.A02 = null;
        }
        this.A00 = null;
        GOp.A0Q(this.A06).CeV(this.A0C);
        HVq hVq = this.A01;
        if (hVq != null) {
            String str = hVq.A00;
            IFk iFk = ((HPY) str).A00;
            AtomicInteger atomicInteger = C1Y6.A04;
            int andIncrement2 = atomicInteger.getAndIncrement();
            1YC r0 = iFk.A0Y;
            r0.A08("com.facebook.messaging.rtc.incall.plugins.interfaces.notification.feature.NotificationFeatureInterfaceSpec", "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "onDropped", andIncrement2);
            try {
                try {
                    if (IFk.A05(iFk)) {
                        andIncrement = atomicInteger.getAndIncrement();
                        str = "messaging.rtc.incall.notification.feature.cowatch.CoWatchNotificationFeature";
                        r0.A0A("com.facebook.messaging.rtc.incall.plugins.notification.feature.cowatch.CoWatchNotificationFeature", str, "com.facebook.messaging.rtc.incall.plugins.interfaces.notification.feature.NotificationFeatureInterfaceSpec", andIncrement, "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "com.facebook.messaging.rtc.incall.plugins.notification.feature.RtcIncallNotificationFeatureKillSwitch", "onDropped");
                        try {
                            CoWatchNotificationFeature coWatchNotificationFeature = iFk.A04;
                            ((HEt) coWatchNotificationFeature).A00 = null;
                            GOp.A0V(coWatchNotificationFeature.A07).A07(coWatchNotificationFeature.A0G);
                            HRC hrc = (HRC) 1Br.A0B(coWatchNotificationFeature.A05);
                            HVr hVr = coWatchNotificationFeature.A0I;
                            11T.A0F(hVr, 0);
                            hrc.A00.remove(hVr);
                            GOp.A0Z(coWatchNotificationFeature.A0A).A02(coWatchNotificationFeature.A0H);
                            GOp.A0s(coWatchNotificationFeature.A03).A0k(coWatchNotificationFeature.A0J);
                            ((CaN) 1Br.A0B(coWatchNotificationFeature.A08)).A02(coWatchNotificationFeature.A0F);
                            r0.A09(str, "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "onDropped", andIncrement);
                        } catch (Exception e) {
                            throw e;
                        }
                    }
                    if (IFk.A07(iFk)) {
                        int andIncrement3 = atomicInteger.getAndIncrement();
                        r0.A0A("com.facebook.messaging.rtc.incall.plugins.notification.feature.effect.interactive.InteractiveEffectNotificationFeature", "messaging.rtc.incall.notification.feature.effect.interactive.InteractiveEffectNotificationFeature", "com.facebook.messaging.rtc.incall.plugins.interfaces.notification.feature.NotificationFeatureInterfaceSpec", andIncrement3, "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "com.facebook.messaging.rtc.incall.plugins.notification.feature.RtcIncallNotificationFeatureKillSwitch", "onDropped");
                        InteractiveEffectNotificationFeature interactiveEffectNotificationFeature = iFk.A06;
                        ((HEt) interactiveEffectNotificationFeature).A00 = null;
                        ((IMH) 1Br.A0B(interactiveEffectNotificationFeature.A04)).A03(interactiveEffectNotificationFeature.A02);
                        I5a i5a = (I5a) 1Br.A0B(interactiveEffectNotificationFeature.A03);
                        HVt hVt = interactiveEffectNotificationFeature.A06;
                        11T.A0F(hVt, 0);
                        i5a.A0A.remove(hVt);
                        r0.A09("messaging.rtc.incall.notification.feature.effect.interactive.InteractiveEffectNotificationFeature", "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "onDropped", andIncrement3);
                    }
                    if (IFk.A0G(iFk)) {
                        int andIncrement4 = atomicInteger.getAndIncrement();
                        r0.A0A("com.facebook.messaging.rtc.incall.plugins.notification.feature.userstateupdate.UserStateUpdateImplementation", "messaging.rtc.incall.notification.feature.userstateupdate.UserStateUpdateImplementation", "com.facebook.messaging.rtc.incall.plugins.interfaces.notification.feature.NotificationFeatureInterfaceSpec", andIncrement4, "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "com.facebook.messaging.rtc.incall.plugins.notification.feature.RtcIncallNotificationFeatureKillSwitch", "onDropped");
                        UserStateUpdateImplementation userStateUpdateImplementation = iFk.A0F;
                        ((HEt) userStateUpdateImplementation).A00 = null;
                        GOp.A0s(userStateUpdateImplementation.A02).A0k(userStateUpdateImplementation.A0C);
                        ((I8j) 1Br.A0B(userStateUpdateImplementation.A05)).A02();
                        Future future2 = userStateUpdateImplementation.A00;
                        if (future2 != null) {
                            future2.cancel(false);
                        }
                        userStateUpdateImplementation.A00 = null;
                        r0.A09("messaging.rtc.incall.notification.feature.userstateupdate.UserStateUpdateImplementation", "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "onDropped", andIncrement4);
                    }
                    if (IFk.A03(iFk)) {
                        int andIncrement5 = atomicInteger.getAndIncrement();
                        r0.A0A("com.facebook.messaging.rtc.incall.plugins.notification.feature.avatar.AvatarImplementation", "messaging.rtc.incall.notification.feature.avatar.AvatarImplementation", "com.facebook.messaging.rtc.incall.plugins.interfaces.notification.feature.NotificationFeatureInterfaceSpec", andIncrement5, "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "com.facebook.messaging.rtc.incall.plugins.notification.feature.RtcIncallNotificationFeatureKillSwitch", "onDropped");
                        AvatarImplementation avatarImplementation = iFk.A02;
                        GOp.A0T(avatarImplementation.A03).A0C(avatarImplementation.A05);
                        ((HEt) avatarImplementation).A00 = null;
                        r0.A09("messaging.rtc.incall.notification.feature.avatar.AvatarImplementation", "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "onDropped", andIncrement5);
                    }
                    if (IFk.A0F(iFk)) {
                        int andIncrement6 = atomicInteger.getAndIncrement();
                        r0.A0A("com.facebook.messaging.rtc.incall.plugins.notification.feature.screensharing.ScreenSharingImplementation", "messaging.rtc.incall.notification.feature.screensharing.ScreenSharingImplementation", "com.facebook.messaging.rtc.incall.plugins.interfaces.notification.feature.NotificationFeatureInterfaceSpec", andIncrement6, "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "com.facebook.messaging.rtc.incall.plugins.notification.feature.RtcIncallNotificationFeatureKillSwitch", "onDropped");
                        ScreenSharingImplementation screenSharingImplementation = iFk.A0E;
                        ((HEt) screenSharingImplementation).A00 = null;
                        GOp.A0g(screenSharingImplementation.A02).CeY(screenSharingImplementation.A03);
                        r0.A09("messaging.rtc.incall.notification.feature.screensharing.ScreenSharingImplementation", "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "onDropped", andIncrement6);
                    }
                    if (IFk.A0B(iFk)) {
                        int andIncrement7 = atomicInteger.getAndIncrement();
                        r0.A0A("com.facebook.messaging.rtc.incall.plugins.notification.feature.promotions.PromotionNotificationFeature", "messaging.rtc.incall.notification.feature.promotions.PromotionNotificationFeature", "com.facebook.messaging.rtc.incall.plugins.interfaces.notification.feature.NotificationFeatureInterfaceSpec", andIncrement7, "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "com.facebook.messaging.rtc.incall.plugins.notification.feature.RtcIncallNotificationFeatureKillSwitch", "onDropped");
                        PromotionNotificationFeature promotionNotificationFeature = iFk.A0A;
                        ((HEt) promotionNotificationFeature).A00 = null;
                        ((JOI) 1Br.A0B(promotionNotificationFeature.A02)).CeW(promotionNotificationFeature.A03);
                        r0.A09("messaging.rtc.incall.notification.feature.promotions.PromotionNotificationFeature", "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "onDropped", andIncrement7);
                    }
                    if (IFk.A02(iFk)) {
                        int andIncrement8 = atomicInteger.getAndIncrement();
                        r0.A0A("com.facebook.messaging.rtc.incall.plugins.notification.feature.audiooutput.AudioOutputImplementation", "messaging.rtc.incall.notification.feature.audiooutput.AudioOutputImplementation", "com.facebook.messaging.rtc.incall.plugins.interfaces.notification.feature.NotificationFeatureInterfaceSpec", andIncrement8, "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "com.facebook.messaging.rtc.incall.plugins.notification.feature.RtcIncallNotificationFeatureKillSwitch", "onDropped");
                        AudioOutputImplementation audioOutputImplementation = iFk.A01;
                        ((HEt) audioOutputImplementation).A00 = null;
                        if (I29.A00(audioOutputImplementation.A04)) {
                            Gw0 gw0 = (Gw0) 1Br.A0B(audioOutputImplementation.A01);
                            if (gw0 != null) {
                                JGM jgm = audioOutputImplementation.A05;
                                11T.A0F(jgm, 0);
                                gw0.A09.A01.Ce5(jgm);
                            }
                        } else {
                            GOq.A0r(audioOutputImplementation.A02).Ce5(audioOutputImplementation.A05);
                        }
                        r0.A09("messaging.rtc.incall.notification.feature.audiooutput.AudioOutputImplementation", "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "onDropped", andIncrement8);
                    }
                    if (IFk.A0D(iFk)) {
                        int andIncrement9 = atomicInteger.getAndIncrement();
                        r0.A0A("com.facebook.messaging.rtc.incall.plugins.notification.feature.room.RoomImplementation", "messaging.rtc.incall.notification.feature.room.RoomImplementation", "com.facebook.messaging.rtc.incall.plugins.interfaces.notification.feature.NotificationFeatureInterfaceSpec", andIncrement9, "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "com.facebook.messaging.rtc.incall.plugins.notification.feature.RtcIncallNotificationFeatureKillSwitch", "onDropped");
                        RoomImplementation roomImplementation = iFk.A0C;
                        2Qb A0X = AbJ.A0X(roomImplementation.A02);
                        A0X.A0V.remove(roomImplementation.A03);
                        ((HEt) roomImplementation).A00 = null;
                        r0.A09("messaging.rtc.incall.notification.feature.room.RoomImplementation", "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "onDropped", andIncrement9);
                    }
                    if (IFk.A0H(iFk)) {
                        int andIncrement10 = atomicInteger.getAndIncrement();
                        r0.A0A("com.facebook.messaging.rtc.incall.plugins.notification.feature.voiceactivity.VoiceActivityImplementation", "messaging.rtc.incall.notification.feature.voiceactivity.VoiceActivityImplementation", "com.facebook.messaging.rtc.incall.plugins.interfaces.notification.feature.NotificationFeatureInterfaceSpec", andIncrement10, "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "com.facebook.messaging.rtc.incall.plugins.notification.feature.RtcIncallNotificationFeatureKillSwitch", "onDropped");
                        VoiceActivityImplementation voiceActivityImplementation = iFk.A0G;
                        GOp.A0O(voiceActivityImplementation.A09).A02(voiceActivityImplementation.A0B);
                        ((HEt) voiceActivityImplementation).A00 = null;
                        r0.A09("messaging.rtc.incall.notification.feature.voiceactivity.VoiceActivityImplementation", "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "onDropped", andIncrement10);
                    }
                    if (IFk.A0A(iFk)) {
                        int andIncrement11 = atomicInteger.getAndIncrement();
                        r0.A0A("com.facebook.messaging.rtc.incall.plugins.notification.feature.moderatorcontrols.ModeratorControlsImplementation", "messaging.rtc.incall.notification.feature.moderatorcontrols.ModeratorControlsImplementation", "com.facebook.messaging.rtc.incall.plugins.interfaces.notification.feature.NotificationFeatureInterfaceSpec", andIncrement11, "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "com.facebook.messaging.rtc.incall.plugins.notification.feature.RtcIncallNotificationFeatureKillSwitch", "onDropped");
                        ModeratorControlsImplementation moderatorControlsImplementation = iFk.A09;
                        IDd iDd = (IDd) 1Br.A0B(moderatorControlsImplementation.A05);
                        HxJ hxJ = moderatorControlsImplementation.A0B;
                        11T.A0F(hxJ, 0);
                        iDd.A0I.remove(hxJ);
                        ((HEt) moderatorControlsImplementation).A00 = null;
                        r0.A09("messaging.rtc.incall.notification.feature.moderatorcontrols.ModeratorControlsImplementation", "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "onDropped", andIncrement11);
                    }
                    if (IFk.A01(iFk)) {
                        int andIncrement12 = atomicInteger.getAndIncrement();
                        r0.A0A("com.facebook.messaging.rtc.incall.plugins.notification.feature.audioevents.AudioEventsImplementation", "messaging.rtc.incall.notification.feature.audioevents.AudioEventsImplementation", "com.facebook.messaging.rtc.incall.plugins.interfaces.notification.feature.NotificationFeatureInterfaceSpec", andIncrement12, "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "com.facebook.messaging.rtc.incall.plugins.notification.feature.RtcIncallNotificationFeatureKillSwitch", "onDropped");
                        AudioEventsImplementation audioEventsImplementation = iFk.A00;
                        ((HEt) audioEventsImplementation).A00 = null;
                        GOp.A0O(audioEventsImplementation.A03).A02(audioEventsImplementation.A04);
                        r0.A09("messaging.rtc.incall.notification.feature.audioevents.AudioEventsImplementation", "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "onDropped", andIncrement12);
                    }
                    if (IFk.A04(iFk)) {
                        int andIncrement13 = atomicInteger.getAndIncrement();
                        r0.A0A("com.facebook.messaging.rtc.incall.plugins.notification.feature.coplay.CoplayImplementation", "messaging.rtc.incall.notification.feature.coplay.CoplayImplementation", "com.facebook.messaging.rtc.incall.plugins.interfaces.notification.feature.NotificationFeatureInterfaceSpec", andIncrement13, "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "com.facebook.messaging.rtc.incall.plugins.notification.feature.RtcIncallNotificationFeatureKillSwitch", "onDropped");
                        iFk.A03.A02();
                        r0.A09("messaging.rtc.incall.notification.feature.coplay.CoplayImplementation", "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "onDropped", andIncrement13);
                    }
                    if (IFk.A06(iFk)) {
                        int andIncrement14 = atomicInteger.getAndIncrement();
                        r0.A0A("com.facebook.messaging.rtc.incall.plugins.notification.feature.effect.EffectImplementation", "messaging.rtc.incall.notification.feature.effect.EffectImplementation", "com.facebook.messaging.rtc.incall.plugins.interfaces.notification.feature.NotificationFeatureInterfaceSpec", andIncrement14, "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "com.facebook.messaging.rtc.incall.plugins.notification.feature.RtcIncallNotificationFeatureKillSwitch", "onDropped");
                        EffectImplementation effectImplementation = iFk.A05;
                        HZt hZt = (HZt) 1Br.A0B(effectImplementation.A05);
                        C2523Gg7 c2523Gg7 = effectImplementation.A03;
                        11T.A0F(c2523Gg7, 0);
                        hZt.A01.remove(c2523Gg7);
                        Hja hja = (Hja) 1Br.A0B(effectImplementation.A08);
                        FbUserSession fbUserSession = effectImplementation.A02;
                        HVs hVs = effectImplementation.A0J;
                        1BK.A1M(fbUserSession, hVs);
                        if (GOo.A1Y(hVs, hja.A07)) {
                            1BY r02 = hja.A03.A00;
                            Hzc hzc = (Hzc) 1Lo.A04((Context) null, fbUserSession, r02, 115404);
                            HPu hPu = hja.A01;
                            11T.A0F(hPu, 0);
                            hzc.A05.remove(hPu);
                            HZt hZt2 = (HZt) 1Lo.A04((Context) null, fbUserSession, r02, 115410);
                            HFU hfu = hja.A00;
                            11T.A0F(hfu, 0);
                            hZt2.A01.remove(hfu);
                        }
                        ((ICN) 1Br.A0B(effectImplementation.A0E)).A05(effectImplementation.A0K);
                        GOp.A0F(effectImplementation.A09).A09(effectImplementation.A04);
                        ((HEt) effectImplementation).A00 = null;
                        r0.A09("messaging.rtc.incall.notification.feature.effect.EffectImplementation", "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "onDropped", andIncrement14);
                    }
                    if (IFk.A08(iFk)) {
                        int andIncrement15 = atomicInteger.getAndIncrement();
                        r0.A0A("com.facebook.messaging.rtc.incall.plugins.notification.feature.groupescalation.GroupEscalationImplementation", "messaging.rtc.incall.notification.feature.groupescalation.GroupEscalationImplementation", "com.facebook.messaging.rtc.incall.plugins.interfaces.notification.feature.NotificationFeatureInterfaceSpec", andIncrement15, "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "com.facebook.messaging.rtc.incall.plugins.notification.feature.RtcIncallNotificationFeatureKillSwitch", "onDropped");
                        GroupEscalationImplementation groupEscalationImplementation = iFk.A07;
                        GOp.A0s(groupEscalationImplementation.A01).A0k(groupEscalationImplementation.A04);
                        ((HEt) groupEscalationImplementation).A00 = null;
                        r0.A09("messaging.rtc.incall.notification.feature.groupescalation.GroupEscalationImplementation", "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "onDropped", andIncrement15);
                    }
                    if (IFk.A0C(iFk)) {
                        int andIncrement16 = atomicInteger.getAndIncrement();
                        r0.A0A("com.facebook.messaging.rtc.incall.plugins.notification.feature.raisehand.RaiseHandImplementation", "messaging.rtc.incall.notification.feature.raisehand.RaiseHandImplementation", "com.facebook.messaging.rtc.incall.plugins.interfaces.notification.feature.NotificationFeatureInterfaceSpec", andIncrement16, "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "com.facebook.messaging.rtc.incall.plugins.notification.feature.RtcIncallNotificationFeatureKillSwitch", "onDropped");
                        RaiseHandImplementation raiseHandImplementation = iFk.A0B;
                        ((I4x) 1Br.A0B(raiseHandImplementation.A04)).A02(raiseHandImplementation.A08);
                        ((I8j) 1Br.A0B(raiseHandImplementation.A02)).A02();
                        ((HEt) raiseHandImplementation).A00 = null;
                        r0.A09("messaging.rtc.incall.notification.feature.raisehand.RaiseHandImplementation", "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "onDropped", andIncrement16);
                    }
                    if (IFk.A0E(iFk)) {
                        int andIncrement17 = atomicInteger.getAndIncrement();
                        r0.A0A("com.facebook.messaging.rtc.incall.plugins.notification.feature.rooms2live.Rooms2LiveImplementation", "messaging.rtc.incall.notification.feature.rooms2live.Rooms2LiveImplementation", "com.facebook.messaging.rtc.incall.plugins.interfaces.notification.feature.NotificationFeatureInterfaceSpec", andIncrement17, "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "com.facebook.messaging.rtc.incall.plugins.notification.feature.RtcIncallNotificationFeatureKillSwitch", "onDropped");
                        Rooms2LiveImplementation rooms2LiveImplementation = iFk.A0D;
                        GOp.A0X(rooms2LiveImplementation.A02).A04(rooms2LiveImplementation.A04);
                        ((HEt) rooms2LiveImplementation).A00 = null;
                        r0.A09("messaging.rtc.incall.notification.feature.rooms2live.Rooms2LiveImplementation", "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "onDropped", andIncrement17);
                    }
                    if (IFk.A09(iFk)) {
                        int andIncrement18 = atomicInteger.getAndIncrement();
                        r0.A0A("com.facebook.messaging.rtc.incall.plugins.notification.feature.lowbatterynotification.LowBatteryNotificationImplementation", "messaging.rtc.incall.notification.feature.lowbatterynotification.LowBatteryNotificationImplementation", "com.facebook.messaging.rtc.incall.plugins.interfaces.notification.feature.NotificationFeatureInterfaceSpec", andIncrement18, "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "com.facebook.messaging.rtc.incall.plugins.notification.feature.RtcIncallNotificationFeatureKillSwitch", "onDropped");
                        LowBatteryNotificationImplementation lowBatteryNotificationImplementation = iFk.A08;
                        ((HEt) lowBatteryNotificationImplementation).A00 = null;
                        C4A7 c4a7 = (C4A7) 1Br.A0B(lowBatteryNotificationImplementation.A01);
                        IQH iqh = lowBatteryNotificationImplementation.A0A;
                        synchronized (c4a7.A03) {
                            c4a7.A02.A03(iqh);
                        }
                        GOp.A0O(lowBatteryNotificationImplementation.A05).A02(lowBatteryNotificationImplementation.A0B);
                        r0.A09("messaging.rtc.incall.notification.feature.lowbatterynotification.LowBatteryNotificationImplementation", "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "onDropped", andIncrement18);
                    }
                    r0.A02((Exception) null, "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "onDropped", andIncrement2);
                    this.A01 = null;
                } catch (Throwable th) {
                    r0.A04((Exception) null, str, "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "onDropped", andIncrement);
                    throw th;
                }
            } catch (Throwable th2) {
                r0.A02((Exception) null, "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "onDropped", andIncrement2);
                throw th2;
            }
        }
    }

    public /* bridge */ /* synthetic */ void A0c(JFq jFq) {
        int andIncrement;
        String str;
        11T.A0F(jFq, 0);
        GOp.A0e(this.A0A).A02(this.A0E);
        GOp.A0Q(this.A06).A60(this.A0C);
        A0d();
        HVq hVq = new HVq((HPY) C1Y6.A00(this.A04, "com_facebook_messaging_rtc_incall_plugins_interfaces_notification_feature_NotificationFeatureInterfaceSpec", "All", new Object[]{this.A0D, this.A05}));
        this.A01 = hVq;
        IFk iFk = hVq.A00.A00;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement2 = atomicInteger.getAndIncrement();
        1YC r0 = iFk.A0Y;
        r0.A08("com.facebook.messaging.rtc.incall.plugins.interfaces.notification.feature.NotificationFeatureInterfaceSpec", "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "onTaken", andIncrement2);
        Exception e = null;
        try {
            if (IFk.A05(iFk)) {
                andIncrement = atomicInteger.getAndIncrement();
                str = "messaging.rtc.incall.notification.feature.cowatch.CoWatchNotificationFeature";
                r0.A0A("com.facebook.messaging.rtc.incall.plugins.notification.feature.cowatch.CoWatchNotificationFeature", str, "com.facebook.messaging.rtc.incall.plugins.interfaces.notification.feature.NotificationFeatureInterfaceSpec", andIncrement, "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "com.facebook.messaging.rtc.incall.plugins.notification.feature.RtcIncallNotificationFeatureKillSwitch", "onTaken");
                try {
                    try {
                        CoWatchNotificationFeature coWatchNotificationFeature = iFk.A04;
                        A00(iFk, coWatchNotificationFeature);
                        GOp.A0V(coWatchNotificationFeature.A07).A06(coWatchNotificationFeature.A0G);
                        HRC hrc = (HRC) 1Br.A0B(coWatchNotificationFeature.A05);
                        HVr hVr = coWatchNotificationFeature.A0I;
                        11T.A0F(hVr, 0);
                        hrc.A00.add(hVr);
                        GOp.A0Z(coWatchNotificationFeature.A0A).A01(coWatchNotificationFeature.A0H);
                        GOp.A0s(coWatchNotificationFeature.A03).A0l(coWatchNotificationFeature.A0J, (WebrtcUiHandlerListenerParams) null);
                        ((CaN) 1Br.A0B(coWatchNotificationFeature.A08)).A03(coWatchNotificationFeature.A0F, true);
                        r0.A09(str, "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "onTaken", andIncrement);
                    } catch (Throwable th) {
                        r0.A04(e, str, "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "onTaken", andIncrement);
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    throw e;
                }
            }
            if (IFk.A07(iFk)) {
                int andIncrement3 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.rtc.incall.plugins.notification.feature.effect.interactive.InteractiveEffectNotificationFeature", "messaging.rtc.incall.notification.feature.effect.interactive.InteractiveEffectNotificationFeature", "com.facebook.messaging.rtc.incall.plugins.interfaces.notification.feature.NotificationFeatureInterfaceSpec", andIncrement3, "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "com.facebook.messaging.rtc.incall.plugins.notification.feature.RtcIncallNotificationFeatureKillSwitch", "onTaken");
                InteractiveEffectNotificationFeature interactiveEffectNotificationFeature = iFk.A06;
                A00(iFk, interactiveEffectNotificationFeature);
                ((IMH) 1Br.A0B(interactiveEffectNotificationFeature.A04)).A02(interactiveEffectNotificationFeature.A02);
                I5a i5a = (I5a) 1Br.A0B(interactiveEffectNotificationFeature.A03);
                HVt hVt = interactiveEffectNotificationFeature.A06;
                11T.A0F(hVt, 0);
                i5a.A0A.add(hVt);
                r0.A09("messaging.rtc.incall.notification.feature.effect.interactive.InteractiveEffectNotificationFeature", "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "onTaken", andIncrement3);
            }
            if (IFk.A0G(iFk)) {
                int andIncrement4 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.rtc.incall.plugins.notification.feature.userstateupdate.UserStateUpdateImplementation", "messaging.rtc.incall.notification.feature.userstateupdate.UserStateUpdateImplementation", "com.facebook.messaging.rtc.incall.plugins.interfaces.notification.feature.NotificationFeatureInterfaceSpec", andIncrement4, "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "com.facebook.messaging.rtc.incall.plugins.notification.feature.RtcIncallNotificationFeatureKillSwitch", "onTaken");
                UserStateUpdateImplementation userStateUpdateImplementation = iFk.A0F;
                A00(iFk, userStateUpdateImplementation);
                GOp.A0s(userStateUpdateImplementation.A02).A0l(userStateUpdateImplementation.A0C, new WebrtcUiHandlerListenerParams());
                r0.A09("messaging.rtc.incall.notification.feature.userstateupdate.UserStateUpdateImplementation", "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "onTaken", andIncrement4);
            }
            if (IFk.A03(iFk)) {
                int andIncrement5 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.rtc.incall.plugins.notification.feature.avatar.AvatarImplementation", "messaging.rtc.incall.notification.feature.avatar.AvatarImplementation", "com.facebook.messaging.rtc.incall.plugins.interfaces.notification.feature.NotificationFeatureInterfaceSpec", andIncrement5, "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "com.facebook.messaging.rtc.incall.plugins.notification.feature.RtcIncallNotificationFeatureKillSwitch", "onTaken");
                AvatarImplementation avatarImplementation = iFk.A02;
                A00(iFk, avatarImplementation);
                GOp.A0T(avatarImplementation.A03).A0B(avatarImplementation.A05);
                r0.A09("messaging.rtc.incall.notification.feature.avatar.AvatarImplementation", "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "onTaken", andIncrement5);
            }
            if (IFk.A0F(iFk)) {
                int andIncrement6 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.rtc.incall.plugins.notification.feature.screensharing.ScreenSharingImplementation", "messaging.rtc.incall.notification.feature.screensharing.ScreenSharingImplementation", "com.facebook.messaging.rtc.incall.plugins.interfaces.notification.feature.NotificationFeatureInterfaceSpec", andIncrement6, "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "com.facebook.messaging.rtc.incall.plugins.notification.feature.RtcIncallNotificationFeatureKillSwitch", "onTaken");
                ScreenSharingImplementation screenSharingImplementation = iFk.A0E;
                A00(iFk, screenSharingImplementation);
                GOp.A0g(screenSharingImplementation.A02).A63(screenSharingImplementation.A03);
                r0.A09("messaging.rtc.incall.notification.feature.screensharing.ScreenSharingImplementation", "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "onTaken", andIncrement6);
            }
            if (IFk.A0B(iFk)) {
                int andIncrement7 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.rtc.incall.plugins.notification.feature.promotions.PromotionNotificationFeature", "messaging.rtc.incall.notification.feature.promotions.PromotionNotificationFeature", "com.facebook.messaging.rtc.incall.plugins.interfaces.notification.feature.NotificationFeatureInterfaceSpec", andIncrement7, "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "com.facebook.messaging.rtc.incall.plugins.notification.feature.RtcIncallNotificationFeatureKillSwitch", "onTaken");
                PromotionNotificationFeature promotionNotificationFeature = iFk.A0A;
                A00(iFk, promotionNotificationFeature);
                ((JOI) 1Br.A0B(promotionNotificationFeature.A02)).A61(promotionNotificationFeature.A03);
                r0.A09("messaging.rtc.incall.notification.feature.promotions.PromotionNotificationFeature", "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "onTaken", andIncrement7);
            }
            if (IFk.A02(iFk)) {
                int andIncrement8 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.rtc.incall.plugins.notification.feature.audiooutput.AudioOutputImplementation", "messaging.rtc.incall.notification.feature.audiooutput.AudioOutputImplementation", "com.facebook.messaging.rtc.incall.plugins.interfaces.notification.feature.NotificationFeatureInterfaceSpec", andIncrement8, "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "com.facebook.messaging.rtc.incall.plugins.notification.feature.RtcIncallNotificationFeatureKillSwitch", "onTaken");
                AudioOutputImplementation audioOutputImplementation = iFk.A01;
                A00(iFk, audioOutputImplementation);
                if (I29.A00(audioOutputImplementation.A04)) {
                    Gw0 gw0 = (Gw0) 1Br.A0B(audioOutputImplementation.A01);
                    if (gw0 != null) {
                        JGM jgm = audioOutputImplementation.A05;
                        11T.A0F(jgm, 0);
                        gw0.A09.A01.A5F(jgm);
                    }
                } else {
                    GOq.A0r(audioOutputImplementation.A02).A5F(audioOutputImplementation.A05);
                }
                r0.A09("messaging.rtc.incall.notification.feature.audiooutput.AudioOutputImplementation", "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "onTaken", andIncrement8);
            }
            if (IFk.A0D(iFk)) {
                int andIncrement9 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.rtc.incall.plugins.notification.feature.room.RoomImplementation", "messaging.rtc.incall.notification.feature.room.RoomImplementation", "com.facebook.messaging.rtc.incall.plugins.interfaces.notification.feature.NotificationFeatureInterfaceSpec", andIncrement9, "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "com.facebook.messaging.rtc.incall.plugins.notification.feature.RtcIncallNotificationFeatureKillSwitch", "onTaken");
                RoomImplementation roomImplementation = iFk.A0C;
                A00(iFk, roomImplementation);
                GOn.A1V(AbJ.A0X(roomImplementation.A02), roomImplementation.A03);
                r0.A09("messaging.rtc.incall.notification.feature.room.RoomImplementation", "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "onTaken", andIncrement9);
            }
            if (IFk.A0H(iFk)) {
                int andIncrement10 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.rtc.incall.plugins.notification.feature.voiceactivity.VoiceActivityImplementation", "messaging.rtc.incall.notification.feature.voiceactivity.VoiceActivityImplementation", "com.facebook.messaging.rtc.incall.plugins.interfaces.notification.feature.NotificationFeatureInterfaceSpec", andIncrement10, "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "com.facebook.messaging.rtc.incall.plugins.notification.feature.RtcIncallNotificationFeatureKillSwitch", "onTaken");
                VoiceActivityImplementation voiceActivityImplementation = iFk.A0G;
                A00(iFk, voiceActivityImplementation);
                C00i c00i = voiceActivityImplementation.A09.A00;
                2JN A0R = GOo.A0R(c00i);
                IY8 iy8 = voiceActivityImplementation.A0B;
                GOn.A1U(iy8, A0R);
                IY8.A03(c00i, iy8);
                r0.A09("messaging.rtc.incall.notification.feature.voiceactivity.VoiceActivityImplementation", "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "onTaken", andIncrement10);
            }
            if (IFk.A0A(iFk)) {
                int andIncrement11 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.rtc.incall.plugins.notification.feature.moderatorcontrols.ModeratorControlsImplementation", "messaging.rtc.incall.notification.feature.moderatorcontrols.ModeratorControlsImplementation", "com.facebook.messaging.rtc.incall.plugins.interfaces.notification.feature.NotificationFeatureInterfaceSpec", andIncrement11, "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "com.facebook.messaging.rtc.incall.plugins.notification.feature.RtcIncallNotificationFeatureKillSwitch", "onTaken");
                ModeratorControlsImplementation moderatorControlsImplementation = iFk.A09;
                A00(iFk, moderatorControlsImplementation);
                IDd iDd = (IDd) 1Br.A0B(moderatorControlsImplementation.A05);
                HxJ hxJ = moderatorControlsImplementation.A0B;
                11T.A0F(hxJ, 0);
                iDd.A0I.add(hxJ);
                r0.A09("messaging.rtc.incall.notification.feature.moderatorcontrols.ModeratorControlsImplementation", "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "onTaken", andIncrement11);
            }
            if (IFk.A01(iFk)) {
                int andIncrement12 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.rtc.incall.plugins.notification.feature.audioevents.AudioEventsImplementation", "messaging.rtc.incall.notification.feature.audioevents.AudioEventsImplementation", "com.facebook.messaging.rtc.incall.plugins.interfaces.notification.feature.NotificationFeatureInterfaceSpec", andIncrement12, "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "com.facebook.messaging.rtc.incall.plugins.notification.feature.RtcIncallNotificationFeatureKillSwitch", "onTaken");
                AudioEventsImplementation audioEventsImplementation = iFk.A00;
                A00(iFk, audioEventsImplementation);
                GOn.A1U(audioEventsImplementation.A04, GOp.A0O(audioEventsImplementation.A03));
                r0.A09("messaging.rtc.incall.notification.feature.audioevents.AudioEventsImplementation", "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "onTaken", andIncrement12);
            }
            if (IFk.A04(iFk)) {
                int andIncrement13 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.rtc.incall.plugins.notification.feature.coplay.CoplayImplementation", "messaging.rtc.incall.notification.feature.coplay.CoplayImplementation", "com.facebook.messaging.rtc.incall.plugins.interfaces.notification.feature.NotificationFeatureInterfaceSpec", andIncrement13, "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "com.facebook.messaging.rtc.incall.plugins.notification.feature.RtcIncallNotificationFeatureKillSwitch", "onTaken");
                iFk.A03.A03(iFk.A0Z);
                r0.A09("messaging.rtc.incall.notification.feature.coplay.CoplayImplementation", "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "onTaken", andIncrement13);
            }
            if (IFk.A06(iFk)) {
                int andIncrement14 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.rtc.incall.plugins.notification.feature.effect.EffectImplementation", "messaging.rtc.incall.notification.feature.effect.EffectImplementation", "com.facebook.messaging.rtc.incall.plugins.interfaces.notification.feature.NotificationFeatureInterfaceSpec", andIncrement14, "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "com.facebook.messaging.rtc.incall.plugins.notification.feature.RtcIncallNotificationFeatureKillSwitch", "onTaken");
                EffectImplementation effectImplementation = iFk.A05;
                I8a i8a = iFk.A0Z;
                11T.A0F(i8a, 0);
                HZt hZt = (HZt) 1Br.A0B(effectImplementation.A05);
                C2523Gg7 c2523Gg7 = effectImplementation.A03;
                11T.A0F(c2523Gg7, 0);
                hZt.A01.add(c2523Gg7);
                Hja hja = (Hja) 1Br.A0B(effectImplementation.A08);
                FbUserSession fbUserSession = effectImplementation.A02;
                HVs hVs = effectImplementation.A0J;
                11T.A0F(fbUserSession, 0);
                Set set = hja.A07;
                if (hVs != null) {
                    set.add(hVs);
                    if (set.size() == 1) {
                        1BY r02 = hja.A03.A00;
                        Hzc hzc = (Hzc) 1Lo.A04((Context) null, fbUserSession, r02, 115404);
                        HPu hPu = hja.A01;
                        11T.A0F(hPu, 0);
                        hzc.A05.add(hPu);
                        HZt hZt2 = (HZt) 1Lo.A04((Context) null, fbUserSession, r02, 115410);
                        HFU hfu = hja.A00;
                        11T.A0F(hfu, 0);
                        hZt2.A01.add(hfu);
                    }
                }
                ((ICN) 1Br.A0B(effectImplementation.A0E)).A04(effectImplementation.A0K);
                GOp.A0F(effectImplementation.A09).A08(effectImplementation.A04);
                ((HEt) effectImplementation).A00 = i8a;
                r0.A09("messaging.rtc.incall.notification.feature.effect.EffectImplementation", "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "onTaken", andIncrement14);
            }
            if (IFk.A08(iFk)) {
                int andIncrement15 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.rtc.incall.plugins.notification.feature.groupescalation.GroupEscalationImplementation", "messaging.rtc.incall.notification.feature.groupescalation.GroupEscalationImplementation", "com.facebook.messaging.rtc.incall.plugins.interfaces.notification.feature.NotificationFeatureInterfaceSpec", andIncrement15, "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "com.facebook.messaging.rtc.incall.plugins.notification.feature.RtcIncallNotificationFeatureKillSwitch", "onTaken");
                GroupEscalationImplementation groupEscalationImplementation = iFk.A07;
                A00(iFk, groupEscalationImplementation);
                GOp.A0s(groupEscalationImplementation.A01).A0l(groupEscalationImplementation.A04, (WebrtcUiHandlerListenerParams) null);
                r0.A09("messaging.rtc.incall.notification.feature.groupescalation.GroupEscalationImplementation", "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "onTaken", andIncrement15);
            }
            if (IFk.A0C(iFk)) {
                int andIncrement16 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.rtc.incall.plugins.notification.feature.raisehand.RaiseHandImplementation", "messaging.rtc.incall.notification.feature.raisehand.RaiseHandImplementation", "com.facebook.messaging.rtc.incall.plugins.interfaces.notification.feature.NotificationFeatureInterfaceSpec", andIncrement16, "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "com.facebook.messaging.rtc.incall.plugins.notification.feature.RtcIncallNotificationFeatureKillSwitch", "onTaken");
                RaiseHandImplementation raiseHandImplementation = iFk.A0B;
                A00(iFk, raiseHandImplementation);
                ((I4x) 1Br.A0B(raiseHandImplementation.A04)).A01(raiseHandImplementation.A08);
                r0.A09("messaging.rtc.incall.notification.feature.raisehand.RaiseHandImplementation", "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "onTaken", andIncrement16);
            }
            if (IFk.A0E(iFk)) {
                int andIncrement17 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.rtc.incall.plugins.notification.feature.rooms2live.Rooms2LiveImplementation", "messaging.rtc.incall.notification.feature.rooms2live.Rooms2LiveImplementation", "com.facebook.messaging.rtc.incall.plugins.interfaces.notification.feature.NotificationFeatureInterfaceSpec", andIncrement17, "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "com.facebook.messaging.rtc.incall.plugins.notification.feature.RtcIncallNotificationFeatureKillSwitch", "onTaken");
                Rooms2LiveImplementation rooms2LiveImplementation = iFk.A0D;
                A00(iFk, rooms2LiveImplementation);
                GOp.A0X(rooms2LiveImplementation.A02).A03(rooms2LiveImplementation.A04);
                r0.A09("messaging.rtc.incall.notification.feature.rooms2live.Rooms2LiveImplementation", "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "onTaken", andIncrement17);
            }
            if (IFk.A09(iFk)) {
                andIncrement = atomicInteger.getAndIncrement();
                str = "messaging.rtc.incall.notification.feature.lowbatterynotification.LowBatteryNotificationImplementation";
                r0.A0A("com.facebook.messaging.rtc.incall.plugins.notification.feature.lowbatterynotification.LowBatteryNotificationImplementation", str, "com.facebook.messaging.rtc.incall.plugins.interfaces.notification.feature.NotificationFeatureInterfaceSpec", andIncrement, "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "com.facebook.messaging.rtc.incall.plugins.notification.feature.RtcIncallNotificationFeatureKillSwitch", "onTaken");
                LowBatteryNotificationImplementation lowBatteryNotificationImplementation = iFk.A08;
                A00(iFk, lowBatteryNotificationImplementation);
                ((C4A7) 1Br.A0B(lowBatteryNotificationImplementation.A01)).A03(lowBatteryNotificationImplementation.A0A);
                GOn.A1U(lowBatteryNotificationImplementation.A0B, GOp.A0O(lowBatteryNotificationImplementation.A05));
                r0.A09(str, "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "onTaken", andIncrement);
            }
            r0.A02((Exception) null, "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "onTaken", andIncrement2);
        } catch (Throwable th2) {
            r0.A02(e, "messaging.rtc.incall.notification.feature.NotificationFeatureInterfaceSpec", "onTaken", andIncrement2);
            throw th2;
        }
    }

    public final void A0d() {
        JPV jpv;
        1Br.A0C(this.A09);
        this.A03 = true;
        JFq jFq = ((GS2) this).A00;
        if (AbM.A1a(jFq) && (jpv = (JPV) AbM.A0r(jFq)) != null) {
            NotificationView notificationView = (NotificationView) jpv;
            notificationView.animate().setDuration(250L).translationY(notificationView.A00).alpha(0.0f).withEndAction(new Iry(this)).start();
        }
        GOo.A1R(this.A02);
    }
}
