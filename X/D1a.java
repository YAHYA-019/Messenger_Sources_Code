package X;

import com.facebook.messaging.montage.composer.mention.MentionSuggestionView;

/* loaded from: D1a.class */
public final class D1a implements GJe {
    public final /* synthetic */ MentionSuggestionView A00;

    public D1a(MentionSuggestionView mentionSuggestionView) {
        this.A00 = mentionSuggestionView;
    }

    @Override // X.GJe
    public void CM7() {
        MentionSuggestionView mentionSuggestionView = this.A00;
        C2kf c2kf = MentionSuggestionView.A0A;
        Bf0 bf0 = mentionSuggestionView.A05;
        if (bf0 != null) {
            bf0.A00.A0Q();
        }
    }

    @Override // X.GJe
    public void CM8(int i) {
        MentionSuggestionView mentionSuggestionView = this.A00;
        C2kf c2kf = MentionSuggestionView.A0A;
        if (i != mentionSuggestionView.A00) {
            CM9(i);
        }
    }

    @Override // X.GJe
    public void CM9(int i) {
        MentionSuggestionView mentionSuggestionView = this.A00;
        C2kf c2kf = MentionSuggestionView.A0A;
        mentionSuggestionView.A00 = i;
        mentionSuggestionView.setPadding(mentionSuggestionView.getPaddingLeft(), mentionSuggestionView.getPaddingTop(), mentionSuggestionView.getPaddingRight(), i);
    }
}
