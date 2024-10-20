package X;

import android.net.Uri;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: D1b.class */
public final class D1b implements C4j5 {
    public final AnonymousClass536 A00;
    public final String A01;

    public D1b(AnonymousClass536 anonymousClass536, String str) {
        11T.A0F(anonymousClass536, 1);
        this.A00 = anonymousClass536;
        this.A01 = str;
    }

    @Override // X.C4j5
    public /* bridge */ /* synthetic */ Object BMZ(InputStream inputStream, Integer num, long j) {
        Uri fromFile;
        try {
            File A0C = this.A00.A0C("ACT_TEMP_MEDIA", this.A01);
            if (A0C != null) {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(A0C);
                    try {
                        1SB.A00(inputStream, fileOutputStream);
                        fileOutputStream.close();
                        fromFile = Uri.fromFile(A0C);
                        11T.A0A(fromFile);
                        if (inputStream != null) {
                            inputStream.close();
                            return fromFile;
                        }
                    } finally {
                    }
                } catch (IOException e) {
                    0fH.A0p(CMW.A09, "failed to copy to FileOutputStream", e);
                }
                return fromFile;
            }
            if (inputStream != null) {
                inputStream.close();
            }
            fromFile = Uri.EMPTY;
            11T.A0B(fromFile);
            return fromFile;
        } finally {
        }
    }
}
