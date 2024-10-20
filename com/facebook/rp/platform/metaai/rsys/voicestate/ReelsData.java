package com.facebook.rp.platform.metaai.rsys.voicestate;

import X.0Pz;
import X.11T;
import X.1BL;
import X.7zN;
import X.C04v;

/* loaded from: ReelsData.class */
public final class ReelsData extends C04v {
    public final String author;
    public final String profilePictureUrl;
    public final String reelsUrl;
    public final String thumbnailUrl;

    public ReelsData(String str, String str2, String str3, String str4) {
        this.reelsUrl = str;
        this.thumbnailUrl = str2;
        this.author = str3;
        this.profilePictureUrl = str4;
    }

    public static /* synthetic */ ReelsData copy$default(ReelsData reelsData, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reelsData.reelsUrl;
        }
        if ((i & 2) != 0) {
            str2 = reelsData.thumbnailUrl;
        }
        if ((i & 4) != 0) {
            str3 = reelsData.author;
        }
        if ((i & 8) != 0) {
            str4 = reelsData.profilePictureUrl;
        }
        return new ReelsData(str, str2, str3, str4);
    }

    public final String component1() {
        return this.reelsUrl;
    }

    public final String component2() {
        return this.thumbnailUrl;
    }

    public final String component3() {
        return this.author;
    }

    public final String component4() {
        return this.profilePictureUrl;
    }

    public final ReelsData copy(String str, String str2, String str3, String str4) {
        return new ReelsData(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ReelsData)) {
                return false;
            }
            ReelsData reelsData = (ReelsData) obj;
            if (!11T.A0O(this.reelsUrl, reelsData.reelsUrl) || !11T.A0O(this.thumbnailUrl, reelsData.thumbnailUrl) || !11T.A0O(this.author, reelsData.author) || !11T.A0O(this.profilePictureUrl, reelsData.profilePictureUrl)) {
                return false;
            }
        }
        return true;
    }

    public final String getAuthor() {
        return this.author;
    }

    public final String getProfilePictureUrl() {
        return this.profilePictureUrl;
    }

    public final String getReelsUrl() {
        return this.reelsUrl;
    }

    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public int hashCode() {
        return (((((1BL.A05(this.reelsUrl) * 31) + 1BL.A05(this.thumbnailUrl)) * 31) + 1BL.A05(this.author)) * 31) + 7zN.A05(this.profilePictureUrl);
    }

    public String toString() {
        return 0Pz.A14("ReelsData(reelsUrl=", this.reelsUrl, ", thumbnailUrl=", this.thumbnailUrl, ", author=", this.author, ", profilePictureUrl=", this.profilePictureUrl, ')');
    }
}
