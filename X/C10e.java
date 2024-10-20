package X;

import com.facebook.acra.constants.ActionId;

/* renamed from: X.10e, reason: invalid class name */
/* loaded from: 10e.class */
public abstract class C10e {
    public static String A00(int i) {
        if (i == 25) {
            return "SEARCH_SEARCH_DB_BOOTSTRAP_PREFETCH_LOAD";
        }
        if (i == 26) {
            return "SEARCH_SEARCH_DB_BOOTSTRAP_DELTA_LOAD";
        }
        if (i == 45) {
            return "SEARCH_SERP_TTI";
        }
        if (i == 46) {
            return "SEARCH_FETCH_BOOTSTRAP_KEYWORD_QUERY";
        }
        if (i == 63) {
            return "SEARCH_TYPEAHEAD_KEYPRESS_ANDROID";
        }
        if (i == 64) {
            return "SEARCH_SEARCH_VOYAGER_TOPIC_FEED";
        }
        if (i == 81) {
            return "SEARCH_INTEREST_DEEP_DIVE_PAGINATION";
        }
        if (i == 82) {
            return "SEARCH_INTEREST_DEEP_DIVE_TTRC_FBLITE";
        }
        switch (i) {
            case 12:
                return "SEARCH_KEYWORD_SEARCH_RESULT_PAGE_LOAD";
            case 37:
                return "SEARCH_SERP_SUGGESTIONS_END_TO_END";
            case 43:
                return "SEARCH_SERP_POSTPROCESS";
            case ActionId.QUEUEING_SUCCESS /* 55 */:
                return "SEARCH_SERP_PAGINATION_ANDROID";
            case ActionId.MESSAGE_UPDATE_START /* 57 */:
                return "SEARCH_LITHO_COMPONENT_CREATION_AND_LAYOUT";
            case ActionId.PHOTO_CAPTURED /* 59 */:
                return "SEARCH_NS_TTRC_ANDROID";
            case ActionId.INTERACTION_LOAD_PERMALINK /* 67 */:
                return "SEARCH_CLIENT_INSTANT_SEARCH_ANDROID";
            case ActionId.INTERACTION_LOAD_WEB_VIEW /* 72 */:
                return "SEARCH_FBLITE_SEARCH_SERP_PAGE_2";
            case 2784:
                return "SEARCH_SEARCH_NULL_STATE_WWW";
            case 3660:
                return "SEARCH_META_AI_LLM_PLUGIN";
            case 5273:
                return "SEARCH_META_AI_ATTACHMENT_WWW";
            case 6248:
                return "SEARCH_NS_TTRC_ANDROID_PAGINATION";
            case 6251:
                return "SEARCH_SEARCH_NULLSTATE_TABS_UNEXPECTED_EVENT";
            case 6630:
                return "SEARCH_MARKETPLACE_FEED_TTRC_FBLITE_FROM_SEARCH";
            case 6649:
                return "SEARCH_META_AI_QA_MODULE_E2E";
            case 7671:
                return "SEARCH_SEARCH_TYPEAHEAD_ABANDON_EVENT_LOGGING";
            case 8746:
                return "SEARCH_SEARCH_HISTORY_DELETION_FLOW";
            case 10898:
                return "SEARCH_HASHTAGS_DD_WWW";
            case 11050:
                return "SEARCH_SEARCH_HISTORY_SELECTION_FLOW";
            case 11284:
                return "SEARCH_SEARCH_PROFILE_FLOW";
            case 11485:
                return "SEARCH_PAGES_FEED_TTRC_FBLITE_FROM_SEARCH";
            case 12209:
                return "SEARCH_SEARCH_NULLSTATE_UNEXPECTED_EVENT";
            case 12263:
                return "SEARCH_NS_TTRC_FBLITE";
            case 12418:
                return "SEARCH_SEARCH_TYPEAHEAD_WWW";
            case 13798:
                return "SEARCH_MIDDLE_TIER_E2E";
            case 14407:
                return "SEARCH_SEARCH_NETWORK_MEASUREMENT";
            case 15337:
                return "SEARCH_SERP_PAGINATION_ANDROID_SPLIT";
            case 15983:
                return "SEARCH_SEARCH_ADS_XSHOPPING";
            default:
                switch (i) {
                    case 21:
                        return "SEARCH_NULL_STATE";
                    case 22:
                        return "SEARCH_SEARCH_DB_BOOTSTRAP_LOAD";
                    case 23:
                        return "SEARCH_SEARCH_DB_BOOTSTRAP_FETCH";
                    default:
                        switch (i) {
                            case 50:
                                return "SEARCH_PAGE_SURFACE_INITIAL_LOAD_LATENCY";
                            case ActionId.UNKNOWN /* 51 */:
                                return "SEARCH_SERP_TTRC_ANDROID";
                            case ActionId.RETRY_AFTER_FAILURE /* 52 */:
                                return "SEARCH_TA_TTRC_ANDROID";
                            default:
                                switch (i) {
                                    case ActionId.ACTIVITY_LAUNCHED /* 74 */:
                                        return "SEARCH_SEARCH_VOYAGER_PAGINATION";
                                    case ActionId.ACTIVITY_PAUSED /* 75 */:
                                        return "SEARCH_SERP_TTRC_FBLITE";
                                    case ActionId.ACTIVITY_STARTED /* 76 */:
                                        return "SEARCH_SEARCH_END_TO_END";
                                    case ActionId.ACTIVITY_RESUMED /* 77 */:
                                        return "SEARCH_SEARCH_INTEREST_DEEP_DIVE";
                                    case ActionId.FRAGMENT_CREATED /* 78 */:
                                        return "SEARCH_SEARCH_DB_BOOTSTRAP_PREFETCH_UPDATE";
                                    case ActionId.FRAGMENT_RESUMED /* 79 */:
                                        return "SEARCH_WATCH_SERP_TTRC";
                                    default:
                                        return "UNDEFINED_QPL_EVENT";
                                }
                        }
                }
        }
    }
}
