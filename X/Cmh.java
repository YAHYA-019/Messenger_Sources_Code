package X;

import com.facebook.messaging.model.messages.Message;
import java.util.List;

/* loaded from: Cmh.class */
public final class Cmh implements DFM {
    public final /* synthetic */ Message A00;
    public final /* synthetic */ Czd A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ List A03;

    public Cmh(Message message, Czd czd, String str, List list) {
        this.A00 = message;
        this.A01 = czd;
        this.A03 = list;
        this.A02 = str;
    }

    public final void Bjj() {
        Message message = this.A00;
        if (AbK.A1Z(message)) {
            return;
        }
        Czd.A00(message, this.A01, this.A02, this.A03);
    }
}
