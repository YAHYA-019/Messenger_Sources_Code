package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.wellbeing.reportingenforcement.plugins.frx.threadsettingsrow.ThreadSettingsFeedbackAndReportingRow;
import com.facebook.messaging.wellbeing.selfremediation.ignore.plugins.core.threadsettingsrow.IgnoreMessagesThreadSettingsRow;
import com.facebook.messaging.wellbeing.selfremediation.plugins.block.threadsettingsrow.blockuser.ThreadSettingsBlockUserRow;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Ce1.class */
public final class Ce1 implements DIM {
    public ThreadSettingsFeedbackAndReportingRow A01;
    public IgnoreMessagesThreadSettingsRow A02;
    public ThreadSettingsBlockUserRow A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public String[] A07;
    public final Context A08;
    public final 06Z A09;
    public final FbUserSession A0A;
    public final ThreadKey A0B;
    public final ThreadSummary A0C;
    public final DJX A0E;
    public final DHb A0F;
    public final DHc A0G;
    public final DHd A0H;
    public final MigColorScheme A0I;
    public final User A0J;
    public final Capabilities A0K;
    public final 2Sh A0L;
    public final C1783AsH A0M;
    public final ImmutableList A0N;
    public int A00 = -1;
    public final 1YC A0D = 1YC.A03;

    public Ce1(Context context, 06Z r303, FbUserSession fbUserSession, ThreadKey threadKey, ThreadSummary threadSummary, DJX djx, DHb dHb, DHc dHc, DHd dHd, MigColorScheme migColorScheme, User user, Capabilities capabilities, 2Sh r314, C1783AsH c1783AsH, ImmutableList immutableList) {
        this.A08 = context;
        this.A0A = fbUserSession;
        this.A0B = threadKey;
        this.A0K = capabilities;
        this.A0C = threadSummary;
        this.A0L = r314;
        this.A0M = c1783AsH;
        this.A09 = r303;
        this.A0J = user;
        this.A0N = immutableList;
        this.A0G = dHc;
        this.A0F = dHb;
        this.A0H = dHd;
        this.A0E = djx;
        this.A0I = migColorScheme;
    }

    private boolean A00() {
        Object obj;
        if (this.A04 == null) {
            AtomicInteger atomicInteger = C1Y6.A04;
            int andIncrement = atomicInteger.getAndIncrement();
            1YC r0 = this.A0D;
            r0.A0B("com.facebook.messaging.wellbeing.reportingenforcement.plugins.frx.threadsettingsrow.ThreadSettingsFeedbackAndReportingRow", "messaging.wellbeing.reportingenforcement.frx.threadsettingsrow.ThreadSettingsFeedbackAndReportingRow", "com.facebook.messaging.threadsettings.plugins.interfaces.row.RowInterfaceSpec", "messaging.threadsettings.row.RowInterfaceSpec", "com.facebook.messaging.wellbeing.reportingenforcement.plugins.frx.WellbeingReportingenforcementFrxKillSwitch", andIncrement);
            Exception exc = null;
            try {
                try {
                    if (BZp.A00(r0, atomicInteger)) {
                        Context context = this.A08;
                        Capabilities capabilities = this.A0K;
                        ThreadSummary threadSummary = this.A0C;
                        if (ThreadSettingsFeedbackAndReportingRow.A00(context, threadSummary, this.A0J, capabilities, this.A0L)) {
                            this.A01 = new ThreadSettingsFeedbackAndReportingRow(context, this.A0A, threadSummary);
                            obj = C1Y6.A02;
                            this.A04 = obj;
                            r0.A07("messaging.wellbeing.reportingenforcement.frx.threadsettingsrow.ThreadSettingsFeedbackAndReportingRow", "messaging.threadsettings.row.RowInterfaceSpec", andIncrement, 1BL.A1U(obj));
                        }
                    }
                    obj = C1Y6.A03;
                    this.A04 = obj;
                    r0.A07("messaging.wellbeing.reportingenforcement.frx.threadsettingsrow.ThreadSettingsFeedbackAndReportingRow", "messaging.threadsettings.row.RowInterfaceSpec", andIncrement, 1BL.A1U(obj));
                } catch (Exception e) {
                    this.A04 = C1Y6.A03;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        exc = e;
                        r0.A03(exc, "messaging.wellbeing.reportingenforcement.frx.threadsettingsrow.ThreadSettingsFeedbackAndReportingRow", "messaging.threadsettings.row.RowInterfaceSpec", andIncrement, 1BL.A1U(this.A04));
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r0.A03(exc, "messaging.wellbeing.reportingenforcement.frx.threadsettingsrow.ThreadSettingsFeedbackAndReportingRow", "messaging.threadsettings.row.RowInterfaceSpec", andIncrement, 1BL.A1U(this.A04));
                throw th;
            }
        }
        return 1BK.A1U(this.A04);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007a A[Catch: Exception -> 0x00ce, all -> 0x00da, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00ce, blocks: (B:5:0x003f, B:6:0x0044, B:9:0x0050, B:12:0x0058, B:15:0x0073, B:17:0x00c7, B:20:0x007a, B:21:0x007f, B:23:0x0087, B:26:0x0092, B:27:0x0098, B:28:0x009e, B:29:0x00a4, B:30:0x00a9, B:32:0x00b8, B:33:0x00bd, B:34:0x00c2, B:34:0x00c2, B:37:0x0064), top: B:4:0x003f, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A01() {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ce1.A01():boolean");
    }

    private boolean A02() {
        Object obj;
        if (this.A06 == null) {
            AtomicInteger atomicInteger = C1Y6.A04;
            int andIncrement = atomicInteger.getAndIncrement();
            1YC r0 = this.A0D;
            String A18 = AbJ.A18(r0, "com.facebook.messaging.wellbeing.selfremediation.plugins.block.threadsettingsrow.blockuser.ThreadSettingsBlockUserRow", "messaging.wellbeing.selfremediation.block.threadsettingsrow.blockuser.ThreadSettingsBlockUserRow", andIncrement);
            Exception exc = null;
            try {
                try {
                    if (AbL.A1N(r0, atomicInteger)) {
                        Capabilities capabilities = this.A0K;
                        User user = this.A0J;
                        if (BXH.A00(user, capabilities, this.A0L)) {
                            this.A03 = new ThreadSettingsBlockUserRow(this.A08, user);
                            obj = C1Y6.A02;
                            this.A06 = obj;
                            r0.A07("messaging.wellbeing.selfremediation.block.threadsettingsrow.blockuser.ThreadSettingsBlockUserRow", A18, andIncrement, 1BL.A1U(obj));
                        }
                    }
                    obj = C1Y6.A03;
                    this.A06 = obj;
                    r0.A07("messaging.wellbeing.selfremediation.block.threadsettingsrow.blockuser.ThreadSettingsBlockUserRow", A18, andIncrement, 1BL.A1U(obj));
                } catch (Throwable th) {
                    th = th;
                    r0.A03(exc, "messaging.wellbeing.selfremediation.block.threadsettingsrow.blockuser.ThreadSettingsBlockUserRow", A18, andIncrement, 1BL.A1U(this.A06));
                    throw th;
                }
            } catch (Exception e) {
                this.A06 = C1Y6.A03;
                try {
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    exc = e;
                    r0.A03(exc, "messaging.wellbeing.selfremediation.block.threadsettingsrow.blockuser.ThreadSettingsBlockUserRow", A18, andIncrement, 1BL.A1U(this.A06));
                    throw th;
                }
            }
        }
        return 1BK.A1U(this.A06);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v41, types: [int] */
    /* JADX WARN: Type inference failed for: r0v43, types: [int] */
    /* JADX WARN: Type inference failed for: r303v1 */
    /* JADX WARN: Type inference failed for: r303v13 */
    /* JADX WARN: Type inference failed for: r303v14 */
    public String[] Ayr() {
        String[] strArr = this.A07;
        if (strArr == null) {
            int i = this.A00;
            int i2 = i;
            if (i == -1) {
                boolean A01 = A01();
                boolean z = A01;
                if (A02()) {
                    z = (A01 ? 1 : 0) + 1;
                }
                boolean z2 = z;
                if (A00()) {
                    z2 = (z ? 1 : 0) + 1;
                }
                this.A00 = z2 ? 1 : 0;
                i2 = z2;
            }
            int i3 = 0;
            strArr = new String[i2];
            if (A01()) {
                strArr[0] = "ignore_messages";
                i3 = 1;
            }
            if (A02()) {
                strArr[i3] = "block_row";
                i3++;
            }
            if (A00()) {
                strArr[i3] = "feedback_and_report_row";
            }
            this.A07 = strArr;
        }
        return strArr;
    }

    public DG9 B8K(String str) {
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = this.A0D;
        String A18 = AbF.A18(r0, andIncrement);
        Cug cug = null;
        try {
            if (str.equals("ignore_messages") && A01()) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                try {
                    r0.A0A("com.facebook.messaging.wellbeing.selfremediation.ignore.plugins.core.threadsettingsrow.IgnoreMessagesThreadSettingsRow", "messaging.wellbeing.selfremediation.ignore.core.threadsettingsrow.IgnoreMessagesThreadSettingsRow", "com.facebook.messaging.threadsettings.plugins.interfaces.row.RowInterfaceSpec", andIncrement2, "messaging.threadsettings.row.RowInterfaceSpec", "com.facebook.messaging.wellbeing.selfremediation.ignore.plugins.core.WellbeingSelfremediationIgnoreCoreKillSwitch", A18);
                    try {
                        cug = this.A02.A01();
                        r0.A09("messaging.wellbeing.selfremediation.ignore.core.threadsettingsrow.IgnoreMessagesThreadSettingsRow", "messaging.threadsettings.row.RowInterfaceSpec", A18, andIncrement2);
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04((Exception) null, "messaging.wellbeing.selfremediation.ignore.core.threadsettingsrow.IgnoreMessagesThreadSettingsRow", "messaging.threadsettings.row.RowInterfaceSpec", A18, andIncrement2);
                    throw th;
                }
            }
            r0.A02((Exception) null, "messaging.threadsettings.row.RowInterfaceSpec", A18, andIncrement);
            return cug;
        } catch (Throwable th2) {
            r0.A02((Exception) null, "messaging.threadsettings.row.RowInterfaceSpec", A18, andIncrement);
            throw th2;
        }
    }

    public ImmutableList B8Q(String str) {
        return AbN.A0f(this.A0D, 1BK.A00());
    }

    public AtG BLB(String str) {
        int andIncrement;
        String A1B;
        AtG A01;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement2 = atomicInteger.getAndIncrement();
        1YC r0 = this.A0D;
        String A19 = AbF.A19(r0, andIncrement2);
        Exception e = null;
        try {
            try {
                try {
                    if (str.equals("block_row") && A02()) {
                        andIncrement = atomicInteger.getAndIncrement();
                        A1B = AbJ.A13(r0, A19, andIncrement);
                        A01 = this.A03.A00();
                    } else {
                        if (!str.equals("feedback_and_report_row") || !A00()) {
                            r0.A02((Exception) null, "messaging.threadsettings.row.RowInterfaceSpec", A19, andIncrement2);
                            return null;
                        }
                        andIncrement = atomicInteger.getAndIncrement();
                        A1B = AbI.A1B(r0, A19, andIncrement);
                        A01 = this.A01.A01();
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
