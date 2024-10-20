package X;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mci.PrivacyContext;
import com.google.common.util.concurrent.SettableFuture;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: Cy2.class */
public final class Cy2 implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public Cy2(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj;
        this.A04 = str;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Throwable e;
        NullPointerException A0Q;
        switch (this.A00) {
            case 0:
                Boolean bool = (Boolean) obj;
                if (bool == null || !bool.booleanValue()) {
                    ((CFT) this.A03).A03 = true;
                    0fH.A0k("RealTimeSearchResource", "Error issuing search query");
                    return;
                } else {
                    0fH.A0l("RealTimeSearchResource", "Successful query");
                    CFT.A00((FbUserSession) this.A01, (C0G) this.A02, (CFT) this.A03, this.A04, true);
                    return;
                }
            case 1:
                1qX A14 = 7zM.A14((MailboxNullable) obj);
                if (A14 == null || 1qX.A00(A14) <= 0) {
                    return;
                }
                C10264sx c10264sx = (C10264sx) this.A03;
                String str = this.A04;
                Object obj2 = this.A01;
                FbUserSession fbUserSession = (FbUserSession) this.A02;
                if (A14.mResultSet.getInteger(0, 2) == 2) {
                    PrivacyContext A0t = AbH.A0t("AdvancedCrypto", "2971616476299527");
                    C1775As9 c1775As9 = new C1775As9();
                    c1775As9.A02 = 2;
                    c1775As9.A03 = 7zP.A0k(A14, 0);
                    c1775As9.A01 = A14.mResultSet.getNullableBoolean(0, 3);
                    MailboxFeature mailboxFeature = (MailboxFeature) 4YU.A0n(fbUserSession, c10264sx.A02, 67629);
                    1Um A0O = 1BK.A0O(mailboxFeature, 0);
                    MailboxFutureImpl A0P = 1BK.A0P(A0O);
                    1Um.A02(A0O, new Cyb(A0P, A0t, mailboxFeature, null, str, 1, 1), A0P, false);
                    A0P.addResultCallback(new Czi(8, obj2, fbUserSession, c1775As9, c10264sx));
                    return;
                }
                return;
            case 2:
                B9n b9n = (B9n) this.A01;
                SettableFuture settableFuture = (SettableFuture) this.A02;
                Context context = (Context) this.A03;
                String str2 = this.A04;
                69B r0 = (69B) obj;
                0fH.A0C(B9n.class, "Successfully resolved content token of TAM attachment");
                try {
                    String str3 = r0.A04;
                    if (str3 == null) {
                        A0Q = AnonymousClass001.A0Q("mCATamAttachmentManagerFilePathString in MCATamAttachmentManagerResolveContentTokenResult was null");
                    } else {
                        FileInputStream fileInputStream = new FileInputStream(new File(str3));
                        OutputStream openOutputStream = context.getContentResolver().openOutputStream(C0A2.A03(str2));
                        if (openOutputStream != null) {
                            B9n.A00(b9n, settableFuture, fileInputStream, openOutputStream, str2);
                            return;
                        } else {
                            fileInputStream.close();
                            A0Q = AnonymousClass001.A0Q("Failed to open URI shared by MWA");
                        }
                    }
                    settableFuture.setException(A0Q);
                    return;
                } catch (IOException e2) {
                    e = e2;
                    0fH.A0N(B9n.class, "Failed to open stream from returned input uri or provided output uri", e, new Object[0]);
                    settableFuture.setException(e);
                    return;
                } catch (NullPointerException e3) {
                    0fH.A0N(B9n.class, "Failed to parse destination audio uri", e3, new Object[]{e3});
                    e = AnonymousClass001.A0Q("Failed to parse destination audio uri");
                    settableFuture.setException(e);
                    return;
                } catch (SecurityException e4) {
                    0fH.A0N(B9n.class, "Failed to parse destination audio uri", e4, new Object[]{e4});
                    settableFuture.setException(new SecurityException("Failed to parse destination audio uri", e4));
                    return;
                }
            case 3:
                B9o b9o = (B9o) this.A01;
                SettableFuture settableFuture2 = (SettableFuture) this.A02;
                String str4 = this.A04;
                Context context2 = (Context) this.A03;
                MailboxNullable mailboxNullable = (MailboxNullable) obj;
                Object obj3 = mailboxNullable.value;
                if (obj3 == null) {
                    0fH.A0E(B9o.class, "Failed to fetch e2ee image from mailbox api");
                    settableFuture2.setException(AnonymousClass001.A0Q("loadMediaAttachment method returned null"));
                    return;
                } else {
                    if (AbM.A04(obj3) == 0) {
                        0fH.A0E(B9o.class, "Mailbox API returned 0 media attachment");
                        settableFuture2.setException(AnonymousClass001.A0L("Mailbox API returned 0 media attachment"));
                        return;
                    }
                    String A0i = 7zP.A0i((1qX) mailboxNullable.value, 0);
                    if (!TextUtils.isEmpty(A0i)) {
                        B9o.A00(context2, 2IA.A01(C0A2.A03(A0i)).A04(), b9o, settableFuture2, str4);
                        return;
                    } else {
                        0fH.A0E(B9o.class, "Preview url from mailbox api is empty");
                        settableFuture2.setException(AnonymousClass001.A0L("Preview url from mailbox api is empty"));
                        return;
                    }
                }
            default:
                MailboxFutureImpl mailboxFutureImpl = (MailboxFutureImpl) this.A02;
                MailboxNullable A0T = 1BL.A0T();
                Czl A00 = Czl.A00(this, 30);
                C1qL c1qL = C00683ob.A00;
                MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, A0T, 0, 0, "MCAMailboxSearch", "MetaAITypeaheadStatusForQuery", A00);
                return;
        }
    }
}
