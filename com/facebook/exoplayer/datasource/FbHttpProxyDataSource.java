package com.facebook.exoplayer.datasource;

import X.5M8;
import X.5M9;
import X.6Cw;
import X.6D1;
import X.6D6;
import X.6DF;
import X.6DG;
import X.LVp;
import android.net.Uri;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.Map;

/* loaded from: FbHttpProxyDataSource.class */
public final class FbHttpProxyDataSource implements 6D6, 6DF {
    public 6D6 A00;
    public int A01;
    public long A02 = 0;
    public 5M8 A03;
    public boolean A04;
    public final 6D1 A05;
    public final HeroPlayerSetting A06;
    public final 6DG A07;
    public final 6Cw A08;

    public FbHttpProxyDataSource(5M8 r302, 6DG r303, 6D1 r304, HeroPlayerSetting heroPlayerSetting, 6D6 r306, int i, int i2, boolean z) {
        this.A05 = r304;
        this.A00 = r306;
        this.A01 = i;
        this.A03 = r302;
        this.A08 = 6Cw.A00(i2);
        this.A04 = z;
        this.A06 = heroPlayerSetting;
        this.A07 = r303;
    }

    public void A7c(5M9 r302) {
        r302.getClass();
        this.A03 = r302 instanceof 5M8 ? (5M8) r302 : new LVp(r302);
    }

    public void AEa(byte b, boolean z) {
        this.A00.AEa(b, z);
    }

    public Map B7n() {
        return this.A00.B7n();
    }

    public Uri BIM() {
        return this.A00.BIM();
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0277, code lost:
    
        if (r0 != false) goto L175;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long CVO(X.6DQ r302) {
        /*
            Method dump skipped, instructions count: 1727
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.exoplayer.datasource.FbHttpProxyDataSource.CVO(X.6DQ):long");
    }

    public void Cw5() {
        this.A00.Cw5();
    }

    public void cancel() {
        if (this.A04) {
            this.A00.cancel();
        }
    }

    public void close() {
        synchronized (this) {
            this.A00.close();
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        synchronized (this) {
            long j = this.A02;
            if (j == 0) {
                return -1;
            }
            if (j != -1) {
                i2 = (int) Math.min(i2, j);
            }
            int read = this.A00.read(bArr, i, i2);
            if (read != -1) {
                this.A02 -= read;
            }
            return read;
        }
    }
}
