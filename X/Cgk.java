package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.service.model.RemoveMemberParams;
import com.facebook.user.model.UserFbidIdentifier;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Cgk.class */
public final class Cgk implements 1Ro {
    public static final String __redex_internal_original_name = "RemoveMemberMethod";
    public final C15h A00 = DBe.A00(this, ActionId.RTMP_STREAM_PREPARED);
    public final CB9 A01 = (CB9) 1Bi.A03(83100);

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        RemoveMemberParams removeMemberParams = (RemoveMemberParams) obj;
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new BasicNameValuePair(PublicKeyCredentialControllerUtility.JSON_KEY_ID, 0Pz.A0U("t_", removeMemberParams.A00.A0r())));
        ImmutableList immutableList = removeMemberParams.A01;
        if (immutableList.size() != 1 || !Objects.equal(((UserFbidIdentifier) immutableList.get(0)).A00, this.A00.get())) {
            C03353xs c03353xs = new C03353xs(C26T.A00);
            Iterator it = immutableList.iterator();
            while (it.hasNext()) {
                c03353xs.A0e(((UserFbidIdentifier) it.next()).A00);
            }
            A0s.add(new BasicNameValuePair("to", c03353xs.toString()));
        }
        return new C04103zy(0S2.A00, "removeMembers", "DELETE", "/participants", A0s);
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        anonymousClass439.A03();
        return null;
    }
}
