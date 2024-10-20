package X;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import com.facebook.messaging.memories.model.MemoryViewModel;
import com.facebook.messaging.memories.viewer.MemoryViewerFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8c5, reason: invalid class name */
/* loaded from: 8c5.class */
public final class C8c5 extends 1LH {
    public final MemoryViewModel A00;
    public final 9lM A01;
    public final MigColorScheme A02;
    public final C00m A03;
    public final boolean A04;
    public final C9Jf A05;

    public C8c5(MemoryViewModel memoryViewModel, C9Jf c9Jf, 9lM r304, MigColorScheme migColorScheme, C00m c00m, boolean z) {
        1BL.A1F(migColorScheme, r304);
        11T.A0F(c9Jf, 5);
        this.A02 = migColorScheme;
        this.A01 = r304;
        this.A00 = memoryViewModel;
        this.A04 = z;
        this.A05 = c9Jf;
        this.A03 = c00m;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [X.23P, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.23P, java.lang.Object] */
    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        ?? obj = new Object();
        1LI r0 = (1LI) AQr.A00(c2k5, this, new Object[0], 42);
        1Iw r02 = c2k5.A05;
        r0.A0e(r02, (C23P) obj, 0, 0, true);
        ?? obj2 = new Object();
        1LI r03 = (1LI) AQd.A00(c2k5, this, new Object[0], 28);
        r03.A0e(r02, (C23P) obj2, 0, 0, true);
        Context context = r02.A0D;
        Display A07 = 7zV.A07(context);
        Point point = new Point();
        A07.getRealSize(point);
        int i = point.y;
        float f = i;
        float f2 = f / 2.0f;
        int i2 = 7zO.A0I(context).widthPixels;
        MemoryViewModel memoryViewModel = this.A00;
        int i3 = (i2 * memoryViewModel.A01) / memoryViewModel.A02;
        if (i3 > i) {
            i3 = i;
        }
        float f3 = i3 / 2.0f;
        float f4 = f2 + f3;
        int i4 = i - obj.A00;
        float f5 = f2 - f3;
        int i5 = obj2.A00;
        C9Jf c9Jf = this.A05;
        float f6 = (f4 - i4) / f;
        float f7 = 0.0f;
        if (0.0f < f6) {
            f7 = f6;
        }
        float f8 = (i5 - f5) / f;
        float f9 = 0.0f;
        if (0.0f < f8) {
            f9 = f8;
        }
        MemoryViewerFragment memoryViewerFragment = c9Jf.A00;
        if (!memoryViewerFragment.A0D) {
            memoryViewerFragment.A0P.execute(new AG0(memoryViewerFragment, f7, f9));
        }
        2lQ r04 = 2lO.A02;
        Integer num = 0S2.A01;
        2lO A04 = C82m.A04(7zS.A0f(num, 1.0f), num, 100.0f, 0);
        Integer num2 = 0S2.A00;
        2lO A0Z = 7zQ.A0Z(C82m.A04(A04, num2, 100.0f, 0), num2, AVB.A01(this, 0));
        C1rp c1rp = C1rp.SPACE_BETWEEN;
        C2sn A0H = 7zS.A0H(r03, r02);
        A0H.A00(r0);
        return C2so.A0C(A0H, c2k5, A0Z, c1rp);
    }
}
