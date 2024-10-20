package com.facebook.rp.platform.metaai.rsys.voicestate;

import X.11T;
import X.4YU;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C04v;

/* loaded from: GenAIViewModels.class */
public final class GenAIViewModels extends C04v {
    public final ImagineViewModel imagineViewModel;
    public final ReelsViewModel reelsViewModel;
    public final SearchViewModel searchViewModel;

    public GenAIViewModels(ImagineViewModel imagineViewModel, ReelsViewModel reelsViewModel, SearchViewModel searchViewModel) {
        this.imagineViewModel = imagineViewModel;
        this.reelsViewModel = reelsViewModel;
        this.searchViewModel = searchViewModel;
    }

    public static /* synthetic */ GenAIViewModels copy$default(GenAIViewModels genAIViewModels, ImagineViewModel imagineViewModel, ReelsViewModel reelsViewModel, SearchViewModel searchViewModel, int i, Object obj) {
        if ((i & 1) != 0) {
            imagineViewModel = genAIViewModels.imagineViewModel;
        }
        if ((i & 2) != 0) {
            reelsViewModel = genAIViewModels.reelsViewModel;
        }
        if ((i & 4) != 0) {
            searchViewModel = genAIViewModels.searchViewModel;
        }
        return new GenAIViewModels(imagineViewModel, reelsViewModel, searchViewModel);
    }

    public final ImagineViewModel component1() {
        return this.imagineViewModel;
    }

    public final ReelsViewModel component2() {
        return this.reelsViewModel;
    }

    public final SearchViewModel component3() {
        return this.searchViewModel;
    }

    public final GenAIViewModels copy(ImagineViewModel imagineViewModel, ReelsViewModel reelsViewModel, SearchViewModel searchViewModel) {
        return new GenAIViewModels(imagineViewModel, reelsViewModel, searchViewModel);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof GenAIViewModels)) {
                return false;
            }
            GenAIViewModels genAIViewModels = (GenAIViewModels) obj;
            if (!11T.A0O(this.imagineViewModel, genAIViewModels.imagineViewModel) || !11T.A0O(this.reelsViewModel, genAIViewModels.reelsViewModel) || !11T.A0O(this.searchViewModel, genAIViewModels.searchViewModel)) {
                return false;
            }
        }
        return true;
    }

    public final ImagineViewModel getImagineViewModel() {
        return this.imagineViewModel;
    }

    public final ReelsViewModel getReelsViewModel() {
        return this.reelsViewModel;
    }

    public final SearchViewModel getSearchViewModel() {
        return this.searchViewModel;
    }

    public int hashCode() {
        return (((AnonymousClass001.A02(this.imagineViewModel) * 31) + AnonymousClass001.A02(this.reelsViewModel)) * 31) + 4YU.A03(this.searchViewModel);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("GenAIViewModels(imagineViewModel=");
        A0k.append(this.imagineViewModel);
        A0k.append(", reelsViewModel=");
        A0k.append(this.reelsViewModel);
        A0k.append(", searchViewModel=");
        return AnonymousClass002.A0K(this.searchViewModel, A0k);
    }
}
