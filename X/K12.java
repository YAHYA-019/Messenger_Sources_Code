package X;

import java.io.IOException;
import java.util.HashMap;

/* loaded from: K12.class */
public final class K12 extends K14 {
    public boolean A00;
    public long A01;
    public final int A02;
    public final long A03;
    public final 6DB A04;
    public final MG1 A05;
    public final boolean A06;
    public volatile boolean A07;
    public volatile boolean A08;

    public K12(6DB r302, 6Yl r303, MG1 mg1, 6D7 r305, 6DQ r306, Object obj, int i, int i2, long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z) {
        super(r303, r305, r306, obj, i, j, j2, j3, j4, j5, j7);
        this.A07 = false;
        this.A02 = i2;
        this.A03 = j6;
        this.A05 = mg1;
        this.A06 = z;
        this.A04 = r302;
    }

    @Override // X.C6a9
    public final void AEC() {
        this.A08 = true;
    }

    @Override // X.C6a9
    public void BYQ() {
        int Cap;
        if (this.A01 == 0) {
            MCm mCm = ((K14) this).A00;
            6DP.A01(mCm);
            long j = this.A03;
            C6a4[] c6a4Arr = ((LbJ) mCm).A01;
            int length = c6a4Arr.length;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    break;
                }
                C6a4 c6a4 = c6a4Arr[i2];
                if (c6a4.A07 != j) {
                    c6a4.A07 = j;
                    c6a4.A0H = true;
                }
                i = i2 + 1;
            }
            MG1 mg1 = this.A05;
            long j2 = ((K14) this).A03;
            long j3 = -9223372036854775807L;
            long j4 = j2 == -9223372036854775807L ? -9223372036854775807L : j2 - j;
            long j5 = ((K14) this).A02;
            if (j5 != -9223372036854775807L) {
                j3 = j5 - j;
            }
            mg1.BOr(mCm, j4, j3);
        }
        try {
            HashMap A0u = AnonymousClass001.A0u();
            GOn.A1Y("bytes_loaded", A0u, this.A01);
            6DB r0 = this.A04;
            r0.BZw("load_container_media_chunk", "ContainerMediaChunk", A0u);
            6DQ r02 = super.A06;
            long j6 = this.A01;
            long j7 = r02.A03;
            long j8 = -1;
            if (j7 != j8) {
                j8 = j7 - j6;
            }
            6DQ A00 = r02.A00(j6, j8);
            C6aA c6aA = super.A07;
            6aI r03 = new 6aI(c6aA, A00.A02, c6aA.CVO(A00));
            this.A07 = false;
            do {
                try {
                    if (this.A08) {
                        break;
                    }
                    Cap = ((Lab) this.A05).A05.Cap(r03, Lab.A09);
                    6DP.A04(4YV.A1W(Cap, 1));
                } catch (IOException e) {
                    A0u.put("exception", e.getLocalizedMessage());
                    GOn.A1Y("stream_position", A0u, r03.A02);
                    GOn.A1Y(1BJ.A00(913), A0u, r02.A02);
                    r0.BZw("load_container_media_chunk_error", "ContainerMediaChunk", A0u);
                    this.A07 = true;
                }
            } while (Cap == 0);
            this.A01 = r03.A02 - r02.A02;
            6Zj r04 = c6aA.A03;
            if (this.A08 && (r04 instanceof 6Zk)) {
                ((6Zk) r04).A02.cancel();
            }
            try {
                c6aA.close();
            } catch (IOException unused) {
            }
            this.A00 = true;
        } catch (Throwable th) {
            C6aA c6aA2 = super.A07;
            6Zj r05 = c6aA2.A03;
            if (this.A08 && (r05 instanceof 6Zk)) {
                ((6Zk) r05).A02.cancel();
            }
            try {
                c6aA2.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }
}
