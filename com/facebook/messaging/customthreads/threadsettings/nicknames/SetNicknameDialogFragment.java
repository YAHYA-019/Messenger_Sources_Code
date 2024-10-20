package com.facebook.messaging.customthreads.threadsettings.nicknames;

import X.0D2;
import X.0FI;
import X.1BL;
import X.1BQ;
import X.1BV;
import X.1JF;
import X.1Lo;
import X.1iF;
import X.2Ov;
import X.3jB;
import X.C00i;
import X.C15h;
import X.JZj;
import X.KfH;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.widget.Button;
import android.widget.EditText;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: SetNicknameDialogFragment.class */
public class SetNicknameDialogFragment extends 2Ov {
    public EditText A00;
    public C00i A01;
    public ThreadSummary A02;
    public KfH A03;
    public String A04;
    public C15h A05;
    public C00i A06;
    public boolean A07;
    public final C00i A09 = 1BQ.A02(66067);
    public final C00i A0A = 1BV.A00(68334);
    public final C00i A0B = 1BQ.A02(49476);
    public final C00i A08 = 1BV.A00(82677);

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0327, code lost:
    
        if (r306 != null) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.app.Dialog A0n(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 981
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.customthreads.threadsettings.nicknames.SetNicknameDialogFragment.A0n(android.os.Bundle):android.app.Dialog");
    }

    public 1iF A17() {
        return new 1iF(442780740380519L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(1716288845);
        super.onCreate(bundle);
        FbUserSession A0G = 1BL.A0G(this);
        this.A05 = new 3jB(this, 1);
        this.A01 = 1Lo.A02(A0G, this, 16908);
        this.A06 = 1BV.A00(67527);
        Bundle requireArguments = requireArguments();
        Parcelable parcelable = requireArguments.getParcelable("thread_summary");
        parcelable.getClass();
        this.A02 = (ThreadSummary) parcelable;
        String string = requireArguments.getString("participant_id");
        string.getClass();
        this.A04 = string;
        this.A07 = requireArguments.getBoolean("use_thread_mode_color_scheme");
        0FI.A08(-1256952732, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(-1950049475);
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
        0FI.A08(1214735216, A02);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super/*X.0D2*/.onSaveInstanceState(bundle);
        EditText editText = this.A00;
        if (editText != null) {
            bundle.putString("nickname_input", editText.getText().toString());
        }
    }
}
