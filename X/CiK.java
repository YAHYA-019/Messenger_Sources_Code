package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.graphql.enums.GraphQLPagesLoggerEventTargetEnum;
import com.facebook.messaging.business.common.calltoaction.CallToActionContextParams;
import com.facebook.messaging.business.common.calltoaction.model.CallToAction;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.pagesurface.about.params.PageAboutInputParams;

/* loaded from: CiK.class */
public final class CiK implements DGe {
    public final 1Br A00;
    public final 1Br A01 = AbG.A0N();
    public final CHz A02;
    public final 1I7 A03;
    public final 1De A04;

    public CiK(1De r302) {
        this.A04 = r302;
        1Br A0O = AbI.A0O(r302);
        this.A00 = A0O;
        this.A03 = (1I7) 7zR.A0o(AbJ.A05(A0O), 65728);
        this.A02 = (CHz) 1Bi.A03(84986);
    }

    @Override // X.DGe
    public C4Nc Aav() {
        return C4Nc.A0E;
    }

    @Override // X.DGe
    public boolean BLp(Context context, CallToActionContextParams callToActionContextParams, CallToAction callToAction) {
        5Pm r0;
        6Ay BCm;
        ArE BEO;
        11T.A0F(callToActionContextParams, 2);
        Message message = callToActionContextParams.A05;
        String str = null;
        if (message == null || (r0 = message.A08) == null || (BCm = r0.BCm()) == null || (BEO = BCm.BEO()) == null) {
            ThreadKey threadKey = callToActionContextParams.A06;
            if (threadKey != null) {
                str = String.valueOf(Long.valueOf(threadKey.A02));
            }
        } else {
            str = BEO.A0k();
        }
        if (str == null || str.length() == 0 || callToActionContextParams.A00 == null) {
            return false;
        }
        if (callToActionContextParams.A04 == BMF.A0P) {
            C1kw A08 = AbI.A08(this.A01);
            if (AgB.A00 == null) {
                synchronized (AgB.class) {
                    if (AgB.A00 == null) {
                        AgB.A00 = new C2J3(A08);
                    }
                }
            }
            AbstractC01593ro A07 = AbF.A07(AgB.A00, "page_about_platform_menu_clicked", false);
            if (A07.A0B()) {
                A07.A06("pigeon_reserved_keyword_module", "pages_public_view");
                A07.A06("page_id", str);
                A07.A0A();
            }
            this.A02.A02(GraphQLPagesLoggerEventTargetEnum.A01, 0S2.A01, "bot_menu", (java.util.Map) null, Long.parseLong(str));
        }
        PageAboutInputParams pageAboutInputParams = new PageAboutInputParams(callToActionContextParams.A06, "messenger_cta_url", str);
        Intent A0A = 4YU.A0A("open_page_about_extension");
        A0A.putExtra(7zK.A00(397), pageAboutInputParams);
        this.A03.CkS(A0A);
        return true;
    }
}
