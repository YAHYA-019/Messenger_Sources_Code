package X;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import com.facebook.messaging.attachments.ImageAttachmentData;
import com.facebook.messaging.attachments.VideoAttachmentData;
import com.facebook.messaging.attachments.model.ImageAttachmentDataList;
import com.facebook.messaging.dialog.MenuDialogItem;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.montage.composer.MontageComposerActivity;
import com.facebook.messaging.montage.composer.model.MontageComposerFragmentParams;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.collect.ImmutableList;

/* renamed from: X.9y6, reason: invalid class name */
/* loaded from: 9y6.class */
public final class C9y6 implements 6Ge {
    public final 1Br A02 = 7zM.A0U();
    public final 1Br A01 = 1Bu.A00(81928);
    public final 1Br A03 = 1Bu.A00(68426);
    public final 1Br A00 = 1Bq.A00(49420);
    public final 1Br A04 = 7zM.A0M();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.9g5] */
    public MenuDialogItem AJY(Context context, Parcelable parcelable, Message message, String str) {
        ?? obj = new Object();
        obj.A02 = BNO.A05.id;
        obj.A04 = parcelable;
        obj.A03 = 2131954956;
        C9g5.A00(C1u3.A6H, 7zP.A0S(this.A02), obj);
        obj.A06 = DKB.A00(20);
        return new MenuDialogItem((C9g5) obj);
    }

    public String AaH() {
        return "CLick on Menu Item: Add to Story";
    }

    public boolean C6Z(Context context, View view, 06Z r304, MenuDialogItem menuDialogItem, Message message, ThreadSummary threadSummary, 64W r308, 63D r309, MigColorScheme migColorScheme, boolean z) {
        MediaResource A01;
        boolean z2 = false;
        4YV.A1M(context, 0, message);
        7zU.A1Q((C3E) 1Br.A0B(this.A01), BNO.A05);
        C00i c00i = this.A00.A00;
        ImmutableList A0E = ((C12114ys) c00i.get()).A0E(message);
        VideoAttachmentData A0B = ((C12114ys) c00i.get()).A0B(message);
        if (A0E.isEmpty()) {
            if (A0B != null) {
                A01 = C7t8.A01(A0B, message);
            }
            return z2;
        }
        A01 = C7t8.A00((ImageAttachmentData) A0E.get(0), message);
        if (A01 != null) {
            MontageComposerFragmentParams.Builder builder = new MontageComposerFragmentParams.Builder();
            builder.A0D = C6r6.A0n;
            builder.A0C = C6x5.A02;
            builder.A0F = A01;
            builder.A09 = C6x1.A05;
            ((08O) this.A04.get()).A06().A0A(context, MontageComposerActivity.A12(context, builder.A00(), NavigationTrigger.A03("messenger_montage_in_thread_broadcast_flow")));
            z2 = true;
        }
        return z2;
    }

    public boolean Cyd(Context context, Parcelable parcelable, Message message, ThreadSummary threadSummary, Capabilities capabilities, boolean z) {
        C1q8 A04;
        11T.A0F(message, 1);
        boolean z2 = false;
        if (!z && (A04 = message.A04()) != C1q8.A0M && A04 != C1q8.A0A && !C1q7.A09(message) && parcelable != null && ((parcelable instanceof ImageAttachmentData) || (((parcelable instanceof VideoAttachmentData) && 1Br.A07(((C9Jk) 1Br.A0B(this.A03)).A00).AZk(72341229383389687L)) || ((parcelable instanceof ImageAttachmentDataList) && !((ImageAttachmentDataList) parcelable).A00())))) {
            z2 = 1Br.A07(((C9Jk) 1Br.A0B(this.A03)).A00).AZk(72341229383193076L);
        }
        return z2;
    }
}
