package com.facebook.rp.platform.metaai.rsys.voicestate;

import X.11T;
import X.1BK;
import X.1BL;
import X.4YV;
import X.7zN;
import X.AnonymousClass001;
import X.C04v;
import X.C3o5;
import java.util.Arrays;

/* loaded from: SearchViewModel.class */
public final class SearchViewModel extends C04v {
    public final String attributionLink;
    public final String[] referencesTitle;
    public final String searchEngine;
    public final String searchEngineIconUrl;
    public final String searchQuery;
    public final String[] searchResultUri;
    public final String sourceUrl;

    public SearchViewModel(String[] strArr, String str, String str2, String str3, String[] strArr2, String str4, String str5) {
        C3o5.A0k(strArr, 1, strArr2);
        this.searchResultUri = strArr;
        this.searchEngine = str;
        this.searchQuery = str2;
        this.attributionLink = str3;
        this.referencesTitle = strArr2;
        this.searchEngineIconUrl = str4;
        this.sourceUrl = str5;
    }

    public static /* synthetic */ SearchViewModel copy$default(SearchViewModel searchViewModel, String[] strArr, String str, String str2, String str3, String[] strArr2, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            strArr = searchViewModel.searchResultUri;
        }
        if ((i & 2) != 0) {
            str = searchViewModel.searchEngine;
        }
        if ((i & 4) != 0) {
            str2 = searchViewModel.searchQuery;
        }
        if ((i & 8) != 0) {
            str3 = searchViewModel.attributionLink;
        }
        if ((i & 16) != 0) {
            strArr2 = searchViewModel.referencesTitle;
        }
        if ((i & 32) != 0) {
            str4 = searchViewModel.searchEngineIconUrl;
        }
        if ((i & 64) != 0) {
            str5 = searchViewModel.sourceUrl;
        }
        return searchViewModel.copy(strArr, str, str2, str3, strArr2, str4, str5);
    }

    public final String[] component1() {
        return this.searchResultUri;
    }

    public final String component2() {
        return this.searchEngine;
    }

    public final String component3() {
        return this.searchQuery;
    }

    public final String component4() {
        return this.attributionLink;
    }

    public final String[] component5() {
        return this.referencesTitle;
    }

    public final String component6() {
        return this.searchEngineIconUrl;
    }

    public final String component7() {
        return this.sourceUrl;
    }

    public final SearchViewModel copy(String[] strArr, String str, String str2, String str3, String[] strArr2, String str4, String str5) {
        1BK.A1K(strArr, 0, strArr2);
        return new SearchViewModel(strArr, str, str2, str3, strArr2, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SearchViewModel)) {
                return false;
            }
            SearchViewModel searchViewModel = (SearchViewModel) obj;
            if (!11T.A0O(this.searchResultUri, searchViewModel.searchResultUri) || !11T.A0O(this.searchEngine, searchViewModel.searchEngine) || !11T.A0O(this.searchQuery, searchViewModel.searchQuery) || !11T.A0O(this.attributionLink, searchViewModel.attributionLink) || !11T.A0O(this.referencesTitle, searchViewModel.referencesTitle) || !11T.A0O(this.searchEngineIconUrl, searchViewModel.searchEngineIconUrl) || !11T.A0O(this.sourceUrl, searchViewModel.sourceUrl)) {
                return false;
            }
        }
        return true;
    }

    public final String getAttributionLink() {
        return this.attributionLink;
    }

    public final String[] getReferencesTitle() {
        return this.referencesTitle;
    }

    public final String getSearchEngine() {
        return this.searchEngine;
    }

    public final String getSearchEngineIconUrl() {
        return this.searchEngineIconUrl;
    }

    public final String getSearchQuery() {
        return this.searchQuery;
    }

    public final String[] getSearchResultUri() {
        return this.searchResultUri;
    }

    public final String getSourceUrl() {
        return this.sourceUrl;
    }

    public int hashCode() {
        return (((((((((((Arrays.hashCode(this.searchResultUri) * 31) + 1BL.A05(this.searchEngine)) * 31) + 1BL.A05(this.searchQuery)) * 31) + 1BL.A05(this.attributionLink)) * 31) + Arrays.hashCode(this.referencesTitle)) * 31) + 1BL.A05(this.searchEngineIconUrl)) * 31) + 7zN.A05(this.sourceUrl);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("SearchViewModel(searchResultUri=");
        A0k.append(Arrays.toString(this.searchResultUri));
        A0k.append(", searchEngine=");
        A0k.append(this.searchEngine);
        A0k.append(", searchQuery=");
        A0k.append(this.searchQuery);
        A0k.append(", attributionLink=");
        A0k.append(this.attributionLink);
        A0k.append(", referencesTitle=");
        A0k.append(Arrays.toString(this.referencesTitle));
        A0k.append(", searchEngineIconUrl=");
        A0k.append(this.searchEngineIconUrl);
        A0k.append(", sourceUrl=");
        A0k.append(this.sourceUrl);
        return 4YV.A0x(A0k);
    }
}
