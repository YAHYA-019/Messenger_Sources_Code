package X;

/* loaded from: B85.class */
public final class B85 extends CqM {
    public final CHo A00;

    public B85(CHo cHo) {
        this.A00 = cHo;
    }

    public /* bridge */ /* synthetic */ Object A01(Object obj) {
        CHo cHo;
        String str;
        DK3 cpe;
        AoS aoS = (DJm) obj;
        if (aoS instanceof Cf5) {
            AoS aoS2 = (Cf5) aoS;
            cpe = aoS2 instanceof AoS ? aoS2.A06 : aoS2 instanceof AoQ ? ((AoQ) aoS2).A03 : aoS2 instanceof AoT ? ((AoT) aoS2).A03 : aoS2 instanceof AoU ? ((AoU) aoS2).A04 : BP6.A0X;
        } else {
            if (!(aoS instanceof Cey) || (str = ((Cey) aoS).A02) == null) {
                cHo = this.A00;
                return new RJg((DJm) aoS, cHo);
            }
            cpe = new Cpe(str);
        }
        cHo = new CHo(cpe);
        return new RJg((DJm) aoS, cHo);
    }
}
