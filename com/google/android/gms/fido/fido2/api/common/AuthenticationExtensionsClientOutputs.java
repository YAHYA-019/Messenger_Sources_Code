package com.google.android.gms.fido.fido2.api.common;

import X.0Pz;
import X.1BK;
import X.AbstractC01153q8;
import X.AbstractC09524qc;
import X.AnonymousClass001;
import X.JQx;
import X.JR0;
import X.LGm;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: AuthenticationExtensionsClientOutputs.class */
public final class AuthenticationExtensionsClientOutputs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGm.A00(12);
    public final AuthenticationExtensionsCredPropsOutputs A00;
    public final UvmEntries A01;
    public final zzf A02;
    public final zzh A03;
    public final String A04;

    public AuthenticationExtensionsClientOutputs(AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs, UvmEntries uvmEntries, zzf zzfVar, zzh zzhVar, String str) {
        this.A01 = uvmEntries;
        this.A02 = zzfVar;
        this.A00 = authenticationExtensionsCredPropsOutputs;
        this.A03 = zzhVar;
        this.A04 = str;
    }

    public final JSONObject A00() {
        RuntimeException A0s;
        try {
            JSONObject A12 = AnonymousClass001.A12();
            AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs = this.A00;
            if (authenticationExtensionsCredPropsOutputs != null) {
                try {
                    JSONObject A122 = AnonymousClass001.A12();
                    A122.put(PublicKeyCredentialControllerUtility.JSON_KEY_RK, authenticationExtensionsCredPropsOutputs.A00);
                    A12.put(PublicKeyCredentialControllerUtility.JSON_KEY_CRED_PROPS, A122);
                } catch (JSONException e) {
                    A0s = 1BK.A0s("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e);
                    throw A0s;
                }
            }
            UvmEntries uvmEntries = this.A01;
            if (uvmEntries != null) {
                try {
                    JSONArray jSONArray = new JSONArray();
                    List list = uvmEntries.A00;
                    if (list != null) {
                        int i = 0;
                        while (true) {
                            if (i >= list.size()) {
                                break;
                            }
                            UvmEntry uvmEntry = (UvmEntry) list.get(i);
                            JSONArray jSONArray2 = new JSONArray();
                            jSONArray2.put((int) uvmEntry.A02);
                            jSONArray2.put((int) uvmEntry.A01);
                            jSONArray2.put((int) uvmEntry.A02);
                            jSONArray.put(i, jSONArray2);
                            i++;
                        }
                    }
                    A12.put("uvm", jSONArray);
                } catch (JSONException e2) {
                    A0s = 1BK.A0s("Error encoding UvmEntries to JSON object", e2);
                    throw A0s;
                }
            }
            zzh zzhVar = this.A03;
            if (zzhVar != null) {
                A12.put("prf", zzhVar.A00());
            }
            Object obj = this.A04;
            if (obj != null) {
                A12.put("txAuthSimple", obj);
            }
            return A12;
        } catch (JSONException e3) {
            throw 1BK.A0s("Error encoding AuthenticationExtensionsClientOutputs to JSON object", e3);
        }
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof AuthenticationExtensionsClientOutputs) {
            AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = (AuthenticationExtensionsClientOutputs) obj;
            if (AbstractC09524qc.A00(this.A01, authenticationExtensionsClientOutputs.A01) && AbstractC09524qc.A00(this.A02, authenticationExtensionsClientOutputs.A02) && AbstractC09524qc.A00(this.A00, authenticationExtensionsClientOutputs.A00) && AbstractC09524qc.A00(this.A03, authenticationExtensionsClientOutputs.A03)) {
                z = JR0.A1X(this.A04, authenticationExtensionsClientOutputs.A04);
            }
        }
        return z;
    }

    public int hashCode() {
        return JR0.A0O(this.A01, this.A02, this.A00, this.A03, this.A04);
    }

    public final String toString() {
        return 0Pz.A0j("AuthenticationExtensionsClientOutputs{", A00().toString(), "}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A07(parcel, this.A01, 1, i);
        AbstractC01153q8.A07(parcel, this.A02, 2, i);
        AbstractC01153q8.A07(parcel, this.A00, 3, i);
        AbstractC01153q8.A07(parcel, this.A03, 4, i);
        AbstractC01153q8.A08(parcel, this.A04, 5);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
