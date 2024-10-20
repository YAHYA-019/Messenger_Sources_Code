package X;

import android.net.Uri;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2sS, reason: invalid class name */
/* loaded from: 2sS.class */
public final class C2sS extends C1rs {
    public 1Iw A00;
    public C2rr A01;
    public final BitSet A02;
    public final String[] A03;

    public C2sS(1Iw r302, C2rr c2rr) {
        super(c2rr, r302, 0, 0);
        this.A03 = new String[]{"colorScheme", "profileConfig"};
        BitSet bitSet = new BitSet(2);
        this.A02 = bitSet;
        this.A01 = c2rr;
        this.A00 = r302;
        bitSet.clear();
    }

    public C2rr A2W() {
        C1rs.A05(this.A02, this.A03, 2);
        A0J();
        return this.A01;
    }

    public void A2X(Uri uri) {
        if (uri != null) {
            C2rr c2rr = this.A01;
            List list = c2rr.A09;
            if (list == Collections.EMPTY_LIST) {
                list = new ArrayList();
                c2rr.A09 = list;
            }
            list.add(uri);
        }
    }

    public void A2Y(C2q1 c2q1) {
        this.A01.A01 = c2q1;
        this.A02.set(1);
    }

    public void A2Z(MigColorScheme migColorScheme) {
        this.A01.A06 = migColorScheme;
        this.A02.set(0);
    }
}
