package com.facebook.messaging.dialog;

import X.06Z;
import X.0FI;
import X.0fH;
import X.1Bn;
import X.1Du;
import X.1iF;
import X.2Ov;
import X.6Gp;
import X.C5ic;
import X.DR6;
import X.JZj;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.messaging.dialog.MenuDialogFragment;
import com.facebook.messaging.dialog.MenuDialogItem;
import com.facebook.messaging.dialog.MenuDialogParams;
import kotlin.jvm.functions.Function1;

/* loaded from: MenuDialogFragment.class */
public class MenuDialogFragment extends 2Ov {
    public float A00 = -1.0f;
    public DialogInterface.OnDismissListener A01;
    public 6Gp A02;
    public MenuDialogParams A03;
    public C5ic A04;

    /* JADX WARN: Type inference failed for: r0v3, types: [com.facebook.messaging.dialog.MenuDialogFragment, androidx.fragment.app.Fragment] */
    public static MenuDialogFragment A05(MenuDialogParams menuDialogParams) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("menu_dialog_params", menuDialogParams);
        ?? menuDialogFragment = new MenuDialogFragment();
        menuDialogFragment.setArguments(bundle);
        return menuDialogFragment;
    }

    public void A0m(06Z r302, String str) {
        try {
            super/*X.0D2*/.A0m(r302, str);
        } catch (IllegalStateException e) {
            0fH.A0r("MenuDialogFragment", "show() called at a bad point in the lifecycle", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Dialog A0n(Bundle bundle) {
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            bundle2.setClassLoader(MenuDialogParams.class.getClassLoader());
            this.A03 = (MenuDialogParams) bundle2.getParcelable("menu_dialog_params");
        }
        this.A03.getClass();
        DR6 A02 = this.A04.A02(getContext());
        MenuDialogParams menuDialogParams = this.A03;
        int i = menuDialogParams.A00;
        String str = menuDialogParams.A03;
        if (i == 0) {
            A02.A03(str);
        } else {
            A02.A00(i);
        }
        CharSequence[] charSequenceArr = new CharSequence[this.A03.A01.size()];
        int i2 = 0;
        1Du it = this.A03.A01.iterator();
        while (it.hasNext()) {
            MenuDialogItem menuDialogItem = (MenuDialogItem) it.next();
            int i3 = menuDialogItem.A02;
            CharSequence charSequence = menuDialogItem.A05;
            if (i3 != 0) {
                charSequence = getString(i3);
            }
            charSequenceArr[i2] = charSequence;
            i2++;
        }
        final int i4 = 0;
        A02.A01(new DialogInterface.OnClickListener(this, i4) { // from class: X.9nh
            public final int A00;
            public final Object A01;

            {
                this.A00 = i4;
                this.A01 = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i5) {
                Function1 function1;
                boolean z;
                switch (this.A00) {
                    case 0:
                        MenuDialogFragment menuDialogFragment = (MenuDialogFragment) this.A01;
                        6Gp r0 = menuDialogFragment.A02;
                        if (r0 != null) {
                            MenuDialogParams menuDialogParams2 = menuDialogFragment.A03;
                            if (r0.C6c((MenuDialogItem) menuDialogParams2.A01.get(i5), menuDialogParams2.A02)) {
                                menuDialogFragment.A0p();
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        function1 = (Function1) this.A01;
                        z = true;
                        break;
                    case 2:
                        function1 = (Function1) this.A01;
                        z = false;
                        break;
                    case 7:
                        Intent A0A = 4YU.A0A(1BJ.A00(29));
                        2OZ r02 = (2OZ) this.A01;
                        A0A.setData(C0A2.A03(0Pz.A0W("package:", r02.requireContext().getPackageName())));
                        A0A.addCategory(AbstractC00603o4.A00(407));
                        A0A.addFlags(268435456);
                        ((08O) r02.A1H.get()).A03().A0A(r02.getContext(), A0A);
                    default:
                        dialogInterface.dismiss();
                        return;
                }
                7zN.A1a(function1, z);
            }
        }, charSequenceArr);
        JZj A04 = A02.A04();
        A04.show();
        if (this.A00 != -1.0f && A04.getWindow() != null) {
            A04.getWindow().setDimAmount(this.A00);
        }
        return A04;
    }

    public 1iF A17() {
        return new 1iF(211046320551505L);
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnDismissListener onDismissListener = this.A01;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(1688429571);
        super.onCreate(bundle);
        this.A04 = (C5ic) 1Bn.A0A(67527);
        0FI.A08(1390236135, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        int A02 = 0FI.A02(-1923843647);
        super/*androidx.fragment.app.Fragment*/.onPause();
        if (this.A03.A04) {
            A0p();
        }
        0FI.A08(-465342384, A02);
    }
}
