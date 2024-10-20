package X;

import android.view.View;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.widget.text.BetterTextView;

/* loaded from: E1A.class */
public final class E1A extends EBk implements C7yi, CallerContextable {
    public static final CallerContext A0A = CallerContext.A06(E1A.class);
    public static final String __redex_internal_original_name = "AdminMessageMediaSubscriptionManageView";
    public View A00;
    public View A01;
    public View A02;
    public FbDraweeView A03;
    public COy A04;
    public ExM A05;
    public AnonymousClass622 A06;
    public BetterTextView A07;
    public BetterTextView A08;
    public BetterTextView A09;

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0119, code lost:
    
        if (r0 != null) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C7yi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void ACK(X.AnonymousClass622 r302) {
        /*
            Method dump skipped, instructions count: 493
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E1A.ACK(X.622):void");
    }

    @Override // X.C7yi
    public void Cqe(6Fu r302) {
    }

    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, X.ExM] */
    public void onMeasure(int i, int i2) {
        if (this.A05 == null && this.A06 != null) {
            this.A02.getLayoutParams().height = -2;
            this.A02.setVisibility(0);
            this.A00.getLayoutParams().height = -2;
            this.A00.setVisibility(0);
            super/*X.48A*/.onMeasure(i, i2);
            int measuredHeight = this.A02.getMeasuredHeight();
            int measuredHeight2 = this.A00.getMeasuredHeight();
            View view = this.A02;
            View view2 = this.A00;
            View view3 = this.A01;
            ?? obj = new Object();
            ((ExM) obj).A05 = view3;
            ((ExM) obj).A06 = view;
            ((ExM) obj).A04 = view2;
            ((ExM) obj).A07 = null;
            ((ExM) obj).A08 = null;
            ((ExM) obj).A03 = measuredHeight;
            ((ExM) obj).A02 = measuredHeight2;
            ((ExM) obj).A01 = 0.0f;
            ((ExM) obj).A00 = 0.0f;
            this.A05 = obj;
            obj.A02(this.A06.A06.A03());
        }
        super/*X.48A*/.onMeasure(i, i2);
    }
}
