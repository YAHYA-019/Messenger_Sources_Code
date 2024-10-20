package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import org.json.JSONObject;

/* loaded from: L8u.class */
public final class L8u {
    public final String A00;
    public final String A01;
    public final JSONObject A02;
    public final /* synthetic */ KqH A03;

    public /* synthetic */ L8u(KqH kqH, String str, String str2) {
        JSONObject A12 = AnonymousClass001.A12();
        this.A03 = kqH;
        this.A00 = str;
        this.A01 = str2;
        this.A02 = A12;
    }

    public static void A00(L8u l8u, int i, int i2, boolean z) {
        l8u.A06("legacy_table_source", 4YT.A00(1286));
        l8u.A04(Integer.valueOf(i), "headcount");
        l8u.A05("popupspace_open", Boolean.valueOf(z));
        l8u.A04(Integer.valueOf(i2), "device_rotation");
    }

    public static void A01(KqH kqH, String str, String str2, JSONObject jSONObject) {
        1UG A08 = 1BK.A08(1Br.A02(kqH.A00), "messaging_floating_notifications");
        if (A08.isSampled()) {
            A08.A7R("feature", "CHAT_HEAD");
            A08.A7R("action", str);
            A08.A7R("action_trigger", str2);
            String A02 = 11T.A02(jSONObject);
            if (A02.length() > 0) {
                A08.A7R("extra_info", A02);
            }
            A08.BZL();
        }
    }

    private final void A04(Integer num, String str) {
        JQy.A1I(this, num, str);
    }

    public final void A02() {
        1UG A08 = 1BK.A08(1Br.A02(this.A03.A00), "messaging_floating_notifications");
        if (A08.isSampled()) {
            A08.A7R("feature", "CHAT_HEAD");
            A08.A7R("action", this.A00);
            A08.A7R("action_trigger", this.A01);
            String A02 = 11T.A02(this.A02);
            if (A02.length() > 0) {
                A08.A7R("extra_info", A02);
            }
            A08.BZL();
        }
    }

    public final void A03(ThreadKey threadKey) {
        Long valueOf;
        String A00;
        if (threadKey != null) {
            if (threadKey.A06 == C1yg.GROUP || threadKey.A1I()) {
                valueOf = Long.valueOf(threadKey.A04);
                A00 = 1BJ.A00(35);
            } else {
                valueOf = Long.valueOf(threadKey.A02);
                A00 = "user_key";
            }
            JQy.A1I(this, valueOf, A00);
        }
    }

    public final void A05(String str, Boolean bool) {
        JQy.A1I(this, bool, str);
    }

    public final void A06(String str, String str2) {
        if (str2 != null) {
            this.A02.put(str, str2);
        }
    }
}
