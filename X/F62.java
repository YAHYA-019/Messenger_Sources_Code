package X;

import com.facebook.graphql.enums.GraphQLFXCALAccountSharedService;
import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;

/* loaded from: F62.class */
public final class F62 {
    public static final ImmutableSet A04;
    public final 1Br A00 = AbG.A0K();
    public final 1Br A01;
    public final 1Br A02;
    public final 1De A03;

    static {
        GraphQLFXCALAccountSharedService[] values = GraphQLFXCALAccountSharedService.values();
        ArrayList A0t = AnonymousClass001.A0t(values.length);
        for (GraphQLFXCALAccountSharedService graphQLFXCALAccountSharedService : values) {
            A0t.add(graphQLFXCALAccountSharedService.name());
        }
        ImmutableSet A07 = ImmutableSet.A07(0QD.A0f(A0t));
        11T.A0A(A07);
        A04 = A07;
    }

    public F62(1De r302) {
        this.A03 = r302;
        1BY r0 = r302.A00;
        this.A02 = 1Bu.A03(r0, 49829);
        this.A01 = 1Bu.A03(r0, 83719);
    }
}
