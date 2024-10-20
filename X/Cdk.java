package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.aibot.plugins.core.threadsettings.creatorinforow.ThreadSettingsAiBotCreatorInfoRow;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Cdk.class */
public final class Cdk implements DIM {
    public ThreadSettingsAiBotCreatorInfoRow A01;
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

    public Cdk(Context context, 06Z r303, FbUserSession fbUserSession, ThreadKey threadKey, ThreadSummary threadSummary, DJX djx, DHb dHb, DHc dHc, DHd dHd, MigColorScheme migColorScheme, User user, Capabilities capabilities, 2Sh r314, C1783AsH c1783AsH, ImmutableList immutableList) {
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
            r0.A0B("com.facebook.messaging.aibot.plugins.core.threadsettings.creatorinforow.ThreadSettingsAiBotCreatorInfoRow", "messaging.aibot.core.threadsettings.creatorinforow.ThreadSettingsAiBotCreatorInfoRow", "com.facebook.messaging.threadsettings.plugins.interfaces.row.RowInterfaceSpec", "messaging.threadsettings.row.RowInterfaceSpec", "com.facebook.messaging.aibot.plugins.core.AiBotKillSwitch", andIncrement);
            Exception exc = null;
            try {
                try {
                    if (AbL.A1P(r0, atomicInteger)) {
                        Capabilities capabilities = this.A0G;
                        2Sh r02 = this.A0H;
                        7zQ.A1Y(capabilities, r02, 1);
                        2yD A0L = 1BK.A0L(16387);
                        C5ty c5ty = (C5ty) r02.A01((String) null, C5ty.class);
                        if (4YU.A1Y(capabilities, 239) && c5ty != null && ((c5ty.A00 != null || c5ty.A01 != null) && A0L.AZk(72340430519602888L))) {
                            this.A01 = new ThreadSettingsAiBotCreatorInfoRow(this.A04, this.A05, this.A07, r02);
                            obj = C1Y6.A02;
                            this.A02 = obj;
                            r0.A07("messaging.aibot.core.threadsettings.creatorinforow.ThreadSettingsAiBotCreatorInfoRow", "messaging.threadsettings.row.RowInterfaceSpec", andIncrement, 1BL.A1U(obj));
                        }
                    }
                    obj = C1Y6.A03;
                    this.A02 = obj;
                    r0.A07("messaging.aibot.core.threadsettings.creatorinforow.ThreadSettingsAiBotCreatorInfoRow", "messaging.threadsettings.row.RowInterfaceSpec", andIncrement, 1BL.A1U(obj));
                } catch (Exception e) {
                    this.A02 = C1Y6.A03;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        exc = e;
                        r0.A03(exc, "messaging.aibot.core.threadsettings.creatorinforow.ThreadSettingsAiBotCreatorInfoRow", "messaging.threadsettings.row.RowInterfaceSpec", andIncrement, 1BL.A1U(this.A02));
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r0.A03(exc, "messaging.aibot.core.threadsettings.creatorinforow.ThreadSettingsAiBotCreatorInfoRow", "messaging.threadsettings.row.RowInterfaceSpec", andIncrement, 1BL.A1U(this.A02));
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
                strArr[0] = "ai_bot_creator_info_row";
            }
            this.A03 = strArr;
        }
        return strArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c4, code lost:
    
        if (r321 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00df, code lost:
    
        if (r312 != null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0127, code lost:
    
        if (r0.A00 == null) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.DG9 B8K(java.lang.String r302) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cdk.B8K(java.lang.String):X.DG9");
    }

    public ImmutableList B8Q(String str) {
        return AbN.A0f(this.A09, 1BK.A00());
    }

    public AtG BLB(String str) {
        return AbN.A0d(this.A09, 1BK.A00());
    }
}
