package X;

import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import com.facebook.messaging.reactions.FastMessageReactionsPanelView;
import com.facebook.messaging.reactions.MessageReactionsOverlayFragment;
import com.mapbox.mapboxsdk.R;

/* renamed from: X.84r, reason: invalid class name */
/* loaded from: 84r.class */
public final class C84r implements C62i {
    public final int A00;
    public final Object A01;

    public C84r(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static 8CL A00(Drawable drawable, int i) {
        return new 8CL(i, 2, drawable);
    }

    @Override // X.C62i
    public void CQS() {
        switch (this.A00) {
            case 0:
                FastMessageReactionsPanelView fastMessageReactionsPanelView = (FastMessageReactionsPanelView) this.A01;
                6nG r0 = fastMessageReactionsPanelView.A0N;
                fastMessageReactionsPanelView.A0D.setColorFilter(((6JM) r0.A00.get()).A02(fastMessageReactionsPanelView.A0K.A00).Abp(), PorterDuff.Mode.SRC_IN);
                Resources resources = fastMessageReactionsPanelView.getResources();
                fastMessageReactionsPanelView.setElevation(7zL.A01(resources, 2132279305));
                fastMessageReactionsPanelView.setOutlineProvider(C5B1.A00());
                8CL A00 = A00(fastMessageReactionsPanelView.A0D, resources.getDimensionPixelSize(R.dimen.mapbox_locationComponentTrackingInitialMoveThreshold));
                if (A00 != null) {
                    fastMessageReactionsPanelView.setOutlineProvider(A00);
                }
                Paint paint = new Paint();
                paint.setStyle(Paint.Style.FILL);
                paint.setAntiAlias(true);
                paint.setColor(fastMessageReactionsPanelView.A0W.A00(fastMessageReactionsPanelView.A0K.A00).A07);
                fastMessageReactionsPanelView.A0C = paint;
                TextPaint textPaint = new TextPaint(1);
                textPaint.setTextSize(7zL.A01(resources, 2132279337));
                textPaint.setTypeface(2KQ.A04.A00(fastMessageReactionsPanelView.getContext()));
                textPaint.setColor(fastMessageReactionsPanelView.A0W.A02(fastMessageReactionsPanelView.A0K.A00).B9Q());
                fastMessageReactionsPanelView.A0G = textPaint;
                fastMessageReactionsPanelView.invalidate();
                return;
            case 1:
                MessageReactionsOverlayFragment.A06((MessageReactionsOverlayFragment) this.A01);
                return;
            case 2:
                C62h c62h = (C62h) this.A01;
                String str = c62h.A01;
                if (str != null) {
                    java.util.Map map = c62h.A0A;
                    6kC r02 = (6kC) map.get(str);
                    if (r02 == null || !r02.A00.A04) {
                        return;
                    }
                    C9bx A002 = ((9Ym) c62h.A04.get()).A00(c62h.A06.A00);
                    String str2 = c62h.A01;
                    map.put(str2, new 6kC(A002, str2));
                    return;
                }
                return;
            default:
                C6Ff.A02((C6Ff) this.A01);
                return;
        }
    }
}
