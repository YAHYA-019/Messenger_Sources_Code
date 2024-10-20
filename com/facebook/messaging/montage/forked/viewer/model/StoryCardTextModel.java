package com.facebook.messaging.montage.forked.viewer.model;

import X.11T;
import X.C1pq;
import X.C4Ed;
import com.google.common.collect.ImmutableList;

/* loaded from: StoryCardTextModel.class */
public final class StoryCardTextModel {
    public final C4Ed A00;
    public final ImmutableList A01;
    public final ImmutableList A02;
    public final String A03;
    public final boolean A04;

    public StoryCardTextModel(C4Ed c4Ed, ImmutableList immutableList, ImmutableList immutableList2, String str, boolean z) {
        this.A01 = immutableList;
        this.A04 = z;
        this.A02 = immutableList2;
        C1pq.A08("text", str);
        this.A03 = str;
        this.A00 = c4Ed;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof StoryCardTextModel)) {
                return false;
            }
            StoryCardTextModel storyCardTextModel = (StoryCardTextModel) obj;
            if (!11T.A0O(this.A01, storyCardTextModel.A01) || this.A04 != storyCardTextModel.A04 || !11T.A0O(this.A02, storyCardTextModel.A02) || !11T.A0O(this.A03, storyCardTextModel.A03) || !11T.A0O(this.A00, storyCardTextModel.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A00, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A02(C1pq.A03(this.A01), this.A04))));
    }
}
