package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.distribgw.client.regionhint.DGWRegionHintManager;
import com.google.common.io.Closeables;
import com.google.common.util.concurrent.SettableFuture;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/* loaded from: I75.class */
public final class I75 {
    public final C00i A00 = 1BQ.A02(16469);

    public static void A00(Context context, Uri uri, File file) {
        InputStream inputStream;
        if (!DGWRegionHintManager.SERVICE_KEY_MSYS.equals(uri.getScheme())) {
            InputStream inputStream2 = null;
            try {
                inputStream2 = 69J.A02(uri) ? new URL(uri.toString()).openStream() : context.getContentResolver().openInputStream(uri);
                A01(file, inputStream2);
                if (inputStream != null) {
                    return;
                } else {
                    return;
                }
            } finally {
                if (inputStream2 != null) {
                    Closeables.A01(inputStream2);
                }
            }
        }
        C4Eo c4Eo = (C4Eo) 1Bn.A0A(84174);
        SettableFuture A0j = 4YU.A0j();
        c4Eo.A01(uri, new ITo(A0j));
        try {
            InputStream inputStream3 = (InputStream) A0j.get();
            0fH.A0j("LocalMediaDownloader", "copyMsysUriIntoFile: copyInputStreamIntoFile");
            A01(file, inputStream3);
        } catch (Throwable th) {
            0fH.A0r("LocalMediaDownloader", "copyMsysUriIntoFile get inputStream failure", th);
            throw new IOException(th);
        }
    }

    public static void A01(File file, InputStream inputStream) {
        try {
            FileOutputStream A14 = GOn.A14(file);
            try {
                byte[] bArr = new byte[8192];
                if (inputStream != null) {
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read != -1) {
                            A14.write(bArr, 0, read);
                        }
                    }
                }
                try {
                    A14.close();
                } catch (IOException unused) {
                }
            } catch (Throwable th) {
                th = th;
                try {
                    A14.close();
                    throw th;
                } catch (IOException unused2) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
