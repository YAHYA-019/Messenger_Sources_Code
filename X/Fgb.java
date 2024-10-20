package X;

import com.facebook.graphqlrealtimeservice.interfaces.GraphQLRealtimeService;
import com.facebook.graphqlrealtimeservice.interfaces.StreamStatus;
import com.facebook.graphservice.interfaces.Summary;
import com.facebook.graphservice.interfaces.Tree;
import com.facebook.tigon.TigonErrorException;
import java.util.Iterator;
import java.util.Set;

/* loaded from: Fgb.class */
public final class Fgb implements GraphQLRealtimeService.RealtimeDataCallbacks {
    public final C2199Dgr A00;

    public Fgb(C5op c5op) {
        this.A00 = new C2199Dgr(c5op);
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLService.DataCallbacks
    public void onError(TigonErrorException tigonErrorException, Summary summary) {
        this.A00.onError(tigonErrorException);
    }

    @Override // com.facebook.graphqlrealtimeservice.interfaces.GraphQLRealtimeService.RealtimeDataCallbacks
    public void onStatusChange(StreamStatus streamStatus, Summary summary) {
        Set set = this.A00.A00.A02;
        synchronized (set) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    @Override // com.facebook.graphservice.interfaces.GraphQLService.DataCallbacks
    public void onUpdate(Tree tree, Summary summary) {
        this.A00.onUpdate(tree, summary);
    }
}
