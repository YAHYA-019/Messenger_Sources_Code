package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.business.bmcconsiderationgrowth.sellerprofile.plugins.photosrow.MessengerThreadSettingsPhotosRow;
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

/* loaded from: Cdo.class */
public final class Cdo implements DIM {
    public MessengerThreadSettingsPhotosRow A01;
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

    public Cdo(Context context, 06Z r303, FbUserSession fbUserSession, ThreadKey threadKey, ThreadSummary threadSummary, DJX djx, DHb dHb, DHc dHc, DHd dHd, MigColorScheme migColorScheme, User user, Capabilities capabilities, 2Sh r314, C1783AsH c1783AsH, ImmutableList immutableList) {
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

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00fa, code lost:
    
        if (r0 < r0) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006c A[Catch: Exception -> 0x0138, all -> 0x0144, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0138, blocks: (B:5:0x003b, B:6:0x0040, B:9:0x004c, B:12:0x0054, B:15:0x006c, B:17:0x0079, B:19:0x0083, B:20:0x0088, B:23:0x0091, B:24:0x0096, B:27:0x00a3, B:29:0x00aa, B:33:0x00bc, B:34:0x00c1, B:37:0x00ca, B:38:0x00d0, B:40:0x00d6, B:44:0x00e8, B:49:0x0107, B:50:0x010d, B:51:0x0112, B:52:0x0118, B:54:0x0122, B:55:0x0128, B:56:0x012c, B:56:0x012c, B:59:0x0131, B:62:0x0100, B:64:0x0060), top: B:4:0x003b, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A00() {
        /*
            Method dump skipped, instructions count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cdo.A00():boolean");
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
                strArr[0] = "page_photos";
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
            if (str.equals("page_photos") && A00()) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                try {
                    r0.A0A("com.facebook.messaging.business.bmcconsiderationgrowth.sellerprofile.plugins.photosrow.MessengerThreadSettingsPhotosRow", "messaging.business.bmcconsiderationgrowth.sellerprofile.photosrow.MessengerThreadSettingsPhotosRow", "com.facebook.messaging.threadsettings.plugins.interfaces.row.RowInterfaceSpec", andIncrement2, "messaging.threadsettings.row.RowInterfaceSpec", "com.facebook.messaging.business.bmcconsiderationgrowth.sellerprofile.BusinessBmcconsiderationgrowthSellerprofileKillSwitch", A18);
                    try {
                        CEO ceo = this.A01.A01;
                        Byp byp = (Byp) ceo.A04.A01((String) null, Byp.class);
                        ImmutableList of = byp != null ? byp.A03 : ImmutableList.of();
                        ImmutableList.Builder A0h = 4YU.A0h();
                        11T.A0D(of);
                        ArrayList A0z = 1BL.A0z(of);
                        Iterator it = of.iterator();
                        while (it.hasNext()) {
                            Boj boj = (Boj) it.next();
                            11T.A0D(boj);
                            C5en A00 = C5en.A00();
                            A00.A0P = 5HP.A0F;
                            A00.A0E = boj.A01;
                            A00.A0D = boj.A00;
                            A0z.add(new SharedMedia(4YU.A0Y(A00), "", "", boj.A02));
                        }
                        ImmutableList A0y = AbG.A0y(A0h, A0z);
                        long j = CEO.A05;
                        11T.A0D(A0y);
                        new Cuf(BNV.A1i, new AnonymousClass563(new Ci9(ceo, of), ceo.A03, A0y, j));
                        r0.A09("messaging.business.bmcconsiderationgrowth.sellerprofile.photosrow.MessengerThreadSettingsPhotosRow", "messaging.threadsettings.row.RowInterfaceSpec", A18, andIncrement2);
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04((Exception) null, "messaging.business.bmcconsiderationgrowth.sellerprofile.photosrow.MessengerThreadSettingsPhotosRow", "messaging.threadsettings.row.RowInterfaceSpec", A18, andIncrement2);
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
