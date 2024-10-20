package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.contactstab.plugins.loader.customstatus.ContactsTabCustomStatusLoader;
import com.facebook.messaging.internalprefs.presence.MessengerInternalPresenceDebugActivity;
import com.facebook.presence.plugins.status.statusprofilesubheading.StatusProfileSubheadingImplementation;
import com.facebook.presence.plugins.status.threadsubtitledata.StatusThreadSubtitleData;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.ExecutorService;

/* loaded from: A21.class */
public final class A21 implements 2Ti {
    public final int A00;
    public final Object A01;

    public A21(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void CND() {
        ImmutableList immutableList;
        switch (this.A00) {
            case 0:
                C9u2.A00((C9u2) this.A01);
                return;
            case 1:
                ContactsTabCustomStatusLoader contactsTabCustomStatusLoader = (ContactsTabCustomStatusLoader) this.A01;
                AC8.A02(((2Tj) 1Lm.A05(contactsTabCustomStatusLoader.A00, contactsTabCustomStatusLoader.A01, 33122)).A03(), contactsTabCustomStatusLoader, 14);
                return;
            case 2:
                MessengerInternalPresenceDebugActivity messengerInternalPresenceDebugActivity = (MessengerInternalPresenceDebugActivity) this.A01;
                2TS r0 = messengerInternalPresenceDebugActivity.A01;
                if (r0 == null || (immutableList = r0.A09) == null) {
                    return;
                }
                MessengerInternalPresenceDebugActivity.A15(messengerInternalPresenceDebugActivity, immutableList);
                return;
            case 3:
                8GX r02 = (8GX) this.A01;
                FbUserSession fbUserSession = r02.A00;
                if (fbUserSession == null) {
                    7zL.A1C();
                    throw 0Q8.createAndThrow();
                }
                8GX.A03(fbUserSession, r02);
                return;
            case 4:
                try {
                    StatusProfileSubheadingImplementation statusProfileSubheadingImplementation = (StatusProfileSubheadingImplementation) this.A01;
                    1FV A04 = ((2Tj) 1Br.A0B(statusProfileSubheadingImplementation.A0A)).A04(7zO.A0C(statusProfileSubheadingImplementation.A04));
                    1Kd.A0E(new ABp(statusProfileSubheadingImplementation.A0F, statusProfileSubheadingImplementation.A0E, 24), A04);
                    7zO.A1X(statusProfileSubheadingImplementation.A02);
                    statusProfileSubheadingImplementation.A02 = A04;
                    return;
                } catch (NullPointerException e) {
                    0fH.A0s("StatusProfileSubheadingImplementation", "statusFetcher.fetchStatusForOwner() userId is null", e);
                    return;
                }
            default:
                StatusThreadSubtitleData statusThreadSubtitleData = (StatusThreadSubtitleData) this.A01;
                if (statusThreadSubtitleData.A06.get()) {
                    ((ExecutorService) 1Br.A0B(statusThreadSubtitleData.A02)).submit((Runnable) new JTv(statusThreadSubtitleData));
                    return;
                }
                return;
        }
    }
}
