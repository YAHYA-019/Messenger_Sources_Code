package X;

import android.os.Bundle;
import com.facebook.acra.constants.ActionId;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.Iterator;
import java.util.Set;

/* loaded from: Ksr.class */
public final class Ksr {
    public final Set A01 = AnonymousClass001.A0v();
    public final Set A00 = AnonymousClass001.A0v();

    public void A00(Bundle bundle) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            L2q A00 = ((LV0) it.next()).A00.A00(AbstractC00603o4.A00(ActionId.PREV_ACTIVITY_PAUSE));
            if (A00.A00.A0D()) {
                A00.A02("client_ccu_enabled", bundle.getString("client_ccu_enabled"));
                A00.A02(Property.SYMBOL_Z_ORDER_SOURCE, bundle.getString(Property.SYMBOL_Z_ORDER_SOURCE));
                L2q.A00(bundle, A00, "failure_message");
            }
        }
    }

    public void A01(Bundle bundle) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            L2q A00 = ((LV0) it.next()).A00.A00(AbstractC00603o4.A00(ActionId.MESSENGER_THREAD_LIST_DISPLAYED));
            if (A00.A00.A0D()) {
                A00.A02("client_ccu_enabled", bundle.getString("client_ccu_enabled"));
                A00.A02("server_ccu_enabled", bundle.getString("server_ccu_enabled"));
                L2q.A00(bundle, A00, Property.SYMBOL_Z_ORDER_SOURCE);
            }
        }
    }

    public void A02(Bundle bundle) {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            ((ML4) it.next()).CSo(bundle);
        }
    }
}
