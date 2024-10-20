package com.facebook.graphql.model;

import X.4iV;
import X.MSp;
import X.MT0;
import X.MT1;
import com.facebook.graphql.modelutil.BaseModelWithTree;
import com.google.common.collect.ImmutableList;

/* loaded from: GraphQLTextWithEntities.class */
public final class GraphQLTextWithEntities extends BaseModelWithTree implements 4iV {
    public GraphQLTextWithEntities(int i, int[] iArr) {
        super(i, iArr);
    }

    @Override // com.facebook.graphql.modelutil.BaseModelWithTree
    public /* bridge */ /* synthetic */ BaseModelWithTree A0K() {
        return (BaseModelWithTree) MSp.A00(this).A1V("TextWithEntities", GraphQLTextWithEntities.class, -618821372);
    }

    @Override // com.facebook.graphql.modelutil.BaseModelWithTree
    public /* bridge */ /* synthetic */ BaseModelWithTree A0L() {
        return MSp.A00(this).A1v();
    }

    public final ImmutableList A0c() {
        return A0T(703796794, MT0.class, -26176325);
    }

    public final ImmutableList A0d() {
        return A0T(-938283306, MT1.class, 1048000913);
    }

    @Override // com.facebook.graphql.modelutil.BaseModel
    public final String getTypeName() {
        return "TextWithEntities";
    }
}
