package X;

import com.facebook.pando.IPandoGraphQLService;

/* loaded from: Fkv.class */
public final class Fkv implements IPandoGraphQLService.Token {
    public final IPandoGraphQLService.Token A00;
    public final GI4 strongCallbacks;

    public Fkv(GI4 gi4, IPandoGraphQLService.Token token) {
        this.A00 = token;
        this.strongCallbacks = gi4;
    }

    @Override // X.C3rz
    public void cancel() {
        IPandoGraphQLService.Token token = this.A00;
        if (token != null) {
            token.cancel();
        }
    }
}
