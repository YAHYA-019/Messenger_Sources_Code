package X;

import com.facebook.messaging.communitymessaging.model.Community;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxNullable;
import java.util.HashSet;

/* loaded from: Cxc.class */
public final class Cxc implements MailboxCallback {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ DEu A02;

    public Cxc(DEu dEu, long j, long j2) {
        this.A02 = dEu;
        this.A00 = j;
        this.A01 = j2;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        1qX A14 = 7zM.A14((MailboxNullable) obj);
        Community community = null;
        if (A14 != null) {
            long j = this.A00;
            long j2 = this.A01;
            if (1qX.A00(A14) > 0) {
                long A07 = 7zM.A07(A14);
                long A0E = 7zQ.A0E(A14, 0);
                if (A07 == j && (j2 == 0 || A0E == j2)) {
                    HashSet A0v = AnonymousClass001.A0v();
                    String valueOf = String.valueOf(A07);
                    AbF.A1T(valueOf);
                    String valueOf2 = String.valueOf(A0E);
                    C1pq.A08("groupId", valueOf2);
                    String A0j = 7zP.A0j(A14, 0);
                    AbF.A1U(A0j);
                    community = new Community(null, null, null, null, null, null, null, null, null, null, null, null, null, null, "", null, valueOf2, valueOf, null, A0j, "", null, A0v, 0, 0, 0, 0, 0, A14.mResultSet.getInteger(0, 30), 0, 0, 0, 0, 0, 0, 0, 0L, 0L, -1, 0L, 0L, AbK.A10(A14.mResultSet, 14).booleanValue(), false);
                }
            }
        }
        this.A02.CHT(community);
    }
}
