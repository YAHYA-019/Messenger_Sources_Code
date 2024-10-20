package X;

import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: BP6.class */
public final class BP6 implements DK3 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ BP6[] A01;
    public static final BP6 A02;
    public static final BP6 A03;
    public static final BP6 A04;
    public static final BP6 A05;
    public static final BP6 A06;
    public static final BP6 A07;
    public static final BP6 A08;
    public static final BP6 A09;
    public static final BP6 A0A;
    public static final BP6 A0B;
    public static final BP6 A0C;
    public static final BP6 A0D;
    public static final BP6 A0E;
    public static final BP6 A0F;
    public static final BP6 A0G;
    public static final BP6 A0H;
    public static final BP6 A0I;
    public static final BP6 A0J;
    public static final BP6 A0K;
    public static final BP6 A0L;
    public static final BP6 A0M;
    public static final BP6 A0N;
    public static final BP6 A0O;
    public static final BP6 A0P;
    public static final BP6 A0Q;
    public static final BP6 A0R;
    public static final BP6 A0S;
    public static final BP6 A0T;
    public static final BP6 A0U;
    public static final BP6 A0V;
    public static final BP6 A0W;
    public static final BP6 A0X;
    public static final BP6 A0Y;
    public static final BP6 A0Z;
    public final boolean _isNullState;
    public final String _loggingName;

    static {
        BP6 bp6 = new BP6("BLENDED", "blended", 0, false);
        A02 = bp6;
        BP6 A002 = A00("SINGLE_SERVER_QUERY", "server_single_query", 1, false);
        A0U = A002;
        BP6 A003 = A00("DOUBLE_SERVER_QUERY_PRIMARY", "server_double_query1", 2, false);
        A07 = A003;
        BP6 A004 = A00("DOUBLE_SERVER_QUERY_SECONDARY", "server_double_query2", 3, false);
        A08 = A004;
        BP6 A005 = A00("BLENDED_SERVER_CACHE", "blended_server_cache", 4, false);
        A04 = A005;
        BP6 A006 = A00("MQTT_BLENDED_SERVER_QUERY", "mqtt_blended_server_query", 5, false);
        A0I = A006;
        BP6 A007 = A00("BLENDED_LOCAL", "local_blended", 6, false);
        A03 = A007;
        BP6 A008 = A00("WORKPLACE_BOTS", "workplace_bots", 7, false);
        A0Z = A008;
        BP6 A009 = A00("FRIENDS", "friends", 8, false);
        A0B = A009;
        BP6 A0010 = A00("GROUPS", "groups", 9, false);
        A0D = A0010;
        BP6 A0011 = A00("GROUPS_LOCAL", "local_groups", 10, false);
        A0E = A0011;
        BP6 A0012 = A00("GROUPS_SERVER", "server_groups", 11, false);
        A0F = A0012;
        BP6 A0013 = A00("INTERNAL_BOTS", "internal_bots", 12, false);
        A0G = A0013;
        BP6 A0014 = A00("NON_FRIENDS", "non_friends", 13, false);
        A0K = A0014;
        BP6 A0015 = A00("NON_CONTACTS_LOCAL", "local_non_contacts", 14, false);
        A0J = A0015;
        BP6 A0016 = A00("PAGES", "pages", 15, false);
        A0S = A0016;
        BP6 A0017 = A00("PAGES_LOCAL", "local_pages", 16, false);
        A0T = A0017;
        BP6 A0018 = A00("TINCAN", "tincan", 17, false);
        A0W = A0018;
        BP6 A0019 = A00("VC_ENDPOINTS", "vc_endpoints", 18, false);
        A0Y = A0019;
        BP6 A0020 = A00("MESSAGE_SEARCH_ENTRY_POINT", "message_search_entrypoint", 19, false);
        A0H = A0020;
        BP6 A0021 = A00("GLOBAL_SEARCH_ENTRYPOINT", "global_search_entrypoint", 20, false);
        A0C = A0021;
        BP6 A0022 = A00("SMS", "sms", 21, false);
        A0V = A0022;
        BP6 A0023 = A00("NULL_STATE_TOP_PEOPLE", "null_state_top_people", 22, true);
        A0R = A0023;
        BP6 A0024 = A00("NULL_STATE_RECENT_SEARCHES", "null_state_recent_searches", 23, true);
        A0P = A0024;
        BP6 A0025 = A00("NULL_STATE_SUGGESTIONS", "null_state_suggestions", 24, true);
        A0Q = A0025;
        BP6 A0026 = A00("NULL_STATE_INSTAGRAM_CONTACTS", "null_state_instagram_contacts", 25, true);
        A0M = A0026;
        BP6 A0027 = A00("NULL_STATE_INSTAGRAM_FOLLOWINGS", "null_state_instagram_followings", 26, true);
        A0N = A0027;
        BP6 A0028 = A00("NULL_STATE_OMNIPICKER_SUGGESTIONS", "null_state_omnipicker_suggestions", 27, true);
        A0O = A0028;
        BP6 A0029 = A00("NULL_STATE_GROUP_THREADS", "null_state_group_threads", 28, true);
        A0L = A0029;
        BP6 A0030 = A00("EDIT_HISTORY_RECENT_SEARCHES", "edit_history_recent_searches", 29, false);
        A09 = A0030;
        BP6 A0031 = A00("DIVEBAR", "divebar", 30, false);
        A05 = A0031;
        BP6 A0032 = A00("DIVEBAR_FRIENDS_NEARBY", "friends_nearby_divebar_msg", 31, false);
        A06 = A0032;
        BP6 A0033 = A00("FB_GROUP_CHAT_WHITELIST_USERS", "fb_group_chat_whitelist_users", 32, false);
        A0A = A0033;
        BP6 A0034 = A00(OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID, "unknown", 33, false);
        A0X = A0034;
        BP6[] bp6Arr = new BP6[34];
        System.arraycopy(new BP6[]{bp6, A002, A003, A004, A005, A006, A007, A008, A009, A0010, A0011, A0012, A0013, A0014, A0015, A0016, A0017, A0018, A0019, A0020, A0021, A0022, A0023, A0024, A0025, A0026, A0027}, 0, bp6Arr, 0, 27);
        System.arraycopy(new BP6[]{A0028, A0029, A0030, A0031, A0032, A0033, A0034}, 0, bp6Arr, 27, 7);
        A01 = bp6Arr;
        A00 = C00t.A00(bp6Arr);
    }

    public BP6(String str, String str2, int i, boolean z) {
        this._loggingName = str2;
        this._isNullState = z;
    }

    public static BP6 A00(String str, String str2, int i, boolean z) {
        return new BP6(str, str2, i, z);
    }

    public static BP6 valueOf(String str) {
        return (BP6) Enum.valueOf(BP6.class, str);
    }

    public static BP6[] values() {
        return (BP6[]) A01.clone();
    }

    @Override // X.C4zn
    public String Aus() {
        return this._loggingName;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this._loggingName;
    }
}
