package X;

import com.facebook.messaging.internalprefs.presence.MessengerInternalPresenceDebugActivity;

/* loaded from: D5m.class */
public final class D5m implements Runnable {
    public static final String __redex_internal_original_name = "MessengerInternalPresenceDebugActivity$tabSelectedListener$1$1";
    public final /* synthetic */ MessengerInternalPresenceDebugActivity A00;

    public D5m(MessengerInternalPresenceDebugActivity messengerInternalPresenceDebugActivity) {
        this.A00 = messengerInternalPresenceDebugActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MessengerInternalPresenceDebugActivity messengerInternalPresenceDebugActivity = this.A00;
        4YV.A11(messengerInternalPresenceDebugActivity.A06).execute(new D7k(messengerInternalPresenceDebugActivity, messengerInternalPresenceDebugActivity.A04));
    }
}
