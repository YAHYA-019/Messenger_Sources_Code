package X;

import android.net.Uri;
import com.facebook.xapp.messaging.threadview.model.audio.WaveformData;

/* renamed from: X.5n6, reason: invalid class name */
/* loaded from: 5n6.class */
public final class C5n6 extends C5fu {
    public final long A00;
    public final Uri A01;
    public final WaveformData A02;
    public final C5fx A03;

    public C5n6(5wB r302) {
        super(r302);
        this.A03 = C5fw.A04;
        Uri uri = r302.A01;
        if (uri == null) {
            throw 1BK.A0e();
        }
        this.A01 = uri;
        this.A00 = r302.A00;
        this.A02 = r302.A02;
    }

    @Override // X.C5fv
    public C5fx Ax3() {
        return this.A03;
    }

    @Override // X.C5fu
    public boolean equals(Object obj) {
        boolean z = true;
        if (obj != this) {
            if (!(obj instanceof C5n6)) {
                return false;
            }
            C5n6 c5n6 = (C5n6) obj;
            if (this.A00 == c5n6.A00 && 11T.A0O(this.A01, c5n6.A01) && 11T.A0O(this.A02, c5n6.A02) && super.equals(obj)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    @Override // X.C5fu
    public int hashCode() {
        int hashCode = ((super.hashCode() * 31) + this.A01.hashCode()) * 31;
        long j = this.A00;
        int i = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        WaveformData waveformData = this.A02;
        return i + (waveformData != null ? waveformData.hashCode() : 0);
    }

    @Override // X.C5fu
    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("[AudioMessage uri=");
        A0k.append(this.A01);
        A0k.append(", durationMs=");
        A0k.append(this.A00);
        A0k.append(", waveformData=");
        A0k.append(4YV.A0u(this.A02));
        A0k.append(", super=");
        return 4YW.A07(super.toString(), A0k);
    }
}
