package X;

/* loaded from: B3w.class */
public final class B3w extends 2QB {
    public final 1Br A04 = 1Bu.A00(68126);
    public final 1Br A00 = 7zM.A0Q();
    public final 1Br A01 = AbG.A0J();
    public final 1Br A03 = 1Bu.A00(66394);
    public final 1Br A02 = 1Bu.A00(83679);

    public void A06() {
        CDa cDa = (CDa) 1Br.A0B(this.A02);
        C00i c00i = cDa.A01.A00;
        if (((2QG) c00i.get()).A00()) {
            2QG r0 = (2QG) c00i.get();
            if (1Br.A00(cDa.A00) - 1BL.A0A(1Br.A09(cDa.A02), CDa.A03) <= (!r0.A00() ? 0L : 1Br.A07(r0.A00).Av9(1GD.A07, 36600418512016477L)) * 1000) {
                return;
            }
        }
        C3sa A0L = 7zM.A0L(7zL.A0M(), new 2Jf(2JX.class, (Class) null, "FacebookStaticEntryPointNotifications", (String) null, "fbandroid", 164547765, 0, 2146672664L, 2146672664L, false, true));
        C00i c00i2 = this.A03.A00;
        if (((2QG) c00i2.get()).A01()) {
            2QG r02 = (2QG) c00i2.get();
            A0L.A0A(!r02.A01() ? 0L : 1Br.A07(r02.A00).Av9(1GD.A07, 36600418512082014L));
            2QG r03 = (2QG) c00i2.get();
            A0L.A09(!r03.A01() ? 0L : 1Br.A07(r03.A00).Av9(1GD.A07, 36600418512082014L));
        }
        ((4fF) 1Br.A0B(this.A04)).A0I(A0L, D4q.A00(this, 58), "fb_notifications", 4YV.A11(this.A01));
    }

    public void A07() {
        ((4fF) 1Br.A0B(this.A04)).A0K("fb_notifications");
    }
}
