package androidx.core.app;

import X.4vI;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: NotificationCompat$InboxStyle.class */
public final class NotificationCompat$InboxStyle extends 4vI {
    public ArrayList A00 = new ArrayList();

    public void A04(Bundle bundle) {
        super.A04(bundle);
        bundle.remove("android.textLines");
    }

    public void A05(Bundle bundle) {
        super.A05(bundle);
        ArrayList arrayList = this.A00;
        arrayList.clear();
        if (bundle.containsKey("android.textLines")) {
            Collections.addAll(arrayList, bundle.getCharSequenceArray("android.textLines"));
        }
    }
}
