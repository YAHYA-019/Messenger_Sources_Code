package com.facebook.messaging.polling;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.AbH;
import X.AbL;
import X.BOT;
import X.C1pq;
import X.C3o5;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.collect.ImmutableList;

/* loaded from: PollingInputParams.class */
public final class PollingInputParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSS.A00(16);
    public final BOT A00;
    public final ThreadKey A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final ImmutableList A06;
    public final String A07;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0044, code lost:
    
        if (r303 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PollingInputParams(X.BOT r302, com.facebook.messaging.model.threadkey.ThreadKey r303, java.lang.String r304, java.lang.String r305, java.lang.String r306, boolean r307) {
        /*
            r301 = this;
            r0 = r301
            r0.<init>()
            r0 = r301
            r1 = r302
            r0.A00 = r1
            r0 = r301
            r1 = r307
            r0.A05 = r1
            r0 = r301
            r1 = r304
            r0.A02 = r1
            r0 = r301
            r1 = 0
            r0.A07 = r1
            r0 = r301
            r1 = 0
            r0.A06 = r1
            r0 = r301
            r1 = r305
            r0.A03 = r1
            r0 = r301
            r1 = r306
            r0.A04 = r1
            java.lang.String r0 = "threadKey"
            r1 = r303
            X.C1pq.A08(r0, r1)
            r0 = r301
            r1 = r303
            r0.A01 = r1
            r0 = r301
            java.lang.String r0 = r0.A03
            r308 = r0
            r0 = r308
            if (r0 != 0) goto L47
            r0 = 0
            r309 = r0
            r0 = r303
            if (r0 == 0) goto L4a
        L47:
            r0 = 1
            r309 = r0
        L4a:
            r0 = r309
            java.lang.String r1 = "Question id and thread key can't both be null."
            X.02W.A06(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.polling.PollingInputParams.<init>(X.BOT, com.facebook.messaging.model.threadkey.ThreadKey, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    public PollingInputParams(Parcel parcel) {
        String str = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A00 = null;
        } else {
            this.A00 = BOT.values()[parcel.readInt()];
        }
        int i = 0;
        this.A05 = 4YV.A1U(parcel.readInt());
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            int readInt = parcel.readInt();
            String[] strArr = new String[readInt];
            while (i < readInt) {
                i = AbH.A00(parcel, strArr, i);
            }
            this.A06 = ImmutableList.copyOf(strArr);
        }
        this.A03 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A04 = C3o5.A0O(parcel);
        this.A01 = (ThreadKey) ThreadKey.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PollingInputParams)) {
                return false;
            }
            PollingInputParams pollingInputParams = (PollingInputParams) obj;
            if (this.A00 != pollingInputParams.A00 || this.A05 != pollingInputParams.A05 || !11T.A0O(this.A02, pollingInputParams.A02) || !11T.A0O(this.A07, pollingInputParams.A07) || !11T.A0O(this.A06, pollingInputParams.A06) || !11T.A0O(this.A03, pollingInputParams.A03) || !11T.A0O(this.A04, pollingInputParams.A04) || !11T.A0O(this.A01, pollingInputParams.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A06, C1pq.A04(this.A07, C1pq.A04(this.A02, C1pq.A02(C3o5.A03(this.A00) + 31, this.A05)))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0e(parcel, this.A00);
        parcel.writeInt(this.A05 ? 1 : 0);
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A07);
        ImmutableList immutableList = this.A06;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                C3o5.A0h(parcel, A0Y);
            }
        }
        1BL.A13(parcel, this.A03);
        1BL.A13(parcel, this.A04);
        this.A01.writeToParcel(parcel, i);
    }
}
