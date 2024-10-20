package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.acra.constants.ActionId;
import com.facebook.graphservice.tree.TreeBuilderJNI;
import com.facebook.payments.p2p.protocol.theme.Themeable;
import com.facebook.proxygen.TraceFieldType;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.Dgm, reason: case insensitive filesystem */
/* loaded from: Dgm.class */
public final class C2194Dgm extends C4r3 {
    public static final String __redex_internal_original_name = "FetchThemeablesMethod";
    public final C00i A00;

    public C2194Dgm() {
        super(AbI.A0G(), AbI.A0s());
        this.A00 = DKD.A0U();
    }

    public static 2JX A02(String str, String str2) {
        ImmutableList build;
        Object obj = 2JZ.A01;
        6As newTreeBuilder = 2tS.A00().newTreeBuilder("MessengerPayThemeAsset", 6As.class, -2019381135);
        newTreeBuilder.A0A(str, "asset_type");
        ImmutableList of = ImmutableList.of((Object) "ANDROID");
        if (of == null) {
            build = null;
        } else {
            ImmutableList.Builder A0h = 4YU.A0h();
            1Du it = of.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof String) {
                    Object obj2 = next;
                    if (next == null) {
                        obj2 = "UNSET_OR_UNRECOGNIZED_ENUM_VALUE";
                    }
                    A0h.m11011add(obj2);
                }
                if (next instanceof Enum) {
                    A0h.m11011add((Object) (next == null ? "UNSET_OR_UNRECOGNIZED_ENUM_VALUE" : next.toString()));
                }
            }
            build = A0h.build();
        }
        newTreeBuilder.setStringList("compatible_with", build);
        TreeBuilderJNI A0N = AbF.A0N(2tS.A00(), 6As.class, "Image", 1017057558);
        A0N.setString(TraceFieldType.Uri, str2);
        newTreeBuilder.setTree("image", A0N.getResult(2JX.class, 1017057558));
        return newTreeBuilder.getResult(2JX.class, -2019381135);
    }

    @Override // X.C4r4
    public /* bridge */ /* synthetic */ 2Jf A06(Object obj) {
        C30G A0H = AbF.A0H(ActionId.QUERY_READY);
        A0H.A05(AbstractC00603o4.A00(277), 7zO.A0I(C0f1.A00()).density);
        return A0H;
    }

    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, com.facebook.payments.p2p.protocol.theme.Themeable] */
    @Override // X.C4r3
    public /* bridge */ /* synthetic */ Object A07(Object obj, Object obj2) {
        String A0r;
        2JY r0 = (2JY) obj2;
        if (r0 == null) {
            return new Themeable();
        }
        2JX A0L = 1BL.A0L(r0, 1432887287, 1165037182);
        A0L.getClass();
        ArrayList A0s = AnonymousClass001.A0s();
        C00i c00i = this.A00;
        if (DKH.A0T(c00i).AZk(36312870455546967L)) {
            1Du A0v = AbI.A0v(A0L, 2JX.class, 1768835993, -1506330176);
            while (A0v.hasNext()) {
                2JY A0N = 7zL.A0N(7zL.A0P(A0v), 2JX.class, 1487523771, -729054228);
                TreeBuilderJNI A0N2 = AbF.A0N(2tS.A00(), 6As.class, "MessengerPayTheme", -685673103);
                A0N2.setString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, A0N.A0r(549057345));
                String A0r2 = A0N.A0r(-1673010266);
                if (A0r2 != null && (A0r = A0N.A0r(344100884)) != null) {
                    ImmutableList of = ImmutableList.of((Object) A02("THUMBNAIL", A0r2), (Object) A02("SEND_VIEW", A0r));
                    TreeBuilderJNI A0N3 = AbF.A0N(2tS.A00(), 6As.class, "MessengerPayThemeToAssetsConnection", -887331541);
                    A0N3.setTreeList("nodes", (Iterable) of);
                    A0N2.setTree("assets", A0N3.getResult(2JX.class, -887331541));
                    A0s.add(A0N2.getResult(Dkv.class, -685673103));
                }
            }
        } else {
            A0s.addAll(A0L.A0c(1560076328, Dkv.class, -685673103));
        }
        ArrayList A0s2 = AnonymousClass001.A0s();
        if (DKH.A0T(c00i).AZk(36312870457054301L)) {
            1Du A0w = AbI.A0w(A0L, 681830889, 419583788);
            while (A0w.hasNext()) {
                A0s2.add(7zL.A0P(A0w).A0K(-911303064, 2JX.class, -729949556));
            }
        }
        ImmutableList copyOf = ImmutableList.copyOf((Collection) A0s);
        ImmutableList copyOf2 = ImmutableList.copyOf((Collection) A0s2);
        ?? obj3 = new Object();
        obj3.A01 = copyOf;
        obj3.A00 = copyOf2;
        return obj3;
    }
}
