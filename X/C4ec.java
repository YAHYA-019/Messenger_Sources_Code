package X;

import android.R;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import java.util.Iterator;

/* renamed from: X.4ec, reason: invalid class name */
/* loaded from: 4ec.class */
public final class C4ec implements CallerContextable {
    public static final CallerContext A06 = CallerContext.A08(C4ec.class, "shortcut");
    public static final String __redex_internal_original_name = "InstallShortcutHelper";
    public 1BY A00;
    public final Context A01;
    public final Resources A02;
    public final C00i A03 = new 1BQ(65609);
    public final C00i A05 = new 1BQ(16432);
    public final C00i A04 = new 1BQ(65630);

    public C4ec(1BO r302) {
        this.A00 = new 1BY(r302);
        Context context = (Context) 1Bn.A0E((Context) null, (1BY) null, 83719);
        this.A01 = context;
        this.A02 = context.getResources();
    }

    public static Bitmap A00(Bitmap bitmap, C4ec c4ec, Integer num, int i) {
        float f;
        if (bitmap == null) {
            bitmap = BitmapFactory.decodeResource(c4ec.A02, 2131230782);
            if (bitmap == null) {
                return null;
            }
        }
        int A03 = c4ec.A03();
        Bitmap createBitmap = Bitmap.createBitmap(A03, A03, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawARGB(0, 0, 0, 0);
        Context context = c4ec.A01;
        2Mg r0 = 2Me.A02;
        canvas.drawColor(r0.A01(context));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(r0.A01(context));
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        float f2 = i;
        float max = Math.max(f2 / bitmap.getWidth(), f2 / bitmap.getHeight());
        int round = Math.round(bitmap.getWidth() * max);
        int round2 = Math.round(bitmap.getHeight() * max);
        int round3 = Math.round((A03 - round) / 2.0f);
        int round4 = Math.round((A03 - round2) / 2.0f);
        Rect rect2 = new Rect(round3, round4, round + round3, round2 + round4);
        if (num != 0S2.A01) {
            if (num == 0S2.A0C) {
                f = f2 / 2.0f;
            }
            canvas.drawBitmap(bitmap, rect, rect2, paint);
            return createBitmap;
        }
        f = f2 * 0.1f;
        int round5 = Math.round((A03 - i) / 2.0f);
        float f3 = round5;
        float f4 = round5 + i;
        canvas.drawRoundRect(new RectF(f3, f3, f4, f4), f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect2, paint);
        return createBitmap;
    }

    public static String A01(Intent intent) {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(intent.getComponent());
        A0k.append(intent.getDataString());
        A0k.append(intent.getExtras());
        return AnonymousClass001.A0d(intent.getAction(), A0k);
    }

    public static boolean A02(ShortcutManager shortcutManager, String str) {
        boolean z = false;
        if (str != null) {
            Iterator<ShortcutInfo> it = shortcutManager.getPinnedShortcuts().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ShortcutInfo next = it.next();
                if (next != null && str.equals(next.getId())) {
                    z = true;
                    break;
                }
            }
        }
        return z;
    }

    public int A03() {
        ActivityManager activityManager = (ActivityManager) this.A01.getSystemService("activity");
        return activityManager != null ? activityManager.getLauncherLargeIconSize() : this.A02.getDimensionPixelSize(R.dimen.app_icon_size);
    }

    public Bitmap A04(Bitmap bitmap, Integer num, String str) {
        if (bitmap == null) {
            return A00(bitmap, this, num, A03());
        }
        Context context = this.A01;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), bitmap);
        View inflate = LayoutInflater.from(context).inflate(2132543338, (ViewGroup) null, false);
        ImageView imageView = (ImageView) inflate.findViewById(2131366694);
        if (imageView != null) {
            imageView.setImageDrawable(bitmapDrawable);
        }
        TextView textView = (TextView) inflate.requireViewById(2131362351);
        if (str != null) {
            textView.setText(str);
        } else {
            textView.setVisibility(8);
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2132279353);
        inflate.measure(dimensionPixelSize, dimensionPixelSize);
        int measuredWidth = inflate.getMeasuredWidth();
        int measuredHeight = inflate.getMeasuredHeight();
        inflate.layout(0, 0, measuredWidth, measuredHeight);
        2EU A04 = ((2DX) this.A04.get()).A04(measuredWidth, measuredHeight);
        try {
            Bitmap bitmap2 = (Bitmap) A04.A09();
            inflate.draw(new Canvas(bitmap2));
            Bitmap copy = bitmap2.copy(bitmap2.getConfig(), bitmap2.isMutable());
            A04.close();
            return copy;
        } catch (Throwable th) {
            2EU.A04(A04);
            throw th;
        }
    }

    public Bitmap A05(Drawable drawable) {
        int A03 = A03();
        Bitmap createBitmap = Bitmap.createBitmap(A03, A03, Bitmap.Config.ARGB_8888);
        if (drawable != null) {
            Canvas canvas = new Canvas(createBitmap);
            Rect rect = new Rect(drawable.getBounds());
            drawable.setBounds(0, 0, A03, A03);
            drawable.draw(canvas);
            drawable.setBounds(rect);
        }
        return createBitmap;
    }

    public Bitmap A06(Integer num, String str) {
        Drawable drawable = this.A02.getDrawable(2131230725);
        int A03 = A03();
        Bitmap createBitmap = Bitmap.createBitmap(A03, A03, Bitmap.Config.ARGB_8888);
        if (drawable != null) {
            Canvas canvas = new Canvas(createBitmap);
            Rect rect = new Rect(drawable.getBounds());
            drawable.setBounds(0, 0, A03, A03);
            drawable.draw(canvas);
            drawable.setBounds(rect);
        }
        return A04(createBitmap, num, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d0, code lost:
    
        if (r303.getHeight() != r0) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A07(android.content.Intent r302, android.graphics.Bitmap r303, android.graphics.drawable.Drawable r304, java.lang.Class r305, java.lang.Integer r306, java.lang.String r307, java.lang.String r308, java.lang.String r309, java.util.Map r310, boolean r311) {
        /*
            Method dump skipped, instructions count: 625
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4ec.A07(android.content.Intent, android.graphics.Bitmap, android.graphics.drawable.Drawable, java.lang.Class, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.util.Map, boolean):void");
    }
}
