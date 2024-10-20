package com.facebook.messaging.media.viewer.communityhighlights.model;

import X.11T;
import X.1BL;
import X.7zN;
import X.C04v;
import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CommunityHighlightsMediaViewerArgs.class */
public final class CommunityHighlightsMediaViewerArgs extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSV(31);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public CommunityHighlightsMediaViewerArgs(String str, String str2, String str3, String str4, String str5, String str6) {
        this.A03 = str;
        this.A04 = str2;
        this.A01 = str3;
        this.A05 = str4;
        this.A00 = str5;
        this.A02 = str6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CommunityHighlightsMediaViewerArgs)) {
                return false;
            }
            CommunityHighlightsMediaViewerArgs communityHighlightsMediaViewerArgs = (CommunityHighlightsMediaViewerArgs) obj;
            if (!11T.A0O(this.A03, communityHighlightsMediaViewerArgs.A03) || !11T.A0O(this.A04, communityHighlightsMediaViewerArgs.A04) || !11T.A0O(this.A01, communityHighlightsMediaViewerArgs.A01) || !11T.A0O(this.A05, communityHighlightsMediaViewerArgs.A05) || !11T.A0O(this.A00, communityHighlightsMediaViewerArgs.A00) || !11T.A0O(this.A02, communityHighlightsMediaViewerArgs.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((((((((1BL.A05(this.A03) * 31) + 1BL.A05(this.A04)) * 31) + 1BL.A05(this.A01)) * 31) + 1BL.A05(this.A05)) * 31) + 1BL.A05(this.A00)) * 31) + 7zN.A05(this.A02);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A01);
        parcel.writeString(this.A05);
        parcel.writeString(this.A00);
        parcel.writeString(this.A02);
    }
}
