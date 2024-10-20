package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.enums.GraphQLComposedEntityType;
import com.facebook.graphql.model.GraphQLEntity;
import com.facebook.ipc.composer.model.ComposerTextData;
import com.facebook.ipc.composer.model.composedtext.ComposedEntityRange;
import com.facebook.ipc.composer.model.composedtext.ComposedTextBlock;
import com.facebook.ipc.composer.model.composedtext.InlineStyleRange;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: ErA.class */
public final class ErA {
    public final 2Jd A00(ComposerTextData composerTextData) {
        String str;
        11T.A0F(composerTextData, 0);
        ImmutableList immutableList = composerTextData.A00;
        11T.A0A(immutableList);
        ArrayList A1E = C1A3.A1E(immutableList);
        Iterator it = immutableList.iterator();
        while (it.hasNext()) {
            ComposedTextBlock composedTextBlock = (ComposedTextBlock) it.next();
            11T.A0D(composedTextBlock);
            ImmutableList immutableList2 = composedTextBlock.A01;
            ArrayList A0y = 7zO.A0y(immutableList2);
            Iterator it2 = immutableList2.iterator();
            while (it2.hasNext()) {
                ComposedEntityRange composedEntityRange = (ComposedEntityRange) it2.next();
                2Jd A0Q = DKC.A0Q();
                GraphQLEntity graphQLEntity = composedEntityRange.A03;
                if (graphQLEntity != null) {
                    A0Q.A09(PublicKeyCredentialControllerUtility.JSON_KEY_ID, graphQLEntity.A0Z());
                    GraphQLComposedEntityType graphQLComposedEntityType = composedEntityRange.A02;
                    if (graphQLComposedEntityType != null) {
                        A0Q.A09(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, graphQLComposedEntityType.name());
                        String str2 = composedEntityRange.A04;
                        if (str2 != null && (str = composedEntityRange.A05) != null) {
                            07S A0J = 4YU.A0J(GraphQlCallInput.A02, str, "data");
                            07S.A00(A0J, str2, "key");
                            7zN.A17(A0J, A0Q, "data");
                        }
                        07S A0J2 = 4YU.A0J(GraphQlCallInput.A02, Integer.valueOf(composedEntityRange.A00), "length");
                        07S.A00(A0J2, Integer.valueOf(composedEntityRange.A01), "offset");
                        7zN.A17(A0J2, A0Q, "range");
                        A0y.add(A0Q);
                    }
                }
            }
            2Jd A0Q2 = DKC.A0Q();
            A0Q2.A08("depth", Integer.valueOf(composedTextBlock.A00));
            A0Q2.A09("text", composedTextBlock.A03);
            A0Q2.A09(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, composedTextBlock.A00().name());
            A0Q2.A0A("entities_with_ranges", A0y);
            ImmutableList immutableList3 = composedTextBlock.A02;
            11T.A0A(immutableList3);
            ArrayList A1E2 = C1A3.A1E(immutableList3);
            Iterator it3 = immutableList3.iterator();
            while (it3.hasNext()) {
                InlineStyleRange inlineStyleRange = (InlineStyleRange) it3.next();
                2Jd A0Q3 = DKC.A0Q();
                A0Q3.A09("style", inlineStyleRange.A00().name());
                A0Q3.A08("length", Integer.valueOf(inlineStyleRange.A00));
                A0Q3.A08("offset", Integer.valueOf(inlineStyleRange.A01));
                A1E2.add(A0Q3);
            }
            A0Q2.A0A(MRk.A00(61), A1E2);
            A1E.add(A0Q2);
        }
        2Jd A0Q4 = DKC.A0Q();
        A0Q4.A0A("blocks", A1E);
        return A0Q4;
    }
}
