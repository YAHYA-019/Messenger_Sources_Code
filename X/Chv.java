package X;

import com.facebook.messaging.model.messages.Message;
import java.util.Set;

/* loaded from: Chv.class */
public final class Chv implements DGd {
    public final /* synthetic */ C63l A00;

    public Chv(C63l c63l) {
        this.A00 = c63l;
    }

    @Override // X.DGd
    public void Bjn(C7yr c7yr, Integer num) {
        C63l c63l = this.A00;
        Set set = C63l.A0B;
        C63o c63o = c63l.A08;
        Message Awk = c7yr.Awk();
        if (num == null) {
            throw 1BK.A0h();
        }
        C63o.A00(c63o, Awk, num, "tap_on_attribution_link");
    }

    @Override // X.DGd
    public void Bjo(C7yr c7yr, Integer num) {
        C63l c63l = this.A00;
        Set set = C63l.A0B;
        C63o c63o = c63l.A08;
        Message Awk = c7yr.Awk();
        if (num == null) {
            throw 1BK.A0h();
        }
        C63o.A00(c63o, Awk, num, AbstractC00603o4.A00(318));
    }
}
