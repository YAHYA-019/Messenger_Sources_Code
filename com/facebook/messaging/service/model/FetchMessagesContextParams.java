package com.facebook.messaging.service.model;

import X.AbK;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.base.MoreObjects;

/* loaded from: FetchMessagesContextParams.class */
public final class FetchMessagesContextParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSS.A00(90);
    public final int A00;
    public final int A01;
    public final long A02;
    public final ThreadKey A03;
    public final String A04;

    public FetchMessagesContextParams(Parcel parcel) {
        this.A03 = AbK.A0X(parcel);
        this.A04 = parcel.readString();
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A02 = parcel.readLong();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if (r304 > 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public FetchMessagesContextParams(com.facebook.messaging.model.threadkey.ThreadKey r302, java.lang.String r303, long r304) {
        /*
            r301 = this;
            r0 = r301
            r0.<init>()
            r0 = r303
            boolean r0 = X.1JF.A0B(r0)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L20
            r0 = 0
            r307 = r0
            r0 = r304
            r1 = r307
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r309 = r0
            r0 = 0
            r306 = r0
            r0 = r309
            if (r0 <= 0) goto L23
        L20:
            r0 = 1
            r306 = r0
        L23:
            r0 = r306
            com.google.common.base.Preconditions.checkArgument(r0)
            r0 = r301
            r1 = r302
            r0.A03 = r1
            r0 = r301
            r1 = r303
            r0.A04 = r1
            r0 = 20
            r306 = r0
            r0 = r301
            r1 = r306
            r0.A01 = r1
            r0 = r301
            r1 = r306
            r0.A00 = r1
            r0 = r301
            r1 = r304
            r0.A02 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.service.model.FetchMessagesContextParams.<init>(com.facebook.messaging.model.threadkey.ThreadKey, java.lang.String, long):void");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("threadKey", this.A03);
        stringHelper.add("messageId", this.A04);
        stringHelper.add("maxToFetchBefore", this.A01);
        stringHelper.add("maxToFetchAfter", this.A00);
        stringHelper.add("timestampOfMessageToFetch", this.A02);
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A03, i);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A02);
    }
}
