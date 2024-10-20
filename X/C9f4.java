package X;

import com.facebook.xapp.messaging.reactions.reactors.model.Reactor;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* renamed from: X.9f4, reason: invalid class name */
/* loaded from: 9f4.class */
public final class C9f4 {
    public final 1Br A00 = 7zM.A0X();

    public static final ImmutableList A00(1Mu r301) {
        11T.A0F(r301, 0);
        Collection AQp = r301.AQp();
        ArrayList A0y = 7zO.A0y(AQp);
        Iterator it = AQp.iterator();
        while (it.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(it);
            11T.A0D(A0z);
            String A0j = AnonymousClass001.A0j(A0z);
            Reactor reactor = (Reactor) A0z.getValue();
            if (reactor.A01.length() > 0) {
                11T.A0D(A0j);
                A0y.add(new 8Ls(reactor, A0j, 13));
            }
        }
        return 0DW.A00(0QD.A0b(A0y, new C0qw(new Function1[]{AUT.A00, AUU.A00}, 0)));
    }
}
