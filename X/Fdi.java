package X;

import com.facebook.fbservice.service.OperationResult;
import com.google.common.collect.ImmutableList;
import org.apache.http.client.methods.HttpGet;

/* loaded from: Fdi.class */
public final class Fdi implements 1Tu {
    public DKh A00;
    public 1Ey A01;
    public final C2tx A02;

    public Fdi() {
        C2tx c2tx = (C2tx) 1Bi.A03(17131);
        1Ey r0 = (1Ey) 1Bn.A0A(83434);
        DKh dKh = (DKh) 1Bn.A0A(100159);
        this.A02 = c2tx;
        this.A01 = r0;
        this.A00 = dKh;
    }

    public OperationResult BMQ(1TC r302) {
        ImmutableList A00;
        String str = r302.A06;
        if (!1BJ.A00(1470).equals(str)) {
            throw 0Pz.A05("unknown operation type: ", str);
        }
        String string = r302.A00.getString("linkshim_link_extra");
        String str2 = this.A01.Aue().mSessionCookiesString;
        StringBuilder A0k = AnonymousClass001.A0k();
        if (str2 != null && (A00 = this.A00.A00(str2)) != null) {
            1Du it = A00.iterator();
            while (it.hasNext()) {
                1BK.A1R(A0k, it.next());
                A0k.append(";");
            }
        }
        HttpGet httpGet = new HttpGet(string);
        httpGet.addHeader("Cookie", A0k.toString());
        this.A02.A02(AnonymousClass409.A00("linkshim", new G7t(this), httpGet).A00());
        return OperationResult.A00;
    }
}
