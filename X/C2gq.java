package X;

import com.facebook.graphql.enums.GraphQLWorkForeignEntityType;
import com.facebook.user.model.User;
import com.facebook.user.model.WorkUserForeignEntityInfo;

/* renamed from: X.2gq, reason: invalid class name */
/* loaded from: 2gq.class */
public final class C2gq {
    public final 1Br A00 = 1Bu.A00(147523);
    public final 1Br A01 = 1Bq.A00(66351);

    public final boolean A00(User user) {
        if (11T.A0O(((1Fv) this.A01.A00.get()).A04().A02, user.A13) || !user.A1g) {
            return false;
        }
        WorkUserForeignEntityInfo workUserForeignEntityInfo = user.A0m;
        if ((workUserForeignEntityInfo != null ? workUserForeignEntityInfo.A00 : null) != GraphQLWorkForeignEntityType.FOREIGN) {
            return false;
        }
        1Br.A0C(this.A00);
        return true;
    }

    public final boolean A01(User user) {
        if (11T.A0O(((1Fv) this.A01.A00.get()).A04().A02, user.A13) || !user.A1g) {
            return false;
        }
        WorkUserForeignEntityInfo workUserForeignEntityInfo = user.A0m;
        if ((workUserForeignEntityInfo != null ? workUserForeignEntityInfo.A00 : null) != GraphQLWorkForeignEntityType.LIMITED) {
            return false;
        }
        1Br.A0C(this.A00);
        return true;
    }
}
