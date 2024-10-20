package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.service.model.DeleteThreadParams;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Cg7.class */
public final class Cg7 implements 1Ro {
    public static final String __redex_internal_original_name = "DeleteThreadMethod";

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        ArrayList A0s = AnonymousClass001.A0s();
        ThreadKey threadKey = ((DeleteThreadParams) obj).A00;
        threadKey.getClass();
        A0s.add(new BasicNameValuePair(PublicKeyCredentialControllerUtility.JSON_KEY_ID, 0Pz.A0U("t_", threadKey.A0r())));
        A0s.add(new BasicNameValuePair("format", "json"));
        return new C04103zy(0S2.A00, 4YT.A00(329), "DELETE", "", A0s);
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        anonymousClass439.A03();
        return null;
    }
}
