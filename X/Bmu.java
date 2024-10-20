package X;

/* loaded from: Bmu.class */
public final class Bmu {
    public final Integer A00;
    public final String A01;

    public Bmu(String str, String str2) {
        this.A01 = str2;
        Integer num = 0S2.A00;
        if (!1JF.A0C(str, "messages")) {
            num = 0S2.A01;
            if (!1JF.A0C(str, "discover_cap")) {
                num = 0S2.A0N;
                if (!1JF.A0C(str, "groups_cap")) {
                    num = 0S2.A0C;
                    if (!1JF.A0C(str, "channels_cap")) {
                        num = 0S2.A0Y;
                        if (!1JF.A0C(str, "people_cap")) {
                            num = 0S2.A0j;
                            if (!1JF.A0C(str, "ig_followings_cap")) {
                                num = 0S2.A0u;
                                if (!1JF.A0C(str, "ig_non_followings_cap")) {
                                    num = 0S2.A15;
                                    if (!1JF.A0C(str, "ai_bots_cap")) {
                                        num = 0S2.A1G;
                                        if (!1JF.A0C(str, "suggested_communities_cap")) {
                                            num = 0S2.A1J;
                                            if (!1JF.A0C(str, "media_qs_cap")) {
                                                num = 0S2.A02;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.A00 = num;
    }
}
