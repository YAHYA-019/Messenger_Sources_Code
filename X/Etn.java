package X;

import android.view.View;
import java.util.BitSet;

/* loaded from: Etn.class */
public final class Etn {
    public final 3Eh A00;
    public final R4X A01;
    public final String A02;

    public Etn(3Eh r302, R4X r4x, String str) {
        this.A02 = str;
        this.A00 = r302;
        this.A01 = r4x;
    }

    public QKo A00(View.OnClickListener onClickListener, 1Iw r303) {
        QB9 qb9 = new QB9(new QKo(), r303);
        String str = this.A02;
        QKo qKo = qb9.A00;
        qKo.A03 = str;
        BitSet bitSet = qb9.A02;
        bitSet.set(4);
        qKo.A01 = this.A00;
        bitSet.set(1);
        qKo.A02 = qb9.A02.A0D(2131953489);
        bitSet.set(0);
        qKo.A00 = onClickListener;
        bitSet.set(2);
        bitSet.set(3);
        C1rs.A04(bitSet, qb9.A03);
        qb9.A0J();
        return qKo;
    }
}
