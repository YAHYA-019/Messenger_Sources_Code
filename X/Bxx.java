package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.user.model.UserKey;
import com.google.common.base.Platform;
import com.google.common.collect.ImmutableList;

/* loaded from: Bxx.class */
public final class Bxx {
    public 2TP A00;
    public final FbUserSession A02;
    public final C0i A03;
    public final Be6 A04;
    public final C1320Ady A05;
    public final ImmutableList A08;
    public final DFd A06 = new Cpp(this, 1);
    public final UserKey A07 = (UserKey) AbG.A14();
    public ImmutableList A01 = ImmutableList.of();

    public Bxx(Context context, FbUserSession fbUserSession, 2TP r304, C0i c0i, Be5 be5, Be6 be6, ImmutableList immutableList, String str) {
        this.A03 = c0i;
        this.A00 = r304;
        this.A02 = fbUserSession;
        AbR A0O = AbF.A0O(context, 638);
        Context A01 = FbInjector.A01();
        AbL.A0y(A0O);
        try {
            C3q c3q = new C3q(A0O, be5);
            1Bn.A0K();
            FbInjector.A04(A01);
            CqP cqP = new CqP(context, this, c3q);
            CqW cqW = new CqW(this);
            CIo cIo = new CIo(cqP, "group_create_list_search");
            cIo.A01(cqW);
            cIo.A09.addAll(ImmutableList.of((Object) new B7p()));
            cIo.A0A.m11011add((Object) this.A06);
            Cf1 cf1 = new Cf1(this, 1Bn.A0E(context, (1BY) null, 84229), 0);
            if (this.A00 != 2TP.A0H || Platform.stringIsNullOrEmpty(str)) {
                ArZ arZ = (ArZ) 1Bn.A0E(context, (1BY) null, 84226);
                FbUserSession fbUserSession2 = this.A02;
                AoJ A00 = arZ.A00(fbUserSession2);
                A00.BOl((DEZ) null);
                A00.CuB(cf1);
                Cpt cpt = new Cpt(A00, new B80(this, BP6.A0B));
                ImmutableList.Builder builder = cIo.A07;
                builder.m11011add((Object) cpt);
                1Bn.A0A(148068);
                AoL aoL = new AoL(context, fbUserSession2);
                aoL.BOl((DEZ) null);
                aoL.CuB(cf1);
                builder.m11011add((Object) new Cpt(aoL, new B80(this, BP6.A0K)));
                1Bn.A0E(context, (1BY) null, 147610);
            } else {
                Cf4 A002 = ((C4y) 1Bn.A0E(context, (1BY) null, 84281)).A00((Ckw) 1Bn.A0E(context, (1BY) null, 83058), Long.parseLong(str));
                A002.BOl(null);
                A002.CuB(cf1);
                cIo.A07.m11011add((Object) new Cpt(A002, new B80(this, BP6.A0A)));
            }
            1Bn.A0A(83179);
            this.A05 = new C1320Ady(context, this.A02, cIo);
            this.A04 = be6;
            this.A08 = immutableList;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }
}
