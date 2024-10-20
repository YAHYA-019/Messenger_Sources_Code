package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.service.model.SendMessageMethodParams;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Cgs.class */
public final class Cgs implements 1Ro {
    public static final String __redex_internal_original_name = "SendMessageMethod";
    public final CB9 A02 = (CB9) 1Bi.A03(83100);
    public final C1g A01 = (C1g) 1Bn.A0A(84649);
    public final C1m8 A00 = (C1m8) 1Bi.A03(16785);

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        String str;
        ImmutableMap immutableMap;
        SendMessageMethodParams sendMessageMethodParams = (SendMessageMethodParams) obj;
        Message message = sendMessageMethodParams.A00;
        ArrayList A0s = AnonymousClass001.A0s();
        ThreadKey threadKey = message.A0V;
        if (threadKey == null && (immutableMap = message.A12) != null && !immutableMap.isEmpty()) {
            str = "/threads";
        } else if (ThreadKey.A0j(threadKey)) {
            long j = threadKey.A02;
            C26T c26t = C26T.A00;
            C03353xs c03353xs = new C03353xs(c26t);
            String l = Long.toString(j);
            2DM A0g = 4YU.A0g(c26t);
            A0g.A0o(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            A0g.A0o(PublicKeyCredentialControllerUtility.JSON_KEY_ID, l);
            c03353xs.A0d(A0g);
            A0s.add(new BasicNameValuePair("to", c03353xs.toString()));
            str = "me/threads";
        } else {
            A0s.add(new BasicNameValuePair(PublicKeyCredentialControllerUtility.JSON_KEY_ID, 0Pz.A0U("gt_", threadKey.A04)));
            str = "/messages";
        }
        this.A01.A00(message, sendMessageMethodParams.A01, sendMessageMethodParams.A02, A0s);
        C04083zw c04083zw = new C04083zw();
        AbF.A1Q(c04083zw, "sendMessage");
        c04083zw.A0F = str;
        c04083zw.A0J = A0s;
        c04083zw.A06 = 0S2.A01;
        c04083zw.A04(this.A00.A00());
        return c04083zw.A01();
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        return AbK.A18(anonymousClass439.A01(), PublicKeyCredentialControllerUtility.JSON_KEY_ID);
    }
}
