package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: Ldt.class */
public final class Ldt implements C51o {
    public boolean A00 = false;
    public final C3Lx A01;
    public final /* synthetic */ C2uw A02;

    public Ldt(C3Lx c3Lx, C2uw c2uw) {
        this.A02 = c2uw;
        this.A01 = c3Lx;
    }

    @Override // X.C51o
    public void Bpv(C4Ez c4Ez) {
        2vH r308;
        C3O1 c3o1;
        C2uw c2uw = this.A02;
        synchronized (c2uw) {
            if (this.A00) {
                return;
            }
            this.A00 = true;
            if (!c4Ez.A0E()) {
                int A0C = JQy.A0C(c4Ez);
                2uE r0 = c2uw.A0D;
                if (r0 != null) {
                    r0.A0F(this.A01.A02, 2, A0C);
                }
                r308 = this.A01.A01;
                c3o1 = new C3O1(c4Ez.A04(), A0C == 0 ? null : Integer.valueOf(A0C), 2);
            } else {
                if (c4Ez.A05() == null) {
                    ArrayList A0s = AnonymousClass001.A0s();
                    C3Lx c3Lx = this.A01;
                    3QA r02 = c3Lx.A02;
                    Set set = r02.A02;
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        A0s.add(Boolean.valueOf(00Y.A00().A0A(AnonymousClass001.A0i(it))));
                    }
                    0fH.A12(1BJ.A00(270), "Play Core returned an successful task but null result found. modules:%s usecase:%s modulelocalstate:%s", c4Ez.A04() != null ? c4Ez.A04() : AnonymousClass001.A0T("No download exception found"), new Object[]{set.toString(), r02.A01.toString(), A0s.toString()});
                    int A0C2 = JQy.A0C(c4Ez);
                    2uE r03 = c2uw.A0D;
                    if (r03 != null) {
                        r03.A0F(r02, 2, A0C2);
                    }
                    c3Lx.A01.A00(AnonymousClass001.A0T("Play Core returned an successful task but null result found."));
                    return;
                }
                2uE r04 = c2uw.A0D;
                if (r04 != null) {
                    r04.A07(this.A01.A02.A00, AnonymousClass001.A03(c4Ez.A05()));
                }
                if (!c4Ez.A05().equals(0)) {
                    synchronized (c2uw) {
                        c2uw.A0I.put((Integer) c4Ez.A05(), this.A01);
                        c2uw.A04 = true;
                    }
                    return;
                } else {
                    if (r04 != null) {
                        r04.A0F(this.A01.A02, 1, 0);
                    }
                    r308 = this.A01.A01;
                    c3o1 = new C3O1(null, null, 1);
                }
            }
            r308.A01(c3o1);
        }
    }
}
