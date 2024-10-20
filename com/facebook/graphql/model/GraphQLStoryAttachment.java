package com.facebook.graphql.model;

import X.4iV;
import X.MSk;
import X.N4s;
import X.NA4;
import X.S6F;
import com.facebook.graphql.enums.GraphQLStoryAttachmentStyle;
import com.facebook.graphql.modelutil.BaseModelWithTree;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;

/* loaded from: GraphQLStoryAttachment.class */
public final class GraphQLStoryAttachment extends BaseModelWithTree implements NA4, 4iV {
    public S6F A00;

    public GraphQLStoryAttachment(int i, int[] iArr) {
        super(i, iArr);
        this.A00 = null;
    }

    public static MSk A02() {
        N4s n4s = new N4s(null, 23431254);
        ((MSk) n4s).A00 = null;
        return n4s;
    }

    @Override // com.facebook.graphql.modelutil.BaseModelWithTree
    public /* bridge */ /* synthetic */ BaseModelWithTree A0K() {
        MSk A04 = MSk.A04(this);
        GraphQLStoryAttachment graphQLStoryAttachment = (GraphQLStoryAttachment) A04.A1V("StoryAttachment", GraphQLStoryAttachment.class, 23431254);
        graphQLStoryAttachment.A00 = (S6F) A04.A00;
        return graphQLStoryAttachment;
    }

    @Override // com.facebook.graphql.modelutil.BaseModelWithTree
    public /* bridge */ /* synthetic */ BaseModelWithTree A0L() {
        return MSk.A04(this).A1w();
    }

    public final GraphQLMedia A0c() {
        return (GraphQLMedia) A0Q(GraphQLMedia.class, 103772132, 995505444);
    }

    public final GraphQLTextWithEntities A0d() {
        return (GraphQLTextWithEntities) A0M(-1724546052);
    }

    public final GraphQLTextWithEntities A0e() {
        return (GraphQLTextWithEntities) A0M(281035123);
    }

    public final ImmutableList A0f() {
        return A0U(GraphQLStoryAttachmentStyle.A1G, 139866732);
    }

    /* JADX WARN: Type inference failed for: r302v2, types: [X.S6F, java.lang.Object] */
    @Override // X.NA4
    public S6F B5L() {
        S6F s6f = this.A00;
        S6F s6f2 = s6f;
        if (s6f == null) {
            ?? obj = new Object();
            this.A00 = obj;
            s6f2 = obj;
        }
        return s6f2;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof GraphQLStoryAttachment) {
            BaseModelWithTree baseModelWithTree = (BaseModelWithTree) obj;
            if (this == baseModelWithTree) {
                z = true;
            } else {
                String A0a = A0a(-1384375507);
                if (A0a != null) {
                    return Objects.equal(A0a, baseModelWithTree.A0a(-1384375507));
                }
            }
        }
        return z;
    }

    @Override // com.facebook.graphql.modelutil.BaseModel
    public final String getTypeName() {
        return "StoryAttachment";
    }

    public int hashCode() {
        return System.identityHashCode(this);
    }
}
