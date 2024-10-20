package X;

/* loaded from: Eve.class */
public final class Eve {
    public final C00i A01 = 1BQ.A02(99350);
    public final C00i A06 = 1BQ.A02(99349);
    public final C00i A0C = 1BQ.A02(99346);
    public final C00i A00 = 1BQ.A02(99345);
    public final C00i A02 = 1BQ.A02(99352);
    public final C00i A07 = DKD.A0V();
    public final C00i A04 = 1BQ.A02(99361);
    public final C00i A03 = 1BQ.A02(99356);
    public final C00i A09 = 1BQ.A02(99355);
    public final C00i A0A = 1BV.A00(99358);
    public final C00i A08 = 1BQ.A02(99357);
    public final C00i A05 = 1BQ.A02(99359);
    public final C00i A0B = 1BQ.A02(99360);

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000e. Please report as an issue. */
    public ETs A00(EO0 eo0) {
        C00i c00i;
        switch (RCZ.A00[eo0.ordinal()]) {
            case 1:
                c00i = this.A06;
                return (ETs) c00i.get();
            case 2:
                c00i = this.A01;
                return (ETs) c00i.get();
            case 3:
                c00i = this.A0C;
                return (ETs) c00i.get();
            case 4:
                c00i = this.A00;
                return (ETs) c00i.get();
            case 5:
                c00i = DKC.A0Z(this.A07).A06() ? this.A04 : this.A02;
                return (ETs) c00i.get();
            case 6:
                c00i = DKC.A0Z(this.A07).A06() ? this.A08 : this.A03;
                return (ETs) c00i.get();
            case 7:
                if (FI2.A02(this.A07)) {
                    c00i = this.A0A;
                    return (ETs) c00i.get();
                }
                c00i = this.A09;
                return (ETs) c00i.get();
            case 8:
                if (FI2.A02(this.A07)) {
                    c00i = this.A05;
                    return (ETs) c00i.get();
                }
                c00i = this.A09;
                return (ETs) c00i.get();
            case 9:
                c00i = this.A0B;
                return (ETs) c00i.get();
            default:
                throw AnonymousClass001.A0q(AnonymousClass001.A0Z(eo0, "No PinActionController for ", AnonymousClass001.A0k()));
        }
    }
}
