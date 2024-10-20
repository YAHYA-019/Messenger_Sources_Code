package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.search.constants.ClientDataSourceIdentifier;
import com.facebook.messaging.search.constants.DataSourceIdentifier;

/* loaded from: Cqg.class */
public final class Cqg implements DIB {
    public final Context A00;
    public final FbUserSession A01;
    public final C00i A02;
    public final C00i A03;
    public final C00i A04 = 1BQ.A02(17058);
    public final C00i A05 = AbH.A0X();
    public final C00i A06 = 1BQ.A02(17029);
    public final 53M A07;

    public Cqg(Context context, FbUserSession fbUserSession, 53M r304) {
        this.A07 = r304;
        this.A00 = context;
        this.A01 = fbUserSession;
        this.A02 = 7zL.A0R(context, 17055);
        this.A03 = 7zL.A0R(context, 32774);
    }

    public DataSourceIdentifier AgX() {
        this.A03.get();
        return ClientDataSourceIdentifier.A0j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v101, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [X.2xP] */
    /* JADX WARN: Type inference failed for: r0v62, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v64, types: [java.lang.Throwable, boolean] */
    /* JADX WARN: Type inference failed for: r0v95 */
    /* JADX WARN: Type inference failed for: r0v96 */
    /* JADX WARN: Type inference failed for: r0v99 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ com.google.common.collect.ImmutableList B7q(X.ByH r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cqg.B7q(X.ByH, java.lang.Object):com.google.common.collect.ImmutableList");
    }

    public String getFriendlyName() {
        return "ContactsSearchItemDataSource";
    }
}
