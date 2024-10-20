package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.payments.p2p.service.model.cards.DeletePaymentCardParams;
import java.util.ArrayList;

/* loaded from: Fgw.class */
public final class Fgw implements 1Ro {
    public static final String __redex_internal_original_name = "DeletePaymentCardMethod";

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        ArrayList A0s = AnonymousClass001.A0s();
        C04083zw A0T = DKC.A0T();
        A0T.A0D = "delete_payment_cards";
        A0T.A0E = "DELETE";
        return AbK.A0M(A0T, StringFormatUtil.formatStrLocaleSafe("p2p_%d", 1BK.A0n(((DeletePaymentCardParams) obj).A00)), A0s);
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        return DKH.A0i(anonymousClass439);
    }
}
