package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.business.bmcconsiderationgrowth.sellerprofile.plugins.productsrow.MessengerThreadSettingsProductsRow;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.sharedimage.SharedMedia;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Cdp.class */
public final class Cdp implements DIM {
    public MessengerThreadSettingsProductsRow A01;
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

    public Cdp(Context context, 06Z r303, FbUserSession fbUserSession, ThreadKey threadKey, ThreadSummary threadSummary, DJX djx, DHb dHb, DHc dHc, DHd dHd, MigColorScheme migColorScheme, User user, Capabilities capabilities, 2Sh r314, C1783AsH c1783AsH, ImmutableList immutableList) {
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x0074 A[Catch: Exception -> 0x00ff, all -> 0x010b, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x00ff, blocks: (B:5:0x0043, B:6:0x0048, B:9:0x0054, B:12:0x005c, B:15:0x0074, B:17:0x0081, B:19:0x008b, B:20:0x0090, B:23:0x0099, B:24:0x009e, B:27:0x00ab, B:29:0x00b0, B:32:0x00bc, B:33:0x00c2, B:34:0x00c8, B:35:0x00ce, B:36:0x00d3, B:38:0x00e1, B:39:0x00e7, B:40:0x00ec, B:40:0x00ec, B:43:0x00f8, B:46:0x00f3, B:48:0x0068), top: B:4:0x0043, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A00() {
        /*
            Method dump skipped, instructions count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cdp.A00():boolean");
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
                strArr[0] = "page_products";
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
        DG9 dg9 = null;
        try {
            if (str.equals("page_products") && A00()) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                try {
                    r0.A0A("com.facebook.messaging.business.bmcconsiderationgrowth.sellerprofile.plugins.productsrow.MessengerThreadSettingsProductsRow", "messaging.business.bmcconsiderationgrowth.sellerprofile.productsrow.MessengerThreadSettingsProductsRow", "com.facebook.messaging.threadsettings.plugins.interfaces.row.RowInterfaceSpec", andIncrement2, "messaging.threadsettings.row.RowInterfaceSpec", "com.facebook.messaging.business.bmcconsiderationgrowth.sellerprofile.BusinessBmcconsiderationgrowthSellerprofileKillSwitch", A18);
                    try {
                        MessengerThreadSettingsProductsRow messengerThreadSettingsProductsRow = this.A01;
                        Byp byp = (Byp) messengerThreadSettingsProductsRow.A06.A01((String) null, Byp.class);
                        ImmutableList of = byp != null ? byp.A04 : ImmutableList.of();
                        ImmutableList.Builder A0h = 4YU.A0h();
                        11T.A0D(of);
                        ArrayList A0z = 1BL.A0z(of);
                        Iterator it = of.iterator();
                        while (it.hasNext()) {
                            Bok bok = (Bok) it.next();
                            11T.A0D(bok);
                            C5en A00 = C5en.A00();
                            A00.A0P = 5HP.A0F;
                            A00.A0E = bok.A01;
                            A00.A0D = bok.A00;
                            A0z.add(new SharedMedia(4YU.A0Y(A00), "", "", bok.A02));
                        }
                        ImmutableList A0y = AbG.A0y(A0h, A0z);
                        long j = MessengerThreadSettingsProductsRow.A07;
                        11T.A0D(A0y);
                        new Cuf(BNV.A1k, new AnonymousClass563(new Ci8(messengerThreadSettingsProductsRow), messengerThreadSettingsProductsRow.A05, A0y, j));
                        r0.A09("messaging.business.bmcconsiderationgrowth.sellerprofile.productsrow.MessengerThreadSettingsProductsRow", "messaging.threadsettings.row.RowInterfaceSpec", A18, andIncrement2);
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04((Exception) null, "messaging.business.bmcconsiderationgrowth.sellerprofile.productsrow.MessengerThreadSettingsProductsRow", "messaging.threadsettings.row.RowInterfaceSpec", A18, andIncrement2);
                    throw th;
                }
            }
            r0.A02((Exception) null, "messaging.threadsettings.row.RowInterfaceSpec", A18, andIncrement);
            return dg9;
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
