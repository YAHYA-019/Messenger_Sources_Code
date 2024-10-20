package X;

import android.view.View;
import java.util.BitSet;
import java.util.Locale;

/* loaded from: Eur.class */
public final class Eur {
    public final View.OnClickListener A00;
    public final 3Eh A01;
    public final ERE A02;
    public final CharSequence A03;
    public final String A04;

    public Eur(View.OnClickListener onClickListener, 3Eh r303, ERE ere, CharSequence charSequence, String str) {
        this.A04 = str;
        this.A03 = charSequence;
        this.A00 = onClickListener;
        this.A01 = r303;
        this.A02 = ere;
    }

    public QKd A00(1Iw r302, Runnable runnable) {
        QB7 qb7 = new QB7(new QKd(), r302);
        String str = this.A04;
        qb7.A2K(str.toLowerCase(Locale.US).replace(" ", "_"));
        QKd qKd = qb7.A00;
        qKd.A06 = str;
        BitSet bitSet = qb7.A02;
        bitSet.set(1);
        qKd.A07 = true;
        qKd.A01 = this.A00;
        bitSet.set(0);
        qKd.A05 = runnable;
        qKd.A02 = this.A01;
        qKd.A04 = this.A02;
        qKd.A00 = 2;
        qKd.A03 = ERC.A06;
        qb7.A2S(this.A03);
        7zL.A1J(qb7);
        C1rs.A00(bitSet, qb7.A03);
        qb7.A0J();
        return qKd;
    }
}
