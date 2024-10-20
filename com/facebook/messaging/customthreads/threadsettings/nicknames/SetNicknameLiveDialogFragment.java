package com.facebook.messaging.customthreads.threadsettings.nicknames;

import X.0D2;
import X.0FI;
import X.1BK;
import X.1BL;
import X.1BQ;
import X.1BV;
import X.1Bn;
import X.1JF;
import X.1Lo;
import X.1iF;
import X.2Ov;
import X.4YT;
import X.AbF;
import X.AbG;
import X.AbI;
import X.AbL;
import X.AbM;
import X.AnonymousClass243;
import X.C00i;
import X.C1F6;
import X.C28m;
import X.C4b;
import X.CE9;
import X.DEz;
import X.DGo;
import X.JZj;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.widget.Button;
import android.widget.EditText;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;

/* loaded from: SetNicknameLiveDialogFragment.class */
public class SetNicknameLiveDialogFragment extends 2Ov {
    public EditText A00;
    public FbUserSession A01;
    public DEz A02;
    public DGo A03;
    public C4b A04;
    public ThreadSummary A05;
    public User A06;
    public C00i A07;
    public C00i A08;
    public C00i A09;
    public User A0A;
    public boolean A0B;
    public final C00i A0D = 1BQ.A02(66067);
    public final C00i A0C = 1BV.A00(82677);

    /* JADX WARN: Type inference failed for: r0v7, types: [com.facebook.messaging.customthreads.threadsettings.nicknames.SetNicknameLiveDialogFragment, androidx.fragment.app.Fragment] */
    public static SetNicknameLiveDialogFragment A05(ThreadSummary threadSummary, User user, User user2) {
        Bundle A05 = 1BK.A05();
        A05.putParcelable("thread_summary", threadSummary);
        A05.putParcelable("viewer_user", user);
        A05.putParcelable("other_user", user2);
        A05.putBoolean(4YT.A00(463), true);
        ?? setNicknameLiveDialogFragment = new SetNicknameLiveDialogFragment();
        setNicknameLiveDialogFragment.setArguments(A05);
        return setNicknameLiveDialogFragment;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x02c9, code lost:
    
        if (r305 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0371, code lost:
    
        if (r305 != null) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.app.Dialog A0n(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 942
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.customthreads.threadsettings.nicknames.SetNicknameLiveDialogFragment.A0n(android.os.Bundle):android.app.Dialog");
    }

    public 1iF A17() {
        return AbF.A0C(442780740380519L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-154053506);
        super.onCreate(bundle);
        this.A01 = 1BL.A0G(this);
        this.A09 = AbI.A0L();
        Context requireContext = requireContext();
        this.A07 = 1BV.A00(68334);
        this.A08 = 1Lo.A00(requireContext, this.A01, 16908);
        Bundle requireArguments = requireArguments();
        ThreadSummary threadSummary = (ThreadSummary) AbG.A07(requireArguments, "thread_summary");
        this.A05 = threadSummary;
        C1F6 c1f6 = (C1F6) 1Bn.A0A(400);
        FbUserSession fbUserSession = this.A01;
        Context A01 = FbInjector.A01();
        AbL.A0y(c1f6);
        try {
            CE9 ce9 = new CE9(requireContext, fbUserSession);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A04 = new C4b((AnonymousClass243) this.A07.get(), (C28m) this.A08.get(), ce9, threadSummary);
            this.A06 = (User) AbG.A07(requireArguments, "viewer_user");
            if (requireArguments.getParcelable("other_user") != null) {
                this.A0A = (User) requireArguments.getParcelable("other_user");
            }
            this.A0B = requireArguments.getBoolean(4YT.A00(463));
            0FI.A08(-758801280, A02);
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        int A02 = 0FI.A02(-323294298);
        super.onDestroy();
        if (isAdded() && !isStateSaved()) {
            A0o();
        }
        0FI.A08(-1345467851, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(-547066883);
        super/*androidx.fragment.app.Fragment*/.onResume();
        EditText editText = this.A00;
        if (editText != null) {
            Editable text = editText.getText();
            JZj jZj = ((0D2) this).A01;
            jZj.getClass();
            Button button = jZj.A00.A0H;
            button.getClass();
            button.setEnabled(!1JF.A0A(text));
        }
        0FI.A08(-1770464785, A02);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super/*X.0D2*/.onSaveInstanceState(bundle);
        EditText editText = this.A00;
        if (editText != null) {
            bundle.putString("nickname_input", AbM.A0u(editText));
        }
    }
}
