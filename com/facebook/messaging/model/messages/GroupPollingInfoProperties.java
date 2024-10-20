package com.facebook.messaging.model.messages;

import X.1BK;
import X.1Du;
import X.4YV;
import X.7zL;
import X.AbE;
import X.AnonymousClass001;
import X.DJg;
import X.DKB;
import X.FKg;
import X.RO4;
import android.os.Parcel;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.acra.constants.ActionId;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: GroupPollingInfoProperties.class */
public final class GroupPollingInfoProperties extends GenericAdminMessageExtensibleData {
    public static final DJg CREATOR = new FKg(1);
    public final int A00;
    public final ImmutableList A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public GroupPollingInfoProperties(ImmutableList immutableList, String str, String str2, int i, boolean z, boolean z2, boolean z3) {
        this.A02 = str;
        this.A03 = str2;
        this.A00 = i;
        this.A06 = z;
        this.A05 = z2;
        this.A04 = z3;
        this.A01 = immutableList;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0134 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.messaging.model.messages.GroupPollingInfoProperties A00(java.lang.String r301, java.lang.String r302, java.lang.String r303, int r304, boolean r305, boolean r306, boolean r307) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.model.messages.GroupPollingInfoProperties.A00(java.lang.String, java.lang.String, java.lang.String, int, boolean, boolean, boolean):com.facebook.messaging.model.messages.GroupPollingInfoProperties");
    }

    private JSONArray A01() {
        JSONArray jSONArray;
        JSONObject jSONObject;
        ImmutableList immutableList = this.A01;
        if (immutableList == null) {
            jSONArray = null;
        } else {
            jSONArray = new JSONArray();
            1Du it = immutableList.iterator();
            while (it.hasNext()) {
                RO4 ro4 = (RO4) it.next();
                try {
                    jSONObject = AnonymousClass001.A12();
                    jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, ro4.A04);
                    jSONObject.put("text", ro4.A05);
                    String str = ro4.A03;
                    if (str != null) {
                        jSONObject.put("associatedUserShortName", str);
                    }
                    String str2 = ro4.A02;
                    if (str2 != null) {
                        jSONObject.put("associatedUserId", str2);
                    }
                    jSONObject.put("total_count", ro4.A00);
                    JSONArray jSONArray2 = new JSONArray();
                    1Du it2 = ro4.A01.iterator();
                    while (it2.hasNext()) {
                        jSONArray2.put(it2.next());
                    }
                    jSONObject.put("voters", jSONArray2);
                } catch (Exception unused) {
                    jSONObject = null;
                }
                jSONArray.put(jSONObject);
            }
        }
        return jSONArray;
    }

    @Override // com.facebook.messaging.model.messages.GenericAdminMessageExtensibleData
    public String A08() {
        return "GROUP_POLL";
    }

    @Override // com.facebook.messaging.model.messages.GenericAdminMessageExtensibleData
    public JSONObject A09() {
        JSONObject A12 = AnonymousClass001.A12();
        try {
            A12.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, this.A02);
            A12.put("text", this.A03);
            A12.put("total_count", this.A00);
            A12.put(DKB.A00(ActionId.BEGIN_START_ACTIVITY), this.A06);
            A12.put(DKB.A00(ActionId.APP_DID_ENTER_BACKGROUND), this.A05 ? AbE.A00(35) : "");
            A12.put("is_closed", this.A04);
            A12.put("options", A01());
            return A12;
        } catch (JSONException unused) {
            return A12;
        }
    }

    public LinkedHashMap A0A() {
        LinkedHashMap A1C;
        if (this.A05 && this.A04) {
            LinkedHashSet A15 = 7zL.A15();
            ImmutableList immutableList = this.A01;
            1Du it = immutableList.iterator();
            while (it.hasNext()) {
                A15.addAll(((RO4) it.next()).A01);
            }
            A1C = 1BK.A1C();
            if (!A15.isEmpty()) {
                HashMap A0u = AnonymousClass001.A0u();
                HashMap A0u2 = AnonymousClass001.A0u();
                1Du it2 = immutableList.iterator();
                while (it2.hasNext()) {
                    RO4 ro4 = (RO4) it2.next();
                    String str = ro4.A02;
                    AnonymousClass001.A1A(str, A0u, ro4.A01.size());
                    String str2 = ro4.A03;
                    if (str2 == null) {
                        str2 = ro4.A05;
                    }
                    A0u2.put(str, str2);
                }
                int A03 = AnonymousClass001.A03(Collections.max(A0u.values()));
                Iterator A0x = AnonymousClass001.A0x(A0u);
                while (A0x.hasNext()) {
                    Map.Entry A0z = AnonymousClass001.A0z(A0x);
                    if (AnonymousClass001.A03(A0z.getValue()) == A03) {
                        A1C.put(1BK.A0X(AnonymousClass001.A0j(A0z)), A0u2.get(A0z.getKey()));
                    }
                }
            }
        } else {
            A1C = 1BK.A1C();
        }
        return A1C;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj != null && (obj instanceof GroupPollingInfoProperties)) {
            GroupPollingInfoProperties groupPollingInfoProperties = (GroupPollingInfoProperties) obj;
            if (Objects.equal(this.A02, groupPollingInfoProperties.A02) && Objects.equal(this.A03, groupPollingInfoProperties.A03) && this.A00 == groupPollingInfoProperties.A00 && this.A06 == groupPollingInfoProperties.A06 && this.A05 == groupPollingInfoProperties.A05 && this.A04 == groupPollingInfoProperties.A04) {
                z = 4YV.A1Z(this.A01, groupPollingInfoProperties.A01);
            }
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A03, Integer.valueOf(this.A00), Boolean.valueOf(this.A06), Boolean.valueOf(this.A05), Boolean.valueOf(this.A04), this.A01});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A00);
        parcel.writeByte(this.A06 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A05 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A04 ? (byte) 1 : (byte) 0);
        parcel.writeString(4YV.A0u(A01()));
    }
}
