package X;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.quickpromotion.model.QuickPromotionDefinition;

/* loaded from: E7t.class */
public class E7t extends DZF implements CallerContextable {
    public static final CallerContext A09 = CallerContext.A08(E7t.class, "quick_promotion_interstitial");
    public static final String __redex_internal_original_name = "QuickPromotionFooterFragment";
    public ImageView A00;
    public TextView A01;
    public TextView A02;
    public TextView A03;
    public 4gJ A04;
    public FbDraweeView A05;
    public QuickPromotionDefinition.Creative A06;
    public final Fce A08 = (Fce) 1Bi.A03(99643);
    public final C1uu A07 = (C1uu) 1Bi.A03(66388);

    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        QuickPromotionDefinition.Creative creative = ((DZF) this).A02;
        if (creative == null) {
            throw 1BK.A0e();
        }
        this.A06 = creative;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0077, code lost:
    
        if (r0.length() == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0127, code lost:
    
        if (r306 != null) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onActivityCreated(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 635
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E7t.onActivityCreated(android.os.Bundle):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00e3, code lost:
    
        if (r312 == null) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View onCreateView(android.view.LayoutInflater r302, android.view.ViewGroup r303, android.os.Bundle r304) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E7t.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
