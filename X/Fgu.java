package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.util.JSONUtil;
import com.facebook.payments.auth.pin.model.PaymentPinStatus;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Fgu.class */
public final class Fgu implements 1Ro {
    public static final String __redex_internal_original_name = "FetchPaymentPinStatusMethod";

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        ArrayList A0s = AnonymousClass001.A0s();
        C04083zw A0C = AbH.A0C(new BasicNameValuePair("q", "viewer() {  peer_to_peer_payments {    peer_to_peer_payment_pin {      id,      payments_protected,      protected_thread_profiles {        id      },      unprotected_thread_profiles {        id      }    }  }}"), A0s);
        AbF.A1P(A0C, 1BJ.A00(415));
        return AbK.A0M(A0C, "graphql", A0s);
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        24X A0w = AbH.A0w(anonymousClass439);
        24X A0D = A0w.A0D("viewer");
        Preconditions.checkNotNull(A0D, "field %s was not found in parent %s", "viewer", A0w);
        24X A0D2 = A0D.A0D("peer_to_peer_payments");
        Preconditions.checkNotNull(A0D2, "field %s was not found in parent %s", "peer_to_peer_payments", A0D);
        24X A0D3 = A0D2.A0D("peer_to_peer_payment_pin");
        Preconditions.checkNotNull(A0D3, "field %s was not found in parent %s", "peer_to_peer_payment_pin", A0D2);
        24X A0D4 = A0D3.A0D(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        if (A0D4 == null) {
            return PaymentPinStatus.A04;
        }
        String A0H = A0D4.A0H();
        Parcelable.Creator creator = PaymentPinStatus.CREATOR;
        A0H.getClass();
        ImmutableList.of();
        ImmutableList.of();
        24X A0D5 = A0D3.A0D("payments_protected");
        Preconditions.checkNotNull(A0D5, "field %s was not found in parent %s", "payments_protected", A0D3);
        boolean A0O = A0D5.A0O();
        ImmutableList.Builder builder = ImmutableList.builder();
        Iterator it = JSONUtil.A0E(A0D3, "protected_thread_profiles").iterator();
        while (it.hasNext()) {
            builder.m11011add((Object) AbK.A18(DKC.A0j(it), PublicKeyCredentialControllerUtility.JSON_KEY_ID));
        }
        ImmutableList build = builder.build();
        ImmutableList.Builder builder2 = ImmutableList.builder();
        Iterator it2 = JSONUtil.A0E(A0D3, "unprotected_thread_profiles").iterator();
        while (it2.hasNext()) {
            builder2.m11011add((Object) AbK.A18(DKC.A0j(it2), PublicKeyCredentialControllerUtility.JSON_KEY_ID));
        }
        return new PaymentPinStatus(build, builder2.build(), A0H, A0O);
    }
}
