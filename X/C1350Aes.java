package X;

import android.text.style.ClickableSpan;
import android.view.View;
import com.facebook.messaging.cutover.plugins.dualthreadcutovercomposerblock.DualThreadCutoverComposerBlockImplementation;
import com.facebook.mig.bottomsheet.BaseMigBottomSheetDialogFragment;
import com.facebook.user.model.Name;
import com.facebook.user.model.User;

/* renamed from: X.Aes, reason: case insensitive filesystem */
/* loaded from: Aes.class */
public final class C1350Aes extends ClickableSpan {
    public final /* synthetic */ DualThreadCutoverComposerBlockImplementation A00;
    public final /* synthetic */ boolean A01;

    public C1350Aes(DualThreadCutoverComposerBlockImplementation dualThreadCutoverComposerBlockImplementation, boolean z) {
        this.A01 = z;
        this.A00 = dualThreadCutoverComposerBlockImplementation;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        User user;
        Name name;
        String str = null;
        if (!this.A01 && (user = this.A00.A04) != null && (name = user.A0X) != null) {
            str = name.firstName;
        }
        0D2 baseMigBottomSheetDialogFragment = new BaseMigBottomSheetDialogFragment();
        baseMigBottomSheetDialogFragment.A00 = str;
        baseMigBottomSheetDialogFragment.A0m(this.A00.A01, 7zK.A00(237));
    }
}
