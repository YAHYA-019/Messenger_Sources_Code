package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.acra.constants.ActionId;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.google.common.base.Platform;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import com.mapbox.mapboxsdk.style.layers.Property;

/* loaded from: Ily.class */
public final class Ily implements 79Q {
    public 1BY A00;
    public final int A01;
    public final 7NL A03;
    public final 7NJ A04;
    public final String A05;
    public final C00i A07;
    public final C00i A02 = 1BV.A01((1BY) null, 83719);
    public final String A06 = (String) 1Bn.A0E((Context) null, (1BY) null, 66826);

    /* JADX WARN: Type inference failed for: r0v12, types: [X.7NJ, java.lang.Object] */
    public Ily(1BO r302, 7NL r303, String str, int i) {
        1BV A01 = 1BV.A01((1BY) null, 50197);
        this.A07 = A01;
        this.A04 = new Object();
        this.A00 = 7zL.A0Q(r302);
        this.A01 = i;
        this.A05 = str;
        this.A03 = r303 == null ? (7NL) A01.get() : r303;
    }

    public /* bridge */ /* synthetic */ ListenableFuture D1r(Object obj) {
        String str = (String) obj;
        C30G A0H = AbF.A0H(ActionId.MESSENGER_DELTA_REQUEST);
        7NL r0 = this.A03;
        GraphQlCallInput graphQlCallInput = new 2Jd(64);
        if (Platform.stringIsNullOrEmpty(str)) {
            str = "";
        }
        graphQlCallInput.A09("query", str);
        graphQlCallInput.A09("query_type", "SEARCH");
        graphQlCallInput.A09("search_interface", this.A06);
        graphQlCallInput.A09("filter_type", this.A05);
        graphQlCallInput.A08("num", 15);
        graphQlCallInput.A0A(DKB.A00(55), ImmutableList.of((Object) "STICKER"));
        2Jd r02 = new 2Jd(62);
        r02.A0A(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, HOE.A00);
        Integer valueOf = Integer.valueOf(this.A01);
        r02.A08(Property.ICON_TEXT_FIT_HEIGHT, valueOf);
        graphQlCallInput.A0A("app_icon_params", ImmutableList.of((Object) r02));
        graphQlCallInput.A09("group_by", "UNGROUPED");
        graphQlCallInput.A09("group_id", null);
        2Jd r03 = new 2Jd(67);
        Object obj2 = HOE.A01.get(HAB.A03);
        if (obj2 == null) {
            throw AnonymousClass001.A0N(4YT.A00(683));
        }
        r03.A0A(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, (ImmutableList) obj2);
        r03.A08(Property.ICON_TEXT_FIT_HEIGHT, valueOf);
        graphQlCallInput.A0A("media_params", ImmutableList.of((Object) r03));
        r0.A5J(graphQlCallInput);
        ((2Jf) A0H).A00.A01(graphQlCallInput, "request");
        C3sa Aak = r0.Aak(A0H);
        C00i c00i = this.A02;
        1Fw.A04((1EZ) 1Bn.A0E(1BK.A04(c00i), (1BY) null, 16428));
        1Vd A0K = 7zM.A0K(1BK.A04(c00i));
        4YU.A1J(Aak, 195771409088126L);
        return 2FP.A01(this.A04, A0K.A04(Aak));
    }
}
