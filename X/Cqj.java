package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.search.constants.ClientDataSourceIdentifier;
import com.facebook.messaging.search.constants.DataSourceIdentifier;
import com.google.common.collect.ImmutableList;
import java.util.Comparator;

/* loaded from: Cqj.class */
public final class Cqj implements DIB {
    public static final Comparator A06 = new DAi(RrW.A00);
    public 1BY A00;
    public final FbUserSession A01;
    public final C15h A05 = new C00y(DBe.A00(this, ActionId.QUERY_READY));
    public final C1gb A02 = AbJ.A0Z();
    public final 6QB A03 = (6QB) 1Bn.A0B(50092);
    public final CB5 A04 = (CB5) 1Bn.A0B(84299);

    public Cqj(1BO r302, FbUserSession fbUserSession) {
        this.A00 = 7zL.A0Q(r302);
        this.A01 = fbUserSession;
    }

    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public ImmutableList B7q(ByH byH, String str) {
        if (1JF.A0B(str)) {
            return ImmutableList.of();
        }
        2To r0 = 2To.A09;
        ImmutableList B7q = ((Cq7) this.A05.get()).B7q(byH, str);
        return CB5.A00(6QB.A00(this.A01, B4d.A00, this.A03, r0, A06, B7q).A00, 2yD.A00(C1gb.A02(this.A02), 36594053370152787L));
    }

    public DataSourceIdentifier AgX() {
        return ClientDataSourceIdentifier.A0G;
    }

    public String getFriendlyName() {
        return "LocalAllNonContactsSearchItemDataSource";
    }
}
