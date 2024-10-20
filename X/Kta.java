package X;

import android.os.Handler;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;

/* loaded from: Kta.class */
public abstract class Kta {
    public boolean A00 = true;
    public final C50m A01;
    public final MKa A02;
    public final LXl A03;
    public final Object A04;

    public Kta(MKa mKa, LXl lXl, Object obj) {
        this.A04 = obj;
        this.A03 = lXl;
        this.A02 = mKa;
        this.A01 = lXl.A02;
    }

    public final void A00() {
        C50k c50k;
        int i;
        MKa mKa = this.A02;
        java.util.Map Aul = mKa.Aul();
        if (this instanceof Jun) {
            c50k = this.A01.A00;
            i = 955;
        } else if (this instanceof Juj) {
            c50k = this.A01.A00;
            i = 961;
        } else if (this instanceof Juo) {
            c50k = this.A01.A00;
            i = 958;
        } else if (this instanceof Jum) {
            c50k = this.A01.A00;
            i = 952;
        } else if (this instanceof Jul) {
            c50k = this.A01.A00;
            i = 949;
        } else if (this instanceof Jup) {
            c50k = this.A01.A00;
            i = 946;
        } else {
            boolean z = this instanceof Juk;
            c50k = this.A01.A00;
            i = z ? 943 : 940;
        }
        c50k.BZX(Aul, null, 4YT.A00(i));
        if (this.A00) {
            LXl lXl = this.A03;
            if (!lXl.A00.A0F()) {
                Juj juj = new Juj(new LSp(this, 0), mKa.AIF(), lXl);
                ((Kta) juj).A00 = false;
                juj.A00();
                return;
            }
        }
        A02(this);
    }

    public final void A01(L1w l1w, Function1 function1) {
        C50k c50k;
        LinkedHashMap A06;
        int i;
        C50k c50k2;
        int i2;
        int i3 = l1w.A00;
        MKa mKa = this.A02;
        java.util.Map Aul = mKa.Aul();
        if (i3 == 0) {
            if (this instanceof Jun) {
                c50k2 = this.A01.A00;
                i2 = 956;
            } else if (this instanceof Juj) {
                c50k2 = this.A01.A00;
                i2 = 962;
            } else if (this instanceof Juo) {
                c50k2 = this.A01.A00;
                i2 = 959;
            } else if (this instanceof Jum) {
                c50k2 = this.A01.A00;
                i2 = 953;
            } else if (this instanceof Jul) {
                c50k2 = this.A01.A00;
                i2 = 950;
            } else if (this instanceof Jup) {
                c50k2 = this.A01.A00;
                i2 = 947;
            } else {
                boolean z = this instanceof Juk;
                c50k2 = this.A01.A00;
                i2 = z ? 944 : 941;
            }
            c50k2.BZX(Aul, null, 4YT.A00(i2));
        } else {
            if (this instanceof Juj) {
                c50k = this.A01.A00;
                if (Aul == null) {
                    Aul = 04R.A0G();
                }
                A06 = 04R.A06(Aul);
                FHZ.A00(l1w, A06);
                i = 960;
            } else if (this instanceof Juo) {
                c50k = this.A01.A00;
                if (Aul == null) {
                    Aul = 04R.A0G();
                }
                A06 = 04R.A06(Aul);
                FHZ.A00(l1w, A06);
                i = 957;
            } else if (this instanceof Jun) {
                c50k = this.A01.A00;
                if (Aul == null) {
                    Aul = 04R.A0G();
                }
                A06 = 04R.A06(Aul);
                FHZ.A00(l1w, A06);
                i = 954;
            } else if (this instanceof Jum) {
                c50k = this.A01.A00;
                if (Aul == null) {
                    Aul = 04R.A0G();
                }
                A06 = 04R.A06(Aul);
                FHZ.A00(l1w, A06);
                i = 951;
            } else if (this instanceof Jul) {
                c50k = this.A01.A00;
                if (Aul == null) {
                    Aul = 04R.A0G();
                }
                A06 = 04R.A06(Aul);
                FHZ.A00(l1w, A06);
                i = 948;
            } else if (this instanceof Jup) {
                c50k = this.A01.A00;
                if (Aul == null) {
                    Aul = 04R.A0G();
                }
                A06 = 04R.A06(Aul);
                FHZ.A00(l1w, A06);
                i = 945;
            } else {
                boolean z2 = this instanceof Juk;
                c50k = this.A01.A00;
                if (z2) {
                    if (Aul == null) {
                        Aul = 04R.A0G();
                    }
                    A06 = 04R.A06(Aul);
                    FHZ.A00(l1w, A06);
                    i = 942;
                } else {
                    if (Aul == null) {
                        Aul = 04R.A0G();
                    }
                    A06 = 04R.A06(Aul);
                    FHZ.A00(l1w, A06);
                    i = 939;
                }
            }
            c50k.BZX(A06, null, 4YT.A00(i));
        }
        if (JQx.A1Y(LXl.A05, l1w.A00) && mKa.AHw()) {
            long Akv = mKa.Akv();
            mKa.CbT();
            if (Akv > 0) {
                this.A03.A01.postDelayed(new LlK(this), Akv);
                return;
            } else {
                A00();
                return;
            }
        }
        if (!this.A00 || l1w.A00 != -1 || !mKa.AHw()) {
            function1.invoke(this.A04);
            return;
        }
        long Akv2 = mKa.Akv();
        mKa.CbT();
        this.A00 = false;
        LXl lXl = this.A03;
        lXl.A04.add(this);
        Handler handler = lXl.A01;
        if (Akv2 > 0) {
            handler.postDelayed(lXl.A03, Akv2);
        } else {
            handler.post(lXl.A03);
        }
    }

    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, X.Ke3] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, X.Ke4] */
    public void A02(Object obj) {
        if (this instanceof Jun) {
            Jun jun = (Jun) this;
            MEr mEr = (MEr) obj;
            11T.A0F(mEr, 0);
            jun.A01.A00.A0D(mEr, jun.A00);
            return;
        }
        if (this instanceof Juj) {
            Juj juj = (Juj) this;
            LXl lXl = juj.A00;
            lXl.A04.add(juj);
            lXl.A01.post(lXl.A03);
            return;
        }
        if (this instanceof Juo) {
            Juo juo = (Juo) this;
            MEs mEs = (MEs) obj;
            11T.A0F(mEs, 0);
            juo.A01.A00.A0E(juo.A00, mEs);
            return;
        }
        if (this instanceof Jum) {
            Jum jum = (Jum) this;
            MEq mEq = (MEq) obj;
            11T.A0F(mEq, 0);
            jum.A00.A00.A0C(mEq, jum.A01);
            return;
        }
        if (this instanceof Jul) {
            Jul jul = (Jul) this;
            MEp mEp = (MEp) obj;
            11T.A0F(mEp, 0);
            jul.A01.A00.A0B(mEp, jul.A00);
            return;
        }
        if (this instanceof Jup) {
            Jup jup = (Jup) this;
            MFc mFc = (MFc) obj;
            11T.A0F(mFc, 0);
            L1w A06 = jup.A02.A00.A06(jup.A00, jup.A01);
            11T.A0A(A06);
            mFc.C3N(A06);
            return;
        }
        if (this instanceof Juk) {
            Juk juk = (Juk) this;
            MEo mEo = (MEo) obj;
            11T.A0F(mEo, 0);
            String str = juk.A01;
            ?? obj2 = new Object();
            obj2.A00 = str;
            juk.A00.A00.A0A((Ke4) obj2, mEo);
            return;
        }
        Jui jui = (Jui) this;
        MEn mEn = (MEn) obj;
        11T.A0F(mEn, 0);
        String str2 = jui.A01;
        ?? obj3 = new Object();
        obj3.A00 = str2;
        jui.A00.A00.A08((Ke3) obj3, mEn);
    }
}
