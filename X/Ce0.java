package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.groups.plugins.core.threadsettingsrow.showgroupmembers.ThreadSettingsSeeGroupMembersGroupRow;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.msys.advancedcrypto.plugins.threadsettingsrow.groupmemberaddmode.ThreadSettingsGroupMemberAddModeRow;
import com.facebook.messaging.notify.plugins.mutexapp.threadsettingsrow.base.ThreadSettingsNotificationsRow;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Ce0.class */
public final class Ce0 implements DIM {
    public ThreadSettingsSeeGroupMembersGroupRow A01;
    public ThreadSettingsGroupMemberAddModeRow A02;
    public ThreadSettingsNotificationsRow A03;
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

    public Ce0(Context context, 06Z r303, FbUserSession fbUserSession, ThreadKey threadKey, ThreadSummary threadSummary, DJX djx, DHb dHb, DHc dHc, DHd dHd, MigColorScheme migColorScheme, User user, Capabilities capabilities, 2Sh r314, C1783AsH c1783AsH, ImmutableList immutableList) {
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
            String A17 = AbJ.A17(r0, "com.facebook.messaging.groups.plugins.core.threadsettingsrow.showgroupmembers.ThreadSettingsSeeGroupMembersGroupRow", "messaging.groups.core.threadsettingsrow.showgroupmembers.ThreadSettingsSeeGroupMembersGroupRow", andIncrement);
            Exception exc = null;
            try {
                try {
                    if (AbL.A1R(r0, atomicInteger)) {
                        Capabilities capabilities = this.A0K;
                        ThreadSummary threadSummary = this.A0C;
                        if (BTv.A00(threadSummary, capabilities)) {
                            this.A01 = new ThreadSettingsSeeGroupMembersGroupRow(this.A08, threadSummary);
                            obj = C1Y6.A02;
                            this.A04 = obj;
                            r0.A07("messaging.groups.core.threadsettingsrow.showgroupmembers.ThreadSettingsSeeGroupMembersGroupRow", A17, andIncrement, 1BL.A1U(obj));
                        }
                    }
                    obj = C1Y6.A03;
                    this.A04 = obj;
                    r0.A07("messaging.groups.core.threadsettingsrow.showgroupmembers.ThreadSettingsSeeGroupMembersGroupRow", A17, andIncrement, 1BL.A1U(obj));
                } catch (Exception e) {
                    this.A04 = C1Y6.A03;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        exc = e;
                        r0.A03(exc, "messaging.groups.core.threadsettingsrow.showgroupmembers.ThreadSettingsSeeGroupMembersGroupRow", A17, andIncrement, 1BL.A1U(this.A04));
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r0.A03(exc, "messaging.groups.core.threadsettingsrow.showgroupmembers.ThreadSettingsSeeGroupMembersGroupRow", A17, andIncrement, 1BL.A1U(this.A04));
                throw th;
            }
        }
        return 1BK.A1U(this.A04);
    }

    private boolean A01() {
        Object obj;
        if (this.A05 == null) {
            AtomicInteger atomicInteger = C1Y6.A04;
            int andIncrement = atomicInteger.getAndIncrement();
            1YC r0 = this.A0D;
            r0.A0B("com.facebook.messaging.msys.advancedcrypto.plugins.threadsettingsrow.groupmemberaddmode.ThreadSettingsGroupMemberAddModeRow", "messaging.msys.advancedcrypto.threadsettingsrow.groupmemberaddmode.ThreadSettingsGroupMemberAddModeRow", "com.facebook.messaging.threadsettings.plugins.interfaces.row.RowInterfaceSpec", "messaging.threadsettings.row.RowInterfaceSpec", "com.facebook.messaging.msys.advancedcrypto.plugins.MsysAdvancedcryptoKillSwitch", andIncrement);
            Exception exc = null;
            try {
                try {
                    if (AbL.A1T(r0, atomicInteger)) {
                        Context context = this.A08;
                        ThreadSummary threadSummary = this.A0C;
                        if (BUY.A00(threadSummary)) {
                            this.A02 = new ThreadSettingsGroupMemberAddModeRow(context, threadSummary, this.A0H);
                            obj = C1Y6.A02;
                            this.A05 = obj;
                            r0.A07("messaging.msys.advancedcrypto.threadsettingsrow.groupmemberaddmode.ThreadSettingsGroupMemberAddModeRow", "messaging.threadsettings.row.RowInterfaceSpec", andIncrement, 1BL.A1U(obj));
                        }
                    }
                    obj = C1Y6.A03;
                    this.A05 = obj;
                    r0.A07("messaging.msys.advancedcrypto.threadsettingsrow.groupmemberaddmode.ThreadSettingsGroupMemberAddModeRow", "messaging.threadsettings.row.RowInterfaceSpec", andIncrement, 1BL.A1U(obj));
                } catch (Exception e) {
                    this.A05 = C1Y6.A03;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        exc = e;
                        r0.A03(exc, "messaging.msys.advancedcrypto.threadsettingsrow.groupmemberaddmode.ThreadSettingsGroupMemberAddModeRow", "messaging.threadsettings.row.RowInterfaceSpec", andIncrement, 1BL.A1U(this.A05));
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r0.A03(exc, "messaging.msys.advancedcrypto.threadsettingsrow.groupmemberaddmode.ThreadSettingsGroupMemberAddModeRow", "messaging.threadsettings.row.RowInterfaceSpec", andIncrement, 1BL.A1U(this.A05));
                throw th;
            }
        }
        return 1BK.A1U(this.A05);
    }

    private boolean A02() {
        Object obj;
        if (this.A06 == null) {
            AtomicInteger atomicInteger = C1Y6.A04;
            int andIncrement = atomicInteger.getAndIncrement();
            1YC r0 = this.A0D;
            r0.A0B("com.facebook.messaging.notify.plugins.mutexapp.threadsettingsrow.base.ThreadSettingsNotificationsRow", "messaging.notify.mutexapp.threadsettingsrow.base.ThreadSettingsNotificationsRow", "com.facebook.messaging.threadsettings.plugins.interfaces.row.RowInterfaceSpec", "messaging.threadsettings.row.RowInterfaceSpec", "com.facebook.messaging.notify.plugins.mutexapp.NotifyMutexappKillSwitch", andIncrement);
            Exception exc = null;
            try {
                try {
                    if (BZP.A00(r0, atomicInteger)) {
                        Capabilities capabilities = this.A0K;
                        11T.A0F(capabilities, 0);
                        if (CHf.A0B.A00(capabilities, null)) {
                            this.A03 = new ThreadSettingsNotificationsRow(this.A08, this.A09, this.A0B, this.A0C, this.A0H, this.A0J);
                            obj = C1Y6.A02;
                            this.A06 = obj;
                            r0.A07("messaging.notify.mutexapp.threadsettingsrow.base.ThreadSettingsNotificationsRow", "messaging.threadsettings.row.RowInterfaceSpec", andIncrement, 1BL.A1U(obj));
                        }
                    }
                    obj = C1Y6.A03;
                    this.A06 = obj;
                    r0.A07("messaging.notify.mutexapp.threadsettingsrow.base.ThreadSettingsNotificationsRow", "messaging.threadsettings.row.RowInterfaceSpec", andIncrement, 1BL.A1U(obj));
                } catch (Exception e) {
                    this.A06 = C1Y6.A03;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        exc = e;
                        r0.A03(exc, "messaging.notify.mutexapp.threadsettingsrow.base.ThreadSettingsNotificationsRow", "messaging.threadsettings.row.RowInterfaceSpec", andIncrement, 1BL.A1U(this.A06));
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r0.A03(exc, "messaging.notify.mutexapp.threadsettingsrow.base.ThreadSettingsNotificationsRow", "messaging.threadsettings.row.RowInterfaceSpec", andIncrement, 1BL.A1U(this.A06));
                throw th;
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
                boolean A00 = A00();
                boolean z = A00;
                if (A01()) {
                    z = (A00 ? 1 : 0) + 1;
                }
                boolean z2 = z;
                if (A02()) {
                    z2 = (z ? 1 : 0) + 1;
                }
                this.A00 = z2 ? 1 : 0;
                i2 = z2;
            }
            int i3 = 0;
            strArr = new String[i2];
            if (A00()) {
                strArr[0] = "see_group_members";
                i3 = 1;
            }
            if (A01()) {
                strArr[i3] = "group_member_add_mode";
                i3++;
            }
            if (A02()) {
                strArr[i3] = "notification_row";
            }
            this.A07 = strArr;
        }
        return strArr;
    }

    public DG9 B8K(String str) {
        int andIncrement;
        String str2;
        Cug A00;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement2 = atomicInteger.getAndIncrement();
        1YC r0 = this.A0D;
        String A18 = AbF.A18(r0, andIncrement2);
        try {
            try {
                try {
                    if (str.equals("group_member_add_mode") && A01()) {
                        andIncrement = atomicInteger.getAndIncrement();
                        str2 = "messaging.msys.advancedcrypto.threadsettingsrow.groupmemberaddmode.ThreadSettingsGroupMemberAddModeRow";
                        r0.A0A("com.facebook.messaging.msys.advancedcrypto.plugins.threadsettingsrow.groupmemberaddmode.ThreadSettingsGroupMemberAddModeRow", str2, "com.facebook.messaging.threadsettings.plugins.interfaces.row.RowInterfaceSpec", andIncrement, "messaging.threadsettings.row.RowInterfaceSpec", "com.facebook.messaging.msys.advancedcrypto.plugins.MsysAdvancedcryptoKillSwitch", A18);
                        A00 = this.A02.A00();
                    } else {
                        if (!str.equals("notification_row") || !A02()) {
                            r0.A02((Exception) null, "messaging.threadsettings.row.RowInterfaceSpec", A18, andIncrement2);
                            return null;
                        }
                        andIncrement = atomicInteger.getAndIncrement();
                        str2 = "messaging.notify.mutexapp.threadsettingsrow.base.ThreadSettingsNotificationsRow";
                        r0.A0A("com.facebook.messaging.notify.plugins.mutexapp.threadsettingsrow.base.ThreadSettingsNotificationsRow", str2, "com.facebook.messaging.threadsettings.plugins.interfaces.row.RowInterfaceSpec", andIncrement, "messaging.threadsettings.row.RowInterfaceSpec", "com.facebook.messaging.notify.plugins.mutexapp.NotifyMutexappKillSwitch", A18);
                        A00 = ((CHf) this.A03.A07.getValue()).A00();
                    }
                    r0.A09(str2, "messaging.threadsettings.row.RowInterfaceSpec", A18, andIncrement);
                    r0.A02((Exception) null, "messaging.threadsettings.row.RowInterfaceSpec", A18, andIncrement2);
                    return A00;
                } catch (Exception e) {
                    throw e;
                }
            } finally {
                r0.A04((Exception) null, str2, "messaging.threadsettings.row.RowInterfaceSpec", A18, andIncrement);
            }
        } catch (Throwable th) {
            r0.A02((Exception) null, "messaging.threadsettings.row.RowInterfaceSpec", A18, andIncrement2);
            throw th;
        }
    }

    public ImmutableList B8Q(String str) {
        return AbN.A0f(this.A0D, 1BK.A00());
    }

    public AtG BLB(String str) {
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = this.A0D;
        String A19 = AbF.A19(r0, andIncrement);
        AtG atG = null;
        try {
            if (str.equals("see_group_members") && A00()) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                try {
                    r0.A0A("com.facebook.messaging.groups.plugins.core.threadsettingsrow.showgroupmembers.ThreadSettingsSeeGroupMembersGroupRow", "messaging.groups.core.threadsettingsrow.showgroupmembers.ThreadSettingsSeeGroupMembersGroupRow", "com.facebook.messaging.threadsettings.plugins.interfaces.row.RowInterfaceSpec", andIncrement2, "messaging.threadsettings.row.RowInterfaceSpec", "com.facebook.messaging.groups.plugins.core.GroupsCoreKillSwitch", A19);
                    try {
                        atG = this.A01.A00();
                        r0.A09("messaging.groups.core.threadsettingsrow.showgroupmembers.ThreadSettingsSeeGroupMembersGroupRow", "messaging.threadsettings.row.RowInterfaceSpec", A19, andIncrement2);
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04((Exception) null, "messaging.groups.core.threadsettingsrow.showgroupmembers.ThreadSettingsSeeGroupMembersGroupRow", "messaging.threadsettings.row.RowInterfaceSpec", A19, andIncrement2);
                    throw th;
                }
            }
            r0.A02((Exception) null, "messaging.threadsettings.row.RowInterfaceSpec", A19, andIncrement);
            return atG;
        } catch (Throwable th2) {
            r0.A02((Exception) null, "messaging.threadsettings.row.RowInterfaceSpec", A19, andIncrement);
            throw th2;
        }
    }
}
