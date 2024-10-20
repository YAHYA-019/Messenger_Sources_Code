package X;

import com.facebook.messaging.model.messages.Message;
import java.util.Set;

/* loaded from: Chx.class */
public final class Chx implements DGd {
    public final /* synthetic */ 1Br A00;
    public final /* synthetic */ Message A01;

    public Chx(1Br r302, Message message) {
        this.A01 = message;
        this.A00 = r302;
    }

    @Override // X.DGd
    public void Bjn(C7yr c7yr, Integer num) {
        1Br r0 = this.A00;
        Set set = C63l.A0B;
        6Pl r02 = (6Pl) 1Br.A0B(r0);
        String str = this.A01.A1V;
        6Pl.A01(r02, str != null ? AbG.A10(1BK.A0c(), "message_id", str) : null, "sms_short_code_attribution_click");
    }

    @Override // X.DGd
    public void Bjo(C7yr c7yr, Integer num) {
        1Br r0 = this.A00;
        Set set = C63l.A0B;
        6Pl r02 = (6Pl) 1Br.A0B(r0);
        String str = this.A01.A1V;
        6Pl.A01(r02, str != null ? AbG.A10(1BK.A0c(), "message_id", str) : null, "sms_short_code_attribution_view");
    }
}
