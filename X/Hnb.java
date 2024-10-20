package X;

/* loaded from: Hnb.class */
public final class Hnb {
    public I3K A00;
    public final Hao A01;

    public Hnb(Hao hao) {
        this.A01 = hao;
        this.A00 = hao.A01;
    }

    public void A00(boolean z) {
        I3e i3e = this.A01.A00;
        if (i3e != null) {
            I4p i4p = (I4p) i3e.A01(I4p.class);
            EPG epg = EPG.A0p;
            if (z) {
                i4p.A02(epg);
            } else {
                i4p.A01(epg);
            }
        }
    }
}
