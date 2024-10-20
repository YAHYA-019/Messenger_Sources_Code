package X;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.enums.GraphQLEventCreationEntryPoint;
import com.facebook.messaging.communitymessaging.events.creation.CommunityMessagingEventCreationViewData$CommunityInfo;
import com.facebook.messaging.location.model.NearbyPlace;
import com.facebook.proxygen.TraceFieldType;
import java.util.Calendar;

/* loaded from: Cj1.class */
public final class Cj1 implements DIQ {
    public CommunityMessagingEventCreationViewData$CommunityInfo A00;
    public CNk A01;

    public static final void A00(Context context, Cj1 cj1, String str) {
        String A0v = str != null ? 1BK.A0v(context, str, 2131956607) : context.getString(2131956608);
        11T.A0D(A0v);
        CNk cNk = cj1.A01;
        if (cNk == null) {
            11T.A0L("uiModel");
            throw 0Q8.createAndThrow();
        }
        cNk.A04(A0v);
    }

    public /* bridge */ /* synthetic */ Parcelable BC7() {
        return this.A00;
    }

    public void BPI(Context context, Bundle bundle, LifecycleOwner lifecycleOwner, 2S4 r305) {
        this.A01 = AbN.A0K(r305);
        A00(context, this, null);
        Calendar calendar = (Calendar) (Build.VERSION.SDK_INT >= 33 ? bundle.getSerializable("arg_start_date_time", Calendar.class) : bundle.getSerializable("arg_start_date_time"));
        if (calendar != null) {
            CNk cNk = this.A01;
            if (cNk != null) {
                cNk.A06(calendar);
            }
            11T.A0L("uiModel");
            throw 0Q8.createAndThrow();
        }
        String string = bundle.getString("arg_initial_event_name");
        if (string != null) {
            CNk cNk2 = this.A01;
            if (cNk2 != null) {
                cNk2.A05(string);
            }
            11T.A0L("uiModel");
            throw 0Q8.createAndThrow();
        }
        ((C1284Aco) 1Lm.A05(context, 4YV.A0E(context), 82370)).A02(lifecycleOwner, bundle.getLong("arg_community_id")).A01(new CjW(new AR7(context, this, 12), 1));
    }

    public void BYy(Context context, Parcelable parcelable) {
        if (parcelable instanceof CommunityMessagingEventCreationViewData$CommunityInfo) {
            CommunityMessagingEventCreationViewData$CommunityInfo communityMessagingEventCreationViewData$CommunityInfo = (CommunityMessagingEventCreationViewData$CommunityInfo) parcelable;
            this.A00 = communityMessagingEventCreationViewData$CommunityInfo;
            if (communityMessagingEventCreationViewData$CommunityInfo != null) {
                A00(context, this, communityMessagingEventCreationViewData$CommunityInfo.A01);
            }
        }
    }

    public void D1d(Context context, FbUserSession fbUserSession, GraphQLEventCreationEntryPoint graphQLEventCreationEntryPoint, C6e c6e, String str) {
        String str2;
        11T.A0F(c6e, 4);
        1Bn.A0A(83472);
        CNk cNk = this.A01;
        if (cNk != null) {
            String str3 = cNk.A02().A03;
            CNk cNk2 = this.A01;
            if (cNk2 != null) {
                Calendar calendar = cNk2.A02().A08;
                CNk cNk3 = this.A01;
                if (cNk3 != null) {
                    Calendar calendar2 = cNk3.A02().A06;
                    CommunityMessagingEventCreationViewData$CommunityInfo communityMessagingEventCreationViewData$CommunityInfo = this.A00;
                    if (communityMessagingEventCreationViewData$CommunityInfo == null || (str2 = communityMessagingEventCreationViewData$CommunityInfo.A00) == null) {
                        throw 1BK.A0h();
                    }
                    CNk cNk4 = this.A01;
                    if (cNk4 != null) {
                        String str4 = cNk4.A02().A04;
                        CNk cNk5 = this.A01;
                        if (cNk5 != null) {
                            NearbyPlace nearbyPlace = cNk5.A02().A00;
                            Cj2 cj2 = new Cj2(c6e);
                            7zR.A1O(str3, calendar);
                            DgU dgU = new DgU(16);
                            C03z c03z = GraphQlCallInput.A02;
                            dgU.A03().A0H(c03z.A02(), "acontext");
                            dgU.A09("creation_entrypoint", graphQLEventCreationEntryPoint.toString());
                            dgU.A09("event_privacy_type", "GROUP");
                            dgU.A09("group_id", str2);
                            dgU.A09(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str3);
                            dgU.A09("start_date", RVD.A01(calendar));
                            dgU.A08(TraceFieldType.StartTime, RVD.A00(calendar));
                            dgU.A09("end_date", RVD.A01(calendar2));
                            dgU.A08("end_time", RVD.A00(calendar2));
                            dgU.A09("timezone", calendar.getTimeZone().getID());
                            07S A0J = 4YU.A0J(c03z, AnonymousClass001.A0K(), "enable_event_chat");
                            07S.A00(A0J, str, "link_existing_chat_id");
                            7zN.A17(A0J, dgU, "event_chat");
                            1Bn.A0A(83471);
                            CAH.A00(context, fbUserSession, dgU, cj2, nearbyPlace, str4);
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
