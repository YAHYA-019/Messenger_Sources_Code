package X;

import com.facebook.messaging.badging.logging.ThreadReadStats;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxNullable;
import java.util.List;

/* renamed from: X.3al, reason: invalid class name */
/* loaded from: 3al.class */
public final class C3al implements MailboxCallback {
    public final /* synthetic */ long A00;
    public final /* synthetic */ 5JE A01;
    public final /* synthetic */ String A02;

    public C3al(5JE r302, String str, long j) {
        this.A01 = r302;
        this.A02 = str;
        this.A00 = j;
    }

    /* JADX WARN: Type inference failed for: r0v96, types: [java.lang.Object, com.facebook.messaging.badging.logging.ThreadReadStats] */
    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxNullable mailboxNullable = (MailboxNullable) obj;
        11T.A0F(mailboxNullable, 0);
        5JE r0 = this.A01;
        long A00 = 1Br.A00(r0.A07);
        String str = this.A02;
        if (11T.A0O(str, "com.facebook.common.appstate.AppStateManager.USER_ENTERED_APP")) {
            ((1SG) 1Br.A0B(r0.A0D)).A0K("app_badge_calculation_end");
        }
        1qX r02 = (1qX) mailboxNullable.value;
        int integer = r02 != null ? r02.mResultSet.getInteger(0, 4) : 0;
        if (integer < 0) {
            0fH.A0j("UnreadInboxItemsCalculator", "[badge] Unified badge API returned negative value, set it to 0 for logging");
            integer = 0;
        }
        1qX r03 = (1qX) mailboxNullable.value;
        int integer2 = r03 != null ? r03.mResultSet.getInteger(0, 0) : 0;
        1qX r04 = (1qX) mailboxNullable.value;
        int integer3 = r04 != null ? r04.mResultSet.getInteger(0, 1) : 0;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("[badge] Retrieved unread count from CQL in ");
        A0k.append(A00 - this.A00);
        A0k.append(" ms -\n               trigger: ");
        String str2 = null;
        A0k.append(str != null ? 0CU.A0D(str, str) : null);
        A0k.append("\n               total: ");
        A0k.append(integer);
        A0k.append(", open: ");
        A0k.append(integer2);
        0fH.A0j("UnreadInboxItemsCalculator", AnonymousClass001.A0e(", e2ee: ", A0k, integer2));
        C2sz c2sz = (C2sz) 1Lm.A07(r0.A02, r0.A03.A00, 66546);
        synchronized (c2sz) {
            c2sz.A00 = integer;
        }
        5JE.A00(r0, 1BK.A0l(integer), str, (List) null);
        StringBuilder A0k2 = AnonymousClass001.A0k();
        A0k2.append("[badge] Broadcasting badge count -\n               trigger: ");
        if (str != null) {
            str2 = 0CU.A0D(str, str);
        }
        A0k2.append(str2);
        1BL.A1L("\n               total: ", ", open: ", A0k2, integer, integer2);
        0fH.A0j("UnreadInboxItemsCalculator", AnonymousClass001.A0e(", e2ee: ", A0k2, integer2));
        ((1Uv) 1Br.A0B(r0.A0B)).A0E((ThreadReadStats) new Object(), str, integer, integer, integer2, integer3, 0);
    }
}
