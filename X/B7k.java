package X;

import com.facebook.auth.usersession.FbUserSession;
import com.google.common.collect.ImmutableList;

/* loaded from: B7k.class */
public final class B7k extends GS2 {
    public final 1De A00;
    public final 1Br A01;
    public final 1Br A02;
    public final JLm A03;
    public final 2QY A04;

    public B7k(1De r302) {
        super("ViewJoinRequestsDrawerPresenter");
        this.A00 = r302;
        1BY r0 = r302.A00;
        this.A02 = 1Bu.A03(r0, 67527);
        this.A01 = 1Bu.A03(r0, 16980);
        this.A03 = new GpZ(this, 10);
        this.A04 = new BHi(this, 1);
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, X.Bgp] */
    public static final Bgp A00(B7k b7k) {
        if (!b7k.A0V().isPresent()) {
            return new Bgp();
        }
        CpJ cpJ = (CpJ) b7k.A0V().get();
        ?? obj = new Object();
        cpJ.getClass();
        obj.A00 = cpJ.A00;
        return obj;
    }

    public static final ImmutableList A01(FbUserSession fbUserSession, B7k b7k) {
        ImmutableList Aas = ((2QU) 4YU.A0n(fbUserSession, b7k.A00, 99981)).Aas(2QW.A0C);
        ImmutableList.Builder builderWithExpectedSize = ImmutableList.builderWithExpectedSize(Aas.size());
        1Du it = Aas.iterator();
        while (it.hasNext()) {
            I9O i9o = (I9O) it.next();
            String str = i9o.A03.A03;
            11T.A0A(str);
            String str2 = i9o.A08;
            if (1JF.A0B(str2)) {
                str2 = i9o.A09;
            }
            builderWithExpectedSize.m11011add((Object) new C84j(str, str2, 3));
        }
        return 1Fj.A01(builderWithExpectedSize);
    }

    public void A0b() {
        1BY r0 = this.A00.A00;
        FbUserSession A0D = AbK.A0D(r0);
        ((2QT) 1Lm.A07(A0D, r0, 99981)).CeZ(this.A04);
        ((JOS) 1Lm.A07(A0D, r0, 99475)).CeV(this.A03);
    }

    public /* bridge */ /* synthetic */ void A0c(JFq jFq) {
        1BY r0 = this.A00.A00;
        FbUserSession A0D = AbK.A0D(r0);
        2QT r02 = (2QT) 1Lm.A07(A0D, r0, 99981);
        2QY r03 = this.A04;
        r02.A67(r03);
        ((JOS) 1Lm.A07(A0D, r0, 99475)).A60(this.A03);
        r03.CAr();
        r03.CAo();
    }
}
