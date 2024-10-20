package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.resources.ui.FbLinearLayout;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: E99.class */
public final class E99 extends FbLinearLayout {
    public final SortedMap A00;

    public E99(Context context) {
        super(context, null, 0);
        03W A0G = 04R.A0G();
        11T.A0F(A0G, 0);
        this.A00 = new TreeMap((java.util.Map) A0G);
        setOrientation(1);
        removeAllViews();
        Iterator it = this.A00.keySet().iterator();
        while (it.hasNext()) {
            it.next();
            View e98 = new E98(4YU.A08(this));
            LinearLayout.LayoutParams A0M = DKE.A0M();
            A0M.gravity = 8388613;
            addView(e98, A0M);
        }
        A00(this);
    }

    public static final void A00(E99 e99) {
        int childCount = e99.getChildCount();
        SortedMap sortedMap = e99.A00;
        int i = 0;
        Preconditions.checkState(AnonymousClass001.A1Q(childCount, sortedMap.size()));
        Iterator it = sortedMap.keySet().iterator();
        while (it.hasNext()) {
            int i2 = i + 1;
            String A0i = AnonymousClass001.A0i(it);
            View childAt = e99.getChildAt(i);
            11T.A0I(childAt, "null cannot be cast to non-null type com.facebook.debug.connectionoverlay.NetworkTypeRow");
            E98 e98 = (E98) childAt;
            String A0J = 0Pz.A0J(A0i, ':');
            String A0b = AnonymousClass001.A0b(A0i, sortedMap);
            if (A0b == null) {
                A0b = OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID;
            }
            11T.A0F(A0J, 0);
            TextView textView = e98.A00;
            textView.setText(A0J);
            DKF.A14(e98.getContext(), textView, 2MR.A04, 2Me.A02);
            e98.A00(A0b);
            e98.setTag(A0i);
            i = i2;
        }
    }
}
