package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.search.constants.ClientDataSourceIdentifier;
import com.google.common.collect.ImmutableList;
import java.util.LinkedHashMap;

/* loaded from: C4p.class */
public final class C4p {
    public final C00i A02 = 1BV.A00(83179);
    public final C00i A03 = AbH.A0X();
    public final C00i A00 = 1BV.A00(84388);
    public final C00i A01 = 1BV.A00(84379);

    public Chm A00(Context context, FbUserSession fbUserSession, DHz dHz, 53M r305, DFd dFd, ImmutableList immutableList) {
        LinkedHashMap A1C = 1BK.A1C();
        C91 A02 = ((CN4) 1Bn.A0E(context, (1BY) null, 83171)).A02(r305);
        C4B c4b = (C4B) 1Bi.A03(84289);
        new B81(ClientDataSourceIdentifier.A0p);
        A1C.putAll(c4b.A00(fbUserSession, r305, A02));
        CIo cIo = new CIo(new C1318Adw(), "universal_search");
        cIo.A03(immutableList);
        C00i c00i = this.A03;
        cIo.A00 = 2yD.A00(C1gb.A01(c00i), 36602797924751236L);
        B7u b7u = B7u.A02;
        ImmutableList.Builder builder = cIo.A09;
        builder.m11011add((Object) b7u);
        builder.m11011add((Object) new CqD(2yD.A00(C1gb.A01(c00i), 36594053369890639L)));
        cIo.A0A.m11011add((Object) dFd);
        CIo.A00(cIo, A1C);
        if (context != null) {
            Cq8 cq8 = (Cq8) 1Hv.A02(context, 84253);
            cq8.A01 = fbUserSession;
            builder.m11011add((Object) cq8);
            this.A00.get();
            builder.m11011add((Object) new CqH(context, fbUserSession, C1gb.A01(c00i).AZk(36318088836755529L)));
        }
        this.A01.get();
        AeH aeH = new AeH(fbUserSession, 53M.A0Q);
        C4A c4a = (C4A) 1Bi.A03(84256);
        AbR abR = c4a.A00;
        Context A01 = FbInjector.A01();
        AbL.A0y(abR);
        try {
            C1322Ae0 c1322Ae0 = new C1322Ae0(dHz, aeH, A1C);
            1Bn.A0K();
            FbInjector.A04(A01);
            ImmutableList.Builder builder2 = cIo.A08;
            builder2.m11011add((Object) c1322Ae0);
            AbR abR2 = c4a.A01;
            A01 = FbInjector.A01();
            AbL.A0y(abR2);
            C1319Adx c1319Adx = new C1319Adx(A1C);
            1Bn.A0K();
            FbInjector.A04(A01);
            builder2.m11011add((Object) c1319Adx);
            this.A02.get();
            return new Chm(aeH, new C1320Ady(context, fbUserSession, cIo), A1C.keySet());
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }
}
