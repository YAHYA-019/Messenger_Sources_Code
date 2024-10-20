package X;

import com.facebook.rsys.cowatch.gen.CowatchMediaInfoModel;
import java.util.List;

/* loaded from: Irp.class */
public final class Irp implements Runnable {
    public static final String __redex_internal_original_name = "MediaSyncChainingPresenter$onMediaScrolled$2";
    public final /* synthetic */ Gr5 A00;

    public Irp(Gr5 gr5) {
        this.A00 = gr5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Gr5 gr5 = this.A00;
        Object A0r = AbM.A0r(((GS2) gr5).A01);
        11T.A0A(A0r);
        C2641Gjv c2641Gjv = (C2641Gjv) A0r;
        boolean z = c2641Gjv.A07;
        List list = c2641Gjv.A03;
        CowatchMediaInfoModel cowatchMediaInfoModel = c2641Gjv.A00;
        String str = c2641Gjv.A02;
        boolean z2 = c2641Gjv.A04;
        String str2 = c2641Gjv.A01;
        boolean z3 = c2641Gjv.A08;
        boolean z4 = c2641Gjv.A06;
        11T.A0F(list, 1);
        gr5.A0Z(new C2641Gjv(cowatchMediaInfoModel, str, str2, list, z, false, z2, z3, z4));
    }
}
