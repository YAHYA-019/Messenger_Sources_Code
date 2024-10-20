package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.common.callercontext.CallerContext;
import java.io.File;
import java.util.List;

/* loaded from: Ik8.class */
public final class Ik8 implements JNA {
    public long A02;
    public Context A03;
    public 2EU A04;
    public JJB A05;
    public JN9 A06;
    public Hkg A07;
    public JJJ A08;
    public boolean A09;
    public boolean A0B;
    public long A01 = 0;
    public final CallerContext A0C = CallerContext.A0B("PhotoDemuxDecodeWrapper");
    public int A00 = -1;
    public long A0A = RDE.A00;

    public Ik8(Context context, JJB jjb, Hkg hkg, JJJ jjj) {
        this.A03 = context;
        this.A05 = jjb;
        this.A07 = hkg;
        this.A08 = jjj;
    }

    private void A00() {
        if (this.A09) {
            return;
        }
        try {
            2EU r0 = this.A04;
            r0.getClass();
            Bitmap A0C = 7zL.A0C(r0);
            JN9 jn9 = this.A06;
            jn9.getClass();
            jn9.D6c(this.A00, A0C);
            this.A09 = true;
        } finally {
            2EU r02 = this.A04;
            if (r02 != null) {
                r02.close();
                this.A04 = null;
            }
        }
    }

    public void AHI(int i) {
        this.A00 = i;
        Hkg hkg = this.A07;
        I9d i9d = hkg.A08;
        i9d.getClass();
        Huc A04 = i9d.A04(HAy.A03, this.A00);
        if (A04 != null) {
            List list = A04.A04;
            if (!1BK.A17(list).isEmpty()) {
                int i2 = ((HuY) 1BK.A17(list).get(0)).A00;
                this.A02 = AbstractC2326GOr.A0Y(list).A02;
                boolean A1I = hkg.A0A.A1I();
                this.A0B = A1I;
                long j = this.A02;
                long j2 = RDE.A00;
                this.A0A = A1I ? j - 1 : i2 > 0 ? (long) (Math.pow(10.0d, 6.0d) / i2) : RDE.A00;
            }
        }
        this.A06 = this.A08.AJT();
    }

    public long ALy() {
        long j;
        A00();
        long j2 = this.A01;
        if (this.A0B) {
            long j3 = this.A02 - RDE.A01;
            long j4 = 0;
            if (0 < j3) {
                j4 = j3;
            }
            if (j2 >= j4) {
                j = j2 + RDE.A00;
            } else {
                long j5 = j2 + this.A0A;
                long j6 = 0;
                if (0 < j3) {
                    j6 = j3;
                }
                j = Math.min(j5, j6);
            }
        } else {
            j = this.A0A + j2;
        }
        this.A01 = j;
        return j2;
    }

    public void ALz(long j) {
        A00();
        this.A01 = j;
    }

    public long Agj() {
        return this.A01;
    }

    public Hts Aw5() {
        return null;
    }

    public boolean BRd() {
        return false;
    }

    public void CkA(long j) {
        A00();
        this.A01 = j;
    }

    public void D8I(I9V i9v) {
    }

    public void DAG() {
    }

    public void cancel() {
    }

    public void release() {
        JN9 jn9 = this.A06;
        if (jn9 != null) {
            jn9.finish();
        }
        2EU r0 = this.A04;
        if (r0 != null) {
            r0.close();
        }
    }

    public void start() {
        I9d i9d = this.A07.A08;
        i9d.getClass();
        Huc A04 = i9d.A04(HAy.A03, this.A00);
        A04.getClass();
        File file = ((HuY) 1BK.A17(A04.A04).get(0)).A04;
        IFX.A06(file);
        Uri fromFile = Uri.fromFile(file);
        JJB jjb = this.A05;
        IFX.A06(jjb);
        2EU BYg = jjb.BYg(this.A03, fromFile, this.A0C);
        this.A04 = BYg;
        if (BYg == null) {
            throw AnonymousClass001.A0G("Bitmap cannot be loaded");
        }
    }
}
