package X;

import android.net.Uri;
import com.facebook.messaging.business.common.calltoaction.model.CallToAction;
import com.facebook.messaging.model.attribution.AttributionVisibility;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: Chu.class */
public final class Chu implements C7yr {
    public static final AttributionVisibility A04 = new AttributionVisibility(true, false, false, false, false);
    public final long A00;
    public final String A01;
    public final EMP A02;
    public final Message A03;

    public Chu(Message message, String str, String str2, long j) {
        this.A03 = message;
        this.A00 = j;
        this.A01 = str;
        for (EMP emp : EMP.A00) {
            if (11T.A0O(emp.type, str2)) {
                this.A02 = emp;
                return;
            }
        }
        throw AnonymousClass001.A0L("Unkown P2P payment attribution type");
    }

    @Override // X.C7yr
    public CallToAction AXe() {
        return null;
    }

    @Override // X.C7yr
    public AttributionVisibility AXf() {
        return A04;
    }

    @Override // X.C7yr
    public Integer Aau() {
        int ordinal = this.A02.ordinal();
        if (ordinal == 0) {
            return 0S2.A15;
        }
        if (ordinal == 1) {
            return 0S2.A1G;
        }
        throw AnonymousClass001.A0L("Unknown P2P attribution type");
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
        String valueOf = String.valueOf(threadKey != null ? Long.valueOf(threadKey.A05) : null);
        11T.A0A(valueOf);
        return valueOf;
    }

    @Override // X.C7yr
    public String getName() {
        return "";
    }
}
