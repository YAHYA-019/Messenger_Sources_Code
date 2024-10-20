package X;

import com.facebook.stickers.model.Sticker;
import java.util.Set;

/* loaded from: Hpa.class */
public final class Hpa {
    public JMq A00;
    public C5es A01;
    public String A02;
    public final Set A03 = AnonymousClass001.A0v();
    public final GWC A04;

    public Hpa(GWC gwc) {
        this.A04 = gwc;
    }

    public void A00(int i) {
        HpA hpA;
        Sticker A00;
        if (this.A00 != null) {
            GWC gwc = this.A04;
            if (i < 0 || i >= gwc.getItemCount() || (hpA = (HpA) ((GWI) gwc).A00.A02.get(i)) == null || (A00 = hpA.A00()) == null) {
                return;
            }
            String str = A00.A0F;
            Set set = this.A03;
            if (set.contains(str)) {
                return;
            }
            JMq jMq = this.A00;
            C5es c5es = this.A01;
            if (c5es == null) {
                c5es = C5es.A0D;
            }
            jMq.CNO(A00, c5es, this.A02, i, false);
            set.add(str);
        }
    }
}
