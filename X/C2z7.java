package X;

import android.content.Context;
import com.facebook.graphservice.asset.GraphServiceAsset;
import com.facebook.graphservice.interfaces.TreeSerializer;
import com.facebook.inject.FbInjector;

/* renamed from: X.2z7, reason: invalid class name */
/* loaded from: 2z7.class */
public abstract class C2z7 {
    public static final 1E8 A00() {
        return ((1Ej) 1Bi.A03(16493)).A00(1DU.A03, "GraphServiceParsing");
    }

    public static final 1Wu A01() {
        1GS r0 = (1GS) 1Bi.A03(16504);
        1Bi.A03(16386);
        1Ws r02 = new 1Ws();
        r0.getClass();
        return new 1Wu(r02, new 1Wt(r0));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.1Wj, java.lang.Object] */
    public static final 1Wj A02() {
        GraphServiceAsset.useContext(FbInjector.A00());
        return new Object();
    }

    public static final TreeSerializer A03() {
        1Bn.A0E((Context) null, (1BY) null, 32809);
        return 2tS.A04("fbandroid");
    }
}
