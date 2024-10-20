package X;

/* loaded from: Cl5.class */
public final class Cl5 implements DFA {
    public final /* synthetic */ AmJ A00;

    public Cl5(AmJ amJ) {
        this.A00 = amJ;
    }

    public void CPj(int i) {
        AmJ amJ = this.A00;
        if (i != amJ.A00) {
            amJ.A00 = i;
            C5v c5v = amJ.A04;
            if (c5v == null) {
                11T.A0L("membersViewData");
                throw 0Q8.createAndThrow();
            }
            c5v.A00(i);
        }
    }
}
