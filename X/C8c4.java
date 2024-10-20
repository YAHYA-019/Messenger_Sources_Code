package X;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import com.facebook.litho.LithoView;
import com.facebook.messaging.memories.model.MemoryViewModel;
import com.facebook.messaging.memories.viewer.MemoryViewerFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8c4, reason: invalid class name */
/* loaded from: 8c4.class */
public final class C8c4 extends 1LH {
    public final LithoView A00;
    public final MemoryViewModel A01;
    public final 9lM A02;
    public final MigColorScheme A03;
    public final C00m A04;
    public final C9Jf A05;

    public C8c4(LithoView lithoView, MemoryViewModel memoryViewModel, C9Jf c9Jf, 9lM r305, MigColorScheme migColorScheme, C00m c00m) {
        1BL.A1H(lithoView, migColorScheme, r305);
        11T.A0F(c9Jf, 5);
        this.A00 = lithoView;
        this.A03 = migColorScheme;
        this.A02 = r305;
        this.A01 = memoryViewModel;
        this.A05 = c9Jf;
        this.A04 = c00m;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.23P, java.lang.Object] */
    public 1LI A0s(C2k5 c2k5) {
        8ZJ A0Y;
        11T.A0F(c2k5, 0);
        1pQ A0h = 7zQ.A0h();
        ?? obj = new Object();
        1LI r0 = (1LI) AQr.A00(c2k5, this, new Object[0], 41);
        1Iw r02 = c2k5.A05;
        r0.A0e(r02, (C23P) obj, 0, 0, true);
        Context context = r02.A0D;
        Display A07 = 7zV.A07(context);
        Point point = new Point();
        A07.getRealSize(point);
        int i = point.y;
        float f = i;
        float f2 = f / 2.0f;
        int i2 = 7zO.A0I(context).widthPixels;
        MemoryViewModel memoryViewModel = this.A01;
        int i3 = (i2 * memoryViewModel.A01) / memoryViewModel.A02;
        if (i3 <= i) {
            i = i3;
        }
        float f3 = f2 - (i / 2.0f);
        int i4 = obj.A00;
        C9Jf c9Jf = this.A05;
        float f4 = (i4 - f3) / f;
        float f5 = 0.0f;
        if (0.0f < f4) {
            f5 = f4;
        }
        MemoryViewerFragment memoryViewerFragment = c9Jf.A00;
        if (!memoryViewerFragment.A0D) {
            memoryViewerFragment.A0P.execute(new AG0(memoryViewerFragment, 0.0f, f5));
        }
        2lQ r03 = 2lO.A02;
        2lO A06 = C82m.A06(0S2.A01, 100.0f, 0);
        Integer num = 0S2.A00;
        2lO A0L = 4YV.A0L(7zQ.A0Z(7zS.A0c(C82m.A04(A06, num, 100.0f, 0), 0S2.A0u, true), num, AVD.A01(this, 48)), 0S2.A04, AVD.A01(this, 49), 1);
        C1rp c1rp = C1rp.SPACE_BETWEEN;
        C2sn A0H = 7zS.A0H(r0, r02);
        if (1pQ.A00(A0h).AZk(36324595712347966L)) {
            A0Y = new 8ZJ(this.A00, memoryViewModel, this.A02, this.A03);
        } else {
            A0Y = 7zL.A0Y();
        }
        A0H.A00(A0Y);
        return C2so.A0C(A0H, c2k5, A0L, c1rp);
    }
}
