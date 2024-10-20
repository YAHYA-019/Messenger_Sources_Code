package X;

import com.facebook.acra.constants.ActionId;

/* renamed from: X.1yf, reason: invalid class name */
/* loaded from: 1yf.class */
public final class C1yf {
    public final java.util.Map A00;

    public C1yf() {
        03Y r0 = new 03Y(1, C1yg.ONE_TO_ONE);
        C1yg c1yg = C1yg.GROUP;
        03Y r02 = new 03Y(2, c1yg);
        03Y r03 = new 03Y(3, c1yg);
        03Y r04 = new 03Y(5, C1yg.MARKETPLACE);
        03Y r05 = new 03Y(150, c1yg);
        03Y r06 = new 03Y(Integer.valueOf(ActionId.POPULATE_CONSISTENCY_MEMORY_CACHE), c1yg);
        C1yg c1yg2 = C1yg.FOLDER;
        03Y r07 = new 03Y(6, c1yg2);
        03Y r08 = new 03Y(17, c1yg2);
        03Y r09 = new 03Y(7, C1yg.TINCAN);
        03Y r010 = new 03Y(10, C1yg.CARRIER_MESSAGING_ONE_TO_ONE);
        03Y r011 = new 03Y(11, C1yg.CARRIER_MESSAGING_GROUP);
        03Y r012 = new 03Y(13, C1yg.ENCRYPTED_ONE_TO_ONE_DISAPPEARING);
        C1yg c1yg3 = C1yg.ADVANCED_CRYPTO_ONE_TO_ONE;
        03Y r013 = new 03Y(-1, c1yg3);
        03Y r014 = new 03Y(15, c1yg3);
        C1yg c1yg4 = C1yg.ADVANCED_CRYPTO_GROUP;
        03Y r015 = new 03Y(-2, c1yg4);
        03Y r016 = new 03Y(16, c1yg4);
        C1yg c1yg5 = C1yg.COMMUNITY_CHANNEL;
        this.A00 = 04R.A09(new 03Y[]{r0, r02, r03, r04, r05, r06, r07, r08, r09, r010, r011, r012, r013, r014, r015, r016, new 03Y(18, c1yg5), new 03Y(19, c1yg5), new 03Y(21, c1yg5), new 03Y(22, c1yg5), new 03Y(23, c1yg5), new 03Y(24, c1yg5), new 03Y(26, C1yg.COMMUNITY_SUB_THREAD), new 03Y(201, C1yg.AI_BOT)});
    }

    public final C1yg A00(int i) {
        C1yg c1yg;
        if (i == 5) {
            c1yg = C1yg.MARKETPLACE;
        } else {
            if (i == 201) {
                return C1yg.AI_BOT;
            }
            switch (i) {
                case ActionId.APPLY_OPTIMISTICS /* 152 */:
                case ActionId.APPLY_FINISHED_LIST /* 153 */:
                    return C1yg.BROADCAST_CHANNEL;
                case ActionId.APPLY_FINISHED_LIST_AGAIN /* 154 */:
                case ActionId.FUTURE_LISTENERS_COMPLETE /* 155 */:
                    return C1yg.SOCIAL_CHANNEL;
                default:
                    c1yg = (C1yg) this.A00.get(Integer.valueOf(i));
                    if (c1yg == null) {
                        throw 0Pz.A04("Unsupported msysThreadType: ", i);
                    }
                    break;
            }
        }
        return c1yg;
    }
}
