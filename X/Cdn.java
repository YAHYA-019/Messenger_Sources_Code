package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.cutover.plugins.threadsettings.masterbuild.cutovertool.ThreadLevelCutoverToolRow;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Cdn.class */
public final class Cdn implements DIM {
    public ThreadLevelCutoverToolRow A01;
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

    public Cdn(Context context, 06Z r303, FbUserSession fbUserSession, ThreadKey threadKey, ThreadSummary threadSummary, DJX djx, DHb dHb, DHc dHc, DHd dHd, MigColorScheme migColorScheme, User user, Capabilities capabilities, 2Sh r314, C1783AsH c1783AsH, ImmutableList immutableList) {
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x00b0 A[Catch: Exception -> 0x0174, all -> 0x0182, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x0174, blocks: (B:5:0x003f, B:6:0x0044, B:9:0x0050, B:12:0x0058, B:15:0x00b0, B:16:0x00b5, B:18:0x00bc, B:20:0x00c1, B:21:0x00c6, B:24:0x00d4, B:25:0x00da, B:27:0x00e6, B:33:0x00fe, B:35:0x0108, B:36:0x010d, B:38:0x0114, B:40:0x011d, B:43:0x012b, B:46:0x0136, B:47:0x013c, B:48:0x0142, B:50:0x014b, B:51:0x0150, B:52:0x0154, B:52:0x0154, B:55:0x00f7, B:57:0x00f2, B:58:0x0061, B:63:0x00a1, B:63:0x00a1, B:65:0x00a5, B:66:0x0070, B:68:0x007e, B:76:0x009c, B:79:0x0162, B:81:0x016c, B:83:0x0173), top: B:4:0x003f, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A00() {
        /*
            Method dump skipped, instructions count: 455
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cdn.A00():boolean");
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
                strArr[0] = "cutover_tool_row";
            }
            this.A03 = strArr;
        }
        return strArr;
    }

    public DG9 B8K(String str) {
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = this.A09;
        String A18 = AbF.A18(r0, andIncrement);
        Cug cug = null;
        try {
            if (str.equals("cutover_tool_row") && A00()) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                try {
                    r0.A0A("com.facebook.messaging.cutover.plugins.threadsettings.masterbuild.cutovertool.ThreadLevelCutoverToolRow", "messaging.cutover.threadsettings.masterbuild.cutovertool.ThreadLevelCutoverToolRow", "com.facebook.messaging.threadsettings.plugins.interfaces.row.RowInterfaceSpec", andIncrement2, "messaging.threadsettings.row.RowInterfaceSpec", "com.facebook.messaging.cutover.plugins.threadsettings.masterbuild.CutoverThreadsettingsMasterbuildKillSwitch", A18);
                    try {
                        ThreadLevelCutoverToolRow threadLevelCutoverToolRow = this.A01;
                        Context context = threadLevelCutoverToolRow.A00;
                        String A0u = 1BK.A0u(context, 2131966973);
                        1Br A01 = 1Bu.A01(context, 82460);
                        1Br A012 = 1Bu.A01(context, 82461);
                        CQg A013 = CQg.A01(A0u);
                        CQg.A08(BNV.A0j, A013);
                        A013.A00 = 1963450438L;
                        CHv.A00(2MQ.A1t, A013, (C1ut) null);
                        A013.A05 = new CII((Drawable) null, (Uri) null, C1u3.A48, (C1ut) null, (Boolean) null);
                        cug = CQg.A06(A013, A01, A012, threadLevelCutoverToolRow, 9);
                        r0.A09("messaging.cutover.threadsettings.masterbuild.cutovertool.ThreadLevelCutoverToolRow", "messaging.threadsettings.row.RowInterfaceSpec", A18, andIncrement2);
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04((Exception) null, "messaging.cutover.threadsettings.masterbuild.cutovertool.ThreadLevelCutoverToolRow", "messaging.threadsettings.row.RowInterfaceSpec", A18, andIncrement2);
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
        return AbN.A0f(this.A09, 1BK.A00());
    }

    public AtG BLB(String str) {
        return AbN.A0d(this.A09, 1BK.A00());
    }
}
