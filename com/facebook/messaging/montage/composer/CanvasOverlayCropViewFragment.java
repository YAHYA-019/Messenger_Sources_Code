package com.facebook.messaging.montage.composer;

import X.0D2;
import X.0FI;
import X.0S2;
import X.1BQ;
import X.1BV;
import X.1iF;
import X.1tJ;
import X.2Ov;
import X.7zL;
import X.AbF;
import X.AbG;
import X.AbH;
import X.C00i;
import X.C1u3;
import X.C2rp;
import X.GOn;
import X.HSZ;
import X.HSa;
import X.HeE;
import X.IKE;
import X.JIS;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.messaging.montage.composer.crop.CanvasOverlayCropDraweeView;
import com.facebook.messaging.montage.composer.crop.CanvasOverlayCropOverlayView;
import com.facebook.proxygen.TraceFieldType;

/* loaded from: CanvasOverlayCropViewFragment.class */
public class CanvasOverlayCropViewFragment extends 2Ov implements CallerContextable {
    public static final CallerContext A0I = CallerContext.A06(CanvasOverlayCropViewFragment.class);
    public Bitmap A02;
    public Rect A04;
    public Uri A05;
    public View A06;
    public View A07;
    public View A08;
    public View A09;
    public JIS A0A;
    public CanvasOverlayCropDraweeView A0B;
    public CanvasOverlayCropOverlayView A0C;
    public final C00i A0E = 1BV.A00(115986);
    public final C00i A0F = 1BQ.A01();
    public final C00i A0H = AbH.A0Q();
    public final C00i A0G = 1BQ.A02(65630);
    public Rect A03 = new Rect(0, 0, 0, 0);
    public int A01 = 0;
    public int A00 = 0;
    public HeE A0D = null;

    public static void A05(Rect rect, CanvasOverlayCropViewFragment canvasOverlayCropViewFragment) {
        View view;
        int i;
        if ((rect == null || canvasOverlayCropViewFragment.A03.equals(rect)) && canvasOverlayCropViewFragment.A00 == 0) {
            view = canvasOverlayCropViewFragment.A08;
            i = 8;
        } else {
            view = canvasOverlayCropViewFragment.A08;
            i = 0;
        }
        view.setVisibility(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Dialog A0n(Bundle bundle) {
        int i;
        A0g(1, 2132608337);
        Dialog A0n = super.A0n(bundle);
        Bundle bundle2 = this.mArguments;
        Rect rect = null;
        this.A05 = bundle2 == null ? null : (Uri) bundle2.getParcelable(TraceFieldType.Uri);
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            rect = (Rect) bundle3.getParcelable("rect");
        }
        this.A04 = rect;
        Bundle bundle4 = this.mArguments;
        int i2 = 0;
        if (bundle4 != null) {
            i2 = bundle4.getInt("rotation", 0);
        }
        this.A01 = i2;
        this.A00 = i2;
        Bundle bundle5 = this.mArguments;
        if (bundle5 != null && bundle5.containsKey("aspect") && (i = this.mArguments.getInt("aspect")) >= 0 && i < 0S2.A00(5).length) {
            this.A0D = new HeE(0S2.A00(5)[i]);
        }
        return A0n;
    }

    public 1iF A17() {
        return AbF.A0C(366696498039554L);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(532503056);
        View A08 = AbG.A08(layoutInflater, viewGroup, 2132542460);
        0FI.A08(1549477940, A02);
        return A08;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super/*X.0D2*/.onDismiss(dialogInterface);
        JIS jis = this.A0A;
        if (jis != null) {
            jis.onDismiss();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        1tJ.A04(((0D2) this).A01.getWindow(), 5381);
        View A0F = 7zL.A0F(this, 2131366812);
        this.A07 = A0F;
        IKE.A01(A0F, this, 76);
        ImageView imageView = (ImageView) this.A07;
        C00i c00i = this.A0H;
        GOn.A1P(imageView, C1u3.A0Z, GOn.A0M(c00i));
        View A0F2 = 7zL.A0F(this, 2131367023);
        this.A09 = A0F2;
        IKE.A01(A0F2, this, 77);
        GOn.A1P((ImageView) this.A09, C1u3.A5a, GOn.A0M(c00i));
        View A0F3 = 7zL.A0F(this, 2131366924);
        this.A08 = A0F3;
        IKE.A01(A0F3, this, 78);
        C2rp.A01(this.A08);
        CanvasOverlayCropOverlayView canvasOverlayCropOverlayView = (CanvasOverlayCropOverlayView) 7zL.A0F(this, 2131367889);
        this.A0C = canvasOverlayCropOverlayView;
        canvasOverlayCropOverlayView.A09 = new HSZ(this);
        CanvasOverlayCropDraweeView canvasOverlayCropDraweeView = (CanvasOverlayCropDraweeView) 7zL.A0F(this, 2131367888);
        this.A0B = canvasOverlayCropDraweeView;
        canvasOverlayCropDraweeView.A04 = new HSa(this);
        canvasOverlayCropDraweeView.A0Q(this.A05, A0I, this.A00);
        View A0F4 = 7zL.A0F(this, 2131363694);
        this.A06 = A0F4;
        IKE.A01(A0F4, this, 79);
        C2rp.A01(this.A06);
        if (this.A0D != null) {
            this.A07.setVisibility(8);
            this.A0C.A04(this.A0D);
        }
    }
}
