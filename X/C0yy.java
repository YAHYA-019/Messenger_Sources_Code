package X;

import com.facebook.acra.constants.ActionId;

/* renamed from: X.0yy, reason: invalid class name */
/* loaded from: 0yy.class */
public abstract class C0yy {
    public static String A00(int i) {
        switch (i) {
            case 1:
                return "PAGES_FB4A_ADMINED_FIRST_POSTS_BY_OTHERS_STORIES";
            case ActionId.ON_VIEW_CREATED_END /* 101 */:
                return "PAGES_PAGES_PROFILE_PIC_LOAD";
            case ActionId.CARD_DATA_LOADED /* 122 */:
                return "PAGES_PAGE_HEADER_FETCH";
            case 125:
                return "PAGES_PAGE_SURFACE_FIRST_CARD";
            case 128:
                return "PAGES_PAGE_HEADER_LOAD";
            case ActionId.ACTIVITY_RESUME /* 143 */:
                return "PAGES_PAGE_EARLY_FETCHER_PREPARE";
            case ActionId.ACTIVITY_START /* 144 */:
                return "PAGES_PAGE_SURFACE_BATCH_CARD_DATA_LOADED";
            case ActionId.END_START_ACTIVITY /* 146 */:
                return "PAGES_CS_PROMOTIONS_HUB_TTI";
            case ActionId.FILE_SYSTEM_FAIL /* 147 */:
                return "PAGES_CS_POST_SELECTOR_TTI";
            case 150:
                return "PAGES_PAGES_SURFACE_HEADER_LOAD";
            case ActionId.APPLY_FINISHED_LIST /* 153 */:
                return "PAGES_PAGE_TAB_LOADING_TTI_ANDROID";
            case ActionId.FAIL_FILE_TOO_LARGE /* 159 */:
                return "PAGES_PAGES_ANDROID_TTRC";
            case ActionId.DISPLAYED /* 165 */:
                return "PAGES_NT_PAGE_INFO";
            case ActionId.ASYNC_ACTION_SUCCESS /* 167 */:
                return "PAGES_RN_PROMOTIONS_HUB_TTI";
            case ActionId.CONNECTIVITY_CHANGED /* 169 */:
                return "PAGES_PAGES_TAB_TTRC";
            case ActionId.VIDEO_DISPLAYED /* 170 */:
                return "PAGES_PAGES_ANDROID_PAGINATION_TAILLOAD";
            case 9393:
                return "PAGES_UNSUPPORTED_TABS";
            default:
                return "UNDEFINED_QPL_EVENT";
        }
    }
}
