package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.executor.pandographstore.FBPandoFromGraphQLQueryHybrid;
import com.facebook.graphservice.asset.GraphServiceAsset;
import com.facebook.graphservice.interfaces.GraphQLQuery;
import com.facebook.pando.IPandoGraphQLService;
import com.facebook.pando.NativeCallbacks;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoGraphQLServiceJNI;
import java.util.concurrent.Executor;

/* loaded from: Eut.class */
public final class Eut {
    public 1BY A00;
    public final C00i A01;
    public final C00i A02 = AbH.A0a();
    public final C00i A04 = 1BV.A01((1BY) null, 65704);
    public final C00i A03 = 1BV.A01((1BY) null, 65703);

    public Eut(1BO r302, FbUserSession fbUserSession) {
        this.A00 = 7zL.A0Q(r302);
        this.A01 = AbF.A0B(fbUserSession, (1BY) null, 115438);
    }

    public IPandoGraphQLService.Token A00(C3s4 c3s4, 1K9 r303, Executor executor) {
        Fku fku = new Fku((C0dp) this.A02.get(), r303);
        if (c3s4 instanceof PandoGraphQLRequest) {
            return ((IPandoGraphQLService) this.A01.get()).initiate(null, (PandoGraphQLRequest) c3s4, fku, executor).cancelToken;
        }
        Fks fks = new Fks(fku);
        GraphQLQuery BfE = ((1Wk) this.A04.get()).BfE(c3s4.getQuery(), ((1Wu) this.A03.get()).A01(c3s4, true));
        Class cls = c3s4.getQuery().A04;
        if (cls == null) {
            cls = QQd.class;
        }
        return new Fkv(fku, FBPandoFromGraphQLQueryHybrid.initiate(BfE, (PandoGraphQLServiceJNI) ((Fkw) this.A01.get()).A00, new NativeCallbacks(fks), executor, cls, GraphServiceAsset.getInstance(c3s4.getQuery().A07), AnonymousClass001.A1W(cls, QQd.class)));
    }
}
