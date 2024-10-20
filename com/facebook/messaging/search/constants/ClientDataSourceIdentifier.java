package com.facebook.messaging.search.constants;

import X.0fH;
import X.1JF;
import X.82M;
import X.BP6;
import X.C6pc;
import X.Cpe;
import X.DK3;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: ClientDataSourceIdentifier.class */
public final class ClientDataSourceIdentifier implements DataSourceIdentifier {
    public static final ClientDataSourceIdentifier[] A00;
    public static final /* synthetic */ ClientDataSourceIdentifier[] A01;
    public static final ClientDataSourceIdentifier A02;
    public static final ClientDataSourceIdentifier A03;
    public static final ClientDataSourceIdentifier A04;
    public static final ClientDataSourceIdentifier A05;
    public static final ClientDataSourceIdentifier A06;
    public static final ClientDataSourceIdentifier A07;
    public static final ClientDataSourceIdentifier A08;
    public static final ClientDataSourceIdentifier A09;
    public static final ClientDataSourceIdentifier A0A;
    public static final ClientDataSourceIdentifier A0B;
    public static final ClientDataSourceIdentifier A0C;
    public static final ClientDataSourceIdentifier A0D;
    public static final ClientDataSourceIdentifier A0E;
    public static final ClientDataSourceIdentifier A0F;
    public static final ClientDataSourceIdentifier A0G;
    public static final ClientDataSourceIdentifier A0H;
    public static final ClientDataSourceIdentifier A0I;
    public static final ClientDataSourceIdentifier A0J;
    public static final ClientDataSourceIdentifier A0K;
    public static final ClientDataSourceIdentifier A0L;
    public static final ClientDataSourceIdentifier A0M;
    public static final ClientDataSourceIdentifier A0N;
    public static final ClientDataSourceIdentifier A0O;
    public static final ClientDataSourceIdentifier A0P;
    public static final ClientDataSourceIdentifier A0Q;
    public static final ClientDataSourceIdentifier A0R;
    public static final ClientDataSourceIdentifier A0S;
    public static final ClientDataSourceIdentifier A0T;
    public static final ClientDataSourceIdentifier A0U;
    public static final ClientDataSourceIdentifier A0V;
    public static final ClientDataSourceIdentifier A0W;
    public static final ClientDataSourceIdentifier A0X;
    public static final ClientDataSourceIdentifier A0Y;
    public static final ClientDataSourceIdentifier A0Z;
    public static final ClientDataSourceIdentifier A0a;
    public static final ClientDataSourceIdentifier A0b;
    public static final ClientDataSourceIdentifier A0c;
    public static final ClientDataSourceIdentifier A0d;
    public static final ClientDataSourceIdentifier A0e;
    public static final ClientDataSourceIdentifier A0f;
    public static final ClientDataSourceIdentifier A0g;
    public static final ClientDataSourceIdentifier A0h;
    public static final ClientDataSourceIdentifier A0i;
    public static final ClientDataSourceIdentifier A0j;
    public static final ClientDataSourceIdentifier A0k;
    public static final ClientDataSourceIdentifier A0l;
    public static final ClientDataSourceIdentifier A0m;
    public static final ClientDataSourceIdentifier A0n;
    public static final ClientDataSourceIdentifier A0o;
    public static final ClientDataSourceIdentifier A0p;
    public static final ClientDataSourceIdentifier A0q;
    public static final ClientDataSourceIdentifier A0r;
    public static final ClientDataSourceIdentifier A0s;
    public static final ClientDataSourceIdentifier A0t;
    public static final ClientDataSourceIdentifier A0u;
    public static final ClientDataSourceIdentifier A0v;
    public static final ClientDataSourceIdentifier A0w;
    public static final ClientDataSourceIdentifier A0x;
    public static final ClientDataSourceIdentifier A0y;
    public static final ClientDataSourceIdentifier A0z;
    public static final Parcelable.Creator CREATOR;
    public final String mLoggingName;

    static {
        ClientDataSourceIdentifier clientDataSourceIdentifier = new ClientDataSourceIdentifier(OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID, 0, "unknown");
        A0y = clientDataSourceIdentifier;
        ClientDataSourceIdentifier clientDataSourceIdentifier2 = new ClientDataSourceIdentifier("NONE", 1, "none");
        A0l = clientDataSourceIdentifier2;
        ClientDataSourceIdentifier clientDataSourceIdentifier3 = new ClientDataSourceIdentifier("OMNISTORE", 2, "local_omnistore");
        A0m = clientDataSourceIdentifier3;
        ClientDataSourceIdentifier clientDataSourceIdentifier4 = new ClientDataSourceIdentifier("OMNISTORE_FUZZY", 3, "local_omnistore_fuzzy");
        A0n = clientDataSourceIdentifier4;
        ClientDataSourceIdentifier clientDataSourceIdentifier5 = new ClientDataSourceIdentifier("THREADS_CACHE", 4, "local_threads_cache");
        A0w = clientDataSourceIdentifier5;
        ClientDataSourceIdentifier clientDataSourceIdentifier6 = new ClientDataSourceIdentifier("TINCAN", 5, "local_tincan");
        A0x = clientDataSourceIdentifier6;
        ClientDataSourceIdentifier clientDataSourceIdentifier7 = new ClientDataSourceIdentifier("ARMADILLO", 6, "local_armadillo");
        A02 = clientDataSourceIdentifier7;
        ClientDataSourceIdentifier clientDataSourceIdentifier8 = new ClientDataSourceIdentifier("WHATSAPP", 7, "local_whatsapp");
        A0z = clientDataSourceIdentifier8;
        ClientDataSourceIdentifier clientDataSourceIdentifier9 = new ClientDataSourceIdentifier("MSYS_CONTACT", 8, "local_msys_contact");
        A0j = clientDataSourceIdentifier9;
        ClientDataSourceIdentifier clientDataSourceIdentifier10 = new ClientDataSourceIdentifier("MSYS_THREADS", 9, "local_msys_threads");
        A0k = clientDataSourceIdentifier10;
        ClientDataSourceIdentifier clientDataSourceIdentifier11 = new ClientDataSourceIdentifier("LOCAL_MSYS_SDK", 10, "local_msys_sdk");
        A0K = clientDataSourceIdentifier11;
        ClientDataSourceIdentifier clientDataSourceIdentifier12 = new ClientDataSourceIdentifier("SEARCH_DB", 11, "local_search_db");
        A0q = clientDataSourceIdentifier12;
        ClientDataSourceIdentifier clientDataSourceIdentifier13 = new ClientDataSourceIdentifier("LOCAL_BLENDED", 12, "local_blended");
        A0J = clientDataSourceIdentifier13;
        ClientDataSourceIdentifier clientDataSourceIdentifier14 = new ClientDataSourceIdentifier("LOCAL_RECENT_SEARCHES", 13, "local_recent_searches");
        A0f = clientDataSourceIdentifier14;
        ClientDataSourceIdentifier clientDataSourceIdentifier15 = new ClientDataSourceIdentifier("LOCAL_SMS", 14, "local_sms");
        A0h = clientDataSourceIdentifier15;
        ClientDataSourceIdentifier clientDataSourceIdentifier16 = new ClientDataSourceIdentifier("QUERY_CACHE", 15, "local_query_cache");
        A0p = clientDataSourceIdentifier16;
        ClientDataSourceIdentifier clientDataSourceIdentifier17 = new ClientDataSourceIdentifier("LOCAL_SEARCH_DB_CLICKSTREAM", 16, "local_search_db_clickstream");
        A0g = clientDataSourceIdentifier17;
        ClientDataSourceIdentifier clientDataSourceIdentifier18 = new ClientDataSourceIdentifier("SERVER_META_AI_TYPE_AHEAD", 17, "server_meta_ai_type_ahead");
        A0s = clientDataSourceIdentifier18;
        ClientDataSourceIdentifier clientDataSourceIdentifier19 = new ClientDataSourceIdentifier("SERVER_META_AI_SEARCH_SNIPPET", 18, "server_meta_ai_search_snippet");
        A0r = clientDataSourceIdentifier19;
        ClientDataSourceIdentifier clientDataSourceIdentifier20 = new ClientDataSourceIdentifier("ENTITIES_NAMED_BLENDED", 19, "server_entities_named_blended");
        A05 = clientDataSourceIdentifier20;
        ClientDataSourceIdentifier clientDataSourceIdentifier21 = new ClientDataSourceIdentifier("ENTITIES_NAMED_SSQ", 20, "server_entities_named_ssq");
        A0B = clientDataSourceIdentifier21;
        ClientDataSourceIdentifier clientDataSourceIdentifier22 = new ClientDataSourceIdentifier("ENTITIES_NAMED_DSQ_PRIMARY", 21, "server_entities_named_dsq1");
        A06 = clientDataSourceIdentifier22;
        ClientDataSourceIdentifier clientDataSourceIdentifier23 = new ClientDataSourceIdentifier("ENTITIES_NAMED_DSQ_SECONDARY", 22, "server_entities_named_dsq2");
        A07 = clientDataSourceIdentifier23;
        ClientDataSourceIdentifier clientDataSourceIdentifier24 = new ClientDataSourceIdentifier("ENTITIES_NAMED_GROUPS", 23, "server_entities_named_groups");
        A08 = clientDataSourceIdentifier24;
        ClientDataSourceIdentifier clientDataSourceIdentifier25 = new ClientDataSourceIdentifier("ENTITIES_NAMED_PAGES", 24, "server_entities_named_pages");
        A0A = clientDataSourceIdentifier25;
        ClientDataSourceIdentifier clientDataSourceIdentifier26 = new ClientDataSourceIdentifier("ENTITIES_NAMED_MORE_PEOPLE", 25, "server_entities_named_more_people");
        A09 = clientDataSourceIdentifier26;
        ClientDataSourceIdentifier clientDataSourceIdentifier27 = new ClientDataSourceIdentifier("OVERALL", 26, "overall");
        A0o = clientDataSourceIdentifier27;
        ClientDataSourceIdentifier clientDataSourceIdentifier28 = new ClientDataSourceIdentifier("LOCAL_ALL_CHATS", 27, "local_all_chats");
        A0D = clientDataSourceIdentifier28;
        ClientDataSourceIdentifier clientDataSourceIdentifier29 = new ClientDataSourceIdentifier("LOCAL_ALL_CONTACTS", 28, "local_all_contacts");
        A0E = clientDataSourceIdentifier29;
        ClientDataSourceIdentifier clientDataSourceIdentifier30 = new ClientDataSourceIdentifier("LOCAL_ALL_SMS", 29, "local_all_sms");
        A0I = clientDataSourceIdentifier30;
        ClientDataSourceIdentifier clientDataSourceIdentifier31 = new ClientDataSourceIdentifier("LOCAL_ALL_GROUPS", 30, "local_all_groups");
        A0F = clientDataSourceIdentifier31;
        ClientDataSourceIdentifier clientDataSourceIdentifier32 = new ClientDataSourceIdentifier("LOCAL_ALL_NON_CONTACT_USERS", 31, "local_all_non_contact_users");
        A0G = clientDataSourceIdentifier32;
        ClientDataSourceIdentifier clientDataSourceIdentifier33 = new ClientDataSourceIdentifier("LOCAL_ALL_PAGES", 32, "local_all_pages");
        A0H = clientDataSourceIdentifier33;
        ClientDataSourceIdentifier clientDataSourceIdentifier34 = new ClientDataSourceIdentifier("LOCAL_NULL_STATE_RECENTS", 33, "local_null_state_recents");
        A0X = clientDataSourceIdentifier34;
        ClientDataSourceIdentifier clientDataSourceIdentifier35 = new ClientDataSourceIdentifier("LOCAL_NULL_STATE_SUGGESTIONS", 34, "local_null_state_suggestions");
        A0c = clientDataSourceIdentifier35;
        ClientDataSourceIdentifier clientDataSourceIdentifier36 = new ClientDataSourceIdentifier("LOCAL_NULL_STATE_INSTAGRAM_USERS", 35, "local_null_state_instagram_users");
        A0T = clientDataSourceIdentifier36;
        ClientDataSourceIdentifier clientDataSourceIdentifier37 = new ClientDataSourceIdentifier("LOCAL_NULL_STATE_GROUP_CHATS", 36, "local_null_state_group_chats");
        A0S = clientDataSourceIdentifier37;
        ClientDataSourceIdentifier clientDataSourceIdentifier38 = new ClientDataSourceIdentifier("LOCAL_NULL_STATE_COMMUNITY_THREADS", 37, "local_null_state_community_threads");
        A0O = clientDataSourceIdentifier38;
        ClientDataSourceIdentifier clientDataSourceIdentifier39 = new ClientDataSourceIdentifier("LOCAL_NULL_STATE_DISCOVER_PEOPLE", 38, "local_null_state_people");
        A0R = clientDataSourceIdentifier39;
        ClientDataSourceIdentifier clientDataSourceIdentifier40 = new ClientDataSourceIdentifier("LOCAL_NULL_STATE_DISCOVER_CHANNELS", 39, "local_null_state_discover_channels");
        A0P = clientDataSourceIdentifier40;
        ClientDataSourceIdentifier clientDataSourceIdentifier41 = new ClientDataSourceIdentifier("LOCAL_NULL_STATE_DISCOVER_COMMUNITIES", 40, "local_null_state_discover_communities");
        A0Q = clientDataSourceIdentifier41;
        ClientDataSourceIdentifier clientDataSourceIdentifier42 = new ClientDataSourceIdentifier("LOCAL_NULL_STATE_AI_BOTS", 41, "local_null_state_ai_bots");
        A0M = clientDataSourceIdentifier42;
        ClientDataSourceIdentifier clientDataSourceIdentifier43 = new ClientDataSourceIdentifier("LOCAL_NULL_STATE_AI_AGENT_PROMPTS", 42, "local_null_state_ai_agent_prompts");
        A0L = clientDataSourceIdentifier43;
        ClientDataSourceIdentifier clientDataSourceIdentifier44 = new ClientDataSourceIdentifier("LOCAL_NULL_STATE_RECOMMENDED_FOR_YOU", 43, "local_null_state_recommended_for_you");
        A0Y = clientDataSourceIdentifier44;
        ClientDataSourceIdentifier clientDataSourceIdentifier45 = new ClientDataSourceIdentifier("LOCAL_NULL_STATE_YOUR_CHANNELS", 44, "local_null_state_your_channels");
        A0d = clientDataSourceIdentifier45;
        ClientDataSourceIdentifier clientDataSourceIdentifier46 = new ClientDataSourceIdentifier("LOCAL_NULL_STATE_SUGGESTED_CHANNELS", 45, "local_null_state_suggested_channels");
        A0b = clientDataSourceIdentifier46;
        ClientDataSourceIdentifier clientDataSourceIdentifier47 = new ClientDataSourceIdentifier("LOCAL_NULL_STATE_MEDIA", 46, "local_null_state_media");
        A0U = clientDataSourceIdentifier47;
        ClientDataSourceIdentifier clientDataSourceIdentifier48 = new ClientDataSourceIdentifier("LOCAL_NULL_STATE_PINNED_MESSAGES", 47, "local_null_state_pinned_messages");
        A0W = clientDataSourceIdentifier48;
        ClientDataSourceIdentifier clientDataSourceIdentifier49 = new ClientDataSourceIdentifier("LOCAL_NULL_STATE_SUGGESTED_BROADCAST_CHANNELS_CHANNELS_TAB", 48, "local_null_state_suggested_broadcast_channels_channels_tab");
        A0a = clientDataSourceIdentifier49;
        ClientDataSourceIdentifier clientDataSourceIdentifier50 = new ClientDataSourceIdentifier("LOCAL_NULL_STATE_YOUR_CHANNELS_CHANNELS_TAB", 49, "local_null_state_your_channels_channels_tab");
        A0e = clientDataSourceIdentifier50;
        ClientDataSourceIdentifier clientDataSourceIdentifier51 = new ClientDataSourceIdentifier("LOCAL_NULL_STATE_RECOMMENDED_FOR_YOU_CHANNELS_TAB", 50, "local_null_state_recommended_for_you_channels_tab");
        A0Z = clientDataSourceIdentifier51;
        ClientDataSourceIdentifier clientDataSourceIdentifier52 = new ClientDataSourceIdentifier("LOCAL_NULL_STATE_CHATS_IN_YOUR_COMMUNITIES_CHANNELS_TAB", 51, "local_null_state_chats_in_your_communities_channels_tab");
        A0N = clientDataSourceIdentifier52;
        ClientDataSourceIdentifier clientDataSourceIdentifier53 = new ClientDataSourceIdentifier("LOCAL_NULL_STATE_PEOPLE_YOU_MAY_KNOW", 52, "local_null_state_people_you_may_know");
        A0V = clientDataSourceIdentifier53;
        ClientDataSourceIdentifier clientDataSourceIdentifier54 = new ClientDataSourceIdentifier("MESSAGE_SEARCH_ENTRYPOINT", 53, "message_search_entrypoint");
        A0i = clientDataSourceIdentifier54;
        ClientDataSourceIdentifier clientDataSourceIdentifier55 = new ClientDataSourceIdentifier("GLOBAL_SEARCH_ENTRYPOINT", 54, "global_search_entrypoint");
        A0C = clientDataSourceIdentifier55;
        ClientDataSourceIdentifier clientDataSourceIdentifier56 = new ClientDataSourceIdentifier("EMPLOYEE_ONLY_SERVER_VC_ENDPOINTS", 55, "server_vc_endpoints");
        A04 = clientDataSourceIdentifier56;
        ClientDataSourceIdentifier clientDataSourceIdentifier57 = new ClientDataSourceIdentifier("EMPLOYEE_ONLY_SERVER_INTERNAL_BOTS", 56, "server_internal_bots");
        A03 = clientDataSourceIdentifier57;
        ClientDataSourceIdentifier clientDataSourceIdentifier58 = new ClientDataSourceIdentifier("SERVER_MQTT_BLENDED_RESULTS", 57, "server_mqtt_blended_results");
        A0t = clientDataSourceIdentifier58;
        ClientDataSourceIdentifier clientDataSourceIdentifier59 = new ClientDataSourceIdentifier("SERVER_MQTT_CONTACTS", 58, "server_mqtt_contacts");
        A0u = clientDataSourceIdentifier59;
        ClientDataSourceIdentifier clientDataSourceIdentifier60 = new ClientDataSourceIdentifier("SERVER_MSYS_NON_SDK", 59, "server_msys_non_sdk");
        A0v = clientDataSourceIdentifier60;
        ClientDataSourceIdentifier[] clientDataSourceIdentifierArr = new ClientDataSourceIdentifier[60];
        System.arraycopy(new ClientDataSourceIdentifier[]{clientDataSourceIdentifier, clientDataSourceIdentifier2, clientDataSourceIdentifier3, clientDataSourceIdentifier4, clientDataSourceIdentifier5, clientDataSourceIdentifier6, clientDataSourceIdentifier7, clientDataSourceIdentifier8, clientDataSourceIdentifier9, clientDataSourceIdentifier10, clientDataSourceIdentifier11, clientDataSourceIdentifier12, clientDataSourceIdentifier13, clientDataSourceIdentifier14, clientDataSourceIdentifier15, clientDataSourceIdentifier16, clientDataSourceIdentifier17, clientDataSourceIdentifier18, clientDataSourceIdentifier19, clientDataSourceIdentifier20, clientDataSourceIdentifier21, clientDataSourceIdentifier22, clientDataSourceIdentifier23, clientDataSourceIdentifier24, clientDataSourceIdentifier25, clientDataSourceIdentifier26, clientDataSourceIdentifier27}, 0, clientDataSourceIdentifierArr, 0, 27);
        System.arraycopy(new ClientDataSourceIdentifier[]{clientDataSourceIdentifier28, clientDataSourceIdentifier29, clientDataSourceIdentifier30, clientDataSourceIdentifier31, clientDataSourceIdentifier32, clientDataSourceIdentifier33, clientDataSourceIdentifier34, clientDataSourceIdentifier35, clientDataSourceIdentifier36, clientDataSourceIdentifier37, clientDataSourceIdentifier38, clientDataSourceIdentifier39, clientDataSourceIdentifier40, clientDataSourceIdentifier41, clientDataSourceIdentifier42, clientDataSourceIdentifier43, clientDataSourceIdentifier44, clientDataSourceIdentifier45, clientDataSourceIdentifier46, clientDataSourceIdentifier47, clientDataSourceIdentifier48, clientDataSourceIdentifier49, clientDataSourceIdentifier50, clientDataSourceIdentifier51, clientDataSourceIdentifier52, clientDataSourceIdentifier53, clientDataSourceIdentifier54}, 0, clientDataSourceIdentifierArr, 27, 27);
        System.arraycopy(new ClientDataSourceIdentifier[]{clientDataSourceIdentifier55, clientDataSourceIdentifier56, clientDataSourceIdentifier57, clientDataSourceIdentifier58, clientDataSourceIdentifier59, clientDataSourceIdentifier60}, 0, clientDataSourceIdentifierArr, 54, 6);
        A01 = clientDataSourceIdentifierArr;
        CREATOR = new 82M(81);
        A00 = values();
    }

    public ClientDataSourceIdentifier(String str, int i, String str2) {
        this.mLoggingName = str2;
    }

    public static ClientDataSourceIdentifier A00(String str) {
        ClientDataSourceIdentifier clientDataSourceIdentifier;
        ClientDataSourceIdentifier[] clientDataSourceIdentifierArr = A00;
        int length = clientDataSourceIdentifierArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                0fH.A0k("DataSourceIdentifier", "Unknown data source type!");
                clientDataSourceIdentifier = A0y;
                break;
            }
            clientDataSourceIdentifier = clientDataSourceIdentifierArr[i2];
            if (1JF.A0C(str, clientDataSourceIdentifier.mLoggingName)) {
                break;
            }
            i = i2 + 1;
        }
        return clientDataSourceIdentifier;
    }

    public static DataSourceIdentifier A01(DK3 dk3) {
        if (dk3 instanceof Cpe) {
            return new FreeFormDataSourceIdentifier(dk3.Aus());
        }
        if (!(dk3 instanceof BP6)) {
            0fH.A0k("DataSourceIdentifier", "Null section type!");
            return A0y;
        }
        switch (((BP6) dk3).ordinal()) {
            case 0:
                return A05;
            case 1:
                return A0B;
            case 2:
                return A06;
            case 3:
                return A07;
            case 4:
                return A0p;
            case 5:
                return A0t;
            case 6:
                return A0J;
            case 7:
            case 9:
            case 14:
            case 16:
            case 20:
            default:
                0fH.A14("DataSourceIdentifier", "Unknown data source type: %s", new Object[]{dk3});
                return A0y;
            case 8:
            case 22:
            case 24:
            case 25:
            case 26:
            case 27:
                return A0m;
            case 10:
            case 28:
                return A0w;
            case 11:
                return A08;
            case 12:
                return A03;
            case 13:
                return A09;
            case 15:
                return A0A;
            case 17:
                return A0x;
            case 18:
                return A04;
            case 19:
                return A0l;
            case 21:
                return A0h;
            case 23:
                return A0f;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
    
        if (((com.facebook.messaging.search.constants.ClientDataSourceIdentifier) r301).mLoggingName.startsWith("local_") == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A02(com.facebook.messaging.search.constants.DataSourceIdentifier r301) {
        /*
            r0 = r301
            boolean r0 = r0 instanceof com.facebook.messaging.search.constants.ClientDataSourceIdentifier
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L21
            r0 = r301
            com.facebook.messaging.search.constants.ClientDataSourceIdentifier r0 = (com.facebook.messaging.search.constants.ClientDataSourceIdentifier) r0
            java.lang.String r0 = r0.mLoggingName
            r301 = r0
            java.lang.String r0 = "local_"
            r303 = r0
            r0 = r301
            r1 = r303
            boolean r0 = r0.startsWith(r1)
            r304 = r0
            r0 = 1
            r302 = r0
            r0 = r304
            if (r0 != 0) goto L25
        L21:
            r0 = 0
            r302 = r0
            r0 = 0
            r303 = r0
        L25:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.search.constants.ClientDataSourceIdentifier.A02(com.facebook.messaging.search.constants.DataSourceIdentifier):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
    
        if (((com.facebook.messaging.search.constants.ClientDataSourceIdentifier) r301).mLoggingName.startsWith("server_") == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A03(com.facebook.messaging.search.constants.DataSourceIdentifier r301) {
        /*
            r0 = r301
            boolean r0 = r0 instanceof com.facebook.messaging.search.constants.ClientDataSourceIdentifier
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L21
            r0 = r301
            com.facebook.messaging.search.constants.ClientDataSourceIdentifier r0 = (com.facebook.messaging.search.constants.ClientDataSourceIdentifier) r0
            java.lang.String r0 = r0.mLoggingName
            r301 = r0
            java.lang.String r0 = "server_"
            r303 = r0
            r0 = r301
            r1 = r303
            boolean r0 = r0.startsWith(r1)
            r304 = r0
            r0 = 1
            r302 = r0
            r0 = r304
            if (r0 != 0) goto L25
        L21:
            r0 = 0
            r302 = r0
            r0 = 0
            r303 = r0
        L25:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.search.constants.ClientDataSourceIdentifier.A03(com.facebook.messaging.search.constants.DataSourceIdentifier):boolean");
    }

    public static ClientDataSourceIdentifier valueOf(String str) {
        return (ClientDataSourceIdentifier) Enum.valueOf(ClientDataSourceIdentifier.class, str);
    }

    public static ClientDataSourceIdentifier[] values() {
        return (ClientDataSourceIdentifier[]) A01.clone();
    }

    @Override // X.C4zn
    public String Aus() {
        return this.mLoggingName;
    }

    @Override // X.C4zo
    public String BFN() {
        int ordinal = ordinal();
        return (ordinal != 5 ? ordinal != 6 ? C6pc.OPEN : C6pc.ARMADILLO : C6pc.TINCAN).loggingName;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mLoggingName);
    }
}
