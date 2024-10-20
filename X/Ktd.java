package X;

import com.facebook.acra.constants.ActionId;
import java.util.UUID;

/* loaded from: Ktd.class */
public final class Ktd {
    public final KpQ A00;
    public final MFl A01;
    public final MFl A02;
    public final HCo A03;
    public final UUID A04;
    public final UUID A05;

    public Ktd(KpQ kpQ, MFl mFl, MFl mFl2, HCo hCo, UUID uuid, UUID uuid2) {
        this.A05 = uuid;
        this.A04 = uuid2;
        this.A02 = mFl;
        this.A01 = mFl2;
        this.A03 = hCo;
        this.A00 = kpQ;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Ktd)) {
                return false;
            }
            Ktd ktd = (Ktd) obj;
            if (!11T.A0O(this.A05, ktd.A05) || !11T.A0O(this.A04, ktd.A04) || !11T.A0O(this.A02, ktd.A02) || !11T.A0O(this.A01, ktd.A01) || this.A03 != ktd.A03 || !11T.A0O(this.A00, ktd.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A05(this.A03, AnonymousClass002.A05(this.A01, AnonymousClass002.A05(this.A02, AnonymousClass002.A05(this.A04, 1BL.A03(this.A05))))) + AnonymousClass001.A02(this.A00);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("SetLinkResult(txId=");
        A0k.append(this.A05);
        A0k.append(", rxId=");
        A0k.append(this.A04);
        A0k.append(GOm.A00(ActionId.DATA_LOAD_START));
        A0k.append(this.A02);
        A0k.append(GOm.A00(ActionId.ON_VIEW_CREATED_END));
        A0k.append(this.A01);
        A0k.append(", targetState=");
        A0k.append(this.A03);
        A0k.append(", rollover=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
