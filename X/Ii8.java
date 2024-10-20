package X;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import com.facebook.inject.FbInjector;
import com.facebook.videocodec.base.SphericalMetadata;
import com.google.common.base.Platform;
import java.io.File;

/* loaded from: Ii8.class */
public final class Ii8 implements 5Hf {
    public final Context A00 = FbInjector.A00();
    public final C00i A01 = 1BQ.A02(116161);

    public HkO ARn(Uri uri) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(this.A00, uri);
            int i = -1;
            String extractMetadata = mediaMetadataRetriever.extractMetadata(18);
            if (!Platform.stringIsNullOrEmpty(extractMetadata)) {
                try {
                    i = Integer.parseInt(extractMetadata);
                } catch (NumberFormatException unused) {
                }
            }
            int i2 = -1;
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
            if (!Platform.stringIsNullOrEmpty(extractMetadata2)) {
                try {
                    i2 = Integer.parseInt(extractMetadata2);
                } catch (NumberFormatException unused2) {
                }
            }
            int i3 = -1;
            String extractMetadata3 = mediaMetadataRetriever.extractMetadata(20);
            if (!Platform.stringIsNullOrEmpty(extractMetadata3)) {
                try {
                    i3 = Integer.parseInt(extractMetadata3);
                } catch (NumberFormatException unused3) {
                }
            }
            int i4 = 0;
            String extractMetadata4 = mediaMetadataRetriever.extractMetadata(24);
            if (!Platform.stringIsNullOrEmpty(extractMetadata4)) {
                try {
                    i4 = Integer.parseInt(extractMetadata4);
                } catch (NumberFormatException unused4) {
                }
            }
            long j = 0;
            String extractMetadata5 = mediaMetadataRetriever.extractMetadata(9);
            if (!Platform.stringIsNullOrEmpty(extractMetadata5)) {
                try {
                    j = Long.parseLong(extractMetadata5);
                } catch (NumberFormatException unused5) {
                }
            }
            long j2 = -1;
            File A03 = GOn.A0K(this.A01).A03(uri);
            if (A03 != null) {
                j2 = A03.length();
            }
            return new HkO((SphericalMetadata) null, (String) null, (String) null, mediaMetadataRetriever.extractMetadata(23), mediaMetadataRetriever.extractMetadata(5), (String) null, (String) null, mediaMetadataRetriever.extractMetadata(4), i, i2, i4, i3, -1, j, j2);
        } finally {
            try {
                mediaMetadataRetriever.release();
            } catch (Exception unused6) {
            }
        }
    }
}
