package X;

import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.46s, reason: invalid class name */
/* loaded from: 46s.class */
public final class C46s {
    public final 1Br A00 = 1Bq.A00(16634);
    public final 1Br A01 = 1Bq.A00(16385);

    public static final void A00(2cX r301, 2cY r302, 2cW r303, C46s c46s, int i) {
        if (!((2yD) c46s.A01.A00.get()).AZk(36319948557007327L) || i <= 0) {
            return;
        }
        1UG A00 = 1UD.A00((04J) c46s.A00.A00.get(), 1ZG.A01, 1BJ.A00(1677));
        if (A00.isSampled()) {
            A00.A5c(r303, 1BJ.A00(340));
            A00.A5c(r302, "badge_type");
            A00.A6H("badge_count", Long.valueOf(i));
            A00.A5c(r301, "badge_surface");
            A00.BZL();
        }
    }

    public final void A01(2cX r302, 2cW r303, 2QC r304) {
        11T.A0F(r303, 0);
        String str = r304.A02;
        A00(r302, (11T.A0O(str, "RED_WITH_TEXT") || 11T.A0O(str, 1BJ.A00(39))) ? 2cY.A02 : 2cY.A01, r303, this, r304.A01);
    }

    public final void A02(2cX r302, java.util.Map map) {
        C4Rg c4Rg;
        if (((2yD) this.A01.A00.get()).AZk(36319948557007327L)) {
            1UG A00 = 1UD.A00((04J) this.A00.A00.get(), 1ZG.A01, "messenger_in_app_badge_impression_aggregate");
            if (A00.isSampled()) {
                A00.A5c(r302, "badge_surface");
                ArrayList arrayList = new ArrayList(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    2cW r0 = (2cW) entry.getKey();
                    2cZ r02 = (2cZ) entry.getValue();
                    switch (r0.ordinal()) {
                        case 1:
                            c4Rg = C4Rg.CALLS;
                            break;
                        case 2:
                            c4Rg = C4Rg.CHATS;
                            break;
                        case 3:
                            c4Rg = C4Rg.DRAWER;
                            break;
                        case 4:
                            c4Rg = C4Rg.FB_ENTRY_POINT;
                            break;
                        case 5:
                            c4Rg = C4Rg.INBOX_PROFILE_IMAGE;
                            break;
                        case 6:
                            c4Rg = C4Rg.MARKETPLACE;
                            break;
                        case 7:
                            c4Rg = C4Rg.MESSAGE_REQUESTS;
                            break;
                        case 8:
                            c4Rg = C4Rg.SETTINGS;
                            break;
                        case 9:
                            c4Rg = C4Rg.STORIES;
                            break;
                        case 10:
                            c4Rg = C4Rg.SWITCH_ACCOUNT;
                            break;
                        case 11:
                            c4Rg = C4Rg.IA_CHANNELS_FOLDER;
                            break;
                        default:
                            c4Rg = C4Rg.UNKNOWN;
                            break;
                    }
                    int ordinal = r02.A01.ordinal();
                    int i = r02.A00;
                    arrayList.add(new 03Y(c4Rg, ordinal == 1 ? String.valueOf(i) : i > 0 ? "true" : "false"));
                }
                A00.A6J("badge_data", 04R.A0B(arrayList));
                A00.BZL();
            }
        }
    }
}
