package X;

import android.content.Context;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.nativepagereply.badgeupdate.logging.ProfileBadgeImpressionLogger;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.5dR, reason: invalid class name */
/* loaded from: 5dR.class */
public final class C5dR {
    public final /* synthetic */ 5dI A00;

    public C5dR(5dI r302) {
        this.A00 = r302;
    }

    public void A00() {
        5dI r0 = this.A00;
        ((1FP) r0.A03.A00.get()).D3D(3Ds.A04, 0S2.A01, new 5dT(r0), "settings_badging");
        C5x5 c5x5 = ((C5x4) C1Y6.A00(r0.A01, "com_facebook_messaging_navigation_home_tabs_plugins_interfaces_badge_BadgeHandlerInterfaceSpec", "BadgeHandler", new Object[0])).A00;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r02 = c5x5.A01;
        r02.A08("com.facebook.messaging.navigation.home.tabs.plugins.interfaces.badge.BadgeHandlerInterfaceSpec", "messaging.navigation.home.tabs.badge.BadgeHandlerInterfaceSpec", "onBadgeCountUpdated", andIncrement);
        try {
            if (c5x5.A00 == null) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                r02.A0B("com.facebook.messaging.nativepagereply.plugins.core.badgehandler.BusinessInboxProfileBadgeHandlerImplementation", "messaging.nativepagereply.core.badgehandler.BusinessInboxProfileBadgeHandlerImplementation", "com.facebook.messaging.navigation.home.tabs.plugins.interfaces.badge.BadgeHandlerInterfaceSpec", "messaging.navigation.home.tabs.badge.BadgeHandlerInterfaceSpec", "com.facebook.messaging.nativepagereply.plugins.core.BusinessInboxCoreKillSwitch", andIncrement2);
                Exception exc = null;
                try {
                    try {
                        int i = C1Y6.A00;
                        Boolean A00 = C2ia.A00(i);
                        Object obj = A00 != null ? A00.booleanValue() : C2ia.A01(r02, atomicInteger, i) ? C1Y6.A02 : C1Y6.A03;
                        c5x5.A00 = obj;
                        boolean z = false;
                        if (obj != C1Y6.A03) {
                            z = true;
                        }
                        r02.A03((Exception) null, "messaging.nativepagereply.core.badgehandler.BusinessInboxProfileBadgeHandlerImplementation", "messaging.navigation.home.tabs.badge.BadgeHandlerInterfaceSpec", andIncrement2, z);
                    } catch (Throwable th) {
                        th = th;
                        r02.A03(exc, "messaging.nativepagereply.core.badgehandler.BusinessInboxProfileBadgeHandlerImplementation", "messaging.navigation.home.tabs.badge.BadgeHandlerInterfaceSpec", andIncrement2, 1BK.A1V(c5x5.A00, C1Y6.A03));
                        throw th;
                    }
                } catch (Exception e) {
                    c5x5.A00 = C1Y6.A03;
                    try {
                        throw e;
                    } catch (Throwable th2) {
                        th = th2;
                        exc = e;
                        r02.A03(exc, "messaging.nativepagereply.core.badgehandler.BusinessInboxProfileBadgeHandlerImplementation", "messaging.navigation.home.tabs.badge.BadgeHandlerInterfaceSpec", andIncrement2, 1BK.A1V(c5x5.A00, C1Y6.A03));
                        throw th;
                    }
                }
            }
            if (c5x5.A00 != C1Y6.A03) {
                int andIncrement3 = atomicInteger.getAndIncrement();
                r02.A0A("com.facebook.messaging.nativepagereply.plugins.core.badgehandler.BusinessInboxProfileBadgeHandlerImplementation", "messaging.nativepagereply.core.badgehandler.BusinessInboxProfileBadgeHandlerImplementation", "com.facebook.messaging.navigation.home.tabs.plugins.interfaces.badge.BadgeHandlerInterfaceSpec", andIncrement3, "messaging.navigation.home.tabs.badge.BadgeHandlerInterfaceSpec", "com.facebook.messaging.nativepagereply.plugins.core.BusinessInboxCoreKillSwitch", "onBadgeCountUpdated");
                try {
                    try {
                        ProfileBadgeImpressionLogger profileBadgeImpressionLogger = (ProfileBadgeImpressionLogger) 1Bi.A03(49605);
                        Context A002 = FbInjector.A00();
                        11T.A0A(A002);
                        profileBadgeImpressionLogger.A00(1Fw.A04((1EZ) 1Bn.A0E(A002, (1BY) null, 16428)), 1);
                        r02.A04((Exception) null, "messaging.nativepagereply.core.badgehandler.BusinessInboxProfileBadgeHandlerImplementation", "messaging.navigation.home.tabs.badge.BadgeHandlerInterfaceSpec", "onBadgeCountUpdated", andIncrement3);
                    } catch (Exception e2) {
                        throw e2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    r02.A04((Exception) null, "messaging.nativepagereply.core.badgehandler.BusinessInboxProfileBadgeHandlerImplementation", "messaging.navigation.home.tabs.badge.BadgeHandlerInterfaceSpec", "onBadgeCountUpdated", andIncrement3);
                    throw th;
                }
            }
            r02.A02((Exception) null, "messaging.navigation.home.tabs.badge.BadgeHandlerInterfaceSpec", "onBadgeCountUpdated", andIncrement);
        } catch (Throwable th4) {
            r02.A02((Exception) null, "messaging.navigation.home.tabs.badge.BadgeHandlerInterfaceSpec", "onBadgeCountUpdated", andIncrement);
            throw th4;
        }
    }
}
