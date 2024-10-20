package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* loaded from: Fbr.class */
public final class Fbr implements JJb {
    public static final java.util.Map A08 = new SGO();
    public 1BY A00;
    public final Ekr A01;
    public final F6Y A02;
    public final C00i A03 = 1BV.A01((1BY) null, 100280);
    public final C00i A04;
    public final C00i A05;
    public final C00i A06;
    public final C00i A07;

    public Fbr(1BO r302, FbUserSession fbUserSession) {
        1BV A01 = 1BV.A01((1BY) null, 84744);
        this.A07 = A01;
        1BV A012 = 1BV.A01((1BY) null, 98883);
        this.A05 = A012;
        1BV A013 = 1BV.A01((1BY) null, 115998);
        this.A06 = A013;
        this.A04 = 1BV.A01((1BY) null, 82984);
        this.A00 = 7zL.A0Q(r302);
        if (((ETX) A012.get()).A03()) {
            A08.put(HC7.A08, Arrays.asList("pytorch", "arservicesoptional"));
        }
        this.A01 = new Ekr((HpG) A013.get(), A08);
        AbR abR = (AbR) A01.get();
        Context A014 = FbInjector.A01();
        AbL.A0y(abR);
        try {
            F6Y f6y = new F6Y(abR, fbUserSession);
            1Bn.A0K();
            FbInjector.A04(A014);
            this.A02 = f6y;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A014);
            throw th;
        }
    }

    @Override // X.JJb
    public void Aiu(GEG geg) {
        Aiv(geg, ERG.A01);
    }

    @Override // X.JJb
    public void Aiv(GEG geg, GFM gfm) {
        F6Y f6y = this.A02;
        Ekr ekr = this.A01;
        ((Executor) 1Bi.A03(16448)).execute(new G5d(geg, (GEL) this.A03.get(), ekr, f6y, (GKc) this.A04.get()));
    }

    @Override // X.JJb
    public Fcf Aiw() {
        F6Y f6y = this.A02;
        Ekr ekr = this.A01;
        GEL gel = (GEL) this.A03.get();
        GKc gKc = (GKc) this.A04.get();
        if (f6y.A07 == null) {
            F6Y.A00(gel, ekr, f6y, gKc);
        }
        Fcf fcf = f6y.A07;
        fcf.getClass();
        return fcf;
    }
}
