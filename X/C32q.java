package X;

import android.os.FileObserver;

/* renamed from: X.32q, reason: invalid class name */
/* loaded from: 32q.class */
public final class C32q extends FileObserver {
    public final /* synthetic */ 1Fe A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ C15h A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32q(1Fe r302, String str, String str2, C15h c15h) {
        super(str, 2);
        this.A00 = r302;
        this.A01 = str2;
        this.A02 = c15h;
    }

    @Override // android.os.FileObserver
    public void onEvent(int i, String str) {
        0fH.A0m("LightSharedPreferencesFactory", "Reloading LSP due to file modification.");
        1Fe r0 = this.A00;
        String str2 = this.A01;
        r0.A02.put(str2, new 1Fq(str2, r0.A04, this.A02, r0.A00, r0.A06));
    }
}
