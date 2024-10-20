package com.facebook.quickpromotion.model;

import X.11T;
import X.C00t;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import java.util.Locale;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: CustomRenderType.class */
public final class CustomRenderType {
    public static final Companion A00;
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ CustomRenderType[] A02;
    public static final CustomRenderType A03;
    public static final CustomRenderType A04;
    public static final CustomRenderType A05;
    public static final CustomRenderType A06;
    public static final CustomRenderType A07;
    public static final CustomRenderType A08;
    public static final CustomRenderType A09;
    public static final CustomRenderType A0A;
    public static final CustomRenderType A0B;
    public static final CustomRenderType A0C;
    public static final CustomRenderType A0D;
    public static final CustomRenderType A0E;
    public static final CustomRenderType A0F;
    public static final CustomRenderType A0G;
    public static final CustomRenderType A0H;
    public static final CustomRenderType A0I;
    public static final CustomRenderType A0J;
    public static final CustomRenderType A0K;
    public static final CustomRenderType A0L;
    public static final CustomRenderType A0M;
    public static final CustomRenderType A0N;
    public static final CustomRenderType A0O;
    public static final CustomRenderType A0P;
    public static final CustomRenderType A0Q;
    public static final CustomRenderType A0R;
    public static final CustomRenderType A0S;
    public static final CustomRenderType A0T;
    public static final CustomRenderType A0U;
    public static final CustomRenderType A0V;
    public static final CustomRenderType A0W;
    public static final CustomRenderType A0X;
    public static final CustomRenderType A0Y;
    public static final CustomRenderType A0Z;
    public static final CustomRenderType A0a;
    public static final CustomRenderType A0b;
    public static final CustomRenderType A0c;
    public static final CustomRenderType A0d;
    public static final CustomRenderType A0e;
    public static final CustomRenderType A0f;
    public static final CustomRenderType A0g;
    public static final CustomRenderType A0h;

    /* loaded from: CustomRenderType$Companion.class */
    public final class Companion {
        public final CustomRenderType fromString(String str) {
            try {
                if (str == null) {
                    return CustomRenderType.A0g;
                }
                String upperCase = str.toUpperCase(Locale.ROOT);
                11T.A0A(upperCase);
                return CustomRenderType.valueOf(upperCase);
            } catch (IllegalArgumentException unused) {
                return CustomRenderType.A0g;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v172, types: [com.facebook.quickpromotion.model.CustomRenderType$Companion, java.lang.Object] */
    static {
        CustomRenderType customRenderType = new CustomRenderType("ANDROID_INCOMING_FRIEND_REQUEST_PROMINENCE", 0);
        A03 = customRenderType;
        CustomRenderType customRenderType2 = new CustomRenderType("ANDROID_JEWEL_HEADER", 1);
        A04 = customRenderType2;
        CustomRenderType customRenderType3 = new CustomRenderType("ANDROID_MP_GMAIL_ACQUISITION", 2);
        A06 = customRenderType3;
        CustomRenderType customRenderType4 = new CustomRenderType("ANDROID_MP_ON_DEVICE_PHONE_ACQUISITION", 3);
        A07 = customRenderType4;
        CustomRenderType customRenderType5 = new CustomRenderType("ANDROID_JIO_PHONE_ACQUISITION", 4);
        A05 = customRenderType5;
        CustomRenderType customRenderType6 = new CustomRenderType("ANDROID_PROFILE_PHOTO_WATERMARK", 5);
        A08 = customRenderType6;
        CustomRenderType customRenderType7 = new CustomRenderType("GEMSTONE_MESSAGE_INBOX", 6);
        A0N = customRenderType7;
        CustomRenderType customRenderType8 = new CustomRenderType("GEMSTONE_MESSAGE_INBOX_CONVERSATIONS", 7);
        A0O = customRenderType8;
        CustomRenderType customRenderType9 = new CustomRenderType("GEMSTONE_MESSAGE_INBOX_NEW_MATCHES", 8);
        A0P = customRenderType9;
        CustomRenderType customRenderType10 = new CustomRenderType("GEMSTONE_MESSAGE_THREAD_CONVERSATION_STARTER", 9);
        A0Q = customRenderType10;
        CustomRenderType customRenderType11 = new CustomRenderType("GEMSTONE_MESSAGE_THREAD_VIEW_HEADER", 10);
        A0R = customRenderType11;
        CustomRenderType customRenderType12 = new CustomRenderType("PHONE_NUMBER_ACQUISITION", 11);
        A0U = customRenderType12;
        CustomRenderType customRenderType13 = new CustomRenderType("PRIMARY_ACTION_REDIRECT", 12);
        A0V = customRenderType13;
        CustomRenderType customRenderType14 = new CustomRenderType("DIALTONE_MEGAPHONE_NUX", 13);
        A0A = customRenderType14;
        CustomRenderType customRenderType15 = new CustomRenderType("NATIVE_TEMPLATE_TAB_PROMOTION", 14);
        A0S = customRenderType15;
        CustomRenderType customRenderType16 = new CustomRenderType("FB_COMMENT_COMPOSER_TOOLTIP", 15);
        A0B = customRenderType16;
        CustomRenderType customRenderType17 = new CustomRenderType("FB_REELS_FEED_REMIX_OPT_IN_BOTTOM_SHEET", 16);
        A0H = customRenderType17;
        CustomRenderType customRenderType18 = new CustomRenderType("STORIES_COMMENTS_PRODUCER_NUX_BOTTOM_SHEET", 17);
        A0b = customRenderType18;
        CustomRenderType customRenderType19 = new CustomRenderType("STORIES_THIRD_PARTY_CROSSPOST", 18);
        A0c = customRenderType19;
        CustomRenderType customRenderType20 = new CustomRenderType("TOFU_HYBRID_STORIES_BOTTOMSHEET_NUX", 19);
        A0d = customRenderType20;
        CustomRenderType customRenderType21 = new CustomRenderType("UNIFIED_TOFU_STORIES_BOTTOMSHEET_NUX", 20);
        A0f = customRenderType21;
        CustomRenderType customRenderType22 = new CustomRenderType("UNIFIED_TOFU_REELS_BOTTOMSHEET_NUX", 21);
        A0e = customRenderType22;
        CustomRenderType customRenderType23 = new CustomRenderType("STARS_UAS_UPSELL_BOTTOMSHEET", 22);
        A0a = customRenderType23;
        CustomRenderType customRenderType24 = new CustomRenderType("FB_TO_TH_FEED_CROSSPOST_UPSELL_BOTTOM_SHEET", 23);
        A0M = customRenderType24;
        CustomRenderType customRenderType25 = new CustomRenderType("FB_REELS_PUBLISH_PAGE_PUBLIC_AUDIENCE_BOTTOM_SHEET", 24);
        A0I = customRenderType25;
        CustomRenderType customRenderType26 = new CustomRenderType("FB_REELS_CREATION_REMIX_SELECTOR", 25);
        A0E = customRenderType26;
        CustomRenderType customRenderType27 = new CustomRenderType("FB_REELS_REMIX_ACCOUNT_SETTINGS_CONTEXTUAL_MESSAGE", 26);
        A0J = customRenderType27;
        CustomRenderType customRenderType28 = new CustomRenderType("FB_REELS_STORIES_TO_REELS_BOTTOM_SHEET", 27);
        A0K = customRenderType28;
        CustomRenderType customRenderType29 = new CustomRenderType("FB_REELS_ARCHIVE_STORIES_TO_REELS_BOTTOMSHEET_NUX", 28);
        A0D = customRenderType29;
        CustomRenderType customRenderType30 = new CustomRenderType("RMS_ADVANCED_UPSELL_STORIES_COMPOSER_TILE", 29);
        A0Z = customRenderType30;
        CustomRenderType customRenderType31 = new CustomRenderType("CAMERA_ROLL_INSPIRATION_FTUE", 30);
        A09 = customRenderType31;
        CustomRenderType customRenderType32 = new CustomRenderType("FB_REELS_CREATION_XPOSTING_TO_IG_PRESHARE_UPSELL", 31);
        A0G = customRenderType32;
        CustomRenderType customRenderType33 = new CustomRenderType("FB_REELS_CREATION_XPOSTING_TO_IG_POSTSHARE_UPSELL", 32);
        A0F = customRenderType33;
        CustomRenderType customRenderType34 = new CustomRenderType("FB_STORIES_CREATION_XPOSTING_TO_IG_POSTSHARE_UPSELL", 33);
        A0L = customRenderType34;
        CustomRenderType customRenderType35 = new CustomRenderType("FB_FEED_CREATION_XPOSTING_TO_IG_POSTSHARE_UPSELL", 34);
        A0C = customRenderType35;
        CustomRenderType customRenderType36 = new CustomRenderType("PUSH_TURN_ON_FOOTER", 35);
        A0W = customRenderType36;
        CustomRenderType customRenderType37 = new CustomRenderType("PUSH_TURN_ON_FOOTER_WITH_TITLE", 36);
        A0Y = customRenderType37;
        CustomRenderType customRenderType38 = new CustomRenderType("PUSH_TURN_ON_FOOTER_FB_MESSAGING_INBOX", 37);
        A0X = customRenderType38;
        CustomRenderType customRenderType39 = new CustomRenderType("WHATSAPP_TURN_ON_FOOTER", 38);
        A0h = customRenderType39;
        CustomRenderType customRenderType40 = new CustomRenderType("NDX_NATIVE_PYMK", 39);
        A0T = customRenderType40;
        CustomRenderType customRenderType41 = new CustomRenderType(OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID, 40);
        A0g = customRenderType41;
        CustomRenderType[] customRenderTypeArr = new CustomRenderType[41];
        System.arraycopy(new CustomRenderType[]{customRenderType, customRenderType2, customRenderType3, customRenderType4, customRenderType5, customRenderType6, customRenderType7, customRenderType8, customRenderType9, customRenderType10, customRenderType11, customRenderType12, customRenderType13, customRenderType14, customRenderType15, customRenderType16, customRenderType17, customRenderType18, customRenderType19, customRenderType20, customRenderType21, customRenderType22, customRenderType23, customRenderType24, customRenderType25, customRenderType26, customRenderType27}, 0, customRenderTypeArr, 0, 27);
        System.arraycopy(new CustomRenderType[]{customRenderType28, customRenderType29, customRenderType30, customRenderType31, customRenderType32, customRenderType33, customRenderType34, customRenderType35, customRenderType36, customRenderType37, customRenderType38, customRenderType39, customRenderType40, customRenderType41}, 0, customRenderTypeArr, 27, 14);
        A02 = customRenderTypeArr;
        A01 = C00t.A00(customRenderTypeArr);
        A00 = new Object();
    }

    public CustomRenderType(String str, int i) {
    }

    public static final CustomRenderType fromString(String str) {
        return A00.fromString(str);
    }

    public static CustomRenderType valueOf(String str) {
        return (CustomRenderType) Enum.valueOf(CustomRenderType.class, str);
    }

    public static CustomRenderType[] values() {
        return (CustomRenderType[]) A02.clone();
    }
}
