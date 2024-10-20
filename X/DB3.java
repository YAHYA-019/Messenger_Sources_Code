package X;

import android.content.Context;
import android.util.Base64;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.tincan.database.models.RawTincanMessageContent;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* loaded from: DB3.class */
public final class DB3 implements Callable {
    public final /* synthetic */ RUJ A00;
    public final /* synthetic */ C8U A01;
    public final /* synthetic */ ThreadKey A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public DB3(RUJ ruj, C8U c8u, ThreadKey threadKey, String str, String str2) {
        this.A03 = str;
        this.A04 = str2;
        this.A01 = c8u;
        this.A00 = ruj;
        this.A02 = threadKey;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        ImmutableList build;
        String str;
        String str2;
        2Jd r313;
        String str3;
        Q7G q7g = new Q7G();
        GraphQlCallInput dgU = new DgU(38);
        dgU.A09("rapid_reporting_prompt_node_token", this.A03);
        String str4 = this.A04;
        if (str4 != null) {
            dgU.A09("responsible_id", str4);
        }
        C8U c8u = this.A01;
        RUJ ruj = this.A00;
        if (ruj != null) {
            ArrayList A0s = AnonymousClass001.A0s();
            BM9 A00 = ruj.A00();
            int ordinal = A00.ordinal();
            if (ordinal == 1 || ordinal == 2 || ordinal == 4) {
                r313 = new 2Jd(86);
                str3 = A00 == BM9.A02 ? "CELEBRITY_SELECTOR" : A00 == BM9.A04 ? "PAGE_SELECTOR" : "PERSON_SELECTOR";
            } else if (ordinal != 3) {
                0fH.A18("FeedbackReportMutator", "Unsupported evidence type: %s", new Object[]{A00});
            } else {
                r313 = new 2Jd(86);
                str3 = "SELECTED_MESSAGES";
            }
            r313.A09(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str3);
            r313.A09("payload", ruj.A01);
            A0s.add(r313);
            dgU.A0A("evidence_payload", A0s);
        }
        ThreadKey threadKey = this.A02;
        if (!ThreadKey.A0d(threadKey) && ThreadKey.A0j(threadKey)) {
            threadKey = ThreadKey.A0G(threadKey.A02, threadKey.A05);
        }
        ViewerContext BKF = c8u.A00.BKF();
        if (BKF == null || !BKF.mIsPageContext) {
            Bpj bpj = c8u.A06;
            ImmutableList immutableList = ruj != null ? ruj.A00 : null;
            1BY r0 = ((CGD) 1Br.A0B(bpj.A01)).A00;
            Cbd cbd = (Cbd) 1Lo.A04((Context) null, 1Fw.A05(r0), r0, 84719);
            try {
                ((5Xc) cbd.A0K.get()).AQX();
                MailboxFeature mailboxFeature = (MailboxFeature) cbd.A07.get();
                long A0r = threadKey.A0r();
                1Um A0O = 1BK.A0O(mailboxFeature, 0);
                MailboxFutureImpl A0P = 1BK.A0P(A0O);
                1Um.A02(A0O, Czf.A00(mailboxFeature, A0P, 22, A0r), A0P, false);
                1qX A0t = 7zL.A0t(A0P.get());
                ImmutableList.Builder builder = ImmutableList.builder();
                if (A0t != null) {
                    for (int i = 0; i < 1qX.A00(A0t); i++) {
                        long A0F = 7zQ.A0F(A0t, i);
                        long A03 = AbF.A03(A0t, i, 1);
                        String A0k = 7zP.A0k(A0t, i);
                        A0k.getClass();
                        builder.m11011add((Object) new RawTincanMessageContent(A0k.getBytes(), A0t.mResultSet.getString(i, 3) != null ? 4YU.A11(A0t, i, 3).getBytes() : null, A0F, A03));
                    }
                }
                build = builder.build();
            } catch (InterruptedException | ExecutionException e) {
                0fH.A0r(Cbd.__redex_internal_original_name, "Failed to load decrypted recent messages from msys db", e);
                C1UI.A01(Cbd.__redex_internal_original_name, "Failed to load decrypted recent messages from msys db");
                build = ImmutableList.builder().build();
            }
            ArrayList A0y = 7zO.A0y(build);
            1Du it = build.iterator();
            while (it.hasNext()) {
                RawTincanMessageContent rawTincanMessageContent = (RawTincanMessageContent) it.next();
                if (immutableList == null || !((str2 = rawTincanMessageContent.A02) == null || str2.length() == 0)) {
                    2Jd r02 = new 2Jd(96);
                    r02.A09("sender_id", String.valueOf(rawTincanMessageContent.A00));
                    r02.A08("send_time", Integer.valueOf((int) 4YU.A06(rawTincanMessageContent.A01)));
                    byte[] bArr = rawTincanMessageContent.A03;
                    str = "";
                    r02.A09("hmac", bArr != null ? Base64.encodeToString(bArr, 0) : str);
                    boolean A09 = ((1SI) 1Br.A0B(bpj.A00)).A09();
                    byte[] bArr2 = rawTincanMessageContent.A04;
                    if (A09) {
                        bArr2 = Base64.decode(bArr2, 0);
                    } else {
                        11T.A0D(bArr2);
                    }
                    r02.A09("salamander_thrift", bArr2 != null ? Base64.encodeToString(bArr2, 0) : "");
                    if (immutableList != null && immutableList.contains(rawTincanMessageContent.A02)) {
                        r02.A06("reported", true);
                    }
                    A0y.add(r02);
                } else {
                    0fH.A0o("TincanMessagesUploader", "Null or empty messageId for tincan message");
                }
            }
            if (!A0y.isEmpty()) {
                dgU.A0A("secure_thread_data", A0y);
            }
        }
        ((2Jf) q7g).A00.A01(dgU, "input");
        return new 5Dh(q7g);
    }
}
