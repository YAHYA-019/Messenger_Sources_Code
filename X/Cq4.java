package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.search.constants.DataSourceIdentifier;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PrivacyContext;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.SettableFuture;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

/* loaded from: Cq4.class */
public final class Cq4 implements DIW {
    public 5O6 A00;
    public Long A01;
    public final Context A02;
    public final FbUserSession A03;
    public final 1Br A04;
    public final 53M A07;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final 1Br A06 = AbG.A0S();
    public final C1325Ae3 A08 = new C1325Ae3();
    public final PrivacyContext A09 = AbH.A0t("FBLegacyBroker", "2971616476299527");
    public final 1Br A05 = AbG.A0K();

    public Cq4(Context context, FbUserSession fbUserSession, 53M r304, boolean z, boolean z2, boolean z3) {
        this.A02 = context;
        this.A03 = fbUserSession;
        this.A0A = z;
        this.A0B = z2;
        this.A0C = z3;
        this.A07 = r304;
        this.A04 = 1Bu.A01(context, 84334);
        if (r304 == 53M.A0Q) {
            this.A01 = AcP.A03(context, fbUserSession);
        }
    }

    public static final C1333AeN A00(Cq4 cq4, ImmutableList immutableList) {
        boolean z = cq4.A0A;
        EnumC1297Ada enumC1297Ada = z ? EnumC1297Ada.A0t : EnumC1297Ada.A14;
        Resources resources = cq4.A02.getResources();
        int i = 2131959911;
        if (z) {
            i = 2131959906;
        }
        return new C1333AeN(enumC1297Ada, immutableList, resources.getString(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x058b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.google.common.collect.ImmutableList A01(X.Cq4 r301, X.BEP r302, boolean r303) {
        /*
            Method dump skipped, instructions count: 1500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cq4.A01(X.Cq4, X.BEP, boolean):com.google.common.collect.ImmutableList");
    }

    public static final SettableFuture A02(Cq4 cq4) {
        int i;
        SettableFuture A0j = 4YU.A0j();
        BDT bdt = (BDT) 1Lm.A05(cq4.A02, cq4.A03, 84155);
        if (cq4.A0C) {
            i = 20;
        } else {
            i = 3;
            if (cq4.A0B) {
                i = 5;
            }
        }
        bdt.A00(new Czk(A0j, 100), i, 2To.A0F.msysDbValue, cq4.A0A, true, AbL.A0N(cq4.A06).AZk(36323242797451638L), false);
        return A0j;
    }

    public static final void A03(Cq4 cq4, ImmutableList immutableList) {
        5O6 r0 = cq4.A00;
        if (r0 != null) {
            AbF.A1S(r0, immutableList);
            if (!immutableList.isEmpty()) {
                ((AcX) 1BK.A0r(immutableList)).A01 = r0;
            }
            ((2eN) 1Br.A0B(cq4.A04)).A01(r0, "search ended");
        }
    }

    public static final boolean A04(Cq4 cq4, BEP bep, boolean z) {
        String str;
        ImmutableList.Builder A0h = 4YU.A0h();
        ArrayList A0s = AnonymousClass001.A0s();
        ArrayList A0s2 = AnonymousClass001.A0s();
        int A00 = 1qX.A00(bep);
        for (int i = 0; i < A00; i++) {
            Long A0w = AbJ.A0w(bep, i);
            if (A0w != null) {
                A0h.m11011add((Object) A0w);
            }
            Long A0m = 1BK.A0m(((1qX) bep).mResultSet, i, 0);
            if (z) {
                A0s.add(A0m);
            } else {
                A0s2.add(A0m);
            }
        }
        try {
            SettableFuture A0j = 4YU.A0j();
            MailboxFeature mailboxFeature = (MailboxFeature) 1Lm.A05(cq4.A02, cq4.A03, 84155);
            ImmutableList build = A0h.build();
            if (!z) {
                A0s = A0s2;
            }
            PrivacyContext privacyContext = cq4.A09;
            Czk czk = new Czk(A0j, ActionId.ON_VIEW_CREATED_END);
            1Um A0O = 1BK.A0O(mailboxFeature, 0);
            MailboxFutureImpl A0Q = 1BK.A0Q(A0O, czk);
            1Um.A02(A0O, new CyC(0, build, A0Q, mailboxFeature, A0s, privacyContext), A0Q, false);
            Object obj = A0j.get();
            11T.A0A(obj);
            return ((Boolean) obj).booleanValue();
        } catch (InterruptedException e) {
            e = e;
            str = "InterruptedException while loading unjoined community and community chat info from msys";
            0fH.A0s("SuggestedJoinedUnjoinedCommunityDataSource", str, e);
            return false;
        } catch (ExecutionException e2) {
            e = e2;
            str = "ExecutionException while loading unjoined community and community chat info from msys";
            0fH.A0s("SuggestedJoinedUnjoinedCommunityDataSource", str, e);
            return false;
        }
    }

    public final ImmutableList A05() {
        BEP bep;
        BEP bep2 = (BEP) A02(this).get();
        if (bep2 == null) {
            return 1BK.A0b();
        }
        boolean z = this.A0A;
        return (!A04(this, bep2, z) || (bep = (BEP) A02(this).get()) == null) ? A01(this, bep2, z) : A01(this, bep, z);
    }

    public void A5L(DFe dFe) {
        11T.A0F(dFe, 0);
        this.A08.A00(dFe);
    }

    public DataSourceIdentifier AgX() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        if (r306 == null) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ X.C1323Ae1 Cpm(X.ByH r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cq4.Cpm(X.ByH, java.lang.Object):X.Ae1");
    }

    public String getFriendlyName() {
        return "SuggestedJoinedUnjoinedCommunityDataSource";
    }
}
