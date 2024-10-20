package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.messaging.montage.model.cards.MontageStickerOverlayBounds;
import com.facebook.messaging.montage.model.cards.MontageTagSticker;
import com.facebook.messaging.photos.editing.InteractiveMentionStickerLayer;
import com.facebook.messaging.photos.editing.InteractiveStickerLayer;
import com.facebook.messaging.photos.editing.LayerEditText;
import com.facebook.user.model.User;
import com.facebook.widget.FbImageView;
import java.util.HashSet;

/* renamed from: X.Gow, reason: case insensitive filesystem */
/* loaded from: Gow.class */
public final class C2811Gow extends GpL implements CallerContextable {
    public static final String __redex_internal_original_name = "InteractiveMentionStickerLayerPresenter";
    public User A00;
    public Integer A01;
    public Integer A02;
    public final View A03;
    public final LinearLayout A04;
    public final InteractiveMentionStickerLayer A05;
    public final LayerEditText A06;
    public final HUV A07;
    public final HmU A08;
    public final FbImageView A09;

    /* JADX WARN: Type inference failed for: r0v12, types: [android.widget.TextView, com.facebook.messaging.photos.editing.LayerEditText] */
    public C2811Gow(TextWatcher textWatcher, LinearLayout linearLayout, InteractiveStickerLayer interactiveStickerLayer, HmU hmU, HUV huv, C62j c62j) {
        super(linearLayout, interactiveStickerLayer, huv, c62j);
        this.A01 = 0S2.A01;
        this.A02 = 0S2.A00;
        this.A04 = linearLayout;
        this.A05 = (InteractiveMentionStickerLayer) interactiveStickerLayer;
        this.A08 = hmU;
        ?? r0 = (LayerEditText) linearLayout.requireViewById(2131365802);
        this.A06 = r0;
        this.A03 = linearLayout.findViewById(2131365593);
        this.A09 = (FbImageView) linearLayout.findViewById(2131365801);
        this.A07 = huv;
        r0.addTextChangedListener(textWatcher);
    }

    public static void A00(C2811Gow c2811Gow, Integer num) {
        HAq hAq;
        if (c2811Gow.A01.equals(num)) {
            return;
        }
        c2811Gow.A01 = num;
        InteractiveMentionStickerLayer interactiveMentionStickerLayer = c2811Gow.A05;
        Integer num2 = 0S2.A00;
        interactiveMentionStickerLayer.A01 = num.equals(num2);
        ((GpL) c2811Gow).A03.A07(GOq.A00(c2811Gow.A01.equals(num2) ? 1 : 0));
        ViewGroup viewGroup = (ViewGroup) ((GpL) c2811Gow).A00.getParent();
        if (c2811Gow.A01.equals(num2)) {
            FrameLayout frameLayout = ((GpL) c2811Gow).A01;
            if (frameLayout.getParent() == null) {
                viewGroup.addView(frameLayout);
            }
        } else {
            AbstractC2326GOr.A0x(((GpL) c2811Gow).A01);
        }
        LinearLayout linearLayout = c2811Gow.A04;
        ViewGroup viewGroup2 = (ViewGroup) linearLayout.getParent();
        if (c2811Gow.A01.equals(num2)) {
            viewGroup2.invalidate();
            viewGroup2.requestLayout();
            viewGroup2.bringChildToFront(c2811Gow.A03);
        } else {
            6P9 r0 = c2811Gow.A06;
            AbstractC2327GOs.A0g(r0, false);
            r0.clearFocus();
            Context context = linearLayout.getContext();
            AbI.A06(context).hideSoftInputFromWindow(linearLayout.getWindowToken(), 0);
            if (context instanceof Activity) {
                ((Activity) context).getWindow().addFlags(1024);
            }
            if (r0.getText().length() == 0) {
                HUV huv = c2811Gow.A07;
                if (huv != null) {
                    IQ0 iq0 = huv.A00;
                    if (!iq0.A09.isEmpty() && iq0.A09.size() == 1 && (iq0.A09.get(0) instanceof C2811Gow)) {
                        IQ0.A09(iq0, ((IDq) iq0.A09.get(0)).A06);
                    }
                }
            } else {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                View view = c2811Gow.A03;
                view.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(view.getHeight(), 1073741824));
                if (view.getMeasuredWidth() > DKD.A08().widthPixels) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    layoutParams.width = view.getMeasuredWidth();
                    view.setLayoutParams(layoutParams);
                }
            }
        }
        c2811Gow.A0L();
        HUV huv2 = c2811Gow.A07;
        if (huv2 != null) {
            boolean equals = num.equals(num2);
            HtQ htQ = huv2.A00.A03;
            if (htQ != null) {
                IFl iFl = htQ.A01;
                if (equals) {
                    hAq = HAq.A0I;
                } else if (iFl.A0M != HAq.A0I) {
                    return;
                } else {
                    hAq = HAq.A0G;
                }
                IFl.A0B(iFl, hAq);
            }
        }
    }

    public static void A01(C2811Gow c2811Gow, Integer num) {
        int i;
        int i2 = -29399;
        int i3 = -1;
        if (num.equals(0S2.A01)) {
            i = 520093696;
        } else if (num.equals(0S2.A0C)) {
            i2 = (-1) << (-1);
            i = 352321535;
        } else {
            i2 = 1476395007;
            i = 855638016;
            if (!num.equals(0S2.A0N)) {
                i = -29399;
                i2 = -1;
                i3 = -16777216;
            }
        }
        c2811Gow.A02 = num;
        Drawable background = c2811Gow.A03.getBackground();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC;
        background.setColorFilter(i2, mode);
        c2811Gow.A06.setTextColor(i3);
        c2811Gow.A09.getBackground().setColorFilter(i, mode);
    }

    /* JADX WARN: Type inference failed for: r0v94, types: [com.facebook.messaging.montage.model.cards.MontageStickerOverlayBounds$MontageStickerOverlayBoundsBuilder, java.lang.Object] */
    public void A0L() {
        InteractiveMentionStickerLayer interactiveMentionStickerLayer;
        MontageTagSticker montageTagSticker;
        View view = this.A03;
        View A0H = GOn.A0H(view);
        if (A0H == null || this.A00 == null) {
            interactiveMentionStickerLayer = this.A05;
            montageTagSticker = null;
        } else {
            float A02 = GOq.A02(view);
            float A03 = GOq.A03(view);
            float A01 = A02 - (AbstractC2326GOr.A01(view, this) / 2.0f);
            float A04 = (A03 - (AbstractC2327GOs.A04(view, this) / 2.0f)) + (((DKC.A03(view) - DKC.A03(view)) / 2.0f) * A0A());
            PointF pointF = new PointF((AbstractC2326GOr.A01(view, this) / 2.0f) + A01, (AbstractC2327GOs.A04(view, this) / 2.0f) + A04);
            PointF pointF2 = new PointF(GOq.A02(view), GOq.A03(view));
            PointF A00 = R15.A00(R15.A00(new PointF(A01, A04), pointF2, A08()), R15.A00(pointF, pointF2, A08()), -A08());
            RectF A002 = this.A08.A00();
            float A022 = (DKC.A02(A0H) - A002.width()) / 2.0f;
            float A032 = (DKC.A03(A0H) - A002.height()) / 2.0f;
            ?? obj = new Object();
            obj.A00 = (A00.x - A022) / A002.width();
            obj.A01 = (A00.y - A032) / A002.height();
            obj.A04 = AbstractC2326GOr.A01(view, this) / A002.width();
            obj.A02 = AbstractC2327GOs.A04(view, this) / A002.height();
            obj.A03 = A08();
            MontageStickerOverlayBounds A003 = obj.A00();
            interactiveMentionStickerLayer = this.A05;
            HhW hhW = new HhW();
            hhW.A00 = A003;
            C1pq.A08("montageStickerOverlayBounds", A003);
            if (!hhW.A04.contains("montageStickerOverlayBounds")) {
                HashSet A1E = AbF.A1E(hhW.A04);
                hhW.A04 = A1E;
                A1E.add("montageStickerOverlayBounds");
            }
            String str = this.A00.A13;
            hhW.A02 = str;
            C1pq.A08("tagId", str);
            hhW.A03 = "PEOPLE";
            montageTagSticker = new MontageTagSticker(hhW);
        }
        interactiveMentionStickerLayer.A00 = montageTagSticker;
    }
}
