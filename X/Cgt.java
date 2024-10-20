package X;

import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.common.util.JSONUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Cgt.class */
public final class Cgt implements 1Ro {
    public static final String __redex_internal_original_name = "GetUnseenCountsMethod";
    public final 1H2 A00;
    public final C1m8 A01;
    public final C15h A02;
    public final C15h A03;

    public Cgt() {
        1H2 r0 = (1H2) 1Bi.A03(33032);
        DBe A00 = DBe.A00(this, 32);
        DBe A002 = DBe.A00(this, 33);
        C1m8 c1m8 = (C1m8) 1Bi.A03(16785);
        this.A00 = r0;
        this.A03 = A00;
        this.A02 = A002;
        this.A01 = c1m8;
    }

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new BasicNameValuePair("format", "json"));
        A0s.add(new BasicNameValuePair("device_id", this.A00.A02()));
        C26T c26t = C26T.A00;
        C03353xs c03353xs = new C03353xs(c26t);
        for (BoR boR : (List) obj) {
            2DM A0g = 4YU.A0g(c26t);
            A0g.A0o(ErrorReportingConstants.USER_ID_KEY, boR.A02);
            long j = boR.A00;
            if (j != 0) {
                A0g.A0j("last_update_time", j);
            }
            A0g.A0o("session_token", boR.A01);
            c03353xs.A0d(A0g);
        }
        A0s.add(new BasicNameValuePair("accounts", c03353xs.toString()));
        ViewerContext viewerContext = (ViewerContext) this.A03.get();
        if (viewerContext != null && viewerContext.mIsPageContext) {
            viewerContext = (ViewerContext) this.A02.get();
        }
        C04083zw c04083zw = new C04083zw();
        AbF.A1Q(c04083zw, "switchAccountsGetUnseenCounts");
        c04083zw.A0F = StringFormatUtil.formatStrLocaleSafe("%s/messenger_accounts", viewerContext.mUserId);
        c04083zw.A0J = A0s;
        c04083zw.A06 = 0S2.A01;
        c04083zw.A04(this.A01.A00());
        return c04083zw.A01();
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        anonymousClass439.A03();
        ArrayList A0s = AnonymousClass001.A0s();
        24X A01 = anonymousClass439.A01();
        Iterator it = A01.A0D("accounts").iterator();
        24X A0D = A01.A0D("total_profile_badge_count_since_last_seen");
        while (it.hasNext()) {
            24X r0 = (24X) it.next();
            String A0H = JSONUtil.A0H(r0.A0D(ErrorReportingConstants.USER_ID_KEY), null);
            boolean A0J = JSONUtil.A0J(r0.A0D("is_token_valid"), false);
            int A012 = 4YU.A01(r0, "badge_count", 0);
            A0s.add(new BvV(A0H, C3o5.A0P(r0, "notification_text", null), A012, 4YV.A00(r0, "badge_count_since_last_update_time"), 4YV.A07(r0, "last_update_time"), A0J));
        }
        return new Bk1(A0s, A0D.A06(0));
    }
}
