package X;

import android.content.res.Resources;
import com.facebook.messaging.storagemanagement.mediamanager.model.MediaItem;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8hu, reason: invalid class name */
/* loaded from: 8hu.class */
public final class C8hu extends 1LH {
    public final int A00;
    public final long A01;
    public final AYE A02;
    public final MediaItem A03;
    public final MigColorScheme A04;
    public final Integer A05;
    public final boolean A06;

    public C8hu(AYE aye, MediaItem mediaItem, MigColorScheme migColorScheme, Integer num, int i, long j, boolean z) {
        7zT.A1W(migColorScheme, mediaItem, aye, num);
        this.A04 = migColorScheme;
        this.A03 = mediaItem;
        this.A02 = aye;
        this.A05 = num;
        this.A00 = i;
        this.A06 = z;
        this.A01 = j;
    }

    private final 2cL A01(C2k6 c2k6, MediaItem mediaItem) {
        String A00 = 3Gp.A00(mediaItem.A03);
        2lQ r0 = 2lO.A02;
        2dP r02 = 2dP.A01;
        2lO A0Y = 7zQ.A0Y(7zS.A0h(0S2.A0Y, r02, 0), 0S2.A0N, 7zP.A08());
        1Iw AeS = c2k6.AeS();
        Resources A0E = 4YU.A0E(AeS);
        2lO A0K = 4YV.A0K(A0Y, 0S2.A01, 7zO.A0B(A0E.getDimensionPixelSize(2132279393)));
        Integer num = 0S2.A00;
        2lO A0b = 7zS.A0b(C82m.A04(A0K, num, 100.0f, 0), num, A0E.getDrawable(2132411065));
        C2sn A0U = 7zQ.A0U(AeS);
        2KD A0r = 7zL.A0r(A0U, 0);
        A0r.A2H(r02);
        2RH r03 = 2RH.A05;
        7zU.A1C(A0r, r03);
        7zU.A1E(A0r, r03, C26z.END);
        A0r.A0M();
        A0r.A2z(A00);
        A0r.A2x(this.A04);
        A0r.A2i();
        A0r.A2e();
        A0r.A2u(2KG.A02);
        A0r.A2S(A00);
        7zN.A1Q(A0U, A0r);
        return C2so.A02(A0U, c2k6, A0b);
    }

    private final 2cL A0L(C2k6 c2k6, MediaItem mediaItem) {
        2cL r308 = null;
        if (11T.A0O(mediaItem.A08, "video/mp4")) {
            Long l = mediaItem.A05;
            if (l == null) {
                l = 4YV.A0j();
            }
            long A02 = C0za.A02(0zY.A05, l.longValue());
            String A0w = 7zO.A0w("%d:%02d", new Object[]{Long.valueOf(C0zc.A03(0zY.A06, A02)), Integer.valueOf(C0zc.A01(A02))});
            11T.A0A(A0w);
            2lQ r0 = 2lO.A02;
            2dP r02 = 2dP.A01;
            2lO A0Q = 7zS.A0Q(4YV.A0L((2lO) null, 0S2.A0Y, r02, 0), 0.0d);
            1Iw AeS = c2k6.AeS();
            Resources A0E = 4YU.A0E(AeS);
            2lO A0K = 4YV.A0K(A0Q, 0S2.A01, 7zO.A0B(A0E.getDimensionPixelSize(2132279393)));
            Integer num = 0S2.A00;
            2lO A0L = 4YV.A0L(C82m.A04(A0K, num, 100.0f, 0), num, A0E.getDrawable(2132411064), 1);
            C2sn A0U = 7zQ.A0U(AeS);
            2KD A0r = 7zL.A0r(A0U, 0);
            A0r.A2H(r02);
            2RH r03 = 2RH.A05;
            A0r.A1E(4YU.A00(r03));
            7zU.A1E(A0r, r03, C26z.END);
            A0r.A2z(A0w);
            A0r.A2x(this.A04);
            A0r.A2i();
            A0r.A2e();
            A0r.A2u(2KG.A02);
            7zN.A1Q(A0U, A0r);
            r308 = C2so.A02(A0U, c2k6, A0L);
        }
        return r308;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0450, code lost:
    
        if (r307 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A0s(X.C2k5 r302) {
        /*
            Method dump skipped, instructions count: 1130
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8hu.A0s(X.2k5):X.1LI");
    }
}
