package X;

import android.net.Uri;
import com.facebook.acra.constants.ActionId;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: D1c.class */
public final class D1c implements C4j5 {
    public final AnonymousClass536 A00;
    public final String A01;

    public D1c(AnonymousClass536 anonymousClass536, String str) {
        11T.A0F(anonymousClass536, 1);
        this.A00 = anonymousClass536;
        this.A01 = str;
    }

    @Override // X.C4j5
    public /* bridge */ /* synthetic */ Object BMZ(InputStream inputStream, Integer num, long j) {
        try {
            File A0C = this.A00.A0C("act_temp_media", this.A01);
            if (inputStream != null && A0C != null) {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(A0C);
                    try {
                        1SB.A00(inputStream, fileOutputStream);
                        fileOutputStream.close();
                        Uri fromFile = Uri.fromFile(A0C);
                        11T.A0A(fromFile);
                        inputStream.close();
                        return fromFile;
                    } finally {
                    }
                } catch (IOException e) {
                    0fH.A0p(C70n.__redex_internal_original_name, 4YT.A00(ActionId.VIEW_DID_LOAD_BEGIN), e);
                }
            }
            if (inputStream != null) {
                inputStream.close();
            }
            Uri uri = Uri.EMPTY;
            11T.A0B(uri);
            return uri;
        } finally {
        }
    }
}
