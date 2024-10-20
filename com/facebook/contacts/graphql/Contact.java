package com.facebook.contacts.graphql;

import X.1BL;
import X.1Ks;
import X.1uP;
import X.AbN;
import X.AnonymousClass001;
import X.BKq;
import X.C1r4;
import X.C41w;
import X.C53v;
import X.CFq;
import X.FJ8;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.util.TriState;
import com.facebook.graphql.enums.EnumHelper;
import com.facebook.graphql.enums.GraphQLAccountClaimStatus;
import com.facebook.graphql.enums.GraphQLContactRelationshipStatus;
import com.facebook.graphql.enums.GraphQLFriendshipStatus;
import com.facebook.graphql.enums.GraphQLReachabilityStatusTypeEnum;
import com.facebook.graphql.enums.GraphQLUnifiedStoriesParticipantConnectionType;
import com.facebook.user.model.AlohaProxyUser;
import com.facebook.user.model.AlohaUser;
import com.facebook.user.model.Name;
import com.facebook.user.model.NeoUserStatusSetting;
import com.facebook.user.model.WorkUserInfo;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import java.util.Collection;

/* loaded from: Contact.class */
public class Contact implements Parcelable, C41w {
    public static final Parcelable.Creator CREATOR = new FKX(22);
    public final GraphQLAccountClaimStatus mAccountClaimStatus;
    public final long mAddedTimeInMS;
    public final ImmutableList mAlohaProxyUserOwners;
    public final ImmutableList mAlohaProxyUsersOwned;
    public final String mAvatarAnimationContactOnlineUrl;
    public final String mAvatarId;
    public final String mAvatarPreviewUri;
    public final int mBigPictureSize;
    public final String mBigPictureUrl;
    public final int mBirthdayDay;
    public final int mBirthdayMonth;
    public final boolean mCanMessage;
    public final boolean mCanViewerSendMoney;
    public final String mCityName;
    public final float mCommunicationRank;
    public final String mContactId;
    public final C1r4 mContactProfileType;
    public final GraphQLContactRelationshipStatus mContactRelationshipStatus;
    public final String mFavoriteColor;
    public final GraphQLFriendshipStatus mFriendshipStatus;
    public final String mGraphApiWriteId;
    public final int mHugePictureSize;
    public final String mHugePictureUrl;
    public final boolean mIsAlohaProxyConfirmed;
    public final boolean mIsAvatarPublicAndUsableByViewer;
    public final boolean mIsBroadcastRecipientHoldout;
    public final boolean mIsFavoriteMessengerContact;
    public final boolean mIsGroupXacCallingEligible;
    public final boolean mIsIgBusinessAccount;
    public final boolean mIsIgCreatorAccount;
    public final boolean mIsInteropEligible;
    public final boolean mIsManagingParentApprovedUser;
    public final boolean mIsMemorialized;
    public final boolean mIsMessageBlockedByViewer;
    public final boolean mIsMessageIgnoredByViewer;
    public final boolean mIsMessengerUser;
    public final TriState mIsMobilePushable;
    public final boolean mIsPartial;
    public final boolean mIsPseudoBlockedByViewer;
    public final boolean mIsViewerManagingParent;
    public final long mLastFetchTime;
    public final float mMentionsMessengerSharingScore;
    public final int mMessageCapabilities;
    public final long mMessageCapabilities2;
    public final long mMessengerInstallTimeInMS;
    public final float mMessengerInvitePriority;
    public final long mMontageThreadFBID;
    public final int mMutualFriendsCount;
    public final Name mName;
    public final ImmutableList mNameEntries;
    public final ImmutableList mNameSearchTokens;
    public final NeoUserStatusSetting mNeoUserStatusSetting;
    public final String mNicknameForViewer;
    public final float mPhatRank;
    public final ImmutableList mPhones;
    public final Name mPhoneticName;
    public final String mProfileFbid;
    public final GraphQLReachabilityStatusTypeEnum mReachabilityStatusType;
    public final 1Ks mRestrictionType;
    public final int mSmallPictureSize;
    public final String mSmallPictureUrl;
    public final GraphQLUnifiedStoriesParticipantConnectionType mUnifiedStoriesConnectionType;
    public final String mUsername;
    public final BKq mViewerIGFollowStatus;
    public final float mWithTaggingRank;
    public final WorkUserInfo mWorkUserInfo;

    public Contact() {
        this.mContactId = null;
        this.mProfileFbid = null;
        this.mGraphApiWriteId = null;
        this.mName = null;
        this.mPhoneticName = null;
        this.mSmallPictureUrl = null;
        this.mBigPictureUrl = null;
        this.mHugePictureUrl = null;
        this.mSmallPictureSize = -1;
        this.mBigPictureSize = -1;
        this.mHugePictureSize = -1;
        this.mCommunicationRank = 0.0f;
        this.mWithTaggingRank = 0.0f;
        this.mPhones = null;
        this.mIsMessageBlockedByViewer = false;
        this.mCanMessage = false;
        this.mIsMobilePushable = null;
        this.mIsMessengerUser = false;
        this.mMessengerInstallTimeInMS = 0L;
        this.mIsMemorialized = false;
        this.mIsBroadcastRecipientHoldout = false;
        this.mContactRelationshipStatus = GraphQLContactRelationshipStatus.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
        this.mFriendshipStatus = null;
        this.mMutualFriendsCount = 0;
        this.mContactProfileType = C1r4.A0G;
        this.mNameEntries = null;
        this.mNameSearchTokens = null;
        this.mAddedTimeInMS = 0L;
        this.mBirthdayMonth = 0;
        this.mBirthdayDay = 0;
        this.mCityName = null;
        this.mIsPartial = false;
        this.mLastFetchTime = 0L;
        this.mMontageThreadFBID = 0L;
        this.mPhatRank = 0.0f;
        this.mUsername = null;
        this.mMessengerInvitePriority = 0.0f;
        this.mCanViewerSendMoney = false;
        this.mViewerIGFollowStatus = BKq.A02;
        this.mIsAlohaProxyConfirmed = false;
        this.mAlohaProxyUserOwners = ImmutableList.of();
        this.mAlohaProxyUsersOwned = ImmutableList.of();
        this.mIsMessageIgnoredByViewer = false;
        this.mAccountClaimStatus = GraphQLAccountClaimStatus.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
        this.mFavoriteColor = null;
        this.mWorkUserInfo = null;
        this.mIsIgCreatorAccount = false;
        this.mIsIgBusinessAccount = false;
        this.mIsViewerManagingParent = false;
        this.mUnifiedStoriesConnectionType = GraphQLUnifiedStoriesParticipantConnectionType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
        this.mIsManagingParentApprovedUser = false;
        this.mAvatarId = null;
        this.mIsAvatarPublicAndUsableByViewer = false;
        this.mAvatarPreviewUri = null;
        this.mIsFavoriteMessengerContact = false;
        this.mNicknameForViewer = null;
        this.mNeoUserStatusSetting = null;
        this.mIsPseudoBlockedByViewer = false;
        this.mIsInteropEligible = false;
        this.mReachabilityStatusType = GraphQLReachabilityStatusTypeEnum.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
        this.mRestrictionType = 1Ks.A05;
        this.mMessageCapabilities = 0;
        this.mMessageCapabilities2 = 0L;
        this.mIsGroupXacCallingEligible = false;
        this.mMentionsMessengerSharingScore = 0.0f;
        this.mAvatarAnimationContactOnlineUrl = null;
    }

    public Contact(CFq cFq) {
        this.mContactId = cFq.A0a;
        this.mProfileFbid = cFq.A0n;
        this.mGraphApiWriteId = cFq.A0d;
        Name name = cFq.A0P;
        this.mName = name == null ? new Name(cFq.A0c, cFq.A0f, cFq.A0b) : name;
        this.mPhoneticName = cFq.A0Q;
        this.mSmallPictureUrl = cFq.A0o;
        this.mBigPictureUrl = cFq.A0Z;
        this.mHugePictureUrl = cFq.A0e;
        this.mSmallPictureSize = cFq.A0B;
        this.mBigPictureSize = cFq.A05;
        this.mHugePictureSize = cFq.A06;
        this.mCommunicationRank = cFq.A00;
        this.mWithTaggingRank = cFq.A04;
        this.mPhones = cFq.A0Y;
        this.mIsMessageBlockedByViewer = cFq.A0r;
        this.mCanMessage = cFq.A0p;
        this.mIsMobilePushable = cFq.A0H;
        this.mIsMessengerUser = cFq.A0t;
        this.mMessengerInstallTimeInMS = cFq.A0G;
        this.mIsMemorialized = cFq.A0q;
        this.mIsBroadcastRecipientHoldout = cFq.A0y;
        this.mContactRelationshipStatus = cFq.A0L;
        this.mFriendshipStatus = cFq.A0M;
        this.mMutualFriendsCount = cFq.A0A;
        C1r4 c1r4 = cFq.A0J;
        this.mContactProfileType = c1r4 == null ? C1r4.A0G : c1r4;
        this.mNameEntries = cFq.A0W;
        this.mNameSearchTokens = cFq.A0X;
        this.mAddedTimeInMS = cFq.A0C;
        this.mBirthdayDay = cFq.A07;
        this.mBirthdayMonth = cFq.A08;
        this.mCityName = cFq.A0j;
        this.mIsPartial = cFq.A15;
        this.mLastFetchTime = cFq.A0D;
        this.mMontageThreadFBID = cFq.A0F;
        this.mPhatRank = cFq.A03;
        this.mUsername = cFq.A0m;
        this.mMessengerInvitePriority = cFq.A02;
        this.mCanViewerSendMoney = cFq.A0v;
        this.mViewerIGFollowStatus = cFq.A0I;
        this.mIsAlohaProxyConfirmed = cFq.A0w;
        this.mAlohaProxyUserOwners = cFq.A0U;
        this.mAlohaProxyUsersOwned = cFq.A0V;
        this.mIsMessageIgnoredByViewer = cFq.A0s;
        this.mAccountClaimStatus = cFq.A0K;
        this.mFavoriteColor = cFq.A0k;
        this.mWorkUserInfo = cFq.A0S;
        this.mIsIgCreatorAccount = cFq.A12;
        this.mIsIgBusinessAccount = cFq.A11;
        this.mIsViewerManagingParent = cFq.A16;
        this.mUnifiedStoriesConnectionType = cFq.A0O;
        this.mIsManagingParentApprovedUser = cFq.A14;
        this.mAvatarId = cFq.A0h;
        this.mIsAvatarPublicAndUsableByViewer = cFq.A0x;
        this.mAvatarPreviewUri = cFq.A0i;
        this.mIsFavoriteMessengerContact = cFq.A0z;
        this.mNicknameForViewer = cFq.A0l;
        this.mNeoUserStatusSetting = cFq.A0R;
        this.mIsPseudoBlockedByViewer = cFq.A0u;
        this.mIsInteropEligible = cFq.A13;
        this.mReachabilityStatusType = cFq.A0N;
        this.mRestrictionType = cFq.A0T;
        this.mMessageCapabilities = cFq.A09;
        this.mMessageCapabilities2 = cFq.A0E;
        this.mIsGroupXacCallingEligible = cFq.A10;
        this.mMentionsMessengerSharingScore = cFq.A01;
        this.mAvatarAnimationContactOnlineUrl = cFq.A0g;
        A00();
    }

    public Contact(Parcel parcel) {
        BKq bKq;
        this.mContactId = parcel.readString();
        this.mProfileFbid = parcel.readString();
        this.mGraphApiWriteId = parcel.readString();
        this.mName = (Name) 1BL.A0C(parcel, Name.class);
        this.mPhoneticName = (Name) 1BL.A0C(parcel, Name.class);
        this.mSmallPictureUrl = parcel.readString();
        this.mBigPictureUrl = parcel.readString();
        this.mHugePictureUrl = parcel.readString();
        this.mSmallPictureSize = parcel.readInt();
        this.mBigPictureSize = parcel.readInt();
        this.mHugePictureSize = parcel.readInt();
        this.mCommunicationRank = parcel.readFloat();
        this.mWithTaggingRank = parcel.readFloat();
        this.mPhones = AbN.A0e(parcel, ContactPhone.class);
        this.mIsMessageBlockedByViewer = C53v.A0S(parcel);
        this.mCanMessage = C53v.A0S(parcel);
        this.mIsMobilePushable = (TriState) Enum.valueOf(TriState.class, parcel.readString());
        this.mIsMessengerUser = C53v.A0S(parcel);
        this.mMessengerInstallTimeInMS = parcel.readLong();
        this.mIsMemorialized = C53v.A0S(parcel);
        this.mIsBroadcastRecipientHoldout = C53v.A0S(parcel);
        this.mContactRelationshipStatus = (GraphQLContactRelationshipStatus) EnumHelper.A00(GraphQLContactRelationshipStatus.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, parcel.readString());
        this.mFriendshipStatus = (GraphQLFriendshipStatus) parcel.readSerializable();
        this.mMutualFriendsCount = parcel.readInt();
        this.mContactProfileType = (C1r4) Enum.valueOf(C1r4.class, parcel.readString());
        this.mNameEntries = ImmutableList.copyOf((Collection) FJ8.A06(parcel));
        this.mNameSearchTokens = AbN.A0e(parcel, String.class);
        this.mAddedTimeInMS = parcel.readLong();
        this.mBirthdayMonth = parcel.readInt();
        this.mBirthdayDay = parcel.readInt();
        this.mCityName = parcel.readString();
        this.mIsPartial = C53v.A0S(parcel);
        this.mLastFetchTime = parcel.readLong();
        this.mMontageThreadFBID = parcel.readLong();
        this.mPhatRank = parcel.readFloat();
        this.mUsername = parcel.readString();
        this.mMessengerInvitePriority = parcel.readFloat();
        this.mCanViewerSendMoney = C53v.A0S(parcel);
        String readString = parcel.readString();
        if (readString == null) {
            bKq = BKq.A02;
        } else {
            try {
                bKq = BKq.valueOf(readString);
            } catch (IllegalArgumentException unused) {
                bKq = BKq.A02;
            }
        }
        this.mViewerIGFollowStatus = bKq;
        this.mIsAlohaProxyConfirmed = C53v.A0S(parcel);
        this.mAlohaProxyUserOwners = AbN.A0e(parcel, AlohaUser.class);
        this.mAlohaProxyUsersOwned = AbN.A0e(parcel, AlohaProxyUser.class);
        this.mIsMessageIgnoredByViewer = C53v.A0S(parcel);
        this.mAccountClaimStatus = (GraphQLAccountClaimStatus) C53v.A07(parcel, GraphQLAccountClaimStatus.class);
        this.mFavoriteColor = parcel.readString();
        this.mWorkUserInfo = (WorkUserInfo) 1BL.A0C(parcel, WorkUserInfo.class);
        this.mIsIgCreatorAccount = C53v.A0S(parcel);
        this.mIsIgBusinessAccount = C53v.A0S(parcel);
        this.mIsViewerManagingParent = C53v.A0S(parcel);
        this.mUnifiedStoriesConnectionType = (GraphQLUnifiedStoriesParticipantConnectionType) EnumHelper.A00(GraphQLUnifiedStoriesParticipantConnectionType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, parcel.readString());
        this.mIsManagingParentApprovedUser = C53v.A0S(parcel);
        this.mAvatarId = parcel.readString();
        this.mIsAvatarPublicAndUsableByViewer = C53v.A0S(parcel);
        this.mAvatarPreviewUri = parcel.readString();
        this.mIsFavoriteMessengerContact = C53v.A0S(parcel);
        this.mNicknameForViewer = parcel.readString();
        this.mNeoUserStatusSetting = (NeoUserStatusSetting) 1BL.A0C(parcel, NeoUserStatusSetting.class);
        this.mIsPseudoBlockedByViewer = C53v.A0S(parcel);
        this.mIsInteropEligible = C53v.A0S(parcel);
        this.mReachabilityStatusType = (GraphQLReachabilityStatusTypeEnum) EnumHelper.A00(GraphQLReachabilityStatusTypeEnum.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, parcel.readString());
        this.mRestrictionType = 1uP.A00(C53v.A08(parcel));
        this.mMessageCapabilities = parcel.readInt();
        this.mMessageCapabilities2 = parcel.readLong();
        this.mIsGroupXacCallingEligible = C53v.A0S(parcel);
        this.mMentionsMessengerSharingScore = parcel.readFloat();
        this.mAvatarAnimationContactOnlineUrl = parcel.readString();
    }

    private void A00() {
        this.mName.getClass();
        if (this.mCanMessage) {
            Preconditions.checkNotNull(this.mProfileFbid, "if contact.canMessage, fbid cannot be null");
        }
        if (this.mProfileFbid == null) {
            Preconditions.checkArgument(AnonymousClass001.A1W(this.mContactProfileType, C1r4.A0G), "If contact has not fbid its profile type must be UNMATCHED");
        }
    }

    @Override // X.C41w
    public /* bridge */ /* synthetic */ Object CY7() {
        A00();
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
        FJ8.A0B(parcel, this.mNameEntries);
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
        parcel.writeInt(this.mIsAlohaProxyConfirmed ? 1 : 0);
        parcel.writeList(this.mAlohaProxyUserOwners);
        parcel.writeList(this.mAlohaProxyUsersOwned);
        parcel.writeInt(this.mIsMessageIgnoredByViewer ? 1 : 0);
        C53v.A0J(parcel, this.mAccountClaimStatus);
        parcel.writeString(this.mFavoriteColor);
        parcel.writeParcelable(this.mWorkUserInfo, i);
        parcel.writeInt(this.mIsIgCreatorAccount ? 1 : 0);
        parcel.writeInt(this.mIsIgBusinessAccount ? 1 : 0);
        parcel.writeInt(this.mIsViewerManagingParent ? 1 : 0);
        GraphQLUnifiedStoriesParticipantConnectionType graphQLUnifiedStoriesParticipantConnectionType = this.mUnifiedStoriesConnectionType;
        if (graphQLUnifiedStoriesParticipantConnectionType == null) {
            graphQLUnifiedStoriesParticipantConnectionType = GraphQLUnifiedStoriesParticipantConnectionType.UNKNOWN;
        }
        1BL.A12(parcel, graphQLUnifiedStoriesParticipantConnectionType);
        parcel.writeInt(this.mIsManagingParentApprovedUser ? 1 : 0);
        parcel.writeString(this.mAvatarId);
        parcel.writeInt(this.mIsAvatarPublicAndUsableByViewer ? 1 : 0);
        parcel.writeString(this.mAvatarPreviewUri);
        parcel.writeInt(this.mIsFavoriteMessengerContact ? 1 : 0);
        parcel.writeString(this.mNicknameForViewer);
        parcel.writeParcelable(this.mNeoUserStatusSetting, i);
        parcel.writeInt(this.mIsPseudoBlockedByViewer ? 1 : 0);
        parcel.writeInt(this.mIsInteropEligible ? 1 : 0);
        1BL.A12(parcel, this.mReachabilityStatusType);
        C53v.A0K(parcel, this.mRestrictionType.dbValue);
        parcel.writeInt(this.mMessageCapabilities);
        parcel.writeLong(this.mMessageCapabilities2);
        parcel.writeInt(this.mIsGroupXacCallingEligible ? 1 : 0);
        parcel.writeFloat(this.mMentionsMessengerSharingScore);
        parcel.writeString(this.mAvatarAnimationContactOnlineUrl);
    }
}
