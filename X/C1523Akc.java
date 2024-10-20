package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.LithoView;
import com.facebook.messaging.nativepagereply.orders.threadsettings.model.BusinessInboxPlacedOrder;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Akc, reason: case insensitive filesystem */
/* loaded from: Akc.class */
public final class C1523Akc extends 1pK {
    public static final String __redex_internal_original_name = "PlacedOrdersListFragment";
    public 1pI A00;

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        Parcelable[] parcelableArray;
        int A04 = 7zQ.A04(layoutInflater, -723662908);
        super/*androidx.fragment.app.Fragment*/.onCreateView(layoutInflater, viewGroup, bundle);
        Context context = getContext();
        LithoView lithoView = null;
        if (context == null) {
            i = -693504521;
        } else {
            MigColorScheme A0c = 7zR.A0c(context);
            C17 c17 = (C17) 1Bn.A0A(82674);
            ImmutableList.Builder A0h = 4YU.A0h();
            Bundle bundle2 = this.mArguments;
            if (bundle2 != null && (parcelableArray = bundle2.getParcelableArray("orders_list")) != null) {
                for (Parcelable parcelable : parcelableArray) {
                    11T.A0I(parcelable, "null cannot be cast to non-null type com.facebook.messaging.nativepagereply.orders.threadsettings.model.BusinessInboxPlacedOrder");
                    BusinessInboxPlacedOrder businessInboxPlacedOrder = (BusinessInboxPlacedOrder) parcelable;
                    AnonymousClass001.A0k().append(businessInboxPlacedOrder.A03);
                    A0h.m11011add((Object) c17.A00(context, businessInboxPlacedOrder, A0c, null, null, AnonymousClass001.A0a(C1523Akc.class, r0).hashCode()));
                }
            }
            new 1Iw(context);
            lithoView = LithoView.A00(context, new QGU(A0c, CxE.A00(this, 69), 1Fj.A01(A0h)));
            i = -1593001690;
        }
        0FI.A08(i, A04);
        return lithoView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        Bundle bundle2;
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = 1vD.A00(view);
        if (getContext() == null || (bundle2 = this.mArguments) == null) {
            return;
        }
        long j = bundle2.getLong("page_id");
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            long j2 = bundle3.getLong("consumer_id");
            1UG A08 = 1BK.A08(1Br.A02(((BfV) 1Bn.A0A(82668)).A00), "biim_mark_as_x_all_orders_impression");
            if (A08.isSampled()) {
                A08.A6H("page_id", Long.valueOf(j));
                A08.A6H("consumer_id", Long.valueOf(j2));
                A08.BZL();
            }
        }
    }
}
