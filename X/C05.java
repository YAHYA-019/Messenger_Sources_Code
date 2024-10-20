package X;

/* loaded from: C05.class */
public final class C05 {
    public final 1Br A00 = 1BK.A0D();

    public final void A00(Integer num, String str, String str2, String str3, String str4) {
        String str5;
        11T.A0F(str3, 3);
        1UG A08 = 1BK.A08(1Br.A02(this.A00), 4YT.A00(262));
        if (A08.isSampled()) {
            switch (num.intValue()) {
                case 0:
                    str5 = "SENDER_AVATAR_CREATION_UPSELL_SHOWN";
                    break;
                case 1:
                    str5 = "SENDER_OPT_IN_UPSELL_SHOWN";
                    break;
                case 2:
                    str5 = "FEATURE_ENABLED_FROM_SENDER_OPT_IN_UPSELL";
                    break;
                case 3:
                    str5 = "THREAD_QUICK_REACTION_SET";
                    break;
                case 4:
                    str5 = "AVATAR_HOT_LIKE_SENT";
                    break;
                default:
                    str5 = "AVATAR_HOT_LIKE_FORWARDED";
                    break;
            }
            A08.A7R("action_name", 1BK.A13(str5));
            A08.A7R(MRk.A00(75), str3);
            A08.A7R("hot_like_size", str4);
            A08.A7R("emoji", str);
            A08.A7R("instruction_key_name", str2);
            A08.BZL();
        }
    }
}
