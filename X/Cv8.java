package X;

import com.facebook.messaging.model.attribution.ContentAppAttribution;
import com.facebook.messaging.model.messages.Message;

/* loaded from: Cv8.class */
public final class Cv8 implements C62p {
    public final 1Br A00 = 1Bq.A00(49946);
    public final 1Br A01;
    public final 1De A02;
    public final boolean A03;

    public Cv8(1De r302, boolean z) {
        this.A02 = r302;
        this.A01 = 7zM.A0h(r302, 49935);
        this.A03 = z;
    }

    @Override // X.C62p
    public boolean BS0(C62b c62b) {
        11T.A0F(c62b, 0);
        switch (c62b.ordinal()) {
            case 0:
            case 1:
            case 4:
            case 5:
            case 10:
            case 12:
            case 15:
            case 20:
                return true;
            case 11:
                return this.A03;
            default:
                return false;
        }
    }

    @Override // X.C62p
    public boolean BS1(5zD r302, AnonymousClass622 anonymousClass622, C63j c63j) {
        63V A00 = ((C60h) 1Br.A0B(this.A01)).A00(anonymousClass622);
        11T.A0A(A00);
        Message message = anonymousClass622.A03;
        11T.A09(message);
        if (C1q7.A0V(message)) {
            return false;
        }
        if (5Q0.A06(message)) {
            return true;
        }
        C63r c63r = (C63r) 1Br.A0B(this.A00);
        ContentAppAttribution contentAppAttribution = message.A09;
        if (1BL.A1a(c63r.A00) && contentAppAttribution != null && !contentAppAttribution.A01.A01 && A00.ordinal() != 16) {
            return false;
        }
        switch (A00.ordinal()) {
            case 0:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
                return true;
            default:
                return false;
        }
    }
}
