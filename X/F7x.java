package X;

import com.facebook.composer.stories.camerarollinspiration.suggestions.model.InspirationRMSClip;
import com.facebook.composer.stories.camerarollinspiration.suggestions.model.InspirationSuggestionSelectionModel;
import com.facebook.composer.stories.camerarollinspiration.suggestions.model.SuggestionModel;
import com.google.common.collect.ImmutableList;
import java.util.Set;

/* loaded from: F7x.class */
public final class F7x {
    public InspirationRMSClip A00;
    public SuggestionModel A01;
    public ImmutableList A02;
    public Set A03;

    public F7x() {
        this.A03 = AnonymousClass001.A0v();
        this.A02 = ImmutableList.of();
    }

    public F7x(InspirationSuggestionSelectionModel inspirationSuggestionSelectionModel) {
        this.A03 = AnonymousClass001.A0v();
        inspirationSuggestionSelectionModel.getClass();
        this.A00 = inspirationSuggestionSelectionModel.A00;
        this.A02 = inspirationSuggestionSelectionModel.A02;
        this.A01 = inspirationSuggestionSelectionModel.A01;
        this.A03 = AbF.A1E(inspirationSuggestionSelectionModel.A03);
    }

    public void A00(ImmutableList immutableList) {
        this.A02 = immutableList;
        C1pq.A08("suggestionClipsList", immutableList);
    }
}
