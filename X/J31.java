package X;

import java.util.List;
import java.util.UUID;

/* loaded from: J31.class */
public final /* synthetic */ class J31 implements Runnable {
    public static final String __redex_internal_original_name = "Camera1Device$$ExternalSyntheticLambda8";
    public final /* synthetic */ J7E A00;
    public final /* synthetic */ IeR A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ UUID A03;
    public final /* synthetic */ boolean A04;

    public /* synthetic */ J31(J7E j7e, IeR ieR, List list, UUID uuid, boolean z) {
        this.A01 = ieR;
        this.A02 = list;
        this.A00 = j7e;
        this.A04 = z;
        this.A03 = uuid;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IeR ieR = this.A01;
        List list = this.A02;
        J7E j7e = this.A00;
        boolean z = this.A04;
        UUID uuid = this.A03;
        int size = list.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                break;
            }
            ((JG9) list.get(i2)).BwL(j7e);
            i = i2 + 1;
        }
        if (z) {
            ieR.A0Q.A05(uuid);
            ieR.ANZ((Ht4) null);
        }
    }
}
