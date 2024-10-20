package X;

import android.os.Bundle;
import com.facebook.messaging.location.model.NearbyPlace;
import java.util.Calendar;

/* loaded from: C46.class */
public final class C46 {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ DIc A01;
    public final /* synthetic */ B7C A02;

    public C46(Bundle bundle, DIc dIc, B7C b7c) {
        this.A02 = b7c;
        this.A00 = bundle;
        this.A01 = dIc;
    }

    public void A00() {
        B7C b7c = this.A02;
        Bundle bundle = this.A00;
        b7c.A05 = bundle != null ? bundle.getString("customized_message_key") : this.A01.Ah0();
        DIc dIc = this.A01;
        b7c.A06 = dIc.B6l();
        b7c.A07 = dIc.B6m();
        b7c.A01 = dIc.B6k();
        b7c.A02 = bundle != null ? (NearbyPlace) bundle.getParcelable("customized_location_key") : null;
        b7c.A00 = bundle != null ? bundle.getLong("customized_time_key") : 0L;
        Calendar calendar = Calendar.getInstance();
        b7c.A08 = calendar;
        calendar.add(10, 1);
    }
}
