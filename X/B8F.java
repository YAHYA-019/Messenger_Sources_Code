package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.search.lists.model.MessageSearchThreadModel;
import com.google.common.collect.ImmutableList;

/* loaded from: B8F.class */
public final class B8F extends C9R {
    public ImmutableList A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public Long A04;
    public final FbUserSession A05;
    public final C10264sx A06;
    public final C9R A07;
    public final String A08;
    public final BhJ A09;
    public final C1e A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B8F(FbUserSession fbUserSession, C1qb c1qb, 2YJ r304, C10264sx c10264sx, C9Z c9z, C1e c1e, String str) {
        super(c1qb, r304, c9z, str);
        7zR.A1O(c10264sx, fbUserSession);
        11T.A0F(c1e, 7);
        this.A08 = str;
        this.A06 = c10264sx;
        this.A05 = fbUserSession;
        this.A0A = c1e;
        BhJ bhJ = new BhJ(this);
        this.A09 = bhJ;
        this.A07 = new B8E(fbUserSession, c1qb, r304, c10264sx, bhJ, c9z, null, str);
        this.A00 = 1BK.A0b();
        this.A03 = true;
    }

    public static final void A00(B8F b8f, ImmutableList immutableList) {
        b8f.A01 = AbJ.A1U(b8f.A00.size(), 10);
        b8f.A00 = immutableList;
        if (1BK.A1Y(immutableList)) {
            b8f.A04 = ((MessageSearchThreadModel) 0QD.A0F(b8f.A00)).A06;
        }
    }

    @Override // X.C9R
    public void A03() {
        this.A03 = true;
        if (this.A02 || !this.A07.A02()) {
            this.A02 = false;
            this.A0A.A00(1Fj.A01(super.A00));
            if (!this.A01) {
                this.A07.A03();
                return;
            }
            C10264sx c10264sx = this.A06;
            String str = this.A08;
            Long l = this.A04;
            c10264sx.A08(this.A05, new Rqn(this), str, l != null ? l.longValue() : Long.MAX_VALUE);
        }
    }

    @Override // X.C9R
    public void A04(ImmutableList immutableList) {
        11T.A0F(immutableList, 0);
        super.A04(immutableList);
        this.A00 = 1BK.A0b();
        this.A0A.A00(1Fj.A01(super.A00));
    }
}
