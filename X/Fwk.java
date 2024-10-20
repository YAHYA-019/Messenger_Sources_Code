package X;

import android.content.Context;
import android.util.SparseArray;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: Fwk.class */
public abstract class Fwk implements GJ1 {
    public static final F2w A0B = F2w.A00;
    public final Context A00;
    public final FwW A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final FFj A07;
    public final boolean A08;
    public final FbUserSession A09;
    public final 1Br A0A;

    public Fwk(Context context, FbUserSession fbUserSession, MigColorScheme migColorScheme, FFj fFj) {
        11T.A0F(migColorScheme, 3);
        this.A00 = context;
        this.A09 = fbUserSession;
        this.A03 = 1HG.A00(context, 99496);
        this.A04 = 1Lm.A00(context, fbUserSession, 99885);
        1Bn.A0A(99886);
        this.A01 = new FwW(context, migColorScheme);
        this.A05 = 1Lm.A00(context, fbUserSession, 99887);
        this.A0A = 1Bu.A00(99790);
        this.A02 = 1Lm.A00(context, fbUserSession, 100065);
        this.A06 = 1BK.A0E();
        this.A07 = fFj == null ? FFj.A00() : fFj;
        this.A08 = AnonymousClass001.A1T(fFj);
    }

    public final Ewg A00() {
        return (Ewg) 1Br.A0B(this.A0A);
    }

    @Override // X.GJ1
    public SparseArray AKW() {
        SparseArray A0E;
        if (this instanceof C2050DaD) {
            C2050DaD c2050DaD = (C2050DaD) this;
            A0E = DKC.A0E();
            A0E.put(2131362449, c2050DaD.A02());
            A0E.put(2131362450, AnonymousClass001.A0K());
            A0E.put(2131362444, c2050DaD.A03);
        } else {
            A0E = DKC.A0E();
        }
        SparseArray clone = A0E.clone();
        11T.A0A(clone);
        Context context = this.A00;
        SparseArray A0E2 = DKC.A0E();
        A0E2.put(2131362415, context);
        FHz A00 = EYd.A00(new EgZ(A0E2));
        clone.put(2131362432, 04R.A09(new 03Y[]{1BK.A1G("gql", ((EhF) 1Br.A0B(this.A05)).A00), 1BK.A1G("media_store", new FxW())}));
        clone.put(2131362426, 7zS.A14("acq", new FxV(A00), 1BK.A1G("ls", new Object()), 1BK.A1G("gs", ((Ebs) 1Br.A0B(this.A04)).A00.getValue())));
        clone.put(2131362415, context);
        clone.put(2131362472, this.A09);
        clone.put(2131362422, true);
        clone.put(2131362440, A0B);
        FwX fwX = (FwX) 1Bn.A0E(((F9o) 1Br.A0B(this.A03)).A00, (1BY) null, 99552);
        Object A0A = 1Bn.A0A(49434);
        Fwl fwl = new Fwl(null, E46.A01, fwX, (F71) 1Hv.A02(AbF.A04(fwX.A00), 99537));
        SparseArray A0E3 = DKC.A0E();
        A0E3.put(2131366028, fwl);
        A0E3.put(2131366026, false);
        A0E3.put(2131366027, new FFX());
        A0E3.put(2131362438, A0A);
        int size = A0E3.size();
        for (int i = 0; i < size; i = DKE.A06(A0E3, clone, i)) {
        }
        clone.put(2131362419, A00);
        return clone;
    }

    @Override // X.GJ1
    public GKA AZU() {
        return this.A01;
    }
}
