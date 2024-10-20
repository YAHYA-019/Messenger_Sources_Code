package com.facebook.messaging.model.messages;

import X.0S2;
import X.1BL;
import X.1BM;
import X.4YU;
import X.5fI;
import X.7zS;
import X.AnonymousClass001;
import X.BMA;
import X.BSN;
import X.BSO;
import X.C53v;
import X.C7ky;
import X.C7kz;
import X.C7l0;
import X.C7l1;
import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.acra.constants.ActionId;
import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableBiMap;

/* loaded from: GenericAdminMessageInfo.class */
public final class GenericAdminMessageInfo implements Parcelable {
    public static final ImmutableBiMap A0P;
    public static final ImmutableBiMap A0Q;
    public static final Parcelable.Creator CREATOR;
    public int A00;
    public AdProperties A01;
    public BMA A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final int A0C;
    public final int A0D;
    public final GenericAdminMessageExtensibleData A0E;
    public final Integer A0F;
    public final Integer A0G;
    public final Integer A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final boolean A0N;
    public final boolean A0O;

    /* loaded from: GenericAdminMessageInfo$AdProperties.class */
    public class AdProperties implements Parcelable {
        public static final Parcelable.Creator CREATOR = CSV.A00(49);
        public final String adClientToken;
        public final String adHelpUri;
        public final String adHideUri;
        public final String adId;
        public final String adReportUri;
        public final boolean isOffsiteAd;
        public final String preferenceLink;

        public AdProperties(Parcel parcel) {
            this.preferenceLink = parcel.readString();
            this.adHideUri = parcel.readString();
            this.adReportUri = parcel.readString();
            this.adHelpUri = parcel.readString();
            this.adClientToken = parcel.readString();
            this.adId = parcel.readString();
            this.isOffsiteAd = 7zS.A1Z(parcel);
        }

        public AdProperties(String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
            this.preferenceLink = str;
            this.adHideUri = str2;
            this.adReportUri = str3;
            this.adHelpUri = str4;
            this.adClientToken = str5;
            this.adId = str6;
            this.isOffsiteAd = z;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.preferenceLink);
            parcel.writeString(this.adHideUri);
            parcel.writeString(this.adReportUri);
            parcel.writeString(this.adHelpUri);
            parcel.writeString(this.adClientToken);
            parcel.writeString(this.adId);
            parcel.writeInt(this.isOffsiteAd ? 1 : 0);
        }
    }

    static {
        ImmutableMap.Builder builder = new ImmutableMap.Builder(4);
        builder.A02("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", -1);
        builder.A02("CONFIRM_FRIEND_REQUEST", 4YU.A0k());
        builder.A02("ACCEPT_PENDING_THREAD", 1);
        builder.A02("RAMP_UP_WELCOME_MESSAGE", 2);
        builder.A02("CHANGE_THREAD_THEME", 3);
        builder.A02("CHANGE_THREAD_ICON", 4);
        builder.A02("GROUP_THREAD_CREATED", 5);
        builder.A02("THREAD_EPHEMERAL_SEND_MODE", 6);
        builder.A02("INVITE_ACCEPTED", 7);
        builder.A02("MESSENGER_INVITE_SENT", 8);
        builder.A02("TURN_ON_PUSH", 9);
        builder.A02("RTC_CALL_LOG", 14);
        builder.A02("CHANGE_THREAD_NICKNAME", 15);
        builder.A02("AD_MANAGE_MESSAGE", 18);
        builder.A02("GAME_SCORE", 19);
        builder.A02("CHANGE_JOINABLE_SETTING", 27);
        builder.A02("THREAD_JOINABLE_PROMOTION_TEXT", 28);
        builder.A02("INSTANT_GAME_UPDATE", 29);
        builder.A02("JOINABLE_GROUP_THREAD_CREATED", 30);
        builder.A02("ADD_CONTACT", 31);
        builder.A02("GROUP_POLL", 37);
        builder.A02("MEDIA_SUBSCRIPTION_MANAGE", 38);
        builder.A02("POKE_RECEIVED", 40);
        builder.A02("MESSENGER_EXTENSION_ADD_CART", 41);
        builder.A02("MESSENGER_EXTENSION_ADD_FAVORITE", 43);
        builder.A02("STARTED_SHARING_VIDEO", 44);
        builder.A02("PARTICIPANT_JOINED_GROUP_CALL", 45);
        builder.A02("GROUP_PAYMENT_REQUEST", 49);
        builder.A02("THREAD_CUSTOMIZATION_UPSELL", 51);
        builder.A02("P2P_PAYMENT_REQUEST_REMINDER", 52);
        builder.A02("ALOHA_CALL_INVITE", 54);
        builder.A02("INSTANT_GAME_BOT_INTRO", 56);
        builder.A02("MESSENGER_CALL_LOG", 57);
        builder.A02("ALOHA_USER_JOINED_CALL_ON_ALOHA", 58);
        builder.A02("MESSENGER_AD_CONTEXT", 59);
        builder.A02("PAGES_MARK_AS_PAID", 60);
        builder.A02("MESSENGER_GROUP_EVENT_STATUS_UPDATE", 61);
        builder.A02("NEO_APPROVED_USER_REMOVED_FROM_GROUP", 62);
        builder.A02("GROUP_ADMIN_MODEL_NUX", 64);
        builder.A02("MESSENGER_GROUP_SYNC_OPT_IN", 65);
        builder.A02("SERVICES_VERTICAL_OPT_OUT_REQUESTS", 67);
        builder.A02("PAGES_CALL_DEFLECTION_UPSELL", 68);
        builder.A02("MESSENGER_RESPOND_REMINDER_CONFIRMATION", 72);
        builder.A02("MESSENGER_RESPOND_REMINDER", 73);
        builder.A02("MESSENGER_RESPOND_REMINDER_USER_CANCEL", 74);
        builder.A02("MESSENGER_RESPOND_REMINDER_CANCEL_SUGGESTION", 75);
        builder.A02("MN_REF_SEND_TEXT", 76);
        builder.A02("MESSENGER_GROUP_DESCRIPTION_UPDATE_V2", 77);
        builder.A02("MESSENGER_GROWTH_GENERIC_ADMIN_TEXT", 78);
        builder.A02("LINK_CTA", 80);
        builder.A02("NEO_APPROVED_CONNECTION_ADDED", 81);
        builder.A02("PAGES_MARK_AS_PAID_NEW", 84);
        builder.A02("MESSENGER_PRECHECKED_PLUGIN", 85);
        builder.A02("PAYMENT_INCENTIVE_RECEIVED", 86);
        builder.A02("MENTORSHIP_PROGRAM_LEAVE_PROMPT", 87);
        builder.A02("MESSENGER_THREAD_RESURRECTION_NOTICE", 88);
        builder.A02("PAGE_THREAD_ACTION_SYSTEM_ADD_DETAILS", 89);
        builder.A02("INSTANT_GAME_BOT_FEEDBACK", 90);
        builder.A02("PAYMENTS_CARE_B2C_MESSENGER_ESCALATION_XMAT", 91);
        builder.A02("MAGIC_WORDS", 92);
        builder.A02("NOTIFICATION_MESSAGES", 93);
        builder.A02("PIN_MESSAGES_V2", 94);
        builder.A02("UNPIN_MESSAGES_V2", 95);
        builder.A02("JOINABLE_GROUP_LINK_RESET", 96);
        builder.A02("JOINABLE_GROUP_LINK_MODE_CHANGE", 97);
        builder.A02("MESSENGER_P2B_PRIVACY_DISCLOSURE", 98);
        builder.A02("CHANGE_THREAD_THEME_TO_LOCATION_THEME", 99);
        builder.A02("INSTANT_GAME_BOT_MESSAGE_SUBSCRIPTION_MANAGEMENT", 100);
        builder.A02("MESSENGER_FAQ_RESPONSE_RESOLUTION_SIGNAL_COLLECTION_XMAT", Integer.valueOf(ActionId.ON_VIEW_CREATED_END));
        builder.A02("INSTANT_GAME_CUSTOM_UPDATE_MUTE_MANAGEMENT", Integer.valueOf(ActionId.DATA_LOAD_START));
        builder.A02("SERVICE_BOOKING_LEGAL_DISCLAIMER_ADMIN_TEXT", Integer.valueOf(ActionId.LEGACY_MARKER));
        builder.A02("BMC_SELLER_REVIEW_POST_SUBMISSION_TEXT", Integer.valueOf(ActionId.ACTION_BAR_COMPLETE));
        builder.A02("MESSAGING_OFFERS_REMINDER", Integer.valueOf(ActionId.ABORTED));
        builder.A02("RTC_PAGE_CALLBACK", Integer.valueOf(ActionId.RTMP_PACKET_RECEIVED));
        builder.A02("BIZ_INBOX_DETECTED_OUTCOMES_ACTIVITY", 108);
        builder.A02("MESSENGER_LEAD_FORM_RECEIVED", Integer.valueOf(ActionId.RTMP_CONNECTION_REQUESTED));
        RegularImmutableBiMap A00 = 5fI.A00(builder);
        A0P = A00;
        A0Q = A00.A00;
        CREATOR = new CSV(48);
    }

    public GenericAdminMessageInfo(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        this.A0I = readString;
        this.A0C = parcel.readInt();
        boolean z = false;
        this.A0O = AnonymousClass001.A1N(parcel.readInt());
        this.A0J = parcel.readString();
        this.A0M = parcel.readString();
        this.A0K = parcel.readString();
        this.A0L = parcel.readString();
        this.A0D = parcel.readInt();
        this.A06 = parcel.readString();
        this.A07 = parcel.readString();
        this.A0B = 1BM.A07(parcel);
        this.A01 = (AdProperties) 1BL.A0C(parcel, AdProperties.class);
        this.A05 = parcel.readString();
        this.A00 = parcel.readInt();
        this.A09 = AnonymousClass001.A1N(parcel.readInt());
        this.A02 = parcel.readSerializable();
        this.A0A = C53v.A0S(parcel);
        this.A0E = (GenericAdminMessageExtensibleData) 1BL.A0C(parcel, GenericAdminMessageExtensibleData.class);
        this.A0N = parcel.readInt() != 0 ? true : z;
        this.A08 = parcel.readString();
        this.A0H = BSN.A00(parcel.readInt());
        this.A03 = parcel.readString();
        this.A0F = C7ky.A00(parcel.readInt());
        this.A0G = C7l0.A00(parcel.readInt());
        this.A04 = parcel.readString();
    }

    public GenericAdminMessageInfo(GenericAdminMessageExtensibleData genericAdminMessageExtensibleData, AdProperties adProperties, BMA bma, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A0I = str;
        this.A0C = i;
        this.A0O = z;
        this.A0J = str2;
        this.A0M = str3;
        this.A0K = str4;
        this.A0L = str5;
        this.A0D = i2;
        this.A06 = str6;
        this.A07 = str7;
        this.A0B = z2;
        this.A01 = adProperties;
        this.A05 = str8;
        this.A00 = i3;
        this.A09 = z3;
        this.A02 = bma;
        this.A0A = z4;
        this.A0E = genericAdminMessageExtensibleData;
        this.A0N = z5;
        this.A08 = str9;
        this.A0H = num;
        this.A03 = str10;
        this.A0F = num2;
        this.A0G = num3;
        this.A04 = str11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A0I);
        parcel.writeInt(this.A0C);
        parcel.writeInt(this.A0O ? 1 : 0);
        parcel.writeString(this.A0J);
        parcel.writeString(this.A0M);
        parcel.writeString(this.A0K);
        parcel.writeString(this.A0L);
        parcel.writeInt(this.A0D);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeSerializable(this.A02);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeParcelable(this.A0E, i);
        parcel.writeInt(this.A0N ? 1 : 0);
        parcel.writeString(this.A08);
        Integer num = this.A0H;
        if (num == null) {
            num = 0S2.A0j;
        }
        parcel.writeInt(BSO.A00(num));
        parcel.writeString(this.A03);
        Integer num2 = this.A0F;
        if (num2 == null) {
            num2 = 0S2.A0C;
        }
        parcel.writeInt(C7kz.A00(num2));
        Integer num3 = this.A0G;
        if (num3 == null) {
            num3 = 0S2.A01;
        }
        parcel.writeInt(C7l1.A00(num3));
        parcel.writeString(this.A04);
    }
}
