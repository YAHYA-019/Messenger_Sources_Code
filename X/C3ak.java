package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.presence.model.PresenceItem;
import com.facebook.presence.model.PresenceList;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.3ak, reason: invalid class name */
/* loaded from: 3ak.class */
public final class C3ak implements MailboxCallback {
    public final int A00;
    public final Object A01;

    public C3ak(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        switch (this.A00) {
            case 0:
                final MailboxNullable mailboxNullable = (MailboxNullable) obj;
                11T.A0F(mailboxNullable, 0);
                final 21U r0 = (21U) this.A01;
                if (!2yD.A03(21T.A00((21T) 1Br.A0B(r0.A06)), 36315297108992707L)) {
                    21U.A01(r0, mailboxNullable);
                    return;
                }
                1QB r02 = (1QB) 1De.A00(r0.A00, 65841);
                r02.A01 = new Runnable() { // from class: X.3gy
                    public static final String __redex_internal_original_name = "MsysCallAdminMessagesHandler$checkForNewCallEvents$1$onCompletion$task$1";

                    @Override // java.lang.Runnable
                    public final void run() {
                        21U.A01(r0, mailboxNullable);
                    }
                };
                r02.A04("HandleNewRtcCallEvents");
                ((1Qc) 1Br.A0B(r0.A01)).A03(1QB.A00(r02, "ForUiThread"), "None");
                return;
            case 1:
            case 2:
            default:
                if (AnonymousClass001.A1V(obj)) {
                    return;
                }
                0fH.A0k("MsysCallAdminMessagesHandler", "Failed to batch write call event admin message");
                return;
            case 3:
                MailboxNullable mailboxNullable2 = (MailboxNullable) obj;
                11T.A0F(mailboxNullable2, 0);
                1qX r03 = (1qX) mailboxNullable2.value;
                if (r03 != null) {
                    C21f c21f = (C21f) this.A01;
                    LinkedHashMap A1C = 1BK.A1C();
                    ArrayList A0s = AnonymousClass001.A0s();
                    int A00 = 1qX.A00(r03);
                    for (int i = 0; i < A00; i++) {
                        1BK.A1P(1BK.A0m(r03.mResultSet, i, 0), A1C, r03.mResultSet.getInteger(i, 1));
                        Number A0o = 1BK.A0o(1BK.A0m(r03.mResultSet, i, 0), c21f.A00);
                        int integer = r03.mResultSet.getInteger(i, 1);
                        if (A0o == null || A0o.intValue() != integer) {
                            UserKey userKey = new UserKey(1Js.A03, String.valueOf(r03.mResultSet.getLong(i, 0)));
                            boolean A1Q = AnonymousClass001.A1Q(r03.mResultSet.getInteger(i, 1), 2);
                            Long nullableLong = r03.mResultSet.getNullableLong(i, 2);
                            A0s.add(new PresenceItem(userKey, r03.mResultSet.getNullableLong(i, 4), null, null, 8, nullableLong != null ? nullableLong.longValue() / 1000 : -1, A1Q));
                        }
                    }
                    Iterator A1B = 1BK.A1B(c21f.A00);
                    while (A1B.hasNext()) {
                        long A05 = AnonymousClass001.A05(A1B.next());
                        if (!A1C.containsKey(Long.valueOf(A05))) {
                            A0s.add(new PresenceItem(new UserKey(1Js.A03, String.valueOf(A05)), null, null, null, 8, -1, false));
                        }
                    }
                    c21f.A00 = A1C;
                    if (!A0s.isEmpty()) {
                        ((C01523rg) 1Br.A0B(c21f.A03)).A01(new PresenceList(ImmutableList.copyOf((Collection) A0s)), "/t_m", null, false);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                C30d c30d = (C30d) this.A01;
                AnonymousClass207 anonymousClass207 = C30d.A0F;
                ((Mailbox) obj).removeStoredProcedureChangedListener(c30d.A06);
                return;
            case 5:
                C30d c30d2 = (C30d) this.A01;
                AnonymousClass207 anonymousClass2072 = C30d.A0F;
                ((Mailbox) obj).addStoredProcedureChangedListener(c30d2.A06);
                return;
        }
    }
}
