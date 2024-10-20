package X;

import com.facebook.rsys.reactions.gen.ReactionsApi;
import com.facebook.rsys.reactions.gen.ReactionsProxy;

/* loaded from: Gxz.class */
public final class Gxz extends ReactionsProxy {
    public ReactionsApi A00;

    @Override // com.facebook.rsys.reactions.gen.ReactionsProxy
    public ReactionsApi getApi() {
        ReactionsApi reactionsApi = this.A00;
        if (reactionsApi != null) {
            return reactionsApi;
        }
        11T.A0L("reactionsApi");
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.rsys.reactions.gen.ReactionsProxy
    public void setApi(ReactionsApi reactionsApi) {
        11T.A0F(reactionsApi, 0);
        this.A00 = reactionsApi;
    }
}
