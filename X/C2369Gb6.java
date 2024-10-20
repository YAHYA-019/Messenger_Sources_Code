package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.maps.FbStaticMapView;
import com.facebook.messaging.common.bitmaps.BitmapUtil;

/* renamed from: X.Gb6, reason: case insensitive filesystem */
/* loaded from: Gb6.class */
public final class C2369Gb6 extends Lrj {
    public static final String __redex_internal_original_name = "StaticMapView$1$1";
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ JlT A01;
    public final /* synthetic */ Lrj A02;

    public C2369Gb6(Drawable drawable, JlT jlT, Lrj lrj) {
        this.A01 = jlT;
        this.A00 = drawable;
        this.A02 = lrj;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [android.view.View, com.facebook.maps.FbStaticMapView] */
    @Override // X.Lrj, java.lang.Runnable
    public void run() {
        Hdx hdx;
        JlT jlT = this.A01;
        JYk jYk = jlT.A02;
        Drawable drawable = this.A00;
        ImageView imageView = (ImageView) jlT.A01;
        ?? r0 = (FbStaticMapView) jYk;
        if (r0.A02 > 0 || r0.A03 > 0 || r0.A01 > 0 || r0.A00 > 0) {
            r0.A05.setVisibility(0);
            if (!(drawable instanceof BitmapDrawable)) {
                throw AnonymousClass001.A0L("Expected BitmapDrawable instance as argument");
            }
            GSe gSe = new GSe(r0.getResources(), ((BitmapDrawable) drawable).getBitmap());
            gSe.A01(r0.A02);
            imageView.setImageDrawable(gSe);
        } else {
            imageView.setImageDrawable(drawable);
        }
        if (jYk.A03 > 0 && (hdx = jYk.A0A) != null) {
            new J7O(this);
            Bitmap createBitmap = Bitmap.createBitmap(1090, 280, Bitmap.Config.ARGB_8888);
            11T.A0A(createBitmap);
            hdx.A00.draw(new Canvas(createBitmap));
            C56 c56 = hdx.A01;
            AVD avd = new AVD(hdx.A02, 29);
            2EU A03 = ((2DX) 1Bi.A03(65630)).A03(545, 280);
            Canvas A0B = 7zR.A0B(A03);
            Matrix A0F = GOn.A0F();
            InterfaceC07034in.A01.BGs(A0F, new Rect(0, 0, 545, 280), 0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight());
            Paint A09 = DKC.A09();
            A09.setFilterBitmap(true);
            A0B.drawBitmap(createBitmap, A0F, A09);
            ((BitmapUtil) 1Br.A0B(c56.A00)).A08(CallerContext.A0B("EncryptedLocationXmaSenderUtil"), 2IA.A00(2131230768).A04(), new IUZ(A0B, A09, A03, c56, avd));
            jYk.A03 = 0L;
        }
        if (jYk.A09 == this.A02) {
            jYk.A09 = null;
        }
    }
}
