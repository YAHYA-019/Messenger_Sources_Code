package com.facebook.graphql.query;

import X.0Q8;
import X.5BB;
import X.AbstractC01033pi;
import X.C27T;
import X.C42h;
import X.C4V6;
import X.QXY;
import X.QXZ;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.google.common.base.Throwables;
import java.io.IOException;
import java.util.Map;

/* loaded from: GraphQlQueryParamSetDeserializer.class */
public class GraphQlQueryParamSetDeserializer extends JsonDeserializer {
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
        Object obj = null;
        while (5BB.A00(abstractC01033pi) != C42h.A02) {
            try {
                if (abstractC01033pi.A1J() == C42h.A03) {
                    String A1Y = abstractC01033pi.A1Y();
                    abstractC01033pi.A1K();
                    if (A1Y.equals("params")) {
                        new GraphQlQueryParamSet((Map) abstractC01033pi.A1V(new QXY(this)));
                    } else if (A1Y.equals("input_name")) {
                        abstractC01033pi.A1V(new QXZ(this));
                    }
                    abstractC01033pi.A20();
                }
            } catch (Exception e) {
                Throwables.propagateIfPossible(e, IOException.class);
                C4V6.A01(abstractC01033pi, GraphQlQueryParamSet.class, e);
                throw 0Q8.createAndThrow();
            }
        }
        return obj;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public boolean A0W() {
        return true;
    }
}
