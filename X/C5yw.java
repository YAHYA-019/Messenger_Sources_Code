package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

/* renamed from: X.5yw, reason: invalid class name */
/* loaded from: 5yw.class */
public final class C5yw extends C1rs {
    public 1Iw A00;
    public C5yv A01;
    public final BitSet A02;
    public final String[] A03;

    public C5yw(1Iw r302, C5yv c5yv) {
        super(c5yv, r302, 0, 0);
        this.A03 = new String[]{"colorScheme"};
        BitSet bitSet = new BitSet(1);
        this.A02 = bitSet;
        this.A01 = c5yv;
        this.A00 = r302;
        bitSet.clear();
    }

    @Override // X.C1rs
    /* renamed from: A2W, reason: merged with bridge method [inline-methods] */
    public C5yv A2V() {
        C1rs.A05(this.A02, this.A03, 1);
        C5yv c5yv = this.A01;
        C2ko c2ko = c5yv.A03;
        if (c2ko == null) {
            c2ko = 1LI.A0D(c5yv, this.A00, -1786156681);
        }
        c5yv.A03 = c2ko;
        A0J();
        return c5yv;
    }

    public final void A2X() {
        A2c(2MG.A03);
    }

    public final void A2Y() {
        A2c(2MG.A02);
    }

    public void A2Z(int i) {
        this.A01.A01 = i;
    }

    public void A2a(int i) {
        this.A01.A0B = super.A02.A0D(i);
    }

    public void A2b(MigColorScheme migColorScheme) {
        this.A01.A05 = migColorScheme;
        this.A02.set(0);
    }

    public void A2c(2MG r302) {
        this.A01.A07 = r302;
    }

    public void A2d(C5xv c5xv) {
        this.A01.A09 = c5xv;
    }

    public void A2e(C5yu c5yu) {
        if (c5yu != null) {
            C5yv c5yv = this.A01;
            List list = c5yv.A0C;
            if (list == Collections.EMPTY_LIST) {
                list = new ArrayList();
                c5yv.A0C = list;
            }
            list.add(c5yu);
        }
    }

    public void A2f(CharSequence charSequence) {
        this.A01.A0B = charSequence;
    }

    public void A2g(List list) {
        if (list != null) {
            C5yv c5yv = this.A01;
            if (c5yv.A0C.isEmpty()) {
                c5yv.A0C = list;
            } else {
                c5yv.A0C.addAll(list);
            }
        }
    }

    public void A2h(boolean z) {
        this.A01.A0D = z;
    }

    public void A2i(boolean z) {
        this.A01.A0F = z;
    }

    public void A2j(boolean z) {
        this.A01.A0H = z;
    }
}
