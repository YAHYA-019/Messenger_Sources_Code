package X;

import com.facebook.rsys.cowatch.gen.CowatchPlayerApi;
import com.facebook.rsys.cowatch.gen.CowatchPlayerProxy;

/* loaded from: Gwr.class */
public final class Gwr extends CowatchPlayerProxy {
    public CowatchPlayerApi A00;
    public final C00i A01 = 1BK.A0C();

    @Override // com.facebook.rsys.cowatch.gen.CowatchPlayerProxy
    public CowatchPlayerApi getApi() {
        CowatchPlayerApi cowatchPlayerApi = this.A00;
        if (cowatchPlayerApi != null) {
            return cowatchPlayerApi;
        }
        11T.A0L("cowatchPlayerApi");
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.rsys.cowatch.gen.CowatchPlayerProxy
    public boolean isE2eeCowatchEnabled() {
        return 2yD.A03(1BK.A0N(this.A01), 36313450272135768L);
    }

    @Override // com.facebook.rsys.cowatch.gen.CowatchPlayerProxy
    public void setApi(CowatchPlayerApi cowatchPlayerApi) {
        11T.A0F(cowatchPlayerApi, 0);
        this.A00 = cowatchPlayerApi;
    }

    @Override // com.facebook.rsys.cowatch.gen.CowatchPlayerProxy
    public boolean shouldSubscribeBeforeConnect() {
        return false;
    }
}
