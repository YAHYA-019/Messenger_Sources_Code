package com.facebook.graphql.enums;

import com.facebook.acra.constants.ReportField;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: GraphQLBusinessAssetTypeEnum.class */
public final class GraphQLBusinessAssetTypeEnum {
    public static final /* synthetic */ GraphQLBusinessAssetTypeEnum[] A00;
    public static final GraphQLBusinessAssetTypeEnum A01;
    public static final GraphQLBusinessAssetTypeEnum A02;
    public final String serverValue;

    static {
        GraphQLBusinessAssetTypeEnum A002 = A00("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0);
        A01 = A002;
        GraphQLBusinessAssetTypeEnum A003 = A00("ADS_EVENT_SOURCE", 1);
        GraphQLBusinessAssetTypeEnum A004 = A00("ADVANCED_ANALYTICS_INSTANCE", 2);
        GraphQLBusinessAssetTypeEnum A005 = A00("AD_ACCOUNT", 3);
        GraphQLBusinessAssetTypeEnum A006 = A00("AD_ACCOUNT_CREATION_REQUEST", 4);
        GraphQLBusinessAssetTypeEnum A007 = A00("AD_DRAFT_WORKSPACE", 5);
        GraphQLBusinessAssetTypeEnum A008 = A00("AD_IMAGE", 6);
        GraphQLBusinessAssetTypeEnum A009 = A00("AD_STUDY", 7);
        GraphQLBusinessAssetTypeEnum A0010 = A00("APP", 8);
        GraphQLBusinessAssetTypeEnum A0011 = A00("BANK", 9);
        GraphQLBusinessAssetTypeEnum A0012 = A00("BLOCK_LIST", 10);
        GraphQLBusinessAssetTypeEnum A0013 = A00(ReportField.BRAND, 11);
        GraphQLBusinessAssetTypeEnum A0014 = A00("BUSINESS_CREATIVE_ASSET", 12);
        GraphQLBusinessAssetTypeEnum A0015 = A00("BUSINESS_CREATIVE_FOLDER", 13);
        GraphQLBusinessAssetTypeEnum A0016 = A00("BUSINESS_FRANCHISE_CONFIG", 14);
        GraphQLBusinessAssetTypeEnum A0017 = A00("BUSINESS_IMAGE", 15);
        GraphQLBusinessAssetTypeEnum A0018 = A00("BUSINESS_LOCATIONS_WRAPPER", 16);
        GraphQLBusinessAssetTypeEnum A0019 = A00("BUSINESS_LOYALTY_PROGRAM", 17);
        GraphQLBusinessAssetTypeEnum A0020 = A00("BUSINESS_PAYOUT_ACCOUNT", 18);
        GraphQLBusinessAssetTypeEnum A0021 = A00("BUSINESS_PERSON", 19);
        GraphQLBusinessAssetTypeEnum A0022 = A00("BUSINESS_REQUEST", 20);
        GraphQLBusinessAssetTypeEnum A0023 = A00("BUSINESS_RESOURCE_GROUP", 21);
        GraphQLBusinessAssetTypeEnum A0024 = A00("BUSINESS_UNIT", 22);
        GraphQLBusinessAssetTypeEnum A0025 = A00("BUSINESS_VIDEO", 23);
        GraphQLBusinessAssetTypeEnum A0026 = A00("CAIPT_ASSET", 24);
        GraphQLBusinessAssetTypeEnum A0027 = A00("CLOUD_PLAYABLE_ASSET", 25);
        GraphQLBusinessAssetTypeEnum A0028 = A00("CONTENT_BLOCK_LIST", 26);
        GraphQLBusinessAssetTypeEnum A0029 = A00("CREATOR_MARKETPLACE_BRAND_PROFILE", 27);
        GraphQLBusinessAssetTypeEnum A0030 = A00("CREATOR_SELLER_PROFILE", 28);
        GraphQLBusinessAssetTypeEnum A0031 = A00("CREDENTIAL_SHARE_REQUEST", 29);
        GraphQLBusinessAssetTypeEnum A0032 = A00("CREDIT_CARD", 30);
        GraphQLBusinessAssetTypeEnum A0033 = A00("CREDIT_PARTITION", 31);
        GraphQLBusinessAssetTypeEnum A0034 = A00("CREDIT_PARTITION_CONFIG", 32);
        GraphQLBusinessAssetTypeEnum A0035 = A00("CUSTOM_AUDIENCE", 33);
        GraphQLBusinessAssetTypeEnum A0036 = A00("CUSTOM_CONVERSION", 34);
        GraphQLBusinessAssetTypeEnum A0037 = A00("DYNAMIC_CONTENT_SET", 35);
        GraphQLBusinessAssetTypeEnum A0038 = A00("EVENTS_DATASET", 36);
        GraphQLBusinessAssetTypeEnum A0039 = A00("EVENTS_DATASET_NEW", 37);
        GraphQLBusinessAssetTypeEnum A0040 = A00("EVENT_SOURCE_GROUP", 38);
        GraphQLBusinessAssetTypeEnum A0041 = A00("EXAMPLE_CAT", 39);
        GraphQLBusinessAssetTypeEnum A0042 = A00("FINANCE", 40);
        GraphQLBusinessAssetTypeEnum A0043 = A00("FUNDING_SOURCE", 41);
        GraphQLBusinessAssetTypeEnum A0044 = A00("GRP_PLAN", 42);
        GraphQLBusinessAssetTypeEnum A0045 = A00("HOTEL_PRICE_FETCHER_PULL_CONFIG", 43);
        GraphQLBusinessAssetTypeEnum A0046 = A00("INSTAGRAM_ACCOUNT", 44);
        GraphQLBusinessAssetTypeEnum A0047 = A00("INSTAGRAM_ACCOUNT_V2", 45);
        GraphQLBusinessAssetTypeEnum A0048 = A00("INSTAGRAM_BUSINESS_ASSET", 46);
        GraphQLBusinessAssetTypeEnum A0049 = A00("IP", 47);
        GraphQLBusinessAssetTypeEnum A0050 = A00("LEADS_ACCESS", 48);
        GraphQLBusinessAssetTypeEnum A0051 = A00("LEGACY_LOGIN", 49);
        GraphQLBusinessAssetTypeEnum A0052 = A00("LEGAL_ENTITY", 50);
        GraphQLBusinessAssetTypeEnum A0053 = A00("MESSAGING_DATASET", 51);
        GraphQLBusinessAssetTypeEnum A0054 = A00("MONETIZATION_PROPERTY", 52);
        GraphQLBusinessAssetTypeEnum A0055 = A00("MV4B_BILLABLE_ACCOUNT", 53);
        GraphQLBusinessAssetTypeEnum A0056 = A00("NEWS_PAGE", 54);
        GraphQLBusinessAssetTypeEnum A0057 = A00("NME_BUSINESS_SUBSCRIPTION_ASSET", 55);
        GraphQLBusinessAssetTypeEnum A0058 = A00("OFFLINE_CONVERSION_DATA_SET", 56);
        GraphQLBusinessAssetTypeEnum A0059 = A00("OFFSITE_EMAIL_ACCOUNT", 57);
        GraphQLBusinessAssetTypeEnum A0060 = A00("OWNED_DOMAIN", 58);
        GraphQLBusinessAssetTypeEnum A0061 = A00("PAGE", 59);
        GraphQLBusinessAssetTypeEnum A0062 = A00("PAGE_FOR_LOCATIONS", 60);
        GraphQLBusinessAssetTypeEnum A0063 = A00("PAYOUT_ACCOUNT", 61);
        GraphQLBusinessAssetTypeEnum A0064 = A00("PHOTO", 62);
        GraphQLBusinessAssetTypeEnum A0065 = A00("PIXEL", 63);
        GraphQLBusinessAssetTypeEnum A0066 = A00("PLACE_PAGE_SET", 64);
        GraphQLBusinessAssetTypeEnum A0067 = A00("PLATFORM_CUSTOM_AUDIENCE", 65);
        GraphQLBusinessAssetTypeEnum A0068 = A00("PRODUCT_CATALOG", 66);
        GraphQLBusinessAssetTypeEnum A0069 = A00("PROFILE_PLUS", 67);
        GraphQLBusinessAssetTypeEnum A0070 = A00("PROJECT", 68);
        GraphQLBusinessAssetTypeEnum A0071 = A00("PUBLISHER_WHITE_LIST", 69);
        GraphQLBusinessAssetTypeEnum A0072 = A00("RECEIPT", 70);
        GraphQLBusinessAssetTypeEnum A0073 = A00("REGISTERED_TRADEMARK", 71);
        GraphQLBusinessAssetTypeEnum A0074 = A00("RESELLER_VETTING_OE_REQUEST", 72);
        GraphQLBusinessAssetTypeEnum A0075 = A00("SAVED_AUDIENCE", 73);
        GraphQLBusinessAssetTypeEnum A0076 = A00("SELLER_PROFILE", 74);
        GraphQLBusinessAssetTypeEnum A0077 = A00("SIGNALS_EVENT_NAME", 75);
        GraphQLBusinessAssetTypeEnum A0078 = A00("SIGNAL_SEGMENT", 76);
        GraphQLBusinessAssetTypeEnum A0079 = A00("SLICED_EVENT_SOURCE_GROUP", 77);
        GraphQLBusinessAssetTypeEnum A0080 = A00("SPACO_DS_DATA_COLLECTION", 78);
        GraphQLBusinessAssetTypeEnum A0081 = A00("SYSTEM_USER", 79);
        GraphQLBusinessAssetTypeEnum A0082 = A00(OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID, 80);
        GraphQLBusinessAssetTypeEnum A0083 = A00("USER", 81);
        GraphQLBusinessAssetTypeEnum A0084 = A00("VIDEO_ASSET", 82);
        GraphQLBusinessAssetTypeEnum A0085 = A00("WHATSAPP_BUSINESS_ACCOUNT", 83);
        A02 = A0085;
        GraphQLBusinessAssetTypeEnum[] graphQLBusinessAssetTypeEnumArr = new GraphQLBusinessAssetTypeEnum[84];
        System.arraycopy(new GraphQLBusinessAssetTypeEnum[]{A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, A0017, A0018, A0019, A0020, A0021, A0022, A0023, A0024, A0025, A0026, A0027, A0028}, 0, graphQLBusinessAssetTypeEnumArr, 0, 27);
        System.arraycopy(new GraphQLBusinessAssetTypeEnum[]{A0029, A0030, A0031, A0032, A0033, A0034, A0035, A0036, A0037, A0038, A0039, A0040, A0041, A0042, A0043, A0044, A0045, A0046, A0047, A0048, A0049, A0050, A0051, A0052, A0053, A0054, A0055}, 0, graphQLBusinessAssetTypeEnumArr, 27, 27);
        System.arraycopy(new GraphQLBusinessAssetTypeEnum[]{A0056, A0057, A0058, A0059, A0060, A0061, A0062, A0063, A0064, A0065, A0066, A0067, A0068, A0069, A0070, A0071, A0072, A0073, A0074, A0075, A0076, A0077, A0078, A0079, A0080, A0081, A0082}, 0, graphQLBusinessAssetTypeEnumArr, 54, 27);
        System.arraycopy(new GraphQLBusinessAssetTypeEnum[]{A0083, A0084, A0085}, 0, graphQLBusinessAssetTypeEnumArr, 81, 3);
        A00 = graphQLBusinessAssetTypeEnumArr;
    }

    public GraphQLBusinessAssetTypeEnum(String str, int i, String str2) {
        this.serverValue = str2;
    }

    public static GraphQLBusinessAssetTypeEnum A00(String str, int i) {
        return new GraphQLBusinessAssetTypeEnum(str, i, str);
    }

    public static GraphQLBusinessAssetTypeEnum valueOf(String str) {
        return (GraphQLBusinessAssetTypeEnum) Enum.valueOf(GraphQLBusinessAssetTypeEnum.class, str);
    }

    public static GraphQLBusinessAssetTypeEnum[] values() {
        return (GraphQLBusinessAssetTypeEnum[]) A00.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.serverValue;
    }
}
