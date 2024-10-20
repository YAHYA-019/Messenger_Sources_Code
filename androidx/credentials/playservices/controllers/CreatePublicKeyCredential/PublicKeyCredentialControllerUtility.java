package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import X.03Y;
import X.04R;
import X.0CU;
import X.0Pz;
import X.11T;
import X.1BK;
import X.1BL;
import X.7zT;
import X.AbstractC00481b7;
import X.AnonymousClass001;
import X.C2965Jeu;
import X.C2975Jf4;
import X.C2986Jfa;
import X.C2988Jfc;
import X.C2990Jfe;
import X.C2992Jfg;
import X.C2993Jfh;
import X.C2998Jfm;
import X.C3000Jfo;
import X.C3002Jfq;
import X.C3005Jft;
import X.C3006Jfu;
import X.DKC;
import X.JQx;
import X.JfP;
import X.JfQ;
import X.JfR;
import X.JfT;
import X.JfU;
import X.KQ8;
import X.KQl;
import X.KQm;
import X.Kdx;
import X.Kqn;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.Attachment;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension;
import com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: PublicKeyCredentialControllerUtility.class */
public final class PublicKeyCredentialControllerUtility {
    public static final int FLAGS = 11;
    public static final String JSON_KEY_ALG = "alg";
    public static final String JSON_KEY_APPID = "appid";
    public static final String JSON_KEY_ATTESTATION = "attestation";
    public static final String JSON_KEY_ATTESTATION_OBJ = "attestationObject";
    public static final String JSON_KEY_AUTH_ATTACHMENT = "authenticatorAttachment";
    public static final String JSON_KEY_AUTH_DATA = "authenticatorData";
    public static final String JSON_KEY_AUTH_SELECTION = "authenticatorSelection";
    public static final String JSON_KEY_CHALLENGE = "challenge";
    public static final String JSON_KEY_CLIENT_DATA = "clientDataJSON";
    public static final String JSON_KEY_CLIENT_EXTENSION_RESULTS = "clientExtensionResults";
    public static final String JSON_KEY_CRED_PROPS = "credProps";
    public static final String JSON_KEY_DISPLAY_NAME = "displayName";
    public static final String JSON_KEY_EXCLUDE_CREDENTIALS = "excludeCredentials";
    public static final String JSON_KEY_EXTENSTIONS = "extensions";
    public static final String JSON_KEY_ICON = "icon";
    public static final String JSON_KEY_ID = "id";
    public static final String JSON_KEY_KEY_PROTECTION_TYPE = "keyProtectionType";
    public static final String JSON_KEY_MATCHER_PROTECTION_TYPE = "matcherProtectionType";
    public static final String JSON_KEY_NAME = "name";
    public static final String JSON_KEY_PUB_KEY_CRED_PARAMS = "pubKeyCredParams";
    public static final String JSON_KEY_RAW_ID = "rawId";
    public static final String JSON_KEY_REQUIRE_RES_KEY = "requireResidentKey";
    public static final String JSON_KEY_RESPONSE = "response";
    public static final String JSON_KEY_RES_KEY = "residentKey";
    public static final String JSON_KEY_RK = "rk";
    public static final String JSON_KEY_RP = "rp";
    public static final String JSON_KEY_RPID = "rpId";
    public static final String JSON_KEY_SIGNATURE = "signature";
    public static final String JSON_KEY_THIRD_PARTY_PAYMENT = "thirdPartyPayment";
    public static final String JSON_KEY_TIMEOUT = "timeout";
    public static final String JSON_KEY_TRANSPORTS = "transports";
    public static final String JSON_KEY_TYPE = "type";
    public static final String JSON_KEY_USER = "user";
    public static final String JSON_KEY_USER_HANDLE = "userHandle";
    public static final String JSON_KEY_USER_VERIFICATION_METHOD = "userVerificationMethod";
    public static final String TAG = "PublicKeyUtility";
    public static final Companion Companion = new Object();
    public static final LinkedHashMap orderedErrorCodeToExceptions = 04R.A08(new 03Y[]{1BK.A1G(ErrorCode.UNKNOWN_ERR, new C3002Jfq()), 1BK.A1G(ErrorCode.ABORT_ERR, new JfQ()), 1BK.A1G(ErrorCode.ATTESTATION_NOT_PRIVATE_ERR, new C2992Jfg()), 1BK.A1G(ErrorCode.CONSTRAINT_ERR, new JfR()), 1BK.A1G(ErrorCode.DATA_ERR, new JfT()), 1BK.A1G(ErrorCode.INVALID_STATE_ERR, new C2986Jfa()), 1BK.A1G(ErrorCode.ENCODING_ERR, new JfU()), 1BK.A1G(ErrorCode.NETWORK_ERR, new C2988Jfc()), 1BK.A1G(ErrorCode.NOT_ALLOWED_ERR, new C2990Jfe()), 1BK.A1G(ErrorCode.NOT_SUPPORTED_ERR, new C2993Jfh()), 1BK.A1G(ErrorCode.SECURITY_ERR, new C2998Jfm()), 1BK.A1G(ErrorCode.TIMEOUT_ERR, new C3000Jfo())});

    /* loaded from: PublicKeyCredentialControllerUtility$Companion.class */
    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        private final byte[] getChallenge(JSONObject jSONObject) {
            String optString = jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_CHALLENGE, "");
            if (JQx.A0K(optString) == 0) {
                throw new JSONException("Challenge not found in request or is unexpectedly empty");
            }
            byte[] decode = Base64.decode(optString, 11);
            11T.A0A(decode);
            return decode;
        }

        public final void addAuthenticatorAttestationResponse$credentials_play_services_auth_release(byte[] bArr, byte[] bArr2, String[] strArr, JSONObject jSONObject) {
            7zT.A1S(bArr, bArr2, strArr);
            11T.A0F(jSONObject, 3);
            JSONObject A12 = AnonymousClass001.A12();
            A12.put(PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_DATA, DKC.A1B(bArr, 11));
            A12.put(PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION_OBJ, DKC.A1B(bArr2, 11));
            A12.put(PublicKeyCredentialControllerUtility.JSON_KEY_TRANSPORTS, new JSONArray(strArr));
            jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, A12);
        }

        public final byte[] b64Decode(String str) {
            11T.A0F(str, 0);
            byte[] decode = Base64.decode(str, 11);
            11T.A0A(decode);
            return decode;
        }

        public final String b64Encode(byte[] bArr) {
            11T.A0F(bArr, 0);
            return DKC.A1B(bArr, 11);
        }

        public final KQm beginSignInPublicKeyCredentialResponseContainsError$credentials_play_services_auth_release(ErrorCode errorCode, String str) {
            11T.A0F(errorCode, 0);
            Kdx kdx = (Kdx) PublicKeyCredentialControllerUtility.orderedErrorCodeToExceptions.get(errorCode);
            return kdx == null ? new C3006Jfu(new C3002Jfq(), 0Pz.A0W("unknown fido gms exception - ", str)) : (errorCode == ErrorCode.CONSTRAINT_ERR && str != null && 0CU.A0T(str, "Unable to get sync account", false)) ? new KQm("android.credentials.GetCredentialException.TYPE_USER_CANCELED", "Passkey retrieval was cancelled by the user.") : new C3006Jfu(kdx, str);
        }

        public final boolean checkAlgSupported(int i) {
            try {
                COSEAlgorithmIdentifier.A00(i);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        public final PublicKeyCredentialCreationOptions convert(C2965Jeu c2965Jeu) {
            11T.A0F(c2965Jeu, 0);
            return convertJSON$credentials_play_services_auth_release(DKC.A1F(c2965Jeu.A00));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.Kqn] */
        public final PublicKeyCredentialCreationOptions convertJSON$credentials_play_services_auth_release(JSONObject jSONObject) {
            11T.A0F(jSONObject, 0);
            ?? obj = new Object();
            parseRequiredChallengeAndUser$credentials_play_services_auth_release(jSONObject, obj);
            parseRequiredRpAndParams$credentials_play_services_auth_release(jSONObject, obj);
            parseOptionalWithRequiredDefaultsAttestationAndExcludeCredentials$credentials_play_services_auth_release(jSONObject, obj);
            parseOptionalTimeout$credentials_play_services_auth_release(jSONObject, obj);
            parseOptionalAuthenticatorSelection$credentials_play_services_auth_release(jSONObject, obj);
            parseOptionalExtensions$credentials_play_services_auth_release(jSONObject, obj);
            return obj.A00();
        }

        public final BeginSignInRequest.PasskeyJsonRequestOptions convertToPlayAuthPasskeyJsonRequest(C2975Jf4 c2975Jf4) {
            11T.A0F(c2975Jf4, 0);
            return new BeginSignInRequest.PasskeyJsonRequestOptions(true, c2975Jf4.A00);
        }

        public final BeginSignInRequest.PasskeysRequestOptions convertToPlayAuthPasskeyRequest(C2975Jf4 c2975Jf4) {
            11T.A0F(c2975Jf4, 0);
            JSONObject A1F = DKC.A1F(c2975Jf4.A00);
            String optString = A1F.optString(PublicKeyCredentialControllerUtility.JSON_KEY_RPID, "");
            if (JQx.A0K(optString) == 0) {
                throw new JSONException("GetPublicKeyCredentialOption - rpId not specified in the request or is unexpectedly empty");
            }
            return new BeginSignInRequest.PasskeysRequestOptions(optString, getChallenge(A1F), true);
        }

        public final String getJSON_KEY_ALG$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ALG;
        }

        public final String getJSON_KEY_APPID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_APPID;
        }

        public final String getJSON_KEY_ATTESTATION$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION;
        }

        public final String getJSON_KEY_ATTESTATION_OBJ$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION_OBJ;
        }

        public final String getJSON_KEY_AUTH_ATTACHMENT$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_ATTACHMENT;
        }

        public final String getJSON_KEY_AUTH_DATA$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_DATA;
        }

        public final String getJSON_KEY_AUTH_SELECTION$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_SELECTION;
        }

        public final String getJSON_KEY_CHALLENGE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CHALLENGE;
        }

        public final String getJSON_KEY_CLIENT_DATA$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_DATA;
        }

        public final String getJSON_KEY_CLIENT_EXTENSION_RESULTS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_EXTENSION_RESULTS;
        }

        public final String getJSON_KEY_CRED_PROPS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CRED_PROPS;
        }

        public final String getJSON_KEY_DISPLAY_NAME$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME;
        }

        public final String getJSON_KEY_EXCLUDE_CREDENTIALS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_EXCLUDE_CREDENTIALS;
        }

        public final String getJSON_KEY_EXTENSTIONS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS;
        }

        public final String getJSON_KEY_ICON$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ICON;
        }

        public final String getJSON_KEY_ID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ID;
        }

        public final String getJSON_KEY_KEY_PROTECTION_TYPE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_KEY_PROTECTION_TYPE;
        }

        public final String getJSON_KEY_MATCHER_PROTECTION_TYPE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_MATCHER_PROTECTION_TYPE;
        }

        public final String getJSON_KEY_NAME$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
        }

        public final String getJSON_KEY_PUB_KEY_CRED_PARAMS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_PUB_KEY_CRED_PARAMS;
        }

        public final String getJSON_KEY_RAW_ID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RAW_ID;
        }

        public final String getJSON_KEY_REQUIRE_RES_KEY$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_REQUIRE_RES_KEY;
        }

        public final String getJSON_KEY_RESPONSE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE;
        }

        public final String getJSON_KEY_RES_KEY$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RES_KEY;
        }

        public final String getJSON_KEY_RK$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RK;
        }

        public final String getJSON_KEY_RP$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RP;
        }

        public final String getJSON_KEY_RPID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RPID;
        }

        public final String getJSON_KEY_SIGNATURE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE;
        }

        public final String getJSON_KEY_THIRD_PARTY_PAYMENT$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_THIRD_PARTY_PAYMENT;
        }

        public final String getJSON_KEY_TIMEOUT$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT;
        }

        public final String getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TRANSPORTS;
        }

        public final String getJSON_KEY_TYPE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TYPE;
        }

        public final String getJSON_KEY_USER$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER;
        }

        public final String getJSON_KEY_USER_HANDLE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER_HANDLE;
        }

        public final String getJSON_KEY_USER_VERIFICATION_METHOD$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER_VERIFICATION_METHOD;
        }

        public final LinkedHashMap getOrderedErrorCodeToExceptions$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.orderedErrorCodeToExceptions;
        }

        public final void parseOptionalAuthenticatorSelection$credentials_play_services_auth_release(JSONObject jSONObject, Kqn kqn) {
            1BK.A1M(jSONObject, kqn);
            String str = PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_SELECTION;
            if (jSONObject.has(str)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(str);
                Attachment attachment = null;
                boolean optBoolean = jSONObject2.optBoolean(PublicKeyCredentialControllerUtility.JSON_KEY_REQUIRE_RES_KEY, false);
                String optString = jSONObject2.optString(PublicKeyCredentialControllerUtility.JSON_KEY_RES_KEY, "");
                ResidentKeyRequirement residentKeyRequirement = null;
                if (JQx.A0K(optString) > 0) {
                    residentKeyRequirement = ResidentKeyRequirement.A00(optString);
                }
                Boolean valueOf = Boolean.valueOf(optBoolean);
                String optString2 = jSONObject2.optString(PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_ATTACHMENT, "");
                if (JQx.A0K(optString2) > 0) {
                    attachment = Attachment.A00(optString2);
                }
                kqn.A02 = new AuthenticatorSelectionCriteria(valueOf, attachment == null ? null : attachment.toString(), null, residentKeyRequirement == null ? null : residentKeyRequirement.toString());
            }
        }

        public final void parseOptionalExtensions$credentials_play_services_auth_release(JSONObject jSONObject, Kqn kqn) {
            boolean A1X = 1BL.A1X(jSONObject, kqn);
            String str = PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS;
            if (jSONObject.has(str)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(str);
                FidoAppIdExtension fidoAppIdExtension = null;
                UserVerificationMethodExtension userVerificationMethodExtension = null;
                GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension = null;
                String optString = jSONObject2.optString(PublicKeyCredentialControllerUtility.JSON_KEY_APPID, "");
                if (JQx.A0K(optString) > 0) {
                    fidoAppIdExtension = new FidoAppIdExtension(optString);
                }
                if (jSONObject2.optBoolean(PublicKeyCredentialControllerUtility.JSON_KEY_THIRD_PARTY_PAYMENT, false)) {
                    googleThirdPartyPaymentExtension = new GoogleThirdPartyPaymentExtension(A1X);
                }
                if (jSONObject2.optBoolean("uvm", false)) {
                    userVerificationMethodExtension = new UserVerificationMethodExtension(A1X);
                }
                kqn.A01 = new AuthenticationExtensions(fidoAppIdExtension, googleThirdPartyPaymentExtension, userVerificationMethodExtension, null, null, null, null, null, null, null, null, null);
            }
        }

        public final void parseOptionalTimeout$credentials_play_services_auth_release(JSONObject jSONObject, Kqn kqn) {
            11T.A0H(jSONObject, kqn);
            if (jSONObject.has(PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT)) {
                kqn.A05 = Double.valueOf(jSONObject.getLong(r0) / 1000.0d);
            }
        }

        public final void parseOptionalWithRequiredDefaultsAttestationAndExcludeCredentials$credentials_play_services_auth_release(JSONObject jSONObject, Kqn kqn) {
            String str;
            11T.A0H(jSONObject, kqn);
            ArrayList A0s = AnonymousClass001.A0s();
            String str2 = PublicKeyCredentialControllerUtility.JSON_KEY_EXCLUDE_CREDENTIALS;
            if (jSONObject.has(str2)) {
                JSONArray jSONArray = jSONObject.getJSONArray(str2);
                int length = jSONArray.length();
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= length) {
                        break;
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                    byte[] decode = Base64.decode(DKC.A1A(PublicKeyCredentialControllerUtility.JSON_KEY_ID, jSONObject2), 11);
                    11T.A0A(decode);
                    String A1A = DKC.A1A(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, jSONObject2);
                    if (A1A.length() == 0) {
                        throw new JSONException("PublicKeyCredentialDescriptor type value is not found or unexpectedly empty");
                    }
                    if (decode.length == 0) {
                        throw new JSONException("PublicKeyCredentialDescriptor id value is not found or unexpectedly empty");
                    }
                    ArrayList arrayList = null;
                    String str3 = PublicKeyCredentialControllerUtility.JSON_KEY_TRANSPORTS;
                    if (jSONObject2.has(str3)) {
                        arrayList = AnonymousClass001.A0s();
                        JSONArray jSONArray2 = jSONObject2.getJSONArray(str3);
                        int length2 = jSONArray2.length();
                        for (int i3 = 0; i3 < length2; i3++) {
                            try {
                                arrayList.add(Transport.A00(jSONArray2.getString(i3)));
                            } catch (KQ8 e) {
                                throw C3005Jft.A00(new JfU(), e.getMessage());
                            }
                        }
                    }
                    A0s.add(new PublicKeyCredentialDescriptor(A1A, arrayList, decode));
                    i = i2 + 1;
                }
            }
            kqn.A07 = A0s;
            str = "none";
            String optString = jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION, str);
            kqn.A00 = AttestationConveyancePreference.A00(JQx.A0K(optString) != 0 ? optString : "none");
        }

        public final void parseRequiredChallengeAndUser$credentials_play_services_auth_release(JSONObject jSONObject, Kqn kqn) {
            11T.A0H(jSONObject, kqn);
            byte[] challenge = getChallenge(jSONObject);
            AbstractC00481b7.A02(challenge);
            kqn.A08 = challenge;
            JSONObject jSONObject2 = jSONObject.getJSONObject(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
            byte[] decode = Base64.decode(DKC.A1A(PublicKeyCredentialControllerUtility.JSON_KEY_ID, jSONObject2), 11);
            11T.A0A(decode);
            String string = jSONObject2.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            String string2 = jSONObject2.getString(PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME);
            String optString = jSONObject2.optString(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, "");
            if (JQx.A0K(string2) == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing displayName or they are unexpectedly empty");
            }
            if (decode.length == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user id or they are unexpectedly empty");
            }
            if (JQx.A0K(string) == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user name or they are unexpectedly empty");
            }
            kqn.A04 = new PublicKeyCredentialUserEntity(decode, string, optString, string2);
        }

        public final void parseRequiredRpAndParams$credentials_play_services_auth_release(JSONObject jSONObject, Kqn kqn) {
            11T.A0H(jSONObject, kqn);
            JSONObject jSONObject2 = jSONObject.getJSONObject(PublicKeyCredentialControllerUtility.JSON_KEY_RP);
            String string = jSONObject2.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            String optString = jSONObject2.optString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "");
            String optString2 = jSONObject2.optString(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, "");
            11T.A0D(optString2);
            if (optString2.length() == 0) {
                optString2 = null;
            }
            if (JQx.A0K(optString) == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions rp name is missing or unexpectedly empty");
            }
            if (JQx.A0K(string) == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions rp ID is missing or unexpectedly empty");
            }
            kqn.A03 = new PublicKeyCredentialRpEntity(string, optString, optString2);
            JSONArray jSONArray = jSONObject.getJSONArray(PublicKeyCredentialControllerUtility.JSON_KEY_PUB_KEY_CRED_PARAMS);
            ArrayList A0s = AnonymousClass001.A0s();
            int length = jSONArray.length();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    kqn.A06 = A0s;
                    return;
                }
                JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
                int i3 = (int) jSONObject3.getLong(PublicKeyCredentialControllerUtility.JSON_KEY_ALG);
                String optString3 = jSONObject3.optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "");
                if (JQx.A0K(optString3) == 0) {
                    throw new JSONException("PublicKeyCredentialCreationOptions PublicKeyCredentialParameter type missing or unexpectedly empty");
                }
                try {
                    COSEAlgorithmIdentifier.A00(i3);
                    A0s.add(new PublicKeyCredentialParameters(optString3, i3));
                } catch (Throwable unused) {
                }
                i = i2 + 1;
            }
        }

        public final KQl publicKeyCredentialResponseContainsError(PublicKeyCredential publicKeyCredential) {
            11T.A0F(publicKeyCredential, 0);
            SafeParcelable safeParcelable = publicKeyCredential.A02;
            if (safeParcelable == null) {
                safeParcelable = publicKeyCredential.A01;
                if (safeParcelable == null) {
                    safeParcelable = publicKeyCredential.A03;
                    if (safeParcelable == null) {
                        throw AnonymousClass001.A0N("No response set.");
                    }
                }
            }
            C3005Jft c3005Jft = null;
            if (safeParcelable instanceof AuthenticatorErrorResponse) {
                AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) safeParcelable;
                ErrorCode errorCode = authenticatorErrorResponse.A00;
                11T.A0A(errorCode);
                Kdx kdx = (Kdx) PublicKeyCredentialControllerUtility.orderedErrorCodeToExceptions.get(errorCode);
                String str = authenticatorErrorResponse.A01;
                if (kdx != null) {
                    return (errorCode == ErrorCode.CONSTRAINT_ERR && str != null && 0CU.A0T(str, "Unable to get sync account", false)) ? new KQl("android.credentials.CreateCredentialException.TYPE_USER_CANCELED", "Passkey registration was cancelled by the user.") : C3005Jft.A00(kdx, str);
                }
                c3005Jft = C3005Jft.A00(new C3002Jfq(), 0Pz.A0W("unknown fido gms exception - ", str));
            }
            return c3005Jft;
        }

        public final String toAssertPasskeyResponse(SignInCredential signInCredential) {
            Object obj;
            11T.A0F(signInCredential, 0);
            JSONObject A12 = AnonymousClass001.A12();
            PublicKeyCredential publicKeyCredential = signInCredential.A01;
            if (publicKeyCredential != null) {
                obj = publicKeyCredential.A02;
                if (obj == null) {
                    obj = publicKeyCredential.A01;
                    if (obj == null) {
                        obj = publicKeyCredential.A03;
                        if (obj == null) {
                            throw AnonymousClass001.A0N("No response set.");
                        }
                    }
                }
            } else {
                obj = null;
            }
            11T.A0D(obj);
            if (obj instanceof AuthenticatorErrorResponse) {
                AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) obj;
                ErrorCode errorCode = authenticatorErrorResponse.A00;
                11T.A0A(errorCode);
                throw beginSignInPublicKeyCredentialResponseContainsError$credentials_play_services_auth_release(errorCode, authenticatorErrorResponse.A01);
            }
            if (!(obj instanceof AuthenticatorAssertionResponse)) {
                Log.e(PublicKeyCredentialControllerUtility.TAG, 0Pz.A0W("AuthenticatorResponse expected assertion response but got: ", AnonymousClass001.A0Y(obj)));
                return 11T.A02(A12);
            }
            try {
                String A02 = publicKeyCredential.A02();
                11T.A0A(A02);
                return A02;
            } catch (Throwable th) {
                throw JfP.A00(0Pz.A1B("The PublicKeyCredential response json had an unexpected exception when parsing: ", th));
            }
        }
    }

    public static final PublicKeyCredentialCreationOptions convert(C2965Jeu c2965Jeu) {
        return Companion.convert(c2965Jeu);
    }
}
