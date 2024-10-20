package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.core.graphics.drawable.IconCompat;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: I25.class */
public final class I25 {
    public int A00;
    public final Paint A01;
    public final 1Br A02 = 1Bq.A00(65630);
    public final Paint A03 = DKC.A09();

    public I25() {
        Paint A0B = GOo.A0B();
        this.A01 = A0B;
        this.A00 = A0B.getColor();
    }

    private final Bitmap A00(Context context, Bitmap bitmap) {
        float f = 7zO.A0I(context).density;
        int i = (int) (108.0f * f);
        C00i c00i = this.A02.A00;
        2EU A04 = ((2DX) c00i.get()).A04(i, i);
        int i2 = (int) (72.0f * f);
        if ((i - i2) % 2 != 0) {
            i2++;
        }
        2EU A07 = ((2DX) c00i.get()).A07(bitmap, i2, i2, true);
        try {
            int i3 = (i - i2) / 2;
            Bitmap A0C = 7zL.A0C(A04);
            Canvas canvas = new Canvas(A0C);
            int Ami = ((MigColorScheme) 1Bn.A0A(16979)).Ami();
            if (Ami != this.A00) {
                this.A00 = Ami;
                this.A01.setColor(Ami);
            }
            canvas.drawRect(canvas.getClipBounds(), this.A01);
            Bitmap A0C2 = 7zL.A0C(A07);
            float f2 = i3;
            canvas.drawBitmap(A0C2, f2, f2, this.A03);
            Bitmap.Config config = A0C.getConfig();
            11T.A0D(config);
            Bitmap copy = A0C.copy(config, A0C.isMutable());
            11T.A0D(copy);
            A04.close();
            A07.close();
            return copy;
        } catch (Throwable th) {
            2EU.A04(A04);
            2EU.A04(A07);
            throw th;
        }
    }

    public final IconCompat A01(Context context, Bitmap bitmap) {
        IconCompat A00;
        if (bitmap != null) {
            Bitmap A002 = A00(context, bitmap);
            A002.getClass();
            IconCompat iconCompat = new IconCompat(5);
            iconCompat.A06 = A002;
            return iconCompat;
        }
        Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), 2132345095);
        if (decodeResource != null) {
            Bitmap A003 = A00(context, decodeResource);
            A003.getClass();
            A00 = new IconCompat(5);
            A00.A06 = A003;
        } else {
            A00 = IconCompat.A00(context.getResources(), context.getPackageName(), 2132345095);
        }
        11T.A0D(A00);
        return A00;
    }
}
