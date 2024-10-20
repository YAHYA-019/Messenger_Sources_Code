package com.facebook.bloks.messenger.implementations.plugins.core.opendialog;

import X.11T;
import X.7zO;
import X.DKC;
import X.DKD;
import X.DKE;
import X.DKc;
import X.DLQ;
import X.F2e;
import X.FGp;
import X.FHh;
import X.FJv;
import X.Fwk;
import X.FyG;
import android.R;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.SparseArray;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.TextView;

/* loaded from: MSGBloksOpenDialogImplementation.class */
public final class MSGBloksOpenDialogImplementation {
    public static int A00(String str, int i) {
        int i2;
        if (str.equals("destructive")) {
            i2 = -50637;
            if (i != 0) {
                return -46782;
            }
        } else if (str.equals("cancel")) {
            i2 = -16777216;
            if (i != 0) {
                return -1;
            }
        } else {
            i2 = -16089857;
            if (i != 0) {
                i2 = -12412161;
            }
        }
        return i2;
    }

    public static SparseArray A01(DLQ dlq) {
        SparseArray sparseArray = null;
        String string = dlq.getString(46);
        if (string != null) {
            sparseArray = new SparseArray();
            sparseArray.append(2131367929, string);
        }
        return sparseArray;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object A02(Fwk fwk, FHh fHh, DKc dKc) {
        byte b;
        byte b2;
        byte b3;
        Button button;
        Button button2;
        Button button3;
        String str = null;
        String str2 = null;
        String str3 = null;
        11T.A0F(fwk, 0);
        FyG fyG = fHh.A03;
        if (fyG == null) {
            return null;
        }
        DLQ A0i = DKE.A0i(dKc, 0);
        11T.A0F(A0i, 3);
        Context context = fwk.A00;
        boolean z = fyG.A05;
        AlertDialog.Builder builder = new AlertDialog.Builder(context, z ? 16974374 : 16974394);
        String A0B = A0i.A0B();
        if (A0B != null) {
            Context context2 = builder.getContext();
            int applyDimension = (int) TypedValue.applyDimension(1, 24.0f, 7zO.A0I(context2));
            int applyDimension2 = (int) TypedValue.applyDimension(1, 18.0f, 7zO.A0I(context2));
            TextView textView = new TextView(context2, null, R.attr.textAppearanceMedium);
            textView.setText(A0B);
            FGp.A00();
            11T.A0F("sans-serif-medium", 1);
            textView.setTypeface(F2e.A00("sans-serif-medium"));
            textView.setTextColor(z ? -1 : -14277082);
            textView.setPadding(applyDimension, applyDimension2, applyDimension, 0);
            builder.setCustomTitle(textView);
        }
        CharSequence A0A = A0i.A0A();
        if (A0A != null) {
            builder.setMessage(A0A);
        }
        DLQ A06 = A0i.A06(36);
        SparseArray sparseArray = null;
        if (A06 == null) {
            b = false;
        } else {
            sparseArray = A01(A06);
            CharSequence A0t = DKD.A0t(A06, "", 36);
            DialogInterface.OnClickListener fJv = new FJv(0, fHh, fyG, A06);
            str3 = DKD.A0t(A06, "default", 40);
            b = true;
            builder.setPositiveButton(A0t, fJv);
        }
        DLQ A0p = DKC.A0p(A0i);
        SparseArray sparseArray2 = null;
        if (A0p == null) {
            b2 = false;
        } else {
            sparseArray2 = A01(A0p);
            CharSequence A0t2 = DKD.A0t(A0p, "", 36);
            DialogInterface.OnClickListener fJv2 = new FJv(0, fHh, fyG, A0p);
            str2 = DKD.A0t(A0p, "default", 40);
            b2 = true;
            builder.setNegativeButton(A0t2, fJv2);
        }
        DLQ A0r = DKC.A0r(A0i);
        SparseArray sparseArray3 = null;
        if (A0r == null) {
            b3 = false;
        } else {
            sparseArray3 = A01(A0r);
            CharSequence A0t3 = DKD.A0t(A0r, "", 36);
            DialogInterface.OnClickListener fJv3 = new FJv(0, fHh, fyG, A0r);
            str = DKD.A0t(A0r, "default", 40);
            b3 = true;
            builder.setNeutralButton(A0t3, fJv3);
        }
        AlertDialog create = builder.create();
        create.show();
        if (b != false && (button3 = create.getButton(-1)) != null) {
            button3.setTextColor(A00(str3, z ? 1 : 0));
            if (sparseArray != null) {
                for (int i = 0; i < sparseArray.size(); i++) {
                    int keyAt = sparseArray.keyAt(i);
                    button3.setTag(keyAt, sparseArray.get(keyAt));
                }
            }
        }
        if (b2 != false && (button2 = create.getButton(-2)) != null) {
            button2.setTextColor(A00(str2, z ? 1 : 0));
            if (sparseArray2 != null) {
                for (int i2 = 0; i2 < sparseArray2.size(); i2++) {
                    int keyAt2 = sparseArray2.keyAt(i2);
                    button2.setTag(keyAt2, sparseArray2.get(keyAt2));
                }
            }
        }
        if (!b3 == true || (button = create.getButton(-3)) == null) {
            return null;
        }
        button.setTextColor(A00(str, z ? 1 : 0));
        if (sparseArray3 == null) {
            return null;
        }
        for (int i3 = 0; i3 < sparseArray3.size(); i3++) {
            int keyAt3 = sparseArray3.keyAt(i3);
            button.setTag(keyAt3, sparseArray3.get(keyAt3));
        }
        return null;
    }
}
