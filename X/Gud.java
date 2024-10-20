package X;

/* loaded from: Gud.class */
public abstract class Gud extends Ht4 {
    public final Ht4 A00;

    public Gud(Ht4 ht4) {
        this.A00 = ht4;
    }

    public void A06() {
        I3k i3k;
        if (this instanceof C2412GcZ) {
            i3k = ((C2412GcZ) this).A02;
        } else {
            if (!(this instanceof C2411GcY)) {
                if (this instanceof C2410GcX) {
                    C2410GcX c2410GcX = (C2410GcX) this;
                    c2410GcX.A01.A00 = c2410GcX.A00;
                    return;
                }
                return;
            }
            C2411GcY c2411GcY = (C2411GcY) this;
            if (2 - c2411GcY.A00 != 0) {
                return;
            } else {
                i3k = (I3k) c2411GcY.A01;
            }
        }
        Idf idf = i3k.A00;
        idf.A01();
        idf.A06 = false;
        idf.A00 = null;
    }

    public void A07(Object obj) {
        if (!(this instanceof C2412GcZ)) {
            if (this instanceof C2411GcY) {
                C2411GcY c2411GcY = (C2411GcY) this;
                if (1 - c2411GcY.A00 == 0) {
                    HzC hzC = (HzC) obj;
                    I82 i82 = hzC.A03;
                    Ide.A01((Ide) c2411GcY.A01, (IBB) i82.A05(I82.A0q), (IBB) i82.A05(I82.A0k), (IBB) i82.A05(I82.A0y), hzC.A01);
                    return;
                }
                return;
            }
            return;
        }
        C2412GcZ c2412GcZ = (C2412GcZ) this;
        HzC hzC2 = (HzC) obj;
        I3k i3k = c2412GcZ.A02;
        Idf idf = i3k.A00;
        try {
            if (idf.A03 != null) {
                idf.A02.A6p(idf.A03);
            }
        } catch (J77 unused) {
        }
        i3k.A02.BPC(GOn.A0F(), c2412GcZ.A01, c2412GcZ.A00, hzC2.A01);
    }
}
