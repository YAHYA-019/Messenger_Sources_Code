package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.5fl, reason: invalid class name */
/* loaded from: 5fl.class */
public abstract class C5fl {
    public static final java.util.Map A03 = new HashMap() { // from class: X.7x0
        {
            put("chathead_click_collapsed", AnonymousClass539.A0S);
            put("direct_reply_intent", AnonymousClass539.A0u);
            AnonymousClass539 anonymousClass539 = AnonymousClass539.A4p;
            put("forward_longclick", anonymousClass539);
            put("forward_gutter", anonymousClass539);
            put("thread_view_messages_fragment_unknown", AnonymousClass539.A5C);
            put("message_search", AnonymousClass539.A5z);
            put("messenger_montage_reply:reply_context", AnonymousClass539.A5T);
            put("messenger_montage_reply:inbox_thread_list_profile", AnonymousClass539.A5Q);
            put("omni_picker", AnonymousClass539.A5b);
            put("notification", AnonymousClass539.A5X);
            put("messenger_montage_composer:friends_tab", AnonymousClass539.A5N);
            put("messenger_montage_composer:friends_tab_story_and_active_now", AnonymousClass539.A5O);
            put("people_tab_montage_reply", AnonymousClass539.A4c);
            put("friends_tab_active_thread", AnonymousClass539.A4b);
            AnonymousClass539 anonymousClass5392 = AnonymousClass539.A6t;
            put("is_from_fb4a_timeline_message_button", anonymousClass5392);
            put("timeline_message_button", anonymousClass5392);
            put("send_plugin", AnonymousClass539.A6f);
            put("messenger_montage_reply:thread_nav_bar", AnonymousClass539.A5V);
            put(AbE.A00(470), AnonymousClass539.A6x);
            put("hot_like_reply_intent", AnonymousClass539.A5Z);
            put(7zK.A00(317), AnonymousClass539.A4e);
            put("friends_tab_recently_active_trigger", AnonymousClass539.A4d);
            put("contact_manager", AnonymousClass539.A0f);
            put(AbstractC00603o4.A00(546), AnonymousClass539.A5G);
            put("HIGHLIGHTS_TAB_REPLY", AnonymousClass539.A3E);
            put("highlights_tab_thread_view", AnonymousClass539.A3Z);
            put("mdotme", AnonymousClass539.A44);
            put("HIGHLIGHTS_TAB_FEED_INLINE_CONNECTED_CHAT", AnonymousClass539.A3G);
            put("HIGHLIGHTS_TAB_QUICK_REACT_CONNECTED_CHAT", AnonymousClass539.A3P);
            put("HIGHLIGHTS_TAB_FEED_INLINE_LOCAL_EVENT", AnonymousClass539.A3I);
            put("HIGHLIGHTS_TAB_QUICK_REACT_LOCAL_EVENT", AnonymousClass539.A3S);
            put("HIGHLIGHTS_TAB_FEED_INLINE_FRIENDS_UPDATE", AnonymousClass539.A3H);
            put("HIGHLIGHTS_TAB_QUICK_REACT_FRIENDS_UPDATE", AnonymousClass539.A3Q);
            put("HIGHLIGHTS_TAB_FEED_INLINE_BIRTHDAY", AnonymousClass539.A3F);
            put("HIGHLIGHTS_TAB_QUICK_REACT_BIRTHDAY", AnonymousClass539.A3O);
            put("HIGHLIGHTS_TAB_SMART_REPLY_DRAWER_BIRTHDAY", AnonymousClass539.A3X);
            put("HIGHLIGHTS_TAB_FEED_INLINE_NOTE", AnonymousClass539.A3J);
            put("HIGHLIGHTS_TAB_QUICK_REACT_NOTE", AnonymousClass539.A3T);
            put("HIGHLIGHTS_TAB_THREAD_VIEW_LOCAL_EVENT", AnonymousClass539.A3d);
            put("HIGHLIGHTS_TAB_THREAD_VIEW_FRIENDS_UPDATE", AnonymousClass539.A3c);
            put("HIGHLIGHTS_TAB_THREAD_VIEW_BIRTHDAY", AnonymousClass539.A3a);
            put("HIGHLIGHTS_TAB_THREAD_VIEW_NOTE", AnonymousClass539.A3e);
            put("HIGHLIGHTS_TAB_CONNECTED_BROADCAST_CHANNEL_SHARE_SHEET", AnonymousClass539.A3D);
            put("HIGHLIGHTS_TAB_SHARE_SHEET_HOLIDAY_CARD", AnonymousClass539.A3V);
            put(AbE.A00(ActionId.NEW_START_FOUND), AnonymousClass539.A59);
            put("MESSENGER_INBOX_HOLIDAY_CARD_SHARE_SHEET_QP", AnonymousClass539.A5A);
            put("HIGHLIGHTS_TAB_STORIES_TRAY", AnonymousClass539.A3Y);
            put("HIGHLIGHTS_TAB_QUICK_REACT_STORIES_TRAY", AnonymousClass539.A3U);
            put("HIGHLIGHTS_TAB_QUICK_REACT_LIFE_EVENT", AnonymousClass539.A3R);
            put("MEMORIES_HIGHLIGHTS_TAB", AnonymousClass539.A49);
            put("cc_admin_send_message_hint_card", AnonymousClass539.A0M);
            put("cc_member_send_message_hint_card", AnonymousClass539.A0N);
            put("community_invite", AnonymousClass539.A0e);
            put("community_chat_invite", AnonymousClass539.A0d);
            put("AI_HOME_CHAT_WITH_AI", AnonymousClass539.A04);
            put("AI_HOME_INBOX_QP", AnonymousClass539.A0C);
            put("AI_HOME_INBOX_RETENTION_QP", AnonymousClass539.A0D);
            put("AI_AGENT_MESSAGE_SHARE", AnonymousClass539.A02);
            put("AI_HOME_FROM_THREAD_DETAIL", AnonymousClass539.A08);
            put("AI_HOME_FROM_THREAD_HEADER", AnonymousClass539.A09);
            put("AI_HOME_FROM_META_AI_THREAD_DETAIL", AnonymousClass539.A0A);
            put("AI_HOME_FROM_META_AI_THREAD_HEADER", AnonymousClass539.A0B);
            put("AI_HOME_FROM_FB_BOOKMARK", AnonymousClass539.A05);
            put("AI_HOME_FROM_HOME_DRAWER", AnonymousClass539.A06);
            put(7zK.A00(17), AnonymousClass539.A5n);
        }
    };
    public static final Long A02 = Long.valueOf(Long.parseLong("1674434246165228"));
    public static final Long A00 = Long.valueOf(Long.parseLong("1553637598292592"));
    public static final Long A01 = Long.valueOf(Long.parseLong("128950834329188"));

    public static AnonymousClass539 A00(NavigationTrigger navigationTrigger) {
        Long valueOf;
        String str = navigationTrigger.A05;
        if (1BJ.A00(232).equals(str)) {
            if (MRk.A00(19).equals(navigationTrigger.A06)) {
                return AnonymousClass539.A5n;
            }
            String str2 = navigationTrigger.A07;
            if (str2 != null) {
                try {
                    java.util.Map map = (java.util.Map) AnonymousClass243.A00().A0Q(new 7UD(), str2);
                    if (map != null) {
                        24X r0 = (24X) map.get("u");
                        if (r0 != null) {
                            2wD A0F = r0.A0F();
                            if (A0F == 2wD.A09) {
                                String A0I = r0.A0I();
                                if (A0I != null) {
                                    valueOf = Long.valueOf(Long.parseLong(A0I));
                                }
                            } else if (A0F == 2wD.A06) {
                                valueOf = Long.valueOf(r0.A08());
                            }
                            if (valueOf != null) {
                                if (valueOf.equals(A02)) {
                                    return AnonymousClass539.A5I;
                                }
                                if (valueOf.equals(A00)) {
                                    return AnonymousClass539.A5J;
                                }
                                if (valueOf.equals(A01)) {
                                    try {
                                        java.util.Map map2 = (java.util.Map) AnonymousClass243.A00().A0Q(new 7hA(), str2);
                                        if (map2 != null) {
                                            24X r02 = (24X) map2.get("tt");
                                            if (r02 != null && r02.A0F() == 2wD.A06) {
                                                int A04 = r02.A04();
                                                if (Integer.valueOf(A04) != null && A04 == 14) {
                                                    return AnonymousClass539.A6J;
                                                }
                                            }
                                        }
                                    } catch (IOException e) {
                                        0fH.A0p("MessageSendEntryPointConverter", "navigationTrigger extraData json parse fail", e);
                                    }
                                    return AnonymousClass539.A6E;
                                }
                            }
                        }
                    }
                } catch (IOException e2) {
                    0fH.A0p("MessageSendEntryPointConverter", "navigationTrigger extraData json parse fail", e2);
                }
            }
            return AnonymousClass539.A5L;
        }
        return "SEE_ALL_FRAGMENT".equals(str) ? AnonymousClass539.A6K : AnonymousClass539.A6x;
    }

    public static AnonymousClass539 A01(NavigationTrigger navigationTrigger, String str) {
        String str2 = navigationTrigger.A05;
        AnonymousClass539 A002 = A00(navigationTrigger);
        AnonymousClass539 anonymousClass539 = AnonymousClass539.A6x;
        if (A002 == anonymousClass539) {
            if ("montage_and_active_now:an_tray_story_reply".equals(str2)) {
                A002 = AnonymousClass539.A6F;
            } else {
                if ("memory_viewer".equals(str2)) {
                    return navigationTrigger.A01;
                }
                if (AbE.A00(719).equals(str2)) {
                    return navigationTrigger.A02.isEmpty() ? AnonymousClass539.A4k : AnonymousClass539.A4l;
                }
                A002 = (AnonymousClass539) A03.get(str2);
                if (A002 == null) {
                    return ErrorReportingConstants.APP_NAME_KEY.equals(str) ? AnonymousClass539.A5X : "thread_view".equals(str) ? AnonymousClass539.A55 : "NewBroadcastFlow".equals(str) ? AnonymousClass539.A4h : "messenger_montage_viewer".equals(str) ? AnonymousClass539.A5P : 7zK.A00(416).equals(str) ? AnonymousClass539.A6a : anonymousClass539;
                }
            }
        }
        return A002;
    }
}
