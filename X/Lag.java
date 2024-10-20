package X;

import android.net.Uri;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.ArrayList;
import java.util.UUID;

/* loaded from: Lag.class */
public final class Lag implements C6a5 {
    public 6Yl A00;
    public C6a5 A01;
    public long A02;
    public final int A03;
    public final int A04;
    public final 6Yl A05;
    public final Laf A06 = new Laf();

    public Lag(6Yl r302, int i, int i2) {
        this.A03 = i;
        this.A04 = i2;
        this.A05 = r302;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [X.6a4[]] */
    /* JADX WARN: Type inference failed for: r0v30 */
    public void A00(MCm mCm, long j) {
        Laf laf;
        if (mCm == null) {
            this.A01 = this.A06;
            return;
        }
        this.A02 = j;
        int i = this.A04;
        LbJ lbJ = (LbJ) mCm;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            int[] iArr = lbJ.A00;
            if (i3 >= iArr.length) {
                5My.A02("BaseMediaChunkOutput", 0Pz.A0T("Unmatched track of type: ", i));
                laf = new Laf();
                break;
            } else {
                if (i == iArr[i3]) {
                    laf = lbJ.A01[i3];
                    break;
                }
                i2 = i3 + 1;
            }
        }
        this.A01 = laf;
        6Yl r0 = this.A00;
        if (r0 != null) {
            laf.ATn(r0);
        }
    }

    @Override // X.C6a5
    public void ATn(6Yl r302) {
        String str;
        int i;
        6Yl r304 = r302;
        6Yl r0 = this.A05;
        if (r0 != null && r302 != r0) {
            C6ac.A01(r302.A0W);
            String str2 = r0.A0T;
            String str3 = r0.A0U;
            String str4 = str3;
            if (str3 == null) {
                str4 = r302.A0U;
            }
            String str5 = r304.A0V;
            String str6 = str5;
            if (str5 == null) {
                str6 = r0.A0V;
            }
            int i2 = r304.A04;
            float f = 0.0f / 0.0f;
            if (i2 == -1) {
                i2 = r0.A04;
            }
            int i3 = r304.A0D;
            if (i3 == -1) {
                i3 = r0.A0D;
            }
            String str7 = r304.A0R;
            if (str7 == null) {
                str7 = r0.A0R;
            }
            Metadata metadata = r304.A0P;
            Metadata metadata2 = r0.A0P;
            Metadata A00 = metadata == null ? metadata2 : metadata.A00(metadata2);
            float f2 = r304.A01;
            if (f2 == -1.0f) {
                f2 = r0.A01;
            }
            int i4 = r304.A0H | r0.A0H;
            int i5 = r304.A0E | r0.A0E;
            DrmInitData drmInitData = r0.A0O;
            DrmInitData drmInitData2 = r304.A0O;
            ArrayList A0s = AnonymousClass001.A0s();
            if (drmInitData != null) {
                str = drmInitData.A02;
                DrmInitData.SchemeData[] schemeDataArr = drmInitData.A03;
                int length = schemeDataArr.length;
                int i6 = 0;
                while (true) {
                    int i7 = i6;
                    if (i7 >= length) {
                        break;
                    }
                    DrmInitData.SchemeData schemeData = schemeDataArr[i7];
                    if (schemeData.A04 != null) {
                        A0s.add(schemeData);
                    }
                    i6 = i7 + 1;
                }
            } else {
                str = null;
            }
            if (drmInitData2 != null) {
                if (str == null) {
                    str = drmInitData2.A02;
                }
                int size = A0s.size();
                for (DrmInitData.SchemeData schemeData2 : drmInitData2.A03) {
                    if (schemeData2.A04 != null) {
                        UUID uuid = schemeData2.A03;
                        while (true) {
                            int i8 = i;
                            if (i8 >= size) {
                                A0s.add(schemeData2);
                                break;
                            }
                            i = ((DrmInitData.SchemeData) A0s.get(i8)).A03.equals(uuid) ? 0 : i8 + 1;
                        }
                    }
                }
            }
            DrmInitData drmInitData3 = A0s.isEmpty() ? null : new DrmInitData(str, (DrmInitData.SchemeData[]) A0s.toArray(new DrmInitData.SchemeData[0]), false);
            6Zr r02 = new 6Zr(r304);
            r02.A0R = str2;
            r02.A0S = str4;
            r02.A0T = str6;
            r02.A0F = i4;
            r02.A0C = i5;
            r02.A03 = i2;
            r02.A0B = i3;
            r02.A0P = str7;
            r02.A0N = A00;
            r02.A00(drmInitData3);
            r02.A00 = f2;
            6Zt r03 = r304.A0N;
            6Zs r04 = new 6Zs(r03);
            6Zt r05 = r0.A0N;
            r04.A01 = r05.A02;
            String str8 = r03.A05;
            if (str8 == null) {
                str8 = r05.A05;
            }
            r04.A04 = str8;
            String str9 = r03.A04;
            if (str9 == null) {
                str9 = r05.A04;
            }
            r04.A03 = str9;
            String str10 = r03.A08;
            if (str10 == null) {
                str10 = r05.A08;
            }
            r04.A07 = str10;
            String str11 = r03.A07;
            if (str11 == null) {
                str11 = r05.A07;
            }
            r04.A06 = str11;
            r02.A0L = new 6Zt(r04);
            r304 = new 6Yl(r02);
        }
        this.A00 = r304;
        this.A01.ATn(r304);
    }

    @Override // X.C6a5
    public /* synthetic */ void Cj9(6aO r302, int i) {
        this.A01.Cj9(r302, i);
    }

    @Override // X.C6a5
    public void CjA(6aO r302, int i, int i2) {
        this.A01.Cj9(r302, i);
    }

    @Override // X.C6a5
    public int CjE(6D8 r302, int i, int i2, boolean z) {
        return this.A01.CjE(r302, i, 0, z);
    }

    @Override // X.C6a5
    public void CjG(C6ao c6ao, int i, int i2, int i3, long j) {
        long j2 = this.A02;
        if (j2 != -9223372036854775807L && j >= j2) {
            this.A01 = this.A06;
        }
        this.A01.CjG(c6ao, i, i2, i3, j);
    }

    @Override // X.C6a5
    public void D8Y(Uri uri) {
    }
}
