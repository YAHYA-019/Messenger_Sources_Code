package X;

import com.google.common.collect.ImmutableMap;

/* loaded from: G4y.class */
public final class G4y implements Runnable {
    public static final String __redex_internal_original_name = "InspirationLoggingOverlayEventListener$onEventReceivedWithParamsCollectionMap$1";
    public final /* synthetic */ 4nB A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public G4y(4nB r302, String str, String str2, String str3) {
        this.A00 = r302;
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A00(new DqM((ImmutableMap) null, this.A01, (String) null, this.A03, this.A02));
    }
}
