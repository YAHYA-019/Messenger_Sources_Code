package com.facebook.messaging.rollcall.mustachenux;

import X.0FI;
import X.0Q8;
import X.0S2;
import X.11T;
import X.1BM;
import X.1Iw;
import X.1LI;
import X.7zN;
import X.7zQ;
import X.7zS;
import X.83S;
import X.8Lf;
import X.9De;
import X.9KI;
import X.AnonymousClass001;
import X.BOr;
import X.C37s;
import X.C8xf;
import X.C9ey;
import X.QHO;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: CreatePromptsNuxFragment.class */
public final class CreatePromptsNuxFragment extends MigBottomSheetDialogFragment {
    public Message A00;
    public ThreadSummary A01;
    public FbUserSession A02;
    public final 9KI A03 = new 9KI(this);

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A05(CreatePromptsNuxFragment createPromptsNuxFragment, Integer num) {
        String str;
        String str2;
        String str3;
        ThreadSummary threadSummary = createPromptsNuxFragment.A01;
        if (threadSummary == null) {
            str3 = "threadSummary";
        } else {
            ThreadKey threadKey = threadSummary.A0n;
            if (threadKey == null) {
                return;
            }
            long j = threadKey.A04;
            FbUserSession fbUserSession = createPromptsNuxFragment.A02;
            if (fbUserSession != null) {
                C9ey c9ey = (C9ey) 7zN.A0m(createPromptsNuxFragment, fbUserSession, 68525);
                int intValue = num.intValue();
                if (intValue == 0) {
                    str = null;
                    str2 = "impression";
                } else if (intValue == 1) {
                    str2 = "tap";
                    str = "try_it";
                } else if (intValue != 2) {
                    str = null;
                    str2 = "dismiss";
                } else {
                    str2 = "tap";
                    str = "learn_more";
                }
                C9ey.A00(BOr.A0d, c9ey, str2, str, "prompt_nux", j);
                return;
            }
            str3 = "fbUserSession";
        }
        11T.A0L(str3);
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment, com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public 9De A1D() {
        return new C37s(75);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment
    public 1LI A1K(1Iw r302) {
        String A0s = 7zN.A0s(this, 2131952390);
        8Lf r0 = new 8Lf(83S.A00(this, 10), 83S.A00(this, 11), A0s, getString(2131964650));
        MigColorScheme A1F = A1F();
        String A0s2 = 7zN.A0s(this, 2131952391);
        String A0s3 = 7zN.A0s(this, 2131952388);
        return new QHO(r0, this.A03, C8xf.A00(2132411118), A1F, A0s2, A0s3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment
    public void onCreate(Bundle bundle) {
        Throwable A0v;
        int i;
        Parcelable.Creator creator;
        Parcelable.Creator creator2;
        int A02 = 0FI.A02(1998100260);
        super.onCreate(bundle);
        this.A02 = 1BM.A01(this);
        Bundle requireArguments = requireArguments();
        Object obj = Message.class.getDeclaredField("CREATOR").get(null);
        if (!(obj instanceof Parcelable.Creator) || (creator = (Parcelable.Creator) obj) == null) {
            A0v = 7zS.A0v(Message.class);
            i = -721960638;
        } else {
            Parcelable A0K = 7zQ.A0K(requireArguments, creator, Message.class, "Message");
            if (A0K != null) {
                this.A00 = (Message) A0K;
                Bundle requireArguments2 = requireArguments();
                Object A0q = 7zN.A0q("CREATOR", ThreadSummary.class);
                if (!(A0q instanceof Parcelable.Creator) || (creator2 = (Parcelable.Creator) A0q) == null) {
                    A0v = 7zS.A0v(ThreadSummary.class);
                    i = -854733853;
                } else {
                    Parcelable A0K2 = 7zQ.A0K(requireArguments2, creator2, ThreadSummary.class, "ThreadSummary");
                    if (A0K2 != null) {
                        this.A01 = (ThreadSummary) A0K2;
                        A05(this, 0S2.A00);
                        0FI.A08(-870517842, A02);
                        return;
                    }
                    A0v = AnonymousClass001.A0N("Required value was null.");
                    i = 1319609695;
                }
            } else {
                A0v = AnonymousClass001.A0N("Required value was null.");
                i = -2102514533;
            }
        }
        0FI.A08(i, A02);
        throw A0v;
    }
}
