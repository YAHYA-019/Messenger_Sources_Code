package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Set;

/* loaded from: Bb3.class */
public final class Bb3 {
    public final DGb A00;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public Bb3(Context context, FbUserSession fbUserSession, BMK bmk, DHX dhx, DJZ djz, C6r c6r, ImmutableList.Builder builder, ImmutableList.Builder builder2, ListenableFuture listenableFuture, ListenableFuture listenableFuture2, ListenableFuture listenableFuture3, String str, Set set, boolean z, boolean z2, boolean z3) {
        Rmv cd1;
        switch (str.hashCode()) {
            case -572410497:
                if (str.equals("Memories")) {
                    cd1 = new Rmv(context, fbUserSession, bmk, dhx, djz, c6r, builder, builder2, listenableFuture, listenableFuture2, listenableFuture3, set, z, z2, z3);
                    break;
                }
                throw 1BL.A0l(str);
            case -445586341:
                if (str.equals("OSShare")) {
                    cd1 = new Cd0(context, fbUserSession, dhx, djz, c6r, builder, builder2, listenableFuture, listenableFuture2, listenableFuture3, set);
                    break;
                }
                throw 1BL.A0l(str);
            case -156351121:
                if (str.equals("BroadcastFlow")) {
                    cd1 = new Cd2(context, fbUserSession, bmk, dhx, djz, c6r, builder, builder2, listenableFuture, listenableFuture2, listenableFuture3, set, z, z3);
                    break;
                }
                throw 1BL.A0l(str);
            case 79145688:
                if (str.equals("Rooms")) {
                    cd1 = new Cd1(context, fbUserSession, dhx, djz, c6r, builder, builder2, listenableFuture, listenableFuture2, listenableFuture3, set, z, z3);
                    break;
                }
                throw 1BL.A0l(str);
            default:
                throw 1BL.A0l(str);
        }
        this.A00 = cd1;
    }
}
