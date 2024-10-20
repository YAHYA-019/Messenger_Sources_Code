package X;

import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.9l9, reason: invalid class name */
/* loaded from: 9l9.class */
public final class C9l9 {
    public final int A00;
    public final EnumC03583yg A01;
    public final 8Fm A02;
    public final 1Br A03;
    public final 1Br A04;
    public final ThreadKey A05;

    public C9l9(Context context, ThreadKey threadKey, int i) {
        11T.A0F(threadKey, 2);
        this.A05 = threadKey;
        this.A00 = i;
        this.A04 = 1BK.A0D();
        this.A01 = AbstractC03573yf.A00(threadKey);
        0DA r0 = new 0DA();
        r0.A07("session_id", 1BK.A0t());
        r0.A01(EQc.A01, "event_step");
        r0.A01(BOJ.A03, "event_source");
        r0.A07("entity_id", 1BK.A0w(threadKey));
        this.A02 = r0;
        this.A03 = 1Bu.A01(context, 68199);
    }

    public static final 98K A00(int i) {
        return i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 6 ? 98K.A06 : 98K.A03 : 98K.A04 : 98K.A01 : 98K.A05 : 98K.A02;
    }

    public static final void A01(C98R c98r, C9l9 c9l9) {
        1UG A08;
        boolean AZk = 2Zl.A00((2Zl) 1Br.A0B(c9l9.A03)).AZk(36318453910745708L);
        04J A02 = 1Br.A02(c9l9.A04);
        if (AZk) {
            A08 = 1BK.A08(A02, "thread_warnings_logs");
            if (!A08.isSampled()) {
                return;
            }
            ThreadKey threadKey = c9l9.A05;
            A08.A6H("user_id", Long.valueOf(threadKey.A05));
            A08.A6H("other_user", Long.valueOf(threadKey.A02));
            7zS.A1E(A08, threadKey);
            7zP.A0z(A08, threadKey);
            A08.A5H("is_e2ee", Boolean.valueOf(threadKey.A12()));
            A08.A5c(A00(c9l9.A00), "entry_point");
            A08.A5c(c98r, "event_name");
        } else {
            A08 = 1BK.A08(A02, "ufix_thread_warnings_event");
            if (!A08.isSampled()) {
                return;
            }
            A08.A7T(c9l9.A02, "core");
            0DA r0 = new 0DA();
            r0.A01(c98r, "event");
            r0.A06("thread_id", 4YU.A0l(c9l9.A05));
            r0.A01(c9l9.A01, "thread_type");
            r0.A01(A00(c9l9.A00), "entry_point");
            A08.A7T(r0, AbE.A00(93));
        }
        A08.BZL();
    }

    public final void A02(C5nv c5nv) {
        C98R c98r;
        if (c5nv.A00()) {
            c98r = C98R.A0K;
        } else if (c5nv != C5nv.A03) {
            return;
        } else {
            c98r = C98R.A0F;
        }
        A01(c98r, this);
    }

    public final void A03(C5nv c5nv) {
        C98R c98r;
        switch (c5nv.ordinal()) {
            case 0:
                c98r = C98R.A04;
                break;
            case 8:
                c98r = C98R.A07;
                break;
            case 9:
                c98r = C98R.A08;
                break;
            case 10:
                c98r = C98R.A09;
                break;
            case 11:
                c98r = C98R.A0A;
                break;
            case 12:
                c98r = C98R.A05;
                break;
            case 13:
                c98r = C98R.A06;
                break;
            default:
                return;
        }
        A01(c98r, this);
    }
}
