package X;

import android.net.Uri;
import androidx.core.view.inputmethod.InputContentInfoCompat;
import com.facebook.messaging.media.download.params.response.DownloadedMedia;
import com.facebook.ui.media.attachments.source.MediaResourceSendSource;
import com.google.common.util.concurrent.SettableFuture;

/* loaded from: ABw.class */
public final class ABw implements 1K9 {
    public final int A00;
    public final InputContentInfoCompat A01;
    public final 5HV A02;
    public final 1ED A03;
    public final SettableFuture A04;

    public ABw(InputContentInfoCompat inputContentInfoCompat, 5HV r303, 1ED r304, SettableFuture settableFuture, int i) {
        this.A00 = i;
        this.A01 = inputContentInfoCompat;
        this.A04 = settableFuture;
        this.A02 = r303;
        this.A03 = r304;
    }

    public void onFailure(Throwable th) {
        0R0 r0 = 0R0.$redex_init_class;
        if ((this.A00 & 1) != 0) {
            try {
                this.A01.releasePermission();
            } catch (Exception unused) {
            }
        }
        0fH.A0z("CommitContentHandler", "Error downloading commit content uri %s", th, new Object[]{this.A01.getContentUri()});
        this.A04.setException(th);
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Uri uri;
        DownloadedMedia downloadedMedia = (DownloadedMedia) obj;
        0R0 r0 = 0R0.$redex_init_class;
        if ((this.A00 & 1) != 0) {
            try {
                this.A01.releasePermission();
            } catch (Exception unused) {
            }
        }
        if (downloadedMedia == null || (uri = downloadedMedia.A00) == null) {
            0fH.A14("CommitContentHandler", "Error downloading commit content uri %s, media result %s", new Object[]{this.A01.getContentUri(), downloadedMedia == null ? "n/a" : R0r.A00(downloadedMedia.A01)});
            this.A04.setException(AnonymousClass001.A0T("Media not found"));
            return;
        }
        C5en c5en = new C5en();
        c5en.A0P = 5HP.A0F;
        c5en.A0E = uri;
        c5en.A0V = new MediaResourceSendSource(C5es.A0d, C5et.PICK);
        InputContentInfoCompat inputContentInfoCompat = this.A01;
        if (inputContentInfoCompat.getDescription().getMimeTypeCount() > 0) {
            c5en.A0q = inputContentInfoCompat.getDescription().getMimeType(0);
        }
        this.A04.setFuture(this.A03.D3C(new J5V(c5en, this, 1)));
    }
}
