package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* renamed from: X.74i, reason: invalid class name */
/* loaded from: 74i.class */
public class C74i implements C6qv, 6zQ {
    public final C6zG A00;
    public final C6zG A01;
    public final C6zG A02;
    public final List A03;
    public final List A04;
    public final List A05;
    public final List A06;
    public final List A07;
    public final List A08;
    public final C01i A09;
    public final C01i A0A;
    public final C01i A0B;
    public final C01i A0C;
    public final C01i A0D;
    public final C01i A0E;
    public final C01i A0F;
    public final /* synthetic */ C6qv A0G;

    /* JADX WARN: Type inference failed for: r0v38, types: [X.6zD, java.lang.Object] */
    public C74i(C6qv c6qv, List list, Function1 function1) {
        this.A0G = c6qv;
        C03i c03i = C03i.A02;
        this.A09 = C01g.A00(c03i, new C82x(list, 40));
        this.A0D = C01g.A00(c03i, new C82x(this, 44));
        this.A0A = C01g.A00(c03i, new C82x(this, 39));
        this.A0C = C01g.A00(c03i, C74j.A00);
        this.A0E = C01g.A00(c03i, new C82x(this, 45));
        C6z2 c6z2 = C6z2.A0I;
        C82x c82x = new C82x(this, 41);
        6zM r0 = 6zM.A00;
        11T.A0F(r0, 1);
        this.A00 = new 6zE(c6z2, r0, C01g.A01(c82x));
        this.A02 = new 6zE(C6z2.A10, (6zD) new Object(), C01g.A01(new C82x(this, 46)));
        this.A0F = C01g.A00(c03i, C74l.A00);
        this.A08 = (List) function1.invoke(C0s8.A14((C6zG) this.A09.getValue(), Awl(), BFv(), AnonymousClass707.A02));
        this.A0B = C01g.A00(c03i, new C82x(this, 42));
        this.A01 = new 6zE(C6z2.A0T, r0, C01g.A01(new C82x(this, 43)));
        List singletonList = Collections.singletonList(Aa4());
        11T.A0A(singletonList);
        this.A03 = 0QD.A0O(this.A08, singletonList);
        List singletonList2 = Collections.singletonList(Awr());
        11T.A0A(singletonList2);
        this.A06 = 0QD.A0O(this.A08, singletonList2);
        C6zG[] c6zGArr = {this.A0G.AwI(), Aa4(), Awr()};
        11T.A0F(c6zGArr, 0);
        this.A04 = 0QD.A0O(this.A08, 02L.A08(c6zGArr));
        C6zG[] c6zGArr2 = {this.A0G.AwI(), Aa4(), AiE()};
        11T.A0F(c6zGArr2, 0);
        this.A05 = 0QD.A0O(this.A08, 02L.A08(c6zGArr2));
        C6zG[] c6zGArr3 = {this.A0G.AwI(), Aa4()};
        11T.A0F(c6zGArr3, 0);
        this.A07 = 0QD.A0O(this.A08, 02L.A08(c6zGArr3));
    }

    @Override // X.C6qv
    public C6zG AVG() {
        return this.A0G.AVG();
    }

    @Override // X.C6qv
    public Context AWp() {
        return this.A0G.AWp();
    }

    public C6zG Aa4() {
        return (C6zG) this.A0A.getValue();
    }

    @Override // X.C6qv
    public C6yo AaY() {
        return this.A0G.AaY();
    }

    @Override // X.C6qv
    public 2Of AbO() {
        return this.A0G.AbO();
    }

    @Override // X.C6qv
    public 6yM Ad4() {
        return this.A0G.Ad4();
    }

    public C6zG Aeh() {
        return this.A00;
    }

    public List Agr() {
        return this.A03;
    }

    public List Ags() {
        return this.A04;
    }

    public List Agt() {
        return this.A05;
    }

    public List Ah1() {
        return this.A06;
    }

    public List Ah7() {
        return this.A07;
    }

    public C6zG AiE() {
        return (C6zG) this.A0B.getValue();
    }

    @Override // X.C6qv
    public 1Va Akk() {
        return this.A0G.Akk();
    }

    @Override // X.C6qv
    public 1pK Alf() {
        return this.A0G.Alf();
    }

    @Override // X.C6qv
    public FbUserSession Alj() {
        return this.A0G.Alj();
    }

    @Override // X.C6qv
    public 78B Ao5() {
        return this.A0G.Ao5();
    }

    @Override // X.C6qv
    public 2Og Aoc() {
        return this.A0G.Aoc();
    }

    @Override // X.C6qv
    public C66e AwD() {
        return this.A0G.AwD();
    }

    @Override // X.C6qv
    public C6zG AwI() {
        return this.A0G.AwI();
    }

    public C6zG Awl() {
        Object value;
        if (this instanceof C74n) {
            7xG r0 = 7xG.A00;
            11T.A0F(r0, 1);
            value = r0.invoke();
        } else {
            value = this.A0C.getValue();
        }
        return (C6zG) value;
    }

    public C6zG Awm() {
        return this.A01;
    }

    @Override // X.C6qv
    public 75G Awp() {
        return this.A0G.Awp();
    }

    public C6zG Awr() {
        return this instanceof C74n ? AB9.A01 : (C6zG) this.A0D.getValue();
    }

    @Override // X.C6qv
    public C01i Awt() {
        return this.A0G.Awt();
    }

    @Override // X.C6qv
    public C5jn AxD() {
        return this.A0G.AxD();
    }

    public List AzG() {
        return this.A08;
    }

    @Override // X.C6qv
    public C6rj B6S() {
        return this.A0G.B6S();
    }

    @Override // X.C6qv
    public boolean BAl() {
        return this.A0G.BAl();
    }

    @Override // X.C6qv
    public 2Oi BBY() {
        return this.A0G.BBY();
    }

    @Override // X.C6qv
    public HeterogeneousMap BF6() {
        return this.A0G.BF6();
    }

    @Override // X.C6qv
    public ThreadKey BF7() {
        return this.A0G.BF7();
    }

    @Override // X.C6qv
    public 2S4 BFS() {
        return this.A0G.BFS();
    }

    public C6zG BFv() {
        return this instanceof C74n ? AB9.A01 : (C6zG) this.A0E.getValue();
    }

    @Override // X.C6qv
    public C5j5 BJ2() {
        return this.A0G.BJ2();
    }

    public C6zG BJC() {
        return this.A02;
    }

    public C6zG BK9() {
        return (C6zG) this.A0F.getValue();
    }
}
