package X;

import java.util.List;

/* loaded from: Idc.class */
public final /* synthetic */ class Idc implements JG9 {
    public final /* synthetic */ ICm A00;

    @Override // X.JG9
    public final void BwL(J7E j7e) {
        ICm iCm = this.A00;
        List list = iCm.A0L.A00;
        int size = list.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                return;
            }
            ((JLu) list.get(i2)).Bqr(iCm, j7e);
            i = i2 + 1;
        }
    }
}
