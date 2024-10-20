package X;

import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.litho.LithoView;
import java.lang.ref.WeakReference;

/* renamed from: X.Jmt, reason: case insensitive filesystem */
/* loaded from: Jmt.class */
public final class C3216Jmt extends Kh2 {
    public 2JX A00;
    public LithoView A01;
    public final View A02;
    public final L8t A03;
    public final C11424wg A04;
    public final C11384wc A05;
    public final 1Br A06;
    public final 50K A07;
    public final WeakReference A08;
    public final 50L A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3216Jmt(View view, L8t l8t, C11424wg c11424wg, C11384wc c11384wc, 50L r306, 50K r307, WeakReference weakReference) {
        super(c11424wg);
        11T.A0F(r306, 2);
        7zT.A11(3, view, c11384wc, c11424wg, l8t);
        11T.A0F(r307, 7);
        this.A08 = weakReference;
        this.A09 = r306;
        this.A02 = view;
        this.A05 = c11384wc;
        this.A04 = c11424wg;
        this.A03 = l8t;
        this.A07 = r307;
        1Br A01 = 1Bu.A01(4YU.A08(view), 16428);
        this.A06 = A01;
        LXS lxs = new LXS(this);
        FbUserSession A03 = 1Br.A03(A01);
        50M r0 = r306.A02;
        GraphQlQueryParamSet graphQlQueryParamSet = new GraphQlQueryParamSet();
        graphQlQueryParamSet.A01(((C3t8) r0.A04.get()).A00(), "nt_context");
        LfP.A00(JR2.A0N(A03, graphQlQueryParamSet, new 2Jf(2JX.class, (Class) null, "FBIABAutofillContactSoftKeyboardBloksRootQuery", (String) null, "fbandroid", -1273509627, 0, 3062544710L, 3062544710L, false, true), r0), lxs, r0, 10);
    }

    public void A00() {
        LithoView lithoView;
        LithoView lithoView2 = this.A01;
        if (lithoView2 == null || lithoView2.getVisibility() == 8 || (lithoView = this.A01) == null) {
            return;
        }
        lithoView.setVisibility(8);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0711, code lost:
    
        if (r313 == null) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x073c, code lost:
    
        r316[0] = X.1BK.A1G(r318, r313);
        r0 = r311.get("ent_id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0758, code lost:
    
        if (r0 == 0) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x075b, code lost:
    
        r315 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x075f, code lost:
    
        r316[1] = X.1BK.A1G("ent_id", r315);
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0738, code lost:
    
        r313 = r315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0735, code lost:
    
        if (r313 == null) goto L139;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:210:0x09cf  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x099c  */
    /* JADX WARN: Type inference failed for: r0v176, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v203, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v220, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v241, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v247, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v253, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v258, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v264, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v270, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v275, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v281, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v399, types: [X.0ty] */
    /* JADX WARN: Type inference failed for: r0v421, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A01(com.facebook.browser.lite.extensions.autofill.base.jsbridge.AutofillSharedJSBridgeProxy r302) {
        /*
            Method dump skipped, instructions count: 2536
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3216Jmt.A01(com.facebook.browser.lite.extensions.autofill.base.jsbridge.AutofillSharedJSBridgeProxy):void");
    }
}
