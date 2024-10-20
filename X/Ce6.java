package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.enums.GraphQLXFBCommerceSellerProfileInfoRow;
import com.facebook.messaging.business.bmcconsiderationgrowth.sellerprofile.plugins.commerceinforows.MessengerThreadSettingsCommerceInfoRows;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.collect.ImmutableList;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Ce6.class */
public final class Ce6 implements DIM {
    public MessengerThreadSettingsCommerceInfoRows A01;
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

    public Ce6(Context context, 06Z r303, FbUserSession fbUserSession, ThreadKey threadKey, ThreadSummary threadSummary, DJX djx, DHb dHb, DHc dHc, DHd dHd, MigColorScheme migColorScheme, User user, Capabilities capabilities, 2Sh r314, C1783AsH c1783AsH, ImmutableList immutableList) {
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

    public static final Cuf A00(C1u3 c1u3, C5ww c5ww, 55B r303, MigColorScheme migColorScheme, Integer num, String str) {
        C1u2 A0I = 4YV.A0I();
        55A r0 = (55A) (num == null ? C5z6.A00(str) : 5OL.A01(str, num.intValue()));
        CJ4 cj4 = new CJ4();
        cj4.A00 = MessengerThreadSettingsCommerceInfoRows.A05 + c1u3.hashCode();
        cj4.A04 = new AnonymousClass597(A0I.A03(c1u3), migColorScheme.B4h(), migColorScheme.BDl());
        cj4.A07 = migColorScheme;
        cj4.A01 = c5ww;
        if (r0 != null) {
            cj4.A02 = r0;
        }
        if (r303 != null) {
            cj4.A03 = r303;
        }
        AnonymousClass544 A01 = cj4.A01();
        11T.A0A(A01);
        return new Cuf(BNV.A1g, A01);
    }

    public static final Cuf A01(C1u3 c1u3, MigColorScheme migColorScheme, String str) {
        return A00(c1u3, null, null, migColorScheme, null, str);
    }

    public static void A02(C1u3 c1u3, MessengerThreadSettingsCommerceInfoRows messengerThreadSettingsCommerceInfoRows, Object obj, String str, java.util.Map map) {
        map.put(obj, A01(c1u3, messengerThreadSettingsCommerceInfoRows.A03, str));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0076 A[Catch: Exception -> 0x00dd, all -> 0x00e9, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00dd, blocks: (B:5:0x003b, B:6:0x0040, B:9:0x004c, B:12:0x0054, B:15:0x006f, B:17:0x00d6, B:20:0x0076, B:22:0x0083, B:24:0x008d, B:25:0x0092, B:28:0x009b, B:30:0x00a0, B:33:0x00ac, B:34:0x00b2, B:35:0x00b7, B:36:0x00bd, B:38:0x00c7, B:39:0x00cd, B:40:0x00d1, B:40:0x00d1, B:43:0x0060), top: B:4:0x003b, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A03() {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ce6.A03():boolean");
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
                boolean A03 = A03();
                this.A00 = A03 ? 1 : 0;
                i2 = A03;
            }
            strArr = new String[i2];
            if (A03()) {
                strArr[0] = "commerce_info";
            }
            this.A03 = strArr;
        }
        return strArr;
    }

    public DG9 B8K(String str) {
        return AbN.A0R(this.A09, 1BK.A00());
    }

    public ImmutableList B8Q(String str) {
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = this.A09;
        r0.A08("com.facebook.messaging.threadsettings.plugins.interfaces.row.RowInterfaceSpec", "messaging.threadsettings.row.RowInterfaceSpec", "getRows", andIncrement);
        ImmutableList immutableList = null;
        try {
            if (str.equals("commerce_info") && A03()) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                try {
                    r0.A0A("com.facebook.messaging.business.bmcconsiderationgrowth.sellerprofile.plugins.commerceinforows.MessengerThreadSettingsCommerceInfoRows", "messaging.business.bmcconsiderationgrowth.sellerprofile.commerceinforows.MessengerThreadSettingsCommerceInfoRows", "com.facebook.messaging.threadsettings.plugins.interfaces.row.RowInterfaceSpec", andIncrement2, "messaging.threadsettings.row.RowInterfaceSpec", "com.facebook.messaging.business.bmcconsiderationgrowth.sellerprofile.BusinessBmcconsiderationgrowthSellerprofileKillSwitch", "getRows");
                    try {
                        MessengerThreadSettingsCommerceInfoRows messengerThreadSettingsCommerceInfoRows = this.A01;
                        ImmutableList.Builder A0h = 4YU.A0h();
                        2Sh r02 = messengerThreadSettingsCommerceInfoRows.A04;
                        Byp byp = (Byp) r02.A01((String) null, Byp.class);
                        if (byp != null) {
                            ImmutableList immutableList2 = byp.A02;
                            Set A0f = 0QD.A0f(immutableList2);
                            LinkedHashMap A1C = 1BK.A1C();
                            GraphQLXFBCommerceSellerProfileInfoRow graphQLXFBCommerceSellerProfileInfoRow = GraphQLXFBCommerceSellerProfileInfoRow.DESCRIPTION;
                            if (A0f.contains(graphQLXFBCommerceSellerProfileInfoRow)) {
                                Brc brc = (Brc) r02.A01((String) null, Brc.class);
                                if (brc != null) {
                                    String str2 = brc.A01;
                                    if (str2.length() != 0) {
                                        A02(C1u3.A3r, messengerThreadSettingsCommerceInfoRows, graphQLXFBCommerceSellerProfileInfoRow, str2, A1C);
                                    }
                                }
                            }
                            GraphQLXFBCommerceSellerProfileInfoRow graphQLXFBCommerceSellerProfileInfoRow2 = GraphQLXFBCommerceSellerProfileInfoRow.TENURE;
                            if (A0f.contains(graphQLXFBCommerceSellerProfileInfoRow2)) {
                                String str3 = byp.A0D;
                                if (str3 != null && str3.length() != 0) {
                                    A02(C1u3.A4G, messengerThreadSettingsCommerceInfoRows, graphQLXFBCommerceSellerProfileInfoRow2, str3, A1C);
                                }
                            }
                            GraphQLXFBCommerceSellerProfileInfoRow graphQLXFBCommerceSellerProfileInfoRow3 = GraphQLXFBCommerceSellerProfileInfoRow.ADDRESS;
                            if (A0f.contains(graphQLXFBCommerceSellerProfileInfoRow3)) {
                                String str4 = byp.A08;
                                if (str4 != null && str4.length() != 0) {
                                    A02(C1u3.A50, messengerThreadSettingsCommerceInfoRows, graphQLXFBCommerceSellerProfileInfoRow3, str4, A1C);
                                }
                            }
                            GraphQLXFBCommerceSellerProfileInfoRow graphQLXFBCommerceSellerProfileInfoRow4 = GraphQLXFBCommerceSellerProfileInfoRow.HOURS;
                            if (A0f.contains(graphQLXFBCommerceSellerProfileInfoRow4)) {
                                String str5 = byp.A09;
                                if (str5 != null && str5.length() != 0) {
                                    A02(C1u3.A1i, messengerThreadSettingsCommerceInfoRows, graphQLXFBCommerceSellerProfileInfoRow4, str5, A1C);
                                }
                            }
                            GraphQLXFBCommerceSellerProfileInfoRow graphQLXFBCommerceSellerProfileInfoRow5 = GraphQLXFBCommerceSellerProfileInfoRow.LIKES;
                            if (A0f.contains(graphQLXFBCommerceSellerProfileInfoRow5)) {
                                String str6 = byp.A0A;
                                if (str6 != null && str6.length() != 0) {
                                    A02(C1u3.A42, messengerThreadSettingsCommerceInfoRows, graphQLXFBCommerceSellerProfileInfoRow5, str6, A1C);
                                }
                            }
                            GraphQLXFBCommerceSellerProfileInfoRow graphQLXFBCommerceSellerProfileInfoRow6 = GraphQLXFBCommerceSellerProfileInfoRow.FRIENDED_FANS;
                            if (A0f.contains(graphQLXFBCommerceSellerProfileInfoRow6)) {
                                String str7 = byp.A07;
                                if (str7 != null && str7.length() != 0) {
                                    MigColorScheme migColorScheme = messengerThreadSettingsCommerceInfoRows.A03;
                                    A1C.put(graphQLXFBCommerceSellerProfileInfoRow6, A00(C1u3.A39, null, new 5Op(byp, migColorScheme, 4YU.A0z(messengerThreadSettingsCommerceInfoRows.A02)), migColorScheme, null, str7));
                                }
                            }
                            GraphQLXFBCommerceSellerProfileInfoRow graphQLXFBCommerceSellerProfileInfoRow7 = GraphQLXFBCommerceSellerProfileInfoRow.RATING;
                            if (A0f.contains(graphQLXFBCommerceSellerProfileInfoRow7)) {
                                String str8 = byp.A0C;
                                if (str8 != null && str8.length() != 0) {
                                    A02(C1u3.A63, messengerThreadSettingsCommerceInfoRows, graphQLXFBCommerceSellerProfileInfoRow7, str8, A1C);
                                }
                            }
                            GraphQLXFBCommerceSellerProfileInfoRow graphQLXFBCommerceSellerProfileInfoRow8 = GraphQLXFBCommerceSellerProfileInfoRow.WEBSITE;
                            if (A0f.contains(graphQLXFBCommerceSellerProfileInfoRow8)) {
                                Uri uri = byp.A00;
                                if (uri != null) {
                                    String A02 = 11T.A02(uri);
                                    C1u3 c1u3 = C1u3.A3W;
                                    MigColorScheme migColorScheme2 = messengerThreadSettingsCommerceInfoRows.A03;
                                    A1C.put(graphQLXFBCommerceSellerProfileInfoRow8, A00(c1u3, new Cvm(uri, messengerThreadSettingsCommerceInfoRows, 7), null, migColorScheme2, Integer.valueOf(migColorScheme2.AZc()), A02));
                                }
                            }
                            GraphQLXFBCommerceSellerProfileInfoRow graphQLXFBCommerceSellerProfileInfoRow9 = GraphQLXFBCommerceSellerProfileInfoRow.PRICE_RANGE;
                            if (A0f.contains(graphQLXFBCommerceSellerProfileInfoRow9)) {
                                String str9 = byp.A0B;
                                if (str9 != null && str9.length() != 0) {
                                    A02(C1u3.A26, messengerThreadSettingsCommerceInfoRows, graphQLXFBCommerceSellerProfileInfoRow9, str9, A1C);
                                }
                            }
                            GraphQLXFBCommerceSellerProfileInfoRow graphQLXFBCommerceSellerProfileInfoRow10 = GraphQLXFBCommerceSellerProfileInfoRow.CMS_ADDRESS;
                            if (A0f.contains(graphQLXFBCommerceSellerProfileInfoRow10)) {
                                String str10 = byp.A05;
                                if (str10 != null && str10.length() != 0) {
                                    A02(C1u3.A50, messengerThreadSettingsCommerceInfoRows, graphQLXFBCommerceSellerProfileInfoRow10, str10, A1C);
                                }
                            }
                            GraphQLXFBCommerceSellerProfileInfoRow graphQLXFBCommerceSellerProfileInfoRow11 = GraphQLXFBCommerceSellerProfileInfoRow.CMS_EMAIL;
                            if (A0f.contains(graphQLXFBCommerceSellerProfileInfoRow11)) {
                                String str11 = byp.A06;
                                if (str11 != null && str11.length() != 0) {
                                    A02(C1u3.A2V, messengerThreadSettingsCommerceInfoRows, graphQLXFBCommerceSellerProfileInfoRow11, str11, A1C);
                                }
                            }
                            1Du it = immutableList2.iterator();
                            while (it.hasNext()) {
                                Object next = it.next();
                                if (A1C.containsKey(next)) {
                                    A0h.m11011add(A1C.get(next));
                                }
                            }
                        }
                        immutableList = 1Fj.A01(A0h);
                        r0.A09("messaging.business.bmcconsiderationgrowth.sellerprofile.commerceinforows.MessengerThreadSettingsCommerceInfoRows", "messaging.threadsettings.row.RowInterfaceSpec", "getRows", andIncrement2);
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04((Exception) null, "messaging.business.bmcconsiderationgrowth.sellerprofile.commerceinforows.MessengerThreadSettingsCommerceInfoRows", "messaging.threadsettings.row.RowInterfaceSpec", "getRows", andIncrement2);
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
        return AbN.A0d(this.A09, 1BK.A00());
    }
}
