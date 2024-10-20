package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.graphql.enums.GraphQLMessengerCallToActionRenderStyle;
import com.facebook.graphql.enums.GraphQLMessengerCallToActionType;
import com.facebook.graphql.enums.GraphQLStoryAttachmentStyle;
import com.facebook.graphservice.interfaces.Tree;
import com.facebook.graphservice.tree.TreeBuilderJNI;
import com.facebook.inject.FbInjector;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicksilver.common.sharing.GameAsyncShareExtras;
import com.facebook.quicksilver.common.sharing.GameEntityShareExtras;
import com.facebook.quicksilver.common.sharing.GameShareExtras;
import com.google.common.collect.ImmutableList;

/* loaded from: C0c.class */
public final class C0c {
    public final 1BP A00 = FbInjector.A00;

    public final 60H A00(GameShareExtras gameShareExtras) {
        String str;
        String str2;
        String str3;
        GraphQLStoryAttachmentStyle graphQLStoryAttachmentStyle;
        String str4;
        if (gameShareExtras.A00() == 0S2.A0C) {
            GameEntityShareExtras gameEntityShareExtras = (GameEntityShareExtras) gameShareExtras;
            str = ((GameShareExtras) gameEntityShareExtras).A00;
            11T.A0A(str);
            str2 = ((GameShareExtras) gameEntityShareExtras).A01;
            11T.A0A(str2);
            str3 = gameEntityShareExtras.A01;
            str4 = gameEntityShareExtras.A00;
            11T.A0A(str4);
            graphQLStoryAttachmentStyle = GraphQLStoryAttachmentStyle.A0R;
        } else {
            GameAsyncShareExtras gameAsyncShareExtras = (GameAsyncShareExtras) gameShareExtras;
            str = ((GameShareExtras) gameAsyncShareExtras).A00;
            11T.A0A(str);
            str2 = gameAsyncShareExtras.A05;
            11T.A0A(str2);
            str3 = gameAsyncShareExtras.A03;
            graphQLStoryAttachmentStyle = GraphQLStoryAttachmentStyle.A07;
            str4 = "";
        }
        Object obj = 2JZ.A01;
        6At newTreeBuilder = 2tS.A00().newTreeBuilder("MessengerCallToAction", 6As.class, 423528630);
        newTreeBuilder.A00(GraphQLMessengerCallToActionType.A01, "action_open_type");
        newTreeBuilder.setString("native_url", 0Pz.A0W("fb-messenger://instant_games/play?game_id=", str));
        newTreeBuilder.A00(GraphQLMessengerCallToActionRenderStyle.NORMAL, "cta_render_style");
        newTreeBuilder.setString("action_title", AbJ.A06().getString(2131957121));
        ImmutableList of = ImmutableList.of((Object) newTreeBuilder.getResult(AcH.class, 423528630));
        TreeBuilderJNI A0N = AbF.A0N(2tS.A00(), 6As.class, "Image", 1583864102);
        A0N.setString(TraceFieldType.Uri, str4);
        Tree result = A0N.getResult(2JX.class, 1583864102);
        TreeBuilderJNI A0N2 = AbF.A0N(2tS.A00(), 6As.class, MRk.A00(1), 774234602);
        A0N2.setTree("app_center_cover_image", result);
        Tree result2 = A0N2.getResult(2JX.class, 774234602);
        TreeBuilderJNI A0N3 = AbF.A0N(2tS.A00(), 6As.class, "MessengerRetailItem", 1203327745);
        A0N3.setString(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        A0N3.setString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str2);
        A0N3.setString("image_url", str3);
        A0N3.setTree("application", result2);
        Tree result3 = A0N3.getResult(C1739Ar9.class, 1203327745);
        TreeBuilderJNI A0N4 = AbF.A0N(2tS.A00(), 6As.class, "MessengerBusinessMessageItemsConnection", -149289062);
        A0N4.setTreeList("nodes", (Iterable) ImmutableList.of((Object) result3));
        Tree result4 = A0N4.getResult(2JX.class, -149289062);
        6As A01 = ArE.A01("MessengerBusinessMessage");
        A01.setString(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        A01.setString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str2);
        A01.setTreeList("call_to_actions", of);
        A01.setTree("business_items", result4);
        Tree result5 = A01.getResult(ArE.class, 2050259240);
        6As A00 = 6Ay.A00();
        A00.setTree("target", result5);
        60H A0B = AbO.A0B(A00, graphQLStoryAttachmentStyle);
        11T.A0A(A0B);
        return A0B;
    }
}
