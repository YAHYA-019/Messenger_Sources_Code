package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.facebook.messaging.communitymessaging.events.extension.eventrsvp.viewdata.uimodel.EventRsvpState;

/* loaded from: C6z.class */
public final class C6z {
    public final 1Br A01 = 7zM.A0Z();
    public final MutableLiveData A00 = new LiveData(new EventRsvpState(C96f.A07, null, ""));

    public final EventRsvpState A00() {
        Object value = this.A00.getValue();
        if (value != null) {
            return (EventRsvpState) value;
        }
        throw 1BK.A0h();
    }

    public final void A01(EventRsvpState eventRsvpState) {
        11T.A0F(eventRsvpState, 0);
        7zP.A0O(this.A01).A00(this.A00, eventRsvpState);
    }
}
