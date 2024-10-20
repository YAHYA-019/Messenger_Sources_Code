package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.threaddelete.plugins.threadsettingsrow.deleteconversation.ThreadSettingsDeleteConversationRow;
import com.facebook.messaging.wellbeing.reportingenforcement.plugins.frx.threadsettingsrow.ThreadSettingsFeedbackAndReportingRow;
import com.facebook.messaging.wellbeing.selfremediation.plugins.block.threadsettingsrow.blockuser.ThreadSettingsBlockUserRow;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Ce9.class */
public final class Ce9 implements DIM {
    public C60b A01;
    public C1v5 A02;
    public ThreadSettingsFeedbackAndReportingRow A03;
    public ThreadSettingsBlockUserRow A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public boolean A08;
    public String[] A09;
    public final Context A0A;
    public final 06Z A0B;
    public final FbUserSession A0C;
    public final ThreadKey A0D;
    public final ThreadSummary A0E;
    public final DJX A0G;
    public final DHb A0H;
    public final DHc A0I;
    public final DHd A0J;
    public final MigColorScheme A0K;
    public final User A0L;
    public final Capabilities A0M;
    public final 2Sh A0N;
    public final C1783AsH A0O;
    public final ImmutableList A0P;
    public int A00 = -1;
    public final 1YC A0F = 1YC.A03;

    public Ce9(Context context, 06Z r303, FbUserSession fbUserSession, ThreadKey threadKey, ThreadSummary threadSummary, DJX djx, DHb dHb, DHc dHc, DHd dHd, MigColorScheme migColorScheme, User user, Capabilities capabilities, 2Sh r314, C1783AsH c1783AsH, ImmutableList immutableList) {
        this.A0A = context;
        this.A0C = fbUserSession;
        this.A0D = threadKey;
        this.A0M = capabilities;
        this.A0E = threadSummary;
        this.A0N = r314;
        this.A0O = c1783AsH;
        this.A0B = r303;
        this.A0L = user;
        this.A0P = immutableList;
        this.A0I = dHc;
        this.A0H = dHb;
        this.A0J = dHd;
        this.A0G = djx;
        this.A0K = migColorScheme;
    }

    private void A00() {
        synchronized (this) {
            if (!this.A08) {
                if (this.A0A == null) {
                    throw AbG.A13();
                }
                this.A02 = C1v5.A01;
                this.A08 = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0097 A[Catch: Exception -> 0x00da, all -> 0x00e6, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00da, blocks: (B:5:0x003f, B:9:0x0049, B:12:0x0053, B:15:0x0090, B:17:0x00d3, B:20:0x0097, B:21:0x009c, B:24:0x00a5, B:26:0x00b2, B:27:0x00b8, B:29:0x00be, B:31:0x00c3, B:34:0x00ce, B:35:0x005c, B:36:0x0061, B:39:0x006d, B:42:0x0075, B:44:0x0081), top: B:4:0x003f, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A01() {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ce9.A01():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0069 A[Catch: Exception -> 0x00c1, all -> 0x00cf, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00c1, blocks: (B:5:0x003f, B:9:0x0049, B:12:0x0053, B:15:0x0069, B:16:0x006f, B:17:0x0075, B:18:0x007b, B:19:0x0080, B:21:0x008c, B:24:0x0097, B:25:0x009c, B:27:0x00a4, B:28:0x00aa, B:29:0x00ae, B:29:0x00ae, B:32:0x00ba, B:35:0x00b5, B:37:0x005e), top: B:4:0x003f, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A02() {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ce9.A02():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0069 A[Catch: Exception -> 0x00af, all -> 0x00bd, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00af, blocks: (B:5:0x003f, B:9:0x0049, B:12:0x0053, B:15:0x0069, B:16:0x006e, B:17:0x0074, B:19:0x007c, B:22:0x0087, B:23:0x008c, B:25:0x0092, B:26:0x0098, B:27:0x009c, B:27:0x009c, B:30:0x00a8, B:33:0x00a3, B:35:0x005e), top: B:4:0x003f, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A03() {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ce9.A03():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v37, types: [int] */
    /* JADX WARN: Type inference failed for: r0v39, types: [int] */
    /* JADX WARN: Type inference failed for: r303v1 */
    /* JADX WARN: Type inference failed for: r303v12 */
    /* JADX WARN: Type inference failed for: r303v13 */
    public String[] Ayr() {
        String[] strArr = this.A09;
        if (strArr == null) {
            int i = this.A00;
            int i2 = i;
            if (i == -1) {
                boolean A03 = A03();
                boolean z = A03;
                if (A02()) {
                    z = (A03 ? 1 : 0) + 1;
                }
                boolean z2 = z;
                if (A01()) {
                    z2 = (z ? 1 : 0) + 1;
                }
                this.A00 = z2 ? 1 : 0;
                i2 = z2;
            }
            int i3 = 0;
            strArr = new String[i2];
            if (A03()) {
                strArr[0] = "block_row";
                i3 = 1;
            }
            int A02 = AbJ.A02(strArr, A02() ? 1 : 0, i3);
            if (A01()) {
                strArr[A02] = "delete_conversation_row";
            }
            this.A09 = strArr;
        }
        return strArr;
    }

    public DG9 B8K(String str) {
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = this.A0F;
        String A18 = AbF.A18(r0, andIncrement);
        Exception e = null;
        try {
            A00();
            Cug cug = null;
            if (str.equals("delete_conversation_row") && A01()) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.threaddelete.plugins.threadsettingsrow.deleteconversation.ThreadSettingsDeleteConversationRow", "messaging.threaddelete.threadsettingsrow.deleteconversation.ThreadSettingsDeleteConversationRow", "com.facebook.messaging.threadsettings.plugins.interfaces.row.RowInterfaceSpec", andIncrement2, "messaging.threadsettings.row.RowInterfaceSpec", "com.facebook.messaging.threaddelete.plugins.threadsettingsrow.ThreaddeleteThreadsettingsrowKillSwitch", A18);
                try {
                    try {
                        cug = ThreadSettingsDeleteConversationRow.A00(this.A0A, this.A0B, this.A0C, this.A0E, this.A0I);
                        r0.A09("messaging.threaddelete.threadsettingsrow.deleteconversation.ThreadSettingsDeleteConversationRow", "messaging.threadsettings.row.RowInterfaceSpec", A18, andIncrement2);
                    } catch (Exception e2) {
                        e = e2;
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04(e, "messaging.threaddelete.threadsettingsrow.deleteconversation.ThreadSettingsDeleteConversationRow", "messaging.threadsettings.row.RowInterfaceSpec", A18, andIncrement2);
                    throw th;
                }
            }
            r0.A02((Exception) null, "messaging.threadsettings.row.RowInterfaceSpec", A18, andIncrement);
            return cug;
        } catch (Throwable th2) {
            r0.A02(e, "messaging.threadsettings.row.RowInterfaceSpec", A18, andIncrement);
            throw th2;
        }
    }

    public ImmutableList B8Q(String str) {
        int A00 = 1BK.A00();
        1YC r0 = this.A0F;
        r0.A08("com.facebook.messaging.threadsettings.plugins.interfaces.row.RowInterfaceSpec", "messaging.threadsettings.row.RowInterfaceSpec", "getRows", A00);
        try {
            A00();
            r0.A02((Exception) null, "messaging.threadsettings.row.RowInterfaceSpec", "getRows", A00);
            return null;
        } catch (Throwable th) {
            r0.A06("messaging.threadsettings.row.RowInterfaceSpec", "getRows", A00);
            throw th;
        }
    }

    public AtG BLB(String str) {
        int andIncrement;
        String A1B;
        AtG A01;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement2 = atomicInteger.getAndIncrement();
        1YC r0 = this.A0F;
        String A19 = AbF.A19(r0, andIncrement2);
        Exception e = null;
        try {
            A00();
            try {
                try {
                    if (str.equals("block_row") && A03()) {
                        andIncrement = atomicInteger.getAndIncrement();
                        A1B = AbJ.A13(r0, A19, andIncrement);
                        A01 = this.A04.A00();
                    } else {
                        if (!str.equals("feedback_and_report_row") || !A02()) {
                            r0.A02((Exception) null, "messaging.threadsettings.row.RowInterfaceSpec", A19, andIncrement2);
                            return null;
                        }
                        andIncrement = atomicInteger.getAndIncrement();
                        A1B = AbI.A1B(r0, A19, andIncrement);
                        A01 = this.A03.A01();
                    }
                    r0.A09(A1B, "messaging.threadsettings.row.RowInterfaceSpec", A19, andIncrement);
                    r0.A02((Exception) null, "messaging.threadsettings.row.RowInterfaceSpec", A19, andIncrement2);
                    return A01;
                } catch (Exception e2) {
                    e = e2;
                    throw e;
                }
            } catch (Throwable th) {
                r0.A04(e, A1B, "messaging.threadsettings.row.RowInterfaceSpec", A19, andIncrement);
                throw th;
            }
        } catch (Throwable th2) {
            r0.A02(e, "messaging.threadsettings.row.RowInterfaceSpec", A19, andIncrement2);
            throw th2;
        }
    }
}
