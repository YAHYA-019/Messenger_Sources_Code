package X;

import com.facebook.graphservice.interfaces.GraphQLService;

/* renamed from: X.5ia, reason: invalid class name */
/* loaded from: 5ia.class */
public final class C5ia implements GraphQLService.Token {
    public final GraphQLService.Token A00;
    public volatile GraphQLService.DataCallbacks mStrongCallbacks;

    public C5ia(GraphQLService.DataCallbacks dataCallbacks, GraphQLService.Token token) {
        this.A00 = token;
        this.mStrongCallbacks = dataCallbacks;
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLService.Token, X.C3rz
    public void cancel() {
        this.A00.cancel();
        this.mStrongCallbacks = null;
    }
}
