package X;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.5fq, reason: invalid class name */
/* loaded from: 5fq.class */
public abstract class C5fq {
    public static final C5fr A0K = new C5fr(null, null, null, null, null, null, null, "", "", null, "", null, new HashSet(), 0, 0, 0);
    public int A00;
    public long A01;
    public long A02;
    public C5fs A03;
    public C2o9 A04;
    public C5fr A05;
    public C5fr A06;
    public Long A07;
    public Long A08;
    public String A09;
    public String A0A;
    public String A0B;
    public List A0C;
    public List A0D;
    public java.util.Map A0E;
    public java.util.Map A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;

    public C5fq() {
        this.A05 = A0K;
        this.A04 = C2o9.A05;
        this.A03 = C5fs.A05;
        C0ty c0ty = C0ty.A00;
        this.A0D = c0ty;
        this.A0E = new 0QO(0);
        this.A0C = c0ty;
    }

    public C5fq(C5fu c5fu) {
        this();
        this.A09 = c5fu.A09;
        this.A0B = c5fu.A0B;
        this.A05 = c5fu.A05;
        this.A0I = c5fu.A0H;
        this.A02 = c5fu.A02;
        this.A01 = c5fu.A01;
        this.A08 = c5fu.A08;
        this.A0F = c5fu.A0E;
        this.A0E = null;
        this.A04 = c5fu.A04;
        this.A0D = 0QD.A0V(c5fu.A0D);
        this.A03 = c5fu.A03;
        this.A00 = c5fu.A00;
        this.A0J = c5fu.A0I;
        this.A06 = c5fu.A06;
        this.A0H = c5fu.A0G;
        this.A0G = c5fu.A0F;
        this.A0A = c5fu.A0A;
        this.A0C = 0QD.A0V(c5fu.A0C);
        this.A07 = c5fu.A07;
    }

    public C5fv A00() {
        return this instanceof C5qu ? new 5gC((C5qu) this) : this instanceof C5w7 ? new C5v9((C5w7) this) : this instanceof C5w6 ? new C5n8((C5w6) this) : this instanceof C5w8 ? new 5gR((C5w8) this) : this instanceof C5w5 ? new 5gP((C5w5) this) : this instanceof C5w4 ? new 5vM((C5w4) this) : this instanceof C5fp ? new C5ft((C5fp) this) : this instanceof 5wB ? new C5n6((5wB) this) : this instanceof 5wA ? new 5wJ((5wA) this) : this instanceof C5vu ? new C5uY((C5vu) this) : this instanceof C5w9 ? new C5n7((C5w9) this) : this instanceof 5wC ? new 5wE((5wC) this) : this instanceof C7h0 ? new 5vK((C7h0) this) : this instanceof C7Ze ? new C5v8((C7Ze) this) : this instanceof C7h4 ? ((C7h4) this).A06() : this instanceof C7h3 ? new 5vL((C7h3) this) : this instanceof C7h2 ? new 7HJ((C7h2) this) : this instanceof C7h1 ? new 5gQ((C7h1) this) : new 7RO((6rI) this);
    }

    public final void A01(C2o9 c2o9) {
        11T.A0F(c2o9, 0);
        this.A04 = c2o9;
    }

    public final void A02(C5g3 c5g3, 5PP r303) {
        11T.A0F(c5g3, 0);
        0QO r304 = this.A0E;
        if (r304 == null) {
            java.util.Map map = this.A0F;
            if (map == null) {
                throw 1BK.A0e();
            }
            r304 = new 0QO(map.size());
            r304.putAll(map);
            this.A0E = r304;
        }
        r304.put(c5g3, r303);
    }

    public final void A03(C5fr c5fr) {
        11T.A0F(c5fr, 0);
        this.A05 = c5fr;
    }

    public final void A04(String str) {
        11T.A0F(str, 0);
        this.A09 = str;
    }

    public final void A05(List list) {
        11T.A0F(list, 0);
        ImmutableList copyOf = ImmutableList.copyOf((Collection) list);
        11T.A0A(copyOf);
        this.A0D = copyOf;
    }
}
