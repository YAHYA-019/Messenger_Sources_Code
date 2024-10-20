package X;

import com.facebook.auth.usersession.FbUserSession;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: X.Acc, reason: case insensitive filesystem */
/* loaded from: Acc.class */
public final class RunnableC1273Acc implements Runnable {
    public static final String __redex_internal_original_name = "ThreadSettingsExperimentSettingsHandler$updateFutureForExperimentSettingsFetch$1";
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ 7XP A01;
    public final /* synthetic */ SettableFuture A02;
    public final /* synthetic */ String A03;

    public RunnableC1273Acc(FbUserSession fbUserSession, 7XP r303, SettableFuture settableFuture, String str) {
        this.A02 = settableFuture;
        this.A01 = r303;
        this.A00 = fbUserSession;
        this.A03 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SettableFuture settableFuture = this.A02;
        7XP r0 = this.A01;
        settableFuture.setFuture(2FP.A01(new D2k(r0, 5), 7XP.A00(this.A03)));
    }
}
