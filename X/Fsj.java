package X;

import com.google.common.collect.ImmutableList;

/* loaded from: Fsj.class */
public final class Fsj implements 4jE {
    public final /* synthetic */ EmS A00;
    public final /* synthetic */ Ejs A01;

    public Fsj(EmS emS, Ejs ejs) {
        this.A01 = ejs;
        this.A00 = emS;
    }

    public void COV(2JX r302) {
        EmS emS;
        3oI r312;
        Object obj;
        EgM egM;
        if (r302 != null) {
            try {
                2JX A0P = r302.A0P(2JX.class, 1426042692);
                if (A0P != null) {
                    2JX A0L = 1BL.A0L(A0P, -1384270571, -912773242);
                    if (A0L == null) {
                        emS = this.A00;
                        new EgM(new 1Pr());
                        r312 = emS.A00;
                        new EEb(egM, emS.A02, true);
                        r312.ANn(obj);
                    }
                    Ejs ejs = this.A01;
                    ImmutableList A0c = A0L.A0c(660173473, 2JX.class, 893373100);
                    1Pr r0 = new 1Pr();
                    1Du it = A0c.iterator();
                    while (it.hasNext()) {
                        2JX A0D = AbG.A0D(it);
                        String A0r = A0D.A0r(106079);
                        if (A0r != null) {
                            String A0m = A0D.A0m();
                            if (A0m != null) {
                                r0.A00(new EmU(A0r, A0m, A0D.getIntValue(-546109589)));
                            }
                        }
                        1BK.A09(ejs.A01).D0v("CarrierSignalConfigFetcherHandlerImpl", 4YT.A00(922));
                    }
                    EgM egM2 = new EgM(r0);
                    EmS emS2 = this.A00;
                    r312 = emS2.A00;
                    new EEb(egM2, emS2.A02, true);
                    r312.ANn(obj);
                }
            } catch (Throwable unused) {
                EmS emS3 = this.A00;
                emS3.A00.ANn(new EEb((EgM) null, emS3.A02, false));
                return;
            }
        }
        emS = this.A00;
        new EgM(new 1Pr());
        r312 = emS.A00;
        new EEb(egM, emS.A02, true);
        r312.ANn(obj);
    }

    public void onFailure(Throwable th) {
        EmS emS = this.A00;
        emS.A00.ANn(new EEb((EgM) null, emS.A02, false));
    }
}
