package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.communitymessaging.model.Community;
import com.facebook.messaging.communitymessaging.plugins.communitynavigation.threadsettingsrow.CommunityNavigationThreadSettingsRow;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Cdl.class */
public final class Cdl implements DIM {
    public CommunityNavigationThreadSettingsRow A01;
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

    public Cdl(Context context, 06Z r303, FbUserSession fbUserSession, ThreadKey threadKey, ThreadSummary threadSummary, DJX djx, DHb dHb, DHc dHc, DHd dHd, MigColorScheme migColorScheme, User user, Capabilities capabilities, 2Sh r314, C1783AsH c1783AsH, ImmutableList immutableList) {
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x0070 A[Catch: Exception -> 0x013a, all -> 0x0148, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x013a, blocks: (B:6:0x003f, B:7:0x0044, B:10:0x0050, B:13:0x0058, B:16:0x0070, B:17:0x0076, B:19:0x007c, B:22:0x008d, B:26:0x009e, B:29:0x00a7, B:32:0x00b1, B:35:0x00bb, B:40:0x00cd, B:41:0x00d2, B:46:0x00f3, B:48:0x0100, B:51:0x010e, B:52:0x0114, B:53:0x011a, B:55:0x0125, B:56:0x012a, B:57:0x012e, B:57:0x012e, B:60:0x0133, B:65:0x00e8, B:70:0x00eb, B:71:0x00ec, B:71:0x00ec, B:74:0x0064), top: B:5:0x003f, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A00() {
        /*
            Method dump skipped, instructions count: 397
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cdl.A00():boolean");
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
                strArr[0] = "community_navigation_row";
            }
            this.A03 = strArr;
        }
        return strArr;
    }

    public DG9 B8K(String str) {
        1WY r0;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r02 = this.A09;
        String A18 = AbF.A18(r02, andIncrement);
        DG9 dg9 = null;
        try {
            if (str.equals("community_navigation_row") && A00()) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                try {
                    r02.A0A("com.facebook.messaging.communitymessaging.plugins.communitynavigation.threadsettingsrow.CommunityNavigationThreadSettingsRow", "messaging.communitymessaging.communitynavigation.threadsettingsrow.CommunityNavigationThreadSettingsRow", "com.facebook.messaging.threadsettings.plugins.interfaces.row.RowInterfaceSpec", andIncrement2, "messaging.threadsettings.row.RowInterfaceSpec", "com.facebook.messaging.communitymessaging.plugins.communitynavigation.CommunitymessagingCommunitynavigationKillSwitch", A18);
                    try {
                        CommunityNavigationThreadSettingsRow communityNavigationThreadSettingsRow = this.A01;
                        Community A0W = AbI.A0W(communityNavigationThreadSettingsRow.A04);
                        if (A0W != null) {
                            try {
                                r0 = (1WY) 1Bi.A03(66481);
                            } catch (Throwable th) {
                                th = th;
                            }
                            if (r0.A0B() || 1WY.A01(r0).AZk(36321099608309705L)) {
                                CJ4 cj4 = new CJ4();
                                MigColorScheme migColorScheme = communityNavigationThreadSettingsRow.A03;
                                cj4.A07 = migColorScheme;
                                cj4.A00 = CommunityNavigationThreadSettingsRow.A05;
                                String str2 = A0W.A0X;
                                11T.A0A(str2);
                                try {
                                    Uri A03 = C0A2.A03(str2);
                                    if (A03 != null) {
                                        cj4.A04 = C5wv.A00(A03, C2q0.A04, C2py.ROUND_RECT, migColorScheme, 0);
                                        Context context = communityNavigationThreadSettingsRow.A00;
                                        cj4.A04(context.getString(2131954558));
                                        Resources resources = context.getResources();
                                        int i = A0W.A04;
                                        cj4.A03(resources.getQuantityString(2131820580, i, A0W.A0W, Integer.valueOf(i)));
                                        cj4.A06 = EL0.A03;
                                        cj4.A02(new 55J((Drawable) null, Cvn.A00(communityNavigationThreadSettingsRow, 34), (C5wx) null, (CharSequence) null, "android.widget.Button", 1, false, false));
                                        AnonymousClass544 A01 = cj4.A01();
                                        C1pq.A08("listItem", A01);
                                        new Cuf(BNV.A0Z, A01);
                                        dg9 = r311;
                                        r02.A09("messaging.communitymessaging.communitynavigation.threadsettingsrow.CommunityNavigationThreadSettingsRow", "messaging.threadsettings.row.RowInterfaceSpec", A18, andIncrement2);
                                    }
                                } catch (SecurityException unused) {
                                }
                                th = 1BK.A0h();
                                throw th;
                            }
                        }
                        CQg A00 = CQg.A00();
                        A00.A0B(communityNavigationThreadSettingsRow.A00.getString(2131954557, communityNavigationThreadSettingsRow.A02.A1r));
                        CQg.A08(BNV.A0Z, A00);
                        A00.A00 = CommunityNavigationThreadSettingsRow.A05;
                        CHv.A00(2MQ.A0v, A00, (C1ut) null);
                        A00.A05 = new CII((Drawable) null, (Uri) null, C1u3.A1n, (C1ut) null, (Boolean) null);
                        Cug cug = CQg.A03(A00, communityNavigationThreadSettingsRow, 77);
                        dg9 = cug;
                        r02.A09("messaging.communitymessaging.communitynavigation.threadsettingsrow.CommunityNavigationThreadSettingsRow", "messaging.threadsettings.row.RowInterfaceSpec", A18, andIncrement2);
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Throwable th2) {
                    r02.A04((Exception) null, "messaging.communitymessaging.communitynavigation.threadsettingsrow.CommunityNavigationThreadSettingsRow", "messaging.threadsettings.row.RowInterfaceSpec", A18, andIncrement2);
                    throw th2;
                }
            }
            r02.A02((Exception) null, "messaging.threadsettings.row.RowInterfaceSpec", A18, andIncrement);
            return dg9;
        } catch (Throwable th3) {
            r02.A02((Exception) null, "messaging.threadsettings.row.RowInterfaceSpec", A18, andIncrement);
            throw th3;
        }
    }

    public ImmutableList B8Q(String str) {
        return AbN.A0f(this.A09, 1BK.A00());
    }

    public AtG BLB(String str) {
        return AbN.A0d(this.A09, 1BK.A00());
    }
}
