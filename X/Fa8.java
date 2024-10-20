package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.inject.FbInjector;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: Fa8.class */
public final class Fa8 implements InterfaceC08314mj {
    public final Context A00 = FbInjector.A00();

    /* JADX WARN: Type inference failed for: r0v76, types: [X.EkS, java.lang.Object] */
    @Override // X.InterfaceC08314mj
    public 2Jy AU5(String str, long j) {
        2Jy A0H = 4YU.A0H("db_size_info");
        A0H.A01 = j;
        A0H.A0D("pigeon_reserved_keyword_module", "device");
        C26T c26t = C26T.A00;
        C03353xs A0k = DKC.A0k(c26t);
        long j2 = 0;
        try {
            File[] listFiles = new File(this.A00.getFilesDir().getParentFile().getPath(), 4YT.A00(324)).listFiles();
            int length = listFiles.length;
            ArrayList A00 = 1JW.A00(length);
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    break;
                }
                File file = listFiles[i2];
                if (file.isFile()) {
                    j2 += file.length();
                    ?? obj = new Object();
                    ((EkS) obj).A01 = file.getName();
                    ((EkS) obj).A00 = file.length();
                    A00.add(obj);
                }
                i = i2 + 1;
            }
            Collections.sort(A00, EkS.A02);
            for (EkS ekS : A00.subList(0, Math.min(50, A00.size()))) {
                2DM A0g = 4YU.A0g(c26t);
                A0g.A0o(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, ekS.A01);
                A0g.A0j("size", ekS.A00);
                A0k.A0d(A0g);
            }
        } catch (Exception unused) {
        }
        A0H.A0C("db_folder_size", j2);
        A0H.A08(A0k, "db_top_sizes");
        return A0H;
    }
}
