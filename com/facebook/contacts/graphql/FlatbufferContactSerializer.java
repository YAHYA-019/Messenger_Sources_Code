package com.facebook.contacts.graphql;

import X.28Q;
import X.4iJ;
import X.AbstractC11224vw;
import X.C26c;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: FlatbufferContactSerializer.class */
public class FlatbufferContactSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), FlatbufferContact.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        FlatbufferContact flatbufferContact = (FlatbufferContact) obj;
        if (flatbufferContact == null) {
            r302.A0Z();
        }
        r302.A0b();
        AbstractC11224vw.A0D(r302, "contactId", flatbufferContact.mContactId);
        AbstractC11224vw.A0D(r302, "profileFbid", flatbufferContact.mProfileFbid);
        AbstractC11224vw.A0D(r302, "graphApiWriteId", flatbufferContact.mGraphApiWriteId);
        AbstractC11224vw.A05(r302, c26c, flatbufferContact.mName, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        AbstractC11224vw.A05(r302, c26c, flatbufferContact.mPhoneticName, "phoneticName");
        AbstractC11224vw.A0D(r302, "smallPictureUrl", flatbufferContact.mSmallPictureUrl);
        AbstractC11224vw.A0D(r302, "bigPictureUrl", flatbufferContact.mBigPictureUrl);
        AbstractC11224vw.A0D(r302, "hugePictureUrl", flatbufferContact.mHugePictureUrl);
        int i = flatbufferContact.mSmallPictureSize;
        r302.A0o("smallPictureSize");
        r302.A0f(i);
        int i2 = flatbufferContact.mBigPictureSize;
        r302.A0o("bigPictureSize");
        r302.A0f(i2);
        int i3 = flatbufferContact.mHugePictureSize;
        r302.A0o("hugePictureSize");
        r302.A0f(i3);
        float f = flatbufferContact.mCommunicationRank;
        r302.A0o("communicationRank");
        r302.A0e(f);
        float f2 = flatbufferContact.mWithTaggingRank;
        r302.A0o("withTaggingRank");
        r302.A0e(f2);
        AbstractC11224vw.A06(r302, c26c, "phones", flatbufferContact.mPhones);
        AbstractC11224vw.A06(r302, c26c, "nameSearchTokens", flatbufferContact.mNameSearchTokens);
        boolean z = flatbufferContact.mIsMessageBlockedByViewer;
        r302.A0o("isMessageBlockedByViewer");
        r302.A0v(z);
        boolean z2 = flatbufferContact.mCanMessage;
        r302.A0o("canMessage");
        r302.A0v(z2);
        AbstractC11224vw.A05(r302, c26c, flatbufferContact.mIsMobilePushable, "isMobilePushable");
        boolean z3 = flatbufferContact.mIsMessengerUser;
        r302.A0o("isMessengerUser");
        r302.A0v(z3);
        long j = flatbufferContact.mMessengerInstallTimeInMS;
        r302.A0o("messengerInstallTime");
        r302.A0g(j);
        boolean z4 = flatbufferContact.mIsMemorialized;
        r302.A0o("isMemorialized");
        r302.A0v(z4);
        boolean z5 = flatbufferContact.mIsBroadcastRecipientHoldout;
        r302.A0o("isBroadcastRecipientHoldout");
        r302.A0v(z5);
        AbstractC11224vw.A05(r302, c26c, flatbufferContact.mContactRelationshipStatus, "contactRelationshipStatus");
        long j2 = flatbufferContact.mAddedTimeInMS;
        r302.A0o("addedTime");
        r302.A0g(j2);
        AbstractC11224vw.A05(r302, c26c, flatbufferContact.mFriendshipStatus, "friendshipStatus");
        int i4 = flatbufferContact.mMutualFriendsCount;
        r302.A0o("mutualFriendsCount");
        r302.A0f(i4);
        AbstractC11224vw.A05(r302, c26c, flatbufferContact.mContactProfileType, "contactType");
        int i5 = flatbufferContact.mBirthdayDay;
        r302.A0o("birthdayDay");
        r302.A0f(i5);
        int i6 = flatbufferContact.mBirthdayMonth;
        r302.A0o("birthdayMonth");
        r302.A0f(i6);
        AbstractC11224vw.A0D(r302, "cityName", flatbufferContact.mCityName);
        boolean z6 = flatbufferContact.mIsPartial;
        r302.A0o("isPartial");
        r302.A0v(z6);
        long j3 = flatbufferContact.mLastFetchTime;
        r302.A0o("lastFetchTime");
        r302.A0g(j3);
        long j4 = flatbufferContact.mMontageThreadFBID;
        r302.A0o("montageThreadFBID");
        r302.A0g(j4);
        float f3 = flatbufferContact.mPhatRank;
        r302.A0o("phatRank");
        r302.A0e(f3);
        AbstractC11224vw.A0D(r302, "username", flatbufferContact.mUsername);
        float f4 = flatbufferContact.mMessengerInvitePriority;
        r302.A0o("messengerInvitePriority");
        r302.A0e(f4);
        boolean z7 = flatbufferContact.mCanViewerSendMoney;
        r302.A0o("canViewerSendMoney");
        r302.A0v(z7);
        AbstractC11224vw.A05(r302, c26c, flatbufferContact.mViewerIGFollowStatus, "viewerIGFollowStatus");
        boolean z8 = flatbufferContact.mIsIgCreatorAccount;
        r302.A0o("isIgCreatorAccount");
        r302.A0v(z8);
        boolean z9 = flatbufferContact.mIsIgBusinessAccount;
        r302.A0o("isIgBusinessAccount");
        r302.A0v(z9);
        AbstractC11224vw.A05(r302, c26c, flatbufferContact.mUnifiedStoriesConnectionType, "unifiedStoriesConnectionType");
        AbstractC11224vw.A05(r302, c26c, flatbufferContact.mAddSource, "contactCreationSource");
        boolean z10 = flatbufferContact.mIsAlohaProxyConfirmed;
        r302.A0o("isAlohaProxyConfirmed");
        r302.A0v(z10);
        AbstractC11224vw.A06(r302, c26c, "alohaProxyUserOwners", flatbufferContact.mAlohaProxyUserOwners);
        AbstractC11224vw.A06(r302, c26c, "alohaProxyUsersOwned", flatbufferContact.mAlohaProxyUsersOwned);
        boolean z11 = flatbufferContact.mIsMessageIgnoredByViewer;
        r302.A0o("isMessageIgnoredByViewer");
        r302.A0v(z11);
        AbstractC11224vw.A05(r302, c26c, flatbufferContact.mAccountClaimStatus, "accountClaimStatus");
        AbstractC11224vw.A0D(r302, "favoriteColor", flatbufferContact.mFavoriteColor);
        AbstractC11224vw.A05(r302, c26c, flatbufferContact.mWorkUserInfo, "workUserInfo");
        boolean z12 = flatbufferContact.mIsViewerManagingParent;
        r302.A0o("isViewerManagingParent");
        r302.A0v(z12);
        boolean z13 = flatbufferContact.mIsManagingParentApprovedUser;
        r302.A0o("isManagingParentApprovedUser");
        r302.A0v(z13);
        boolean z14 = flatbufferContact.mIsFavoriteMessengerContact;
        r302.A0o("isFavoriteMessengerContact");
        r302.A0v(z14);
        boolean z15 = flatbufferContact.mIsInteropEligible;
        r302.A0o("isInteropEligible");
        r302.A0v(z15);
        AbstractC11224vw.A05(r302, c26c, flatbufferContact.mReachabilityStatusType, "reachability_status_type");
        AbstractC11224vw.A05(r302, c26c, flatbufferContact.mRestrictionType, "restriction_type");
        float f5 = flatbufferContact.mMentionsMessengerSharingScore;
        r302.A0o("mentionsMessengerSharingScore");
        r302.A0e(f5);
        r302.A0Y();
    }
}
