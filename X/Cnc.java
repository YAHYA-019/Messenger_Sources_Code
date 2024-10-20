package X;

import android.content.Context;
import com.facebook.messaging.inbox.units.InboxTrackableItem;
import java.util.HashMap;

/* loaded from: Cnc.class */
public final class Cnc implements DFT {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ InboxTrackableItem A01;

    public Cnc(Context context, InboxTrackableItem inboxTrackableItem) {
        this.A00 = context;
        this.A01 = inboxTrackableItem;
    }

    public void C8J(Integer num) {
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("at", "mute");
        BU3.A00().A04(this.A01, "longpressinbox:mute", A0u);
    }
}
