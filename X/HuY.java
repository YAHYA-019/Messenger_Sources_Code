package X;

import java.io.File;
import java.net.URL;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: HuY.class */
public final class HuY {
    public final int A00;
    public final long A01;
    public final long A02;
    public final I9V A03;
    public final File A04;
    public final URL A05;

    public HuY(Hpx hpx) {
        this.A04 = hpx.A04;
        I9V i9v = hpx.A03;
        i9v.getClass();
        this.A03 = i9v;
        this.A02 = hpx.A02;
        this.A01 = hpx.A01;
        this.A00 = hpx.A00;
        this.A05 = hpx.A05;
    }

    public JSONObject A00() {
        JSONObject A12 = AnonymousClass001.A12();
        File file = this.A04;
        if (file != null) {
            A12.put("mSourceFile", file.getPath());
        }
        URL url = this.A05;
        if (url != null) {
            A12.put("mUrl", url.toString());
        }
        A12.put("mSourceTimeRange", this.A03.A04());
        A12.put("mPhotoDurationUs", this.A02);
        A12.put("mMediaOriginalDurationMs", this.A01);
        A12.put("mOutputFps", this.A00);
        return A12;
    }

    public boolean A01(boolean z) {
        File file = this.A04;
        if (file != null) {
            return this.A02 >= 0 || HLj.A00(file.getPath(), "video/mp4", z).contains("image");
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            HuY huY = (HuY) obj;
            if (this.A02 != huY.A02 || this.A01 != huY.A01 || this.A00 != huY.A00) {
                return false;
            }
            File file = this.A04;
            if ((file != null || huY.A04 != null) && !IFX.A0A(file, huY.A04)) {
                return false;
            }
            URL url = this.A05;
            if (((url != null || huY.A05 != null) && !IFX.A0A(url, huY.A05)) || !this.A03.equals(huY.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A04, this.A05, this.A03, Long.valueOf(this.A02), Long.valueOf(this.A01), Integer.valueOf(this.A00)});
    }

    public String toString() {
        try {
            return A00().toString();
        } catch (JSONException unused) {
            return "";
        }
    }
}
