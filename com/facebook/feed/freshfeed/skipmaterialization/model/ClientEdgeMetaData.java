package com.facebook.feed.freshfeed.skipmaterialization.model;

/* loaded from: ClientEdgeMetaData.class */
public final class ClientEdgeMetaData {
    public int A00 = (-1) << (-1);
    public String adId;
    public int adImpressionTime;
    public String dedupKey;
    public long fetchedAt;
    public String filePath;
    public boolean isSeen;
    public String minGapType;
    public long storyRankingTime;

    public boolean equals(Object obj) {
        String str;
        String str2;
        boolean z = false;
        if (obj != null && (obj instanceof ClientEdgeMetaData)) {
            ClientEdgeMetaData clientEdgeMetaData = (ClientEdgeMetaData) obj;
            if (this.fetchedAt == clientEdgeMetaData.fetchedAt && (str = this.dedupKey) != null && str.length() != 0 && (str2 = clientEdgeMetaData.dedupKey) != null && str2.length() != 0) {
                z = str.equals(str2);
            }
        }
        return z;
    }

    public int hashCode() {
        int i = this.A00;
        if (i == ((-1) << (-1))) {
            String str = this.dedupKey;
            i = 0;
            if (str != null) {
                i = str.hashCode() + (((int) this.fetchedAt) * 31);
            }
            this.A00 = i;
        }
        return i;
    }

    public String toString() {
        String str = this.dedupKey;
        if (str == null) {
            str = super.toString();
        }
        return str;
    }
}
