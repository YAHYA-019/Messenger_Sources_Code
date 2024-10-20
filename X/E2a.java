package X;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.facebook.graphql.enums.GraphQLLeadGenInfoField;
import com.facebook.messaging.xma.ui.XMALinearLayout;
import com.google.common.collect.ImmutableSet;

/* loaded from: E2a.class */
public final class E2a extends XMALinearLayout {
    public Context A00;
    public LinearLayout A01;
    public CH8 A02;
    public EeA A03;
    public EeB A04;
    public static final ImmutableSet A07 = ImmutableSet.A03(GraphQLLeadGenInfoField.A02, GraphQLLeadGenInfoField.A01, GraphQLLeadGenInfoField.A03);
    public static final C0gt A06 = new C0gt("android.intent.action.DIAL");
    public static final C0gt A05 = new C0gt("android.intent.action.SENDTO");

    @Override // com.facebook.messaging.xma.ui.XMALinearLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
