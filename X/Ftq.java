package X;

import com.facebook.auth.usersession.FbUserSession;

/* loaded from: Ftq.class */
public final class Ftq implements GGj {
    public final Eju A00;

    public Ftq(Eju eju) {
        this.A00 = eju;
    }

    @Override // X.GGj
    public /* bridge */ /* synthetic */ void BhS(3oI r302, Object obj) {
        EET eet = (AbstractC10314t5) obj;
        if (eet instanceof EET) {
            EET eet2 = eet;
            Eju eju = this.A00;
            String str = eet2.A00;
            String str2 = eet2.A01;
            Emb emb = new Emb(r302, eet2, this);
            FbUserSession A00 = 1Fw.A00();
            eju.A00.get();
            1FV A01 = ((5SL) 1Lo.A06(A00, 49727)).A01(str, str2);
            1Kd.A0D(eju.A01, new Fw1(17, emb, eju, A00), A01);
        }
    }
}
