package X;

import android.graphics.Bitmap;
import com.facebook.platform.server.protocol.UploadStagingResourcePhotoMethod$Params;
import com.facebook.proxygen.TraceFieldType;
import com.google.common.collect.ImmutableList;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

/* loaded from: Fh3.class */
public final class Fh3 implements 1Ro {
    public static final String __redex_internal_original_name = "UploadStagingResourcePhotoMethod";

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        UploadStagingResourcePhotoMethod$Params uploadStagingResourcePhotoMethod$Params = (UploadStagingResourcePhotoMethod$Params) obj;
        11T.A0F(uploadStagingResourcePhotoMethod$Params, 0);
        Bitmap bitmap = uploadStagingResourcePhotoMethod$Params.A00;
        if (bitmap == null) {
            throw 1BK.A0h();
        }
        0fH.A0D(Fh3.class, "Uploading photos to staging_resources.");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        String str = uploadStagingResourcePhotoMethod$Params.A01;
        C4Pu c4Pu = new C4Pu("image/jpeg", byteArray.length, str);
        ((DpI) c4Pu).A00 = byteArray;
        C4C4 c4c4 = new C4C4(c4Pu, str);
        ArrayList A0s = AnonymousClass001.A0s();
        C04083zw A0T = DKC.A0T();
        AbF.A1Q(A0T, "uploadStagingResourcePhoto");
        A0T.A0F = "me/staging_resources";
        A0T.A06 = 0S2.A01;
        A0T.A0I = ImmutableList.of((Object) c4c4);
        A0T.A0J = A0s;
        return A0T.A01();
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        11T.A0F(anonymousClass439, 1);
        24X A0D = anonymousClass439.A01().A0D(TraceFieldType.Uri);
        if (A0D == null) {
            throw 1BK.A0h();
        }
        String A0H = A0D.A0H();
        11T.A0A(A0H);
        return A0H;
    }
}
