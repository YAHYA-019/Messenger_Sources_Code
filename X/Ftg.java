package X;

import com.facebook.auth.usersession.FbUserSession;

/* loaded from: Ftg.class */
public final class Ftg implements GGj {
    public final Ejs A00;

    public Ftg(Ejs ejs) {
        this.A00 = ejs;
    }

    @Override // X.GGj
    public /* bridge */ /* synthetic */ void BhS(3oI r302, Object obj) {
        AbstractC10314t5 abstractC10314t5 = (AbstractC10314t5) obj;
        if (abstractC10314t5 instanceof EEK) {
            Ejs ejs = this.A00;
            EmS emS = new EmS(r302, this, abstractC10314t5);
            FbUserSession A00 = 1Fw.A00();
            Bo3 bo3 = (Bo3) ejs.A00.get();
            1BK.A1E(bo3.A01).execute(new D9c(A00, new Fsj(emS, ejs), bo3));
        }
    }
}
