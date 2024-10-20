package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.util.Base64;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.Callable;

/* renamed from: X.3iu, reason: invalid class name */
/* loaded from: 3iu.class */
public final class C3iu implements Callable {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final String A03;

    public C3iu(Object obj, String str, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A03 = str;
        this.A01 = i;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        if (this.A00 != 0) {
            byte[] decode = Base64.decode(this.A03, 0);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inMutable = true;
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
            NativeBlurFilter.iterativeBoxBlur(decodeByteArray, 2, this.A01);
            return new BitmapDrawable(Resources.getSystem(), decodeByteArray);
        }
        Cbc cbc = (Cbc) this.A02;
        2Tz r0 = (2Tz) 1Br.A0B(cbc.A08);
        2To A00 = Cbc.A00(cbc, this.A03);
        int i = this.A01;
        2U0 r02 = (2U0) 1Br.A0B(r0.A00);
        ((1GU) r02.A00.get()).AAr("MessagingContactsRankingStoreHelper must not be called on the main thread");
        return 2U0.A01(A00, r02, (ImmutableList) null, String.valueOf(i));
    }
}
