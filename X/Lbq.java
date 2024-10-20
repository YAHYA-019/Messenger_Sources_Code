package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: Lbq.class */
public final /* synthetic */ class Lbq implements C6aq {
    public final /* synthetic */ 6Yl A00;
    public final /* synthetic */ 6Yl A01;
    public final /* synthetic */ IOException A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public /* synthetic */ Lbq(6Yl r302, 6Yl r303, IOException iOException, String str, String str2) {
        this.A00 = r302;
        this.A01 = r303;
        this.A03 = str;
        this.A04 = str2;
        this.A02 = iOException;
    }

    @Override // X.C6aq
    public final void accept(Object obj) {
        6Yl r0 = this.A00;
        6Yl r02 = this.A01;
        String str = this.A03;
        String str2 = this.A04;
        IOException iOException = this.A02;
        6Uz A00 = 6Vp.A00(r0);
        6Uz A002 = 6Vp.A00(r02);
        6VL r03 = ((6Vp) obj).A09;
        5MB AgM = r03.A1E.A09.AgM();
        ArrayList A03 = AgM != null ? AgM.A03() : AnonymousClass001.A0s();
        7uY A0P = r03.A0P(HCJ.A0D, 6ZU.A00(iOException, 2000));
        r03.A0z.CRQ(A00, A002, str, str2, A0P.A01.value, A0P.A00.name(), A0P.A02, A0P.A03, A03);
    }
}
