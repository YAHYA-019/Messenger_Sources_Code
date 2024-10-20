package com.facebook.contacts.graphql;

import X.1BL;
import X.AnonymousClass001;
import X.BKq;
import X.C1r4;
import X.C41w;
import X.C53v;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.util.TriState;
import com.facebook.graphql.enums.GraphQLAccountClaimStatus;
import com.facebook.graphql.enums.GraphQLContactRelationshipStatus;
import com.facebook.graphql.enums.GraphQLFriendshipStatus;
import com.facebook.graphql.enums.GraphQLMessengerContactCreationSource;
import com.facebook.graphql.enums.GraphQLMessengerContactRestrictionType;
import com.facebook.graphql.enums.GraphQLReachabilityStatusTypeEnum;
import com.facebook.graphql.enums.GraphQLUnifiedStoriesParticipantConnectionType;
import com.facebook.user.model.Name;
import com.facebook.user.model.WorkUserInfo;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;

/* loaded from: FlatbufferContact.class */
public class FlatbufferContact implements Parcelable, C41w {
    public final String mContactId = null;
    public final String mProfileFbid = null;
    public final String mGraphApiWriteId = null;
    public final Name mName = null;
    public final Name mPhoneticName = null;
    public final String mSmallPictureUrl = null;
    public final String mBigPictureUrl = null;
    public final String mHugePictureUrl = null;
    public final int mSmallPictureSize = -1;
    public final int mBigPictureSize = -1;
    public final int mHugePictureSize = -1;
    public final float mCommunicationRank = 0.0f;
    public final float mWithTaggingRank = 0.0f;
    public final ImmutableList mPhones = null;
    public final boolean mIsMessageBlockedByViewer = false;
    public final boolean mCanMessage = false;
    public final TriState mIsMobilePushable = null;
    public final boolean mIsMessengerUser = false;
    public final long mMessengerInstallTimeInMS = 0;
    public final boolean mIsMemorialized = false;
    public final boolean mIsBroadcastRecipientHoldout = false;
    public final GraphQLContactRelationshipStatus mContactRelationshipStatus = GraphQLContactRelationshipStatus.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
    public final GraphQLFriendshipStatus mFriendshipStatus = null;
    public final int mMutualFriendsCount = 0;
    public final C1r4 mContactProfileType = C1r4.A0G;
    public final ImmutableList mNameSearchTokens = null;
    public final long mAddedTimeInMS = 0;
    public final int mBirthdayMonth = 0;
    public final int mBirthdayDay = 0;
    public final String mCityName = null;
    public final boolean mIsPartial = false;
    public final long mLastFetchTime = 0;
    public final long mMontageThreadFBID = 0;
    public final float mPhatRank = 0.0f;
    public final String mUsername = null;
    public final float mMessengerInvitePriority = 0.0f;
    public final boolean mCanViewerSendMoney = false;
    public final BKq mViewerIGFollowStatus = BKq.A02;
    public final boolean mIsIgCreatorAccount = false;
    public final boolean mIsIgBusinessAccount = false;
    public final GraphQLMessengerContactCreationSource mAddSource = GraphQLMessengerContactCreationSource.A01;
    public final boolean mIsAlohaProxyConfirmed = false;
    public final ImmutableList mAlohaProxyUserOwners = ImmutableList.of();
    public final ImmutableList mAlohaProxyUsersOwned = ImmutableList.of();
    public final boolean mIsMessageIgnoredByViewer = false;
    public final GraphQLAccountClaimStatus mAccountClaimStatus = GraphQLAccountClaimStatus.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
    public final String mFavoriteColor = null;
    public final WorkUserInfo mWorkUserInfo = null;
    public final boolean mIsViewerManagingParent = false;
    public final GraphQLUnifiedStoriesParticipantConnectionType mUnifiedStoriesConnectionType = GraphQLUnifiedStoriesParticipantConnectionType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
    public final boolean mIsManagingParentApprovedUser = false;
    public final boolean mIsFavoriteMessengerContact = false;
    public final boolean mIsInteropEligible = false;
    public final GraphQLReachabilityStatusTypeEnum mReachabilityStatusType = GraphQLReachabilityStatusTypeEnum.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
    public final GraphQLMessengerContactRestrictionType mRestrictionType = GraphQLMessengerContactRestrictionType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
    public final float mMentionsMessengerSharingScore = 0.0f;

    @Override // X.C41w
    public /* bridge */ /* synthetic */ Object CY7() {
        this.mName.getClass();
        if (this.mCanMessage) {
            Preconditions.checkNotNull(this.mProfileFbid, "if contact.canMessage, fbid cannot be null");
        }
        if (this.mProfileFbid == null) {
            Preconditions.checkArgument(AnonymousClass001.A1W(this.mContactProfileType, C1r4.A0G), "If contact has not fbid its profile type must be UNMATCHED");
        }
        return this;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(this.mName);
        A0k.append(" (phonetic name: ");
        A0k.append(this.mPhoneticName);
        A0k.append(") <contactId:");
        A0k.append(this.mContactId);
        A0k.append("> <profileFbid:");
        A0k.append(this.mProfileFbid);
        A0k.append("> <commRank:");
        A0k.append(this.mCommunicationRank);
        A0k.append("> <canMessage:");
        A0k.append(this.mCanMessage);
        A0k.append("> <isMemorialized:");
        A0k.append(this.mIsMemorialized);
        A0k.append("><contactType:");
        A0k.append(this.mContactProfileType);
        return AnonymousClass001.A0d(">", A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mContactId);
        parcel.writeString(this.mProfileFbid);
        parcel.writeString(this.mGraphApiWriteId);
        parcel.writeParcelable(this.mName, i);
        parcel.writeParcelable(this.mPhoneticName, i);
        parcel.writeString(this.mSmallPictureUrl);
        parcel.writeString(this.mBigPictureUrl);
        parcel.writeString(this.mHugePictureUrl);
        parcel.writeInt(this.mSmallPictureSize);
        parcel.writeInt(this.mBigPictureSize);
        parcel.writeInt(this.mHugePictureSize);
        parcel.writeFloat(this.mCommunicationRank);
        parcel.writeFloat(this.mWithTaggingRank);
        parcel.writeList(this.mPhones);
        parcel.writeInt(this.mIsMessageBlockedByViewer ? 1 : 0);
        parcel.writeInt(this.mCanMessage ? 1 : 0);
        parcel.writeString(this.mIsMobilePushable.toString());
        parcel.writeInt(this.mIsMessengerUser ? 1 : 0);
        parcel.writeLong(this.mMessengerInstallTimeInMS);
        parcel.writeInt(this.mIsMemorialized ? 1 : 0);
        parcel.writeInt(this.mIsBroadcastRecipientHoldout ? 1 : 0);
        1BL.A12(parcel, this.mContactRelationshipStatus);
        parcel.writeSerializable(this.mFriendshipStatus);
        parcel.writeInt(this.mMutualFriendsCount);
        parcel.writeString(this.mContactProfileType.toString());
        parcel.writeList(this.mNameSearchTokens);
        parcel.writeLong(this.mAddedTimeInMS);
        parcel.writeInt(this.mBirthdayMonth);
        parcel.writeInt(this.mBirthdayDay);
        parcel.writeString(this.mCityName);
        parcel.writeInt(this.mIsPartial ? 1 : 0);
        parcel.writeLong(this.mLastFetchTime);
        parcel.writeLong(this.mMontageThreadFBID);
        parcel.writeFloat(this.mPhatRank);
        parcel.writeString(this.mUsername);
        parcel.writeFloat(this.mMessengerInvitePriority);
        parcel.writeInt(this.mCanViewerSendMoney ? 1 : 0);
        1BL.A12(parcel, this.mViewerIGFollowStatus);
        parcel.writeInt(this.mIsIgCreatorAccount ? 1 : 0);
        parcel.writeInt(this.mIsIgBusinessAccount ? 1 : 0);
        1BL.A12(parcel, this.mAddSource);
        parcel.writeInt(this.mIsAlohaProxyConfirmed ? 1 : 0);
        parcel.writeList(this.mAlohaProxyUserOwners);
        parcel.writeList(this.mAlohaProxyUsersOwned);
        parcel.writeInt(this.mIsMessageIgnoredByViewer ? 1 : 0);
        C53v.A0J(parcel, this.mAccountClaimStatus);
        parcel.writeString(this.mFavoriteColor);
        parcel.writeParcelable(this.mWorkUserInfo, i);
        parcel.writeInt(this.mIsViewerManagingParent ? 1 : 0);
        GraphQLUnifiedStoriesParticipantConnectionType graphQLUnifiedStoriesParticipantConnectionType = this.mUnifiedStoriesConnectionType;
        if (graphQLUnifiedStoriesParticipantConnectionType == null) {
            graphQLUnifiedStoriesParticipantConnectionType = GraphQLUnifiedStoriesParticipantConnectionType.UNKNOWN;
        }
        1BL.A12(parcel, graphQLUnifiedStoriesParticipantConnectionType);
        parcel.writeInt(this.mIsManagingParentApprovedUser ? 1 : 0);
        parcel.writeInt(this.mIsFavoriteMessengerContact ? 1 : 0);
        parcel.writeInt(this.mIsInteropEligible ? 1 : 0);
        1BL.A12(parcel, this.mReachabilityStatusType);
        1BL.A12(parcel, this.mRestrictionType);
        parcel.writeFloat(this.mMentionsMessengerSharingScore);
    }
}
