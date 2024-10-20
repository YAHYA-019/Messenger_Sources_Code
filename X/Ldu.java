package X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: Ldu.class */
public final class Ldu implements C51o {
    public boolean A00 = false;
    public final QV5 A01;
    public final /* synthetic */ C51j A02;

    public Ldu(QV5 qv5, C51j c51j) {
        this.A02 = c51j;
        this.A01 = qv5;
    }

    @Override // X.C51o
    public void Bpv(C4Ez c4Ez) {
        QV5 qv5;
        C3O1 c3o1;
        C51j c51j = this.A02;
        synchronized (c51j) {
            if (this.A00) {
                return;
            }
            this.A00 = true;
            if (!c4Ez.A0E()) {
                int A0C = JQy.A0C(c4Ez);
                RQN rqn = c51j.A0B;
                qv5 = this.A01;
                rqn.A00(qv5, 2, A0C);
                c3o1 = new C3O1(c4Ez.A04(), A0C == 0 ? null : Integer.valueOf(A0C), 2);
            } else {
                if (c4Ez.A05() == null) {
                    ArrayList A0s = AnonymousClass001.A0s();
                    HashSet A0v = AnonymousClass001.A0v();
                    QV5 qv52 = this.A01;
                    Iterator it = qv52.A00.iterator();
                    while (it.hasNext()) {
                        Set set = ((C3Lx) it.next()).A02.A02;
                        Iterator it2 = set.iterator();
                        while (it2.hasNext()) {
                            A0s.add(Boolean.valueOf(00Y.A00().A0A(AnonymousClass001.A0i(it2))));
                        }
                        A0v.addAll(set);
                    }
                    0fH.A12("GooglePlayDownloaderV2", "Play Core returned an successful task but null result found. modules:%s usecase:%s modulelocalstate:%s", c4Ez.A04() != null ? c4Ez.A04() : AnonymousClass001.A0T("No download exception found"), new Object[]{A0v.toString(), qv52.A02.A01.toString(), A0s.toString()});
                    c51j.A0B.A00(qv52, 2, JQy.A0C(c4Ez));
                    C51j.A03(qv52, AnonymousClass001.A0T("Play Core returned an successful task but null result found."));
                    return;
                }
                RQN rqn2 = c51j.A0B;
                qv5 = this.A01;
                int A03 = AnonymousClass001.A03(c4Ez.A05());
                2uE r0 = rqn2.A00;
                Iterator it3 = qv5.A00.iterator();
                while (it3.hasNext()) {
                    r0.A07(((C3Lx) it3.next()).A02.A00, A03);
                }
                if (!c4Ez.A05().equals(0)) {
                    synchronized (c51j) {
                        c51j.A0F.put((Integer) c4Ez.A05(), qv5);
                        c51j.A02 = true;
                    }
                    return;
                }
                rqn2.A00(qv5, 1, 0);
                c3o1 = new C3O1(null, null, 1);
            }
            C51j.A02(qv5, c3o1);
        }
    }
}
