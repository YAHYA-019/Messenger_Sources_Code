package X;

import com.facebook.graphservice.interfaces.GraphQLService;
import com.facebook.graphservice.interfaces.Summary;
import com.facebook.graphservice.interfaces.Tree;
import com.facebook.tigon.TigonErrorException;

/* loaded from: Fgh.class */
public final class Fgh implements GraphQLService.DataCallbacks {
    public final /* synthetic */ Eut A00;
    public final /* synthetic */ AbstractC04134a1 A01;

    public Fgh(Eut eut, AbstractC04134a1 abstractC04134a1) {
        this.A00 = eut;
        this.A01 = abstractC04134a1;
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLService.DataCallbacks
    public void onError(TigonErrorException tigonErrorException, Summary summary) {
        this.A01.onError(tigonErrorException, summary);
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLService.DataCallbacks
    public void onUpdate(Tree tree, Summary summary) {
        this.A01.onUpdate(tree, summary);
    }
}
