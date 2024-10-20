package X;

import com.facebook.acra.constants.ActionId;

/* loaded from: C6l.class */
public final class C6l {
    public final C00i A00 = 1BV.A00(68165);

    public void A00(String str, String str2) {
        ((6Ii) this.A00.get()).A05((String) null, str, "messenger_android_door_exchange_creation", str2);
    }

    public void A01(String str, String str2) {
        6Ii r0 = (6Ii) this.A00.get();
        String A00 = DKB.A00(69);
        1UG A08 = 1BK.A08(1Br.A02(r0.A00), "marketplace_structured_communication_impression");
        if (A08.isSampled()) {
            A08.A7R(JQw.A00(20), "MEETING_PLAN");
            A08.A7R(4YT.A00(1507), A00);
            Long l = null;
            A08.A6H("listing_id", (Long) null);
            A08.A7R("surface", "messenger_android_door_exchange_creation");
            A08.A7R("ui_component", str2);
            A08.A7R(4YT.A00(1416), (String) null);
            A08.A7R(4YT.A00(1415), (String) null);
            if (str != null) {
                l = 1BK.A0n(str);
            }
            A08.A6H(4YT.A00(ActionId.APPLY_FINISHED_LIST_AGAIN), l);
            A08.A6H("other_user_id", (Long) null);
            A08.A7T((0DA) null, "offer");
            A08.A7T((0DA) null, 4YT.A00(1245));
            A08.A5c((C07n) null, "xma_type");
            A08.A6H("ent_id", (Long) null);
            A08.BZL();
        }
    }
}
