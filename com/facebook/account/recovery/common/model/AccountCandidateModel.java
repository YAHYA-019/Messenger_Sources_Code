package com.facebook.account.recovery.common.model;

import X.1BL;
import X.1BM;
import X.AbJ;
import X.AnonymousClass001;
import X.C53v;
import X.DKF;
import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: AccountCandidateModel.class */
public class AccountCandidateModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGo.A00(60);
    public boolean A00;
    public final List A01;
    public final List A02;
    public final List A03;
    public final List A04;
    public final List A05;
    public final List A06;
    public final List A07;
    public String arCodeEntryLithoMigration;
    public String arSkipResetPasswordGroup;
    public String assistiveLoginGroup;
    public Boolean buttonShowIcon;
    public boolean canShowProfilePicAndName;
    public AccountCandidateContactPointList contactPoints;
    public String cplSmsRetrieverAutoSubmitTestGroup;
    public Boolean earIdUploadEligible;
    public Boolean earOldPasswordEligible;
    public Boolean emailAboveSmsGroup;
    public boolean enableAutoConf;
    public boolean enableMsgrSsoArBypassOtherAuthMethods;
    public boolean enableSSOLikeOauth;
    public String fdrNonce;
    public String firstName;
    public String flashCallGroup;
    public String id;
    public String initiateViewLithoMigration;
    public int inlineCplGroup;
    public Boolean isLowPriForCpl;
    public boolean isPasswordAsIdentifier;
    public String laraArDecision;
    public Boolean laraArEnableRandomRec;
    public Boolean laraArEnableStrongRec;
    public Boolean laraArUpdateInitiateViewUI;
    public Boolean laraArUpdateMsgrSsoUI;
    public int laraAuthMethod;
    public int loginInArGroup;
    public String msgrSsoGroup;
    public String name;
    public String networkName;
    public int nonceSendStatus;
    public int passwordResetNonceLength;
    public String profilePictureUri;
    public String recoveryAssistiveIdFlow;
    public int sharedPhoneNonceLength;
    public String sharedPhoneNumber;
    public Boolean shouldCallLaraEndpoint;
    public boolean shouldShowPNSeparateChoices;
    public boolean shouldSkipResetPasswordAfterArBypass;
    public boolean showDblCplInterstitial;
    public Boolean skipInitiateView;
    public int smartAuthGroup;
    public int smartAuthGroupNew;
    public String uidForOAuth;
    public Boolean whatsAppFirst;
    public String xsContentVariant;

    public AccountCandidateModel() {
        this.A04 = AnonymousClass001.A0s();
        this.A02 = AnonymousClass001.A0s();
        this.A06 = AnonymousClass001.A0s();
        this.A01 = AnonymousClass001.A0s();
        this.A05 = AnonymousClass001.A0s();
        this.A03 = AnonymousClass001.A0s();
        this.A07 = AnonymousClass001.A0s();
        this.id = null;
        this.name = null;
        this.networkName = null;
        this.profilePictureUri = null;
        this.contactPoints = null;
        this.skipInitiateView = false;
        this.fdrNonce = null;
        this.arSkipResetPasswordGroup = null;
        this.buttonShowIcon = false;
        this.whatsAppFirst = AnonymousClass001.A0K();
        this.isLowPriForCpl = false;
        this.A00 = false;
        this.firstName = null;
        this.loginInArGroup = 0;
        this.inlineCplGroup = 0;
        this.smartAuthGroup = 0;
        this.smartAuthGroupNew = 0;
        this.emailAboveSmsGroup = false;
        this.earIdUploadEligible = false;
        this.earOldPasswordEligible = false;
        this.passwordResetNonceLength = 6;
        this.sharedPhoneNonceLength = 6;
        this.cplSmsRetrieverAutoSubmitTestGroup = "";
        this.nonceSendStatus = 0;
        this.xsContentVariant = "";
        this.laraAuthMethod = 0;
        this.sharedPhoneNumber = null;
        this.msgrSsoGroup = "";
        this.showDblCplInterstitial = false;
        this.assistiveLoginGroup = "";
        this.flashCallGroup = "";
        this.enableSSOLikeOauth = false;
        this.isPasswordAsIdentifier = false;
        this.initiateViewLithoMigration = "";
        this.recoveryAssistiveIdFlow = "none";
        this.arCodeEntryLithoMigration = "";
        this.shouldCallLaraEndpoint = false;
        this.laraArUpdateMsgrSsoUI = false;
        this.laraArUpdateInitiateViewUI = false;
        this.laraArEnableRandomRec = false;
        this.laraArEnableStrongRec = false;
        this.laraArDecision = "default";
        this.uidForOAuth = "";
        this.canShowProfilePicAndName = false;
        this.enableMsgrSsoArBypassOtherAuthMethods = false;
        this.enableAutoConf = false;
        this.shouldSkipResetPasswordAfterArBypass = false;
        this.shouldShowPNSeparateChoices = false;
    }

    public AccountCandidateModel(Parcel parcel) {
        this.A04 = AnonymousClass001.A0s();
        this.A02 = AnonymousClass001.A0s();
        this.A06 = AnonymousClass001.A0s();
        this.A01 = AnonymousClass001.A0s();
        this.A05 = AnonymousClass001.A0s();
        this.A03 = AnonymousClass001.A0s();
        this.A07 = AnonymousClass001.A0s();
        this.id = parcel.readString();
        this.name = parcel.readString();
        this.networkName = parcel.readString();
        this.profilePictureUri = parcel.readString();
        this.contactPoints = (AccountCandidateContactPointList) 1BL.A0C(parcel, AccountCandidateContactPointList.class);
        this.skipInitiateView = Boolean.valueOf(AnonymousClass001.A1Q(parcel.readInt(), 1));
        this.fdrNonce = parcel.readString();
        this.arSkipResetPasswordGroup = parcel.readString();
        this.buttonShowIcon = Boolean.valueOf(1BM.A07(parcel));
        this.whatsAppFirst = Boolean.valueOf(1BM.A07(parcel));
        this.isLowPriForCpl = Boolean.valueOf(1BM.A07(parcel));
        this.A00 = C53v.A0S(parcel);
        this.firstName = parcel.readString();
        this.loginInArGroup = parcel.readInt();
        this.inlineCplGroup = parcel.readInt();
        this.smartAuthGroup = parcel.readInt();
        this.smartAuthGroupNew = parcel.readInt();
        this.emailAboveSmsGroup = Boolean.valueOf(C53v.A0S(parcel));
        this.earIdUploadEligible = Boolean.valueOf(1BM.A07(parcel));
        this.earOldPasswordEligible = Boolean.valueOf(1BM.A07(parcel));
        this.passwordResetNonceLength = parcel.readInt();
        this.sharedPhoneNonceLength = parcel.readInt();
        this.cplSmsRetrieverAutoSubmitTestGroup = parcel.readString();
        this.nonceSendStatus = parcel.readInt();
        this.xsContentVariant = parcel.readString();
        this.laraAuthMethod = parcel.readInt();
        this.sharedPhoneNumber = parcel.readString();
        this.msgrSsoGroup = parcel.readString();
        this.showDblCplInterstitial = C53v.A0S(parcel);
        this.assistiveLoginGroup = parcel.readString();
        this.flashCallGroup = parcel.readString();
        this.enableSSOLikeOauth = AbJ.A1W(parcel);
        this.isPasswordAsIdentifier = C53v.A0S(parcel);
        this.initiateViewLithoMigration = parcel.readString();
        this.recoveryAssistiveIdFlow = parcel.readString();
        this.arCodeEntryLithoMigration = parcel.readString();
        this.shouldCallLaraEndpoint = Boolean.valueOf(C53v.A0S(parcel));
        this.laraArUpdateMsgrSsoUI = Boolean.valueOf(C53v.A0S(parcel));
        this.laraArUpdateInitiateViewUI = Boolean.valueOf(C53v.A0S(parcel));
        this.laraArEnableRandomRec = Boolean.valueOf(C53v.A0S(parcel));
        this.laraArEnableStrongRec = Boolean.valueOf(C53v.A0S(parcel));
        this.laraArDecision = parcel.readString();
        this.uidForOAuth = parcel.readString();
        this.canShowProfilePicAndName = C53v.A0S(parcel);
        this.enableMsgrSsoArBypassOtherAuthMethods = C53v.A0S(parcel);
        this.enableAutoConf = C53v.A0S(parcel);
        this.shouldSkipResetPasswordAfterArBypass = C53v.A0S(parcel);
        this.shouldShowPNSeparateChoices = C53v.A0S(parcel);
    }

    public AccountCandidateModel(AccountCandidateContactPointList accountCandidateContactPointList, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str, String str2, String str3, String str4, int i, int i2, int i3) {
        this.A04 = AnonymousClass001.A0s();
        this.A02 = AnonymousClass001.A0s();
        this.A06 = AnonymousClass001.A0s();
        this.A01 = AnonymousClass001.A0s();
        this.A05 = AnonymousClass001.A0s();
        this.A03 = AnonymousClass001.A0s();
        this.A07 = AnonymousClass001.A0s();
        this.id = str2;
        this.name = str3;
        this.networkName = null;
        this.profilePictureUri = str4;
        this.contactPoints = accountCandidateContactPointList;
        this.skipInitiateView = bool4;
        this.fdrNonce = null;
        this.arSkipResetPasswordGroup = null;
        this.buttonShowIcon = false;
        this.whatsAppFirst = false;
        this.isLowPriForCpl = false;
        this.A00 = false;
        this.firstName = str;
        this.loginInArGroup = 0;
        this.inlineCplGroup = i;
        this.smartAuthGroup = i3;
        this.smartAuthGroupNew = 0;
        this.emailAboveSmsGroup = bool3;
        this.earIdUploadEligible = bool;
        this.earOldPasswordEligible = bool2;
        this.passwordResetNonceLength = i2;
        this.sharedPhoneNonceLength = 6;
        this.cplSmsRetrieverAutoSubmitTestGroup = null;
        this.nonceSendStatus = 0;
        this.xsContentVariant = null;
        this.laraAuthMethod = 0;
        this.sharedPhoneNumber = null;
        this.msgrSsoGroup = null;
        this.showDblCplInterstitial = false;
        this.assistiveLoginGroup = "none";
        this.flashCallGroup = null;
        this.enableSSOLikeOauth = false;
        this.isPasswordAsIdentifier = false;
        this.initiateViewLithoMigration = "";
        this.recoveryAssistiveIdFlow = "none";
        this.arCodeEntryLithoMigration = "";
        this.shouldCallLaraEndpoint = false;
        this.laraArUpdateMsgrSsoUI = false;
        this.laraArUpdateInitiateViewUI = false;
        this.laraArEnableRandomRec = false;
        this.laraArEnableStrongRec = false;
        this.laraArDecision = "default";
        this.uidForOAuth = "";
        this.canShowProfilePicAndName = false;
        this.enableMsgrSsoArBypassOtherAuthMethods = false;
        this.enableAutoConf = false;
        this.shouldSkipResetPasswordAfterArBypass = false;
        this.shouldShowPNSeparateChoices = false;
    }

    public ImmutableList A00() {
        List list = this.A02;
        if (list.isEmpty()) {
            A04();
        }
        return list.isEmpty() ? ImmutableList.of() : ImmutableList.copyOf((Collection) list);
    }

    public ImmutableList A01() {
        List list = this.A03;
        return list.isEmpty() ? ImmutableList.of() : ImmutableList.copyOf((Collection) list);
    }

    public ImmutableList A02() {
        List list = this.A04;
        if (list.isEmpty()) {
            A04();
        }
        return list.isEmpty() ? ImmutableList.of() : ImmutableList.copyOf((Collection) list);
    }

    public ImmutableList A03() {
        List list = this.A05;
        return list.isEmpty() ? ImmutableList.of() : ImmutableList.copyOf((Collection) list);
    }

    public void A04() {
        AccountCandidateContactPointList accountCandidateContactPointList;
        List list;
        List list2 = this.A02;
        if (list2.isEmpty()) {
            List list3 = this.A04;
            if (list3.isEmpty()) {
                List list4 = this.A06;
                if (!list4.isEmpty() || (accountCandidateContactPointList = this.contactPoints) == null) {
                    return;
                }
                List list5 = accountCandidateContactPointList.candidateContactPoints;
                ImmutableList of = list5 == null ? ImmutableList.of() : ImmutableList.copyOf((Collection) list5);
                if (of == null || of.isEmpty()) {
                    return;
                }
                Iterator it = of.iterator();
                while (it.hasNext()) {
                    AccountCandidateContactPoint accountCandidateContactPoint = (AccountCandidateContactPoint) it.next();
                    String str = accountCandidateContactPoint.contactType;
                    if (str.equals(PaymentDetailChangeTypes$Companion.EMAIL)) {
                        list2.add(accountCandidateContactPoint.displayContactInfo);
                        list = this.A03;
                    } else {
                        boolean equals = str.equals("WHATSAPP");
                        String str2 = accountCandidateContactPoint.displayContactInfo;
                        if (equals) {
                            list4.add(str2);
                            list = this.A07;
                        } else {
                            list3.add(str2);
                            list = this.A05;
                        }
                    }
                    list.add(accountCandidateContactPoint.id);
                    this.A01.add(accountCandidateContactPoint.displayContactInfo);
                }
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.networkName);
        parcel.writeString(this.profilePictureUri);
        parcel.writeParcelable(this.contactPoints, i);
        DKF.A1C(parcel, this.skipInitiateView);
        parcel.writeString(this.fdrNonce);
        parcel.writeString(this.arSkipResetPasswordGroup);
        DKF.A1C(parcel, this.buttonShowIcon);
        DKF.A1C(parcel, this.whatsAppFirst);
        DKF.A1C(parcel, this.isLowPriForCpl);
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeString(this.firstName);
        parcel.writeInt(this.loginInArGroup);
        parcel.writeInt(this.inlineCplGroup);
        parcel.writeInt(this.smartAuthGroup);
        parcel.writeInt(this.smartAuthGroupNew);
        DKF.A1C(parcel, this.emailAboveSmsGroup);
        DKF.A1C(parcel, this.earIdUploadEligible);
        DKF.A1C(parcel, this.earOldPasswordEligible);
        parcel.writeInt(this.passwordResetNonceLength);
        parcel.writeInt(this.sharedPhoneNonceLength);
        parcel.writeString(this.cplSmsRetrieverAutoSubmitTestGroup);
        parcel.writeInt(this.nonceSendStatus);
        parcel.writeString(this.xsContentVariant);
        parcel.writeInt(this.laraAuthMethod);
        parcel.writeString(this.sharedPhoneNumber);
        parcel.writeString(this.msgrSsoGroup);
        parcel.writeInt(this.showDblCplInterstitial ? 1 : 0);
        parcel.writeString(this.assistiveLoginGroup);
        parcel.writeString(this.flashCallGroup);
        parcel.writeInt(this.enableSSOLikeOauth ? 1 : 0);
        parcel.writeInt(this.isPasswordAsIdentifier ? 1 : 0);
        parcel.writeString(this.initiateViewLithoMigration);
        parcel.writeString(this.recoveryAssistiveIdFlow);
        parcel.writeString(this.arCodeEntryLithoMigration);
        DKF.A1C(parcel, this.shouldCallLaraEndpoint);
        DKF.A1C(parcel, this.laraArUpdateMsgrSsoUI);
        DKF.A1C(parcel, this.laraArUpdateInitiateViewUI);
        DKF.A1C(parcel, this.laraArEnableRandomRec);
        DKF.A1C(parcel, this.laraArEnableStrongRec);
        parcel.writeString(this.laraArDecision);
        parcel.writeString(this.uidForOAuth);
        parcel.writeInt(this.canShowProfilePicAndName ? 1 : 0);
        parcel.writeInt(this.enableMsgrSsoArBypassOtherAuthMethods ? 1 : 0);
        parcel.writeInt(this.enableAutoConf ? 1 : 0);
        parcel.writeInt(this.shouldSkipResetPasswordAfterArBypass ? 1 : 0);
        parcel.writeInt(this.shouldShowPNSeparateChoices ? 1 : 0);
    }
}
