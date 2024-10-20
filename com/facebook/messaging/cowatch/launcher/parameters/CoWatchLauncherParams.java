package com.facebook.messaging.cowatch.launcher.parameters;

import X.11T;
import X.1BL;
import X.4YV;
import X.C1pq;
import X.C3o5;
import X.CSQ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.GraphQLLivingRoomEntrySource;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: CoWatchLauncherParams.class */
public final class CoWatchLauncherParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSQ(26);
    public final GraphQLLivingRoomEntrySource A00;
    public final VideoInfo A01;
    public final ThreadKey A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public CoWatchLauncherParams(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        VideoInfo videoInfo = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = GraphQLLivingRoomEntrySource.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        this.A05 = 4YV.A1U(parcel.readInt());
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = (ThreadKey) ThreadKey.CREATOR.createFromParcel(parcel);
        }
        this.A01 = parcel.readInt() != 0 ? (VideoInfo) parcel.readParcelable(A0e) : videoInfo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002e, code lost:
    
        if (r303 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public CoWatchLauncherParams(com.facebook.graphql.enums.GraphQLLivingRoomEntrySource r302, com.facebook.messaging.cowatch.launcher.parameters.VideoInfo r303, com.facebook.messaging.model.threadkey.ThreadKey r304, java.lang.String r305, java.lang.String r306, boolean r307) {
        /*
            r301 = this;
            r0 = r301
            r0.<init>()
            r0 = r301
            r1 = r302
            r0.A00 = r1
            r0 = r301
            r1 = r305
            r0.A03 = r1
            r0 = r301
            r1 = r307
            r0.A05 = r1
            r0 = r301
            r1 = r306
            r0.A04 = r1
            r0 = r301
            r1 = r304
            r0.A02 = r1
            r0 = r301
            r1 = r303
            r0.A01 = r1
            r0 = r305
            if (r0 != 0) goto L31
            r0 = 0
            r308 = r0
            r0 = r303
            if (r0 == 0) goto L34
        L31:
            r0 = 1
            r308 = r0
        L34:
            r0 = r308
            com.google.common.base.Preconditions.checkArgument(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.cowatch.launcher.parameters.CoWatchLauncherParams.<init>(com.facebook.graphql.enums.GraphQLLivingRoomEntrySource, com.facebook.messaging.cowatch.launcher.parameters.VideoInfo, com.facebook.messaging.model.threadkey.ThreadKey, java.lang.String, java.lang.String, boolean):void");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CoWatchLauncherParams)) {
                return false;
            }
            CoWatchLauncherParams coWatchLauncherParams = (CoWatchLauncherParams) obj;
            if (this.A00 != coWatchLauncherParams.A00 || !11T.A0O(this.A03, coWatchLauncherParams.A03) || this.A05 != coWatchLauncherParams.A05 || !11T.A0O(this.A04, coWatchLauncherParams.A04) || !11T.A0O(this.A02, coWatchLauncherParams.A02) || !11T.A0O(this.A01, coWatchLauncherParams.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A04(this.A02, C1pq.A04(this.A04, C1pq.A02(C1pq.A04(this.A03, C3o5.A03(this.A00) + 31), this.A05))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0e(parcel, this.A00);
        1BL.A13(parcel, this.A03);
        parcel.writeInt(this.A05 ? 1 : 0);
        1BL.A13(parcel, this.A04);
        ThreadKey threadKey = this.A02;
        if (threadKey == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            threadKey.writeToParcel(parcel, i);
        }
        C3o5.A0d(parcel, this.A01, i);
    }
}
