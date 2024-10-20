package X;

import android.content.Intent;
import com.facebook.messaging.livelocation.bindings.LiveLocationForegroundService;
import java.util.Set;

/* loaded from: Hos.class */
public abstract class Hos {
    public boolean A00;
    public boolean A01;
    public final Set A02 = AnonymousClass001.A0v();
    public final boolean A03;

    public Hos(boolean z) {
        this.A03 = z;
    }

    public void A00() {
        if (this instanceof C2721Gm9) {
            C2721Gm9 c2721Gm9 = (C2721Gm9) this;
            0fH.A0j("MessengerLocationFacade", "stopBackgroundLocationUpdates");
            C00i c00i = c2721Gm9.A00;
            Intent A0D = C3o5.A0D(1BK.A04(c00i), LiveLocationForegroundService.class);
            A0D.putExtra("ACTION_EXTRA_KEY", "ACTION_STOP_SHARING");
            A0D.putExtra("SOURCE_EXTRA_KEY", "thread");
            ((C2t) c2721Gm9.A02.get()).A00(1BK.A04(c00i), A0D);
        }
    }
}
