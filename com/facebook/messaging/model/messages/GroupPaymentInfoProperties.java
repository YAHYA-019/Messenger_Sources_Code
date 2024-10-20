package com.facebook.messaging.model.messages;

import X.1BL;
import X.1Du;
import X.2JX;
import X.2JZ;
import X.2tS;
import X.4YT;
import X.4YU;
import X.4YV;
import X.6As;
import X.AbM;
import X.AnonymousClass001;
import X.C53v;
import X.DJg;
import X.DKF;
import X.DhZ;
import X.DkZ;
import X.Dkx;
import X.FJ8;
import X.FKg;
import android.os.Parcel;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.graphql.enums.EnumHelper;
import com.facebook.graphql.enums.GraphQLPeerToPeerPaymentRequestStatus;
import com.facebook.graphql.enums.GraphQLStringDefUtil;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: GroupPaymentInfoProperties.class */
public final class GroupPaymentInfoProperties extends GenericAdminMessageExtensibleData {
    public static final DJg CREATOR = new FKg(0);
    public final GraphQLPeerToPeerPaymentRequestStatus A00;
    public final 2JX A01;
    public final Dkx A02;
    public final ImmutableList A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;

    public GroupPaymentInfoProperties(GraphQLPeerToPeerPaymentRequestStatus graphQLPeerToPeerPaymentRequestStatus, 2JX r303, Dkx dkx, ImmutableList immutableList, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        this.A06 = str;
        this.A04 = str2;
        this.A02 = dkx;
        this.A00 = graphQLPeerToPeerPaymentRequestStatus;
        this.A07 = str3;
        this.A01 = r303;
        this.A03 = immutableList;
        this.A0A = z;
        this.A08 = str4;
        this.A09 = str5;
        this.A05 = str6;
    }

    public static 2JX A00(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString("user_id");
            String string2 = jSONObject.getString("user_name");
            6As A01 = 2JX.A01();
            A01.setString(PublicKeyCredentialControllerUtility.JSON_KEY_ID, string);
            A01.setString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, string2);
            return A01.getResult(2JX.class, 684260477);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Dkx A01(JSONObject jSONObject) {
        try {
            6As A00 = Dkx.A00();
            A00.setString("currency", jSONObject.getString("currency"));
            A00.A08("amount_with_offset", jSONObject.getInt("amount_with_offset"));
            A00.A08("offset", jSONObject.getInt("offset"));
            return (Dkx) A00.getResult(Dkx.class, 57213880);
        } catch (Exception unused) {
            return null;
        }
    }

    public static ImmutableList A02(JSONArray jSONArray) {
        try {
            ImmutableList.Builder A0h = 4YU.A0h();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= jSONArray.length()) {
                    return A0h.build();
                }
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                Dkx A01 = A01(jSONObject.getJSONObject("amount"));
                GraphQLPeerToPeerPaymentRequestStatus graphQLPeerToPeerPaymentRequestStatus = (GraphQLPeerToPeerPaymentRequestStatus) EnumHelper.A00(GraphQLPeerToPeerPaymentRequestStatus.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, jSONObject.getString("request_status"));
                2JX A00 = A00(jSONObject.getJSONObject("requestee"));
                Object obj = 2JZ.A01;
                6As newTreeBuilder = 2tS.A00().newTreeBuilder("PeerToPeerTransfer", 6As.class, 863248067);
                if (jSONObject.has("transfer") && jSONObject.getJSONObject("transfer").has("transfer_status")) {
                    newTreeBuilder.A0A(GraphQLStringDefUtil.A00().ATw("GraphQLPeerToPeerTransferReceiverStatus", jSONObject.getJSONObject("transfer").getString("transfer_status")), "receiver_status");
                }
                6As newTreeBuilder2 = 2tS.A00().newTreeBuilder("PeerToPeerPaymentRequest", 6As.class, -563803127);
                newTreeBuilder2.setTree("amount", Dkx.A01(A01));
                newTreeBuilder2.A00(graphQLPeerToPeerPaymentRequestStatus, "request_status");
                newTreeBuilder2.setTree("requestee", 2JX.A06(A00));
                newTreeBuilder2.setTree("transfer", (DhZ) newTreeBuilder.getResult(DhZ.class, 863248067));
                A0h.m11011add(newTreeBuilder2.getResult(DkZ.class, -563803127));
                i = i2 + 1;
            }
        } catch (Exception unused) {
            return null;
        }
    }

    private JSONArray A03(ImmutableList immutableList) {
        JSONObject jSONObject;
        try {
            JSONArray jSONArray = new JSONArray();
            1Du it = immutableList.iterator();
            while (it.hasNext()) {
                DkZ dkZ = (DkZ) it.next();
                JSONObject A12 = AnonymousClass001.A12();
                A12.put("amount", A04((Dkx) dkZ.A0L(-1413853096, Dkx.class, 57213880)));
                GraphQLPeerToPeerPaymentRequestStatus graphQLPeerToPeerPaymentRequestStatus = (GraphQLPeerToPeerPaymentRequestStatus) dkZ.A0g(GraphQLPeerToPeerPaymentRequestStatus.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, -1704809566);
                A12.put("request_status", graphQLPeerToPeerPaymentRequestStatus != null ? graphQLPeerToPeerPaymentRequestStatus.toString() : null);
                2JX A0L = 1BL.A0L(dkZ, 693933935, 684260477);
                JSONObject A122 = AnonymousClass001.A12();
                try {
                    A122.put("user_id", A0L.A0k());
                    A122.put("user_name", A0L.A0j());
                } catch (Exception unused) {
                }
                A12.put("requestee", A122);
                DhZ A0u = dkZ.A0u();
                try {
                    jSONObject = AnonymousClass001.A12();
                    String A0t = A0u.A0t(GraphQLStringDefUtil.A00(), "GraphQLPeerToPeerTransferReceiverStatus", 1059235906);
                    String str = null;
                    if (A0t != null) {
                        str = A0t;
                    }
                    jSONObject.put("transfer_status", str);
                } catch (Exception unused2) {
                    jSONObject = null;
                }
                A12.put("transfer", jSONObject);
                jSONArray.put(A12);
            }
            return jSONArray;
        } catch (Exception unused3) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static JSONObject A04(Dkx dkx) {
        try {
            JSONObject A12 = AnonymousClass001.A12();
            A12.put("currency", dkx.A0n());
            A12.put("amount_with_offset", dkx.getIntValue(-565489467));
            A12.put("offset", dkx.getIntValue(-1019779949));
            return A12;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.facebook.messaging.model.messages.GenericAdminMessageExtensibleData
    public String A08() {
        return 4YT.A00(28);
    }

    @Override // com.facebook.messaging.model.messages.GenericAdminMessageExtensibleData
    public JSONObject A09() {
        JSONObject A12 = AnonymousClass001.A12();
        try {
            A12.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, this.A06);
            A12.put("content", this.A04);
            A12.put("amount", A04(this.A02));
            A12.put("request_status", this.A00.toString());
            A12.put("memo_text", this.A07);
            2JX r0 = this.A01;
            JSONObject A122 = AnonymousClass001.A12();
            try {
                A122.put("user_id", r0.A0k());
                A122.put("user_name", r0.A0j());
            } catch (Exception unused) {
            }
            A12.put("requester", A122);
            A12.put("individual_requests", A03(this.A03));
            A12.put("theme_id", this.A08);
            A12.put("theme_name", this.A09);
            A12.put("gift_type", this.A05);
            A12.put("is_last_action", this.A0A);
        } catch (JSONException unused2) {
        }
        return A12;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj != null && (obj instanceof GroupPaymentInfoProperties)) {
            GroupPaymentInfoProperties groupPaymentInfoProperties = (GroupPaymentInfoProperties) obj;
            if (Objects.equal(this.A06, groupPaymentInfoProperties.A06)) {
                z = 4YV.A1Z(this.A04, groupPaymentInfoProperties.A04);
            }
        }
        return z;
    }

    public int hashCode() {
        return AbM.A05(this.A06, this.A04);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A06);
        parcel.writeString(this.A04);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        parcel.writeString(this.A05);
        FJ8.A0A(parcel, this.A02);
        C53v.A0J(parcel, this.A00);
        parcel.writeString(this.A07);
        FJ8.A0A(parcel, this.A01);
        DKF.A1E(parcel, A03(this.A03));
        parcel.writeByte(this.A0A ? (byte) 1 : (byte) 0);
    }
}
