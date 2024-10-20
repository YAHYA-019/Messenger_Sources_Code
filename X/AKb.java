package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.messaging.highlightstab.model.HighlightsAttachmentContent;
import java.util.List;

/* loaded from: AKb.class */
public final class AKb extends C00q implements C00m {
    public final float A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AKb(Object obj, Object obj2, float f, int i) {
        super(0);
        this.A01 = i;
        this.A00 = f;
        this.A02 = obj;
        this.A03 = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        Canvas canvas;
        DOw dOw;
        float[] fArr;
        byte b;
        switch (this.A01) {
            case 0:
                float f = this.A00;
                for (HighlightsAttachmentContent highlightsAttachmentContent : (List) this.A02) {
                    int A05 = 7zR.A05(highlightsAttachmentContent.A03);
                    Integer num = highlightsAttachmentContent.A00;
                    if (A05 < (num != null ? num.intValue() : 0)) {
                        f = Math.max(f, f / ((float) 9nH.A00(highlightsAttachmentContent)));
                    }
                }
                return 7zL.A0w(7zL.A07(7zO.A00(7zQ.A0J(((C2k5) this.A03).A05), f)));
            case 1:
                canvas = (Canvas) this.A02;
                dOw = (DOw) this.A03;
                int[] iArr = DOw.A0b;
                canvas.rotate(dOw.A01, 0.0f, 0.0f);
                fArr = dOw.A0V;
                b = false;
                break;
            case 2:
                canvas = (Canvas) this.A02;
                dOw = (DOw) this.A03;
                int[] iArr2 = DOw.A0b;
                canvas.rotate(dOw.A01 + 90.0f, 0.0f, 0.0f);
                fArr = dOw.A0V;
                b = true;
                break;
            case 3:
                canvas = (Canvas) this.A02;
                dOw = (DOw) this.A03;
                int[] iArr3 = DOw.A0b;
                canvas.rotate(-dOw.A01, 0.0f, 0.0f);
                fArr = dOw.A0V;
                b = 2;
                break;
            default:
                C2k5 c2k5 = (C2k5) this.A02;
                2lQ r0 = 2lO.A02;
                2lO A0g = 7zL.A0g((2lO) null, 7zO.A0X(0S2.A0Y));
                long A07 = 7zL.A07(this.A00);
                2lO A0K = 4YV.A0K(4YV.A0K(A0g, 0S2.A0N, A07), 0S2.A0j, A07);
                C8Wa c8Wa = (C8Wa) this.A03;
                2lO A00 = A0K.A00(c8Wa.A01);
                C2sn A0L = 7zR.A0L(c2k5);
                5BO r02 = c8Wa.A00;
                return 7zM.A0l(new Dvw(r02, null, null, (AXM) (r02 != null ? ACU.A00 : ACT.A00), null, null, null, null, null, AUe.A00, 7zQ.A06()), A0L, c2k5, A00);
        }
        canvas.scale(fArr[b == true ? 1 : 0], this.A00, 0.0f, 0.0f);
        Paint paint = dOw.A0R;
        paint.setAlpha((int) (dOw.A0D.A00 * 255.0f));
        canvas.drawCircle(0.0f, 0.0f, 50.0f, paint);
        return 04S.A00;
    }
}
