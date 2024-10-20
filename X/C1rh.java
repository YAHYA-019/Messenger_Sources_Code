package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1rh, reason: invalid class name */
/* loaded from: 1rh.class */
public final class C1rh extends C1rj {
    public C1ro A00;
    public C1ro A01;
    public C1rp A02;
    public EnumC00743oh A03;
    public List A04;
    public boolean A05;

    public C1rh(C1ro c1ro, C1ro c1ro2, C1rp c1rp, EnumC00743oh enumC00743oh, List list, boolean z) {
        super("Row");
        this.A00 = c1ro;
        this.A01 = c1ro2;
        this.A02 = c1rp;
        this.A03 = enumC00743oh;
        this.A05 = z;
        this.A04 = list;
    }

    @Override // X.C1rj
    public C1tp A0Y(1tH r302, 1tT r303, 1JB r304, int i, int i2) {
        11T.A0F(r302, 0);
        11T.A0F(r303, 1);
        1Iw r0 = r303.A04;
        C1sr c1sr = new C1sr();
        c1sr.A0V = this.A05 ? 1tZ.A04 : 1tZ.A03;
        C1ro c1ro = this.A01;
        if (c1ro != null) {
            c1sr.A0U = c1ro;
        }
        C1ro c1ro2 = this.A00;
        if (c1ro2 != null) {
            c1sr.A0T = c1ro2;
        }
        C1rp c1rp = this.A02;
        if (c1rp != null) {
            c1sr.A0W = c1rp;
        }
        EnumC00743oh enumC00743oh = this.A03;
        if (enumC00743oh != null) {
            c1sr.A0X = enumC00743oh;
        }
        List list = this.A04;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                1LI r02 = (1LI) it.next();
                if (r302.BT2()) {
                    c1sr = null;
                    break;
                }
                if (r302.A00()) {
                    11T.A0F(r02, 0);
                    List list2 = c1sr.A0d;
                    if (list2 == null) {
                        list2 = new ArrayList();
                        c1sr.A0d = list2;
                    }
                    list2.add(r02);
                } else {
                    c1sr.A0D(r02, r0, r302);
                }
            }
        }
        return new C1tp(super.A00, c1sr);
    }
}
