package X;

import android.net.Uri;

/* loaded from: Ihi.class */
public final class Ihi implements JGh {
    public final /* synthetic */ Hgm A00;

    public Ihi(Hgm hgm) {
        this.A00 = hgm;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [X.HFK, java.lang.Object] */
    @Override // X.JGh
    public final HFK ARd(Uri uri) {
        5Hf r0 = (5Hf) 1Br.A0B(this.A00.A02);
        11T.A0D(uri);
        HkO ARn = r0.ARn(uri);
        int i = ARn.A0B;
        int i2 = ARn.A09;
        int i3 = ARn.A0A;
        long j = ARn.A0C;
        ?? obj = new Object();
        ((HFK) obj).A02 = i;
        ((HFK) obj).A00 = i2;
        ((HFK) obj).A01 = i3;
        ((HFK) obj).A03 = j;
        return obj;
    }
}
