package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.contacts.ranking.logging.RankingLoggingItem;
import com.facebook.messaging.search.constants.ClientDataSourceIdentifier;
import com.facebook.messaging.search.constants.DataSourceIdentifier;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.ExecutionException;

/* loaded from: Cpw.class */
public final class Cpw implements DIW {
    public 5O6 A00;
    public Long A01;
    public final Context A02;
    public final FbUserSession A03;
    public final 1Br A04;
    public final 1Br A05 = AbG.A0S();
    public final 53M A06;

    public Cpw(Context context, FbUserSession fbUserSession, 53M r304) {
        this.A02 = context;
        this.A03 = fbUserSession;
        this.A06 = r304;
        this.A04 = 1Bu.A01(context, 84334);
        if (r304 == 53M.A0Q) {
            this.A01 = AcP.A03(context, fbUserSession);
        }
    }

    public final ImmutableList A00() {
        String str;
        ImmutableList.Builder A0h = 4YU.A0h();
        FbUserSession fbUserSession = this.A03;
        Context context = this.A02;
        C1333AeN A00 = ((C6p) 1Lm.A05(context, fbUserSession, 84346)).A00(null, "DiscoverPeopleDataSource");
        ImmutableList immutableList = A00 != null ? A00.A01 : null;
        if (immutableList == null || immutableList.isEmpty()) {
            try {
                SettableFuture A0j = 4YU.A0j();
                C00683ob c00683ob = (C00683ob) 1Lm.A05(context, fbUserSession, 67629);
                c00683ob.A05(Czg.A00(A0j, this, c00683ob, 26), null, ImmutableList.of((Object) 2), 27);
                1qX r0 = (1qX) A0j.get();
                if (r0 != null) {
                    int A002 = 1qX.A00(r0);
                    for (int i = 0; i < A002; i++) {
                        if (7zP.A02(r0, i) != 15) {
                            1Kh A0y = AbF.A0y();
                            A0y.A05(r0.mResultSet.getString(i, 0));
                            AbH.A1U(A0y, 4YU.A11(r0, i, 2));
                            A0y.A1R = 7zU.A0o(r0, i);
                            A0y.A13 = 7zP.A0k(r0, i);
                            A0h.m11011add((Object) AcX.A03((RankingLoggingItem) null, ClientDataSourceIdentifier.A0R, 53N.A0B, AbF.A0w(A0y)));
                        }
                    }
                }
            } catch (InterruptedException e) {
                e = e;
                str = "InterruptedException while loading discover people info from msys";
                0fH.A0s("DiscoverPeopleDataSource", str, e);
                immutableList = A0h.build();
                11T.A0D(immutableList);
                return immutableList;
            } catch (ExecutionException e2) {
                e = e2;
                str = "ExecutionException while loading discover people info from msys";
                0fH.A0s("DiscoverPeopleDataSource", str, e);
                immutableList = A0h.build();
                11T.A0D(immutableList);
                return immutableList;
            }
            immutableList = A0h.build();
            11T.A0D(immutableList);
        }
        return immutableList;
    }

    public void A5L(DFe dFe) {
    }

    public DataSourceIdentifier AgX() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0096, code lost:
    
        if (r311 == null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ X.C1323Ae1 Cpm(X.ByH r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cpw.Cpm(X.ByH, java.lang.Object):X.Ae1");
    }

    public String getFriendlyName() {
        return "DiscoverPeopleDataSource";
    }
}
