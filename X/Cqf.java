package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.search.constants.ClientDataSourceIdentifier;
import com.facebook.messaging.search.constants.DataSourceIdentifier;
import com.google.common.collect.ImmutableList;
import java.util.Comparator;

/* loaded from: Cqf.class */
public final class Cqf implements DIB {
    public 1BY A00;
    public final C15h A03 = new C00y(DBe.A00(this, ActionId.RTMP_PACKET_RECEIVED));
    public final C1gb A02 = AbJ.A0Z();
    public final 6QB A01 = (6QB) 1Bn.A0B(50092);
    public final CB5 A04 = (CB5) 1Bn.A0B(84299);

    public Cqf(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public DataSourceIdentifier AgX() {
        return ClientDataSourceIdentifier.A0H;
    }

    public /* bridge */ /* synthetic */ ImmutableList B7q(ByH byH, Object obj) {
        String str = (String) obj;
        if (1JF.A0B(str)) {
            return ImmutableList.of();
        }
        ImmutableList B7q = ((Cq7) this.A03.get()).B7q(byH, str);
        return CB5.A00(6QB.A00(1Fw.A05(this.A00), B4d.A00, this.A01, 2To.A0M, (Comparator) null, B7q).A00, 2yD.A00(C1gb.A02(this.A02), 36594053370218324L));
    }

    public String getFriendlyName() {
        return "LocalAllPagesSearchItemDataSource";
    }
}
