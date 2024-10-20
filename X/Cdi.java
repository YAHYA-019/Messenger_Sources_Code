package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Cdi.class */
public final class Cdi implements DIM {
    public Object A01;
    public String[] A02;
    public final Context A03;
    public final 06Z A04;
    public final FbUserSession A05;
    public final ThreadKey A06;
    public final ThreadSummary A07;
    public final DJX A09;
    public final DHb A0A;
    public final DHc A0B;
    public final DHd A0C;
    public final MigColorScheme A0D;
    public final User A0E;
    public final Capabilities A0F;
    public final 2Sh A0G;
    public final C1783AsH A0H;
    public final ImmutableList A0I;
    public int A00 = -1;
    public final 1YC A08 = 1YC.A03;

    public Cdi(Context context, 06Z r303, FbUserSession fbUserSession, ThreadKey threadKey, ThreadSummary threadSummary, DJX djx, DHb dHb, DHc dHc, DHd dHd, MigColorScheme migColorScheme, User user, Capabilities capabilities, 2Sh r314, C1783AsH c1783AsH, ImmutableList immutableList) {
        this.A03 = context;
        this.A05 = fbUserSession;
        this.A06 = threadKey;
        this.A0F = capabilities;
        this.A07 = threadSummary;
        this.A0G = r314;
        this.A0H = c1783AsH;
        this.A04 = r303;
        this.A0E = user;
        this.A0I = immutableList;
        this.A0B = dHc;
        this.A0A = dHb;
        this.A0C = dHd;
        this.A09 = djx;
        this.A0D = migColorScheme;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006c A[Catch: Exception -> 0x00b8, all -> 0x00c4, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00b8, blocks: (B:5:0x003b, B:6:0x0040, B:9:0x004c, B:12:0x0054, B:15:0x006c, B:17:0x0079, B:19:0x0083, B:20:0x0088, B:23:0x0091, B:26:0x009a, B:29:0x00a5, B:31:0x00b1, B:34:0x00ac, B:36:0x0060), top: B:4:0x003b, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A00() {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cdi.A00():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r303v1 */
    /* JADX WARN: Type inference failed for: r303v4 */
    /* JADX WARN: Type inference failed for: r303v5 */
    public String[] Ayr() {
        String[] strArr = this.A02;
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
                strArr[0] = "mentorship_actions_row";
            }
            this.A02 = strArr;
        }
        return strArr;
    }

    public DG9 B8K(String str) {
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = this.A08;
        String A18 = AbF.A18(r0, andIncrement);
        Cug cug = null;
        Exception e = null;
        try {
            if (str.equals("mentorship_actions_row") && A00()) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.mentorship.plugins.core.threadsettingsrow.MentorshipActionsRow", "messaging.mentorship.core.threadsettingsrow.MentorshipActionsRow", "com.facebook.messaging.threadsettings.plugins.interfaces.row.RowInterfaceSpec", andIncrement2, "messaging.threadsettings.row.RowInterfaceSpec", "com.facebook.messaging.mentorship.plugins.core.MentorshipCoreKillSwitch", A18);
                try {
                    try {
                        Context context = this.A03;
                        2Sh r02 = this.A0G;
                        11T.A0H(context, r02);
                        Bf3 bf3 = (Bf3) r02.A01((String) null, Bf3.class);
                        String str2 = bf3 != null ? bf3.A00 : null;
                        02W.A02(str2);
                        11T.A0A(str2);
                        CQg A00 = CQg.A00();
                        CQg.A07(context, A00, 2131959540);
                        CQg.A08(BNV.A1N, A00);
                        A00.A00 = 1990643440L;
                        2MQ A002 = CAv.A00();
                        C1pq.A08("migButtonIconName", A002);
                        CHv.A00(A002, A00, (C1ut) null);
                        A00.A05 = new CII((Drawable) null, (Uri) null, CAv.A01(), (C1ut) null, (Boolean) null);
                        cug = CQg.A02(new CYm(str2, context, 4), A00);
                        r0.A09("messaging.mentorship.core.threadsettingsrow.MentorshipActionsRow", "messaging.threadsettings.row.RowInterfaceSpec", A18, andIncrement2);
                    } catch (Exception e2) {
                        e = e2;
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04(e, "messaging.mentorship.core.threadsettingsrow.MentorshipActionsRow", "messaging.threadsettings.row.RowInterfaceSpec", A18, andIncrement2);
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
        return AbN.A0f(this.A08, 1BK.A00());
    }

    public AtG BLB(String str) {
        return AbN.A0d(this.A08, 1BK.A00());
    }
}
