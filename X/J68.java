package X;

import com.google.common.collect.ImmutableSet;
import com.google.common.io.FileWriteMode;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;

/* loaded from: J68.class */
public final class J68 implements ResponseHandler {
    public final File A00;
    public final /* synthetic */ IPe A01;

    public /* synthetic */ J68(IPe iPe, File file) {
        this.A01 = iPe;
        this.A00 = file;
    }

    @Override // org.apache.http.client.ResponseHandler
    public /* bridge */ /* synthetic */ Object handleResponse(HttpResponse httpResponse) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(httpResponse.getEntity().getContent());
        try {
            File file = this.A00;
            ImmutableSet A08 = ImmutableSet.A08(new FileWriteMode[0]);
            bufferedInputStream.getClass();
            C05364dl c05364dl = new C05364dl(C05364dl.A03);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file, A08.contains(FileWriteMode.A01));
                c05364dl.A00(fileOutputStream);
                1SB.A00(bufferedInputStream, fileOutputStream);
                fileOutputStream.flush();
                bufferedInputStream.close();
                return null;
            } finally {
            }
        } catch (Throwable th) {
            bufferedInputStream.close();
            throw th;
        }
    }
}
