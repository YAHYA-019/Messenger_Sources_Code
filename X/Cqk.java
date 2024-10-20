package X;

import android.content.Context;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.search.constants.ClientDataSourceIdentifier;
import com.facebook.messaging.search.constants.DataSourceIdentifier;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;

/* loaded from: Cqk.class */
public final class Cqk implements DIB {
    public static final Function A0D = new D3I(27);
    public final Context A02;
    public final FbUserSession A03;
    public final C00i A04;
    public final C00i A05;
    public final C00i A0B;
    public final ClientDataSourceIdentifier A06 = ClientDataSourceIdentifier.A0t;
    public final 53M A07 = 53M.A0Q;
    public final C1325Ae3 A0C = new C1325Ae3();
    public ImmutableList A01 = ImmutableList.of();
    public ImmutableList A00 = ImmutableList.of();
    public final C15h A0A = new C00y(DBe.A00(this, 108));
    public final C15h A09 = new C00y(DBe.A00(this, ActionId.RTMP_CONNECTION_REQUESTED));
    public final Function A08 = D3J.A01(this, 46);

    public Cqk(Context context, FbUserSession fbUserSession) {
        this.A05 = 7zL.A0R(context, 84349);
        this.A0B = 7zL.A0R(context, 16454);
        this.A04 = 7zL.A0R(context, 84327);
        this.A03 = fbUserSession;
        this.A02 = context;
    }

    public DataSourceIdentifier AgX() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:316:0x021b, code lost:
    
        if (r313 == null) goto L104;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableList B7q(X.ByH r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 1534
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cqk.B7q(X.ByH, java.lang.Object):com.google.common.collect.ImmutableList");
    }

    public String getFriendlyName() {
        return "MqttDataSource";
    }

    public String toString() {
        return "MqttDataSource";
    }
}
