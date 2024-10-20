package X;

import com.facebook.messaging.phoneconfirmation.protocol.ConfirmPhoneMethod$Params;
import com.google.common.collect.ImmutableList;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Fgr.class */
public final class Fgr implements 1Ro {
    public static final String __redex_internal_original_name = "ConfirmPhoneMethod";

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        ImmutableList of = ImmutableList.of((Object) new BasicNameValuePair("code", ((ConfirmPhoneMethod$Params) obj).A00), (Object) new BasicNameValuePair("format", "json"));
        0fH.A0A(Fgr.class, 0Pz.A0V("Request: ", of));
        C04083zw c04083zw = new C04083zw();
        AbF.A1Q(c04083zw, "confirmPhone");
        return AbN.A0F(c04083zw, "method/user.confirmMessengerPhone", of);
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        0fH.A0A(Fgr.class, 0Pz.A0W("Response: ", anonymousClass439.A01().A0H()));
        return null;
    }
}
