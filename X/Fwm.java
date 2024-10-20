package X;

import android.util.SparseArray;
import com.facebook.acra.constants.ActionId;
import java.util.List;

/* loaded from: Fwm.class */
public final class Fwm implements GH4 {
    public final /* synthetic */ DLQ A00;

    public Fwm(DLQ dlq) {
        this.A00 = dlq;
    }

    @Override // X.GH4
    public /* bridge */ /* synthetic */ Object get() {
        SparseArray sparseArray;
        Object obj = this.A00.A06.get(ActionId.MQTT_CONNECTING);
        if (obj instanceof List) {
            List list = (List) obj;
            sparseArray = new SparseArray(list.size() / 2);
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= list.size()) {
                    break;
                }
                sparseArray.put(DKE.A0G(list, i2), list.get(i2 + 1));
                i = i2 + 2;
            }
        } else {
            sparseArray = DKC.A0E();
        }
        return sparseArray;
    }
}
