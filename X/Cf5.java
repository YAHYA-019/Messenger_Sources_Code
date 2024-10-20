package X;

import com.facebook.messaging.contacts.ranking.logging.RankingLoggingItem;

/* loaded from: Cf5.class */
public abstract class Cf5 implements DJm {
    public Bji A00;
    public RankingLoggingItem A01;
    public boolean A02;
    public boolean A03;

    public void A01(boolean z) {
        if (this instanceof AoR) {
            ((AoR) this).A01 = z;
            return;
        }
        if (this instanceof AoS) {
            ((AoS) this).A02 = z;
            return;
        }
        if (this instanceof AoQ) {
            ((AoQ) this).A00 = z;
            return;
        }
        if (this instanceof AoT) {
            ((AoT) this).A00 = z;
            return;
        }
        if (this instanceof AoP) {
            ((AoP) this).A01 = z;
        } else if (this instanceof AoU) {
            ((AoU) this).A01 = z;
        } else {
            ((AoO) this).A01 = z;
        }
    }

    public boolean A02() {
        return this instanceof AoR ? ((AoR) this).A01 : this instanceof AoS ? ((AoS) this).A02 : this instanceof AoQ ? ((AoQ) this).A00 : this instanceof AoT ? ((AoT) this).A00 : this instanceof AoP ? ((AoP) this).A01 : this instanceof AoU ? ((AoU) this).A01 : ((AoO) this).A01;
    }

    public abstract boolean equals(Object obj);

    public abstract int hashCode();
}
