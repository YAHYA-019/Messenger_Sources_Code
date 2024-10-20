package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.groups.plugins.core.threadsettingsrow.showgroupmembers.ThreadSettingsSeeGroupMembersGroupRow;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Cdm.class */
public final class Cdm implements DIM {
    public ThreadSettingsSeeGroupMembersGroupRow A01;
    public Object A02;
    public String[] A03;
    public final Context A04;
    public final 06Z A05;
    public final FbUserSession A06;
    public final ThreadKey A07;
    public final ThreadSummary A08;
    public final DJX A0A;
    public final DHb A0B;
    public final DHc A0C;
    public final DHd A0D;
    public final MigColorScheme A0E;
    public final User A0F;
    public final Capabilities A0G;
    public final 2Sh A0H;
    public final C1783AsH A0I;
    public final ImmutableList A0J;
    public int A00 = -1;
    public final 1YC A09 = 1YC.A03;

    public Cdm(Context context, 06Z r303, FbUserSession fbUserSession, ThreadKey threadKey, ThreadSummary threadSummary, DJX djx, DHb dHb, DHc dHc, DHd dHd, MigColorScheme migColorScheme, User user, Capabilities capabilities, 2Sh r314, C1783AsH c1783AsH, ImmutableList immutableList) {
        this.A04 = context;
        this.A06 = fbUserSession;
        this.A07 = threadKey;
        this.A0G = capabilities;
        this.A08 = threadSummary;
        this.A0H = r314;
        this.A0I = c1783AsH;
        this.A05 = r303;
        this.A0F = user;
        this.A0J = immutableList;
        this.A0C = dHc;
        this.A0B = dHb;
        this.A0D = dHd;
        this.A0A = djx;
        this.A0E = migColorScheme;
    }

    private boolean A00() {
        Object obj;
        if (this.A02 == null) {
            AtomicInteger atomicInteger = C1Y6.A04;
            int andIncrement = atomicInteger.getAndIncrement();
            1YC r0 = this.A09;
            String A17 = AbJ.A17(r0, "com.facebook.messaging.groups.plugins.core.threadsettingsrow.showgroupmembers.ThreadSettingsSeeGroupMembersGroupRow", "messaging.groups.core.threadsettingsrow.showgroupmembers.ThreadSettingsSeeGroupMembersGroupRow", andIncrement);
            Exception exc = null;
            try {
                try {
                    if (AbL.A1R(r0, atomicInteger)) {
                        Capabilities capabilities = this.A0G;
                        ThreadSummary threadSummary = this.A08;
                        if (BTv.A00(threadSummary, capabilities)) {
                            this.A01 = new ThreadSettingsSeeGroupMembersGroupRow(this.A04, threadSummary);
                            obj = C1Y6.A02;
                            this.A02 = obj;
                            r0.A07("messaging.groups.core.threadsettingsrow.showgroupmembers.ThreadSettingsSeeGroupMembersGroupRow", A17, andIncrement, 1BL.A1U(obj));
                        }
                    }
                    obj = C1Y6.A03;
                    this.A02 = obj;
                    r0.A07("messaging.groups.core.threadsettingsrow.showgroupmembers.ThreadSettingsSeeGroupMembersGroupRow", A17, andIncrement, 1BL.A1U(obj));
                } catch (Exception e) {
                    this.A02 = C1Y6.A03;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        exc = e;
                        r0.A03(exc, "messaging.groups.core.threadsettingsrow.showgroupmembers.ThreadSettingsSeeGroupMembersGroupRow", A17, andIncrement, 1BL.A1U(this.A02));
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r0.A03(exc, "messaging.groups.core.threadsettingsrow.showgroupmembers.ThreadSettingsSeeGroupMembersGroupRow", A17, andIncrement, 1BL.A1U(this.A02));
                throw th;
            }
        }
        return 1BK.A1U(this.A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r303v1 */
    /* JADX WARN: Type inference failed for: r303v4 */
    /* JADX WARN: Type inference failed for: r303v5 */
    public String[] Ayr() {
        String[] strArr = this.A03;
        if (strArr == null) {
            int i = this.A00;
            int i2 = i;
            if (i == -1) {
                boolean A00 = A00();
                this.A00 = A00 ? 1 : 0;
                i2 = A00;
            }
            strArr = new String[i2];
            if (A00()) {
                strArr[0] = "see_group_members";
            }
            this.A03 = strArr;
        }
        return strArr;
    }

    public DG9 B8K(String str) {
        return AbN.A0R(this.A09, 1BK.A00());
    }

    public ImmutableList B8Q(String str) {
        return AbN.A0f(this.A09, 1BK.A00());
    }

    public AtG BLB(String str) {
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = this.A09;
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
