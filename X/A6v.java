package X;

import com.facebook.stickers.model.Sticker;
import com.facebook.xapp.messaging.contentsearch.messengerexternalmedia.model.MessengerExternalMediaResource;

/* loaded from: A6v.class */
public final class A6v implements AXE {
    public final Sticker A00;
    public final MessengerExternalMediaResource A01;

    public A6v(Sticker sticker, MessengerExternalMediaResource messengerExternalMediaResource) {
        C1pq.A08("resource", messengerExternalMediaResource);
        this.A01 = messengerExternalMediaResource;
        C1pq.A08("sticker", sticker);
        this.A00 = sticker;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof A6v)) {
                return false;
            }
            A6v a6v = (A6v) obj;
            if (!11T.A0O(this.A01, a6v.A01) || !11T.A0O(this.A00, a6v.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A00, C1pq.A03(this.A01));
    }
}
