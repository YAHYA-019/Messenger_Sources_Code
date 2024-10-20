package X;

/* loaded from: Fe2.class */
public final class Fe2 implements GEc {
    public final int A00;
    public final Object A01;

    public Fe2(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.GEc
    public void Bu6(FIU fiu) {
        switch (this.A00) {
            case 0:
                ((FY7) this.A01).A03.A01("bk.action.navigation.ResumeStoryViewer");
                return;
            case 1:
                Erp erp = ((ElK) this.A01).A00;
                if (erp != null) {
                    erp.A00(false);
                    return;
                }
                return;
            default:
                I3e i3e = ((Hnb) this.A01).A01.A00;
                if (i3e != null) {
                    ((I4p) i3e.A01(I4p.class)).A01(EPG.A0D);
                    return;
                }
                return;
        }
    }
}
