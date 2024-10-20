package X;

/* renamed from: X.Jao, reason: case insensitive filesystem */
/* loaded from: Jao.class */
public final class C2832Jao extends LOT {
    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C2832Jao)) {
                return false;
            }
            LOT lot = (LOT) obj;
            if (!11T.A0O(((LOT) this).A03, lot.A03) || !11T.A0O(((LOT) this).A02, lot.A02) || !11T.A0O(((LOT) this).A00, lot.A00) || !11T.A0O(((LOT) this).A01, lot.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(((LOT) this).A01, AnonymousClass002.A05(((LOT) this).A00, AnonymousClass002.A05(((LOT) this).A02, 1BL.A03(((LOT) this).A03))));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("RoundedCornerShape(topStart = ");
        A0k.append(((LOT) this).A03);
        A0k.append(", topEnd = ");
        A0k.append(((LOT) this).A02);
        A0k.append(", bottomEnd = ");
        A0k.append(((LOT) this).A00);
        A0k.append(", bottomStart = ");
        return AnonymousClass002.A0K(((LOT) this).A01, A0k);
    }
}
