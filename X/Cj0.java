package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.enums.GraphQLEventCreationEntryPoint;
import com.facebook.messaging.location.model.NearbyPlace;
import com.facebook.proxygen.TraceFieldType;
import java.util.Calendar;

/* loaded from: Cj0.class */
public final class Cj0 implements DIQ {
    public CNk A00;

    public Parcelable BC7() {
        return null;
    }

    public void BPI(Context context, Bundle bundle, LifecycleOwner lifecycleOwner, 2S4 r305) {
        this.A00 = AbN.A0K(r305);
        String A0u = 1BK.A0u(context, 2131963991);
        CNk cNk = this.A00;
        if (cNk == null) {
            11T.A0L("uiModel");
            throw 0Q8.createAndThrow();
        }
        cNk.A04(A0u);
    }

    public void BYy(Context context, Parcelable parcelable) {
    }

    public void D1d(Context context, FbUserSession fbUserSession, GraphQLEventCreationEntryPoint graphQLEventCreationEntryPoint, C6e c6e, String str) {
        11T.A0F(c6e, 4);
        if (str == null) {
            throw 1BK.A0h();
        }
        1Bn.A0A(83473);
        CNk cNk = this.A00;
        if (cNk != null) {
            String str2 = cNk.A02().A03;
            CNk cNk2 = this.A00;
            if (cNk2 != null) {
                Calendar calendar = cNk2.A02().A08;
                CNk cNk3 = this.A00;
                if (cNk3 != null) {
                    Calendar calendar2 = cNk3.A02().A06;
                    CNk cNk4 = this.A00;
                    if (cNk4 != null) {
                        String str3 = cNk4.A02().A04;
                        CNk cNk5 = this.A00;
                        if (cNk5 != null) {
                            NearbyPlace nearbyPlace = cNk5.A02().A00;
                            Cj3 cj3 = new Cj3(c6e);
                            7zR.A1O(str2, calendar);
                            DgU dgU = new DgU(16);
                            C03z c03z = GraphQlCallInput.A02;
                            dgU.A03().A0H(c03z.A02(), "acontext");
                            dgU.A09("creation_entrypoint", graphQLEventCreationEntryPoint.toString());
                            dgU.A09("event_privacy_type", "PUBLIC_TYPE");
                            dgU.A09(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str2);
                            dgU.A09("start_date", RVD.A01(calendar));
                            dgU.A08(TraceFieldType.StartTime, RVD.A00(calendar));
                            dgU.A09("end_date", RVD.A01(calendar2));
                            dgU.A08("end_time", RVD.A00(calendar2));
                            dgU.A09("timezone", calendar.getTimeZone().getID());
                            07S A0J = 4YU.A0J(c03z, AnonymousClass001.A0K(), "enable_event_chat");
                            07S.A00(A0J, str, "link_existing_chat_id");
                            7zN.A17(A0J, dgU, "event_chat");
                            1Bn.A0A(83471);
                            CAH.A00(context, fbUserSession, dgU, cj3, nearbyPlace, str3);
                            return;
                        }
                    }
                }
            }
        }
        11T.A0L("uiModel");
        throw 0Q8.createAndThrow();
    }
}
