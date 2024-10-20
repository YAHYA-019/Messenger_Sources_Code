package X;

/* loaded from: Fpb.class */
public final class Fpb implements GIV {
    public final /* synthetic */ FAX A00;

    public Fpb(FAX fax) {
        this.A00 = fax;
    }

    @Override // X.GIV
    public void C04(EzW ezW, String str) {
        FAX fax = this.A00;
        AbG.A0B(fax.A0L).CY3(new G49(fax, ezW, str));
    }

    @Override // X.GIV
    public void C06(String str, Throwable th) {
        GJv gJv = this.A00.A01;
        if (gJv != null) {
            gJv.C05(str, th);
        }
    }
}
