package X;

import android.content.Context;
import com.facebook.inject.FbInjector;

/* loaded from: EU9.class */
public abstract class EU9 {
    /* JADX WARN: Type inference failed for: r0v14, types: [X.GJ0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [X.EYh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [X.EYQ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, X.FqQ] */
    public static final Integer A00(Context context) {
        Integer num;
        11T.A0F(context, 0);
        if (Eb4.A00) {
            Context context2 = FbInjector.A03;
            Fxk fxk = new Fxk(new Fxi(7zL.A09()));
            FJG fjg = FJG.A00;
            DTa dTa = DTa.A00;
            FHx fHx = FHx.A00;
            EHY ehy = EHY.A00;
            Fwj fwj = new Fwj(new Object());
            F3Z f3z = F3Z.A00;
            ?? obj = new Object();
            Fwp fwp = Fwp.A00;
            FGp fGp = new FGp(context2, new F66(Eb4.A01), dTa, fjg, ehy, f3z, (EYQ) new Object(), fwj, fwp, Fwq.A00, Fwr.A00, fHx, (EYh) obj, fxk);
            synchronized (FGp.class) {
                FGp.A0E = fGp;
                synchronized (FGV.class) {
                }
            }
            FGT.A00 = new Object();
            Fc7 fc7 = (Fc7) 1Bn.A0A(99800);
            11T.A0F(fc7, 0);
            AbstractC01883tB.A00 = fc7;
            Eb4.A00 = false;
            num = 0S2.A01;
        } else {
            num = 0S2.A00;
        }
        11T.A0A(num);
        return num;
    }
}
