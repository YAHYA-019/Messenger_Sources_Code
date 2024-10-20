package X;

import androidx.lifecycle.LiveData;

/* loaded from: AGw.class */
public final class AGw implements Runnable {
    public static final String __redex_internal_original_name = "ReactorsV2DataHandler$createResource$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ A9D A01;
    public final /* synthetic */ GVv A02;
    public final /* synthetic */ String A03;

    public AGw(A9D a9d, GVv gVv, String str, int i) {
        this.A02 = gVv;
        this.A01 = a9d;
        this.A03 = str;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GVv gVv = this.A02;
        LiveData liveData = gVv.A01;
        A9D a9d = this.A01;
        liveData.observe(a9d.A00, new C9qk(this.A00, 1, a9d));
        a9d.A06.put(this.A03, gVv);
        gVv.A02(true);
    }
}
