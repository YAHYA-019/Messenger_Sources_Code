package X;

import com.facebook.acra.util.HttpRequestMultipart;
import com.facebook.proxygen.utils.RequestDefragmentingOutputStream;
import com.facebook.zstd.ZstdOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.zip.GZIPOutputStream;

/* renamed from: X.4C3, reason: invalid class name */
/* loaded from: 4C3.class */
public abstract class C4C3 {
    public final String A00;

    public C4C3(String str) {
        if (str == null) {
            throw new IllegalArgumentException("MIME type may not be null");
        }
        this.A00 = str;
        int indexOf = str.indexOf(47);
        if (indexOf != -1) {
            str.substring(0, indexOf);
            str.substring(indexOf + 1);
        }
    }

    public long A00() {
        return this instanceof C4C6 ? ((C4C6) this).A01.length : this instanceof C4C2 ? -1 : ((C4Pu) this).A00;
    }

    public String A01() {
        if (this instanceof C4C6) {
            return ((C4C6) this).A00.name();
        }
        return null;
    }

    public String A02() {
        if (this instanceof C4C6) {
            return null;
        }
        return this instanceof C4C2 ? "message" : ((C4Pu) this).A01;
    }

    public String A03() {
        return this instanceof C4C6 ? "8bit" : HttpRequestMultipart.CONTENT_TRANSFER_ENCODING_BINARY;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.io.OutputStream, X.40p, java.io.FilterOutputStream] */
    public void A04(OutputStream outputStream) {
        if (this instanceof C4C6) {
            C4C6 c4c6 = (C4C6) this;
            if (outputStream == null) {
                throw AnonymousClass001.A0L("Output stream may not be null");
            }
            byte[] bArr = c4c6.A01;
            int length = bArr.length;
            for (int i = 0; i < length; i += RequestDefragmentingOutputStream.BODY_BUFFER_SIZE) {
                outputStream.write(bArr, i, Math.min(length - i, RequestDefragmentingOutputStream.BODY_BUFFER_SIZE));
            }
            outputStream.flush();
            return;
        }
        if (this instanceof C4C2) {
            C4C2 c4c2 = (C4C2) this;
            C00i c00i = C4Bq.A02;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(((2yD) c00i.get()).AZk(36315017934938489L) ? new ZstdOutputStream(outputStream, RequestDefragmentingOutputStream.BODY_BUFFER_SIZE, (int) 1BK.A0N(c00i).Auy(36596492911578041L)) : new GZIPOutputStream(outputStream));
            c4c2.A00.DBD(outputStreamWriter);
            outputStreamWriter.close();
            android.util.Log.d(C4Bq.__redex_internal_original_name, "Uploading falco events to server...");
            return;
        }
        C4Pu c4Pu = (C4Pu) this;
        long j = c4Pu.A00;
        ?? filterOutputStream = new FilterOutputStream(new 4RK(j, outputStream));
        c4Pu.A05(filterOutputStream);
        long j2 = filterOutputStream.A00;
        if (j2 < j) {
            throw new IOException(0Pz.A0u(4YT.A00(223), " bytes but got ", " bytes", j, j2));
        }
    }
}
