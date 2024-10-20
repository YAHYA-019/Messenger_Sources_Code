package X;

import com.google.common.collect.ImmutableList;

/* loaded from: A9q.class */
public final class A9q implements 5PP {
    public final ImmutableList A00;

    public A9q(ImmutableList immutableList) {
        C1pq.A08("textRanges", immutableList);
        this.A00 = immutableList;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof A9q) && 11T.A0O(this.A00, ((A9q) obj).A00));
    }

    public int hashCode() {
        return C1pq.A03(this.A00);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("TextMentionRangesMetadata{textRanges=");
        A0k.append(this.A00);
        return AnonymousClass001.A0d("}", A0k);
    }
}
