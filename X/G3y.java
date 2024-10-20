package X;

import java.util.List;

/* loaded from: G3y.class */
public final class G3y implements Runnable {
    public static final String __redex_internal_original_name = "NTComponentUtils$1";
    public final /* synthetic */ FyG A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ List A02;

    public G3y(FyG fyG, List list, List list2) {
        this.A00 = fyG;
        this.A01 = list;
        this.A02 = list2;
    }

    @Override // java.lang.Runnable
    public void run() {
        FyG fyG = this.A00;
        DKD.A1L(fyG);
        DKC.A0Y(fyG).A09(fyG, new G0R(this));
        DKD.A1L(fyG);
    }
}
