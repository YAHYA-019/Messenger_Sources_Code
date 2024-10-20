package X;

import android.net.Uri;
import com.facebook.messaging.model.messages.Message;
import com.facebook.msys.mca.MailboxNullable;
import java.util.AbstractCollection;

/* loaded from: DAb.class */
public final class DAb implements Runnable {
    public static final String __redex_internal_original_name = "MsysAdvancedCryptoAttachmentForwardHelper$sendAttachmentMessage$1";
    public final /* synthetic */ 5oV A00;
    public final /* synthetic */ Message A01;
    public final /* synthetic */ DFM A02;
    public final /* synthetic */ Bys A03;
    public final /* synthetic */ C7rh A04;
    public final /* synthetic */ MailboxNullable A05;
    public final /* synthetic */ Long A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;

    public DAb(5oV r302, Message message, DFM dfm, Bys bys, C7rh c7rh, MailboxNullable mailboxNullable, Long l, String str, String str2) {
        this.A05 = mailboxNullable;
        this.A03 = bys;
        this.A01 = message;
        this.A04 = c7rh;
        this.A07 = str;
        this.A06 = l;
        this.A08 = str2;
        this.A00 = r302;
        this.A02 = dfm;
    }

    public static void A00(Uri uri, C00i c00i, AbstractCollection abstractCollection) {
        abstractCollection.add(I6M.A02(uri, (22C) c00i.get()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x038c, code lost:
    
        if (r351 == null) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x010e, code lost:
    
        if (X.11T.A0P("video/", 1, r338) == true) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x0780, code lost:
    
        if (r351 == null) goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:619:0x0d5e, code lost:
    
        if (r348 != null) goto L626;
     */
    /* JADX WARN: Code restructure failed: missing block: B:660:0x1075, code lost:
    
        if (r0.A01(r0) == false) goto L664;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02b2, code lost:
    
        if (r350 == null) goto L99;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:627:0x0db2  */
    /* JADX WARN: Removed duplicated region for block: B:662:0x0fb7  */
    /* JADX WARN: Type inference failed for: r0v542, types: [java.lang.Boolean] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 4383
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DAb.run():void");
    }
}
