package X;

import android.net.Uri;
import com.facebook.messaging.business.common.calltoaction.model.CallToAction;
import com.facebook.messaging.model.attribution.AttributionVisibility;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: Chs.class */
public final class Chs implements C7yr {
    public String A00;
    public final Message A03;
    public final AttributionVisibility A02 = new AttributionVisibility(true, true, false, true, true);
    public final 1Br A01 = 1Bq.A00(49862);

    public Chs(Message message) {
        this.A03 = message;
    }

    public final String A00() {
        String str = this.A00;
        if (str == null) {
            C00i c00i = this.A01.A00;
            5sU r0 = (5sU) c00i.get();
            Message message = this.A03;
            str = r0.A00(message);
            if (str == null) {
                str = "";
            }
            this.A00 = str;
            if (str == null) {
                str = ((5sU) c00i.get()).A00(message);
                if (str == null) {
                    str = "";
                }
            }
        }
        return str;
    }

    @Override // X.C7yr
    public CallToAction AXe() {
        return null;
    }

    @Override // X.C7yr
    public AttributionVisibility AXf() {
        return this.A02;
    }

    @Override // X.C7yr
    public Integer Aau() {
        return 0S2.A02;
    }

    @Override // X.C7yr
    public Uri Apj() {
        return null;
    }

    @Override // X.C7yr
    public Message Awk() {
        return this.A03;
    }

    @Override // X.C7yr
    public void Cns(C7k1 c7k1) {
    }

    @Override // X.C7yr
    public String getIdentifier() {
        ThreadKey threadKey = this.A03.A0V;
        if (threadKey != null) {
            return AbF.A16(threadKey);
        }
        throw 1BK.A0h();
    }

    @Override // X.C7yr
    public String getName() {
        return A00();
    }
}
