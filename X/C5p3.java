package X;

import com.facebook.messaging.model.attachment.Attachment;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.secure.secrettypes.SecretString;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: X.5p3, reason: invalid class name */
/* loaded from: 5p3.class */
public final class C5p3 implements MailboxCallback {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ Attachment A03;
    public final /* synthetic */ 5PR A04;
    public final /* synthetic */ ThreadKey A05;
    public final /* synthetic */ C5p1 A06;
    public final /* synthetic */ SettableFuture A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;

    public C5p3(Attachment attachment, 5PR r303, ThreadKey threadKey, C5p1 c5p1, SettableFuture settableFuture, String str, String str2, String str3, String str4, long j, long j2, long j3, boolean z, boolean z2) {
        this.A06 = c5p1;
        this.A07 = settableFuture;
        this.A01 = j;
        this.A08 = str;
        this.A05 = threadKey;
        this.A00 = j2;
        this.A0A = str2;
        this.A03 = attachment;
        this.A0D = z;
        this.A02 = j3;
        this.A04 = r303;
        this.A0B = str3;
        this.A09 = str4;
        this.A0C = z2;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxNullable mailboxNullable = (MailboxNullable) obj;
        mailboxNullable.value.getClass();
        long j = ((1qX) mailboxNullable.value).mResultSet.getLong(0, 1);
        ((1qX) mailboxNullable.value).mResultSet.getString(0, 2);
        ((C2eo) this.A06.A05.get()).A07(new 5Vz() { // from class: X.5p7
            public void Bq7(ImmutableList immutableList) {
                if (immutableList.isEmpty()) {
                    0fH.A0j(1BJ.A00(297), "invalid user list");
                    C5p3.this.A07.setException(AnonymousClass001.A0N("invalid user list"));
                    return;
                }
                User user = (User) immutableList.get(0);
                C5p3 c5p3 = C5p3.this;
                SettableFuture settableFuture = c5p3.A07;
                5PI r0 = new 5PI();
                3pI r02 = new 3pI();
                r02.A09 = user.A0k;
                r02.A0D = user.A0X.displayName;
                r02.A01(Long.valueOf(user.A0K));
                r02.A02(Long.valueOf(user.A0L));
                r02.A06 = c5p3.A01;
                r0.A0K = r02.A00();
                r0.A0A(new SecretString(c5p3.A08));
                r0.A0V = c5p3.A05;
                r0.A05 = c5p3.A00;
                r0.A0E(c5p3.A0A);
                Attachment attachment = c5p3.A03;
                r0.A0G(attachment == null ? ImmutableList.of() : ImmutableList.of((Object) attachment));
                r0.A1x = c5p3.A0D;
                r0.A06 = c5p3.A02;
                r0.A0B = c5p3.A04;
                r0.A1f = c5p3.A0B;
                r0.A1e = c5p3.A09;
                r0.A16 = Boolean.valueOf(c5p3.A0C);
                settableFuture.set(new Message(r0));
            }
        }, ImmutableList.of((Object) Long.valueOf(j)));
    }
}
