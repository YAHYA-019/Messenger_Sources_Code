package X;

import com.facebook.litho.ComponentTree;

/* loaded from: Fx4.class */
public final class Fx4 implements GJ4 {
    public final ComponentTree A03;
    public final C2iw A04;
    public String A01 = "";
    public int A00 = 0;
    public String A02 = "";

    public Fx4(ComponentTree componentTree, C2iw c2iw) {
        this.A03 = componentTree;
        this.A04 = c2iw;
    }

    @Override // X.GJ4
    public CharSequence BEo(DLQ dlq) {
        String str;
        str = "";
        String A00 = new C04t("\\D").A00(this.A02, str);
        int length = A00.length();
        return length != 0 ? 0Pz.A0Y(7zM.A1C(0, length - this.A00, A00), DKC.A19(A00, length - this.A00), '.') : "";
    }

    @Override // X.GJ4
    public void CvF(DLQ dlq, CharSequence charSequence) {
    }
}
