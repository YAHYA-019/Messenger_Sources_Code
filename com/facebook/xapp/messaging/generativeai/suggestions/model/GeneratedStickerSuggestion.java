package com.facebook.xapp.messaging.generativeai.suggestions.model;

import X.11T;
import X.1BL;
import X.4YV;
import X.7zM;
import X.AYm;
import X.C04v;

/* loaded from: GeneratedStickerSuggestion.class */
public final class GeneratedStickerSuggestion extends C04v implements AYm {
    public final String prompt;
    public final String uri;

    public GeneratedStickerSuggestion(String str, String str2) {
        1BL.A1F(str, str2);
        this.prompt = str;
        this.uri = str2;
    }

    public static /* synthetic */ GeneratedStickerSuggestion copy$default(GeneratedStickerSuggestion generatedStickerSuggestion, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = generatedStickerSuggestion.prompt;
        }
        if ((i & 2) != 0) {
            str2 = generatedStickerSuggestion.uri;
        }
        11T.A0H(str, str2);
        return new GeneratedStickerSuggestion(str, str2);
    }

    public final String component1() {
        return this.prompt;
    }

    public final String component2() {
        return this.uri;
    }

    public final GeneratedStickerSuggestion copy(String str, String str2) {
        11T.A0H(str, str2);
        return new GeneratedStickerSuggestion(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof GeneratedStickerSuggestion)) {
                return false;
            }
            GeneratedStickerSuggestion generatedStickerSuggestion = (GeneratedStickerSuggestion) obj;
            if (!11T.A0O(this.prompt, generatedStickerSuggestion.prompt) || !11T.A0O(this.uri, generatedStickerSuggestion.uri)) {
                return false;
            }
        }
        return true;
    }

    public final String getPrompt() {
        return this.prompt;
    }

    @Override // X.AYm
    public String getPromptText() {
        return this.prompt;
    }

    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        return 7zM.A05(this.uri, 4YV.A02(this.prompt));
    }

    public String toString() {
        return super.toString();
    }
}
