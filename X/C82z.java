package X;

import android.content.Context;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.82z, reason: invalid class name */
/* loaded from: 82z.class */
public final class C82z extends C00q implements C00m {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82z(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        int i;
        C01i c01i;
        79A r0;
        switch (this.A00) {
            case 0:
                6xF r02 = (6xF) this.A01;
                Thread thread = 6xF.A0K;
                return Boolean.valueOf(((2yD) r02.A04.A00.get()).AZk(36323118243137813L));
            case 1:
                C79c c79c = (C79c) this.A01;
                Context context = c79c.A00.getContext();
                11T.A0A(context);
                7DZ r03 = new 7DZ(context, c79c.A01, c79c.A06);
                C79d c79d = c79c.A03;
                11T.A0F(c79d, 0);
                r03.A06.A0V().A06 = c79d;
                return r03;
            case 2:
                return Integer.valueOf(((C79c) this.A01).A00.getContext().getResources().getDimensionPixelSize(2132279359));
            case 3:
                79B r04 = (79B) this.A01;
                06Z r05 = r04.A06;
                if (r05 != null && (r0 = r04.A08) != null) {
                    r0.A00(r05, AQ7.A00);
                }
                return 04S.A00;
            case 4:
                C07634kW c07634kW = (C07634kW) this.A01;
                c07634kW.A01.Cei(c07634kW.A00);
                return 04S.A00;
            case 5:
            case 40:
                1Bn.A0A(66868);
                C6qu c6qu = (C6qu) this.A01;
                return new 7HA(c6qu.AWp(), (7H9) ((6rM) c6qu.A06).A01().getValue(), c6qu.Ad4());
            case 6:
                C6qu c6qu2 = (C6qu) this.A01;
                2Og Aoc = c6qu2.Aoc();
                ThreadKey BF7 = c6qu2.BF7();
                Context AWp = c6qu2.AWp();
                FbUserSession Alj = c6qu2.Alj();
                Integer num = 0S2.A01;
                return new 94K(AWp, new 9Tn(AWp, Alj, BF7, Aoc, num), c6qu2.BJ2(), c6qu2.Ad4(), num);
            case 7:
            case 8:
            case 10:
            case 12:
            case 13:
            case 17:
            case 18:
            case 24:
            case 25:
            case 27:
            case 28:
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
            case 46:
            case ActionId.ON_START_END /* 47 */:
            default:
                return this.A01;
            case 9:
                C6qu c6qu3 = (C6qu) this.A01;
                Object obj = c6qu3.A06;
                11T.A0I(obj, "null cannot be cast to non-null type com.facebook.messaging.msys.threadview.renderconfig.messenger.dependencies.MessengerRenderingConfigDependencies");
                6rM r06 = (6rM) obj;
                return new 74M(c6qu3.Alj(), c6qu3.BF7(), r06.Ad3(), r06.AbO(), 71Y.A00, new 74L(), true, ((C6rO) obj).A04);
            case 11:
            case 14:
                C6qu c6qu4 = (C6qu) this.A01;
                return new AAl(((C5j7) 1Lm.A05(c6qu4.AWp(), c6qu4.Alj(), 66320)).AgW(c6qu4.BF7()).A02);
            case 15:
                7ML r07 = (7ML) ((C6qt) this.A01).A06;
                return new 7Mt(r07.A06, (Integer) r07.A09.getValue());
            case 16:
                i = 67961;
                return 1Bu.A06(((C6qu) this.A01).AWp(), i);
            case 19:
            case 23:
            case 30:
            case 32:
                c01i = ((6rM) ((C6qt) this.A01).A06).A0I;
                return c01i.getValue();
            case 20:
            case 21:
            case 31:
                return new 7Le(((C6qu) this.A01).Akk());
            case 22:
                return new AAu((7JX) 1Bn.A0A(67148), ((C6qu) this.A01).Ad4());
            case 26:
                C6qu c6qu5 = (C6qu) this.A01;
                return new AAy(c6qu5.BF7(), c6qu5.AbO(), c6qu5.BF6(), c6qu5.Ad4());
            case 29:
                return new AB2(new AnonymousClass709(2132279455), new AnonymousClass709(2132279455), new AnonymousClass709(2132279325), ((C6qu) this.A01).Ad4());
            case 33:
                C6qu c6qu6 = (C6qu) this.A01;
                return new 9Tn(c6qu6.AWp(), c6qu6.Alj(), c6qu6.BF7(), c6qu6.Aoc(), 0S2.A00);
            case 34:
                C6qu c6qu7 = (C6qu) this.A01;
                return new 7If(c6qu7.AWp(), c6qu7.BF7(), c6qu7.AbO());
            case 35:
                6rM r08 = (6rM) ((C6qt) this.A01).A06;
                return new 7I5(r08.AWp(), r08.Alf(), r08.Akk());
            case 36:
                C6qt c6qt = (C6qt) this.A01;
                6rM r09 = (6rM) c6qt.A06;
                6wQ r304 = null;
                6wQ r307 = r09.Axw().AZk(36310675731186551L) ? new 6wQ(new AKL(c6qt, 4)) : null;
                if (r09.Axw().AZr(1GD.A07, 36326051705607339L)) {
                    r304 = new 6wQ(new AKL(c6qt, 5));
                }
                C01i[] c01iArr = {r307, r304};
                11T.A0F(c01iArr, 0);
                return new 7Jw(02L.A08(c01iArr));
            case 37:
                C6qu c6qu8 = (C6qu) this.A01;
                return new 87F(c6qu8.AWp(), ((6rM) c6qu8.A06).Alj(), "fullscreen_view", "photo");
            case 38:
                c01i = ((6rM) ((C6qt) this.A01).A06).A0D;
                return c01i.getValue();
            case 39:
                2S4 BFS = ((C6qu) this.A01).BFS();
                11T.A0F(BFS, 1);
                return BFS.A00(66808);
            case 41:
                return ((C1u2) 1Bi.A03(16839)).A08(C1u3.A52, ((6rM) ((C6qt) this.A01).A06).Ad3().B4h());
            case 42:
                C6qu c6qu9 = (C6qu) this.A01;
                return new 7HD(c6qu9.AWp(), c6qu9.BF7());
            case 43:
                i = 67796;
                return 1Bu.A06(((C6qu) this.A01).AWp(), i);
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                i = 67390;
                return 1Bu.A06(((C6qu) this.A01).AWp(), i);
            case ActionId.QUEUED /* 48 */:
                c01i = ((7Mh) ((C6qt) this.A01).A02()).A02;
                return c01i.getValue();
            case ActionId.IN_PROGRESS /* 49 */:
                C6qu c6qu10 = (C6qu) this.A01;
                Context AWp2 = c6qu10.AWp();
                ThreadKey BF72 = c6qu10.BF7();
                FbUserSession Alj2 = c6qu10.Alj();
                6yM Ad4 = c6qu10.Ad4();
                78B Ao5 = c6qu10.Ao5();
                C66e AwD = c6qu10.AwD();
                boolean BAl = c6qu10.BAl();
                6rM r010 = (6rM) c6qu10.A06;
                return new A8W(new 7ML(AWp2, Alj2, BF72, r010.BFP(), r010.AaY(), Ao5, Ad4, AwD, r010.A0J, BAl));
        }
    }
}
