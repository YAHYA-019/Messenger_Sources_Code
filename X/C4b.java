package X;

import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.data.repository.threadsummary.interfaces.ThreadSummaryDataModel;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.service.model.ModifyThreadParams;

/* loaded from: C4b.class */
public final class C4b {
    public final AnonymousClass243 A00;
    public final C28m A01;
    public final ThreadSummary A02;
    public final CE9 A03;

    public C4b(AnonymousClass243 anonymousClass243, C28m c28m, CE9 ce9, ThreadSummary threadSummary) {
        this.A02 = threadSummary;
        this.A03 = ce9;
        this.A00 = anonymousClass243;
        this.A01 = c28m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData] */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Object, com.facebook.messaging.service.model.ModifyThreadParams$NicknamePair] */
    public MutableLiveData A00(FbUserSession fbUserSession, String str, String str2) {
        String str3 = str2;
        CE9 ce9 = this.A03;
        ThreadSummary threadSummary = this.A02;
        1BL.A1F(threadSummary, str);
        String A1C = AbF.A1C(threadSummary.BF2().A00.A00((AnonymousClass244) 1Bn.A0A(68334)), str);
        ThreadSummary A00 = CE9.A00(fbUserSession, ce9, threadSummary, str, str2);
        ThreadSummaryDataModel threadSummaryDataModel = C5xm.A00;
        ?? liveData = new LiveData(new ThreadSummaryDataModel(A00, "", "SUCCESS"));
        Bdf bdf = (Bdf) 1Br.A0B(ce9.A03);
        ThreadKey A0f = AbF.A0f(threadSummary);
        1BY r0 = bdf.A00.A00;
        1BV A01 = 1BV.A01(r0, 82025);
        if (2Gt.A09(threadSummary)) {
            long j = A0f.A02;
            if (j > -1) {
                ((C2z) A01.get()).A00(fbUserSession, String.valueOf(j), str, str2);
                0fH.A0j("CommonUpdateNicknameMutation", "Successfully updated participant nickname");
            }
        }
        5Q2 r02 = (5Q2) 1Lo.A04((Context) null, fbUserSession, r0, 68485);
        if (str2 == null) {
            str3 = "";
        }
        try {
            ?? obj = new Object();
            obj.A01 = str;
            obj.A00 = str3;
            r02.A08(new ModifyThreadParams(A0f, null, null, obj, null, null, "thread_settings", false, false, false, false, false, false));
            return liveData;
        } catch (Exception unused) {
            0fH.A0j("ThreadSummaryNicknameUpdater", "Failed to update participant nickname");
            CE9.A00(fbUserSession, ce9, threadSummary, str, A1C);
            7zP.A0O(ce9.A01).A00(liveData, new ThreadSummaryDataModel(A00, "Failed to update participant nickname", "ERROR"));
            return liveData;
        }
    }
}
