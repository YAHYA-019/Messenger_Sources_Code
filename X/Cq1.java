package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.search.constants.DataSourceIdentifier;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: Cq1.class */
public final class Cq1 implements DIW {
    public static final 2T9 A08 = new B4c(4);
    public 1BY A00;
    public final FbUserSession A01;
    public final C6o A07;
    public final C00i A02 = 1BV.A01((1BY) null, 17055);
    public final C00i A03 = 1BQ.A02(17058);
    public final C00i A04 = 1BV.A01((1BY) null, 50092);
    public final C00i A06 = 1BQ.A02(17029);
    public final C00i A05 = 1BQ.A02(84342);

    public Cq1(FbUserSession fbUserSession, 1BO r303, C6o c6o) {
        this.A00 = 7zL.A0Q(r303);
        this.A07 = c6o;
        this.A01 = fbUserSession;
    }

    private void A00(String str, Object... objArr) {
        ((C11894xu) 1Lo.A04((Context) null, this.A01, this.A00, 84564)).A00("orca:SearchContactsDataSource", str, objArr);
    }

    public void A5L(DFe dFe) {
    }

    public DataSourceIdentifier AgX() {
        return null;
    }

    public /* bridge */ /* synthetic */ C1323Ae1 Cpm(ByH byH, Object obj) {
        int i;
        String str = (String) obj;
        C00j.A05("SearchContactsDataSource.Filtering", -1419423042);
        ImmutableList of = ImmutableList.of();
        C00i c00i = this.A05;
        int A04 = AbK.A04(c00i);
        try {
            try {
                AbF.A0Z(c00i).A02(A04, "orca:SearchContactsDataSource", "searchUsers");
                String trim = str != null ? str.trim() : "";
                if (trim.length() != 0 || this.A07.A00) {
                    2eW A00 = ((2eT) this.A02.get()).A00("SearchContactsDataSource for facebook users");
                    A00.A03 = trim;
                    A00.A05 = C1r4.A05;
                    A00.A07 = true;
                    A00.A0B = true;
                    A00.A0E = true;
                    A00.A01 = 2eX.A04;
                    A00.A0K = true;
                    A00.A00 = 30;
                    this.A03.get();
                    C00i c00i2 = this.A06;
                    c00i2.get();
                    FbUserSession fbUserSession = this.A01;
                    ImmutableList immutableList = C1r4.A03;
                    A00.A05 = immutableList;
                    1Lo.A06(fbUserSession, 33127);
                    A00("QueryString Not Optimized: \"%s\"", null);
                    c00i2.get();
                    A00.A05 = immutableList;
                    1Lo.A06(fbUserSession, 33126);
                    A00("Query Params Not Optimized: \"%s\"", Arrays.toString((Object[]) null));
                    c00i2.get();
                    A00.A05 = immutableList;
                    1Lo.A06(fbUserSession, 33127);
                    A00("Query String Optimized: \"%s\"", null);
                    c00i2.get();
                    A00.A05 = immutableList;
                    1Lo.A06(fbUserSession, 33126);
                    A00("Query Params Optimized: \"%s\"", Arrays.toString((Object[]) null));
                    ArrayList A0s = AnonymousClass001.A0s();
                    2xP A02 = ((2Tw) c00i2.get()).A02(fbUserSession, A00);
                    A02.getClass();
                    while (A02.hasNext()) {
                        A0s.add((User) A02.next());
                    }
                    A00("getContacts(\"%s\") found %d results", trim, 1BK.A0k(A0s));
                    of = 6QB.A00(fbUserSession, A08, (6QB) this.A04.get(), 2To.A07, new DAm(A0s, false), A0s).A00;
                }
                AbF.A0Z(c00i).A01(A04);
                i = -838431260;
            } catch (RuntimeException e) {
                AbF.A0Z(c00i).A00(A04);
                0fH.A0w("orca:SearchContactsDataSource", "Exception while filtering", e);
                of = ImmutableList.of();
                i = -688587972;
            }
            C00j.A01(i);
            return AbG.A0n(of);
        } catch (Throwable th) {
            C00j.A01(822925565);
            throw th;
        }
    }

    public String getFriendlyName() {
        return "SearchContactsDataSource";
    }
}
