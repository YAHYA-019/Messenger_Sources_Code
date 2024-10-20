package X;

import android.database.Cursor;
import com.facebook.messaging.model.attachment.Attachment;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.facebook.messaging.model.threads.MontageThreadPreview;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.google.common.collect.ImmutableList;

/* renamed from: X.4up, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4up.class */
public final class C10824up {
    public static final String[] A0B = {"latest_montage_preview_message_id", "latest_montage_preview_message_type", "latest_montage_preview_attachments", "latest_montage_preview_text", "latest_montage_preview_sticker_id", "latest_montage_message_timestamp_ms", "latest_montage_preview_pending_send_attachment", "latest_montage_message_sender"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final C00i A08 = new 1BV(49392);
    public final C00i A09 = new 1BV(49399);
    public final C00i A0A = new 1BV(49391);

    public C10824up(Cursor cursor) {
        this.A02 = cursor.getColumnIndexOrThrow("latest_montage_preview_message_id");
        this.A04 = cursor.getColumnIndexOrThrow("latest_montage_preview_message_type");
        this.A07 = cursor.getColumnIndexOrThrow("latest_montage_preview_text");
        this.A06 = cursor.getColumnIndexOrThrow("latest_montage_preview_sticker_id");
        this.A01 = cursor.getColumnIndexOrThrow("latest_montage_preview_attachments");
        this.A03 = cursor.getColumnIndexOrThrow("latest_montage_message_timestamp_ms");
        this.A05 = cursor.getColumnIndexOrThrow("latest_montage_preview_pending_send_attachment");
        this.A00 = cursor.getColumnIndexOrThrow("latest_montage_message_sender");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v96, types: [com.facebook.ui.media.attachments.model.MediaResource] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.facebook.ui.media.attachments.model.MediaResource] */
    public void A00(CDt cDt, C1zm c1zm) {
        C1q8 c1q8;
        if (new ThreadSummary(c1zm).A0s == null) {
            Cursor cursor = cDt.A00;
            String string = cursor.getString(this.A02);
            Integer A00 = BUR.A00(C1q8.A00(cursor.getInt(this.A04)));
            MontageThreadPreview montageThreadPreview = null;
            if (string != null && A00 != null) {
                long j = cursor.getLong(this.A03);
                4yI r0 = (4yI) this.A0A.get();
                String string2 = cursor.getString(this.A00);
                ParticipantInfo A002 = string2 == null ? null : 4yI.A00(r0, r0.A00.A01(string2));
                int intValue = A00.intValue();
                if (intValue == 0) {
                    c1q8 = C1q8.A0N;
                } else if (intValue == 2) {
                    c1q8 = C1q8.A0A;
                } else if (intValue == 1) {
                    c1q8 = C1q8.A0M;
                } else {
                    if (intValue != 3) {
                        throw 1BK.A1F();
                    }
                    c1q8 = C1q8.A06;
                }
                if (A002 == null) {
                    throw AnonymousClass001.A0N("senderInfo cannot be null");
                }
                String string3 = cursor.getString(this.A06);
                String string4 = cursor.getString(this.A07);
                ImmutableList A03 = ((4yL) this.A08.get()).A03(cursor.getString(this.A01), string);
                Attachment A0T = A03.isEmpty() ? null : 4YU.A0T(A03, 0);
                ImmutableList A02 = ((4yT) this.A09.get()).A02(cursor.getString(this.A05));
                if (!A02.isEmpty()) {
                    montageThreadPreview = (MediaResource) A02.get(0);
                }
                montageThreadPreview = new MontageThreadPreview(A0T, c1q8, A002, null, montageThreadPreview, string, string3, string4, j);
            }
            c1zm.A0s = montageThreadPreview;
        }
    }
}
