package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mci.CQLResultSet;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;
import com.facebook.search.mca.MailboxSearchJNI;
import com.facebook.threadactionsystemlist.mca.MailboxThreadActionSystemListJNI;

/* renamed from: X.4W1, reason: invalid class name */
/* loaded from: 4W1.class */
public final class C4W1 implements MailboxFeature.DbConnectionResolutionCallback {
    public final int A00;
    public final Object A01;

    public C4W1(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // com.facebook.msys.mca.MailboxFeature.DbConnectionResolutionCallback
    public /* bridge */ /* synthetic */ Object run(Mailbox mailbox, SqliteHolder sqliteHolder) {
        1qX r305;
        if (this.A00 != 0) {
            CQLResultSet cQLResultSet = (CQLResultSet) MailboxThreadActionSystemListJNI.dispatchCqlOOO(0, ((C3u5) this.A01).A02, sqliteHolder);
            if (cQLResultSet != null) {
                r305 = new 1qX(cQLResultSet);
            }
            r305 = null;
        } else {
            C03323xp c03323xp = (C03323xp) this.A01;
            CQLResultSet cQLResultSet2 = (CQLResultSet) MailboxSearchJNI.dispatchCqlOJOO(10, c03323xp.A00, c03323xp.A04, sqliteHolder);
            if (cQLResultSet2 != null) {
                r305 = new 1qX(cQLResultSet2);
            }
            r305 = null;
        }
        return new MailboxNullable(r305);
    }
}
