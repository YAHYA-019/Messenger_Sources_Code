package X;

import android.database.Cursor;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.Amc, reason: case insensitive filesystem */
/* loaded from: Amc.class */
public final class C1595Amc extends DAu {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final int A0L;
    public final int A0M;

    public C1595Amc(Cursor cursor) {
        super(cursor);
        this.A0I = cursor.getColumnIndexOrThrow("thread_key");
        this.A0K = cursor.getColumnIndexOrThrow("user_key");
        this.A0D = cursor.getColumnIndexOrThrow(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        this.A0H = cursor.getColumnIndexOrThrow("sms_participant_fbid");
        this.A06 = cursor.getColumnIndexOrThrow("is_commerce");
        this.A0J = cursor.getColumnIndexOrThrow(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        this.A05 = cursor.getColumnIndexOrThrow("is_admin");
        this.A00 = cursor.getColumnIndexOrThrow("admin_type");
        this.A07 = cursor.getColumnIndexOrThrow("is_pending_member");
        this.A0A = cursor.getColumnIndexOrThrow("last_read_receipt_time");
        this.A0B = cursor.getColumnIndexOrThrow("last_read_receipt_watermark_time");
        this.A09 = cursor.getColumnIndexOrThrow("last_delivered_receipt_time");
        this.A08 = cursor.getColumnIndexOrThrow("last_delivered_receipt_id");
        this.A0F = cursor.getColumnIndexOrThrow("request_timestamp_ms");
        this.A03 = cursor.getColumnIndexOrThrow("can_viewer_message_participant");
        this.A04 = cursor.getColumnIndexOrThrow("inviter_user_key");
        this.A0E = cursor.getColumnIndexOrThrow("request_source");
        this.A0C = cursor.getColumnIndexOrThrow("messaging_actor_type");
        this.A0M = cursor.getColumnIndexOrThrow(4YT.A00(79));
        this.A0G = cursor.getColumnIndexOrThrow("restriction_type");
        this.A02 = cursor.getColumnIndexOrThrow(4YT.A00(266));
        this.A01 = cursor.getColumnIndexOrThrow(4YT.A00(265));
        this.A0L = cursor.getColumnIndexOrThrow(1BJ.A00(2141));
    }
}
