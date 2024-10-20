package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import kotlin.jvm.functions.Function1;

/* renamed from: X.Axf, reason: case insensitive filesystem */
/* loaded from: Axf.class */
public final class C1950Axf extends 1LH {
    public final C00m A00;
    public final C00m A01;
    public final C00m A02;
    public final Function1 A03;
    public final MigColorScheme A04;
    public final boolean A05;

    public C1950Axf(MigColorScheme migColorScheme, C00m c00m, C00m c00m2, C00m c00m3, Function1 function1, boolean z) {
        this.A04 = migColorScheme;
        this.A05 = z;
        this.A00 = c00m;
        this.A03 = function1;
        this.A02 = c00m2;
        this.A01 = c00m3;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        CQY A00 = 7zU.A0T().A00(c2k5.A05, this.A04);
        A00.A0O(3yH.A09(c2k5, 2131965595), 3yH.A09(c2k5, 2131965594));
        String A09 = 3yH.A09(c2k5, 2131967460);
        int i = 2131956902;
        if (this.A05) {
            i = 2131956903;
        }
        CQY.A05(A00, A09, 3yH.A09(c2k5, i), this, ActionId.RTMP_STREAM_PREPARED);
        A00.A0B(2131967459);
        CQY.A05(A00, 3yH.A09(c2k5, 2131965411), 3yH.A09(c2k5, 2131965410), this, ActionId.VIDEO_PLAYING);
        CQY.A05(A00, 3yH.A09(c2k5, 2131962952), 3yH.A09(c2k5, 2131962951), this, ActionId.RTMP_CONNECTION_CONNECTED);
        CQY.A05(A00, 3yH.A09(c2k5, 2131965600), 3yH.A09(c2k5, 2131965599), this, ActionId.RTMP_CONNECTION_FAILED);
        return CQY.A00(A00);
    }
}
