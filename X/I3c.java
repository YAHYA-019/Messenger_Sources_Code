package X;

import com.facebook.messaging.montage.model.art.EffectItem;

/* loaded from: I3c.class */
public final class I3c {
    public final EffectItem A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;
    public final String A04;

    public I3c(Hff hff) {
        this.A03 = null;
        this.A00 = hff.A00;
        Integer num = hff.A01;
        C1pq.A08("effectTrigger", num);
        this.A01 = num;
        this.A02 = hff.A02;
        this.A04 = hff.A03;
    }

    public I3c(EffectItem effectItem, Integer num, Integer num2, String str, String str2) {
        this.A03 = str;
        this.A00 = effectItem;
        C1pq.A08("effectTrigger", num);
        this.A01 = num;
        this.A02 = num2;
        this.A04 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof I3c)) {
                return false;
            }
            I3c i3c = (I3c) obj;
            if (!11T.A0O(this.A03, i3c.A03) || !11T.A0O(this.A00, i3c.A00) || this.A01 != i3c.A01 || this.A02 != i3c.A02 || !11T.A0O(this.A04, i3c.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = -1;
        int A04 = (C1pq.A04(this.A00, C1pq.A03(this.A03)) * 31) + C3o5.A04(this.A01);
        Integer num = this.A02;
        if (num != null) {
            i = num.intValue();
        }
        return C1pq.A04(this.A04, (A04 * 31) + i);
    }
}
