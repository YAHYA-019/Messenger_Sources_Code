package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.graph.plugins.sharecontact.entrypoints.threadsettingsrow.ThreadSettingsShareContactRow;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.search.messages.plugins.core.threadsettingsrow.ThreadSettingsSearchInConversationRow;
import com.facebook.messaging.sharedcontent.plugins.core.threadsettingsrow.ThreadSettingsSharedContentRow;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Ce8.class */
public final class Ce8 implements DIM {
    public C9fe A01;
    public ThreadSettingsShareContactRow A02;
    public C1v5 A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public boolean A07;
    public String[] A08;
    public final Context A09;
    public final 06Z A0A;
    public final FbUserSession A0B;
    public final ThreadKey A0C;
    public final ThreadSummary A0D;
    public final DJX A0F;
    public final DHb A0G;
    public final DHc A0H;
    public final DHd A0I;
    public final MigColorScheme A0J;
    public final User A0K;
    public final Capabilities A0L;
    public final 2Sh A0M;
    public final C1783AsH A0N;
    public final ImmutableList A0O;
    public int A00 = -1;
    public final 1YC A0E = 1YC.A03;

    public Ce8(Context context, 06Z r303, FbUserSession fbUserSession, ThreadKey threadKey, ThreadSummary threadSummary, DJX djx, DHb dHb, DHc dHc, DHd dHd, MigColorScheme migColorScheme, User user, Capabilities capabilities, 2Sh r314, C1783AsH c1783AsH, ImmutableList immutableList) {
        this.A09 = context;
        this.A0B = fbUserSession;
        this.A0C = threadKey;
        this.A0L = capabilities;
        this.A0D = threadSummary;
        this.A0M = r314;
        this.A0N = c1783AsH;
        this.A0A = r303;
        this.A0K = user;
        this.A0O = immutableList;
        this.A0H = dHc;
        this.A0G = dHb;
        this.A0I = dHd;
        this.A0F = djx;
        this.A0J = migColorScheme;
    }

    private void A00() {
        synchronized (this) {
            if (!this.A07) {
                if (this.A09 == null) {
                    throw AbG.A13();
                }
                this.A03 = C1v5.A01;
                this.A07 = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008d A[Catch: Exception -> 0x00ce, all -> 0x00da, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00ce, blocks: (B:5:0x003f, B:9:0x0049, B:12:0x0053, B:15:0x008d, B:16:0x0092, B:17:0x0097, B:19:0x00a0, B:22:0x00ab, B:24:0x00b2, B:25:0x00b7, B:26:0x00bb, B:26:0x00bb, B:29:0x00c7, B:32:0x00c2, B:33:0x005c, B:34:0x0061, B:37:0x006d, B:40:0x0075, B:42:0x0081), top: B:4:0x003f, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A01() {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ce8.A01():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0073 A[Catch: Exception -> 0x0095, all -> 0x00a3, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0095, blocks: (B:5:0x003f, B:9:0x0049, B:12:0x0053, B:15:0x006c, B:17:0x008e, B:20:0x0073, B:21:0x0078, B:23:0x007e, B:26:0x0089, B:28:0x005e), top: B:4:0x003f, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A02() {
        /*
            Method dump skipped, instructions count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ce8.A02():boolean");
    }

    private boolean A03() {
        boolean A01;
        if (this.A06 == null) {
            A00();
            AtomicInteger atomicInteger = C1Y6.A04;
            int andIncrement = atomicInteger.getAndIncrement();
            1YC r0 = this.A0E;
            r0.A0B("com.facebook.messaging.sharedcontent.plugins.core.threadsettingsrow.ThreadSettingsSharedContentRow", "messaging.sharedcontent.core.threadsettingsrow.ThreadSettingsSharedContentRow", "com.facebook.messaging.threadsettings.plugins.interfaces.row.RowInterfaceSpec", "messaging.threadsettings.row.RowInterfaceSpec", "com.facebook.messaging.sharedcontent.plugins.core.SharedContentCoreKillSwitch", andIncrement);
            Exception exc = null;
            try {
                try {
                    C1v5 c1v5 = this.A03;
                    if (c1v5 != null) {
                        Boolean A00 = c1v5.A00("com.facebook.messaging.sharedcontent.plugins.core.SharedContentCoreKillSwitch");
                        if (A00 != null) {
                            A01 = A00.booleanValue();
                            Object obj = (A01 || !ThreadSettingsSharedContentRow.A01(this.A0D, this.A0L)) ? C1Y6.A03 : C1Y6.A02;
                            this.A06 = obj;
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
                            c9fe = AbI.A0c(this.A09);
                            this.A01 = c9fe;
                        }
                        A01 = CBq.A01(r0, c9fe, atomicInteger, i);
                    }
                    if (A01) {
                    }
                    this.A06 = obj;
                    r0.A07("messaging.sharedcontent.core.threadsettingsrow.ThreadSettingsSharedContentRow", "messaging.threadsettings.row.RowInterfaceSpec", andIncrement, 1BL.A1U(obj));
                } catch (Exception e) {
                    this.A06 = C1Y6.A03;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        exc = e;
                        r0.A03(exc, "messaging.sharedcontent.core.threadsettingsrow.ThreadSettingsSharedContentRow", "messaging.threadsettings.row.RowInterfaceSpec", andIncrement, 1BL.A1U(this.A06));
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r0.A03(exc, "messaging.sharedcontent.core.threadsettingsrow.ThreadSettingsSharedContentRow", "messaging.threadsettings.row.RowInterfaceSpec", andIncrement, 1BL.A1U(this.A06));
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
        String[] strArr = this.A08;
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
                strArr[0] = "shared_media";
                i3 = 1;
            }
            if (A02()) {
                strArr[i3] = "search_in_conversation_row";
                i3++;
            }
            if (A01()) {
                strArr[i3] = "share_contact_row";
            }
            this.A08 = strArr;
        }
        return strArr;
    }

    public DG9 B8K(String str) {
        int andIncrement;
        String str2;
        Cug A00;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement2 = atomicInteger.getAndIncrement();
        1YC r0 = this.A0E;
        String A18 = AbF.A18(r0, andIncrement2);
        try {
            A00();
            try {
                try {
                    if (str.equals("shared_media") && A03()) {
                        andIncrement = atomicInteger.getAndIncrement();
                        str2 = AbJ.A14(r0, A18, andIncrement);
                        A00 = ThreadSettingsSharedContentRow.A00(this.A09, this.A0D, this.A0I, this.A0K);
                    } else if (str.equals("search_in_conversation_row") && A02()) {
                        andIncrement = atomicInteger.getAndIncrement();
                        str2 = AbJ.A16(r0, A18, andIncrement);
                        A00 = ThreadSettingsSearchInConversationRow.A00(this.A09, this.A0D);
                    } else {
                        if (!str.equals("share_contact_row") || !A01()) {
                            r0.A02((Exception) null, "messaging.threadsettings.row.RowInterfaceSpec", A18, andIncrement2);
                            return null;
                        }
                        andIncrement = atomicInteger.getAndIncrement();
                        str2 = "messaging.graph.sharecontact.entrypoints.threadsettingsrow.ThreadSettingsShareContactRow";
                        r0.A0A("com.facebook.messaging.graph.plugins.sharecontact.entrypoints.threadsettingsrow.ThreadSettingsShareContactRow", str2, "com.facebook.messaging.threadsettings.plugins.interfaces.row.RowInterfaceSpec", andIncrement, "messaging.threadsettings.row.RowInterfaceSpec", "com.facebook.messaging.graph.plugins.sharecontact.entrypoints.GraphSharecontactEntrypointsKillSwitch", A18);
                        A00 = this.A02.A00();
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
        int A00 = 1BK.A00();
        1YC r0 = this.A0E;
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
        1YC r0 = this.A0E;
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
