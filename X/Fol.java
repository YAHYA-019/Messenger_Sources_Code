package X;

import android.net.Uri;
import android.webkit.ValueCallback;

/* loaded from: Fol.class */
public final class Fol implements GJb {
    public final /* synthetic */ ValueCallback A00;
    public final /* synthetic */ DPJ A01;

    public Fol(ValueCallback valueCallback, DPJ dpj) {
        this.A01 = dpj;
        this.A00 = valueCallback;
    }

    @Override // X.GJb
    public void Bn0(Uri uri) {
        this.A00.onReceiveValue(new Uri[]{uri});
    }

    @Override // X.GJb
    public void C6P(Uri uri) {
        this.A00.onReceiveValue(new Uri[]{uri});
    }

    @Override // X.GJb
    public void CBM() {
        this.A00.onReceiveValue(new Uri[0]);
    }
}
