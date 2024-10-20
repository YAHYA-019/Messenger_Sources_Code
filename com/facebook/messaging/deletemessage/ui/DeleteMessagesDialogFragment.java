package com.facebook.messaging.deletemessage.ui;

import X.06Z;
import X.0FI;
import X.1BY;
import X.1Bn;
import X.4YV;
import X.7zO;
import X.AbF;
import X.AnonymousClass001;
import X.BKl;
import X.BRW;
import X.Bv4;
import X.BxS;
import X.C0D1;
import X.C1666Ap8;
import X.C1yg;
import X.CHy;
import X.CkG;
import X.DMV;
import X.JgM;
import X.MIN;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import com.facebook.messaging.dialog.ConfirmActionDialogFragment;
import com.facebook.messaging.dialog.ConfirmActionParams;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.quicklog.reliability.CancelReason;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.RegularImmutableSet;

/* loaded from: DeleteMessagesDialogFragment.class */
public class DeleteMessagesDialogFragment extends ConfirmActionDialogFragment {
    public BRW A00;
    public ThreadKey A01;
    public Bv4 A02;
    public ImmutableSet A03;
    public ImmutableSet A04;
    public boolean A05;

    @Override // com.facebook.messaging.dialog.ConfirmActionDialogFragment
    public Dialog A0n(Bundle bundle) {
        Dialog A0n = super.A0n(bundle);
        A0n.setOnShowListener(null);
        return A0n;
    }

    public void A0o() {
        BRW brw = this.A00;
        JgM jgM = brw.A00;
        if (jgM != null) {
            jgM.A1Q((MIN) null);
        }
        DMV dmv = brw.A01;
        if (dmv != null) {
            dmv.dismiss();
            brw.A01 = null;
        }
        super/*X.0D2*/.A0p();
    }

    @Override // com.facebook.messaging.dialog.ConfirmActionDialogFragment
    public void A1C() {
        Bv4 bv4 = this.A02;
        if (bv4 != null) {
            4YV.A0Z(bv4.A04.A0F).flowEndCancel(bv4.A00, CancelReason.USER_CANCELLED);
        }
        A0o();
    }

    public void onCancel(DialogInterface dialogInterface) {
        Bv4 bv4 = this.A02;
        if (bv4 != null) {
            4YV.A0Z(bv4.A04.A0F).flowEndCancel(bv4.A00, CancelReason.USER_CANCELLED);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.messaging.dialog.ConfirmActionDialogFragment
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(2031897113);
        super.onCreate(bundle);
        this.A00 = (BRW) 7zO.A0l(this, 82678);
        Bundle bundle2 = this.mArguments;
        bundle2.getClass();
        Message message = (Message) bundle2.getParcelable("message");
        message.getClass();
        this.A03 = AbF.A11(message.A1V);
        String str = message.A1g;
        this.A04 = str != null ? AbF.A11(str) : RegularImmutableSet.A05;
        this.A01 = message.A0V;
        this.A05 = bundle2.getBoolean("isChannel", false);
        this.A03.size();
        ConfirmActionParams confirmActionParams = (ConfirmActionParams) bundle2.getParcelable("params");
        if (confirmActionParams == null) {
            Resources A0D = 7zO.A0D(this);
            String string = getString(2131955696);
            String string2 = A0D.getString(2131955666);
            String string3 = A0D.getString(2131964336);
            int i = 2131955663;
            if (this.A05) {
                i = 2131955665;
            }
            String string4 = A0D.getString(i);
            BxS bxS = new BxS(string2, string3);
            bxS.A02 = string;
            bxS.A03 = string4;
            bxS.A01 = BKl.A01;
            confirmActionParams = new ConfirmActionParams(bxS);
        }
        super.A00 = confirmActionParams;
        if (C0D1.A01(this.mFragmentManager)) {
            BRW brw = this.A00;
            Context context = getContext();
            06Z r0 = this.mFragmentManager;
            CkG ckG = new CkG(this);
            boolean A1W = AnonymousClass001.A1W(this.A01.A06, C1yg.MONTAGE);
            JgM jgM = brw.A00;
            if (jgM == null || !jgM.A1S()) {
                Resources resources = context.getResources();
                JgM A01 = JgM.A01(r0, "deleteMessagesOperation");
                brw.A00 = A01;
                A01.A02 = new C1666Ap8(resources, ckG, brw, 0);
                CHy cHy = (CHy) 1Bn.A0E(context, (1BY) null, 82650);
                JgM jgM2 = brw.A00;
                int i2 = 2131959725;
                if (A1W) {
                    i2 = 2131966453;
                }
                jgM2.A1Q(cHy.A02(context, resources.getString(i2)));
            }
        }
        0FI.A08(-1105349890, A02);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super/*X.0D2*/.onDismiss(dialogInterface);
    }
}
