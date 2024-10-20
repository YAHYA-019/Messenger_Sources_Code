package com.facebook.messaging.service.model;

import X.0S2;
import X.1BL;
import X.1F9;
import X.1Hb;
import X.1He;
import X.1Hk;
import X.AnonymousClass002;
import X.C2xc;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.http.interfaces.RequestPriority;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.base.MoreObjects;
import com.google.common.base.Platform;

/* loaded from: FetchThreadListParams.class */
public final class FetchThreadListParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C2xc(42);
    public final int A00;
    public final int A01;
    public final 1He A02;
    public final RequestPriority A03;
    public final 1F9 A04;
    public final 1Hb A05;
    public final ThreadKey A06;
    public final 1Hk A07;
    public final Integer A08;
    public final String A09;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x004b, code lost:
    
        if (r307 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public FetchThreadListParams(X.1He r302, com.facebook.http.interfaces.RequestPriority r303, X.1F9 r304, X.1Hb r305, com.facebook.messaging.model.threadkey.ThreadKey r306, X.1Hk r307, java.lang.Integer r308, java.lang.String r309, int r310, int r311) {
        /*
            r301 = this;
            r0 = r301
            r0.<init>()
            r0 = r301
            r1 = r302
            r0.A02 = r1
            r0 = r301
            r1 = r304
            r0.A04 = r1
            r0 = r301
            r1 = r306
            r0.A06 = r1
            r0 = r301
            r1 = r305
            r0.A05 = r1
            r0 = r301
            r1 = r308
            r0.A08 = r1
            r0 = r301
            r1 = r310
            r0.A00 = r1
            r0 = r301
            r1 = r303
            r0.A03 = r1
            r0 = r301
            r1 = r311
            r0.A01 = r1
            r0 = r301
            r1 = r309
            r0.A09 = r1
            r0 = r301
            r1 = r307
            r0.A07 = r1
            r0 = r304
            if (r0 != 0) goto L4e
            r0 = r306
            if (r0 != 0) goto L4e
            r0 = 0
            r312 = r0
            r0 = r307
            if (r0 == 0) goto L51
        L4e:
            r0 = 1
            r312 = r0
        L51:
            r0 = r312
            com.google.common.base.Preconditions.checkArgument(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.service.model.FetchThreadListParams.<init>(X.1He, com.facebook.http.interfaces.RequestPriority, X.1F9, X.1Hb, com.facebook.messaging.model.threadkey.ThreadKey, X.1Hk, java.lang.Integer, java.lang.String, int, int):void");
    }

    public FetchThreadListParams(Parcel parcel) {
        Integer num;
        String readString = parcel.readString();
        1Hk r304 = null;
        this.A02 = readString == null ? null : 1He.valueOf(readString);
        String readString2 = parcel.readString();
        this.A04 = readString2 == null ? null : 1F9.A00(readString2);
        this.A06 = ThreadKey.A0K(parcel.readString(), true);
        this.A05 = 1Hb.valueOf(parcel.readString());
        String readString3 = parcel.readString();
        if (readString3.equals("NONE")) {
            num = 0S2.A00;
        } else {
            if (!readString3.equals("STANDARD_GROUP")) {
                throw new IllegalArgumentException(readString3);
            }
            num = 0S2.A01;
        }
        this.A08 = num;
        this.A00 = parcel.readInt();
        this.A03 = (RequestPriority) 1BL.A0C(parcel, RequestPriority.class);
        this.A01 = parcel.readInt();
        this.A09 = parcel.readString();
        String readString4 = parcel.readString();
        this.A07 = Platform.stringIsNullOrEmpty(readString4) ? r304 : 1Hk.valueOf(readString4);
    }

    public static String A00(Integer num) {
        return 1 - num.intValue() != 0 ? "NONE" : "STANDARD_GROUP";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            FetchThreadListParams fetchThreadListParams = (FetchThreadListParams) obj;
            if (this.A00 != fetchThreadListParams.A00 || this.A02 != fetchThreadListParams.A02) {
                return false;
            }
            1F9 r0 = this.A04;
            1F9 r02 = fetchThreadListParams.A04;
            if (r0 == null) {
                if (r02 != null) {
                    return false;
                }
            } else if (!r0.equals(r02)) {
                return false;
            }
            ThreadKey threadKey = this.A06;
            ThreadKey threadKey2 = fetchThreadListParams.A06;
            if (threadKey == null) {
                if (threadKey2 != null) {
                    return false;
                }
            } else if (!threadKey.equals(threadKey2)) {
                return false;
            }
            if (this.A05 != fetchThreadListParams.A05 || this.A08 != fetchThreadListParams.A08 || this.A03 != fetchThreadListParams.A03 || this.A07 != fetchThreadListParams.A07) {
                return false;
            }
            String str = this.A09;
            String str2 = fetchThreadListParams.A09;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (this.A01 != fetchThreadListParams.A01) {
                z = false;
            }
        }
        return z;
    }

    public int hashCode() {
        int i = 0;
        int A04 = ((((((AnonymousClass002.A04(this.A02) * 31) + AnonymousClass002.A04(this.A04)) * 31) + AnonymousClass002.A04(this.A06)) * 31) + AnonymousClass002.A04(this.A05)) * 31;
        Integer num = this.A08;
        int hashCode = (((((((((A04 + (num != null ? A00(num).hashCode() + num.intValue() : 0)) * 31) + this.A00) * 31) + AnonymousClass002.A04(this.A03)) * 31) + this.A01) * 31) + 1BL.A06(this.A09)) * 31;
        1Hk r0 = this.A07;
        if (r0 != null) {
            i = r0.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("dataFreshnessParam", this.A02);
        1F9 r0 = this.A04;
        String str = null;
        stringHelper.add("folder", r0 == null ? null : r0.name());
        ThreadKey threadKey = this.A06;
        if (threadKey != null) {
            str = threadKey.toString();
        }
        stringHelper.add("parentThreadKey", str);
        stringHelper.add("filter", this.A05.name());
        stringHelper.add("groupFilterType", A00(this.A08));
        stringHelper.add("maxToFetch", this.A00);
        stringHelper.add("requestPriority", this.A03.name());
        stringHelper.add("minToFetch", this.A01);
        stringHelper.add("pageAssignedAdminId", this.A09);
        stringHelper.add("virtualFolderName", this.A07);
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1He r0 = this.A02;
        String str = null;
        parcel.writeString(r0 == null ? null : r0.name());
        1F9 r02 = this.A04;
        parcel.writeString(r02 == null ? null : r02.dbName);
        ThreadKey threadKey = this.A06;
        parcel.writeString(threadKey == null ? null : threadKey.toString());
        1BL.A12(parcel, this.A05);
        parcel.writeString(A00(this.A08));
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A03, i);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A09);
        1Hk r03 = this.A07;
        if (r03 != null) {
            str = r03.name();
        }
        parcel.writeString(str);
    }
}
