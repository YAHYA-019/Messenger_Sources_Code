package X;

import com.facebook.graphservice.interfaces.Summary;

/* loaded from: E0c.class */
public final class E0c extends 2Yv {
    public Summary A00;
    public ELJ A01;
    public ELK A02;
    public Et0 A03;
    public F8A A04;
    public Object A05;
    public Object A06;
    public Throwable A07;

    public void A02(C2l4 c2l4) {
        Object[] objArr = c2l4.A01;
        if (c2l4.A00 == 0) {
            Object obj = this.A05;
            ELK elk = (ELK) objArr[0];
            Object obj2 = objArr[1];
            ELJ elj = (ELJ) objArr[2];
            Summary summary = (Summary) objArr[3];
            Throwable th = (Throwable) objArr[4];
            if (obj2 != null) {
                obj = obj2;
            }
            this.A02 = elk;
            this.A06 = obj2;
            this.A05 = obj;
            this.A01 = elj;
            this.A00 = summary;
            this.A07 = th;
        }
    }
}
