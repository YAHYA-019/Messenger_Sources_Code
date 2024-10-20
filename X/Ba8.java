package X;

/* loaded from: Ba8.class */
public abstract class Ba8 {
    public static final 1G9 A00;
    public static final 1G9 A01;
    public static final 1G9 A02;
    public static final 1G9 A03;
    public static final 1G9 A04;
    public static final 1G9 A05;
    public static final 1G9 A06;
    public static final 1G9 A07;

    static {
        1G9 r0 = 1NK.A5T;
        1G9 A0F = r0.A0F("speakeasy/");
        A07 = A0F;
        1G9 A0F2 = r0.A0F("meetup/");
        A06 = A0F2;
        A00 = A0F.A0F("interested_room_ids");
        A04 = A0F2.A0F("nux_seen/");
        A02 = A0F2.A0F("meetup_create_deeplink_legal_disclaimer_shown_count/");
        A01 = A0F2.A0F("meetup_choose_topic_legal_disclaimer_shown_count/");
        A03 = A0F2.A0F("meetup_invite_to_room_singlestep_legal_disclaimer_show_count");
        A05 = A0F2.A0F("meetup_should_show_end_call_scheduling_screen");
    }
}
