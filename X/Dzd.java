package X;

import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.pages.app.commshub.suggestions.model.ContextualSuggestionModel;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.Set;

/* loaded from: Dzd.class */
public final class Dzd extends C1rj {
    public long A00;
    public RGb A01;
    public ContextualSuggestionModel A02;

    public Dzd() {
        super("CommsHubContextualSuggestionCardComponent");
    }

    public static String A00(Enl enl, long j) {
        ViewerContext Aue = ((1Ey) enl.A00.A00.get()).Aue();
        6gN.A00((6gN) enl.A02.A00.get(), j);
        return !11T.A0O(Aue, ViewerContext.A01) ? Aue.mUserId : "";
    }

    public static void A01(1UG r301, F5r f5r, Object obj, String str, String str2) {
        11T.A0A(obj);
        r301.A7R(1BJ.A00(193), str);
        r301.A7R("thread_id", str2);
        r301.A5c(((Es3) f5r.A01.get()).A00(), "logged_in_user_type");
        r301.BZL();
    }

    public static boolean A0L(Enl enl, Object obj, Set set) {
        11T.A0D(obj);
        ((C0dp) enl.A01.A00.get()).now();
        11T.A0F(obj, 4);
        return set.contains("platform");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A02, Long.valueOf(this.A00)};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        String str;
        DgT dgT;
        ContextualSuggestionModel contextualSuggestionModel = this.A02;
        String str2 = contextualSuggestionModel.A06;
        DgT dgT2 = null;
        if (str2 == null || (str = contextualSuggestionModel.A03) == null) {
            return null;
        }
        11T.A0F(r302, 0);
        DgT dgT3 = new DgT(r302);
        DgT.A00(dgT3).A0F("android.widget.Button");
        DgT.A00(dgT3).A2K("PRIMARY_BUTTON");
        String str3 = contextualSuggestionModel.A04;
        11T.A0F(str3, 0);
        ((DgM) dgT3).A03 = str3;
        EN4 en4 = EN4.A07;
        ((DgM) dgT3).A01 = en4;
        ((DgM) dgT3).A02 = 1LI.A09(r302, Dzd.class, "CommsHubContextualSuggestionCardComponent", -1016480357);
        DgT dgT4 = new DgT(r302);
        DgT.A00(dgT4).A0F("android.widget.Button");
        Integer num = 0S2.A00;
        ((DgL) dgT4).A00 = num;
        ((DgL) dgT4).A00 = num;
        ((DgN) dgT4).A00 = 1LI.A09(r302, Dzd.class, "CommsHubContextualSuggestionCardComponent", -1921141603);
        DgT.A00(dgT4).A2K("DISMISS_BUTTON");
        String str4 = contextualSuggestionModel.A00;
        if (1JF.A0B(str4)) {
            dgT = null;
        } else {
            dgT = new DgT(r302);
            ((DgP) dgT).A04 = Property.LINE_CAP_SQUARE;
            ((DgP) dgT).A00 = 32;
            QpN qpN = QpN.A02;
            ((DgP) dgT).A02 = qpN;
            ((DgP) dgT).A03 = qpN;
            ((DgP) dgT).A01 = InterfaceC07034in.A01;
            ((DgP) dgT).A05 = str4;
            ((DgP) dgT).A04 = "circle";
        }
        String str5 = contextualSuggestionModel.A05;
        if (!1JF.A0B(str5)) {
            dgT2 = new DgT(r302);
            DgT.A00(dgT2).A0F("android.widget.Button");
            DgT.A00(dgT2).A2K("SECONDARY_BUTTON");
            11T.A0F(str5, 0);
            ((DgM) dgT2).A03 = str5;
            ((DgM) dgT2).A01 = en4;
            ((DgM) dgT2).A02 = 1LI.A09(r302, Dzd.class, "CommsHubContextualSuggestionCardComponent", 256117453);
        }
        Q6U q6u = Rel.A01;
        SGd sGd = new SGd(1LI.A09(r302, Dzd.class, "CommsHubContextualSuggestionCardComponent", 333177064));
        2lO r312 = ((Rel) q6u).A00;
        3vR r0 = new 3vR(0S2.A0Y, sGd);
        if (r312 == 2lO.A02) {
            r312 = null;
        }
        return new Dw9(dgT3, dgT2, new Rel(7zR.A0Q(7zL.A0g(r312, r0), 0S2.A0j, 1)), dgT4, dgT, Qp2.A03, str, str2);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0358  */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable, int] */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A15(X.1Im r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 1258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Dzd.A15(X.1Im, java.lang.Object):java.lang.Object");
    }
}
