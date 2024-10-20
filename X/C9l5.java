package X;

import android.content.Context;
import android.view.animation.PathInterpolator;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.ui.media.attachments.model.MediaResource;

/* renamed from: X.9l5, reason: invalid class name */
/* loaded from: 9l5.class */
public final class C9l5 {
    public static final 5Rm A0E;
    public static final 5Rm A0F;
    public static final 5Rm A0G;
    public IEI A00;
    public MediaResource A01;
    public HtZ A02;
    public C00m A03;
    public C00m A04;
    public final long A05;
    public final Context A06;
    public final FbUserSession A07;
    public final 2S4 A08;
    public final ThreadKey A09;
    public final MigColorScheme A0A;
    public final 70S A0B;
    public final 6Sn A0C;
    public final C01i A0D;

    static {
        int A01 = C97m.A04.A01();
        PathInterpolator A00 = 9Dd.A00(0S2.A0j);
        5Rn r0 = C3s9.A04;
        A0F = new C5X0(A00, A01);
        C97m c97m = C97m.A05;
        A0G = new C5X0(9Dd.A00(0S2.A15), c97m.A01());
        A0E = new C5X0(9Dd.A00(0S2.A0N), c97m.A01());
    }

    public C9l5(Context context, FbUserSession fbUserSession, 2S4 r304, ThreadKey threadKey, MigColorScheme migColorScheme, 70S r307, 6Sn r308, long j) {
        7zT.A1T(context, fbUserSession, migColorScheme);
        this.A06 = context;
        this.A07 = fbUserSession;
        this.A09 = threadKey;
        this.A0A = migColorScheme;
        this.A0C = r308;
        this.A05 = j;
        this.A0B = r307;
        this.A08 = r304;
        this.A0D = C01g.A00(C03i.A02, new J9s(this, 41));
        this.A04 = ANd.A00;
        this.A03 = ANc.A00;
    }

    public static final 8Ln A00(C9l5 c9l5) {
        Integer num = 0S2.A01;
        String A00 = GOm.A00(ActionId.ASYNC_FAIL);
        5Rn r0 = C3s9.A04;
        5X3 A002 = C3s9.A00(r0, A00);
        C2jo c2jo = C2jm.A00;
        A002.A03(c2jo);
        5Rm r02 = A0G;
        ((5X4) A002).A02 = r02;
        A002.A01(0.0f);
        A002.A02(0.0f);
        A002.A03(C2jm.A05);
        ((5X4) A002).A02 = A0F;
        A002.A01(0.75f);
        A002.A02(0.75f);
        ((5X4) A002).A05 = new A2E(c9l5, 2);
        5X3 A003 = C3s9.A00(r0, "RecordingControlsButtons");
        A003.A03(c2jo);
        ((5X4) A003).A02 = r02;
        A003.A01(0.0f);
        A003.A02(0.0f);
        A003.A03(C2jm.A09);
        ((5X4) A003).A02 = A0E;
        Integer num2 = 0S2.A0N;
        A003.A04(new C5X1(num2, 100.0f));
        A003.A05(new C5X1(num2, 100.0f));
        return new 8Ln(new 5XB(new 5X3[]{A002, A003}), num, false, true);
    }

    public final void A01() {
        IEI iei = this.A00;
        if (iei != null) {
            IEI.A04(iei, true);
            IEI iei2 = this.A00;
            if (iei2 != null) {
                iei2.A06();
                70S r0 = this.A0B;
                if (r0 != null) {
                    r0.Bb8();
                    return;
                }
                return;
            }
        }
        11T.A0L("audioRecordingAPI");
        throw 0Q8.createAndThrow();
    }
}
