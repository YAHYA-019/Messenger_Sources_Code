package com.facebook.ipc.composer.model;

import X.11T;
import X.FJ8;
import X.FKa;
import X.MT2;
import X.MT3;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.model.GraphQLStoryAttachment;
import java.util.Arrays;

/* loaded from: ComposerShareParams.class */
public final class ComposerShareParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(65);
    public final String accessibilityLabel;
    public final GraphQLStoryAttachment attachmentPreview;
    public final ComposerBackgroundGradientColor backgroundGradientColor;
    public final MT2 confirmationDialogConfig;
    public final String gifId;
    public final String gifSource;
    public final String internalLinkableId;
    public final boolean isGifPickerShare;
    public final boolean isReshare;
    public final boolean isTicketingShare;
    public final String linkForShare;
    public final MT3 nativeTemplatePreview;
    public final String quoteText;
    public final ComposerReshareContext reshareContext;
    public final String shareScrapeData;
    public final String shareTracking;
    public final ComposerShareableData shareable;
    public final String sharedFromPostId;
    public final String sharedStoryTitle;

    public ComposerShareParams() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false);
    }

    public ComposerShareParams(GraphQLStoryAttachment graphQLStoryAttachment, ComposerBackgroundGradientColor composerBackgroundGradientColor, ComposerReshareContext composerReshareContext, ComposerShareableData composerShareableData, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, boolean z2, boolean z3) {
        this.attachmentPreview = graphQLStoryAttachment;
        this.shareable = composerShareableData;
        this.linkForShare = str;
        this.accessibilityLabel = str2;
        this.shareTracking = str3;
        this.quoteText = str4;
        this.reshareContext = composerReshareContext;
        this.isReshare = z;
        this.isTicketingShare = z2;
        this.isGifPickerShare = z3;
        this.gifSource = str5;
        this.gifId = str6;
        this.internalLinkableId = str7;
        this.shareScrapeData = str8;
        this.confirmationDialogConfig = null;
        this.sharedFromPostId = str9;
        this.sharedStoryTitle = str10;
        this.backgroundGradientColor = composerBackgroundGradientColor;
        this.nativeTemplatePreview = null;
        if (str != null) {
            if (composerShareableData != null) {
                throw new IllegalArgumentException("A story can have only one type of attachment: Can't share both a link and a shareable entity");
            }
        } else if (z3) {
            throw new IllegalArgumentException("A story with a gif from gif picker can't have an empty link");
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerShareParams)) {
                return false;
            }
            ComposerShareParams composerShareParams = (ComposerShareParams) obj;
            if (!11T.A0O(this.shareable, composerShareParams.shareable) || !11T.A0O(this.linkForShare, composerShareParams.linkForShare) || !11T.A0O(this.accessibilityLabel, composerShareParams.accessibilityLabel) || !11T.A0O(this.shareTracking, composerShareParams.shareTracking) || !11T.A0O(this.quoteText, composerShareParams.quoteText) || !11T.A0O(this.reshareContext, composerShareParams.reshareContext) || this.isReshare != composerShareParams.isReshare || this.isTicketingShare != composerShareParams.isTicketingShare || this.isGifPickerShare != composerShareParams.isGifPickerShare || !11T.A0O(this.gifSource, composerShareParams.gifSource) || !11T.A0O(this.gifId, composerShareParams.gifId) || !11T.A0O(this.internalLinkableId, composerShareParams.internalLinkableId) || !11T.A0O(this.shareScrapeData, composerShareParams.shareScrapeData) || !11T.A0O(this.sharedFromPostId, composerShareParams.sharedFromPostId) || !11T.A0O(this.sharedStoryTitle, composerShareParams.sharedStoryTitle) || !11T.A0O(this.backgroundGradientColor, composerShareParams.backgroundGradientColor)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.attachmentPreview, this.shareable, this.linkForShare, this.accessibilityLabel, this.shareTracking, this.quoteText, this.reshareContext, Boolean.valueOf(this.isReshare), Boolean.valueOf(this.isTicketingShare), Boolean.valueOf(this.isGifPickerShare), this.gifSource, this.gifId, this.internalLinkableId, this.shareScrapeData, null, this.sharedFromPostId, this.sharedStoryTitle, this.backgroundGradientColor, null});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        FJ8.A0A(parcel, this.attachmentPreview);
        parcel.writeParcelable(this.shareable, i);
        parcel.writeString(this.linkForShare);
        parcel.writeString(this.accessibilityLabel);
        parcel.writeString(this.gifId);
        parcel.writeString(this.gifSource);
        parcel.writeString(this.shareTracking);
        parcel.writeString(this.quoteText);
        parcel.writeParcelable(this.reshareContext, i);
        parcel.writeInt(this.isReshare ? 1 : 0);
        parcel.writeInt(this.isTicketingShare ? 1 : 0);
        parcel.writeInt(this.isGifPickerShare ? 1 : 0);
        parcel.writeString(this.internalLinkableId);
        parcel.writeString(this.shareScrapeData);
        parcel.writeInt(-1);
        parcel.writeString(this.sharedFromPostId);
        parcel.writeString(this.sharedStoryTitle);
        parcel.writeParcelable(this.backgroundGradientColor, i);
        parcel.writeInt(-1);
    }
}
