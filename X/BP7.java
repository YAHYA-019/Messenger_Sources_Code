package X;

/* loaded from: BP7.class */
public enum BP7 implements AYL {
    POLL(1, "poll"),
    A0F("LIVE_LOCATION", 2132346813, "live_location"),
    PAGE_ABOUT(4, "page_about"),
    SAVED(5, "saved"),
    AGGREGATED_THREAD_VIEW_NOTIFICATIONS(6, "aggregated_thread_view_notifications"),
    ADS_CONTEXT(8, "ads_context"),
    FB_EVENT(9, "fb_event"),
    LIGHTWEIGHT_EVENT(13, "lightweight_event"),
    RATE_TRANSLATION(14, "rate_translation"),
    APPOINTMENT_REMINDER(15, "appointment_reminder"),
    MORE_DRAWER_BROWSE(16, "more_drawer_browse"),
    GAMES_DISCOVERY(17, "games_discovery"),
    ARTICLE_CONTEXT(18, "article_context"),
    SAVE_TO_FAQ(19, "save_to_faq"),
    NOVI(21, "novi"),
    DISAPPEARING_MESSAGE_TIME(22, "disappearing_message_time"),
    WATCH_TOGETHER(23, "watch_together"),
    AUDIO_ROOM_CREATION(24, "audio_room_creation"),
    P2P_PAYMENT(25, "p2p_payment"),
    RESHARE_HUB_GALLERY(26, "reshare_hub_gallery"),
    EVENTS(27, "events"),
    EVENT_RSVP(30, "event_rsvp"),
    C4C_GALLERY(28, "c4c_gallery"),
    ADS_CONTEXT_EXTENDABLE(29, "ads_context_extendable"),
    CREATE_PROMPT(30, "create_prompt");

    public int iconDrawable;
    public int id;
    public String name;

    BP7(String str, int i, String str2) {
        this.id = r303;
        this.name = str2;
        this.iconDrawable = i;
    }

    BP7(int i, String str) {
        this(r302, -1, str);
    }

    public int Apa() {
        return this.iconDrawable;
    }
}
