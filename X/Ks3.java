package X;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/* loaded from: Ks3.class */
public final class Ks3 {
    public LgR A04 = LgR.A02;
    public KM8 A01 = KM8.A00;
    public MDf A00 = KPY.A00;
    public final java.util.Map A0A = AnonymousClass001.A0u();
    public final List A08 = AnonymousClass001.A0s();
    public final List A09 = AnonymousClass001.A0s();
    public boolean A06 = false;
    public boolean A05 = true;
    public MGc A03 = Gson.A0H;
    public MGc A02 = Gson.A0G;
    public final LinkedList A07 = AbF.A1F();

    public Gson A00() {
        List list = this.A08;
        int size = list.size();
        List list2 = this.A09;
        ArrayList A0t = AnonymousClass001.A0t(size + list2.size() + 3);
        A0t.addAll(list);
        Collections.reverse(A0t);
        ArrayList A17 = 1BK.A17(list2);
        Collections.reverse(A17);
        A0t.addAll(A17);
        MGc mGc = Gson.A0H;
        LgR lgR = this.A04;
        MDf mDf = this.A00;
        HashMap A1C = DKC.A1C(this.A0A);
        boolean z = this.A06;
        boolean z2 = this.A05;
        return new Gson(mDf, this.A01, this.A03, this.A02, lgR, new ArrayList(list), new ArrayList(list2), A0t, 1BK.A17(this.A07), A1C, z, z2);
    }

    public void A01(5xY r302) {
        this.A08.add(r302);
    }
}
