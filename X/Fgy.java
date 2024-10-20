package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.payments.p2p.service.model.cards.SetPrimaryCardParams;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Fgy.class */
public final class Fgy implements 1Ro {
    public static final String __redex_internal_original_name = "SetPrimaryCardMethod";

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        SetPrimaryCardParams setPrimaryCardParams = (SetPrimaryCardParams) obj;
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new BasicNameValuePair("preset_credential_id", String.valueOf(setPrimaryCardParams.A00)));
        0fH.A07(Fgy.class, setPrimaryCardParams, "Requesting primary card set with %s");
        C04083zw A0T = DKC.A0T();
        AbF.A1Q(A0T, "p2p_credit_cards");
        return AbK.A0M(A0T, StringFormatUtil.formatStrLocaleSafe("%d/p2p_settings", 1BK.A0n(setPrimaryCardParams.A01)), A0s);
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        return DKH.A0i(anonymousClass439);
    }
}
