package X;

import com.facebook.messaging.msys.common.bootstrap.MsysTransportBootstrapJNI;
import com.facebook.msys.mci.Database;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;
import com.facebook.user.model.User;

/* renamed from: X.1uq, reason: invalid class name */
/* loaded from: 1uq.class */
public final class C1uq extends Database.InitializedCallback {
    public final /* synthetic */ C1uo A00;
    public final /* synthetic */ User A01;

    public C1uq(C1uo c1uo, User user) {
        this.A00 = c1uo;
        this.A01 = user;
    }

    @Override // com.facebook.msys.mci.Database.InitializedCallback
    public void onInit(SqliteHolder sqliteHolder) {
        User user = this.A01;
        java.util.Map onInit = MsysTransportBootstrapJNI.onInit(sqliteHolder, true, Long.valueOf(Long.parseLong(user.A13)), user.A0X.A00());
        C1ux c1ux = (C1ux) this.A00.A02.get();
        11T.A0F(onInit, 0);
        java.util.Map map = c1ux.A00;
        map.clear();
        map.putAll(onInit);
        String A0W = 0Pz.A0W("act bootstrapped and AdvancedCrypto PK set to ", onInit.get("AdvancedCrypto") == null ? "null" : "not null");
        11T.A0F(A0W, 0);
        C1up.A00 = A0W;
    }
}
