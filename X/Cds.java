package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.wellbeing.reportingenforcement.plugins.frx.threadsettingsrow.ThreadSettingsFeedbackAndReportingRow;
import com.facebook.messaging.wellbeing.selfremediation.plugins.block.threadsettingsrow.blockgroupmember.ThreadSettingsGroupBlockMemberRow;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Cds.class */
public final class Cds implements DIM {
    public ThreadSettingsFeedbackAndReportingRow A01;
    public ThreadSettingsGroupBlockMemberRow A02;
    public Object A03;
    public Object A04;
    public String[] A05;
    public final Context A06;
    public final 06Z A07;
    public final FbUserSession A08;
    public final ThreadKey A09;
    public final ThreadSummary A0A;
    public final DJX A0C;
    public final DHb A0D;
    public final DHc A0E;
    public final DHd A0F;
    public final MigColorScheme A0G;
    public final User A0H;
    public final Capabilities A0I;
    public final 2Sh A0J;
    public final C1783AsH A0K;
    public final ImmutableList A0L;
    public int A00 = -1;
    public final 1YC A0B = 1YC.A03;

    public Cds(Context context, 06Z r303, FbUserSession fbUserSession, ThreadKey threadKey, ThreadSummary threadSummary, DJX djx, DHb dHb, DHc dHc, DHd dHd, MigColorScheme migColorScheme, User user, Capabilities capabilities, 2Sh r314, C1783AsH c1783AsH, ImmutableList immutableList) {
        this.A06 = context;
        this.A08 = fbUserSession;
        this.A09 = threadKey;
        this.A0I = capabilities;
        this.A0A = threadSummary;
        this.A0J = r314;
        this.A0K = c1783AsH;
        this.A07 = r303;
        this.A0H = user;
        this.A0L = immutableList;
        this.A0E = dHc;
        this.A0D = dHb;
        this.A0F = dHd;
        this.A0C = djx;
        this.A0G = migColorScheme;
    }

    private boolean A00() {
        Object obj;
        if (this.A03 == null) {
            AtomicInteger atomicInteger = C1Y6.A04;
            int andIncrement = atomicInteger.getAndIncrement();
            1YC r0 = this.A0B;
            r0.A0B("com.facebook.messaging.wellbeing.reportingenforcement.plugins.frx.threadsettingsrow.ThreadSettingsFeedbackAndReportingRow", "messaging.wellbeing.reportingenforcement.frx.threadsettingsrow.ThreadSettingsFeedbackAndReportingRow", "com.facebook.messaging.threadsettings.plugins.interfaces.row.RowInterfaceSpec", "messaging.threadsettings.row.RowInterfaceSpec", "com.facebook.messaging.wellbeing.reportingenforcement.plugins.frx.WellbeingReportingenforcementFrxKillSwitch", andIncrement);
            Exception exc = null;
            try {
                try {
                    if (BZp.A00(r0, atomicInteger)) {
                        Context context = this.A06;
                        Capabilities capabilities = this.A0I;
                        ThreadSummary threadSummary = this.A0A;
                        if (ThreadSettingsFeedbackAndReportingRow.A00(context, threadSummary, this.A0H, capabilities, this.A0J)) {
                            this.A01 = new ThreadSettingsFeedbackAndReportingRow(context, this.A08, threadSummary);
                            obj = C1Y6.A02;
                            this.A03 = obj;
                            r0.A07("messaging.wellbeing.reportingenforcement.frx.threadsettingsrow.ThreadSettingsFeedbackAndReportingRow", "messaging.threadsettings.row.RowInterfaceSpec", andIncrement, 1BL.A1U(obj));
                        }
                    }
                    obj = C1Y6.A03;
                    this.A03 = obj;
                    r0.A07("messaging.wellbeing.reportingenforcement.frx.threadsettingsrow.ThreadSettingsFeedbackAndReportingRow", "messaging.threadsettings.row.RowInterfaceSpec", andIncrement, 1BL.A1U(obj));
                } catch (Exception e) {
                    this.A03 = C1Y6.A03;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        exc = e;
                        r0.A03(exc, "messaging.wellbeing.reportingenforcement.frx.threadsettingsrow.ThreadSettingsFeedbackAndReportingRow", "messaging.threadsettings.row.RowInterfaceSpec", andIncrement, 1BL.A1U(this.A03));
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r0.A03(exc, "messaging.wellbeing.reportingenforcement.frx.threadsettingsrow.ThreadSettingsFeedbackAndReportingRow", "messaging.threadsettings.row.RowInterfaceSpec", andIncrement, 1BL.A1U(this.A03));
                throw th;
            }
        }
        return 1BK.A1U(this.A03);
    }

    private boolean A01() {
        Object obj;
        if (this.A04 == null) {
            AtomicInteger atomicInteger = C1Y6.A04;
            int andIncrement = atomicInteger.getAndIncrement();
            1YC r0 = this.A0B;
            String A18 = AbJ.A18(r0, "com.facebook.messaging.wellbeing.selfremediation.plugins.block.threadsettingsrow.blockgroupmember.ThreadSettingsGroupBlockMemberRow", "messaging.wellbeing.selfremediation.block.threadsettingsrow.blockgroupmember.ThreadSettingsGroupBlockMemberRow", andIncrement);
            Exception exc = null;
            try {
                try {
                    if (AbL.A1N(r0, atomicInteger)) {
                        if (BXG.A00(this.A0A, this.A0I)) {
                            this.A02 = new ThreadSettingsGroupBlockMemberRow(this.A06, this.A09);
                            obj = C1Y6.A02;
                            this.A04 = obj;
                            r0.A07("messaging.wellbeing.selfremediation.block.threadsettingsrow.blockgroupmember.ThreadSettingsGroupBlockMemberRow", A18, andIncrement, 1BL.A1U(obj));
                        }
                    }
                    obj = C1Y6.A03;
                    this.A04 = obj;
                    r0.A07("messaging.wellbeing.selfremediation.block.threadsettingsrow.blockgroupmember.ThreadSettingsGroupBlockMemberRow", A18, andIncrement, 1BL.A1U(obj));
                } catch (Exception e) {
                    this.A04 = C1Y6.A03;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        exc = e;
                        r0.A03(exc, "messaging.wellbeing.selfremediation.block.threadsettingsrow.blockgroupmember.ThreadSettingsGroupBlockMemberRow", A18, andIncrement, 1BL.A1U(this.A04));
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r0.A03(exc, "messaging.wellbeing.selfremediation.block.threadsettingsrow.blockgroupmember.ThreadSettingsGroupBlockMemberRow", A18, andIncrement, 1BL.A1U(this.A04));
                throw th;
            }
        }
        return 1BK.A1U(this.A04);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [int] */
    /* JADX WARN: Type inference failed for: r303v1 */
    /* JADX WARN: Type inference failed for: r303v8 */
    /* JADX WARN: Type inference failed for: r303v9 */
    public String[] Ayr() {
        String[] strArr = this.A05;
        if (strArr == null) {
            int i = this.A00;
            int i2 = i;
            if (i == -1) {
                boolean A01 = A01();
                boolean z = A01;
                if (A00()) {
                    z = (A01 ? 1 : 0) + 1;
                }
                this.A00 = z ? 1 : 0;
                i2 = z;
            }
            boolean z2 = false;
            strArr = new String[i2];
            if (A01()) {
                strArr[0] = "group_block_member_row";
                z2 = true;
            }
            if (A00()) {
                strArr[z2 ? 1 : 0] = "feedback_and_report_row";
            }
            this.A05 = strArr;
        }
        return strArr;
    }

    public DG9 B8K(String str) {
        return AbN.A0R(this.A0B, 1BK.A00());
    }

    public ImmutableList B8Q(String str) {
        return AbN.A0f(this.A0B, 1BK.A00());
    }

    public AtG BLB(String str) {
        int andIncrement;
        String A1B;
        AtG A01;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement2 = atomicInteger.getAndIncrement();
        1YC r0 = this.A0B;
        String A19 = AbF.A19(r0, andIncrement2);
        try {
            try {
                try {
                    if (str.equals("group_block_member_row") && A01()) {
                        andIncrement = atomicInteger.getAndIncrement();
                        A1B = "messaging.wellbeing.selfremediation.block.threadsettingsrow.blockgroupmember.ThreadSettingsGroupBlockMemberRow";
                        r0.A0A("com.facebook.messaging.wellbeing.selfremediation.plugins.block.threadsettingsrow.blockgroupmember.ThreadSettingsGroupBlockMemberRow", A1B, "com.facebook.messaging.threadsettings.plugins.interfaces.row.RowInterfaceSpec", andIncrement, "messaging.threadsettings.row.RowInterfaceSpec", "com.facebook.messaging.wellbeing.selfremediation.plugins.block.WellbeingSelfremediationBlockKillSwitch", A19);
                        A01 = this.A02.A00();
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
                } catch (Exception e) {
                    throw e;
                }
            } finally {
                r0.A04((Exception) null, A1B, "messaging.threadsettings.row.RowInterfaceSpec", A19, andIncrement);
            }
        } catch (Throwable th) {
            r0.A02((Exception) null, "messaging.threadsettings.row.RowInterfaceSpec", A19, andIncrement2);
            throw th;
        }
    }
}
