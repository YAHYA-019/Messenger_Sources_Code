package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.util.TriState;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threads.ThreadCustomization;
import com.facebook.messaging.notify.type.NewMessageNotification;
import com.facebook.messaging.push.flags.ServerMessageAlertFlags;
import com.facebook.push.constants.PushProperty;
import com.facebook.secure.secrettypes.SecretString;
import com.mapbox.mapboxsdk.location.LocationComponentOptions;

/* renamed from: X.5ad, reason: invalid class name */
/* loaded from: 5ad.class */
public final class C5ad {
    public 1BY A00;
    public final FbUserSession A01;
    public final C00i A05;
    public final C00i A06;
    public final C00i A02 = new 1BV((1BY) null, 49419);
    public final C00i A04 = new 1BQ(16616);
    public final C00i A03 = new 1BQ(66536);

    public C5ad(1BO r302, FbUserSession fbUserSession) {
        this.A00 = new 1BY(r302);
        Integer num = 1Lo.A05;
        this.A06 = new 1MV(fbUserSession, (1BY) null, 49794);
        this.A05 = new 1MV(fbUserSession, (1BY) null, 49795);
        this.A01 = fbUserSession;
    }

    public static C5ao A00(C5ad c5ad, PushProperty pushProperty) {
        C5ao c5ao;
        C00i c00i = c5ad.A04;
        if (!((1Od) c00i.get()).A0F()) {
            c5ao = C5ao.NOT_IN_APP;
        } else {
            if (!((1Od) c00i.get()).A0H(10000L)) {
                return ((1Od) c00i.get()).A0H(LocationComponentOptions.STALE_STATE_DELAY_MS) ? C5ao.IN_APP_ACTIVE_30S : C5ao.IN_APP_IDLE;
            }
            c5ao = C5ao.IN_APP_ACTIVE_10S;
            TriState A0A = ((1Od) c00i.get()).A0A();
            if (((1Od) c00i.get()).A05() < 4000 && A0A != TriState.NO) {
                C00i c00i2 = c5ad.A03;
                if (21W.A00((21W) c00i2.get()).AZk(36314511129583620L)) {
                    if (4rH.A0L.equals(pushProperty.A04) && 21W.A00((21W) c00i2.get()).AZk(36314511129911301L)) {
                        return c5ao;
                    }
                    0fH.A0j("NewMessageNotificationFactory", "Overwrote PresenceLevel.IN_APP_ACTIVE_10S to PresenceLevel.UNKNOWN since isAppStartedInBackground wasn't NO");
                    return C5ao.UNKNOWN;
                }
            }
        }
        return c5ao;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x025d, code lost:
    
        if (r327.equals(r313) == false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.facebook.messaging.notify.type.NewMessageNotification A01(com.facebook.messaging.accountswitch.model.MessengerAccountType r302, com.facebook.messaging.model.messages.Message r303, com.facebook.messaging.notify.type.ProductExtras r304, com.facebook.messaging.push.flags.ServerMessageAlertFlags r305, com.facebook.push.constants.PushProperty r306, java.lang.Long r307, java.lang.String r308, boolean r309, boolean r310, boolean r311) {
        /*
            Method dump skipped, instructions count: 858
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5ad.A01(com.facebook.messaging.accountswitch.model.MessengerAccountType, com.facebook.messaging.model.messages.Message, com.facebook.messaging.notify.type.ProductExtras, com.facebook.messaging.push.flags.ServerMessageAlertFlags, com.facebook.push.constants.PushProperty, java.lang.Long, java.lang.String, boolean, boolean, boolean):com.facebook.messaging.notify.type.NewMessageNotification");
    }

    public NewMessageNotification A02(Message message, ThreadCustomization threadCustomization, ServerMessageAlertFlags serverMessageAlertFlags, PushProperty pushProperty) {
        return A03(message, threadCustomization, serverMessageAlertFlags, pushProperty, null, null, false);
    }

    public NewMessageNotification A03(Message message, ThreadCustomization threadCustomization, ServerMessageAlertFlags serverMessageAlertFlags, PushProperty pushProperty, Long l, String str, boolean z) {
        String A07 = ((C12104yr) this.A02.get()).A07(message, threadCustomization);
        5PI r0 = new 5PI(message);
        r0.A0A(new SecretString(A07));
        return A01(null, new Message(r0), null, serverMessageAlertFlags, pushProperty, l, str, false, z, false);
    }
}
