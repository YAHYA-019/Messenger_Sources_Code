package X;

import com.facebook.acra.constants.ActionId;

/* renamed from: X.0p4, reason: invalid class name */
/* loaded from: 0p4.class */
public abstract class C0p4 {
    public static String A00(int i) {
        if (i == 25) {
            return "COMPOSER_COMPOSER_NEW_MODEL_BUILDER";
        }
        if (i == 26) {
            return "COMPOSER_COMPOSER_INLINE_MEDIA_PICKER_VISIBLE";
        }
        if (i == 29) {
            return "COMPOSER_INLINE_COMPOSER_LAUNCH_TRIGGER";
        }
        if (i == 30) {
            return "COMPOSER_CS_ALBUM_LIST_TTI";
        }
        switch (i) {
            case 2:
                return "COMPOSER_PHOTO_LOAD";
            case 39:
                return "COMPOSER_COMPOSER_CONTENT_READY_FROM_NEWSFEED";
            case 41:
                return "COMPOSER_COMPOSER_CUSTOM_FONT_FETCH";
            case 43:
                return "COMPOSER_COMPOSER_CONTENT_READY_FROM_UI";
            case 1094:
                return "COMPOSER_GEMINI_FORMATTING_ACTIONS";
            case 1589:
                return "COMPOSER_CAMERA_ROLL_INTERACTIONS";
            case 2732:
                return "COMPOSER_COMPOSER_MEDIA_CREATE_CURSOR";
            case 3553:
                return "COMPOSER_INTERACTION";
            case 7698:
                return "COMPOSER_COMPOSER_POST_FCR";
            case 11038:
                return "COMPOSER_COMPOSER_MUTATION";
            case 12414:
                return "COMPOSER_CREATOR_COMPOSER_TTRC";
            default:
                switch (i) {
                    case 13:
                        return "COMPOSER_LIFE_EVENT_FETCH_BIRTHDAY";
                    case 14:
                        return "COMPOSER_TEENS_SHARESHEET_FETCH_GROUPS";
                    case 15:
                        return "COMPOSER_COMPOSER_REFERRER_HANDOFF";
                    case 16:
                        return "COMPOSER_COMPOSER_FRAGMENT_ONCREATE";
                    case 17:
                        return "COMPOSER_COMPOSER_LAUNCH_PHASE";
                    case 18:
                        return "COMPOSER_COMPOSER_DEPENDENCY_INJECTION";
                    case 19:
                        return "COMPOSER_COMPOSER_RENDER_MARKER";
                    case 20:
                        return "COMPOSER_COMPOSER_DRAW_MARKER";
                    case 21:
                        return "COMPOSER_COMPOSER_FRAGMENT_SETUP";
                    case 22:
                        return "COMPOSER_COMPOSER_FRAGMENT_CREATE_VIEW";
                    default:
                        switch (i) {
                            case ActionId.ON_START_END /* 47 */:
                                return "COMPOSER_COMPOSER_LAUNCH_TTI";
                            case ActionId.QUEUED /* 48 */:
                                return "COMPOSER_STORIES_COMPOSER_LAUNCH";
                            case ActionId.IN_PROGRESS /* 49 */:
                                return "COMPOSER_STORIES_COMPOSER_LAUNCH_TTI";
                            case 50:
                                return "COMPOSER_STORIES_COMPOSER_CONTENT_READY";
                            case ActionId.UNKNOWN /* 51 */:
                                return "COMPOSER_FEED_COMPOSER_CONTENT_READY";
                            default:
                                return "UNDEFINED_QPL_EVENT";
                        }
                }
        }
    }
}
