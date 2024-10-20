package com.google.android.gms.fido.fido2.api.common;

import X.1BK;
import X.AbstractC00481b7;
import X.AbstractC01153q8;
import X.AbstractC09524qc;
import X.AnonymousClass001;
import X.C1fa;
import X.DKB;
import X.DKC;
import X.GOq;
import X.JQx;
import X.JQz;
import X.JR0;
import X.K5y;
import X.K5z;
import X.KQ8;
import X.KQA;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.util.Base64;
import android.util.Log;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.privacy.e2ee.genericimpl.store.DevicePkeKeypairStoreImplKt;
import com.google.android.gms.fido.common.Transport;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: PublicKeyCredentialCreationOptions.class */
public final class PublicKeyCredentialCreationOptions extends RequestOptions {
    public static final Parcelable.Creator CREATOR = LGn.A00(95);
    public ResultReceiver A00;
    public final AttestationConveyancePreference A01;
    public final AuthenticationExtensions A02;
    public final AuthenticatorSelectionCriteria A03;
    public final PublicKeyCredentialRpEntity A04;
    public final PublicKeyCredentialUserEntity A05;
    public final TokenBinding A06;
    public final Double A07;
    public final Integer A08;
    public final String A09;
    public final List A0A;
    public final List A0B;
    public final byte[] A0C;

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, X.Kqn] */
    public PublicKeyCredentialCreationOptions(ResultReceiver resultReceiver, AuthenticationExtensions authenticationExtensions, AuthenticatorSelectionCriteria authenticatorSelectionCriteria, PublicKeyCredentialRpEntity publicKeyCredentialRpEntity, PublicKeyCredentialUserEntity publicKeyCredentialUserEntity, TokenBinding tokenBinding, Double d, Integer num, String str, String str2, List list, List list2, byte[] bArr) {
        JSONObject A1F;
        ?? obj;
        String str3;
        JSONArray jSONArray;
        ArrayList A0s;
        int i;
        int i2;
        ArrayList arrayList;
        K5z k5z;
        this.A00 = resultReceiver;
        if (str2 == null) {
            AbstractC00481b7.A02(publicKeyCredentialRpEntity);
            this.A04 = publicKeyCredentialRpEntity;
            AbstractC00481b7.A02(publicKeyCredentialUserEntity);
            this.A05 = publicKeyCredentialUserEntity;
            AbstractC00481b7.A02(bArr);
            this.A0C = bArr;
            AbstractC00481b7.A02(list);
            this.A0A = list;
            this.A07 = d;
            this.A0B = list2;
            this.A03 = authenticatorSelectionCriteria;
            this.A08 = num;
            this.A06 = tokenBinding;
            if (str != null) {
                try {
                    this.A01 = AttestationConveyancePreference.A00(str);
                } catch (KQA e) {
                    throw new IllegalArgumentException((Throwable) e);
                }
            }
            this.A02 = authenticationExtensions;
            return;
        }
        try {
            A1F = DKC.A1F(str2);
            obj = new Object();
            JSONObject jSONObject = A1F.getJSONObject(PublicKeyCredentialControllerUtility.JSON_KEY_RP);
            str3 = null;
            obj.A03 = new PublicKeyCredentialRpEntity(jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID), jSONObject.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME), jSONObject.has(PublicKeyCredentialControllerUtility.JSON_KEY_ICON) ? jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_ICON) : null);
            JSONObject jSONObject2 = A1F.getJSONObject(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
            String string = jSONObject2.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            obj.A04 = new PublicKeyCredentialUserEntity(string == null ? null : Base64.decode(string, 11), jSONObject2.getString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME), jSONObject2.has(PublicKeyCredentialControllerUtility.JSON_KEY_ICON) ? jSONObject2.optString(PublicKeyCredentialControllerUtility.JSON_KEY_ICON) : null, jSONObject2.optString(PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME));
            String string2 = A1F.getString(PublicKeyCredentialControllerUtility.JSON_KEY_CHALLENGE);
            byte[] decode = string2 == null ? null : Base64.decode(string2, 11);
            AbstractC00481b7.A02(decode);
            obj.A08 = decode;
            jSONArray = A1F.getJSONArray(PublicKeyCredentialControllerUtility.JSON_KEY_PUB_KEY_CRED_PARAMS);
            A0s = AnonymousClass001.A0s();
            i = 0;
            i2 = 0;
        } catch (JSONException e2) {
            throw new IllegalArgumentException(e2);
        }
        while (true) {
            if (i2 >= jSONArray.length()) {
                break;
            }
            JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
            try {
                new K5y(new PublicKeyCredentialParameters(jSONObject3.getString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE), jSONObject3.getInt(PublicKeyCredentialControllerUtility.JSON_KEY_ALG)));
            } catch (IllegalArgumentException unused) {
                k5z = K5z.A00;
            }
            if (k5z instanceof K5y) {
                A0s.add(((K5y) k5z).zza);
            }
            i2++;
            throw new IllegalArgumentException(e2);
        }
        obj.A06 = A0s;
        if (A1F.has(PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT)) {
            obj.A05 = Double.valueOf(A1F.getDouble(PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT) / 1000.0d);
        }
        if (A1F.has(PublicKeyCredentialControllerUtility.JSON_KEY_EXCLUDE_CREDENTIALS)) {
            JSONArray jSONArray2 = A1F.getJSONArray(PublicKeyCredentialControllerUtility.JSON_KEY_EXCLUDE_CREDENTIALS);
            ArrayList A0s2 = AnonymousClass001.A0s();
            while (true) {
                if (i >= jSONArray2.length()) {
                    break;
                }
                JSONObject jSONObject4 = jSONArray2.getJSONObject(i);
                Parcelable.Creator creator = PublicKeyCredentialDescriptor.CREATOR;
                String string3 = jSONObject4.getString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                byte[] decode2 = Base64.decode(jSONObject4.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ID), 11);
                if (jSONObject4.has(PublicKeyCredentialControllerUtility.JSON_KEY_TRANSPORTS)) {
                    JSONArray jSONArray3 = jSONObject4.getJSONArray(PublicKeyCredentialControllerUtility.JSON_KEY_TRANSPORTS);
                    if (jSONArray3 == null) {
                        arrayList = null;
                    } else {
                        HashSet hashSet = new HashSet(jSONArray3.length());
                        int i3 = 0;
                        while (true) {
                            if (i3 >= jSONArray3.length()) {
                                break;
                            }
                            String string4 = jSONArray3.getString(i3);
                            if (string4 != null && !string4.isEmpty()) {
                                try {
                                    hashSet.add(Transport.A00(string4));
                                } catch (KQ8 unused2) {
                                    Log.w("Transport", "Ignoring unrecognized transport ".concat(string4));
                                }
                            }
                            i3++;
                        }
                        arrayList = 1BK.A17(hashSet);
                    }
                } else {
                    arrayList = null;
                }
                A0s2.add(new PublicKeyCredentialDescriptor(string3, arrayList, decode2));
                i++;
            }
            obj.A07 = A0s2;
        }
        if (A1F.has(PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_SELECTION)) {
            JSONObject jSONObject5 = A1F.getJSONObject(PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_SELECTION);
            String optString = jSONObject5.has(PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_ATTACHMENT) ? jSONObject5.optString(PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_ATTACHMENT) : null;
            String optString2 = jSONObject5.has(PublicKeyCredentialControllerUtility.JSON_KEY_RES_KEY) ? jSONObject5.optString(PublicKeyCredentialControllerUtility.JSON_KEY_RES_KEY) : null;
            Boolean valueOf = jSONObject5.has(PublicKeyCredentialControllerUtility.JSON_KEY_REQUIRE_RES_KEY) ? Boolean.valueOf(jSONObject5.optBoolean(PublicKeyCredentialControllerUtility.JSON_KEY_REQUIRE_RES_KEY)) : null;
            String A00 = DKB.A00(559);
            obj.A02 = new AuthenticatorSelectionCriteria(valueOf, optString, jSONObject5.has(A00) ? jSONObject5.optString(A00) : str3, optString2);
        }
        if (A1F.has(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS)) {
            JSONObject jSONObject6 = A1F.getJSONObject(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS);
            FidoAppIdExtension fidoAppIdExtension = null;
            UserVerificationMethodExtension userVerificationMethodExtension = null;
            zzs zzsVar = null;
            zzz zzzVar = null;
            zzab zzabVar = null;
            zzad zzadVar = null;
            zzu zzuVar = null;
            zzag zzagVar = null;
            GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension = null;
            zzak zzakVar = null;
            zzaw zzawVar = null;
            if (jSONObject6.has("fidoAppIdExtension")) {
                new FidoAppIdExtension(jSONObject6.getJSONObject("fidoAppIdExtension").getString(PublicKeyCredentialControllerUtility.JSON_KEY_APPID));
            }
            if (jSONObject6.has(PublicKeyCredentialControllerUtility.JSON_KEY_APPID)) {
                new FidoAppIdExtension(jSONObject6.getString(PublicKeyCredentialControllerUtility.JSON_KEY_APPID));
            }
            int i4 = 0;
            if (jSONObject6.has("prf")) {
                if (jSONObject6.has("prfAlreadyHashed")) {
                    throw new JSONException("both prf and prfAlreadyHashed extensions found");
                }
                zzakVar = zzak.A00(jSONObject6.getJSONObject("prf"), false);
            } else if (jSONObject6.has("prfAlreadyHashed")) {
                zzakVar = zzak.A00(jSONObject6.getJSONObject("prfAlreadyHashed"), true);
            }
            if (jSONObject6.has("cableAuthenticationExtension")) {
                JSONArray jSONArray4 = jSONObject6.getJSONArray("cableAuthenticationExtension");
                ArrayList A0s3 = AnonymousClass001.A0s();
                while (true) {
                    if (i4 >= jSONArray4.length()) {
                        break;
                    }
                    JSONObject jSONObject7 = jSONArray4.getJSONObject(i4);
                    A0s3.add(new zzq(Base64.decode(jSONObject7.getString("clientEid"), 11), Base64.decode(jSONObject7.getString("authenticatorEid"), 11), Base64.decode(jSONObject7.getString("sessionPreKey"), 11), jSONObject7.getLong(DevicePkeKeypairStoreImplKt.VERSION_JSON_KEY)));
                    i4++;
                }
                new zzs(A0s3);
            }
            if (jSONObject6.has("userVerificationMethodExtension")) {
                new UserVerificationMethodExtension(jSONObject6.getJSONObject("userVerificationMethodExtension").getBoolean("uvm"));
            }
            if (jSONObject6.has("google_multiAssertionExtension")) {
                new zzz(jSONObject6.getJSONObject("google_multiAssertionExtension").getBoolean("requestForMultiAssertion"));
            }
            if (jSONObject6.has("google_sessionIdExtension")) {
                new zzab(jSONObject6.getJSONObject("google_sessionIdExtension").getInt("sessionId"));
            }
            if (jSONObject6.has("google_silentVerificationExtension")) {
                new zzad(jSONObject6.getJSONObject("google_silentVerificationExtension").getBoolean("silentVerification"));
            }
            if (jSONObject6.has("devicePublicKeyExtension")) {
                jSONObject6.getJSONObject("devicePublicKeyExtension").getBoolean("devicePublicKey");
                new Object();
            }
            if (jSONObject6.has("google_tunnelServerIdExtension")) {
                new zzag(jSONObject6.getJSONObject("google_tunnelServerIdExtension").getString("tunnelServerId"));
            }
            if (jSONObject6.has("google_thirdPartyPaymentExtension")) {
                new GoogleThirdPartyPaymentExtension(jSONObject6.getJSONObject("google_thirdPartyPaymentExtension").getBoolean(PublicKeyCredentialControllerUtility.JSON_KEY_THIRD_PARTY_PAYMENT));
            }
            if (jSONObject6.has("txAuthSimple")) {
                new zzaw(jSONObject6.getString("txAuthSimple"));
            }
            obj.A01 = new AuthenticationExtensions(fidoAppIdExtension, googleThirdPartyPaymentExtension, userVerificationMethodExtension, zzabVar, zzadVar, zzagVar, null, zzakVar, zzawVar, zzsVar, zzuVar, zzzVar);
        }
        if (A1F.has(PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION)) {
            try {
                obj.A00 = AttestationConveyancePreference.A00(A1F.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION));
            } catch (KQA e3) {
                Log.w("PKCCreationOptions", "Invalid AttestationConveyancePreference", e3);
                obj.A00 = AttestationConveyancePreference.NONE;
            }
        }
        obj.A00();
        this.A09 = str2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialCreationOptions)) {
            return false;
        }
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) obj;
        if (!AbstractC09524qc.A00(this.A04, publicKeyCredentialCreationOptions.A04) || !AbstractC09524qc.A00(this.A05, publicKeyCredentialCreationOptions.A05) || !Arrays.equals(this.A0C, publicKeyCredentialCreationOptions.A0C) || !AbstractC09524qc.A00(this.A07, publicKeyCredentialCreationOptions.A07)) {
            return false;
        }
        List list = this.A0A;
        List list2 = publicKeyCredentialCreationOptions.A0A;
        if (!list.containsAll(list2) || !list2.containsAll(list)) {
            return false;
        }
        List list3 = this.A0B;
        List list4 = publicKeyCredentialCreationOptions.A0B;
        if (list3 == null) {
            if (list4 != null) {
                return false;
            }
        } else if (list4 == null || !list3.containsAll(list4) || !list4.containsAll(list3)) {
            return false;
        }
        if (AbstractC09524qc.A00(this.A03, publicKeyCredentialCreationOptions.A03) && AbstractC09524qc.A00(this.A08, publicKeyCredentialCreationOptions.A08) && AbstractC09524qc.A00(this.A06, publicKeyCredentialCreationOptions.A06) && AbstractC09524qc.A00(this.A01, publicKeyCredentialCreationOptions.A01) && AbstractC09524qc.A00(this.A02, publicKeyCredentialCreationOptions.A02)) {
            return JR0.A1X(this.A09, publicKeyCredentialCreationOptions.A09);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A04, this.A05, Integer.valueOf(Arrays.hashCode(this.A0C)), this.A0A, this.A07, this.A0B, this.A03, this.A08, this.A06, this.A01, this.A02, this.A09});
    }

    public final String toString() {
        AuthenticationExtensions authenticationExtensions = this.A02;
        AttestationConveyancePreference attestationConveyancePreference = this.A01;
        TokenBinding tokenBinding = this.A06;
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = this.A03;
        List list = this.A0B;
        List list2 = this.A0A;
        byte[] bArr = this.A0C;
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = this.A05;
        String valueOf = String.valueOf(this.A04);
        String valueOf2 = String.valueOf(publicKeyCredentialUserEntity);
        String A00 = C1fa.A00(bArr);
        String valueOf3 = String.valueOf(list2);
        String valueOf4 = String.valueOf(list);
        String valueOf5 = String.valueOf(authenticatorSelectionCriteria);
        String valueOf6 = String.valueOf(tokenBinding);
        String valueOf7 = String.valueOf(attestationConveyancePreference);
        String valueOf8 = String.valueOf(authenticationExtensions);
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("PublicKeyCredentialCreationOptions{\n rp=");
        A0k.append(valueOf);
        A0k.append(", \n user=");
        A0k.append(valueOf2);
        A0k.append(", \n challenge=");
        A0k.append(A00);
        A0k.append(", \n parameters=");
        A0k.append(valueOf3);
        A0k.append(", \n timeoutSeconds=");
        A0k.append(this.A07);
        A0k.append(", \n excludeList=");
        A0k.append(valueOf4);
        A0k.append(", \n authenticatorSelection=");
        A0k.append(valueOf5);
        A0k.append(", \n requestId=");
        A0k.append(this.A08);
        A0k.append(", \n tokenBinding=");
        A0k.append(valueOf6);
        A0k.append(", \n attestationConveyancePreference=");
        A0k.append(valueOf7);
        A0k.append(", \n authenticationExtensions=");
        return GOq.A12(valueOf8, A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A07(parcel, this.A04, 2, i);
        AbstractC01153q8.A07(parcel, this.A05, 3, i);
        AbstractC01153q8.A0B(parcel, this.A0C, 4);
        AbstractC01153q8.A0A(parcel, this.A0A, 5);
        Double d = this.A07;
        if (d != null) {
            parcel.writeInt(524294);
            parcel.writeDouble(d.doubleValue());
        }
        AbstractC01153q8.A0A(parcel, this.A0B, 7);
        AbstractC01153q8.A07(parcel, this.A03, 8, i);
        Integer num = this.A08;
        if (num != null) {
            parcel.writeInt(262153);
            JQz.A16(parcel, num);
        }
        AbstractC01153q8.A07(parcel, this.A06, 10, i);
        AttestationConveyancePreference attestationConveyancePreference = this.A01;
        AbstractC01153q8.A08(parcel, attestationConveyancePreference == null ? null : attestationConveyancePreference.toString(), 11);
        AbstractC01153q8.A07(parcel, this.A02, 12, i);
        AbstractC01153q8.A08(parcel, this.A09, 13);
        AbstractC01153q8.A07(parcel, this.A00, 14, i);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
