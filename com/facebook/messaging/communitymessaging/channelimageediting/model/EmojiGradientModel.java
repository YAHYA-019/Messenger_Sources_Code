package com.facebook.messaging.communitymessaging.channelimageediting.model;

import X.0Pz;
import X.1BL;
import X.4YV;
import X.AXh;
import X.CJI;
import com.google.common.collect.ImmutableList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: EmojiGradientModel.class */
public final class EmojiGradientModel implements AXh {
    public static final CJI Companion = new Object();
    public final String emoji;
    public final List hexGradientColors;
    public final String id;
    public final ImmutableList integerGradientColors;

    public EmojiGradientModel(String str, List list) {
        1BL.A1F(str, list);
        this.emoji = str;
        this.hexGradientColors = list;
        this.integerGradientColors = CJI.A00(list);
        this.id = 0Pz.A0W(str, 4YV.A0t(", ", list, (Function1) null));
    }

    public final String getEmoji() {
        return this.emoji;
    }

    public final List getHexGradientColors() {
        return this.hexGradientColors;
    }

    @Override // X.AXh
    public String getId() {
        return this.id;
    }

    public final ImmutableList getIntegerGradientColors() {
        return this.integerGradientColors;
    }

    public final boolean isValid() {
        int length = this.emoji.length();
        boolean z = false;
        if (1 <= length && length < 3 && this.integerGradientColors.size() > 1) {
            z = true;
        }
        return z;
    }
}
