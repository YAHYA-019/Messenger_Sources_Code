package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.util.NotificationScope;
import com.facebook.securemessage.mca.MailboxSecureMessageJNI;

/* loaded from: Ibc.class */
public final class Ibc implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final String A07;

    public Ibc(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = obj3;
        this.A04 = obj5;
        this.A06 = str;
        this.A07 = str2;
        this.A02 = obj2;
        this.A03 = obj;
        this.A05 = obj4;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        boolean z;
        if (this.A00 != 0) {
            Mailbox mailbox = (Mailbox) obj;
            String A1D = 7zM.A1D(5Xd.A00, 22);
            NotificationScope A00 = Ic4.A00(mailbox.getSessionedNotificationCenterCallbackManager(), this, A1D, 20);
            7zL.A1O(A00, this.A02, A1D);
            MailboxSecureMessageJNI.dispatchVOOOOOOO(13, mailbox, this.A04, this.A05, this.A03, this.A06, this.A07, A00);
            return;
        }
        if (AnonymousClass001.A1V(obj)) {
            65V r0 = (65V) this.A04;
            String str = this.A06;
            String A02 = r0.A02(str);
            String str2 = this.A07;
            if (str2 == null) {
                str2 = "";
            }
            if (str2.equals(A02)) {
                r0.A04(str);
            } else {
                r0.A03(str);
            }
            I09 i09 = (I09) this.A01;
            i09.A04.get();
            1BK.A05().putString("message_reaction_type", str2);
            i09.A07.get();
            if (this.A02 == null) {
                return;
            } else {
                z = true;
            }
        } else {
            I09 i092 = (I09) this.A01;
            1BK.A1E(i092.A08).execute(new J1x((Context) this.A03, i092, "Reaction send ERROR", " Cannot send reactions via MSYS"));
            65V r02 = (65V) this.A04;
            7oP r03 = (7oP) this.A05;
            String str3 = this.A06;
            r02.A05(r03, str3);
            i092.A04.get();
            Bundle A05 = 1BK.A05();
            A05.putString("message_id", str3);
            A05.putSerializable("exception", "MSYS was not able to send reaction");
            i092.A07.get();
            if (this.A02 == null) {
                return;
            } else {
                z = false;
            }
        }
        0fH.A0j("HTReactions", 0Pz.A1C(7zK.A00(222), z));
    }
}
