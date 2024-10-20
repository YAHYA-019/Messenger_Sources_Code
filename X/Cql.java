package X;

import android.content.Context;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.search.constants.ClientDataSourceIdentifier;
import com.facebook.messaging.search.constants.DataSourceIdentifier;

/* loaded from: Cql.class */
public final class Cql implements DIB, DEk {
    public String A00;
    public final Context A01;
    public final FbUserSession A02;
    public final 53M A03;
    public final boolean A05;
    public final C00i A06;
    public final 6QB A07;
    public final CB5 A08;
    public final C15h A09 = new C00y(DBe.A00(this, ActionId.ABORTED));
    public final C1gb A04 = AbJ.A0Z();

    public Cql(Context context, FbUserSession fbUserSession, 53M r304, boolean z) {
        Long l;
        this.A03 = r304;
        this.A05 = z;
        this.A01 = context;
        this.A02 = fbUserSession;
        this.A07 = (6QB) 1Bn.A0E(context, (1BY) null, 50092);
        this.A08 = (CB5) 1Bn.A0E(context, (1BY) null, 84299);
        this.A06 = 7zL.A0R(context, 84334);
        if ((r304 == 53M.A0Q || r304 == 53M.A0U) && (l = ((AcP) 1Lo.A04(context, fbUserSession, (1BY) null, 84248)).A0G.A02) != null) {
            this.A00 = l.toString();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x0263, code lost:
    
        if (r307 == null) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
    
        if (r313 == (-1)) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x023c, code lost:
    
        if (r307 != null) goto L122;
     */
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.common.collect.ImmutableList B7q(X.ByH r302, java.lang.String r303) {
        /*
            Method dump skipped, instructions count: 643
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cql.B7q(X.ByH, java.lang.String):com.google.common.collect.ImmutableList");
    }

    public DataSourceIdentifier AgX() {
        return ClientDataSourceIdentifier.A0F;
    }

    @Override // X.DEk
    public void CuT(String str) {
        if (1JF.A0C(str, this.A00)) {
            return;
        }
        this.A00 = str;
    }

    public String getFriendlyName() {
        return "LocalAllGroupsSearchItemDataSource";
    }
}
