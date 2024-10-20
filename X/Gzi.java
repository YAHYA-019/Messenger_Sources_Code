package X;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: Gzi.class */
public class Gzi extends AnonymousClass469 implements C46D {
    public final float A00;
    public final int A01;
    public final 1Ph A02;

    public Gzi(1Ph r302, float f, int i) {
        11T.A0F(r302, 1);
        this.A02 = r302;
        this.A00 = f;
        this.A01 = i;
    }

    public Gzi(2qM r302, 4xU r303, float f) {
        1BL.A1F(r303, r302);
        1Ph A00 = ((C11704xV) r303.A00.get()).A00(r302, C2d1.A00);
        11T.A0A(A00);
        this.A02 = A00;
        this.A00 = f;
        this.A01 = 0;
    }

    @Override // X.AnonymousClass469
    public Uri A01(Context context) {
        File file = (File) this.A02.A00();
        if (file == null) {
            return null;
        }
        return Uri.fromFile(file);
    }

    @Override // X.AnonymousClass469
    public AnonymousClass469 A02(float f, int i) {
        return new Gzi(this.A02, f, i);
    }

    @Override // X.AnonymousClass469
    public boolean A03(5rQ r302, float f, int i) {
        boolean z = false;
        File file = (File) this.A02.A00();
        if (file != null) {
            String path = file.getPath();
            if (r302.A04.BWu()) {
                try {
                    r302.A05.execute(new J1D(r302, path, f));
                } catch (RejectedExecutionException e) {
                    0fH.A0K(5rQ.class, 4YT.A00(526), e);
                }
            } else {
                5rQ.A07(r302, path, f);
            }
            z = true;
        }
        return z;
    }

    @Override // X.AnonymousClass469
    public boolean A04(5rQ r302, int i) {
        return A03(r302, this.A00, 1);
    }

    @Override // X.C46D
    public int AhB() {
        return this.A01;
    }

    @Override // X.C46D
    public float BKU() {
        return this.A00;
    }
}
