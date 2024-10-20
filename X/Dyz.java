package X;

import android.os.Build;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/* loaded from: Dyz.class */
public final class Dyz extends C1rj {
    public GL7 A00;
    public FyG A01;

    public Dyz() {
        super("NTTextInputComponent");
    }

    public static boolean A00(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            if (i != (textView.isSingleLine() ? textView.getImeOptions() & 255 : 0)) {
                return false;
            }
        } else if ((i & 255) == 0) {
            return i == 0;
        }
        return true;
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A00};
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x01b2, code lost:
    
        if (r0 != 2680) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0363, code lost:
    
        if (r0 != 'C') goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0236 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A0y(X.1Iw r302) {
        /*
            Method dump skipped, instructions count: 1164
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Dyz.A0y(X.1Iw):X.1LI");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        FIJ A04;
        int i = r302.A01;
        if (i == -1974694341) {
            C5r6 c5r6 = (C5r6) obj;
            Object[] objArr = r302.A03;
            FyG fyG = (FyG) objArr[0];
            boolean z = c5r6.A01;
            View view = c5r6.A00;
            GL7 gl7 = (GL7) objArr[1];
            GL7 gl72 = (GL7) objArr[2];
            if (view.isAccessibilityFocused() && (view instanceof EditText)) {
                DKH.A17((EditText) view);
            }
            if (gl7 != null && !z) {
                A04 = FJ9.A04(gl7, fyG);
            } else {
                if (gl72 == null || !z) {
                    return null;
                }
                A04 = FJ9.A04(gl72, fyG);
            }
        } else {
            if (i == -1048037474) {
                1LI.A0J(r302, obj);
                return null;
            }
            if (i != -612475342) {
                return null;
            }
            1Iw r0 = r302.A00.A00;
            String str = ((C9Mz) obj).A01;
            Object[] objArr2 = r302.A03;
            F4N f4n = (F4N) objArr2[0];
            A04 = (FIJ) objArr2[1];
            if (r0.A02 != null) {
                4YV.A1F(r0, str, (-1) << (-1));
            }
            f4n.A00[1] = str;
            if (A04 == null) {
                return null;
            }
        }
        A04.A07();
        return null;
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        E00 e00 = (E00) r303;
        GL7 gl7 = this.A00;
        FyG fyG = this.A01;
        try {
            Object obj = DKG.A0b(gl7, fyG).A00[1];
            e00.A00 = obj == null ? gl7.getString(69) : obj.toString();
        } catch (NullPointerException e) {
            FAo.A00(fyG, e);
            throw e;
        }
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
