package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.maps.FbMapViewDelegate;
import com.facebook.messaging.business.commerce.model.retail.CommerceBubbleModel;
import com.facebook.messaging.business.commerce.model.retail.CommerceData;
import com.facebook.messaging.business.commerce.model.retail.Receipt;
import com.facebook.messaging.business.commerce.model.retail.Shipment;
import com.facebook.messaging.business.commerce.model.retail.ShipmentTrackingEvent;
import com.facebook.widget.text.BetterTextView;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;

/* renamed from: X.GmN, reason: case insensitive filesystem */
/* loaded from: GmN.class */
public final class C2723GmN extends DYd implements CallerContextable {
    public static final CallerContext A0c = CallerContext.A06(C2723GmN.class);
    public static final String __redex_internal_original_name = "ShippingDetailsFragment";
    public View A00;
    public View A01;
    public View A02;
    public FrameLayout A03;
    public LinearLayout A04;
    public LinearLayout A05;
    public LinearLayout A06;
    public ScrollView A07;
    public FbUserSession A08;
    public C0dr A09;
    public FbDraweeView A0A;
    public FbMapViewDelegate A0B;
    public HwL A0C;
    public CommerceBubbleModel A0D;
    public Receipt A0E;
    public Shipment A0F;
    public Hr7 A0G;
    public I1w A0H;
    public I2W A0I;
    public HQl A0J;
    public 5iG A0K;
    public BetterTextView A0L;
    public BetterTextView A0M;
    public BetterTextView A0N;
    public BetterTextView A0O;
    public BetterTextView A0P;
    public BetterTextView A0Q;
    public BetterTextView A0R;
    public BetterTextView A0S;
    public BetterTextView A0T;
    public BetterTextView A0U;
    public BetterTextView A0V;
    public BetterTextView A0W;
    public BetterTextView A0X;
    public BetterTextView A0Y;
    public ImmutableList A0Z;
    public View A0a;
    public final C00i A0b = AbH.A0D();

    /* JADX WARN: Multi-variable type inference failed */
    public static void A03(C2723GmN c2723GmN, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        View inflate = View.inflate(c2723GmN.getContext(), 2132542877, c2723GmN.A06);
        int childCount = c2723GmN.A06.getChildCount();
        ((TextView) c2723GmN.A06.getChildAt(childCount - 2)).setText(str);
        TextView textView = (TextView) c2723GmN.A06.getChildAt(childCount - 1);
        if (TextUtils.isEmpty(str2)) {
            textView.setVisibility(8);
        } else {
            textView.setText(str2);
            textView.setVisibility(0);
        }
        int A07 = GOn.A07(7zO.A0D(c2723GmN), 2132279327);
        ViewGroup.MarginLayoutParams A0I = DKC.A0I(inflate);
        A0I.setMargins(A07, 0, A07, 0);
        inflate.setLayoutParams(A0I);
    }

    public 1iF A1R() {
        return AbF.A0C(675975893060109L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        this.A08 = 1BL.A0G(this);
        this.A0H = (I1w) 1Bn.A0A(116223);
        this.A0K = (5iG) 1Bn.A0A(49829);
        this.A0C = (HwL) 1Bn.A0A(116231);
        this.A0G = (Hr7) 1Bn.A0A(116226);
        this.A09 = (C0dr) 1Bi.A03(84488);
        this.A0I = (I2W) 7zO.A0l(this, 116227);
    }

    public String A1X(Context context) {
        return context.getString(2131954409);
    }

    public void A1Y(Context context, Parcelable parcelable) {
        Preconditions.checkState(parcelable instanceof CommerceData);
        CommerceBubbleModel commerceBubbleModel = ((CommerceData) parcelable).A00;
        commerceBubbleModel.getClass();
        Preconditions.checkState(HvM.A01(commerceBubbleModel.BHe()));
        this.A0D = commerceBubbleModel;
    }

    public void A1Z(HQl hQl) {
        this.A0J = hQl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Context getContext() {
        Context context = super/*androidx.fragment.app.Fragment*/.getContext();
        context.getClass();
        return context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onContextItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 2131363402) {
            return false;
        }
        String str = this.A0X.getText() == null ? new String() : this.A0X.getText().toString();
        ClipboardManager clipboardManager = (ClipboardManager) requireActivity().getSystemService("clipboard");
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText(getContext().getString(2131954409), str));
        }
        AbH.A1K(this.A0X, getContext().getColor(2132214289));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super/*X.1pK*/.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        requireActivity().getMenuInflater().inflate(2131623943, contextMenu);
        AbH.A1K(this.A0X, getContext().getColor(2132213973));
        MenuItem findItem = contextMenu.findItem(2131363401);
        if (findItem != null) {
            findItem.setVisible(false);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-1096242040);
        if (bundle != null && this.A0D == null) {
            this.A0D = (CommerceBubbleModel) bundle.getParcelable("fragment_state");
        }
        View A08 = AbG.A08(layoutInflater, viewGroup, 2132542878);
        0FI.A08(2089542187, A02);
        return A08;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroyView() {
        int A02 = 0FI.A02(1820963624);
        5iG r0 = this.A0K;
        r0.getClass();
        r0.A02();
        this.A0H.getClass();
        View view = this.A02;
        FrameLayout frameLayout = this.A03;
        LinearLayout linearLayout = this.A05;
        7zP.A1S(view, frameLayout, linearLayout);
        frameLayout.setVisibility(8);
        linearLayout.setVisibility(0);
        view.requestLayout();
        super/*androidx.fragment.app.Fragment*/.onDestroyView();
        0FI.A08(-478759358, A02);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super/*X.1pK*/.onSaveInstanceState(bundle);
        bundle.putParcelable("fragment_state", this.A0D);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStart() {
        int A02 = 0FI.A02(-2073834040);
        super/*androidx.fragment.app.Fragment*/.onStart();
        this.A0B.A04();
        0FI.A08(1555487613, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStop() {
        int A02 = 0FI.A02(452989251);
        super/*androidx.fragment.app.Fragment*/.onStop();
        MKs mKs = this.A0B.A00;
        if (mKs != null) {
            mKs.onStop();
        }
        0FI.A08(-2122614851, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        Shipment shipment;
        super/*X.1pK*/.onViewCreated(view, bundle);
        this.A0D.getClass();
        this.A02 = 7zL.A0F(this, 2131363173);
        this.A07 = (ScrollView) 7zL.A0F(this, 2131363202);
        FbMapViewDelegate fbMapViewDelegate = (FbMapViewDelegate) 7zL.A0F(this, 2131363200);
        this.A0B = fbMapViewDelegate;
        fbMapViewDelegate.A05(null);
        this.A0a = 7zL.A0F(this, 2131363201);
        this.A03 = (FrameLayout) 7zL.A0F(this, 2131363122);
        this.A05 = (LinearLayout) 7zL.A0F(this, 2131363195);
        this.A0L = GOp.A10(this, 2131363189);
        this.A00 = 7zL.A0F(this, 2131363190);
        this.A0M = GOp.A10(this, 2131363191);
        this.A01 = 7zL.A0F(this, 2131363192);
        this.A0Q = GOp.A10(this, 2131363197);
        this.A0P = GOp.A10(this, 2131363196);
        this.A0V = GOp.A10(this, 2131363206);
        this.A0W = GOp.A10(this, 2131363207);
        this.A0S = GOp.A10(this, 2131363203);
        this.A0T = GOp.A10(this, 2131363204);
        this.A0U = GOp.A10(this, 2131363205);
        this.A0O = GOp.A10(this, 2131363194);
        this.A0R = GOp.A10(this, 2131363199);
        this.A04 = (LinearLayout) 7zL.A0F(this, 2131363198);
        this.A06 = (LinearLayout) 7zL.A0F(this, 2131363210);
        this.A0Y = GOp.A10(this, 2131363213);
        this.A0X = GOp.A10(this, 2131363212);
        this.A0N = GOp.A10(this, 2131363187);
        this.A0A = (FbDraweeView) 7zL.A0F(this, 2131363188);
        View.OnClickListener A00 = IKE.A00(this, 15);
        this.A0L.setOnClickListener(A00);
        this.A0M.setOnClickListener(A00);
        IKm.A00(this.A0a, this, 3);
        IKN.A00(view, this, 0);
        this.A0X.setOnCreateContextMenuListener(this);
        CommerceBubbleModel commerceBubbleModel = this.A0D;
        Integer BHe = commerceBubbleModel.BHe();
        if (BHe == 0S2.A0N || BHe == 0S2.A1J) {
            Preconditions.checkState(commerceBubbleModel instanceof Shipment);
            shipment = (Shipment) commerceBubbleModel;
        } else {
            Preconditions.checkState(commerceBubbleModel instanceof ShipmentTrackingEvent);
            shipment = ((ShipmentTrackingEvent) commerceBubbleModel).A02;
            if (shipment == null) {
                return;
            }
        }
        String str = shipment.A0D;
        if (str != null) {
            if (this.A03 != null && this.A05 != null && this.mView != null) {
                this.A0H.getClass();
                View view2 = this.mView;
                FrameLayout frameLayout = this.A03;
                LinearLayout linearLayout = this.A05;
                7zP.A1S(view2, frameLayout, linearLayout);
                frameLayout.setVisibility(0);
                linearLayout.setVisibility(8);
                view2.requestLayout();
            }
            Hr7 hr7 = this.A0G;
            hr7.getClass();
            C0dr c0dr = this.A09;
            c0dr.getClass();
            long now = c0dr.now();
            5iG r0 = this.A0K;
            r0.getClass();
            r0.A08(new C2067Das(new InJ(0, now, hr7, this), 0), Qnm.A01, new J50(str, this, 2));
        }
    }
}
