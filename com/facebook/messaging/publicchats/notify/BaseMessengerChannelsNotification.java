package com.facebook.messaging.publicchats.notify;

import X.1BK;
import X.AnonymousClass001;
import android.os.Parcelable;
import com.facebook.messaging.notify.type.MessagingNotification;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: BaseMessengerChannelsNotification.class */
public abstract class BaseMessengerChannelsNotification extends MessagingNotification implements Parcelable {
    public Map A00;

    @Override // com.facebook.messaging.notify.type.MessagingNotification
    public HashMap A03() {
        HashMap A03 = super.A03();
        Map map = this.A00;
        if (map != null) {
            ArrayList A0t = AnonymousClass001.A0t(map.size());
            Iterator A0y = AnonymousClass001.A0y(map);
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0y);
                A0t.add(A03.put(A0z.getKey(), A0z.getValue()));
            }
        }
        return A03;
    }

    public final void A04(Map map) {
        Map map2 = this.A00;
        if (map2 == null) {
            map2 = 1BK.A1C();
            this.A00 = map2;
        }
        ArrayList A0t = AnonymousClass001.A0t(map.size());
        Iterator A0y = AnonymousClass001.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            A0t.add(map2.put(A0z.getKey(), A0z.getValue()));
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }
}
