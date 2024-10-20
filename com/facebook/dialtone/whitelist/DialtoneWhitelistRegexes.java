package com.facebook.dialtone.whitelist;

import X.1BK;
import X.1BQ;
import X.1CO;
import X.AbI;
import X.AbJ;
import X.AnonymousClass001;
import X.AnonymousClass244;
import X.C00i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: DialtoneWhitelistRegexes.class */
public final class DialtoneWhitelistRegexes {
    public static final List A05;
    public static final List A06;
    public static final List A07;
    public static final List A08;
    public static final List A09;
    public 1CO A01;
    public AnonymousClass244 A02;
    public final C00i A03;
    public final Map A04 = AnonymousClass001.A0u();
    public long A00 = 0;

    static {
        String[] strArr = new String[48];
        boolean A1W = 1BK.A1W(new String[]{"thumbnail", "map", "about", "privacy", "small_photo", "stories_background", "search", "search_typeahead", "bookmarks", "event_dashboard", "event_suggestions", "event_subscriptions", "page_events_list", "event_profile_pic", "composer", "inline_composer", "InlineComposerProfileComponentSpec", "notifications_view", "dbl", "reaction_dialog", "attachment_icon", "iorg_common", "qr_code", "feed_awesomizer", "creative_editing_in_composer", "bookmark_item_icon", "app_icon_image"}, strArr);
        System.arraycopy(new String[]{"notification_image", "NotificationsComponentSpec", "life_event_icon", "preview", "iorg_image_view", "attachment_profile_image", ".*megaphone_.*", "fbui_content_view_thumbnail", "map_url_image", "new_place_creation", "group_admin_cog_icon", "landing", "add_member", "GroupsTargetedTabGroupListItemThumbnail", "messenger_image", "qp_image", "fresco_impl", "zero_optin_interstitial", "dialtone_optin_interstitial", "lightswitch_optin_interstitial", "effects_bottom_tray_in_stories"}, A1W ? 1 : 0, strArr, 27, 21);
        A07 = Arrays.asList(strArr);
        A05 = Arrays.asList("video_cover_image", "inline_video_cover_image", "page_identity_video", "reaction_dialog_videos");
        String[] strArr2 = new String[31];
        System.arraycopy(new String[]{"^/follow/feedsources.*", "^/ads/preference.*", "^/settings.*", "^/help/android-app.*", "^/\\d.*/allactivity.*", "^(https?|ftp|file)://(.*).facebook.com(.*)privacy/.*", "^/about/privacy.*", "^(https?|ftp|file)://(.*).facebook.com(.*)policies/.*", "^/about/basics/.*", "https://m.facebook.com/help/contact/.*", "^/report.*", "^(https?|ftp|file)://(.*).facebook.com(.*)terms/.*", "^/trust.*", "^/policy.*", "^(https?|ftp|file)://(.*).facebook.com(.*)communitystandards/.*", "^/ad_guidelines.*", "^/page_guidelines.*", "^/payments_terms.*", "^/help.*", "^/pages/create.*", "https://m.facebook.com/groups/create/.*", "^/invite/history.*", "https://(www|m).facebook.com/safetycheck.*", "^(https://m.facebook.com)?/zero/toggle/settings($|\\?.*$|/.*$)", "https://(www|m).facebook.com/events/birthdays.*", "https://m.facebook.com/.*/about.*", "https://m.facebook.com/timeline/app_section/.*"}, A1W ? 1 : 0, strArr2, A1W ? 1 : 0, 27);
        System.arraycopy(new String[]{"^/allactivity/options\\?id=.*", "^https://m.facebook.com/a/approval_queue/.*", "^/survey.*", "^/legal/thirdpartynotices"}, A1W ? 1 : 0, strArr2, 27, 4);
        A06 = Arrays.asList(strArr2);
        A08 = Arrays.asList("^(https?)://(m-|z-m-|z-1-|z-n-|)static\\.(ak|xx)\\.fbcdn\\.net/rsrc\\.php($|\\?.*$|/.*$)", "^file:/.*", "^res:/.*", "^(https?)://z-m.*t[^/-]+\\.2200-6.*", "^https://www.facebook.com/images/assets_DO_NOT_HARDCODE/facebook_operator_services_zero_rating_education_ui/.*", "^(https?)://www.facebook.com/profile/pic.php.*", ".*143086968_2856368904622192_1959732218791162458_n.png.*");
        A09 = Arrays.asList("^.*xx.fbcdn.net\\/safe_image.php?.*w=(\\d+)&h=(\\d+).*", "$1", "$2", "^.*xx.fbcdn.net(\\/.+)*((\\/s|\\/p)(\\d+)x(\\d+))(\\/.+)*?.*", "$4", "$5");
    }

    public DialtoneWhitelistRegexes() {
        1BQ A01 = 1BQ.A01();
        AnonymousClass244 A0s = AbI.A0s();
        1CO A0e = AbJ.A0e();
        this.A03 = A01;
        this.A02 = A0s;
        this.A01 = A0e;
    }

    public static ArrayList A00(Collection collection) {
        ArrayList A0t = AnonymousClass001.A0t(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            A0t.add(Pattern.compile(AnonymousClass001.A0i(it), 2));
        }
        return A0t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x00ab, code lost:
    
        if (r317 == null) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v84, types: [com.google.common.collect.ImmutableCollection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.common.collect.ImmutableSet A01(X.ENm r302) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.dialtone.whitelist.DialtoneWhitelistRegexes.A01(X.ENm):com.google.common.collect.ImmutableSet");
    }
}
