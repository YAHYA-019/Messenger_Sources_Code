package X;

import android.content.Context;
import android.text.Editable;
import com.facebook.graphql.enums.GraphQLComposedBlockType;
import com.facebook.graphql.enums.GraphQLComposedEntityType;
import com.facebook.graphql.model.GraphQLEntity;
import com.facebook.ipc.composer.model.composedtext.ComposedEntityRange;
import com.facebook.ipc.composer.model.composedtext.ComposedTextBlock;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

/* loaded from: F4n.class */
public final class F4n {
    public final 1Br A00;
    public final Context A01;

    public F4n(Context context) {
        11T.A0F(context, 1);
        this.A01 = context;
        this.A00 = 1BK.A0C();
    }

    public static final void A00(Editable editable, ImmutableList.Builder builder, String str, int i, int i2) {
        int i3 = i2 + i;
        ArrayList A0s = AnonymousClass001.A0s();
        ArrayList A0s2 = AnonymousClass001.A0s();
        GOa[] gOaArr = (GOa[]) editable.getSpans(i, i3, GOa.class);
        Arrays.sort(gOaArr, new G6e(editable, 0));
        if (0 < gOaArr.length) {
            11T.A07(gOaArr[0]);
            throw AnonymousClass001.A0Q("isOptout");
        }
        A0s.addAll(A0s2);
        ArrayList A0s3 = AnonymousClass001.A0s();
        Object[] spans = editable.getSpans(i, i3, DO2.class);
        11T.A0A(spans);
        for (DO2 do2 : (DO2[]) spans) {
            if (!0CV.A0Y(do2.A06(), "Hashtag")) {
                int BBv = do2.BBv(editable) - i;
                int Ajm = do2.Ajm(editable) - i;
                try {
                    MSm A02 = GraphQLEntity.A02(do2.A06());
                    A02.A1Y(3355, String.valueOf(do2.A06.A03));
                    GraphQLEntity A1v = A02.A1v();
                    GraphQLComposedEntityType graphQLComposedEntityType = GraphQLComposedEntityType.A01;
                    RQa A00 = FAi.A00(new Exv(BBv, Ajm - BBv), editable.toString());
                    A0s3.add(new ComposedEntityRange(graphQLComposedEntityType, A1v, null, null, A00.A00, A00.A01));
                } catch (ERd e) {
                    0fH.A0w("ComposedBlocksConverter", e.getMessage(), e);
                }
            }
        }
        A0s.addAll(A0s3);
        HashSet A0v = AnonymousClass001.A0v();
        ImmutableList.of();
        ImmutableList.of();
        GraphQLComposedBlockType graphQLComposedBlockType = GraphQLComposedBlockType.A03;
        HashSet A0z = 4YV.A0z("blockType", A0v, A0v);
        C1pq.A08("text", str);
        ImmutableList copyOf = ImmutableList.copyOf((Collection) A0s);
        C1pq.A08("entityRanges", copyOf);
        ImmutableList of = ImmutableList.of();
        C1pq.A08("inlineStyleRanges", of);
        builder.m11011add((Object) new ComposedTextBlock(graphQLComposedBlockType, copyOf, of, str, A0z, 0));
    }
}
