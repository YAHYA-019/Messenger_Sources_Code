package X;

import android.net.Uri;
import com.facebook.messaging.sharedalbum.model.MediaResourceList;
import com.facebook.messaging.sharedalbum.repository.RepositoryHelperKt;
import com.facebook.ui.media.attachments.model.MediaResource;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.functions.Function1;

/* loaded from: A3i.class */
public final class A3i implements JJ6 {
    public final /* synthetic */ C6kg A00;
    public final /* synthetic */ MediaResource A01;
    public final /* synthetic */ File A02;
    public final /* synthetic */ Function1 A03;

    public A3i(C6kg c6kg, MediaResource mediaResource, File file, Function1 function1) {
        this.A01 = mediaResource;
        this.A02 = file;
        this.A00 = c6kg;
        this.A03 = function1;
    }

    @Override // X.JJ6
    public void CIc(Uri uri) {
        0fH.A0k("SharedAlbumRepositoryHelper", AnonymousClass001.A0Z(uri, "Failed to retrieve backing file for tam uri: ", AnonymousClass001.A0k()));
    }

    @Override // X.JJ6
    public void CId(Uri uri) {
        MediaResource mediaResource = this.A01;
        File file = this.A02;
        C6kg c6kg = this.A00;
        Function1 function1 = this.A03;
        try {
            if (C0A2.A03(file.getPath()) != null) {
                if (file.exists()) {
                    uri = Uri.fromFile(file);
                }
                C5en A00 = C5en.A00();
                A00.A01(mediaResource);
                A00.A0E = uri;
                MediaResource A0Y = 4YU.A0Y(A00);
                11T.A0D(uri);
                try {
                    byte[] A04 = c6kg.A04(uri);
                    if (A04 != null) {
                        function1.invoke(RepositoryHelperKt.A04(new MediaResourceList(11T.A03(A0Y)), c6kg, A04));
                    }
                } catch (IOException e) {
                    0fH.A0w("SharedAlbumRepositoryHelper", "Failed to get bytes from uri", e);
                }
            }
        } catch (SecurityException unused) {
        }
    }
}
