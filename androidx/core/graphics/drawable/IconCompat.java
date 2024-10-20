package androidx.core.graphics.drawable;

import X.0Pz;
import X.1BL;
import X.AbE;
import X.AnonymousClass001;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* loaded from: IconCompat.class */
public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode A0A = PorterDuff.Mode.SRC_IN;
    public int A00;
    public int A01;
    public int A02;
    public ColorStateList A03;
    public PorterDuff.Mode A04;
    public Parcelable A05;
    public Object A06;
    public String A07;
    public String A08;
    public byte[] A09;

    public IconCompat() {
        this.A02 = -1;
        this.A09 = null;
        this.A05 = null;
        this.A00 = 0;
        this.A01 = 0;
        this.A03 = null;
        this.A04 = A0A;
        this.A08 = null;
    }

    public IconCompat(int i) {
        this.A09 = null;
        this.A05 = null;
        this.A00 = 0;
        this.A01 = 0;
        this.A03 = null;
        this.A04 = A0A;
        this.A08 = null;
        this.A02 = i;
    }

    public static IconCompat A00(Resources resources, String str, int i) {
        str.getClass();
        if (i == 0) {
            throw AnonymousClass001.A0L("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.A00 = i;
        if (resources != null) {
            try {
                iconCompat.A06 = resources.getResourceName(i);
            } catch (Resources.NotFoundException unused) {
                throw AnonymousClass001.A0L("Icon resource cannot be found");
            }
        } else {
            iconCompat.A06 = str;
        }
        iconCompat.A07 = str;
        return iconCompat;
    }

    public static IconCompat A01(Bitmap bitmap) {
        bitmap.getClass();
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.A06 = bitmap;
        return iconCompat;
    }

    public static IconCompat A02(Bundle bundle) {
        Object byteArray;
        int i = bundle.getInt(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        IconCompat iconCompat = new IconCompat(i);
        iconCompat.A00 = bundle.getInt("int1");
        iconCompat.A01 = bundle.getInt("int2");
        iconCompat.A07 = bundle.getString("string1");
        if (bundle.containsKey("tint_list")) {
            iconCompat.A03 = (ColorStateList) bundle.getParcelable("tint_list");
        }
        if (bundle.containsKey("tint_mode")) {
            iconCompat.A04 = PorterDuff.Mode.valueOf(bundle.getString("tint_mode"));
        }
        switch (i) {
            case -1:
            case 1:
            case 5:
                byteArray = bundle.getParcelable("obj");
                break;
            case 0:
            default:
                Log.w("IconCompat", 0Pz.A0T(AbE.A00(357), i));
                return null;
            case 2:
            case 4:
            case 6:
                byteArray = bundle.getString("obj");
                break;
            case 3:
                byteArray = bundle.getByteArray("obj");
                break;
        }
        iconCompat.A06 = byteArray;
        return iconCompat;
    }

    public int A03() {
        int i = this.A02;
        if (i == -1) {
            return ((Icon) this.A06).getResId();
        }
        if (i == 2) {
            return this.A00;
        }
        throw 1BL.A0h(this, "called getResId() on ", AnonymousClass001.A0k());
    }

    public Bitmap A04() {
        Object obj;
        int i = this.A02;
        float f = 0.0f / 0.0f;
        if (i == -1) {
            obj = this.A06;
            if (!(obj instanceof Bitmap)) {
                return null;
            }
        } else {
            if (i != 1) {
                if (i != 5) {
                    throw 1BL.A0h(this, "called getBitmap() on ", AnonymousClass001.A0k());
                }
                Bitmap bitmap = (Bitmap) this.A06;
                int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
                Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(3);
                float f2 = min;
                float f3 = 0.5f * f2;
                float f4 = 0.9166667f * f3;
                float f5 = 0.010416667f * f2;
                paint.setColor(0);
                paint.setShadowLayer(f5, 0.0f, f2 * 0.020833334f, 1023410176);
                canvas.drawCircle(f3, f3, f4, paint);
                paint.setShadowLayer(f5, 0.0f, 0.0f, 503316480);
                canvas.drawCircle(f3, f3, f4, paint);
                paint.clearShadowLayer();
                paint.setColor(-16777216);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                Matrix matrix = new Matrix();
                matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
                bitmapShader.setLocalMatrix(matrix);
                paint.setShader(bitmapShader);
                canvas.drawCircle(f3, f3, f4, paint);
                canvas.setBitmap(null);
                return createBitmap;
            }
            obj = this.A06;
        }
        return (Bitmap) obj;
    }

    public Uri A05() {
        int i = this.A02;
        if (i == -1) {
            return ((Icon) this.A06).getUri();
        }
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.A06);
        }
        throw 1BL.A0h(this, "called getUri() on ", AnonymousClass001.A0k());
    }

    public InputStream A06(Context context) {
        StringBuilder A0k;
        String str;
        Uri A05 = A05();
        String scheme = A05.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(A05);
            } catch (Exception e) {
                e = e;
                A0k = AnonymousClass001.A0k();
                str = "Unable to load image from URI: ";
            }
        } else {
            try {
                return new FileInputStream(AnonymousClass001.A0E((String) this.A06));
            } catch (FileNotFoundException e2) {
                e = e2;
                A0k = AnonymousClass001.A0k();
                str = "Unable to load image from path: ";
            }
        }
        Log.w("IconCompat", AnonymousClass001.A0Z(A05, str, A0k), e);
        return null;
    }

    public String toString() {
        String str;
        int i;
        int i2 = this.A02;
        if (i2 == -1) {
            return String.valueOf(this.A06);
        }
        StringBuilder A0o = AnonymousClass001.A0o("Icon(typ=");
        switch (i2) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID;
                break;
        }
        A0o.append(str);
        switch (i2) {
            case 1:
            case 5:
                A0o.append(" size=");
                A0o.append(((Bitmap) this.A06).getWidth());
                A0o.append("x");
                i = ((Bitmap) this.A06).getHeight();
                A0o.append(i);
                break;
            case 2:
                A0o.append(" pkg=");
                A0o.append(this.A07);
                A0o.append(" id=");
                A0o.append(String.format("0x%08x", AnonymousClass001.A1a(A03())));
                break;
            case 3:
                A0o.append(" len=");
                A0o.append(this.A00);
                i = this.A01;
                if (i != 0) {
                    A0o.append(" off=");
                    A0o.append(i);
                    break;
                }
                break;
            case 4:
            case 6:
                A0o.append(" uri=");
                A0o.append(this.A06);
                break;
        }
        ColorStateList colorStateList = this.A03;
        if (colorStateList != null) {
            A0o.append(" tint=");
            A0o.append(colorStateList);
        }
        PorterDuff.Mode mode = this.A04;
        if (mode != A0A) {
            A0o.append(" mode=");
            A0o.append(mode);
        }
        return AnonymousClass001.A0d(")", A0o);
    }
}
