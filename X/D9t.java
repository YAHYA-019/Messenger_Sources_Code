package X;

import com.google.common.util.concurrent.SettableFuture;

/* loaded from: D9t.class */
public final class D9t implements Runnable {
    public static final String __redex_internal_original_name = "OtherAppsUserInfoCacheUtil$isSameUserLoggedIn$1";
    public final /* synthetic */ CDP A00;
    public final /* synthetic */ SettableFuture A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public D9t(CDP cdp, SettableFuture settableFuture, String str, String str2) {
        this.A00 = cdp;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = settableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbG.A1W(this.A01, 5FL.A00(7zL.A09(), this.A02, this.A03, true).A05);
    }
}
