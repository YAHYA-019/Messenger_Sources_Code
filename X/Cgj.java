package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.service.model.SendMessageByRecipientsParams;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Cgj.class */
public final class Cgj implements 1Ro {
    public static final String __redex_internal_original_name = "CreateThreadMethod";
    public final CB9 A01 = (CB9) 1Bi.A03(83100);
    public final C1g A00 = (C1g) 1Bn.A0A(84649);

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        SendMessageByRecipientsParams sendMessageByRecipientsParams = (SendMessageByRecipientsParams) obj;
        ArrayList A0s = AnonymousClass001.A0s();
        String str = sendMessageByRecipientsParams.A03;
        if (str != null) {
            A0s.add(new BasicNameValuePair(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str));
        }
        this.A00.A00(sendMessageByRecipientsParams.A01, null, null, A0s);
        C04083zw A0C = AbH.A0C(new BasicNameValuePair("to", CB9.A00(sendMessageByRecipientsParams.A02).toString()), A0s);
        AbF.A1Q(A0C, 4YT.A00(ActionId.COMPONENTS_DATA_SOURCE_DID_END_UPDATES));
        return AbK.A0M(A0C, "me/threads", A0s);
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        return AbK.A18(anonymousClass439.A01(), "tid");
    }
}
