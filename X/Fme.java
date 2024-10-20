package X;

import android.content.Context;
import android.content.Intent;

/* loaded from: Fme.class */
public final class Fme implements GFa {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public Fme(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A03 = str;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // X.GFa
    public final void BoD() {
        C08f A05;
        Object obj;
        int i = this.A00;
        Intent A0J = DKE.A0J(this.A03);
        if (i != 0) {
            A05 = DKG.A0t(((E5s) this.A01).A04);
            obj = this.A02;
        } else {
            A05 = ((08O) 1Br.A0B(((E5u) this.A02).A05)).A05();
            obj = this.A01;
        }
        A05.A0A((Context) obj, A0J);
    }
}
