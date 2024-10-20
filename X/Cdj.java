package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.business.ads.orderhistory.plugins.threadorderhistory.threadsettingsplacedordersrows.ThreadSettingsPlacedOrderRows;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.nativepagereply.orders.threadsettings.model.BusinessInboxPlacedOrder;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Cdj.class */
public final class Cdj implements DIM {
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

    public Cdj(Context context, 06Z r303, FbUserSession fbUserSession, ThreadKey threadKey, ThreadSummary threadSummary, DJX djx, DHb dHb, DHc dHc, DHd dHd, MigColorScheme migColorScheme, User user, Capabilities capabilities, 2Sh r314, C1783AsH c1783AsH, ImmutableList immutableList) {
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x0070 A[Catch: Exception -> 0x012f, all -> 0x013b, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x012f, blocks: (B:5:0x003f, B:6:0x0044, B:9:0x0050, B:12:0x0058, B:15:0x0070, B:16:0x0075, B:18:0x007d, B:20:0x0088, B:21:0x008d, B:24:0x0096, B:25:0x009b, B:29:0x00aa, B:30:0x00b1, B:31:0x00b8, B:32:0x00bf, B:33:0x00c5, B:36:0x00cf, B:38:0x00d6, B:39:0x00da, B:41:0x00e7, B:44:0x0123, B:46:0x0128, B:49:0x00f3, B:51:0x00fa, B:52:0x00fe, B:54:0x010b, B:55:0x011c, B:57:0x0064), top: B:4:0x003f, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A00() {
        /*
            Method dump skipped, instructions count: 383
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cdj.A00():boolean");
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
                strArr[0] = "placed_order_row";
            }
            this.A02 = strArr;
        }
        return strArr;
    }

    public DG9 B8K(String str) {
        return AbN.A0R(this.A08, 1BK.A00());
    }

    /* JADX WARN: Type inference failed for: r0v78, types: [X.0Pn, java.lang.Object] */
    public ImmutableList B8Q(String str) {
        long j;
        int i;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = this.A08;
        r0.A08("com.facebook.messaging.threadsettings.plugins.interfaces.row.RowInterfaceSpec", "messaging.threadsettings.row.RowInterfaceSpec", "getRows", andIncrement);
        ImmutableList immutableList = null;
        try {
            if (str.equals("placed_order_row") && A00()) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                try {
                    r0.A0A("com.facebook.messaging.business.ads.orderhistory.plugins.threadorderhistory.threadsettingsplacedordersrows.ThreadSettingsPlacedOrderRows", "messaging.business.ads.orderhistory.threadorderhistory.threadsettingsplacedordersrows.ThreadSettingsPlacedOrderRows", "com.facebook.messaging.threadsettings.plugins.interfaces.row.RowInterfaceSpec", andIncrement2, "messaging.threadsettings.row.RowInterfaceSpec", "com.facebook.messaging.business.ads.orderhistory.plugins.threadorderhistory.BusinessAdsOrderhistoryThreadorderhistoryKillSwitch", "getRows");
                    try {
                        Context context = this.A03;
                        FbUserSession fbUserSession = this.A05;
                        2Sh r02 = this.A0G;
                        ThreadKey threadKey = this.A06;
                        MigColorScheme migColorScheme = this.A0D;
                        boolean A1W = 1BL.A1W(context, fbUserSession);
                        11T.A0F(r02, 2);
                        1BK.A1K(threadKey, 3, migColorScheme);
                        ImmutableList immutableList2 = null;
                        BfX bfX = (BfX) r02.A01((String) null, BfX.class);
                        if (bfX != null) {
                            ImmutableList immutableList3 = bfX.A00;
                            1BV A00 = 1BV.A00(82674);
                            ?? obj = new Object();
                            if (fbUserSession.BKF().mIsPageContext) {
                                ((0Pn) obj).element = threadKey.A05;
                                j = threadKey.A02;
                                i = 82672;
                            } else {
                                ((0Pn) obj).element = threadKey.A02;
                                j = threadKey.A05;
                                i = 82673;
                            }
                            1Br A002 = 1Bu.A00(i);
                            AKc aKc = new AKc(A1W ? 1 : 0, j, obj, A002);
                            ImmutableList.Builder A0h = 4YU.A0h();
                            int i2 = 0;
                            for (Object obj2 : 0QD.A0Y(immutableList3, 3)) {
                                int i3 = i2 + 1;
                                if (i2 < 0) {
                                    C0s8.A18();
                                    throw 0Q8.createAndThrow();
                                }
                                BusinessInboxPlacedOrder businessInboxPlacedOrder = (BusinessInboxPlacedOrder) obj2;
                                AKc aKc2 = i2 == 0 ? aKc : null;
                                C17 c17 = (C17) A00.get();
                                11T.A0D(businessInboxPlacedOrder);
                                AnonymousClass544 A003 = c17.A00(context, businessInboxPlacedOrder, migColorScheme, aKc2, new AKl(2, j, obj, A002, businessInboxPlacedOrder), AnonymousClass001.A0Z(ThreadSettingsPlacedOrderRows.class, businessInboxPlacedOrder.A03, AnonymousClass001.A0k()).hashCode());
                                C1pq.A08("listItem", A003);
                                A0h.m11011add((Object) new Cuf(BNV.A1b, A003));
                                i2 = i3;
                            }
                            if (immutableList3.size() > 3) {
                                CQg A01 = CQg.A01(1BK.A0u(context, 2131967205));
                                CQg.A08(BNV.A1d, A01);
                                A01.A00 = AnonymousClass001.A0Z(ThreadSettingsPlacedOrderRows.class, r0, AnonymousClass001.A0k()).hashCode();
                                A0h.m11011add((Object) CQg.A02(new CYs(fbUserSession, A002, immutableList3, (0Pn) obj, j), A01));
                            }
                            immutableList2 = A0h.build();
                        }
                        immutableList = immutableList2;
                        r0.A09("messaging.business.ads.orderhistory.threadorderhistory.threadsettingsplacedordersrows.ThreadSettingsPlacedOrderRows", "messaging.threadsettings.row.RowInterfaceSpec", "getRows", andIncrement2);
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04((Exception) null, "messaging.business.ads.orderhistory.threadorderhistory.threadsettingsplacedordersrows.ThreadSettingsPlacedOrderRows", "messaging.threadsettings.row.RowInterfaceSpec", "getRows", andIncrement2);
                    throw th;
                }
            }
            r0.A02((Exception) null, "messaging.threadsettings.row.RowInterfaceSpec", "getRows", andIncrement);
            return immutableList;
        } catch (Throwable th2) {
            r0.A02((Exception) null, "messaging.threadsettings.row.RowInterfaceSpec", "getRows", andIncrement);
            throw th2;
        }
    }

    public AtG BLB(String str) {
        return AbN.A0d(this.A08, 1BK.A00());
    }
}
