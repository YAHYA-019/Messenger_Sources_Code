package X;

import android.net.Uri;
import com.facebook.acra.constants.ActionId;
import java.util.Collections;

/* loaded from: Lba.class */
public final class Lba implements 6D7, 6DF {
    public static final KTV A0C;
    public 5M8 A00;
    public C3280Jpa A01;
    public final int A02;
    public final 5Ls A03;
    public final 5Ma A04;
    public final 6D1 A05;
    public final C6D4 A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public volatile int A0A = -1;
    public volatile 6D7 A0B = null;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.KTV, java.lang.Object] */
    static {
        ?? obj = new Object();
        ((KTV) obj).A01 = ActionId.VIDEO_SET_RENDERER_CONTEXT;
        ((KTV) obj).A00 = 12;
        ((KTV) obj).A02 = new JXI(ActionId.VIDEO_SET_RENDERER_CONTEXT, 0, (Object) obj);
        ((KTV) obj).A03 = AnonymousClass001.A0u();
        A0C = obj;
    }

    public Lba(5Ls r302, 5Ma r303, 5M8 r304, 6D1 r305, C6D4 c6d4, String str, int i, boolean z, boolean z2) {
        this.A05 = r305;
        this.A07 = str;
        this.A03 = r302;
        this.A00 = r304;
        this.A06 = c6d4;
        this.A04 = r303;
        this.A08 = z;
        this.A02 = i;
        this.A09 = z2;
    }

    public static 6DQ A00(Lba lba, 6DQ r302, String str, String str2, boolean z) {
        6DL r0 = new 6DL(lba.A05.A07, str, str2, z);
        String str3 = null;
        java.util.Map emptyMap = Collections.emptyMap();
        Uri uri = r302.A06;
        if (uri == null) {
            uri = Uri.EMPTY;
        }
        byte[] bArr = r302.A0A;
        long j = r302.A02;
        long j2 = r302.A04;
        long j3 = j - j2;
        long j4 = r302.A03;
        if (j4 <= 0) {
            j4 = -1;
        }
        int i = r302.A00;
        6DO r02 = r302.A07;
        6DO r03 = new 6DO(6DN.A02, r0, r02, r02.A0O, lba.A0A >= 0 ? lba.A0A : r02.A05, r02.A03, r02.A0R);
        String str4 = r302.A08;
        if (str4 != null) {
            str3 = str4;
        }
        6DP.A02(uri);
        return new 6DQ(uri, r03, str3, emptyMap, bArr, 1, i, j3, j2, j4);
    }

    public void A7c(5M9 r302) {
        r302.getClass();
        this.A00 = r302 instanceof 5M8 ? (5M8) r302 : new LVp(r302);
    }

    public void AEa(byte b, boolean z) {
    }

    public /* synthetic */ java.util.Map B7n() {
        return Collections.emptyMap();
    }

    public Uri BIM() {
        if (this.A0B != null) {
            return this.A0B.BIM();
        }
        return null;
    }

    public long CVO(6DQ r302) {
        boolean z;
        long CVO;
        int i;
        synchronized (this) {
            6D1 r0 = this.A05;
            String str = r0.A07;
            Uri uri = r302.A06;
            6DO r02 = r302.A07;
            this.A01 = new C3280Jpa(uri, str, r02.A02, r02.A09);
            KTV ktv = A0C;
            synchronized (ktv) {
                S51 A00 = ktv.A00(this.A01);
                z = true;
                if (A00 == null) {
                    byte[] A01 = this.A03.A01(uri, str);
                    if (A01 == null) {
                        5Ma r03 = this.A04;
                        String str2 = this.A07;
                        int i2 = 8500;
                        if (r02.A0U) {
                            i = this.A02;
                        } else {
                            i2 = 8000;
                            i = 8000;
                        }
                        this.A0B = new Q5v(r03, this.A00, r0, this.A06, str2, i2, i, this.A08, this.A09);
                    } else {
                        this.A0B = new S51(this.A00, A01, A01.length, false);
                        ktv.A02(this.A01, this.A0B);
                    }
                    z = false;
                } else if (A00 instanceof S51) {
                    S51 s51 = A00;
                    z = s51.A04;
                    this.A0B = new S51(this.A00, s51.A05, s51.A03, z);
                } else {
                    Q5w q5w = (Q5w) A00;
                    if (q5w.A03()) {
                        this.A0B = new S51(this.A00, ((S53) q5w).A03, ((S53) q5w).A01, true);
                        ktv.A02(this.A01, this.A0B);
                    } else {
                        ktv.A01(this.A01);
                        q5w.A02 = this.A00;
                        this.A0B = q5w;
                    }
                }
            }
            CVO = this.A0B.CVO(A00(this, r302, r0.A03, r0.A04, z));
        }
        return CVO;
    }

    public void Cw5() {
    }

    public void cancel() {
        if (this.A0B != null) {
            this.A0B.cancel();
        }
    }

    public void close() {
        synchronized (this) {
            if (this.A0B != null) {
                this.A0B.close();
                if (this.A0B instanceof S53) {
                    S53 s53 = this.A0B;
                    if (this.A01 != null && s53.A03()) {
                        byte[] bArr = s53.A03;
                        if (bArr != null) {
                            int length = bArr.length;
                            int i = s53.A01;
                            if (length >= i) {
                                if (i <= 0) {
                                    i = s53.A00;
                                }
                                KTV ktv = A0C;
                                synchronized (ktv) {
                                    ktv.A02(this.A01, new S51(this.A00, s53.A03, i, true));
                                }
                                5Ls r0 = this.A03;
                                C3280Jpa c3280Jpa = this.A01;
                                r0.A00(((L41) c3280Jpa).A01, c3280Jpa.A02, s53.A03, i);
                            }
                        }
                    }
                }
            }
            this.A0B = null;
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        int read;
        synchronized (this) {
            read = this.A0B != null ? this.A0B.read(bArr, i, i2) : -1;
        }
        return read;
    }
}
