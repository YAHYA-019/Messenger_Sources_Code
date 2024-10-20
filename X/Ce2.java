package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.communitymessaging.model.Community;
import com.facebook.messaging.communitymessaging.plugins.communityinfo.bumpcommunitycontainerrow.BumpCommunityContainerRowImplementation;
import com.facebook.messaging.communitymessaging.plugins.communityinfo.communitynicknamerow.CommunityNicknameRowImplementation;
import com.facebook.messaging.communitymessaging.plugins.communityinfo.unbumpcommunitycontainerrow.UnbumpCommunityContainerRowImplementation;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: Ce2.class */
public final class Ce2 implements DIM {
    public BumpCommunityContainerRowImplementation A01;
    public CommunityNicknameRowImplementation A02;
    public UnbumpCommunityContainerRowImplementation A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public String[] A07;
    public final Context A08;
    public final 06Z A09;
    public final FbUserSession A0A;
    public final ThreadKey A0B;
    public final ThreadSummary A0C;
    public final DJX A0E;
    public final DHb A0F;
    public final DHc A0G;
    public final DHd A0H;
    public final MigColorScheme A0I;
    public final User A0J;
    public final Capabilities A0K;
    public final 2Sh A0L;
    public final C1783AsH A0M;
    public final ImmutableList A0N;
    public int A00 = -1;
    public final 1YC A0D = 1YC.A03;

    public Ce2(Context context, 06Z r303, FbUserSession fbUserSession, ThreadKey threadKey, ThreadSummary threadSummary, DJX djx, DHb dHb, DHc dHc, DHd dHd, MigColorScheme migColorScheme, User user, Capabilities capabilities, 2Sh r314, C1783AsH c1783AsH, ImmutableList immutableList) {
        this.A08 = context;
        this.A0A = fbUserSession;
        this.A0B = threadKey;
        this.A0K = capabilities;
        this.A0C = threadSummary;
        this.A0L = r314;
        this.A0M = c1783AsH;
        this.A09 = r303;
        this.A0J = user;
        this.A0N = immutableList;
        this.A0G = dHc;
        this.A0F = dHb;
        this.A0H = dHd;
        this.A0E = djx;
        this.A0I = migColorScheme;
    }

    private boolean A00() {
        Object obj;
        if (this.A04 == null) {
            AtomicInteger atomicInteger = C1Y6.A04;
            int andIncrement = atomicInteger.getAndIncrement();
            1YC r0 = this.A0D;
            String A0y = AbM.A0y(r0, "com.facebook.messaging.communitymessaging.plugins.communityinfo.bumpcommunitycontainerrow.BumpCommunityContainerRowImplementation", "messaging.communitymessaging.communityinfo.bumpcommunitycontainerrow.BumpCommunityContainerRowImplementation", andIncrement);
            Exception exc = null;
            try {
                try {
                    if (BYm.A00(r0, atomicInteger)) {
                        ThreadSummary threadSummary = this.A0C;
                        if (threadSummary != null && threadSummary.A0m == null) {
                            1WY r02 = (1WY) 1Bi.A03(66481);
                            if (r02.A05() && 1WY.A01(r02).AZk(36315340068365103L)) {
                                this.A01 = new BumpCommunityContainerRowImplementation(this.A08, this.A0A, threadSummary, this.A0L);
                                obj = C1Y6.A02;
                                this.A04 = obj;
                                r0.A07("messaging.communitymessaging.communityinfo.bumpcommunitycontainerrow.BumpCommunityContainerRowImplementation", A0y, andIncrement, 1BL.A1U(obj));
                            }
                        }
                    }
                    obj = C1Y6.A03;
                    this.A04 = obj;
                    r0.A07("messaging.communitymessaging.communityinfo.bumpcommunitycontainerrow.BumpCommunityContainerRowImplementation", A0y, andIncrement, 1BL.A1U(obj));
                } catch (Exception e) {
                    this.A04 = C1Y6.A03;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        exc = e;
                        r0.A03(exc, "messaging.communitymessaging.communityinfo.bumpcommunitycontainerrow.BumpCommunityContainerRowImplementation", A0y, andIncrement, 1BL.A1U(this.A04));
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r0.A03(exc, "messaging.communitymessaging.communityinfo.bumpcommunitycontainerrow.BumpCommunityContainerRowImplementation", A0y, andIncrement, 1BL.A1U(this.A04));
                throw th;
            }
        }
        return 1BK.A1U(this.A04);
    }

    private boolean A01() {
        Object obj;
        if (this.A05 == null) {
            AtomicInteger atomicInteger = C1Y6.A04;
            int andIncrement = atomicInteger.getAndIncrement();
            1YC r0 = this.A0D;
            String A0y = AbM.A0y(r0, "com.facebook.messaging.communitymessaging.plugins.communityinfo.communitynicknamerow.CommunityNicknameRowImplementation", "messaging.communitymessaging.communityinfo.communitynicknamerow.CommunityNicknameRowImplementation", andIncrement);
            Exception exc = null;
            try {
                try {
                    if (BYm.A00(r0, atomicInteger)) {
                        ThreadSummary threadSummary = this.A0C;
                        FbUserSession fbUserSession = this.A0A;
                        2Sh r02 = this.A0L;
                        Context context = this.A08;
                        7zS.A16(1, fbUserSession, r02, context);
                        1MV A00 = 1Lo.A00(context, fbUserSession, 33174);
                        Community A0W = AbI.A0W(r02);
                        if ((threadSummary != null ? threadSummary.A0g : null) == 1F9.A0B && A0W != null && ((22F) A00.get()).A00(37, 7zU.A07(A0W))) {
                            if (2yD.A03(AbF.A0q(1Bi.A03(66481)), 36319055203808836L)) {
                                this.A02 = new CommunityNicknameRowImplementation(context, this.A09, r02);
                                obj = C1Y6.A02;
                                this.A05 = obj;
                                r0.A07("messaging.communitymessaging.communityinfo.communitynicknamerow.CommunityNicknameRowImplementation", A0y, andIncrement, 1BL.A1U(obj));
                            }
                        }
                    }
                    obj = C1Y6.A03;
                    this.A05 = obj;
                    r0.A07("messaging.communitymessaging.communityinfo.communitynicknamerow.CommunityNicknameRowImplementation", A0y, andIncrement, 1BL.A1U(obj));
                } catch (Exception e) {
                    this.A05 = C1Y6.A03;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        exc = e;
                        r0.A03(exc, "messaging.communitymessaging.communityinfo.communitynicknamerow.CommunityNicknameRowImplementation", A0y, andIncrement, 1BL.A1U(this.A05));
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r0.A03(exc, "messaging.communitymessaging.communityinfo.communitynicknamerow.CommunityNicknameRowImplementation", A0y, andIncrement, 1BL.A1U(this.A05));
                throw th;
            }
        }
        return 1BK.A1U(this.A05);
    }

    private boolean A02() {
        Object obj;
        if (this.A06 == null) {
            AtomicInteger atomicInteger = C1Y6.A04;
            int andIncrement = atomicInteger.getAndIncrement();
            1YC r0 = this.A0D;
            String A0y = AbM.A0y(r0, "com.facebook.messaging.communitymessaging.plugins.communityinfo.unbumpcommunitycontainerrow.UnbumpCommunityContainerRowImplementation", "messaging.communitymessaging.communityinfo.unbumpcommunitycontainerrow.UnbumpCommunityContainerRowImplementation", andIncrement);
            Exception exc = null;
            try {
                try {
                    if (BYm.A00(r0, atomicInteger)) {
                        ThreadSummary threadSummary = this.A0C;
                        if (threadSummary != null) {
                            ThreadKey threadKey = threadSummary.A0m;
                            if (11T.A0O(threadKey != null ? AbF.A14(threadKey) : null, ThreadKey.A08)) {
                                1WY r02 = (1WY) 1Bi.A03(66481);
                                if (r02.A05() && 1WY.A01(r02).AZk(36315340068365103L)) {
                                    this.A03 = new UnbumpCommunityContainerRowImplementation(this.A08, this.A0A, threadSummary, this.A0L);
                                    obj = C1Y6.A02;
                                    this.A06 = obj;
                                    r0.A07("messaging.communitymessaging.communityinfo.unbumpcommunitycontainerrow.UnbumpCommunityContainerRowImplementation", A0y, andIncrement, 1BL.A1U(obj));
                                }
                            }
                        }
                    }
                    obj = C1Y6.A03;
                    this.A06 = obj;
                    r0.A07("messaging.communitymessaging.communityinfo.unbumpcommunitycontainerrow.UnbumpCommunityContainerRowImplementation", A0y, andIncrement, 1BL.A1U(obj));
                } catch (Exception e) {
                    this.A06 = C1Y6.A03;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        exc = e;
                        r0.A03(exc, "messaging.communitymessaging.communityinfo.unbumpcommunitycontainerrow.UnbumpCommunityContainerRowImplementation", A0y, andIncrement, 1BL.A1U(this.A06));
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r0.A03(exc, "messaging.communitymessaging.communityinfo.unbumpcommunitycontainerrow.UnbumpCommunityContainerRowImplementation", A0y, andIncrement, 1BL.A1U(this.A06));
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
        String[] strArr = this.A07;
        if (strArr == null) {
            int i = this.A00;
            int i2 = i;
            if (i == -1) {
                boolean A01 = A01();
                boolean z = A01;
                if (A00()) {
                    z = (A01 ? 1 : 0) + 1;
                }
                boolean z2 = z;
                if (A02()) {
                    z2 = (z ? 1 : 0) + 1;
                }
                this.A00 = z2 ? 1 : 0;
                i2 = z2;
            }
            int i3 = 0;
            strArr = new String[i2];
            if (A01()) {
                strArr[0] = "community_nickname_row";
                i3 = 1;
            }
            if (A00()) {
                strArr[i3] = "bump_community_container_row";
                i3++;
            }
            if (A02()) {
                strArr[i3] = "unbump_community_container_row";
            }
            this.A07 = strArr;
        }
        return strArr;
    }

    public DG9 B8K(String str) {
        int andIncrement;
        String str2;
        Cug A03;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement2 = atomicInteger.getAndIncrement();
        1YC r0 = this.A0D;
        String A18 = AbF.A18(r0, andIncrement2);
        try {
            try {
                try {
                    if (str.equals("community_nickname_row") && A01()) {
                        andIncrement = atomicInteger.getAndIncrement();
                        str2 = "messaging.communitymessaging.communityinfo.communitynicknamerow.CommunityNicknameRowImplementation";
                        r0.A0A("com.facebook.messaging.communitymessaging.plugins.communityinfo.communitynicknamerow.CommunityNicknameRowImplementation", str2, "com.facebook.messaging.threadsettings.plugins.interfaces.row.RowInterfaceSpec", andIncrement, "messaging.threadsettings.row.RowInterfaceSpec", "com.facebook.messaging.communitymessaging.plugins.communityinfo.CommunitymessagingCommunityinfoKillSwitch", A18);
                        CommunityNicknameRowImplementation communityNicknameRowImplementation = this.A02;
                        CQg A00 = CQg.A00();
                        CQg.A07(communityNicknameRowImplementation.A00, A00, 2131952262);
                        CQg.A08(BNV.A0a, A00);
                        A00.A00 = 2395529621L;
                        CHv.A00(2MQ.A38, A00, (C1ut) null);
                        A00.A05 = new CII((Drawable) null, (Uri) null, C1u3.A6P, (C1ut) null, (Boolean) null);
                        A03 = CQg.A03(A00, communityNicknameRowImplementation, 73);
                    } else if (str.equals("bump_community_container_row") && A00()) {
                        andIncrement = atomicInteger.getAndIncrement();
                        str2 = "messaging.communitymessaging.communityinfo.bumpcommunitycontainerrow.BumpCommunityContainerRowImplementation";
                        r0.A0A("com.facebook.messaging.communitymessaging.plugins.communityinfo.bumpcommunitycontainerrow.BumpCommunityContainerRowImplementation", str2, "com.facebook.messaging.threadsettings.plugins.interfaces.row.RowInterfaceSpec", andIncrement, "messaging.threadsettings.row.RowInterfaceSpec", "com.facebook.messaging.communitymessaging.plugins.communityinfo.CommunitymessagingCommunityinfoKillSwitch", A18);
                        BumpCommunityContainerRowImplementation bumpCommunityContainerRowImplementation = this.A01;
                        Context context = bumpCommunityContainerRowImplementation.A00;
                        int i = 2131952264;
                        if (AbJ.A0Q(bumpCommunityContainerRowImplementation.A02).A04()) {
                            i = 2131967091;
                        }
                        CQg A01 = CQg.A01(1BK.A0u(context, i));
                        CQg.A08(BNV.A0O, A01);
                        A01.A00 = 583249726L;
                        CHv.A00(2MQ.A23, A01, (C1ut) null);
                        A01.A05 = new CII((Drawable) null, (Uri) null, C1u3.A4K, (C1ut) null, (Boolean) null);
                        A03 = CQg.A03(A01, bumpCommunityContainerRowImplementation, 67);
                    } else {
                        if (!str.equals("unbump_community_container_row") || !A02()) {
                            r0.A02((Exception) null, "messaging.threadsettings.row.RowInterfaceSpec", A18, andIncrement2);
                            return null;
                        }
                        andIncrement = atomicInteger.getAndIncrement();
                        str2 = "messaging.communitymessaging.communityinfo.unbumpcommunitycontainerrow.UnbumpCommunityContainerRowImplementation";
                        r0.A0A("com.facebook.messaging.communitymessaging.plugins.communityinfo.unbumpcommunitycontainerrow.UnbumpCommunityContainerRowImplementation", str2, "com.facebook.messaging.threadsettings.plugins.interfaces.row.RowInterfaceSpec", andIncrement, "messaging.threadsettings.row.RowInterfaceSpec", "com.facebook.messaging.communitymessaging.plugins.communityinfo.CommunitymessagingCommunityinfoKillSwitch", A18);
                        UnbumpCommunityContainerRowImplementation unbumpCommunityContainerRowImplementation = this.A03;
                        Context context2 = unbumpCommunityContainerRowImplementation.A00;
                        int i2 = 2131952263;
                        if (AbJ.A0Q(unbumpCommunityContainerRowImplementation.A02).A04()) {
                            i2 = 2131967220;
                        }
                        CQg A012 = CQg.A01(1BK.A0u(context2, i2));
                        CQg.A08(BNV.A2Q, A012);
                        A012.A00 = 1659788933L;
                        CHv.A00(2MQ.A1I, A012, (C1ut) null);
                        A012.A05 = new CII((Drawable) null, (Uri) null, C1u3.A2d, (C1ut) null, (Boolean) null);
                        A03 = CQg.A03(A012, unbumpCommunityContainerRowImplementation, 76);
                    }
                    r0.A09(str2, "messaging.threadsettings.row.RowInterfaceSpec", A18, andIncrement);
                    r0.A02((Exception) null, "messaging.threadsettings.row.RowInterfaceSpec", A18, andIncrement2);
                    return A03;
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
        return AbN.A0f(this.A0D, 1BK.A00());
    }

    public AtG BLB(String str) {
        return AbN.A0d(this.A0D, 1BK.A00());
    }
}
