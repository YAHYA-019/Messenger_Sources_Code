package com.facebook.messaging.accountlogin.helper;

import X.C0A2;
import X.CSR;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.account.recovery.common.model.AccountCandidateModel;

/* loaded from: SSOAccountModel.class */
public final class SSOAccountModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSR.A00(84);
    public int A00;
    public Uri A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public boolean A07;
    public boolean A08;

    public SSOAccountModel(AccountCandidateModel accountCandidateModel, String str) {
        this.A05 = str;
        this.A03 = accountCandidateModel.name;
        String str2 = accountCandidateModel.firstName;
        this.A02 = str2;
        if (str2 != null) {
            Uri uri = null;
            try {
                uri = C0A2.A03(accountCandidateModel.profilePictureUri);
            } catch (SecurityException unused) {
            }
            this.A01 = uri;
        }
        this.A05.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r301.A07 != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A00() {
        /*
            r301 = this;
            r0 = r301
            java.lang.String r0 = r0.A06
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L26
            r0 = r301
            java.lang.String r0 = r0.A04
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L26
            r0 = r301
            boolean r0 = r0.A08
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L26
            r0 = r301
            boolean r0 = r0.A07
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            if (r0 == 0) goto L2a
        L26:
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
        L2a:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.accountlogin.helper.SSOAccountModel.A00():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r301.A01 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A01() {
        /*
            r301 = this;
            r0 = r301
            java.lang.String r0 = r0.A02
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L1d
            r0 = r301
            java.lang.String r0 = r0.A03
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L1d
            r0 = r301
            android.net.Uri r0 = r0.A01
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L21
        L1d:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L21:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.accountlogin.helper.SSOAccountModel.A01():boolean");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A06);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeByte(this.A08 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A07 ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A05);
    }
}
