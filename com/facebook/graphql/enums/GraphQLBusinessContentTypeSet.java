package com.facebook.graphql.enums;

import X.1BK;
import X.DKF;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import java.util.HashSet;
import java.util.Set;

/* loaded from: GraphQLBusinessContentTypeSet.class */
public final class GraphQLBusinessContentTypeSet {
    public static final HashSet A00;

    static {
        String[] strArr = new String[51];
        A00 = DKF.A0w(new String[]{"MULTI_VIDEO", "NOTE", "OFFER", "PHOTO_SET", "PHOTO_STORY", "PRODUCT_ITEM", "PROFILE_PHOTO", "QUESTION", "REEL", "SATP", "SATP_STORY", "SHOP_NOW", "SINGLE_IMAGE", "SINGLE_SHARE", "SINGLE_VIDEO", "STORY", "TEXT", "THREAD", OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID, "VIDEO_CLIP", "VIDEO_STORY", "WAS_LIVE_STORY", "WATCH_PARTY", "WEBVIEW"}, strArr, 1BK.A1W(new String[]{"AB_TEST", "ALBUM", "ALBUM_PHOTO", "AUDIO", "BUNDLE", "CANVAS_POST", "COLLECTION", "COVER_PHOTO", "DOC", "EVENT", "FB_SHORTS_VIDEO", "FILE", "GET_MESSAGE", "GET_WHATSAPP_MESSAGE", "JOB_OPENING", "LEARNING_MODULE", "LEARNING_QUIZ", "LEARN_MORE", "LIFE_EVENT", "LINK", "LIVE_STORY", "LIVE_VIDEO", "MESSAGE_MARKETING_CAMPAIGN", "MONTHLY_ACTIVE_CARD", "MULTI_IMAGE", "MULTI_MEDIA", "MULTI_SHARES"}, strArr) ? 1 : 0, 27, 24);
    }

    public static final Set getSet() {
        return A00;
    }
}
