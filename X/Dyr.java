package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.graphql.model.GraphQLEntity;
import com.facebook.graphql.model.GraphQLTextWithEntities;

/* loaded from: Dyr.class */
public final class Dyr extends C1rj {
    public static final CallerContext A07 = CallerContext.A0B("QuicksilverFDSErrorSpec");
    public View.OnClickListener A00;
    public View.OnClickListener A01;
    public GraphQLTextWithEntities A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;

    public Dyr() {
        super("QuicksilverFDSError");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00, this.A01, this.A03, this.A04, this.A05, this.A06, this.A02};
    }

    /* JADX WARN: Type inference failed for: r0v228, types: [X.Dg5, X.GKV, X.Dfl] */
    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        1LI r314;
        2cL r3142;
        String A0X;
        String A0a;
        GraphQLTextWithEntities graphQLTextWithEntities = this.A02;
        String str = this.A05;
        String str2 = this.A04;
        String str3 = this.A06;
        String str4 = this.A03;
        View.OnClickListener onClickListener = this.A01;
        11T.A0F(r302, 0);
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        A01.A0Q();
        Context context = r302.A0D;
        2Mg r0 = 2Me.A02;
        A01.A1H(r0.A00(context));
        C2166Dfu A00 = EVm.A00(r302);
        C1rq A012 = C1rg.A01(r302, null, 0);
        A012.A2b();
        A012.A2c();
        C26z c26z = C26z.ALL;
        A012.A25(c26z, 8.0f);
        C2173Dg1 A002 = C2173Dg1.A00(r302);
        11T.A0A(context);
        A002.A0h(C2rY.A00(context) ? 3Eh.A29 : 3Eh.A26);
        ((AbstractC2156Dfk) A002).A03 = ERE.A01;
        ((AbstractC2156Dfk) A002).A02 = ERC.A06;
        ((AbstractC2156Dfk) A002).A04 = 2MR.A1g;
        CallerContext callerContext = A07;
        AbstractC2178Dg6.A09(callerContext, A002, A012);
        AbstractC2150Dfe A0g = A00.A0g(A012.A00);
        A0g.A04 = 1LI.A09(r302, Dyr.class, "QuicksilverFDSError", -1124185393);
        Resources resources = context.getResources();
        A0g.A06 = resources.getString(2131957311);
        AbstractC2178Dg6.A0F(A0g, EMz.A05, r302);
        A0g.A07 = "android.widget.Button";
        CallerContext callerContext2 = CallerContext.A08;
        1LI A0O = A0g.A0O(callerContext2);
        C1rq A013 = C1rg.A01(r302, null, 0);
        A013.A0l(52.0f);
        A013.A2f(A0O);
        C1rq A014 = C1rg.A01(r302, null, 0);
        A014.A0Q();
        A014.A2c();
        C2152Dfg c2152Dfg = new C2152Dfg(r302);
        String string = resources.getString(2131957316);
        if (string == null) {
            ((ESq) c2152Dfg).A00 = true;
        }
        c2152Dfg.A05 = string;
        c2152Dfg.A03 = EP4.A0I;
        c2152Dfg.A0e(true);
        AbstractC2178Dg6.A09(callerContext, c2152Dfg, A014);
        A014.A17(18.0f);
        A014.A25(C26z.RIGHT, 52.0f);
        A013.A2e(A014);
        A01.A2e(A013.A00);
        AbstractC2178Dg6 abstractC2178Dg6 = new AbstractC2178Dg6(r302);
        C26z c26z2 = C26z.HORIZONTAL;
        EPJ epj = EPJ.A0o;
        abstractC2178Dg6.A0X(c26z2, F0a.A01(epj, r302));
        AbstractC2178Dg6.A07(callerContext, abstractC2178Dg6, A01);
        if (str == null || str.length() == 0) {
            r314 = null;
        } else {
            C2165Dft c2165Dft = new C2165Dft(r302);
            c2165Dft.A0i(str);
            if (str2 != null) {
                c2165Dft.A08 = new F7z(EMb.A03, str2, false);
            }
            ?? abstractC2157Dfl = new AbstractC2157Dfl(r302);
            abstractC2157Dfl.A0f(str3);
            abstractC2157Dfl.A07 = "FDS_PROFILE_PHOTO_AX_LABEL_FIX_ME";
            abstractC2157Dfl.A04 = ENi.A02;
            abstractC2157Dfl.A00 = ENG.A0A.mSizeDip;
            c2165Dft.A01 = new Ecz(abstractC2157Dfl);
            r314 = c2165Dft.A0O(callerContext);
        }
        A01.A2e(r314);
        C2152Dfg c2152Dfg2 = new C2152Dfg(r302);
        0Dc A0P = 7zP.A0P(context);
        if (graphQLTextWithEntities != null && (A0X = graphQLTextWithEntities.A0X()) != null && A0X.length() != 0) {
            A0P.A02(A0X);
            1Du it = graphQLTextWithEntities.A0d().iterator();
            while (it.hasNext()) {
                MT1 mt1 = (MT1) it.next();
                int A0I = mt1.A0I(-1019779949);
                String A1C = 7zM.A1C(A0I, mt1.A0I(-1106363674) + A0I, A0X);
                GraphQLEntity A0c = mt1.A0c();
                if (A0c != null && (A0a = A0c.A0a(116079)) != null) {
                    8C6 r02 = new 8C6(A0a);
                    r02.A03 = false;
                    r02.A00 = r0.A03(context, 2MR.A0M);
                    A0P.A05(r02, A1C, A1C, 33);
                }
            }
        }
        c2152Dfg2.A05 = 7zM.A0E(A0P);
        FAa A05 = AbstractC2178Dg6.A05(c2152Dfg2, EP4.A04);
        A05.A02();
        AbstractC2178Dg6.A0G(c2152Dfg2, A05);
        c2152Dfg2.A0i(c26z, 16.0f);
        c2152Dfg2.A0h(c26z2, F0a.A01(epj, r302));
        AbstractC2178Dg6.A07(callerContext2, c2152Dfg2, A01);
        if (onClickListener == null || str4 == null || str4.length() == 0) {
            r3142 = null;
        } else {
            2cM A015 = 2cK.A01(r302, (String) null, 0);
            A015.A0Q();
            A015.A2h(C1rp.FLEX_END);
            A015.A0Y();
            A015.A1A(20.0f);
            AbstractC2162Dfq abstractC2162Dfq = new AbstractC2162Dfq(r302);
            abstractC2162Dfq.A0h(str4);
            abstractC2162Dfq.A03 = ENu.A03;
            abstractC2162Dfq.A02 = ENn.A02;
            AbstractC2178Dg6.A0A(abstractC2162Dfq, r302, Dyr.class, "QuicksilverFDSError", 1633391414);
            AbstractC2178Dg6.A07(callerContext, abstractC2162Dfq, A015);
            r3142 = A015.A00;
        }
        return 7zL.A0V(A01, r3142);
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        View view;
        View.OnClickListener onClickListener;
        int i = r302.A01;
        if (i == -1124185393) {
            1Is r0 = r302.A00.A01;
            view = ((3xC) obj).A00;
            onClickListener = ((Dyr) r0).A00;
        } else {
            if (i == -1048037474) {
                1LI.A0J(r302, obj);
                return null;
            }
            if (i != 1633391414) {
                return null;
            }
            1Is r02 = r302.A00.A01;
            view = ((3xC) obj).A00;
            onClickListener = ((Dyr) r02).A01;
        }
        if (onClickListener == null) {
            return null;
        }
        onClickListener.onClick(view);
        return null;
    }
}
