package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.search.constants.ClientDataSourceIdentifier;
import com.facebook.messaging.search.constants.DataSourceIdentifier;

/* loaded from: Cqi.class */
public final class Cqi implements DIB {
    public 53M A00;
    public Long A01;
    public final C00i A02;
    public final C00i A03;
    public final C00i A04;
    public final C00i A05;
    public final C00i A06 = AbH.A0X();
    public final C00i A07;
    public final C00i A08;
    public final AeS A09;
    public final C9C A0A;
    public final Context A0B;
    public final FbUserSession A0C;

    public Cqi(Context context, FbUserSession fbUserSession) {
        1Bn.A0E(context, (1BY) null, 84385);
        this.A0A = new C9C(context, fbUserSession);
        AcP acP = (AcP) 1Lo.A04(context, fbUserSession, (1BY) null, 84248);
        this.A07 = 7zL.A0R(context, 16677);
        this.A08 = 1Lo.A00(context, fbUserSession, 84328);
        this.A02 = 7zL.A0R(context, 66484);
        this.A03 = 7zL.A0R(context, 84480);
        this.A05 = 7zL.A0R(context, 82526);
        this.A04 = 7zL.A0R(context, 84334);
        AeS aeS = (AeS) 7zL.A0R(context, 84209).get();
        aeS.A01(context, fbUserSession);
        this.A09 = aeS;
        this.A01 = acP.A0G.A02;
        this.A0B = context;
        this.A0C = fbUserSession;
    }

    public DataSourceIdentifier AgX() {
        return AbF.A0n(this.A06).A0I() ? ClientDataSourceIdentifier.A02 : ClientDataSourceIdentifier.A0x;
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0599, code lost:
    
        if (r314 != null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0047, code lost:
    
        if (r0 != 29) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0053, code lost:
    
        if (r302 != null) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableList B7q(X.ByH r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 1439
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cqi.B7q(X.ByH, java.lang.Object):com.google.common.collect.ImmutableList");
    }

    public String getFriendlyName() {
        return "TincanSearchItemDataSource";
    }
}
