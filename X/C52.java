package X;

import com.facebook.auth.usersession.FbUserSession;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;

/* loaded from: C52.class */
public final class C52 {
    public final 1Br A00;
    public final 1Br A01;
    public final 1De A02;
    public final Function A03;
    public final Predicate A04;

    public C52(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A02 = r303;
        1BY r0 = r303.A00;
        this.A00 = 1Lm.A03(fbUserSession, r0, 68485);
        this.A01 = 1Bu.A03(r0, 66956);
        this.A04 = new D3Y(this, 3);
        this.A03 = D3B.A00;
    }

    public void A00(ImmutableList immutableList) {
        11T.A0F(immutableList, 0);
        1Du it = immutableList.iterator();
        Predicate predicate = this.A04;
        it.getClass();
        predicate.getClass();
        1Du it2 = ImmutableList.copyOf((Iterator) new 3CS(predicate, it)).iterator();
        Function function = this.A03;
        function.getClass();
        ImmutableList copyOf = ImmutableList.copyOf((Iterator) new 3Cn(function, it2, 0));
        11T.A0D(copyOf);
        if (1BK.A1Y(copyOf)) {
            ((5Q2) 1Br.A0B(this.A00)).A09(copyOf);
        }
    }
}
