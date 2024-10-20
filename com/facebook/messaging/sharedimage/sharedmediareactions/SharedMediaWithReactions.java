package com.facebook.messaging.sharedimage.sharedmediareactions;

import X.0Pz;
import X.11T;
import X.7zR;
import com.facebook.messaging.rollcall.presentation.viewer.model.ContributionReactionsViewState;
import com.facebook.messaging.sharedimage.SharedMedia;
import com.facebook.ui.media.attachments.model.MediaResource;

/* loaded from: SharedMediaWithReactions.class */
public final class SharedMediaWithReactions extends SharedMedia {
    public long A00;
    public ContributionReactionsViewState A01;
    public String A02;
    public String A03;
    public final String A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedMediaWithReactions(ContributionReactionsViewState contributionReactionsViewState, MediaResource mediaResource, String str, String str2, String str3, String str4, String str5, long j) {
        super(mediaResource, str, str2, "");
        7zR.A1O(str, str2);
        11T.A0F(str3, 6);
        this.A02 = str3;
        this.A00 = j;
        this.A01 = contributionReactionsViewState;
        this.A03 = str4;
        this.A04 = str5;
    }

    public String toString() {
        return 0Pz.A0W("SharedMediaWithReactions.", this.A02);
    }
}
