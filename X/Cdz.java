package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.search.messages.plugins.core.threadsettingsrow.ThreadSettingsSearchInConversationRow;
import com.facebook.messaging.sharedcontent.plugins.core.threadsettingsrow.ThreadSettingsSharedContentRow;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Cdz.class */
public final class Cdz implements DIM {
    public C9fe A01;
    public C1v5 A02;
    public Object A03;
    public Object A04;
    public boolean A05;
    public String[] A06;
    public final Context A07;
    public final 06Z A08;
    public final FbUserSession A09;
    public final ThreadKey A0A;
    public final ThreadSummary A0B;
    public final DJX A0D;
    public final DHb A0E;
    public final DHc A0F;
    public final DHd A0G;
    public final MigColorScheme A0H;
    public final User A0I;
    public final Capabilities A0J;
    public final 2Sh A0K;
    public final C1783AsH A0L;
    public final ImmutableList A0M;
    public int A00 = -1;
    public final 1YC A0C = 1YC.A03;

    public Cdz(Context context, 06Z r303, FbUserSession fbUserSession, ThreadKey threadKey, ThreadSummary threadSummary, DJX djx, DHb dHb, DHc dHc, DHd dHd, MigColorScheme migColorScheme, User user, Capabilities capabilities, 2Sh r314, C1783AsH c1783AsH, ImmutableList immutableList) {
        this.A07 = context;
        this.A09 = fbUserSession;
        this.A0A = threadKey;
        this.A0J = capabilities;
        this.A0B = threadSummary;
        this.A0K = r314;
        this.A0L = c1783AsH;
        this.A08 = r303;
        this.A0I = user;
        this.A0M = immutableList;
        this.A0F = dHc;
        this.A0E = dHb;
        this.A0G = dHd;
        this.A0D = djx;
        this.A0H = migColorScheme;
    }

    private void A00() {
        synchronized (this) {
            if (!this.A05) {
                if (this.A07 == null) {
                    throw AbG.A13();
                }
                this.A02 = C1v5.A01;
                this.A05 = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0073 A[Catch: Exception -> 0x0095, all -> 0x00a3, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0095, blocks: (B:5:0x003f, B:9:0x0049, B:12:0x0053, B:15:0x006c, B:17:0x008e, B:20:0x0073, B:21:0x0078, B:23:0x007e, B:26:0x0089, B:28:0x005e), top: B:4:0x003f, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A01() {
        /*
            Method dump skipped, instructions count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cdz.A01():boolean");
    }

    private boolean A02() {
        boolean A01;
        if (this.A04 == null) {
            A00();
            AtomicInteger atomicInteger = C1Y6.A04;
            int andIncrement = atomicInteger.getAndIncrement();
            1YC r0 = this.A0C;
            r0.A0B("com.facebook.messaging.sharedcontent.plugins.core.threadsettingsrow.ThreadSettingsSharedContentRow", "messaging.sharedcontent.core.threadsettingsrow.ThreadSettingsSharedContentRow", "com.facebook.messaging.threadsettings.plugins.interfaces.row.RowInterfaceSpec", "messaging.threadsettings.row.RowInterfaceSpec", "com.facebook.messaging.sharedcontent.plugins.core.SharedContentCoreKillSwitch", andIncrement);
            Exception exc = null;
            try {
                try {
                    C1v5 c1v5 = this.A02;
                    if (c1v5 != null) {
                        Boolean A00 = c1v5.A00("com.facebook.messaging.sharedcontent.plugins.core.SharedContentCoreKillSwitch");
                        if (A00 != null) {
                            A01 = A00.booleanValue();
                            Object obj = (A01 || !ThreadSettingsSharedContentRow.A01(this.A0B, this.A0J)) ? C1Y6.A03 : C1Y6.A02;
                            this.A04 = obj;
                            r0.A07("messaging.sharedcontent.core.threadsettingsrow.ThreadSettingsSharedContentRow", "messaging.threadsettings.row.RowInterfaceSpec", andIncrement, 1BL.A1U(obj));
                        }
                    }
                    int i = C1Y6.A00;
                    Boolean A002 = CBq.A00(i);
                    if (A002 != null) {
                        A01 = A002.booleanValue();
                    } else {
                        C9fe c9fe = this.A01;
                        if (c9fe == null) {
                            c9fe = AbI.A0c(this.A07);
                            this.A01 = c9fe;
                        }
                        A01 = CBq.A01(r0, c9fe, atomicInteger, i);
                    }
                    if (A01) {
                    }
                    this.A04 = obj;
                    r0.A07("messaging.sharedcontent.core.threadsettingsrow.ThreadSettingsSharedContentRow", "messaging.threadsettings.row.RowInterfaceSpec", andIncrement, 1BL.A1U(obj));
                } catch (Exception e) {
                    this.A04 = C1Y6.A03;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        exc = e;
                        r0.A03(exc, "messaging.sharedcontent.core.threadsettingsrow.ThreadSettingsSharedContentRow", "messaging.threadsettings.row.RowInterfaceSpec", andIncrement, 1BL.A1U(this.A04));
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r0.A03(exc, "messaging.sharedcontent.core.threadsettingsrow.ThreadSettingsSharedContentRow", "messaging.threadsettings.row.RowInterfaceSpec", andIncrement, 1BL.A1U(this.A04));
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
        String[] strArr = this.A06;
        if (strArr == null) {
            int i = this.A00;
            int i2 = i;
            if (i == -1) {
                boolean A01 = A01();
                boolean z = A01;
                if (A02()) {
                    z = (A01 ? 1 : 0) + 1;
                }
                this.A00 = z ? 1 : 0;
                i2 = z;
            }
            boolean z2 = false;
            strArr = new String[i2];
            if (A01()) {
                strArr[0] = "search_in_conversation_row";
                z2 = true;
            }
            if (A02()) {
                strArr[z2 ? 1 : 0] = "shared_media";
            }
            this.A06 = strArr;
        }
        return strArr;
    }

    public DG9 B8K(String str) {
        int andIncrement;
        String A14;
        Cug A00;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement2 = atomicInteger.getAndIncrement();
        1YC r0 = this.A0C;
        String A18 = AbF.A18(r0, andIncrement2);
        Exception e = null;
        try {
            A00();
            try {
                try {
                    if (str.equals("search_in_conversation_row") && A01()) {
                        andIncrement = atomicInteger.getAndIncrement();
                        A14 = AbJ.A16(r0, A18, andIncrement);
                        A00 = ThreadSettingsSearchInConversationRow.A00(this.A07, this.A0B);
                    } else {
                        if (!str.equals("shared_media") || !A02()) {
                            r0.A02((Exception) null, "messaging.threadsettings.row.RowInterfaceSpec", A18, andIncrement2);
                            return null;
                        }
                        andIncrement = atomicInteger.getAndIncrement();
                        A14 = AbJ.A14(r0, A18, andIncrement);
                        A00 = ThreadSettingsSharedContentRow.A00(this.A07, this.A0B, this.A0G, this.A0I);
                    }
                    r0.A09(A14, "messaging.threadsettings.row.RowInterfaceSpec", A18, andIncrement);
                    r0.A02((Exception) null, "messaging.threadsettings.row.RowInterfaceSpec", A18, andIncrement2);
                    return A00;
                } catch (Exception e2) {
                    e = e2;
                    throw e;
                }
            } catch (Throwable th) {
                r0.A04(e, A14, "messaging.threadsettings.row.RowInterfaceSpec", A18, andIncrement);
                throw th;
            }
        } catch (Throwable th2) {
            r0.A02(e, "messaging.threadsettings.row.RowInterfaceSpec", A18, andIncrement2);
            throw th2;
        }
    }

    public ImmutableList B8Q(String str) {
        int A00 = 1BK.A00();
        1YC r0 = this.A0C;
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
        int A00 = 1BK.A00();
        1YC r0 = this.A0C;
        String A19 = AbF.A19(r0, A00);
        try {
            A00();
            r0.A02((Exception) null, "messaging.threadsettings.row.RowInterfaceSpec", A19, A00);
            return null;
        } catch (Throwable th) {
            r0.A06("messaging.threadsettings.row.RowInterfaceSpec", A19, A00);
            throw th;
        }
    }
}
