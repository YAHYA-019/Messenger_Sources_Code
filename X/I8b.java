package X;

import android.text.Editable;
import android.widget.EditText;
import com.facebook.ipc.media.data.MimeType;
import com.facebook.messaging.model.messages.Message;
import com.facebook.stickers.model.Sticker;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.google.common.collect.ImmutableList;

/* loaded from: I8b.class */
public final class I8b {
    public final /* synthetic */ C2735Gmk A00;

    public I8b(C2735Gmk c2735Gmk) {
        this.A00 = c2735Gmk;
    }

    public static void A00(I8b i8b, C2735Gmk c2735Gmk, Sticker sticker) {
        if (A01(i8b, sticker)) {
            ((Hpb) c2735Gmk.A0L.A00.get()).A00(sticker, new Igm(c2735Gmk, 0));
        }
    }

    public static final boolean A01(I8b i8b, Sticker sticker) {
        1Br.A0C(i8b.A00.A0M);
        boolean z = true;
        if (6Bl.A02(sticker)) {
            z = false;
        }
        return z;
    }

    public void A02(Message message) {
        C2735Gmk c2735Gmk = this.A00;
        Hmj hmj = c2735Gmk.A01;
        if (hmj != null) {
            6Qe r0 = hmj.A00.A08;
            r0.A00.A1r(5Pz.A0P, message);
        }
        c2735Gmk.A0k();
        Hmj hmj2 = c2735Gmk.A01;
        if (hmj2 != null) {
            hmj2.A00.A08.A00.A1h();
        }
    }

    public void A03(MediaResource mediaResource) {
        boolean A0O;
        MediaResource mediaResource2;
        C2735Gmk c2735Gmk = this.A00;
        Hmj hmj = c2735Gmk.A01;
        if (hmj != null) {
            6R7 r0 = hmj.A00.A05;
            5Pz r02 = 5Pz.A0P;
            6QS r03 = r0.A00.A0I.A00;
            if (MimeType.A06.toString().equals(mediaResource.A0s) && (mediaResource2 = mediaResource.A0R) != null && MimeType.A03.toString().equals(mediaResource2.A0s)) {
                mediaResource = mediaResource2;
            }
            ((C9hh) r03.A02.get()).A00(r03.A1Y, "GIFS");
            6QS.A0E(r02, r03, "gif", ImmutableList.of((Object) mediaResource));
        }
        HzA hzA = (HzA) 1Br.A0B(c2735Gmk.A0N);
        EditText editText = c2735Gmk.A00;
        if (editText == null) {
            A0O = false;
        } else {
            Editable text = editText.getText();
            11T.A0A(text);
            A0O = 0CU.A0O(text);
        }
        if (!AnonymousClass001.A1O(hzA.A00.length())) {
            1UG A08 = 1BK.A08(1Br.A02(hzA.A02), 4YT.A00(400));
            if (A08.isSampled()) {
                GOn.A1Q(A08, hzA.A00);
                A08.A5c(A0O ? C98O.A0M : C98O.A0K, "send_source");
                A08.A7R("item_id", "");
                A08.A7R("item_collection_id", "");
                A08.BZL();
            }
        }
        c2735Gmk.A0k();
    }
}
