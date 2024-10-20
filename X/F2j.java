package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import com.facebook.common.callercontext.CallerContext;
import java.io.File;
import java.io.FileOutputStream;

/* loaded from: F2j.class */
public abstract class F2j {
    public static final Object A00(Context context, String str, 0DR r303, int i, long j) {
        5BY A03 = 5BS.A03();
        5BR A05 = A03.A05(4YU.A0C(context), 5Bm.A02(str, (java.util.Map) null));
        C2s7 A0d = 7zV.A0d(r303);
        A03.A02(A05, (2IE) null, CallerContext.A0B("ImagineNetworkService"), j).D3K(new GiD(i, 2, A0d), 1JU.A01);
        return A0d.A0C();
    }

    public static final String A01(Context context, Bitmap bitmap, String str) {
        File A0D = AnonymousClass001.A0D(context.getExternalFilesDir(Environment.DIRECTORY_PICTURES), "meta_ai_imagine");
        if (!A0D.exists()) {
            A0D.mkdir();
        }
        File[] listFiles = A0D.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                file.delete();
            }
        }
        File A0D2 = AnonymousClass001.A0D(A0D, 0Pz.A0j("meta_ai_imagine_", str, ".jpg"));
        if (bitmap.isRecycled()) {
            return null;
        }
        FileOutputStream fileOutputStream = new FileOutputStream(A0D2);
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
        fileOutputStream.flush();
        fileOutputStream.close();
        return Uri.fromFile(A0D2).toString();
    }
}
