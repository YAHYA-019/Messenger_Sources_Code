package X;

/* loaded from: F9k.class */
public final class F9k {
    public final C9cV A00;
    public final String A01;

    public F9k() {
        this(null, "WriteWithAIFeedbackBottomSheet");
    }

    public F9k(C9cV c9cV, String str) {
        this.A00 = c9cV;
        this.A01 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof F9k)) {
                return false;
            }
            F9k f9k = (F9k) obj;
            if (!11T.A0O(this.A00, f9k.A00) || !11T.A0O(this.A01, f9k.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zM.A05(this.A01, AnonymousClass001.A02(this.A00) * 31);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("UIState(suggestionPreviewState=");
        A0k.append(this.A00);
        A0k.append(", screenName=");
        return DKH.A0o(this.A01, A0k);
    }
}
