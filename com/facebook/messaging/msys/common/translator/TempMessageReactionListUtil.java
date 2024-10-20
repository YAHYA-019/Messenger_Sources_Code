package com.facebook.messaging.msys.common.translator;

import X.1qX;
import X.5PI;
import X.C7ga;
import com.facebook.xapp.messaging.reactions.multi.model.MessageReactionCount;
import com.facebook.xapp.messaging.reactions.multi.model.MessageReactionsCount;
import com.google.common.collect.ImmutableList;

/* loaded from: TempMessageReactionListUtil.class */
public abstract class TempMessageReactionListUtil {
    public static void A00(5PI r301, C7ga c7ga) {
        if (c7ga == null || ((1qX) c7ga).mResultSet.getCount() == 0) {
            return;
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        int i = 0;
        for (int i2 = 0; i2 < ((1qX) c7ga).mResultSet.getCount(); i2++) {
            String string = ((1qX) c7ga).mResultSet.getString(i2, 4);
            String string2 = ((1qX) c7ga).mResultSet.getString(i2, 5);
            int i3 = (int) ((1qX) c7ga).mResultSet.getLong(i2, 1);
            if (string != null) {
                builder.m11011add((Object) new MessageReactionCount(string, null, string2, i3, 0L, ((1qX) c7ga).mResultSet.getBoolean(i2, 3)));
                i += i3;
            }
        }
        ImmutableList build = builder.build();
        if (build.isEmpty()) {
            return;
        }
        ImmutableList.of();
        r301.A0i = new MessageReactionsCount(build, i, false);
    }
}
