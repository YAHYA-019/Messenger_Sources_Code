package com.facebook.securedaction.challenges.fido;

import X.07S;
import X.0fH;
import X.1Bi;
import X.1Bn;
import X.1Fv;
import X.1Kd;
import X.1VX;
import X.1iF;
import X.28B;
import X.28E;
import X.2JX;
import X.4YU;
import X.4YV;
import X.5Dh;
import X.AnonymousClass286;
import X.AnonymousClass289;
import X.C01643sd;
import X.C27w;
import X.K2I;
import X.KXN;
import X.Khm;
import X.LKO;
import X.LfN;
import X.Lj7;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Base64;
import android.view.View;
import android.widget.Button;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ExecutorService;

/* loaded from: FIDOPreferenceActivity.class */
public class FIDOPreferenceActivity extends FbFragmentActivity {
    public Context A00;
    public Button A01;
    public Button A02;
    public FbUserSession A03;
    public Khm A04;
    public K2I A05;

    @Override // com.facebook.base.activity.FbFragmentActivity
    public 1iF A2g() {
        return new 1iF(627446925311111L);
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [X.Khm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [X.28E, java.lang.Object] */
    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        this.A03 = ((1Fv) 1Bi.A03(66351)).A05(this);
        setContentView(2132542016);
        Button button = (Button) A2c(2131364078);
        this.A02 = button;
        this.A00 = button.getContext();
        ?? obj = new Object();
        obj.A00 = (KXN) 1Bn.A0A(131110);
        obj.A01 = (ExecutorService) 1Bi.A03(16456);
        this.A04 = obj;
        Context context = this.A00;
        AnonymousClass286 anonymousClass286 = K2I.A00;
        this.A05 = new C27w(context, (AnonymousClass289) AnonymousClass289.A00, anonymousClass286, new 28B(Looper.getMainLooper(), (28E) new Object()));
        if (this.A04 != null) {
            0fH.A0j("FIDO", "get fido2 api client and fido controller in register button");
            View.OnClickListener A00 = LKO.A00(this, 79);
            Button button2 = this.A02;
            if (button2 != null) {
                button2.setOnClickListener(A00);
            }
        }
        this.A01 = (Button) A2c(2131364075);
        if (this.A05 == null || this.A04 == null) {
            return;
        }
        0fH.A0j("FIDO", "get fido2 api client and fido controller in authenticate button");
        View.OnClickListener A002 = LKO.A00(this, 80);
        Button button3 = this.A01;
        if (button3 != null) {
            button3.setOnClickListener(A002);
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        byte[] byteArrayExtra;
        AuthenticatorErrorResponse authenticatorErrorResponse;
        String str2;
        String str3;
        String str4;
        byte[] byteArrayExtra2;
        AuthenticatorErrorResponse authenticatorErrorResponse2;
        Khm khm = this.A04;
        if (i != 0) {
            if (i == 1) {
                str = "FIDO";
                if (intent != null) {
                    if (i2 == -1 && !intent.hasExtra("FIDO2_ERROR_EXTRA")) {
                        if (!intent.hasExtra("FIDO2_ERROR_EXTRA")) {
                            byte[] byteArrayExtra3 = intent.getByteArrayExtra("FIDO2_RESPONSE_EXTRA");
                            if (byteArrayExtra3 == null) {
                                0fH.A0j(str, "fido2Response is null");
                            } else {
                                AuthenticatorAssertionResponse authenticatorAssertionResponse = (AuthenticatorAssertionResponse) SafeParcelableSerializer.A00(AuthenticatorAssertionResponse.CREATOR, byteArrayExtra3);
                                if (authenticatorAssertionResponse != null) {
                                    0fH.A0g(Base64.encodeToString(authenticatorAssertionResponse.A00.A04(), 2), str, "rawId: %s");
                                    0fH.A0g(new String(authenticatorAssertionResponse.A01.A04(), StandardCharsets.UTF_8), str, "clientDataJson: %s");
                                    str2 = Base64.encodeToString(authenticatorAssertionResponse.A03.A04(), 2);
                                    str3 = "signature: %s";
                                }
                            }
                        }
                        str4 = "AuthenticatorAssertionResponse is null";
                    } else {
                        if (!intent.hasExtra("FIDO2_ERROR_EXTRA") || (byteArrayExtra = intent.getByteArrayExtra("FIDO2_ERROR_EXTRA")) == null || (authenticatorErrorResponse = (AuthenticatorErrorResponse) SafeParcelableSerializer.A00(AuthenticatorErrorResponse.CREATOR, byteArrayExtra)) == null) {
                            return;
                        }
                        str2 = authenticatorErrorResponse.A01;
                        str3 = "error to sign with private key: %s";
                    }
                    0fH.A0g(str2, str, str3);
                    return;
                }
                str4 = "authenticate intent is null";
                0fH.A0j(str, str4);
            }
            return;
        }
        FbUserSession fbUserSession = this.A03;
        fbUserSession.getClass();
        Context context = this.A00;
        str = "FIDO";
        if (intent == null) {
            str4 = "register intent is null";
        } else {
            if (i2 != -1 || intent.hasExtra("FIDO2_ERROR_EXTRA")) {
                if (!intent.hasExtra("FIDO2_ERROR_EXTRA") || (byteArrayExtra2 = intent.getByteArrayExtra("FIDO2_ERROR_EXTRA")) == null || (authenticatorErrorResponse2 = (AuthenticatorErrorResponse) SafeParcelableSerializer.A00(AuthenticatorErrorResponse.CREATOR, byteArrayExtra2)) == null) {
                    return;
                }
                str2 = authenticatorErrorResponse2.A01;
                str3 = "error to create key pair: %s";
                0fH.A0g(str2, str, str3);
                return;
            }
            if (!intent.hasExtra("FIDO2_ERROR_EXTRA")) {
                byte[] byteArrayExtra4 = intent.getByteArrayExtra("FIDO2_RESPONSE_EXTRA");
                if (byteArrayExtra4 == null) {
                    0fH.A0j(str, "fido2Response is null");
                } else {
                    AuthenticatorAttestationResponse authenticatorAttestationResponse = (AuthenticatorAttestationResponse) SafeParcelableSerializer.A00(AuthenticatorAttestationResponse.CREATOR, byteArrayExtra4);
                    if (authenticatorAttestationResponse != null) {
                        String encodeToString = Base64.encodeToString(authenticatorAttestationResponse.A00.A04(), 2);
                        0fH.A0g(encodeToString, str, "keyHandleBase64: %s");
                        Lj7 lj7 = authenticatorAttestationResponse.A01;
                        byte[] A04 = lj7.A04();
                        Charset charset = StandardCharsets.UTF_8;
                        String str5 = new String(A04, charset);
                        0fH.A0g(str5, str, "clientDataJsonString: %s");
                        String encodeToString2 = Base64.encodeToString(str5.getBytes(charset), 2);
                        0fH.A0g(encodeToString2, str, "comparativeClientDataJson: %s");
                        0fH.A0g(new String(lj7.A04(), charset), str, "clientDataJson: %s");
                        String encodeToString3 = Base64.encodeToString(authenticatorAttestationResponse.A02.A04(), 2);
                        0fH.A0g(encodeToString3, str, "attestationObjectBase64: %s");
                        07S A0J = 4YU.A0J(GraphQlCallInput.A02, "webauthn.create", PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                        07S.A00(A0J, encodeToString, "credential_id");
                        07S.A00(A0J, encodeToString, "raw_id");
                        07S.A00(A0J, encodeToString2, "client_data_json");
                        07S.A00(A0J, encodeToString3, "attestation_object");
                        GraphQlQueryParamSet graphQlQueryParamSet = new GraphQlQueryParamSet();
                        4YV.A1A(A0J, graphQlQueryParamSet, "input");
                        1Kd.A0F(new LfN(khm, 20), 1VX.A08(context, fbUserSession).A06(5Dh.A00(graphQlQueryParamSet, new C01643sd(2JX.class, "FIDOPARegisterMutation", null, null, "fbandroid", -1213621508, 0, 2836605236L, 2836605236L, false, true))), khm.A01);
                        return;
                    }
                }
            }
            str4 = "AuthenticatorAttestationResponse is null";
        }
        0fH.A0j(str, str4);
    }
}
