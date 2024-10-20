package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.messaging.accountswitch.SwitchSavedAccountDialogFragment;

/* loaded from: Cia.class */
public final class Cia implements DEo {
    public final /* synthetic */ SwitchSavedAccountDialogFragment A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public Cia(SwitchSavedAccountDialogFragment switchSavedAccountDialogFragment, String str, String str2) {
        this.A00 = switchSavedAccountDialogFragment;
        this.A02 = str;
        this.A01 = str2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.facebook.messaging.accountswitch.SwitchSavedAccountDialogFragment, androidx.fragment.app.Fragment] */
    @Override // X.DEo
    public void CN2() {
        ?? r0 = this.A00;
        Brn brn = (Brn) r0.A0A.get();
        Context context = r0.getContext();
        String str = this.A02;
        String str2 = this.A01;
        if (str != null) {
            try {
                Uri A03 = C0A2.A03(str);
                if (A03 != null) {
                    ((FIu) 1Br.A0B(brn.A00)).A0A(context, A03, BSU.A00(str2));
                }
            } catch (SecurityException unused) {
            }
        }
    }
}
