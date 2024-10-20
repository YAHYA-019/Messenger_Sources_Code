package com.facebook.graphql.model;

import X.4iV;
import X.MRl;
import X.MSn;
import X.MSy;
import X.N4s;
import com.facebook.graphql.modelutil.BaseModelWithTree;
import com.facebook.graphservice.tree.TreeJNI;
import com.google.common.collect.ImmutableList;

/* loaded from: GraphQLMedia.class */
public final class GraphQLMedia extends BaseModelWithTree implements 4iV {
    public GraphQLMedia(int i, int[] iArr) {
        super(i, iArr);
    }

    public static MSn A02(String str) {
        MSn A0b = MSn.A0b((TreeJNI) null, 995505444);
        A0b.A1u(str);
        return A0b;
    }

    @Override // com.facebook.graphql.modelutil.BaseModelWithTree
    public /* bridge */ /* synthetic */ BaseModelWithTree A0K() {
        MSn A00 = MSn.A00(this);
        String A0s = N4s.A0s(A00);
        MRl.A0R(A0s);
        return (BaseModelWithTree) A00.A1V(A0s, GraphQLMedia.class, 995505444);
    }

    @Override // com.facebook.graphql.modelutil.BaseModelWithTree
    public /* bridge */ /* synthetic */ BaseModelWithTree A0L() {
        return MSn.A00(this).A1v();
    }

    public final ImmutableList A0c() {
        return A0T(-1363133599, MSy.class, -1087353613);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.graphql.modelutil.BaseModel
    public final String getTypeName() {
        return isValidGraphServicesJNIModel() ? super.getTypeName() : A0a(-2073950043);
    }
}
