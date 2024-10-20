package X;

import java.util.List;

/* loaded from: F9h.class */
public final class F9h {
    public final List A00;

    public F9h() {
        this(C0ty.A00);
    }

    public F9h(List list) {
        this.A00 = list;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof F9h) && 11T.A0O(this.A00, ((F9h) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("WriteWithAIFetchPromptSuggestionsResponse(result=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
