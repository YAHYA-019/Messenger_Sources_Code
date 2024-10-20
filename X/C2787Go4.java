package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* renamed from: X.Go4, reason: case insensitive filesystem */
/* loaded from: Go4.class */
public final class C2787Go4 extends AbstractC2788Go5 implements JOk {
    public final /* synthetic */ I0M A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2787Go4(I0M i0m) {
        super(i0m);
        this.A00 = i0m;
    }

    @Override // X.JOk
    public void Blj(Bitmap bitmap) {
        2EU r310;
        Bitmap A0C;
        11T.A0F(bitmap, 0);
        if (super.A00) {
            return;
        }
        I0M i0m = this.A00;
        if (i0m.A00 == null) {
            BnD();
            return;
        }
        GOq.A0i(i0m.A07).markerPoint(5505153, "PHOTO_BITMAP_READY");
        2EU r0 = i0m.A00;
        if (r0 == null || (A0C = 7zL.A0C(r0)) == null) {
            r310 = null;
        } else {
            Bitmap.Config config = A0C.getConfig();
            if (config == null) {
                throw 1BK.A0h();
            }
            r310 = ((2DX) 1Br.A0B(i0m.A06)).A05(config, A0C.getWidth(), A0C.getHeight());
            Canvas A0B = 7zR.A0B(r310);
            A0B.drawBitmap(A0C, GOn.A0F(), null);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            Paint A09 = DKC.A09();
            A09.setShader(bitmapShader);
            RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
            float width = A0C.getWidth() * 0.0336f;
            A0B.translate(width, width);
            float f = 1.0f;
            if (A0C.getHeight() != 0 && bitmap.getHeight() != 0) {
                f = 0.3f * (A0C.getHeight() / bitmap.getHeight());
                A0B.scale(f, f);
            }
            float width2 = A0C.getWidth() * 0.0189f;
            if (f > 0.0f) {
                width2 /= f;
            }
            A0B.drawRoundRect(rectF, width2, width2, A09);
            A0C.recycle();
            bitmap.recycle();
        }
        I0M.A00(i0m);
        try {
            i0m.A0A.A01(r310);
            C9lD c9lD = (C9lD) 1Br.A0B(i0m.A08);
            if (C9lD.A01(c9lD, i0m.A0C)) {
                C9lD.A00(c9lD).flowMarkPoint(c9lD.A00, "step_wise_capture_2_end");
            }
            if (r310 != null) {
                2EU A07 = r310.A07();
                Context context = (Context) i0m.A0D.get();
                if (context != null) {
                    GOp.A1G(i0m.A05).execute(new J0V(A07, this, ((HnB) 1Lm.A05(context, 4YV.A0E(context), 99907)).A00("photo", ".png")));
                } else {
                    A07.close();
                    4YV.A11(i0m.A09).execute(new J0T(this, i0m, AnonymousClass001.A0T("Failed to create file")));
                }
            }
            2EU.A04(r310);
        } catch (Throwable th) {
            2EU.A04(r310);
            throw th;
        }
    }

    @Override // X.JHs
    public void BnD() {
        super.BnD();
        I0M i0m = this.A00;
        C9lD c9lD = (C9lD) 1Br.A0B(i0m.A08);
        if (C9lD.A01(c9lD, i0m.A0C)) {
            C9lD.A00(c9lD).flowMarkPoint(c9lD.A00, "step_wise_capture_2_cancel");
        }
    }

    @Override // X.JHs
    public void BnG(Exception exc) {
        11T.A0F(exc, 0);
        super.BnG(exc);
        I0M i0m = this.A00;
        C9lD c9lD = (C9lD) 1Br.A0B(i0m.A08);
        String str = i0m.A0C;
        String message = exc.getMessage();
        if (C9lD.A01(c9lD, str)) {
            C9lD.A00(c9lD).flowMarkPoint(c9lD.A00, "step_wise_capture_2_error", message);
        }
    }
}
