package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: C4e.class */
public final class C4e {
    public BeI A00;
    public 1BY A01;
    public final Car A03 = (Car) 1Bn.A0E((Context) null, (1BY) null, 82734);
    public final C00i A02 = 1BV.A01((1BY) null, 49829);

    public C4e(1BO r302) {
        this.A01 = 7zL.A0Q(r302);
    }

    public void A00(FbUserSession fbUserSession, List list) {
        ListenableFuture A01;
        if (this.A00 != null) {
            Car car = this.A03;
            11T.A0H(fbUserSession, list);
            if (list.isEmpty()) {
                A01 = AbI.A0y();
            } else {
                C30G A0H = AbF.A0H(53);
                ImmutableList.Builder builder = ImmutableList.builder();
                ArrayList A0z = 1BL.A0z(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    A0z.add(AbG.A0v(it).id);
                }
                A0H.A07("ids", AbG.A0y(builder, A0z));
                C3sa A0C = AbL.A0C(A0H);
                4YU.A1J(A0C, 303646520704038L);
                1Vd A09 = 7zT.A09(car.A00);
                4YU.A1J(A0C, 303646520704038L);
                A01 = 2FP.A01(new D3I(2), A09.A09(A0C));
            }
            ((5iG) this.A02.get()).A04(new C1606Amn(this, 10), A01, "load_approvals");
        }
    }
}
