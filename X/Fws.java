package X;

import com.facebook.payments.p2m.messenger.plugins.payment.ctahandler.bloksasynccontroller.P2mBloksAsyncControllerXmaHandler;

/* loaded from: Fws.class */
public final class Fws implements GJ2 {
    public final /* synthetic */ P2mBloksAsyncControllerXmaHandler A00;

    public Fws(P2mBloksAsyncControllerXmaHandler p2mBloksAsyncControllerXmaHandler) {
        this.A00 = p2mBloksAsyncControllerXmaHandler;
    }

    @Override // X.GJ2
    public void onFailure(Throwable th) {
        P2mBloksAsyncControllerXmaHandler p2mBloksAsyncControllerXmaHandler = this.A00;
        p2mBloksAsyncControllerXmaHandler.A01 = false;
        JZj jZj = p2mBloksAsyncControllerXmaHandler.A00;
        if (jZj != null) {
            jZj.dismiss();
        }
        p2mBloksAsyncControllerXmaHandler.A00 = null;
    }

    @Override // X.GJ2
    public void onSuccess() {
        P2mBloksAsyncControllerXmaHandler p2mBloksAsyncControllerXmaHandler = this.A00;
        p2mBloksAsyncControllerXmaHandler.A01 = false;
        JZj jZj = p2mBloksAsyncControllerXmaHandler.A00;
        if (jZj != null) {
            jZj.dismiss();
        }
        p2mBloksAsyncControllerXmaHandler.A00 = null;
    }
}
