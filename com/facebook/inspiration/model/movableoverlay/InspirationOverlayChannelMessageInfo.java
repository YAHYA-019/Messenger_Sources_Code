package com.facebook.inspiration.model.movableoverlay;

import X.11T;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.EnumC3499Mfu;
import X.FKc;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.GraphQLXFBChannelMessageType;
import com.facebook.inspiration.model.movableoverlay.common.InspirationOverlayPosition;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: InspirationOverlayChannelMessageInfo.class */
public final class InspirationOverlayChannelMessageInfo implements Parcelable {
    public static volatile InspirationOverlayPosition A06;
    public static final Parcelable.Creator CREATOR = new FKc(22);
    public final EnumC3499Mfu A00;
    public final GraphQLXFBChannelMessageType A01;
    public final String A02;
    public final String A03;
    public final InspirationOverlayPosition A04;
    public final Set A05;

    public InspirationOverlayChannelMessageInfo(EnumC3499Mfu enumC3499Mfu, GraphQLXFBChannelMessageType graphQLXFBChannelMessageType, InspirationOverlayPosition inspirationOverlayPosition, String str, String str2, Set set) {
        this.A00 = enumC3499Mfu;
        C1pq.A08("messageId", str);
        this.A02 = str;
        this.A01 = graphQLXFBChannelMessageType;
        this.A04 = inspirationOverlayPosition;
        C1pq.A08("threadId", str2);
        this.A03 = str2;
        this.A05 = Collections.unmodifiableSet(set);
    }

    public InspirationOverlayChannelMessageInfo(Parcel parcel) {
        InspirationOverlayPosition inspirationOverlayPosition = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A00 = null;
        } else {
            this.A00 = EnumC3499Mfu.values()[parcel.readInt()];
        }
        this.A02 = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = GraphQLXFBChannelMessageType.values()[parcel.readInt()];
        }
        this.A04 = parcel.readInt() != 0 ? (InspirationOverlayPosition) InspirationOverlayPosition.CREATOR.createFromParcel(parcel) : inspirationOverlayPosition;
        this.A03 = parcel.readString();
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A05 = Collections.unmodifiableSet(A0v);
    }

    public InspirationOverlayPosition A00() {
        if (this.A05.contains("overlayPosition")) {
            return this.A04;
        }
        if (A06 == null) {
            synchronized (this) {
                if (A06 == null) {
                    A06 = new InspirationOverlayPosition(0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
        }
        return A06;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationOverlayChannelMessageInfo)) {
                return false;
            }
            InspirationOverlayChannelMessageInfo inspirationOverlayChannelMessageInfo = (InspirationOverlayChannelMessageInfo) obj;
            if (this.A00 != inspirationOverlayChannelMessageInfo.A00 || !11T.A0O(this.A02, inspirationOverlayChannelMessageInfo.A02) || this.A01 != inspirationOverlayChannelMessageInfo.A01 || !11T.A0O(A00(), inspirationOverlayChannelMessageInfo.A00()) || !11T.A0O(this.A03, inspirationOverlayChannelMessageInfo.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = -1;
        int A04 = C1pq.A04(this.A02, C3o5.A03(this.A00) + 31);
        GraphQLXFBChannelMessageType graphQLXFBChannelMessageType = this.A01;
        if (graphQLXFBChannelMessageType != null) {
            i = graphQLXFBChannelMessageType.ordinal();
        }
        return C1pq.A04(this.A03, C1pq.A04(A00(), (A04 * 31) + i));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0e(parcel, this.A00);
        parcel.writeString(this.A02);
        C3o5.A0e(parcel, this.A01);
        InspirationOverlayPosition inspirationOverlayPosition = this.A04;
        if (inspirationOverlayPosition == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inspirationOverlayPosition.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A03);
        Iterator A0S = C3o5.A0S(parcel, this.A05);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
