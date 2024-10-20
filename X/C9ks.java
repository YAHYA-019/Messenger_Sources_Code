package X;

import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.9ks, reason: invalid class name */
/* loaded from: 9ks.class */
public final class C9ks {
    public final 1Br A00 = 1Bu.A00(68258);
    public final 1Br A01 = 1Bq.A00(68070);

    public static final BOj A00(C95n c95n) {
        int ordinal = c95n.ordinal();
        if (ordinal == 0) {
            return BOj.A0P;
        }
        if (ordinal == 1) {
            return BOj.A0Q;
        }
        if (ordinal == 2) {
            return BOj.A0D;
        }
        throw 1BK.A1F();
    }

    public static final void A01(ThreadKey threadKey, C9ks c9ks, C95n c95n, String str, int i) {
        if (7zU.A0X(c9ks.A01.A00).AZk(36325192712999315L)) {
            3vU A0x = 7zQ.A0x(c9ks.A00);
            BOj A00 = A00(c95n);
            1UG A08 = 1BK.A08(1Br.A02(A0x.A00), 1BJ.A00(1593));
            if (A08.isSampled()) {
                4YU.A1I(A08, "action_type", i);
                4YU.A1I(A08, "view_name", 27);
                A08.A7R("agent_id", (String) null);
                A08.A5c(3vV.A00(threadKey), "thread_type");
                boolean z = true;
                if (threadKey == null || !threadKey.A0z()) {
                    z = false;
                }
                A08.A5H("is_e2ee", Boolean.valueOf(z));
                A08.A5c(A00, "entry_point");
                A08.A7R("error_message", str);
                A08.BZL();
            }
        }
    }

    public final void A02(ThreadKey threadKey, boolean z, boolean z2) {
        7zQ.A0x(this.A00).A0J((BOj) null, threadKey, z2 ? "write_with_ai_tooltip" : "write_with_ai_icon", !z ? 1 : 0);
    }
}
