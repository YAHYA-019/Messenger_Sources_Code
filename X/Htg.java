package X;

import java.io.ByteArrayOutputStream;

/* loaded from: Htg.class */
public final class Htg {
    public final /* synthetic */ IFV A03;
    public Hcw A01 = null;
    public Hcw A02 = null;
    public int A00 = 0;

    public Htg(IFV ifv) {
        this.A03 = ifv;
    }

    public void A00() {
        this.A03.A09(this.A02.A02.toByteArray(), this.A02.A00);
        this.A02 = null;
    }

    public void A01() {
        if (this.A02 != null) {
            throw AnonymousClass001.A0T("BUG: Invalid newbuf() before copy()");
        }
        Hcw hcw = new Hcw();
        IFV ifv = this.A03;
        hcw.A02 = ifv.A04;
        hcw.A00 = ifv.A00;
        hcw.A01 = this.A01;
        this.A01 = hcw;
        this.A00++;
        ifv.A04 = new ByteArrayOutputStream();
        ifv.A00 = 0;
    }

    public void A02() {
        IFV ifv = this.A03;
        ByteArrayOutputStream byteArrayOutputStream = ifv.A04;
        int i = ifv.A00;
        Hcw hcw = this.A01;
        ifv.A04 = hcw.A02;
        ifv.A00 = hcw.A00;
        this.A02 = hcw;
        this.A01 = hcw.A01;
        this.A00--;
        hcw.A02 = byteArrayOutputStream;
        hcw.A00 = i;
    }
}
