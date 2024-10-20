package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.rtcactivity.interfaces.DataSender;
import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: Hon.class */
public final class Hon {
    public final 1De A00;
    public final 1Br A02;
    public final 1Br A01 = 1Bq.A00(16960);
    public final C15h A03 = J5u.A03(this, 4);

    public Hon(1De r302) {
        this.A00 = r302;
        this.A02 = 7zM.A0h(r302, 99980);
    }

    public final void A00(FbUserSession fbUserSession, ImmutableSet immutableSet, Collection collection) {
        if (GOp.A0p(this.A02).A0A(fbUserSession, false)) {
            try {
                byte[] A1b = AbstractC2326GOr.A1b(11T.A02(AnonymousClass001.A12().put("effects", new JSONArray((Collection) immutableSet)).put("user_id", this.A03.get())));
                DataSender dataSender = (DataSender) 4YU.A0o(fbUserSession, this.A00, 114910);
                if (collection == null) {
                    dataSender.sendDataMessageToPeers("available_interactive_effects", A1b);
                } else {
                    dataSender.sendDataMessageToPeers("available_interactive_effects", A1b, collection);
                }
            } catch (JSONException unused) {
                ((2Iq) 1Br.A0B(this.A01)).A01("rtc_android_effects_available_json_encode_error");
            }
        }
    }
}
