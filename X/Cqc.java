package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.contacts.ranking.logging.RankingLoggingItem;
import com.facebook.messaging.search.constants.ClientDataSourceIdentifier;
import com.facebook.messaging.search.constants.DataSourceIdentifier;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;

/* loaded from: Cqc.class */
public final class Cqc implements DIB {
    public final FbUserSession A00;
    public final C00i A02 = AbH.A0U();
    public final C00i A01 = 1BQ.A02(84431);

    public Cqc(FbUserSession fbUserSession) {
        this.A00 = fbUserSession;
    }

    public DataSourceIdentifier AgX() {
        return null;
    }

    public /* bridge */ /* synthetic */ ImmutableList B7q(ByH byH, Object obj) {
        String str = (String) obj;
        if (((1PG) this.A02.get()).A07() || 1JF.A0A(str)) {
            return ImmutableList.of();
        }
        C1597Ame A00 = ((CGm) this.A01.get()).A00(this.A00, str.trim());
        try {
            ImmutableList.Builder builder = ImmutableList.builder();
            while (true) {
                User user = (User) A00.next();
                if (user == null) {
                    ImmutableList build = builder.build();
                    Crj crj = (Crj) 1Bn.A0A(83516);
                    1Bn.A0A(84324);
                    ImmutableList A002 = CAz.A00(crj, build, false);
                    A00.close();
                    return A002;
                }
                builder.m11011add((Object) AcX.A03((RankingLoggingItem) null, ClientDataSourceIdentifier.A0w, 53N.A0Q, user));
            }
        } catch (Throwable th) {
            try {
                A00.close();
                throw th;
            } catch (Throwable th2) {
                7kF.A00(th, th2);
                throw th;
            }
        }
    }

    public String getFriendlyName() {
        return "GroupParticipantsSearchItemDataSource";
    }
}
