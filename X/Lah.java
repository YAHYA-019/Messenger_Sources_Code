package X;

import android.net.Uri;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImplKt;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Charsets;
import java.util.Map;

/* loaded from: Lah.class */
public final class Lah implements C6a5 {
    public final C6a4 A03;
    public final /* synthetic */ LG5 A04;
    public final 6WB A01 = new Object();
    public final 6XA A02 = new 6WD(1);
    public long A00 = -9223372036854775807L;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.6WB, java.lang.Object] */
    public Lah(LG5 lg5, 6XD r303) {
        this.A04 = lg5;
        this.A03 = new C6a4(null, null, r303);
    }

    public boolean A00(long j) {
        LG5 lg5 = this.A04;
        C6W0 c6w0 = lg5.A00;
        boolean z = false;
        if (c6w0.A0S) {
            if (lg5.A02) {
                z = true;
            } else {
                Map.Entry ceilingEntry = lg5.A08.ceilingEntry(Long.valueOf(c6w0.A0D));
                if (ceilingEntry != null && AnonymousClass001.A05(ceilingEntry.getValue()) < j) {
                    long A05 = AnonymousClass001.A05(ceilingEntry.getKey());
                    6ZY r0 = lg5.A06.A00;
                    long j2 = r0.A03;
                    if (j2 == -9223372036854775807L || j2 < A05) {
                        r0.A03 = A05;
                    }
                    LG5.A00(lg5, "publish_time_expired");
                    return true;
                }
            }
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0026, code lost:
    
        if (r0 >= r302.A04) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A01(X.Lbf r302, boolean r303) {
        /*
            r301 = this;
            r0 = r301
            long r0 = r0.A00
            r304 = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r306 = r0
            r0 = r304
            r1 = r306
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r308 = r0
            r0 = r308
            if (r0 == 0) goto L29
            r0 = r302
            long r0 = r0.A04
            r306 = r0
            r0 = r304
            r1 = r306
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r308 = r0
            r0 = 1
            r309 = r0
            r0 = r308
            if (r0 < 0) goto L2c
        L29:
            r0 = 0
            r309 = r0
        L2c:
            r0 = r301
            X.LG5 r0 = r0.A04
            r310 = r0
            r0 = r310
            X.6W0 r0 = r0.A00
            r311 = r0
            r0 = r311
            boolean r0 = r0.A0S
            r308 = r0
            r0 = r308
            if (r0 == 0) goto L67
            r0 = r310
            boolean r0 = r0.A02
            r308 = r0
            r0 = r308
            if (r0 != 0) goto L65
            r0 = r309
            if (r0 != 0) goto L5a
            r0 = r303
            if (r0 == 0) goto L67
        L5a:
            java.lang.String r0 = "forward_seek_forced"
            r311 = r0
            r0 = r310
            r1 = r311
            X.LG5.A00(r0, r1)
        L65:
            r0 = 1
            return r0
        L67:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Lah.A01(X.Lbf, boolean):boolean");
    }

    @Override // X.C6a5
    public void ATn(6Yl r302) {
        this.A03.ATn(r302);
    }

    @Override // X.C6a5
    public void Cj9(6aO r302, int i) {
        this.A03.Cj9(r302, i);
    }

    @Override // X.C6a5
    public void CjA(6aO r302, int i, int i2) {
        this.A03.Cj9(r302, i);
    }

    @Override // X.C6a5
    public int CjE(6D8 r302, int i, int i2, boolean z) {
        return this.A03.CjE(r302, i, 0, z);
    }

    @Override // X.C6a5
    public void CjG(C6ao c6ao, int i, int i2, int i3, long j) {
        long A01;
        byte[] bArr;
        C6a4 c6a4 = this.A03;
        c6a4.CjG(c6ao, i, i2, i3, j);
        while (c6a4.A0E(false)) {
            6XA r0 = this.A02;
            r0.A00();
            if (c6a4.A05(this.A01, r0, 0, false) == -4) {
                r0.A01();
                long j2 = ((6WD) r0).A01;
                LG5 lg5 = this.A04;
                Metadata ALf = lg5.A05.ALf(r0);
                if (ALf != null) {
                    EventMessage eventMessage = (EventMessage) ALf.A01[0];
                    String str = eventMessage.A03;
                    String str2 = eventMessage.A04;
                    if ("urn:mpeg:dash:event:2012".equals(str) && (ConstantsKt.CAMERA_ID_BACK.equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            long A0F = Util.A0F(new String(eventMessage.A05, Charsets.UTF_8));
                            if (A0F != -9223372036854775807L) {
                                1BK.A1I(lg5.A04, new Ki2(j2, A0F), 1);
                            }
                        } catch (KLu unused) {
                        }
                    } else if ("livedash:trace:f0e6005d-acc5-4de5-b754-00301ef34c80".equals(str)) {
                        Uri uri = c6a4.A09;
                        if (eventMessage.A02 == 1 && (bArr = eventMessage.A05) != null) {
                            1BK.A1I(lg5.A04, new Ki1(new String(bArr), uri), 1001);
                        }
                    } else if (!str.contains(GOm.A00(HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_WIDTH))) {
                        1BK.A1I(lg5.A04, new Object[]{eventMessage.A05, eventMessage.A03, Long.valueOf(eventMessage.A02)}, 1004);
                    }
                }
            }
        }
        C6al c6al = c6a4.A0T;
        synchronized (c6a4) {
            int i4 = c6a4.A03;
            A01 = i4 == 0 ? -1 : C6a4.A01(c6a4, i4);
        }
        c6al.A05(A01);
    }

    @Override // X.C6a5
    public void D8Y(Uri uri) {
        this.A03.A09 = uri;
    }
}
